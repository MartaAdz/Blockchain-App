package com.example.orderingplatform;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NEW_ORDER_CONFIRM extends AppCompatActivity {

    private Button confirm_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new__order__confirm);

        confirm_button = (Button) findViewById(R.id.confirm_button);

        confirm_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder confirmation_alert = new AlertDialog.Builder(NEW_ORDER_CONFIRM.this);
                confirmation_alert.setMessage("You have placed your order!");
                confirmation_alert.setPositiveButton("Yay!", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                open_main_page();
                            }
                        });
                AlertDialog alertDialog = confirmation_alert.create();
                alertDialog.show();
            }
            public void open_main_page() {
                Intent open_main_page = new Intent(NEW_ORDER_CONFIRM.this, MainActivity.class);
                startActivity(open_main_page);
            }
        });
    }
}
