package com.example.android.basketscorecounter;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int quantity = 0;
    int quantity2 = 0;
    public void sum_3(View view){
        quantity = quantity + 3;
        displayForTeamA(quantity);
    }
    public void sum_2(View view){
        quantity = quantity + 2;
        displayForTeamA(quantity);
    }
    public void sum_1(View view){
        quantity = quantity + 1;
        displayForTeamA(quantity);
    }

    public void sum_3_B(View view){
        quantity2 = quantity2 + 3;
        displayForTeamB(quantity2);
    }
    public void sum_2_B(View view){
        quantity2 = quantity2 + 2;
        displayForTeamB(quantity2);
    }
    public void sum_1_B(View view){
        quantity2 = quantity2 + 1;
        displayForTeamB(quantity2);
    }

    public void resetejar(View view){
        quantity = quantity2 = 0;
        displayForTeamA(quantity);
        displayForTeamB(quantity2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.punts);
        scoreView.setText(String.valueOf(score));
    }

    private void displayForTeamB(int score) {
        TextView scoreView2 = findViewById(R.id.punts2);
        scoreView2.setText(String.valueOf(score));
    }
}



