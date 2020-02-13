package com.example.qcm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

class CreationDeCompte extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            setContentView(R.layout.activity_creation_compte);

    }

    public void onClickCreation(View vue){
        Intent intentAccueil = new Intent(CreationDeCompte.this, MainActivity.class);
        String s3 = "Clique sur la création !";
        Toast t = Toast.makeText(getApplicationContext(),s3, Toast.LENGTH_SHORT);
        t.show();
        startActivity(intentAccueil);
    }
}
