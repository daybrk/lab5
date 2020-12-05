package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ButtonCl extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_cl);


        tv = (TextView) findViewById(R.id.tv);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("Button clicked");
            }
        });

        button.setOnLongClickListener(new Button.OnLongClickListener() {
            public boolean onLongClick(View v) {
                tv.setText("Long button click");
                return true;
            }
        });
    }

}