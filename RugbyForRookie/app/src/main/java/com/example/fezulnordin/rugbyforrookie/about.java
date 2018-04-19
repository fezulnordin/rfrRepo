package com.example.fezulnordin.rugbyforrookie;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

/**
 * Created by fezulnordin on 12/3/2016.
 */
public class about extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Typeface myTypeface9 = Typeface.createFromAsset(getAssets(),"AvenirNextLTPro-Bold.ttf");
        TextView myTextView9 = (TextView) findViewById(R.id.textView6);
        myTextView9.setTypeface(myTypeface9);

    }


    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;

    }


}