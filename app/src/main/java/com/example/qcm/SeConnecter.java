package com.example.qcm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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

        Intent intentGetID = getIntent();

        this.id = intentGetID.getStringExtra("EXTRA_ID");
        this.pass = intentGetID.getStringExtra("EXTRA_PASS");

        String toast = this.id + " " + this.pass;
        Toast t = Toast.makeText(getApplicationContext(),toast, Toast.LENGTH_SHORT);
        t.show();
    }

    public void onClickSeConnecter(View vue){
        Intent intentPQ = new Intent(SeConnecter.this, PremiereQuestionActivity.class);

        if(this.editID.getText().toString().equals(this.id) && this.editPass.getText().toString().equals(this.pass))
            startActivity(intentPQ);
        else{
            String toast = "Identifiant Incorrects, vérifiez-les ou créez-vous un compte";
                    //+ " \n" + this.id + " " + this.pass;
            Toast t = Toast.makeText(getApplicationContext(),toast, Toast.LENGTH_SHORT);
            t.show();
        }
    }
}
