package com.example.assignment_3;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.navigation.ui.AppBarConfiguration;

import com.example.assignment_3.databinding.ActivityListBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityListBinding binding;

    ListView list_of_meetings;
    String[] ListElements = new String[] {
            "Meeting 1",
            "Meeting 2",
            "Meeting 3",
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);




        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addPage = new Intent(ListActivity.this, com.example.assignment_3.MainActivity.class);
                startActivity(addPage);
            }
        });

        list_of_meetings = findViewById(R.id.listOfMeetings);

        final List<String> ListElementsArrayList = new ArrayList<>(Arrays.asList(ListElements));
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(ListActivity.this, android.R.layout.simple_list_item_1, ListElementsArrayList);
        list_of_meetings.setAdapter(adapter);
    }

}