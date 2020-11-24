package com.ramiro.ernesto.nicestart;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;


/**
 * Created by ernesto on 29/01/16.
 *
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
                .load(R.drawable.mforest)
                .centerCrop()
                .transition(DrawableTransitionOptions.withCrossFade(500))
                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.light_purple_button)))
//                .circleCrop()
//                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(mForest);


//        "https://images.unsplash.com/photo-1565214975484-3cfa9e56f914?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1482&q=80"


//        // sets a Pretty Custom Font
//        Typeface myFont = Typeface.createFromAsset(getAssets(), "bromello.otf");
//        myTitle.setTypeface(myFont);

//        Typeface typeface = getResources().getFont(R.font.bromello);
//        myTitle.setTypeface(typeface);


        //implements and starts animation
        TextView mySubtitle = (TextView) findViewById(R.id.textView4);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.fadein);
        mySubtitle.startAnimation(myanim);

        openApp(true);
    }


//    new method

    private void openApp(boolean locationPermission) {

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen
                        .this, LoginActivity.class);
                startActivity(intent);
            }
        }, 5000);


    }

}


//        old method

//        Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent intent = new Intent(SplashScreen
//                        .this, LoginActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        }, 5000);
