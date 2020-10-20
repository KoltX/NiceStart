package com.ramiro.ernesto.nicestart;

import android.support.design.bottomappbar.BottomAppBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;



public class Main2Activity extends AppCompatActivity {

        private ImageView ivImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

                ivImg = (ImageView) findViewById(R.id.imageView2);


        Glide.with(this)
                .load(R.drawable.tenor)
//                .apply(new RequestOptions()
//                     .centerCrop()
//                )
                .into(ivImg);

//"http://wallpapers.ae/wp-content/uploads/2015/09/Maldives-sea-wallpaper.jpg"

//        BottomAppBar bar = (BottomAppBar) findViewById(R.id.bar);
//        setSupportActionBar(bar);
//
//        bar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Handle the navigation click by showing a BottomDrawer etc.
//            }
//        });

//        BottomAppBar bar = (BottomAppBar) findViewById(R.id.bar);
//
//        bar.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//                // Handle actions based on the menu item
//                return true;
//            }
//        });


    }
}
