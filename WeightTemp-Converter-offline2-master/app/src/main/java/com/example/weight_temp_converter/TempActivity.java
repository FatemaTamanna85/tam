package com.example.weight_temp_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.*;
import android.view.View;

import android.os.Bundle;

import org.w3c.dom.Text;

public class TempActivity extends AppCompatActivity {

    private Button cToF,fToC;
    private TextView result;
    private EditText enterTemp;
    double result0;
    String name ;
    String userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);

        cToF=(Button)findViewById(R.id.cToF);
        fToC=(Button)findViewById(R.id.fToC);
        result=(TextView) findViewById(R.id.result);
        enterTemp=(EditText) findViewById(R.id.enterTemp);

        Bundle bundle=getIntent().getExtras();

        if(bundle!=null){
            name = bundle.getString("name");
            userID = bundle.getString("id");

        }


    }
    public void CTOF(View v){

    double temp=Double.parseDouble(enterTemp.getText().toString());
    result0=(temp*1.8)+32;
    result.setText(String.valueOf(result0));


    }

    public void FTOC(View v){

        double temp=Double.parseDouble(enterTemp.getText().toString());
        result0=(temp-32)/1.8;
        result.setText(String.valueOf(result0));


    }

    public void Back(View v){


        Intent loginIntent=new Intent(TempActivity.this,SecondActivity.class) ;
        loginIntent.putExtra("name",name);
        loginIntent.putExtra("id",userID);

        startActivity(loginIntent);


    }


}
