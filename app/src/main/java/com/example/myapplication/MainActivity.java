package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        String[] values = new String[]{
                "LAB ACTIVITY 1",
                "LAB ACTIVITY 2",
                "LAB ACTIVITY 3",
                "LAB ACTIVITY 4",
                "LAB ACTIVITY 5",
                "LAB ACTIVITY 6",
                "LAB ACTIVITY 7",
                "LAB ACTIVITY 8",
                "LAB ACTIVITY 9",
                "LAB ACTIVITY 10",
                "LAB ACTIVITY 11"



        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String> (this, android.R.layout.simple_expandable_list_item_1,android.R.id.text1,values );
        listView.setAdapter(adapter);
    }
}