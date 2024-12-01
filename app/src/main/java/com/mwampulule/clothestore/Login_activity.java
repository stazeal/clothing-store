package com.mwampulule.clothestore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login_activity extends AppCompatActivity {
    EditText etEmail,etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etEmail = findViewById(R.id.EmailAddressL);
        etPassword= findViewById(R.id.TextPassword);
        btnLogin = findViewById(R.id.button2);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email= etEmail.getText().toString().trim();
                String Password = etPassword.getText().toString().trim();

                if (email.isEmpty()||Password.isEmpty()){
                    Toast.makeText(Login_activity.this,"please fill all fields", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(Login_activity.this, "Welcome to Dashboard", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Login_activity.this,DashboardActivity.class);
                    startActivity(intent);
                    finish();

                }
            }
        });

    }
}