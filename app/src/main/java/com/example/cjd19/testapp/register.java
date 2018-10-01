package com.example.cjd19.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Pattern;

public class register extends AppCompatActivity {

    private EditText edFN, edLN, edDOB, edemail, edpassword;
    private String FN, LN, DOB, email, password;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        edFN = (EditText) findViewById(R.id.FN);
        edLN = (EditText) findViewById(R.id.LN);
        edDOB = (EditText) findViewById(R.id.DOB);
        edemail = (EditText) findViewById(R.id.email);
        edpassword = (EditText) findViewById(R.id.password);
        submit = (Button) findViewById(R.id.btn);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });
    }

public void register(){
        intial();
        if (!validate()){

        }
        else {
            Success();
        }

}
public void Success(){
    startActivity(new Intent(register.this, Main.class));

}
public boolean validate(){
        boolean valid = true;
        if(FN.isEmpty() || FN.length()<3 || FN.length()>30){
            edFN.setError("Invalid");
            valid = false;

        }
    if(LN.isEmpty()){
        edLN.setError("Invalid");
        valid = false;

    }
    if(DOB.isEmpty()){
        edDOB.setError("Invalid");
        valid = false;

    }
    if(email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()){
        edemail.setError("Invalid");
        valid = false;

    }
    if(password.isEmpty()){
        edpassword.setError("Invalid");
        valid = false;

    }
        return valid;
}

public void intial(){
        FN = edFN.getText().toString().trim();
        LN = edLN.getText().toString().trim();
        DOB = edDOB.getText().toString().trim();
        email = edemail.getText().toString().trim();
        password = edpassword.getText().toString().trim();

}

}
