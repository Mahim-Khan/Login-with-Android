package com.example.loginkorbo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText emailedittext;
    private Button showbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailedittext = findViewById(R.id.emailedittext);
        showbutton = findViewById(R.id.showbutton);
        showbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailedittext.getText().toString();
                emailedittext.setText(email);
                Toast.makeText(MainActivity.this, email, Toast.LENGTH_LONG).show();


            }
        });
    }
}