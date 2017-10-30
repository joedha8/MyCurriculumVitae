package com.gmail.yudhapratama539.mycurriculumvitae;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by kikiosha on 10/30/17.
 */

public class ImageAdapter extends BaseAdapter {
    private Context context;

    public ImageAdapter(Context context) {
        this.context = context;
    }

    public static Integer[] mThumbIds={
            R.drawable.cosplay1,
            R.drawable.cosplay2,
            R.drawable.cosplay3
    };

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView;
        if (view==null){
            imageView=new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(340, 340));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView=(ImageView) view;
        }
        imageView.setImageResource(mThumbIds[i]);

        return imageView;
    }
}
