package com.example.nutriarc;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuItem;
import android.view.View;
import android.widget.CalendarView;
import android.widget.ImageButton;
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
        ImageButton backBtn = (ImageButton) findViewById(R.id.backbtn);
        backBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }
        });
    }

    private void displaymood(ImageButton btn){
        PopupMenu popup = new PopupMenu(calendar.this, btn);
        //Inflating the Popup using xml file
        popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

        //registering popup with OnMenuItemClickListener
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == 0) {
                    btn.setBackgroundResource(R.drawable.nothing);
                }else if (item.getItemId() == 1){
                    btn.setBackgroundResource(R.drawable.happy);
                }else if (item.getItemId() == 2){
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
        ImageButton w1d1 = (ImageButton) findViewById(R.id.week1day1);
        w1d1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                displaymood(w1d1);
            }
        });
    }

}