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

public class Register_acitityy extends AppCompatActivity {
    EditText etUserName,etEmail,etPassword;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register_acitityy);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        etUserName = findViewById(R.id.TextText);
        etEmail = findViewById(R.id.EmailAddress);
        etPassword = findViewById(R.id.Password);
        btnRegister = findViewById(R.id.button);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUserName.getText().toString().trim();
                String email = etEmail.getText().toString().trim();
                String password = etPassword.getText().toString().trim();

                if (username.isEmpty()||email.isEmpty() || password.isEmpty()){
                    Toast.makeText(Register_acitityy.this, "please fill in all field",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(Register_acitityy.this, "Please login here", Toast.LENGTH_SHORT).show();
                }

                Intent intent = new Intent(Register_acitityy.this,Login_activity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}