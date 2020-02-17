package com.example.qcm;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;

public class Resultat extends Activity {
    private ProgressBar progress;
    private RatingBar rating;
    private TextView score;
    private int resultat;
    private int scoreInt;
    private ImageView gif;
    private SoundPool soundPool;
    private AudioManager audioManager;
    // Maximumn sound stream.
    private static final int MAX_STREAMS = 5;
    // Stream type.
    private static final int streamType = AudioManager.STREAM_MUSIC;
    private boolean loaded;
    private int sound;
    private float volume;

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
        this.progress.setProgress(100);
        this.scoreInt = intentProgress.getIntExtra("EXTRA_SCORE", 0);
        resultat();
        this.gif = findViewById(R.id.imageView);
        Glide.with(this).load(R.drawable.waw).into(gif);
    }

    public void resultat(){
        this.rating.setNumStars(5);
        this.rating.setRating(this.scoreInt);
        this.score.setText(this.score.getText().toString() + " " + this.scoreInt + "/5");
    }
}
