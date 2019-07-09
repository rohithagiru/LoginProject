package com.example.loginproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    public static String key = "Welcome ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        String name =getIntent().getExtras().getString(MainActivity.KEY);
        TextView nameTextView =findViewById(R.id.textViewName);
        nameTextView.setText(name);
    }
}
