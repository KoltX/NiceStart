package com.ramiro.ernesto.nicestart;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

//import android.support.v7.app.ActionBarActivity;


public class LoginActivity extends Activity {

   protected TextView mSignUpTextview;
    protected Button mLoginButton;
    protected TextInputLayout mPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        mPassword = (TextInputLayout)findViewById(R.id.passwordTIL);
//        mPassword.requestFocus();


        mLoginButton = (Button)findViewById(R.id.loginbutton);
        mLoginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);


            }
        });

        mSignUpTextview = (TextView)findViewById(R.id.signup_text);
        mSignUpTextview.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);


            }
        });


    }
}
