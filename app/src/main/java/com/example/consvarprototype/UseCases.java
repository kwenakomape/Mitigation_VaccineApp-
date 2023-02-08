package com.example.consvarprototype;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class UseCases extends AppCompatActivity {
    private Button button4;
    //private Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.use_cases);
        button4 = findViewById(R.id.button4);
        //button5 = (Button) findViewById(R.id.button5);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UseCases.this, Registration.class);
                startActivity(intent);
            }
        });


    }
}