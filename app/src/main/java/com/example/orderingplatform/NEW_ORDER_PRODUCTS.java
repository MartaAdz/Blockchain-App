package com.example.orderingplatform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class NEW_ORDER_PRODUCTS extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    EditText quantity_textfield;
    Button checkout_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new__order__products);

        Spinner product_list_dropdown = findViewById(R.id.product_list_dropdown);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.products, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        product_list_dropdown.setAdapter(adapter);
        product_list_dropdown.setOnItemSelectedListener(this);

        Button add_product_button = (Button) findViewById(R.id.add_product_button);
        add_product_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });

        checkout_button = (Button) findViewById(R.id.checkout_button);
        checkout_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_new_order_customer_details();
            }
        });

    }

    public void open_new_order_customer_details() {
        Intent open_new_order_customer_details = new Intent(this, NEW_ORDER_CUSTOMER_DETAILS.class);
        startActivity(open_new_order_customer_details);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
