package com.example.weight_temp_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button loginButton;
    private EditText userIDText ;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton=(Button)findViewById(R.id.loginButton);
        userIDText = (EditText) findViewById(R.id.userIdText);
        editText=(EditText)findViewById(R.id.editText);




    }

    public void login(View v){

        String username=userIDText.getText().toString();
        String userid=editText.getText().toString();
        Intent loginIntent=new Intent(MainActivity.this,SecondActivity.class) ;
        loginIntent.putExtra("name",username);
        loginIntent.putExtra("id",userid);

        startActivity(loginIntent);


    }


}
