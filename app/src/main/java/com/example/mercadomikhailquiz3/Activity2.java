package com.example.mercadomikhailquiz3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

        EditText txtName, txtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }
    public void displayActivity1(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void onLogin(View v) {
        SharedPreferences sp = getSharedPreferences("userInfo, Context.MODE_PRIVATE");
        txtName.setText(sp.getString("user", ""));
        txtName.setText(sp.getString("password", ""));
        Toast.makeText(this,"Email" + sp.getString("email", "")),Toast.LENGTH_LONG).short();
    }
}
