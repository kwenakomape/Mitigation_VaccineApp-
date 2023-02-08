package com.example.consvarprototype;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Confirmation extends AppCompatActivity {
    private Button button8, button9;
    private TextView outputText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmation);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        outputText = findViewById(R.id.textView10);
        String value = getIntent().getStringExtra("key");
        outputText.setText(value);

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Confirmation.this, UseCases.class);
                startActivity(intent);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finishAffinity();


            }
        });

    }
}