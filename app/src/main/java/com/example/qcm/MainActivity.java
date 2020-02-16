package com.example.qcm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //========Variable Main========
    public static String id;
    public static String pass;
    private ImageView zelda;
    private Button connexion;
    //========Variable Creation De Compte====



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.id = "";
        this.pass = "";
        this.zelda = findViewById(R.id.zelda);
        this.connexion = findViewById(R.id.connexion);
        /*Intent intent = getIntent();
        this.id = intent.getStringExtra("EXTRA_ID");
        this.pass = intent.getStringExtra("EXTRA_PASS");

        Intent intentConnexion = new Intent(this, SeConnecter.class);
        intentConnexion.putExtra("EXTRA_ID", this.id);
        intentConnexion.putExtra("EXTRA_PASS", this.pass);*/
    }

    public void onClickSeConnecter(View vue){
        Intent intentSeCo = new Intent(MainActivity.this, SeConnecter.class);
        startActivity(intentSeCo);
    }

    public void onClickCreationDeCompte(View vue){
        Intent intentCreation = new Intent(MainActivity.this, CreationDeCompte.class);
        startActivity(intentCreation);
    }

}