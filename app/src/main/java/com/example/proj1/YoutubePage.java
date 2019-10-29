package com.example.proj1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerFragment;
import com.google.android.youtube.player.YouTubePlayerView;


import com.google.android.youtube.player.YouTubeBaseActivity;

public class YoutubePage extends YouTubeBaseActivity {


    YouTubePlayerView ytb;
    YouTubePlayer player;


    YouTubePlayer.OnInitializedListener oninit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_page);

        ytb=(YouTubePlayerView) findViewById(R.id.youPlayer);

        oninit=new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

                player=youTubePlayer;
                if(!b)
                {
                    player.cueVideo("JFcgOboQZ08");///yahan wo v= wala cheez dalni hai
                }
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        ytb.initialize(ApiConfig.API_KEY,oninit);


    }


}
