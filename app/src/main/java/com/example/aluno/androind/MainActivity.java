package com.example.aluno.androind;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String EditTextlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
                clickBntok
    public void clickBntok (View v){
        EditText editTextlogin = (EditText) findViewById(R.id.login);
        String login = "Seja bem vindo" + editTextlogin.getText().toString();
        EditText editTextpassword = (EditText) findViewById(R.id.password);
        login = login + " " + editTextpassword.getText().toString();
    Toast.makeText(this, login, Toast.LENGTH_LONG).show();
    }
}
