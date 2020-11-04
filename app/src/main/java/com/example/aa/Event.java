package com.example.aa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Event extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.event);

        Button returnButton = findViewById(R.id.return_button);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
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
                Intent intent = new Intent(getApplication(),MainActivity.class);
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
                item.setEnabled(false);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}