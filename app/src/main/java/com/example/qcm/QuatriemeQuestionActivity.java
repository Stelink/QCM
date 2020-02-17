package com.example.qcm;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;

public class QuatriemeQuestionActivity extends Activity {
    private boolean bool;
    private ProgressBar progress;
    private int score;
    private ListView mListView;
    private String[] prenoms = new String[]{
            "Stéphane", "Jean-François", "Eric", "Amry (Je connais pas son prénom)"
    };
    private int tmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quatrieme_question);
        this.progress = findViewById(R.id.progress);

        Intent intentProgress = getIntent();
        int cent = intentProgress.getIntExtra("EXTRA_100", 0);
        this.tmp = cent;
        this.score = intentProgress.getIntExtra("EXTRA_SCORE", 0);
        this.progress.setProgress(60);

        this.mListView = findViewById(R.id.listView);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, prenoms);
        mListView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        this.mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast t = Toast.makeText(getApplicationContext(), prenoms[position] + " sélectionné(e) !", Toast.LENGTH_SHORT);
                t.show();
                if(id == 3){
                    score += 1;
                }
            }
        });
    }

    public void onClickValider(View vue){
        Intent intent = new Intent(this, CinquiemeQuestionActivity.class);
        intent.putExtra("EXTRA_100", progress.getProgress() + 100 / 5);
        intent.putExtra("EXTRA_SCORE", score);
        startActivity(intent);
    }

    public void onClickAnnuler(View vue){
        Intent intent = new Intent(this, TroisiemeQuestionActivity.class);
        this.progress.setProgress(this.progress.getProgress()-100/5);
        this.score -= 1;
        startActivity(intent);
    }
}
