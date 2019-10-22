package com.example.orderingplatform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LOGIN extends AppCompatActivity {

    Button button_signin, button_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button_signin = (Button)findViewById(R.id.button_signin);
        button_signup = (Button)findViewById(R.id.button_signup);

        button_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                open_signin_view();
            }
        });
        button_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                open_signup_view();
            }
        });
    }
    public void open_signin_view(){
        Intent open_signin_view = new Intent(this, SIGNIN.class);
        startActivity(open_signin_view);
    }
    public void open_signup_view(){
        Intent open_signup_view = new Intent(this, SIGNUP.class);
        startActivity(open_signup_view);
    }
}
