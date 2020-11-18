package com.ramiro.ernesto.nicestart;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;


public class Main2Activity extends AppCompatActivity {

    private ImageView ivImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ivImg = (ImageView) findViewById(R.id.imageView2);


        Glide.with(this)
                .load("https://images.unsplash.com/photo-1565214975484-3cfa9e56f914?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1482&q=80")
//                .apply(new RequestOptions()
//                     .centerCrop()
                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.colorAccent)))
                .transition(DrawableTransitionOptions.withCrossFade(1000))
//                )
                .into(ivImg);

//"https://images.unsplash.com/photo-1565214975484-3cfa9e56f914?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1482&q=80"

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
