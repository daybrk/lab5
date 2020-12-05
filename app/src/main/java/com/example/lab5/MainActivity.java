package com.example.lab5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    static  Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.nav_menu);

        context = this;

        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
    }

    private final BottomNavigationView.OnNavigationItemSelectedListener
            navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {


        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.button_click:
                    Intent intent2 = new Intent(context, ButtonCl.class);
                    context.startActivity(intent2);
                    break;
                case R.id.motion_event:
                    Intent intent1 = new Intent(context, MotionEv.class);
                    context.startActivity(intent1);
                    break;
                case R.id.common_gestures:
                    Intent intent = new Intent(context, CommonGesture.class);
                    context.startActivity(intent);
                    break;
            }
            return false;
        }
    };

}