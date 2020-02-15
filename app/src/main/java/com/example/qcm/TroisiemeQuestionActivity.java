package com.example.qcm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TroisiemeQuestionActivity extends Activity {
    private boolean bool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_troisieme_question);
        this.bool = false;
    }

    public void onClickValider(View vue){
        Intent intent = new Intent(TroisiemeQuestionActivity.this, QuatriemeQuestionActivity.class);
        if(this.bool)
            startActivity(intent);
    }


    public void onClickFaux(View vue){
        this.bool = true;
    }

    public void onClickVrai(View vue){
        this.bool = false;
    }

    public void onClickAnnuler(View vue){

    }
}
