package com.example.nutriarc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureRBtn();
        configureTBtn();
        configureCBtn();
    }

    private void configureRBtn(){
        Button rbtn = (Button) findViewById(R.id.recipes_btn);
        rbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, recipies.class));
            }
        });
    }

    private void configureTBtn(){
        Button tbtn = (Button) findViewById(R.id.tips_btn);
        tbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, tips.class));
            }
        });
    }

    private void configureCBtn(){
        Button cbtn = (Button) findViewById(R.id.journal_btn);
        cbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, calendar.class));
            }
        });
    }
}