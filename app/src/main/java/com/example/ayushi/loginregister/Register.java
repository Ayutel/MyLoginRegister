package com.example.ayushi.loginregister;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity implements View.OnClickListener
{


    Button bRegister;
    EditText etUsername, etPassword, etName,etClub,etPriv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etName= (EditText) findViewById(R.id.etName);
        etClub = (EditText) findViewById(R.id.etClub);
        etPriv = (EditText) findViewById(R.id.etPrivilege);
        bRegister = (Button) findViewById(R.id.bRegister);

        assert bRegister != null;
        bRegister.setOnClickListener(this);
    }



    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.bRegister:

                String name=etName.getText().toString();
                String username=etUsername.getText().toString();
                String password=etPassword.getText().toString();
                String privilege=etPriv.getText().toString();
                String club=etClub.getText().toString();

                User registeredData=new User(name,username,password,privilege,club);
                startActivity(new Intent(this,Login.class));
                break;
        }
    }
}
