package com.android.fauziachmadharuna.basketballcount;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by FauziAchmad on 4/12/17.
 */

public class Calculated extends AppCompatActivity {
    TextView report1;
    TextView report2;
    TextView report3;

    Button emailShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculated);
        getSupportActionBar().setTitle("Report Score");

        report1 = (TextView)findViewById(R.id.tv_resultA);
        int teamA = getIntent().getExtras().getInt("TEAM_A");
        report1.setText("SCORE TEAM A : "+ teamA+"");
        report2=(TextView)findViewById(R.id.tv_resultb);
        int teamB= getIntent().getExtras().getInt("TEAM_B");
        report2.setText("SCORE TEAM B : "+teamB+"");
        report3=(TextView)findViewById(R.id.tv_resultGame);
        if (teamA>teamB) {
            report3.setText("THE WINNER is TEAM A ");
        }else if (teamA==teamB){
            report3.setText("DRAW");
        }else{
            report3.setText("THE WINNER is TEAM B");
        }
    }
}
