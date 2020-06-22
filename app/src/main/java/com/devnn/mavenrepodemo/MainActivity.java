package com.devnn.mavenrepodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.devnn.library1.Library1;

public class MainActivity extends AppCompatActivity {
    private TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMessage = findViewById(R.id.main_text);

        Library1 library1=new Library1();

        tvMessage.setText(library1.hello());

        tvMessage.append("\n");

        tvMessage.append(library1.call());
    }
}
