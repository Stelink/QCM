package com.example.qcm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RadioButton;

public class CinquiemeQuestionActivity extends Activity {

    private RadioButton quatre;
    private RadioButton seize;
    private RadioButton douze;
    private ProgressBar progress;

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
        if(cent == 100/5)
            this.progress.setProgress(this.progress.getProgress()+cent);
        else{
            this.progress.setProgress(this.progress.getProgress()+cent);
        }
    }

    public void onClickValider(View vue){
        Intent intent = new Intent(this, Resultat.class);
        if(this.quatre.isChecked()){
            intent.putExtra("EXTRA_100", this.progress.getProgress() + 100 / 5);
            startActivity(intent);
        }
        else{
            intent.putExtra("EXTRA_100", this.progress.getProgress());
            startActivity(intent);
        }
    }

    public void onClickAnnuler(View vue){
        Intent intent = new Intent(this, QuatriemeQuestionActivity.class);
        startActivity(intent);
    }
}
