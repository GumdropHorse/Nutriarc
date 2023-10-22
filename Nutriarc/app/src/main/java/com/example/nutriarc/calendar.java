package com.example.nutriarc;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuItem;
import android.view.View;
import android.widget.CalendarView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.nutriarc.databinding.ActivityCalendarBinding;

public class calendar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        configureBackBtn();

        configureW1D1();
        configureW1D2();
        configureW1D3();
        configureW1D4();
        configureW1D5();
        configureW1D6();
        configureW1D7();

        configureW2D1();
        configureW2D2();
        configureW2D3();
        configureW2D4();
        configureW2D5();
        configureW2D6();
        configureW2D7();

        configureW3D1();
        configureW3D2();
        configureW3D3();
        configureW3D4();
        configureW3D5();
        configureW3D6();
        configureW3D7();

        configureW4D1();
        configureW4D2();
        configureW4D3();
        configureW4D4();
        configureW4D5();
        configureW4D6();
        configureW4D7();

        configureW5D1();
        configureW5D2();
        configureW5D3();
        configureW5D4();
        configureW5D5();
        configureW5D6();
        configureW5D7();
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

    private void displaymood(ImageView btn){
        PopupMenu popup = new PopupMenu(calendar.this, btn);
        //Inflating the Popup using xml file
        popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());
        popup.setForceShowIcon(true);

        //registering popup with OnMenuItemClickListener
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.nothing) {
                    btn.setBackgroundResource(R.drawable.nothing);
                }else if (item.getItemId() == R.id.happy){
                    btn.setBackgroundResource(R.drawable.happy);
                }else if (item.getItemId() == R.id.mefr){
                    btn.setBackgroundResource(R.drawable.mefr);
                }else{
                    btn.setBackgroundResource(R.drawable.angy);
                }

                return false;
            }
        });

        popup.show();//showing popup menu
    }

    private void configureW1D1(){
        ImageView w1d1 = (ImageView) findViewById(R.id.week1day1);
        w1d1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w1d1);
            }
        });
    }
    private void configureW1D2(){
        ImageView w1d2 = (ImageView) findViewById(R.id.week1day2);
        w1d2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w1d2);
            }
        });
    }
private void configureW1D3(){
        ImageView w1d3 = (ImageView) findViewById(R.id.week1day3);
        w1d3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w1d3);
            }
        });
    }
    private void configureW1D4(){
        ImageView w1d4 = (ImageView) findViewById(R.id.week1day4);
        w1d4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w1d4);
            }
        });
    }
    private void configureW1D5(){
        ImageView w1d5 = (ImageView) findViewById(R.id.week1day5);
        w1d5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w1d5);
            }
        });
    }
    private void configureW1D6(){
        ImageView w1d6 = (ImageView) findViewById(R.id.week1day6);
        w1d6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w1d6);
            }
        });
    }
    private void configureW1D7(){
        ImageView w1d7 = (ImageView) findViewById(R.id.week1day7);
        w1d7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w1d7);
            }
        });
    }
    private void configureW2D1(){
        ImageView w2d1 = (ImageView) findViewById(R.id.week2day1);
        w2d1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w2d1);
            }
        });
    }
    private void configureW2D2(){
        ImageView w2d2 = (ImageView) findViewById(R.id.week2day2);
        w2d2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w2d2);
            }
        });
    }
    private void configureW2D3(){
        ImageView w2d3 = (ImageView) findViewById(R.id.week2day3);
        w2d3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w2d3);
            }
        });
    }
    private void configureW2D4(){
        ImageView w2d4 = (ImageView) findViewById(R.id.week2day4);
        w2d4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w2d4);
            }
        });
    }
    private void configureW2D5(){
        ImageView w2d5 = (ImageView) findViewById(R.id.week2day5);
        w2d5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w2d5);
            }
        });
    }
    private void configureW2D6(){
        ImageView w2d6 = (ImageView) findViewById(R.id.week2day6);
        w2d6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w2d6);
            }
        });
    }
    private void configureW2D7(){
        ImageView w2d7 = (ImageView) findViewById(R.id.week2day7);
        w2d7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w2d7);
            }
        });
    }
    private void configureW3D1(){
        ImageView w3d1 = (ImageView) findViewById(R.id.week3day1);
        w3d1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w3d1);
            }
        });
    }
    private void configureW3D2(){
        ImageView w3d2 = (ImageView) findViewById(R.id.week3day2);
        w3d2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w3d2);
            }
        });
    }
    private void configureW3D3(){
        ImageView w3d3 = (ImageView) findViewById(R.id.week3day3);
        w3d3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w3d3);
            }
        });
    }
    private void configureW3D4(){
        ImageView w3d4 = (ImageView) findViewById(R.id.week3day4);
        w3d4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w3d4);
            }
        });
    }
    private void configureW3D5(){
        ImageView w3d5 = (ImageView) findViewById(R.id.week3day5);
        w3d5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w3d5);
            }
        });
    }
    private void configureW3D6(){
        ImageView w3d6 = (ImageView) findViewById(R.id.week3day6);
        w3d6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w3d6);
            }
        });
    }
    private void configureW3D7(){
        ImageView w3d7 = (ImageView) findViewById(R.id.week3day7);
        w3d7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w3d7);
            }
        });
    }
    private void configureW4D1(){
        ImageView w4d1 = (ImageView) findViewById(R.id.week4day1);
        w4d1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w4d1);
            }
        });
    }
    private void configureW4D2(){
        ImageView w4d2 = (ImageView) findViewById(R.id.week4day2);
        w4d2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w4d2);
            }
        });
    }
    private void configureW4D3(){
        ImageView w4d3 = (ImageView) findViewById(R.id.week4day3);
        w4d3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w4d3);
            }
        });
    }
        private void configureW4D4(){
        ImageView w4d4 = (ImageView) findViewById(R.id.week4day4);
        w4d4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w4d4);
            }
        });
    }
        private void configureW4D5(){
        ImageView w4d5 = (ImageView) findViewById(R.id.week4day5);
        w4d5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w4d5);
            }
        });
    }
        private void configureW4D6(){
        ImageView w4d6 = (ImageView) findViewById(R.id.week4day6);
        w4d6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w4d6);
            }
        });
    }
        private void configureW4D7(){
            ImageView w4d7 = (ImageView) findViewById(R.id.week4day7);
            w4d7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w4d7);
            }
        });
    }
        private void configureW5D1(){
            ImageView w5d1 = (ImageView) findViewById(R.id.week5day1);
        w5d1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w5d1);
            }
        });
    }
        private void configureW5D2(){
            ImageView w5d2 = (ImageView) findViewById(R.id.week5day2);
        w5d2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w5d2);
            }
        });
    }
            private void configureW5D3(){
                ImageView w5d3 = (ImageView) findViewById(R.id.week5day3);
        w5d3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w5d3);
            }
        });
    }
         private void configureW5D4(){
             ImageView w5d4 = (ImageView) findViewById(R.id.week5day4);
        w5d4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w5d4);
            }
        });
    }
            private void configureW5D5(){
                ImageView w5d5 = (ImageView) findViewById(R.id.week5day5);
        w5d5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w5d5);
            }
        });
    }
                private void configureW5D6(){
                    ImageView w5d6 = (ImageView) findViewById(R.id.week5day6);
        w5d6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w5d6);
            }
        });
    }
                private void configureW5D7(){
                    ImageView w5d7 = (ImageView) findViewById(R.id.week5day7);
        w5d7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w5d7);
            }
        });
    }
}
