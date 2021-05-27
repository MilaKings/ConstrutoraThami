package com.construtora.construtorathami;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

class YoutubeActivity extends AppCompatActivity {

    Button botaoPlayYoutube;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);

        botaoPlayYoutube = (Button) findViewById(R.id.botaoPlay);
        botaoPlayYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(YoutubeActivity.this, VideoPlayer.class));

            }
        });
    }

}
