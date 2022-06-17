package com.banrossyn.neumor.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import soup.neumorphism.NeumorphButton;

public class MainActivity extends AppCompatActivity {

    NeumorphButton btn_toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_toast = findViewById(R.id.btn_toast);

        btn_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NeumorphToast.showToast(MainActivity.this);

            }
        });
    }
}