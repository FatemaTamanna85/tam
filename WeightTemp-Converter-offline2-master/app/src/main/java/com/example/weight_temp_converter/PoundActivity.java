package com.example.weight_temp_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PoundActivity extends AppCompatActivity {

    EditText t1,t2;
    Button  b1,b2;
    String name ;
    String userID;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pound);


        t1=(EditText)findViewById(R.id.editText1);
        t2=(EditText)findViewById(R.id.editText2);
        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);


        Bundle bundle=getIntent().getExtras();

        if(bundle!=null){
            name = bundle.getString("name");
            userID = bundle.getString("id");

        }


    }

    public void Convert(View v){
        double pound=Double.valueOf(t1.getText().toString());
        double kg=pound*0.453592;
        t2.setText(String.valueOf(kg));


    }

    public void Clear(View v){

        t1.setText("");
        t2.setText("");
        t1.requestFocus();


    }

    public void Back(View v){


        Intent loginIntent=new Intent(PoundActivity.this,SecondActivity.class) ;
        loginIntent.putExtra("name",name);
        loginIntent.putExtra("id",userID);

        startActivity(loginIntent);


    }

}
