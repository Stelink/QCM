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
    private Button creationCompte;
    //========Variable Creation De Compte====



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try{
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            this.id = "";
            this.pass = "";
            this.zelda = findViewById(R.id.zelda);
            this.connexion = findViewById(R.id.connexion);
        }catch(Exception e){
        }
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