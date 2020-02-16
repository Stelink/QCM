package com.example.qcm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.Toast;

public class DeuxiemeQuestionActivity extends Activity {

    private CheckBox Zelda;
    private CheckBox Tetra;
    private CheckBox JFA;
    private CheckBox Ganondorf;
    private CheckBox Link;
    private ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deuxieme_question);

        this.Zelda = findViewById(R.id.Zelda);
        this.Tetra = findViewById(R.id.Tetra);
        this.JFA = findViewById(R.id.jfa);
        this.Link = findViewById(R.id.Link);
        this.Ganondorf = findViewById(R.id.Ganondorf);
        this.progress = findViewById(R.id.progress);

        Intent intentProgress = getIntent();
        int cent = intentProgress.getIntExtra("EXTRA_100", 0);
        if(cent == 100/5)
            this.progress.setProgress(cent);
        else{
            this.progress.setProgress(cent);
        }
    }

    public void onClickValider(View vue){
        Intent intent3emeQuestion = new Intent(DeuxiemeQuestionActivity.this, TroisiemeQuestionActivity.class);
        if(this.Zelda.isChecked() && this.Ganondorf.isChecked() && this.Link.isChecked() && !this.Tetra.isChecked() && !this.JFA.isChecked()){
            intent3emeQuestion.putExtra("EXTRA_100", this.progress.getProgress() + 100/5);
            startActivity(intent3emeQuestion);
        }
        else{
            intent3emeQuestion.putExtra("EXTRA_100", this.progress.getProgress());
            startActivity(intent3emeQuestion);
        }
    }

    public void onClickAnnuler(View vue){
        Intent intent = new Intent(this, PremiereQuestionActivity.class);
        startActivity(intent);
    }
}
