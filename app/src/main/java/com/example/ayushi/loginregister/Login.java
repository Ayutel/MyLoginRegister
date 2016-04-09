package com.example.ayushi.loginregister;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener
{

    Button bLogin;
    EditText etUsername,etPassword;
    TextView tvRegisterLink;
    //tvScrollLink;
    UserLocalStore userLocalStore;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        tvRegisterLink = (TextView) findViewById(R.id.tvRegisterLink);
        //tvScrollLink = (TextView) findViewById(R.id.tvScrollLink);


        bLogin = (Button) findViewById(R.id.bLogin);

        assert bLogin != null;
        bLogin.setOnClickListener(this);
        tvRegisterLink.setOnClickListener(this);
        //tvScrollLink.setOnClickListener(this);

        userLocalStore=new UserLocalStore(this);


    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.bLogin:

                User user=new User(null,null);
                userLocalStore.storeUserData(user);
                userLocalStore.setUserLoggedIn(true);
                /*
                String user name = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                User user = new User(username, password);

                authenticate(user);*/

                break;

            /*case R.id.tvScrollLink:

                startActivity(new Intent(this,ScrollingActivity.class));


                break;*/

            case R.id.tvRegisterLink:

                startActivity(new Intent(this,Register.class));
                break;
        }
    }
}
