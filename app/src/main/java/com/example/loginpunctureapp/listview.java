package com.example.loginpunctureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class listview extends AppCompatActivity {
ListView lv1,lv2;
int[] images={R.drawable.bike,
        R.drawable.car,
        R.drawable.cycle,
        R.drawable.rakishaw
};

String[] names={"BIKE","CAR","CYCLE","RAKISHAW"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        lv1=(ListView) findViewById(R.id.listview1);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, names);

        ListView listView = (ListView) findViewById(R.id.listview1);
        listView.setAdapter(adapter);

        ListView lv2 = (ListView) findViewById(R.id.image);
        listView.setAdapter(adapter);
    }

}