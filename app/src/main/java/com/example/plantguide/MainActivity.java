package com.example.plantguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    private static String Tag = "loggerMusli";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout crunchyL = new RelativeLayout(this);
        Button but = new Button(this);
        crunchyL.addView(but);
        crunchyL.setBackgroundColor(Color.GRAY);
        setContentView(crunchyL);
        but.setBackgroundColor(Color.RED);

        //setContentView(R.layout.activity_main);
        Log.i(Tag, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag, "onStart");

    }
}
