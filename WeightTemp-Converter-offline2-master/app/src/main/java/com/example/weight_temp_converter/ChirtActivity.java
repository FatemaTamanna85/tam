package com.example.weight_temp_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChirtActivity extends AppCompatActivity {

    String name ;
    String userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chirt);

        Bundle bundle=getIntent().getExtras();

        if(bundle!=null){
            name = bundle.getString("name");
            userID = bundle.getString("id");

        }

    }

    public void Back(View v){

        Intent backIntent=new Intent(ChirtActivity.this,SecondActivity.class);
        backIntent.putExtra("name",name);
        backIntent.putExtra("id",userID);
        startActivity(backIntent);


    }

}
