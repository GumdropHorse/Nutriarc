package com.example.nutriarc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;

public class recipies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipies);

        configureBackBtn();
    }

    private void configureBackBtn(){
        ImageView backBtn = (ImageView) findViewById(R.id.backbtn);
        backBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }
        });
    }

    private void configureRecipe1(){
        TextView recipe1btn = (TextView) findViewById(R.id.recipe1_txt);
        recipe1btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Uri uri = Uri.parse("https://www.tasteofhome.com/recipes/spicy-lemon-chicken-kabobs/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }

    private void configureRecipe2(){
        TextView recipe2btn = (TextView) findViewById(R.id.recipe2_txt);
        recipe2btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Uri uri = Uri.parse("https://easyfamilyrecipeideas.com/frozen-yogurt-bark/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }

    private void configureRecipe3(){
        TextView recipe3btn = (TextView) findViewById(R.id.recipe3_txt);
        recipe3btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Uri uri = Uri.parse("https://www.madetobeamomma.com/roasted-parmesan-green-beans/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}