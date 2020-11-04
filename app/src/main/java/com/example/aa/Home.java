package com.example.aa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class Home extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        schedule = findViewById(R.id.schedule);
        stamprally = findViewById(R.id.stamprally);
        quiz = findViewById(R.id.quiz);
        map = findViewById(R.id.map);
        foodshop = findViewById(R.id.foodshop);
        event = findViewById(R.id.event);

        schedule.setOnClickListener(this);
        stamprally.setOnClickListener(this);
        quiz.setOnClickListener(this);
        map.setOnClickListener(this);
        foodshop.setOnClickListener(this);
        event.setOnClickListener(this);
    }
    private Button schedule;
    private Button stamprally;
    private Button quiz;
    private Button map;
    private Button foodshop;
    private Button event;

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.schedule:
                Intent intent = new Intent(getApplication(),Schedule.class);
                startActivity(intent);
                break;
            case R.id.stamprally:
                intent = new Intent(getApplication(),StampRally.class);
                startActivity(intent);
                break;
            case R.id.quiz:
                intent = new Intent(getApplication(),Quiz.class);
                startActivity(intent);
                break;
            case R.id.map:
                intent = new Intent(getApplication(),Map.class);
                startActivity(intent);
                break;
            case R.id.foodshop:
                intent = new Intent(getApplication(),FoodShop.class);
                startActivity(intent);
                break;
            case R.id.event:
                intent = new Intent(getApplication(),Event.class);
                startActivity(intent);
                break;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Intent intent = new Intent(getApplication(),Home.class);
                startActivity(intent);
                break;
            case R.id.item2:
                intent = new Intent(getApplication(),Schedule.class);
                startActivity(intent);
                break;
            case R.id.item3:
                intent = new Intent(getApplication(),StampRally.class);
                startActivity(intent);
                break;
            case R.id.item4:
                intent = new Intent(getApplication(),Quiz.class);
                startActivity(intent);
                break;
            case R.id.item5:
                intent = new Intent(getApplication(),Map.class);
                startActivity(intent);
                break;
            case R.id.item6:
                intent = new Intent(getApplication(),FoodShop.class);
                startActivity(intent);
                break;
            case R.id.item7:
                intent = new Intent(getApplication(),Event.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}