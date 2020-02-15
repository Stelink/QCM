package com.example.qcm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class DeuxiemeQuestionActivity extends Activity {

    private CheckBox Zelda;
    private CheckBox Tetra;
    private CheckBox JFA;
    private CheckBox Ganondorf;
    private CheckBox Link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deuxieme_question);

        this.Zelda = findViewById(R.id.Zelda);
        this.Tetra = findViewById(R.id.Tetra);
        this.JFA = findViewById(R.id.jfa);
        this.Link = findViewById(R.id.Link);
        this.Ganondorf = findViewById(R.id.Ganondorf);
    }

    public void onClickValider(View vue){
        Intent intent3emeQuestion = new Intent(DeuxiemeQuestionActivity.this, TroisiemeQuestionActivity.class);
        if(this.Zelda.isChecked() && this.Ganondorf.isChecked() && this.Link.isChecked() && !this.Tetra.isChecked()){
            startActivity(intent3emeQuestion);
        }

    }

    public void onClickAnnuler(View vue){

    }
}
