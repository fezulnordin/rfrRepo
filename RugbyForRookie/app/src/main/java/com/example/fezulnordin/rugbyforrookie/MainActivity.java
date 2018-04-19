package com.example.fezulnordin.rugbyforrookie;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface myTypeface1 = Typeface.createFromAsset(getAssets(),"AvenirNextLTPro-Bold.ttf");
        TextView myTextView1 = (TextView) findViewById(R.id.textView1);
        myTextView1.setTypeface(myTypeface1);

        Typeface myTypeface2 = Typeface.createFromAsset(getAssets(),"AvenirNextLTPro-Bold.ttf");
        TextView myTextView2 = (TextView)findViewById(R.id.textView2);
        myTextView2.setTypeface(myTypeface2);

        Typeface myTypeface3 = Typeface.createFromAsset(getAssets(),"AvenirNextLTPro-Bold.ttf");
        TextView myTextView3 = (TextView)findViewById(R.id.textView3);
        myTextView3.setTypeface(myTypeface3);

        Typeface myTypeface4 = Typeface.createFromAsset(getAssets(),"AvenirNextLTPro-Bold.ttf");
        TextView myTextView4 = (TextView)findViewById(R.id.textView4);
        myTextView4.setTypeface(myTypeface4);

        Typeface myTypeface5 = Typeface.createFromAsset(getAssets(),"AvenirNextLTPro-Bold.ttf");
        TextView myTextView5 = (TextView)findViewById(R.id.textView5);
        myTextView5.setTypeface(myTypeface5);




    }


    public void switcher(View view) {
        Intent intent = new Intent(MainActivity.this,rules.class);
        startActivity(intent);
    }

    public void switcher1(View view) {
        Intent intent = new Intent(MainActivity.this,tutorialSubMenu.class);
        startActivity(intent);
    }
    public void switcher2(View view) {
        Intent intent = new Intent(MainActivity.this,tips1.class);
        startActivity(intent);
    }

    public void switcher3(View view) {
        Intent intent = new Intent(MainActivity.this,about.class);
        startActivity(intent);
    }
}
