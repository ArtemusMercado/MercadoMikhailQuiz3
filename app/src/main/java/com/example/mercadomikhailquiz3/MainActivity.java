package com.example.mercadomikhailquiz3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtName, txtPassword, txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = findViewById(R.id.etName);
        txtName = findViewById(R.id.etPassword);
        txtName = findViewById(R.id.etEmail);

    }

    public void displayActivity2(View v) {
        Intent i = new Intent(this, Activity2.class);
        startActivity(i);
    }

    public void onRegister(View v) {
        SharedPreferences sp = getSharedPreferences("userInfo, Context.MODE_PRIVATE");
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("user",txtName.getText().toString());
        editor.putString("user",txtPassword.getText().toString());
        editor.putString("user",txtEmail.getText().toString());
        editor.commit();
        Toast.makeText(this, "Saved",Toast.LENGTH_LONG).show();

    }
}