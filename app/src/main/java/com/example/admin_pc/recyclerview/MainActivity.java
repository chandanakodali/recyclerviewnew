package com.example.admin_pc.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MyActivity";
    RecyclerView recyclerView;
    CardAdapter adapter;

    List<Card> cardList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cardList = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //These I have used for static comment them when connecting to the db

        cardList.add(
                new Card(
                        1,"Creol","A project collaboration app"
                )
        );

        cardList.add(
                new Card(
                        2,"TailorHome","A servicing app"
                )
        );

        cardList.add(
                new Card(
                        3,"Food bazar","Collaborates ingredients available to create recipes"
                )
        );



        adapter = new CardAdapter(this, cardList);
        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(new CardAdapter.OnItemClickListener() {
            @Override
           public void onItemClick(int position) {

                Intent intent = new Intent(MainActivity.this, projectScreen.class);
                intent.putExtra("project-name", cardList.get(position).getPname());
                intent.putExtra("project-description", cardList.get(position).getPdescription());
                startActivity(intent);
            }
        });

    }
}
