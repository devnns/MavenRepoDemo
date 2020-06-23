package com.devnn.mavenrepodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.devnn.commonlibrary.ILibrary;
import com.devnn.commonlibrary.LibraryLoader;

public class MainActivity extends AppCompatActivity {
    private TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        tvMessage = findViewById(R.id.main_text);

        ILibrary library1 = LibraryLoader.getLibrary1();
        ILibrary library2 = LibraryLoader.getLibrary2();

        if (library1 != null) {
            tvMessage.append("\n");
            tvMessage.append(library1.hello());
        }

        if (library2 != null) {
            tvMessage.append("\n");
            tvMessage.append(library2.hello());
        }
    }
}
