package com.example.qcm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class QuatriemeQuestionActivity extends Activity {
    private boolean bool;
    private ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quatrieme_question);
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
        Intent intent = new Intent(this, CinquiemeQuestionActivity.class);
        intent.putExtra("EXTRA_100", this.progress.getProgress() + 100 / 5);
        startActivity(intent);
    }

    public void onClickAnnuler(View vue){
        Intent intent = new Intent(this, TroisiemeQuestionActivity.class);
        startActivity(intent);
    }
}
