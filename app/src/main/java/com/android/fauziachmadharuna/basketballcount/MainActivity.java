package com.android.fauziachmadharuna.basketballcount;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.ActionMode;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    Button tambah3A;
    Button tambah2A;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tambah2A=(Button)findViewById(R.id.btn_2PoinA);
//        tambah3A=(Button)findViewById(R.id.btn_3PoinA);
//        tambah3A.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//
//            }
//        });

    }

    //Method untuk menambahkan + 1 Score
    public void tambah1_A(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }
    //Methdo
    public void tambah2_A(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void tambah3_A(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
        Toast.makeText(this,"Tambah 3 Point!",Toast.LENGTH_SHORT).show();
    }

    public void tambah1_B(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void tambah2_B(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void tambah3_B(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamA(int scoreTeamA) {
        //Inisialisasi Score Text dengan TextView
        TextView scoreViewA = (TextView) findViewById(R.id.tv_scoreA);
        //Merubah tampilan Score dengan method setText()
        scoreViewA.setText(String.valueOf(scoreTeamA));
    }

    public void displayForTeamB(int scoreTeamB) {
        TextView scoreViewB = (TextView) findViewById(R.id.tv_scoreB);
        scoreViewB.setText(String.valueOf(scoreTeamB));
    }

    public void saveScore(View view) {

        if ((scoreTeamA == 0) && (scoreTeamB == 0)) {
            Toast.makeText(this, "Please push your score", Toast.LENGTH_SHORT).show();
        } else if (scoreTeamA == scoreTeamB) {
            Toast.makeText(this, "Draw", Toast.LENGTH_SHORT).show();

        } else if ((scoreTeamA > scoreTeamB)) {
            Toast.makeText(this, "Team A Win!", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "Team B Win!", Toast.LENGTH_SHORT).show();

        }

    }

    public void resetScore(View view) {

        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        Toast.makeText(this, "Reset Score", Toast.LENGTH_SHORT).show();
    }

    public void share(View view) {
        int scoreA = scoreTeamA;
        int scoreB = scoreTeamB;
        Intent intent = new Intent(MainActivity.this, Calculated.class);
        intent.putExtra("TEAM_A", scoreA);
        intent.putExtra("TEAM_B", scoreB);
        startActivity(intent);
    }

    public void exit(View view) {
        finish();
        System.exit(0);
    }

    @Override
    public void onActionModeFinished(ActionMode mode) {
        super.onActionModeFinished(mode);
    }
}
