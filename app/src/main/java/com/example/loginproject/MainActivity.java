package com.example.loginproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static String KEY = "name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleClick(View view) {

        EditText nameEdit =findViewById(R.id.editTextUsername);
        String name =nameEdit.getText().toString();
        Intent loginIntent =new Intent(MainActivity.this,LoginActivity.class);
        loginIntent.putExtra(KEY,name);
        startActivity(loginIntent);

    }

    public void sinupClick(View view) {

        Intent signUpIntent = new Intent(MainActivity.this,SignUpActivity.class);
        startActivity(signUpIntent);
    }
}
