package com.example.qcm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CreationDeCompte extends Activity {
    public static String EXTRA_ID;
    public static String EXTRA_PASS;
    public EditText editID;
    public EditText editPass;
    public String id;
    public String pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_creation_compte);

            this.EXTRA_ID = "";
            this.EXTRA_PASS = "";
            this.id ="";
            this.pass = "";
            this.editID = findViewById(R.id.editID);
            this.editPass = findViewById(R.id.editPass);
    }

    public void onClickCreation(View vue){
        Intent intentSeConnecter = new Intent(this, MainActivity.class);
        this.id = this.editID.getText().toString();
        this.pass = this.editPass.getText().toString();

        if(!this.id.contains("P") || !this.pass.contains("1")){
            Toast t = Toast.makeText(getApplicationContext(), "Vote mdp doit contenir un 1 et votre identifiant doit contenir un P", Toast.LENGTH_SHORT);
            t.show();
        }
        else{
            intentSeConnecter.putExtra("EXTRA_ID", this.id);
            intentSeConnecter.putExtra("EXTRA_PASS", this.pass);
            startActivity(intentSeConnecter);
        }
    }
}
