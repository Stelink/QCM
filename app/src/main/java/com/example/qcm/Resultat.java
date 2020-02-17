package com.example.qcm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import com.bumptech.glide.Glide;
import androidx.annotation.Nullable;

public class Resultat extends Activity {
    private ProgressBar progress;
    private RatingBar rating;
    private TextView score;
    private int resultat;
    private int scoreInt;
    private ImageView gif;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat);

        this.rating = findViewById(R.id.ratingBar);
        this.resultat = 0;
        this.progress = findViewById(R.id.progress);
        this.score = findViewById(R.id.score);
        Intent intentProgress = getIntent();
        int cent = intentProgress.getIntExtra("EXTRA_100", 0);
        this.progress.setProgress(this.progress.getProgress()+cent);
        this.scoreInt = intentProgress.getIntExtra("EXTRA_SCORE", 0);
        resultat();
        Toast t = Toast.makeText(getApplicationContext(), this.scoreInt+"", Toast.LENGTH_SHORT);
        t.show();
        this.gif = findViewById(R.id.imageView);
        Glide.with(this).load(R.drawable.waw).into(gif);
    }


    public void resultat(){
        this.rating.setNumStars(5);
        this.rating.setRating(this.scoreInt);
        this.score.setText(this.score.getText().toString() + " " + this.scoreInt + "/5");
    }
}
