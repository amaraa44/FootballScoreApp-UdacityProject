package com.example.android.footballscoresapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreTeamA = 0;
    int yellowCardTeamA = 0;
    int redCardTeamA = 0;

    int scoreTeamB = 0;
    int yellowCardTeamB = 0;
    int redCardTeamB = 0;


    public void goalTeamA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayGoalForTeamA(scoreTeamA);
    }
    public void yellowCardTeamA(View view){
        yellowCardTeamA = yellowCardTeamA + 1;
        displayYellowCardForTeamA(yellowCardTeamA);
    }
    public void redCardTeamA(View view){
        redCardTeamA = redCardTeamA + 1;
        displayRedCardForTeamA(redCardTeamA);
    }

    public void goalTeamB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayGoalForTeamB(scoreTeamB);
    }
    public void yellowCardTeamB(View view){
        yellowCardTeamB = yellowCardTeamB + 1;
        displayYellowCardForTeamB(yellowCardTeamB);
    }
    public void redCardTeamB(View view){
        redCardTeamB = redCardTeamB + 1;
        displayRedCardForTeamB(redCardTeamB);
    }

    /**
     * Reset the cards and the scores.
     * */
    public void resetBtn(View view){
        scoreTeamA = 0;
        displayGoalForTeamA(scoreTeamA);
        yellowCardTeamA = 0;
        displayYellowCardForTeamA(yellowCardTeamA);
        redCardTeamA = 0;
        displayRedCardForTeamA(redCardTeamA);

        scoreTeamB = 0;
        displayGoalForTeamB(scoreTeamB);
        yellowCardTeamB = 0;
        displayYellowCardForTeamB(yellowCardTeamB);
        redCardTeamB = 0;
        displayRedCardForTeamB(redCardTeamB);


    }

    //Display for Team A.
    /**
     * Display the given goal for Team A.
     * */
    public void displayGoalForTeamA (int goal){
        TextView textView = (TextView) findViewById(R.id.team_a_score);
        textView.setText(String.valueOf(goal));
    }
    /**
     * Display the given yellow card for Team A
     * */
    public void displayYellowCardForTeamA (int yellowCard){
        TextView textView = (TextView) findViewById(R.id.yellowCardTeamATxt);
        textView.setText(String.valueOf(yellowCard));
    }
    /**
     * Display the given red card for Team A.
     * */
    public void displayRedCardForTeamA (int redCard){
        TextView textView = (TextView) findViewById(R.id.redCardTeamATxt);
        textView.setText(String.valueOf(redCard));
    }

    //Display for Team B.
    /**
     * Display the given goal for Team B.
     * */
    public void displayGoalForTeamB (int goal){
        TextView textView = (TextView) findViewById(R.id.team_b_score);
        textView.setText(String.valueOf(goal));
    }
    /**
     * Display the given yellow card for Team B.
     * */
    public void displayYellowCardForTeamB (int yellowCard){
        TextView textView = (TextView) findViewById(R.id.yellowCardTeamBTxt);
        textView.setText(String.valueOf(yellowCard));
    }
    /**
     * Display the given red card for Team B.
     * */
    public void displayRedCardForTeamB (int redCard){
        TextView textView = (TextView) findViewById(R.id.redCardTeamBTxt);
        textView.setText(String.valueOf(redCard));
    }
}
