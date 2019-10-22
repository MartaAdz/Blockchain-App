package com.example.orderingplatform;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewManager;
import android.widget.Button;

public class TRACK_ORDER_NUMBER extends AppCompatActivity {

    private Button track_order_number_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track__order__number);

        track_order_number_button = (Button) findViewById(R.id.track_order_number_button);
        track_order_number_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_order_tracking();
            }
        });
    }

    public void open_order_tracking() {
        Intent open_order_tracking = new Intent(this, ORDER_TRACKING.class);
        startActivity(open_order_tracking);
    }
}
