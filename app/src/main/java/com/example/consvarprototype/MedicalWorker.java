package com.example.consvarprototype;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MedicalWorker extends AppCompatActivity {
    private String medicalID;
    private String Speciality;
    private Button button20;

    public String getMedicalID() {
        return medicalID;
    }

    public void setMedicalID(String medicalID) {
        this.medicalID = medicalID;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }

    @Override
    public String toString() {
        return
                "medicalID=" + medicalID +
                        ", Speciality='" + Speciality;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medical_worker_form);
        button20 = findViewById(R.id.buttonclick);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MedicalWorker.this, WorkerConfirmation.class);
                startActivity(intent);
            }
        });

    }
}