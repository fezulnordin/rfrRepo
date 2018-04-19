package com.example.fezulnordin.rugbyforrookie;

import android.graphics.Typeface;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by fezulnordin on 12/3/2016.
 */
public class rules extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Typeface myTypeface = Typeface.createFromAsset(getAssets(),"AvenirNextLTPro-Bold.ttf");
        TextView myTextView = (TextView) findViewById(R.id.time);
        myTextView.setTypeface(myTypeface);

        Typeface myTypeface1 = Typeface.createFromAsset(getAssets(),"AvenirNextLTPro-Bold.ttf");
        TextView myTextView1 = (TextView) findViewById(R.id.Player);
        myTextView1.setTypeface(myTypeface1);

        Typeface myTypeface2 = Typeface.createFromAsset(getAssets(),"AvenirNextLTPro-Bold.ttf");
        TextView myTextView2 = (TextView) findViewById(R.id.Official);
        myTextView2.setTypeface(myTypeface2);

        Typeface myTypeface3 = Typeface.createFromAsset(getAssets(),"AvenirNextLTPro-Bold.ttf");
        TextView myTextView3 = (TextView) findViewById(R.id.boots);
        myTextView3.setTypeface(myTypeface3);

        Typeface myTypeface4 = Typeface.createFromAsset(getAssets(),"AvenirNextLTPro-Bold.ttf");
        TextView myTextView4 = (TextView) findViewById(R.id.ball);
        myTextView4.setTypeface(myTypeface4);

        Typeface myTypeface5 = Typeface.createFromAsset(getAssets(),"AvenirNextLTPro-Bold.ttf");
        TextView myTextView5 = (TextView) findViewById(R.id.pitch);
        myTextView5.setTypeface(myTypeface5);

        Typeface myTypeface6 = Typeface.createFromAsset(getAssets(),"AvenirNextLTPro-Bold.ttf");
        TextView myTextView6 = (TextView) findViewById(R.id.jersey);
        myTextView6.setTypeface(myTypeface6);

    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}