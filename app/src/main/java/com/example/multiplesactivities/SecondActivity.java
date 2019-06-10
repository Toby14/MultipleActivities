package com.example.multiplesactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        // To ge the Intent, and the message from it we use getStringExtra()
        String showMessage = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView receivedMessage = findViewById(R.id.recievingMessage);
        receivedMessage.setText(showMessage);

    }
}
