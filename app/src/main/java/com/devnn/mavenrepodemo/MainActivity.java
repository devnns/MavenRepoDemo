package com.devnn.mavenrepodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.devnn.library1.Library1;
import com.devnn.library2.Library2;

public class MainActivity extends AppCompatActivity {
    private TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMessage = findViewById(R.id.main_text);
        tvMessage.setText(Library1.hello());
        tvMessage.append("\n");
        tvMessage.append(Library1.call());
    }
}
