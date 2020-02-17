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
    private EditText editPass;
    private EditText editID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.id = "";
        this.pass = "";
        this.zelda = findViewById(R.id.zelda);
        this.editPass = findViewById(R.id.editPass);
        this.editID = findViewById(R.id.editID);

        Intent intentGetID = getIntent();

        this.id = intentGetID.getStringExtra("EXTRA_ID");
        this.pass = intentGetID.getStringExtra("EXTRA_PASS");
    }

    public void onClickSeConnecter(View vue){
        Intent intentPQ = new Intent(this, PremiereQuestionActivity.class);

        if(this.editID.getText().toString().equals(this.id) && this.editPass.getText().toString().equals(this.pass))
            startActivity(intentPQ);
        else{
            String toast = "Identifiants incorrects, vérifiez-les ou créez-vous un compte";
            Toast t = Toast.makeText(getApplicationContext(),toast, Toast.LENGTH_SHORT);
            t.show();
        }
    }

    public void onClickCreationDeCompte(View vue){
        Intent intentCreation = new Intent(MainActivity.this, CreationDeCompte.class);
        startActivity(intentCreation);
    }

}