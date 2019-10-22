package com.example.orderingplatform;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    private Button new_order_button;
    private Button track_order_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new_order_button = (Button) findViewById(R.id.new_order_button);
        new_order_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_new_order_products();
            }
        });

        track_order_button = (Button) findViewById(R.id.track_order_button);
        track_order_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_track_order_number();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void open_new_order_products() {
        Intent open_new_order_products = new Intent(this, NEW_ORDER_PRODUCTS.class);
        startActivity(open_new_order_products);
    }

    public void open_track_order_number() {
        Intent open_track_order_number = new Intent(this, TRACK_ORDER_NUMBER.class);
        startActivity(open_track_order_number);
    }

}
