package com.example.qcm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.swiperefreshlayout.widget.CircularProgressDrawable;

public class TroisiemeQuestionActivity extends Activity {
    private boolean bool;
    private ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_troisieme_question);
        this.bool = false;
        this.progress = findViewById(R.id.progress);

        Intent intentProgress = getIntent();
        int cent = intentProgress.getIntExtra("EXTRA_100", 0);
        if(cent == 100/5)
            this.progress.setProgress(this.progress.getProgress()+cent);
        else{
            this.progress.setProgress(this.progress.getProgress()+cent);
        }
    }

    public void onClickValider(View vue) {
        Intent intent = new Intent(TroisiemeQuestionActivity.this, QuatriemeQuestionActivity.class);
        if (this.bool){
            intent.putExtra("EXTRA_100", this.progress.getProgress() + 100 / 5);
            startActivity(intent);
        }
        else{
            intent.putExtra("EXTRA_100", this.progress.getProgress());
            startActivity(intent);
        }
    }


    public void onClickFaux(View vue){
        this.bool = true;
    }

    public void onClickVrai(View vue){
        this.bool = false;
    }

    public void onClickAnnuler(View vue){
        Intent intent = new Intent(this, DeuxiemeQuestionActivity.class);
        startActivity(intent);
    }
}
