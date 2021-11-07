package com.example.application2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button repobutton;
    Button appbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        appbutton= findViewById(R.id.appbtn);
        repobutton = findViewById(R.id.repobtn);

        repobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= "https://github.com/bilalkhan219/assignment2MC";
                Uri webpage = Uri.parse(url);
                Intent intent = new
                        Intent( Intent.ACTION_VIEW , webpage);
                        startActivity(intent);
            }
        });

        appbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);

            }
        });
    }
}