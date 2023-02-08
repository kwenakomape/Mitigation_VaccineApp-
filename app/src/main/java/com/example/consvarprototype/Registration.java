package com.example.consvarprototype;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Registration extends AppCompatActivity {

    private String refNo;
    private String centreName;
    private int dateOfRegistration;
    private Button button20;
    private EditText editText, editText2, editText3;
    private TextView outputText;
    ArrayList<Patient> patients = new ArrayList<>();
    public String getCentreName() {
        return centreName;
    }

    public void setCentreName(String centreName) {
        this.centreName = centreName;
    }

    public int getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(int dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_form);
        button20 = findViewById(R.id.buttonclick);
        editText = findViewById(R.id.editTextTextMultiLine);
        editText2 = findViewById(R.id.editTextTextMultiLine2);
        editText3 = findViewById(R.id.editTextTextMultiLine7);
        outputText = findViewById(R.id.textView10);

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = editText.getText().toString();  // name
                String result2 = editText2.getText().toString();   // surname
                String result3 = editText3.getText().toString();   // vaccination centre
                Patient patient = new Patient(result, result2, result3);

                //outputText.append(patient.toString());
                Intent intent = new Intent(Registration.this, Confirmation.class);
                intent.putExtra("key",patient.toString());
                startActivity(intent);
            }
        });
    }
}