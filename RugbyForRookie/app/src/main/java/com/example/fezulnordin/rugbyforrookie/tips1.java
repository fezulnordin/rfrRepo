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
public class tips1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



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