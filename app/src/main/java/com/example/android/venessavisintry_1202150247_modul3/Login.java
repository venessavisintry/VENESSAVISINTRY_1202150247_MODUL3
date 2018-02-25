package com.example.android.venessavisintry_1202150247_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText username1 = (EditText)findViewById(R.id.ed_username);
        final EditText password1 = (EditText)findViewById(R.id.ed_password);
        Button button1 = (Button)findViewById(R.id.btn_login);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username1.getText().length()==0){
                    username1.setError("Silahkan Masukkan Username");
                }else if(password1.getText().length()==0){
                    password1.setError("Silahkan Masukkan Password");
                }else if(username1.getText().toString().equals("EAD") && password1.getText().toString().equals("MOBILE") )
                {
                    Intent i = new Intent(Login.this,Daftarmenu.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Username dan Password Salah",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}