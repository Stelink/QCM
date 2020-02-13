package com.example.qcm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //========Variable Main========
    public static String id;
    public static String pass;
    private ImageView zelda;
    private EditText editID;
    private EditText editPass;
    private Button connexion;
    private Button creationCompte;
    //========Variable Creation De Compte====



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.id = "";
        this.pass = "";
        this.zelda = findViewById(R.id.zelda);
        this.editID = findViewById(R.id.editID);
        this.editPass = findViewById(R.id.editPass);
        this.connexion = findViewById(R.id.connexion);

    }

    public void onClickSeConnecter(View vue){
        this.zelda.setImageResource(R.drawable.zelda);
        this.pass = this.editPass.getText().toString();
        this.id = this.editID.getText().toString();

        Intent intentPQ = new Intent(MainActivity.this, PremiereQuestionActivity.class);
        startActivity(intentPQ);
    }

    public void onClickCreationDeCompte(View vue){
        Intent intentCreation = new Intent(MainActivity.this, CreationDeCompte.class);
        String s3 = "Clique sur la demande de création !";
        Toast t = Toast.makeText(getApplicationContext(),s3, Toast.LENGTH_SHORT);
        t.show();
        startActivity(intentCreation);
    }

}