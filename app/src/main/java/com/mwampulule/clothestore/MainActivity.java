package com.mwampulule.clothestore;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        // Initialize buttons
        Button registerButton = findViewById(R.id.registerButton);
        Button loginButton = findViewById(R.id.loginButton);

        // Register button click event
        registerButton.setOnClickListener(v -> {
            // Redirect to Register Activity
            Intent registerIntent = new Intent(MainActivity.this, Register_acitityy.class);
            startActivity(registerIntent);
        });

        // Login button click event
        loginButton.setOnClickListener(v -> {
            // Redirect to Login Activity
            Intent loginIntent = new Intent(MainActivity.this, Login_activity.class);
            startActivity(loginIntent);
        });
    }
}

