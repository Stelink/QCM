package com.example.qcm;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class TroisiemeQuestionActivity extends Activity {
    private boolean bool;
    private ProgressBar progress;
    private int score;
    private Button vrai;
    private Button faux;
    private int tmp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_troisieme_question);
        this.bool = false;
        this.progress = findViewById(R.id.progress);
        this.vrai = findViewById(R.id.vrai);
        this.faux = findViewById(R.id.faux);
        Intent intentProgress = getIntent();
        int cent = intentProgress.getIntExtra("EXTRA_100", 0);
        this.tmp = cent;
        this.score = intentProgress.getIntExtra("EXTRA_SCORE", 0);
        this.progress.setProgress(40);
    }

    public void onClickValider(View vue) {
        Intent intent = new Intent(TroisiemeQuestionActivity.this, QuatriemeQuestionActivity.class);
        intent.putExtra("EXTRA_100", this.progress.getProgress() + 100 / 5);
        if (this.bool){
            this.score += 1;
            intent.putExtra("EXTRA_SCORE", this.score);
            startActivity(intent);
        }
        else{
            intent.putExtra("EXTRA_SCORE", this.score + 0);
            startActivity(intent);
        }
    }

    public void onClickAnnuler(View vue){
        Intent intent = new Intent(this, DeuxiemeQuestionActivity.class);
        this.progress.setProgress(this.progress.getProgress()-100/5);
        this.score -= 1;
        startActivity(intent);
    }

    public void onClickFaux(View vue){
        this.bool = true;

        this.faux.setBackgroundColor(Color.CYAN);
        this.vrai.setBackgroundColor(Color.GRAY);
    }

    public void onClickVrai(View vue){
        this.bool = false;
        this.faux.setBackgroundColor(Color.GRAY);
        this.vrai.setBackgroundColor(Color.CYAN);
    }

}
