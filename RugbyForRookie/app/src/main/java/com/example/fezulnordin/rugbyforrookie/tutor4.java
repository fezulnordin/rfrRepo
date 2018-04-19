package com.example.fezulnordin.rugbyforrookie;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;
import android.widget.ImageButton;
import android.widget.Toast;


/**
 * Created by fezulnordin on 12/3/2016.
 */
public class tutor4 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutor4);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(findViewById(R.id.videoView));
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.tryy));
        mediaController.setPadding(0, 0, 0, 0);

        videoView.setMediaController(mediaController);


        videoView.requestFocus();
        videoView.start();

        Typeface myTypeface1 = Typeface.createFromAsset(getAssets(),"AvenirNextLTPro-Bold.ttf");
        TextView myTextView1 = (TextView) findViewById(R.id.textView1);
        myTextView1.setTypeface(myTypeface1);

    }


    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

}