package com.example.nutriarc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureRBtn();
        configureCBtn();

        generateTip();

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

    private void configureCBtn(){
        Button cbtn = (Button) findViewById(R.id.journal_btn);
        cbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, calendar.class));
            }
        });
    }

    private void generateTip(){
        String tip1 = "Go for a walk! - Moderate intensity walking has been shown to be just as effective in lowering risk for high blood pressure, high cholesterol, diabetes and heart disease as vigorous intensity running.";
        String tip2 = "You don't have to eat your vegetables raw - If you don't like veggies, cooking your them in soups and stirfrys can drastically change their taste!";
        String tip3 = "There is no such thing as an ineffective workout - Don't think you have to hit a 'quota' for daily exercise, some activity is always better than none!";
        String tip4 = "Small, shorter workouts may be better - You won't dread a short workout as much as a long one, meaning you're more likely to keep up activity daily.";
        String tip5 = "It's okay to have a treat once in a while! - Restricting yourself from certain types of food can actually lead to binge eating behaviors.";
        String tip6 = "Try to eat at least one balanced meal a day - Sometimes we have days where we don't eat well, but always try to make sure you have some vegetables and protein.";
        String tip7 = "There are no 'bad' foods! - things like peanut-butter, cheese, and olive oil can be great in moderation.";
        String tip8 = "You don't have to exercise to stay active - try taking the stairs instead of the elevator!";
        String tip9 = "Sugar substitutes aren't bad for you - Just like sugar, sugar substitutes aren't going to hurt you when consumed in moderation.";
        String tip10 = "Eat fruit!  - Fruits contain many minerals, vitamins, and antioxidants that are super beneficial to your bodily health.";
        String[] tips = {tip1, tip2, tip3, tip4, tip5, tip6, tip7, tip8, tip9, tip10};

        int min = 1;
        int max = 10;
        int num = (int)Math.floor(Math.random()*(max-min+1)+min);

        String tip = tips[num-1];

        TextView tip_display = (TextView) findViewById(R.id.tip_generator);
        tip_display.setText(tip);
    }
}