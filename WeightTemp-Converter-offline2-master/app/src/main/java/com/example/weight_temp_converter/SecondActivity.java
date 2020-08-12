package com.example.weight_temp_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    TextView username;
    TextView userid;
    String name ;
    String userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        username=(TextView)findViewById(R.id.username);
        userid=(TextView)findViewById(R.id.userid);

        Bundle bundle=getIntent().getExtras();

        if(bundle!=null){
            name = bundle.getString("name");
            userID = bundle.getString("id");
            username.setText(name);
            userid.setText(userID);
        }


    }



    public void Logout(View v){

        Intent logoutIntent=new Intent(SecondActivity.this,MainActivity.class);
        startActivity(logoutIntent);
    }

    public void Chirt(View v){


        Intent loginIntent=new Intent(SecondActivity.this,ChirtActivity.class) ;
        loginIntent.putExtra("name",name);
        loginIntent.putExtra("id",userID);

        startActivity(loginIntent);


    }

    public void Temp(View v){


        Intent tempIntent=new Intent(SecondActivity.this,TempActivity.class) ;
        tempIntent.putExtra("name",name);
        tempIntent.putExtra("id",userID);

        startActivity(tempIntent);


    }


    public void Pound(View v){


        Intent poundIntent=new Intent(SecondActivity.this,PoundActivity.class) ;
        poundIntent.putExtra("name",name);
        poundIntent.putExtra("id",userID);

        startActivity(poundIntent);


    }





}
