package com.example.fezulnordin.rugbyforrookie;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by fezulnordin on 12/5/2016.
 */

public class customSwipeAdapter extends PagerAdapter {

    private int[] image_src = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d};
    private Context ctx;
    private LayoutInflater LayoutInflater;

    public customSwipeAdapter(Context ctx) {

        this.ctx = ctx;
    }


    @Override
    public int getCount() {
        return image_src.length;
    }


    @Override
    public boolean isViewFromObject(View view, Object o) {
        return (view == (LinearLayout)o);
    }


    public Object instantiateItem(ViewGroup container, int position) {

        LayoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = LayoutInflater.inflate(R.layout.swipe_layout, container, false);
        ImageView imageView = (ImageView) item_view.findViewById(R.id.imagetest);
        TextView textView = (TextView) item_view.findViewById(R.id.texttest);
        imageView.setImageResource(image_src[position]);
        textView.setText("Image : " + position);
        container.addView(item_view);


        return item_view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}
