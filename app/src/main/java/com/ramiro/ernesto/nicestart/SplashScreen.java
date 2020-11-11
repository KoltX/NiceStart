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
import com.bumptech.glide.request.target.Target;

/**
 * Created by ernesto on 29/01/16.
 * @version 0.1
 */

public class SplashScreen extends Activity {
//    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

//        TextView myTitle = (TextView)findViewById(R.id.textView3);
//        myTitle.setBackgroundColor(getResources().getColor(R.color.background_purple));

//        ImageView myImage = (ImageView)findViewById(R.id.imageView);


        ImageView mForest = findViewById(R.id.backforest);

//    New Glide
        Glide.with(this)
                .load(R.drawable.mforests)
                .apply(new RequestOptions()
//                        .override(50, 50)
                        .centerCrop()
//                        .circleCrop()
//                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                )
                .into(mForest);




////        Glide
//        Glide.with(this)
//                .load(R.drawable.mforests)
//
////                .override(Target.SIZE_ORIGINAL, Target.SIZE_ORIGINAL)
////                .centerCrop()
////                .circleCrop()
//                .into(mForest)
//                ;



//        // sets a Pretty Custom Font
//        Typeface myFont = Typeface.createFromAsset(getAssets(), "bromello.otf");
//        myTitle.setTypeface(myFont);

//        Typeface typeface = getResources().getFont(R.font.bromello);
//        myTitle.setTypeface(typeface);


        //implements and starts animation
        TextView mySubtitle = (TextView)findViewById(R.id.textView4);
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
