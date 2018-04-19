package com.example.fezulnordin.rugbyforrookie;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by fezulnordin on 12/3/2016.
 */
public class tutorialSubMenu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorialsubmenu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Typeface myTypeface1 = Typeface.createFromAsset(getAssets(),"AvenirNextLTPro-Bold.ttf");
        TextView myTextView1 = (TextView) findViewById(R.id.textView21);
        myTextView1.setTypeface(myTypeface1);

        Typeface myTypeface2 = Typeface.createFromAsset(getAssets(),"AvenirNextLTPro-Bold.ttf");
        TextView myTextView2 = (TextView) findViewById(R.id.textView22);
        myTextView2.setTypeface(myTypeface2);

        Typeface myTypeface3 = Typeface.createFromAsset(getAssets(),"AvenirNextLTPro-Bold.ttf");
        TextView myTextView3 = (TextView) findViewById(R.id.textView23);
        myTextView3.setTypeface(myTypeface3);

        Typeface myTypeface4 = Typeface.createFromAsset(getAssets(),"AvenirNextLTPro-Bold.ttf");
        TextView myTextView4 = (TextView) findViewById(R.id.textView24);
        myTextView4.setTypeface(myTypeface4);

        Typeface myTypeface5 = Typeface.createFromAsset(getAssets(),"AvenirNextLTPro-Bold.ttf");
        TextView myTextView5 = (TextView) findViewById(R.id.textView25);
        myTextView5.setTypeface(myTypeface5);

        Typeface myTypeface6 = Typeface.createFromAsset(getAssets(),"AvenirNextLTPro-Bold.ttf");
        TextView myTextView6 = (TextView) findViewById(R.id.textView26);
        myTextView6.setTypeface(myTypeface6);

        Typeface myTypeface7 = Typeface.createFromAsset(getAssets(),"AvenirNextLTPro-Bold.ttf");
        TextView myTextView7 = (TextView) findViewById(R.id.textView27);
        myTextView7.setTypeface(myTypeface7);

        Typeface myTypeface8 = Typeface.createFromAsset(getAssets(),"AvenirNextLTPro-Bold.ttf");
        TextView myTextView8 = (TextView) findViewById(R.id.textView28);
        myTextView8.setTypeface(myTypeface8);

        Typeface myTypeface9 = Typeface.createFromAsset(getAssets(),"AvenirNextLTPro-Bold.ttf");
        TextView myTextView9 = (TextView) findViewById(R.id.textView29);
        myTextView9.setTypeface(myTypeface9);




    }

    public void switcherTutor1(View view) {
        Intent intent = new Intent(tutorialSubMenu.this,tutor1.class);
        startActivity(intent);
    }
    public void switcherTutor2(View view) {
        Intent intent = new Intent(tutorialSubMenu.this,tutor2.class);
        startActivity(intent);
    }

    public void switcherTutor3(View view) {
        Intent intent = new Intent(tutorialSubMenu.this,tutor3.class);
        startActivity(intent);
    }

    public void switcherTutor4(View view) {
        Intent intent = new Intent(tutorialSubMenu.this,tutor4.class);
        startActivity(intent);
    }

    public void switcherTutor5(View view) {
        Intent intent = new Intent(tutorialSubMenu.this,tutor5.class);
        startActivity(intent);
    }

    public void switcherTutor6(View view) {
        Intent intent = new Intent(tutorialSubMenu.this,tutor5.class);
        startActivity(intent);
    }

    public void switcherTutor7(View view) {
        Intent intent = new Intent(tutorialSubMenu.this,tutor6.class);
        startActivity(intent);
    }

    public void switcherTutor8(View view) {
        Intent intent = new Intent(tutorialSubMenu.this,tutor7.class);
        startActivity(intent);
    }

    public void switcherTutor9(View view) {
        Intent intent = new Intent(tutorialSubMenu.this,tutor8.class);
        startActivity(intent);
    }


    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }


}