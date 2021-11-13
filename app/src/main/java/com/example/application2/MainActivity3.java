package com.example.application2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    Button sharebutton;
    TextView finalscore;
    Button homebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        int score = getIntent().getExtras().getInt("Score");
        finalscore=findViewById(R.id.finalscore);
        finalscore.setText(Integer.toString(score));

        sharebutton= findViewById(R.id.sharebtn);

        homebutton= findViewById(R.id.homebtn);

        sharebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = finalscore.getText().toString();
                String message = "My Score is " + result;
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,message);
                startActivity(intent);
            }
        });

        homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(in);
            }
        });
    }
}