package com.example.application2;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{
    public static int[] COLORS = new int [] {Color.GREEN};
    String ep;
    int index=0;
    int score=0;
    boolean hasSelected;
    TextView t;
    TextView scores;
    Button nextbutton;
    Button halqiyahbutton;
    Button lahatiyahbutton;
    Button lisaveyahbutton;
    Button ghunnabutton;
    Button tarfiyahbutton;
    Button shafaweeyahbutton;
    Button niteeyahbutton;
    Button thalqeeyahbutton;
    Button asleeyahbutton;
    Button shbutton;
    Button finishbutton;
    String[] alphabets = {"\u0627","\u0628", "\u062A","\u062B","\u062C","\u062D","\u062E","\u062F","\u0630","\u0631","\u0632","\u0633","\u0634","\u0635","\u0636","\u0637", "\u0638","\u0639","\u063A", "\u0641", "\u0642","\u0643","\u0644", "\u0645", "\u0646","\u0647", "\u0648", "\u064A","\u0622","\u0629","\u0649"};
    String[] emissionP= {"Halqiyah_b","Shafaweeyah","Niteeyah", "Lisaveyah", "Shajariyah_Haafiyah", "Halqiyah_b", "Halqiyah_b", "Niteeyah", "Lisaveyah", "Thalqeeyah", "Asleeyah", "Asleeyah", "Shajariyah_Haafiyah", "Asleeyah", "Shajariyah_Haafiyah", "Niteeyah", "Lisaveyah", "Halqiyah_b","Halqiyah_b", "Shafaweeyah", "Lahatiyah_b", "Lahatiyah_b", "Tarfiyah", "Ghunna", "Halqiyah_b", "Shafaweeyah", "Shajariyah_Haafiyah", "Halqiyah_b", "Halqiyah_b", "Halqiyah_b"};
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Random rand = new Random();
        t=findViewById(R.id.alphabetshow);
        scores=findViewById(R.id.scoreview);
        nextbutton=findViewById(R.id.nextbtn);
        nextbutton.setOnClickListener(this);

        halqiyahbutton=findViewById(R.id.halqiyahbtn);
        halqiyahbutton.setOnClickListener(this);

        lahatiyahbutton=findViewById(R.id.lahatiyahbtn);
        lahatiyahbutton.setOnClickListener(this);

        lisaveyahbutton= findViewById(R.id.lisaveyahbtn);
        lisaveyahbutton.setOnClickListener(this);

        ghunnabutton=findViewById(R.id.ghunnabtn);
        ghunnabutton.setOnClickListener(this);

        tarfiyahbutton=findViewById(R.id.tarfiyahbtn);
        tarfiyahbutton.setOnClickListener(this);

        shafaweeyahbutton=findViewById(R.id.shafaweeyahbtn);
        shafaweeyahbutton.setOnClickListener(this);

        niteeyahbutton=findViewById(R.id.niteeyahbtn);
        niteeyahbutton.setOnClickListener(this);

        thalqeeyahbutton=findViewById(R.id.thalqeeyahbtn);
        thalqeeyahbutton.setOnClickListener(this);

        asleeyahbutton=findViewById(R.id.asleeyahbtn);
        asleeyahbutton.setOnClickListener(this);

        shbutton=findViewById(R.id.shbtn);
        shbutton.setOnClickListener(this);

        finishbutton=findViewById(R.id.finishbtn);
        finishbutton.setOnClickListener(this);
       //t.setText(alphabets[3]);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.nextbtn:
                scores.setText(Integer.toString(score));
                shbutton.setBackgroundColor(0xFFBB86FC);
                ghunnabutton.setBackgroundColor(0xFFBB86FC);
                asleeyahbutton.setBackgroundColor(0xFFBB86FC);
                thalqeeyahbutton.setBackgroundColor(0xFFBB86FC);
                niteeyahbutton.setBackgroundColor(0xFFBB86FC);
                shafaweeyahbutton.setBackgroundColor(0xFFBB86FC);
                tarfiyahbutton.setBackgroundColor(0xFFBB86FC);
                lisaveyahbutton.setBackgroundColor(0xFFBB86FC);
                halqiyahbutton.setBackgroundColor(0xFFBB86FC);
                lahatiyahbutton.setBackgroundColor(0xFFBB86FC);
                hasSelected=false;
                if(index == 30){
                    nextbutton.setEnabled(false);
              t.setText("Questions completed");
                }
                else{
                    t.setText(alphabets[index++]);
                }
                break;
            case R.id.halqiyahbtn:
                if(!hasSelected){
                    hasSelected=true;
                    ep = emissionP[index-1];
                    if(ep.equals("Halqiyah_b")){
                        halqiyahbutton.setBackgroundColor(COLORS[0]);
                        score+=1;
                    }
                    else{
                        halqiyahbutton.setBackgroundColor(0xFFFF0000);
                    }
                }
                break;
            case R.id.lahatiyahbtn:
                if(!hasSelected){
                    hasSelected=true;
                    ep = emissionP[index-1];
                    if(ep.equals("Lahatiyah_b")){
                        lahatiyahbutton.setBackgroundColor(COLORS[0]);
                        score+=1;
                    }
                    else{
                        lahatiyahbutton.setBackgroundColor(0xFFFF0000);
                    }
                }
                break;
            case R.id.lisaveyahbtn:
                if(!hasSelected){
                    hasSelected=true;
                    ep=emissionP[index-1];
                    if(ep.equals("Lisaveyah")){
                        lisaveyahbutton.setBackgroundColor(COLORS[0]);
                        score+=1;
                    }
                    else{
                        lisaveyahbutton.setBackgroundColor(0xFFFF0000);
                    }
                }
                break;
            case R.id.ghunnabtn:
                if(!hasSelected){
                    hasSelected=true;
                    ep=emissionP[index-1];
                    if(ep.equals("Ghunna")){
                        ghunnabutton.setBackgroundColor(COLORS[0]);
                        score+=1;
                    }
                    else{
                        ghunnabutton.setBackgroundColor(0xFFFF0000);
                    }
                }
                break;
            case R.id.tarfiyahbtn:
                if(!hasSelected){
                    hasSelected=true;
                    ep=emissionP[index-1];
                    if(ep.equals("Tarfiyah")){
                        tarfiyahbutton.setBackgroundColor(COLORS[0]);
                        score+=1;
                    }
                    else{
                        tarfiyahbutton.setBackgroundColor(0xFFFF0000);
                    }
                }
                break;
            case R.id.shafaweeyahbtn:
                if(!hasSelected){
                    hasSelected=true;
                    ep=emissionP[index-1];
                    if(ep.equals("Shafaweeyah")){
                        shafaweeyahbutton.setBackgroundColor(COLORS[0]);
                        score+=1;
                    }
                    else{
                        shafaweeyahbutton.setBackgroundColor(0xFFFF0000);
                    }
                }
                break;
            case R.id.niteeyahbtn:
                if(!hasSelected){
                    hasSelected=true;
                    ep=emissionP[index-1];
                    if(ep.equals("Niteeyah")){
                        niteeyahbutton.setBackgroundColor(COLORS[0]);
                        score+=1;
                    }
                    else{
                        niteeyahbutton.setBackgroundColor(0xFFFF0000);
                    }
                }
                break;
            case R.id.thalqeeyahbtn:
                if(!hasSelected){
                    hasSelected=true;
                    ep=emissionP[index-1];
                    if(ep.equals("Thalqeeyah")){
                        thalqeeyahbutton.setBackgroundColor(COLORS[0]);
                        score+=1;
                    }
                    else{
                        thalqeeyahbutton.setBackgroundColor(0xFFFF0000);
                    }
                }
                break;
            case R.id.asleeyahbtn:
                if(!hasSelected){
                    hasSelected=true;
                    ep=emissionP[index-1];
                    if(ep.equals("Asleeyah")){
                        asleeyahbutton.setBackgroundColor(COLORS[0]);
                        score+=1;
                    }
                    else{
                        asleeyahbutton.setBackgroundColor(0xFFFF0000);
                    }
                }
                break;
            case R.id.shbtn:
                if(!hasSelected){
                    hasSelected=true;
                    ep=emissionP[index-1];
                    if(ep.equals("Shajariyah_Haafiyah")){
                        shbutton.setBackgroundColor(COLORS[0]);
                        score+=1;
                    }
                    else{
                        shbutton.setBackgroundColor(0xFFFF0000);
                    }
                }
            case R.id.finishbtn:
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("Score",score);
                startActivity(intent);

        }
    }
}