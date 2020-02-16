package com.example.qcm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.Toast;

public class CinquiemeQuestionActivity extends Activity {

    private RadioButton quatre;
    private RadioButton seize;
    private RadioButton douze;
    private ProgressBar progress;
    private int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinquieme_question);

        this.quatre = findViewById(R.id.quatre);
        this.seize = findViewById(R.id.seize);
        this.douze = findViewById(R.id.douze);
        this.progress = findViewById(R.id.progress);
        Intent intentProgress = getIntent();
        int cent = intentProgress.getIntExtra("EXTRA_100", 0);
        this.score = intentProgress.getIntExtra("EXTRA_SCORE", 0);
        if(cent == 100/5)
            this.progress.setProgress(this.progress.getProgress()+cent);
        else{
            this.progress.setProgress(this.progress.getProgress()+cent);
        }
    }

    public void onClickValider(View vue){
        Intent intent = new Intent(this, Resultat.class);
        intent.putExtra("EXTRA_100", this.progress.getProgress() + 100 / 5);
        if(this.quatre.isChecked()){
            this.score += 1;
            intent.putExtra("EXTRA_SCORE", this.score);
            Toast t = Toast.makeText(getApplicationContext(), this.score+"", Toast.LENGTH_SHORT);
            t.show();
            startActivity(intent);
        }
        else{
            intent.putExtra("EXTRA_SCORE", this.score + 0);
            startActivity(intent);
        }
    }

    public void onClickAnnuler(View vue){
        Intent intent = new Intent(this, QuatriemeQuestionActivity.class);
        startActivity(intent);
    }
}
