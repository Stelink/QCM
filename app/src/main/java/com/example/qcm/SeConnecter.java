package com.example.qcm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SeConnecter extends Activity {
    public static String EXTRA_ID;
    public static String EXTRA_PASS;
    public EditText editID;
    public EditText editPass;
    public String id;
    public String pass;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_se_connecter);

        this.EXTRA_ID = "";
        this.EXTRA_PASS = "";
        this.id ="";
        this.pass = "";
        this.editID = findViewById(R.id.editID);
        this.editPass = findViewById(R.id.editPass);
    }

    public void onClickSeConnecter(View vue){
        Intent intentPQ = new Intent(SeConnecter.this, PremiereQuestionActivity.class);
        startActivity(intentPQ);
    }
}
