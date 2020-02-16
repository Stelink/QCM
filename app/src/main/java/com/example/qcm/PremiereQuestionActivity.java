package com.example.qcm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.Toast;

public class PremiereQuestionActivity extends Activity {
    private ProgressBar progress;
    private RadioButton oui;
    private RadioButton non;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premiere_question);

        this.oui = findViewById(R.id.oui);
        this.non = findViewById(R.id.non);
        this.progress = findViewById(R.id.progress);
    }

    public void onClickValider(View vue){
        Intent intentDeuxiemeQuestion = new Intent(PremiereQuestionActivity.this, DeuxiemeQuestionActivity.class);
        intentDeuxiemeQuestion.putExtra("EXTRA_100", 100);

        if(this.oui.isChecked()){
            intentDeuxiemeQuestion.putExtra("EXTRA_SCORE", 1);
            startActivity(intentDeuxiemeQuestion);
        }
        else{
            intentDeuxiemeQuestion.putExtra("EXTRA_SCORE", 0);
            startActivity(intentDeuxiemeQuestion);
        }
    }

    public void onClickAnnuler(View vue){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
