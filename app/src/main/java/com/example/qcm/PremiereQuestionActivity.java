package com.example.qcm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class PremiereQuestionActivity extends Activity {

    private RadioButton oui;
    private RadioButton non;
    private boolean bool;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premiere_question);

        this.oui = (RadioButton) findViewById(R.id.oui);
        this.non = (RadioButton) findViewById(R.id.non);
    }

    public void onClickValider(View vue){
        Intent intentDeuxiemeQuestion = new Intent(PremiereQuestionActivity.this, DeuxiemeQuestionActivity.class);
        if(this.oui.isChecked())
            bool = true;
        else
            bool = false;
        if(bool)
            startActivity(intentDeuxiemeQuestion);
    }

    public void onClickAnnuler(View vue){

    }

}
