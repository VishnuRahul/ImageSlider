package com.img.example.app.imageslider;

import android.content.Context;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Ashwin on 4/21/2016.
 */
public class CustomSlider extends PagerAdapter {

    private int[] img_res = {
            R.drawable.one,  R.drawable.two,  R.drawable.three,  R.drawable.four,  R.drawable.five
    };
    private Context ctx;
    private LayoutInflater layoutInflater;

    public CustomSlider(Context ctx)
    {
       this.ctx=ctx;
    }



    @Override
    public int getCount() {
        return img_res.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater=(LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.swipe_layout,container,false);
        ImageView imageView= (ImageView)item_view.findViewById(R.id.img_view);
        TextView textView = (TextView) item_view.findViewById(R.id.img_count);
        imageView.setImageResource(img_res[position]);
        textView.setText("Image : " + position);
        container.addView(item_view);
        return item_view;


    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
