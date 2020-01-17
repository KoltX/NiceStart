package com.ramiro.ernesto.nicestart;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

/**
 * Created by ernesto on 29/01/16.
 * @version 0.1
 */

public class SplashScreen extends Activity {
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        TextView myTitle = (TextView)findViewById(R.id.textView3);
        TextView mySubtitle = (TextView)findViewById(R.id.textView4);
        ImageView myImage = (ImageView)findViewById(R.id.imageView);

        ImageView mForest = (ImageView) findViewById(R.id.backforest);


        Glide.with(this)
                .load(R.drawable.mforests)
                .apply(new RequestOptions()
//                        .override(50, 50)
                        .centerCrop()
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                )
                .into(mForest);


//        Glide.with(this)
//                .load(R.drawable.mforests)
//                .centerCrop()
//                .placeholder(R.drawable.mforests)
//                .into(mForest);
//
//        return mForest;
//    }

//        // sets a Pretty Custom Font
//        Typeface myFont = Typeface.createFromAsset(getAssets(), "bromello.otf");
//        myTitle.setTypeface(myFont);

//        Typeface typeface = getResources().getFont(R.font.bromello);
//        myTitle.setTypeface(typeface);

        //implements and starts animation
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.fadein);

        mySubtitle.startAnimation(myanim);
        openApp(true);
    }


    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen
                        .this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }

}
