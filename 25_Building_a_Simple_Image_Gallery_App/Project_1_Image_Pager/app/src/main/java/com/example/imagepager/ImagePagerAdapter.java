package com.example.imagepager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class ImagePagerAdapter extends PagerAdapter {
    int[] images;

    Context context;

    LayoutInflater inflater;

    public ImagePagerAdapter(Context context, int[] images) {

        this.context = context;
        this.images = images;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView image;

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.pager_item, container, false);

        //get reference to imageView in pager_item layout
        image = itemView.findViewById(R.id.imageView);

        //Set an image to the imageView
        image.setImageResource(images[position]);

        //Add pager_item layout as the current page to the ViewPager
        ((ViewPager) container).addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        //Remove pager_item layout from ViewPager
        container.removeView((RelativeLayout) object);
    }
}