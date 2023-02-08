package com.example.consvarprototype;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListViewSample extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listView = findViewById(R.id.listview);

        ArrayList<String> arrayList = new ArrayList<>();
        String value = getIntent().getStringExtra("key");
        arrayList.add(value);
        arrayList.add("Tisetso Maseko");
        arrayList.add("Moyin Omonije");
        arrayList.add("kwena komape");
        arrayList.add("William Robert");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);

    }
}