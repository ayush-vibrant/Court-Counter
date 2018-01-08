package com.example.sharma.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     int total=0;
     int total2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayForTeamA(int score){
        TextView scoreView = (TextView)findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void plus3(View view){
        displayForTeamA(total+=3);
    }
    public void plus2(View view) { displayForTeamA(total+=2);}
    public void plus1(View view){
        displayForTeamA(total++);
    }
    public void displayForTeamB(int score){
        TextView scoreView2 = (TextView)findViewById(R.id.team_b_score);
        scoreView2.setText(String.valueOf(score));
    }
    public void bplus3(View view){
        displayForTeamB(total2+=3);
    }
    public void bplus2(View view){
        displayForTeamB(total2+=2);
    }
    public void bplus1(View view){
        displayForTeamB(total2++);
    }
    public void reset(View view){
        total=0;
        total2=0;
        displayForTeamA(0);
        displayForTeamB(0);

    }
}
