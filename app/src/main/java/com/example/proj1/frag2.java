package com.example.proj1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class frag2 extends Fragment {

    //YouTubePlayerView ytb;
    YouTubePlayer player;
    YouTubePlayer.OnInitializedListener oninit;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.frag2, container, false);


        View.OnClickListener listnr=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getContext(),YoutubePage.class);
                startActivity(i);
            }
        };

        ImageView im =(ImageView) v.findViewById(R.id.im2);
        im.setOnClickListener(listnr);

        return v;

    }

}

