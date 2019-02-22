package com.concordia.cejv669.lab10_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Intent i = getIntent();
        String userName = i.getStringExtra("uname");
        TextView v = findViewById(R.id.textView3);
        v.setText("Welcome, " + userName + "!");
    }
}
