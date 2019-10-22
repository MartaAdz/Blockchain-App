package com.example.orderingplatform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NEW_ORDER_CUSTOMER_DETAILS extends AppCompatActivity {

    Button review_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new__order__customer__details);


        review_button = (Button) findViewById(R.id.review_button);
        review_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_new_order_confirm();
            }
        });

    }

    public void open_new_order_confirm() {
        Intent open_new_order_confirm = new Intent(this, NEW_ORDER_CONFIRM.class);
        startActivity(open_new_order_confirm);
    }

}