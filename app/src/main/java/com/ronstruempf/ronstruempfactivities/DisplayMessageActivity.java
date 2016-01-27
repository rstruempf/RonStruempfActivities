package com.ronstruempf.ronstruempfactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE2 = "com.mycompany.myfirstapp.MESSAGE2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // retrieve incoming message and display in TextView
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = (TextView)findViewById(R.id.displayMessage);
        textView.setText(message);
    }

    public void sendMessages(View view) {
        Intent intent = new Intent(this, DisplaySecondMessageActivity.class);
        TextView textView = (TextView)findViewById(R.id.displayMessage);
        String message = textView.getText().toString();
        intent.putExtra(MainActivity.EXTRA_MESSAGE, message);
        EditText editText = (EditText)findViewById(R.id.editSecondMessage);
        message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE2, message);
        startActivity(intent);
    }
}
