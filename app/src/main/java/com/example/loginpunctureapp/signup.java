package com.example.loginpunctureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        EditText name1,email1, password1;
        Button btn1;
        TextView tv1;
        name1 = (EditText) findViewById(R.id.editName);
        email1 = (EditText) findViewById(R.id.editEmail);
        password1 = (EditText) findViewById(R.id.editPass);
        btn1 = (Button) findViewById(R.id.buttonAcount);
        tv1 = (TextView) findViewById(R.id.textView);


    }
}