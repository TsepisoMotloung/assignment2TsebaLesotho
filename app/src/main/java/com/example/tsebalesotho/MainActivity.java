package com.example.tsebalesotho;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
RecyclerAdapter adapter;

String name[] = {"PLACES OF INTEREST","TRADITIONAL ATTIRE","INITIATION SCHOOL","HOME UTENSILS","BELIEF SYSTEM","TRADITIONAL MEDICINE","TRADITIONAL FOOD"};
int [] images = {R.drawable.placeofinterest,R.drawable.attire,R.drawable.pic_quark_1624197284658,R.drawable.homeutensiles,R.drawable.pic_quark_1624197551925,R.drawable.medicine,R.drawable.food};
String desc[] = {"Lesotho has some of the most beautiful places worldwide.","Lesotho has its own unique cultural clothing desings.","One of the most unique feature about Lesotho is its Initiation School","It has utensils most switted to save and economise","Mostly believe-centered in spirits and ancenstors","Medicine and healing material made from natural plants.","Traditional Basotho food are unique from the rest of the world too."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerAdapter(this, name, this, desc, this, images);
        recyclerView.setAdapter(adapter);

    }
}