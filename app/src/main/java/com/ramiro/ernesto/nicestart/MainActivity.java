package com.ramiro.ernesto.nicestart;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SwipeRefreshLayout swipeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ivImg = (ImageView) findViewById(R.id.ivImg);
//
//        Glide.with(this)
//                .load("http://inthecheesefactory.com/uploads/source/glidepicasso/cover.jpg")
//                .into(ivImg);

//        cast a la vista a la que aplicamos un menu contextual y la registramos
        TextView mycontext = (TextView) findViewById(R.id.textView);
        registerForContextMenu(mycontext);

//       cast al Layout SwipeRefresh con el que rodeamos la vista en el xml y le colocamos un listener
        swipeLayout = (SwipeRefreshLayout) findViewById(R.id.myswipe);
        swipeLayout.setOnRefreshListener(mOnRefreshListener);

    }


    //    construimos el Swipe y aplicamos un Listener que lanza un SnackBar y desactiva a continuación del Swipe la animación
    protected SwipeRefreshLayout.OnRefreshListener mOnRefreshListener = new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {

//    opción TOAST
//
//          Toast toast0 = Toast.makeText(MainContextActivity.this, "going swipeREFRESH", Toast.LENGTH_LONG);
//          toast0.show();


//   opción SNACKBAR

            final RelativeLayout mrelativeLayout = (RelativeLayout) findViewById(R.id.activity_main_context);

            Snackbar snackbar = Snackbar
                    .make(mrelativeLayout, "fancy a Snack while you refresh?", Snackbar.LENGTH_LONG)
                    .setAction("UNDO", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Snackbar snackbar1 = Snackbar.make(mrelativeLayout, "Action is restored!", Snackbar.LENGTH_SHORT);
                            snackbar1.show();
                        }
                    });

            snackbar.show();
            swipeLayout.setRefreshing(false);

        }
    };

    //    inflamos el menu del AppBar con los items del recurso xml
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void showAlertDialogButtonClicked(MainActivity view) {

        // setup the alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);


        //el dialogo estandar tiene título/icono pero podemos sustituirlo por un XML a medida
//        builder.setTitle("Achtung!");
//        builder.setMessage("Where do you go?");
//        builder.setIcon(R.drawable.ic_action_name_dark);


        // un XML a medida para el diálogo
        builder.setView(getLayoutInflater().inflate(R.layout.dialog_view_scrim, null));

        // add the buttons
        builder.setPositiveButton("Glide", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // do something like...
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                            startActivity(intent);
                            dialog.dismiss();

            }
        });

        builder.setNegativeButton("ChatBot", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                // do something like...
                Intent intent = new Intent(MainActivity.this, MyWebView.class);
                startActivity(intent);

                dialog.dismiss();
            }
        });

        builder.setNeutralButton("MotionLayout", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                // do something like...
                Intent intent = new Intent(MainActivity.this, Motion.class);
                startActivity(intent);

                dialog.dismiss();
            }
        });

        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }




    //    creamos una lista de eventos para los items del menu del AppBar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            Toast toast = Toast.makeText(this, "going Settings", Toast.LENGTH_LONG);
            toast.show();
        } else if (id == R.id.camera) {

            showAlertDialogButtonClicked(MainActivity.this);

        }

        return super.onOptionsItemSelected(item);
    }

    //    inflamos el menu contextual con los items del menu xml correspondiente
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_context, menu);

    }

    //    creamos una lista de eventos para los items del menus contextual
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()) {
            case R.id.camera:
                Toast toast = Toast.makeText(this, "going CONTEXT CAMERA", Toast.LENGTH_LONG);
                toast.show();
                break;
            case R.id.action_settings:
                Toast toast2 = Toast.makeText(this, "going CONTEXT SETTINGS", Toast.LENGTH_LONG);
                toast2.show();
                break;
        }
        return super.onContextItemSelected(item);
    }


}
