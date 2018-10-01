package com.example.cjd19.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button login = findViewById(R.id.button);
        Button Register = findViewById(R.id.button3);



        Register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View a) {
                startActivity(new Intent(Main.this, register.class));

                }
                });

        login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Main.this, Login.class));

            }
        });
    }
}
