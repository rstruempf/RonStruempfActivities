package com.ronstruempf.ronstruempfactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class DisplaySecondMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_second_message);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // retrieve incoming messages and display in TextViews
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = (TextView)findViewById(R.id.displayFirstMessage);
        textView.setText(message);
        message = intent.getStringExtra(DisplayMessageActivity.EXTRA_MESSAGE2);
        textView = (TextView)findViewById(R.id.displaySecondMessage);
        textView.setText(message);

    }

}
