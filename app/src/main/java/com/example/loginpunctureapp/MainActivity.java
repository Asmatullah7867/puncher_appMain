package com.example.loginpunctureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText name,email, password;
        Button btn;
        TextView tv;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            email = (EditText) findViewById(R.id.etemail);
            password = (EditText) findViewById(R.id.mypass);
            btn = (Button) findViewById(R.id.btnlogin);
            tv = (TextView) findViewById(R.id.createnewac);


            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivity.this,signup.class);
                    startActivity(i);
                    Toast.makeText(getBaseContext(), "please signup", Toast.LENGTH_SHORT).show();
                }
            };

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivity.this,signup.class);
                    startActivity(i);
                    Toast.makeText(getBaseContext(), "Successfully Login", Toast.LENGTH_SHORT).show();
                }
            };


        }
    }
}