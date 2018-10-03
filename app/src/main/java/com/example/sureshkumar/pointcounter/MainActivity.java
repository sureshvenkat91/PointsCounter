package com.example.sureshkumar.pointcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    int scorea = 0;
    public void AddthreeforTeamA(View view)
    {
        scorea = scorea+3;
        displayForTeamA(scorea);
    }
    public void AddtwoforTeamA(View view)
    {
        scorea = scorea+2;
        displayForTeamA(scorea);
    }
    public void AddoneforTeamA(View view)
    {
        scorea = scorea+1;
        displayForTeamA(scorea);
    }

    public void displayForTeamB(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    int scoreb = 0;
    public void AddthreeforTeamB(View view)
    {
        scoreb = scoreb+3;
        displayForTeamB(scoreb);
    }
    public void AddtwoforTeamB(View view)
    {
        scoreb = scoreb+2;
        displayForTeamB(scoreb);
    }
    public void AddoneforTeamB(View view)
    {
        scoreb= scoreb+1;
        displayForTeamB(scoreb);
    }
    public void gameOver(View view)
    {
        TextView score = (TextView) findViewById(R.id.over);
        if(scorea>scoreb)
        {
            score.setText("TEAM A WINS");
        }
        else if(scorea<scoreb)
        {
            score.setText("TEAM B WINS");
        }
        else
        {
            score.setText("MATCH DRAWN");
        }
    }
    public void reset(View view)
    {
        TextView score1 = (TextView) findViewById(R.id.team_a_score);
        TextView score2 = (TextView) findViewById(R.id.team_b_score);
        TextView score3 = (TextView) findViewById(R.id.over);
        scorea = 0;
        scoreb = 0;
        score1.setText("0");
        score2.setText("0");
        score3.setText("MATCH IN PROGRESS");
    }

}
