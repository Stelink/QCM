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
        Intent intentAccueil = new Intent(CreationDeCompte.this, MainActivity.class);
        id = this.editID.getText().toString();
        pass = this.editPass.getText().toString();

        intentAccueil.putExtra("EXTRA_ID", id);
        intentAccueil.putExtra("EXTRA_PASS", pass);


        String s3 = "Clique sur la création !";
        Toast t = Toast.makeText(getApplicationContext(),s3, Toast.LENGTH_SHORT);
        t.show();
        startActivity(intentAccueil);
    }
}
