package com.example.qcm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RadioButton;

public class PremiereQuestionActivity extends Activity {
    private ProgressBar progress;
    private RadioButton oui;
    private RadioButton non;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premiere_question);

        this.oui = (RadioButton) findViewById(R.id.oui);
        this.non = (RadioButton) findViewById(R.id.non);
        this.progress = findViewById(R.id.progress);
    }

    public void onClickValider(View vue){
        Intent intentDeuxiemeQuestion = new Intent(PremiereQuestionActivity.this, DeuxiemeQuestionActivity.class);
        if(this.oui.isChecked()){
            intentDeuxiemeQuestion.putExtra("EXTRA_100", 100/5);
            startActivity(intentDeuxiemeQuestion);
        }
        else{
            intentDeuxiemeQuestion.putExtra("EXTRA_100", 0);
            startActivity(intentDeuxiemeQuestion);
        }
    }

    public void onClickAnnuler(View vue){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
