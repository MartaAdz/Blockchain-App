package com.example.orderingplatform;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.orderingplatform.Model.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class SIGNIN extends AppCompatActivity {

    EditText textfield_password, textfield_username;
    Button button_SignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        textfield_password = (EditText)findViewById(R.id.textfield_password);
        textfield_username = (EditText)findViewById(R.id.textfield_username);
        button_SignIn = (Button)findViewById(R.id.button_SignIn);

        //Initialising Firebase
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference table_user = database.getReference("User");

        button_SignIn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                final ProgressDialog mDialog = new ProgressDialog(SIGNIN.this);
                mDialog.setMessage("Waiting...");
                mDialog.show();

                table_user.addValueEventListener(new ValueEventListener() {

                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        //checking if user exists in database
                        if(dataSnapshot.child(textfield_username.getText().toString()).exists()) {
                            // loging in
                            mDialog.dismiss();
                            User user = dataSnapshot.child(textfield_username.getText().toString()).getValue(User.class);

                            if (user.getPassword().equals(textfield_password.getText().toString())) {

                                Toast.makeText(SIGNIN.this, "Success!", Toast.LENGTH_SHORT).show();

                                open_main_activity();

                            } else {
                                Toast.makeText(SIGNIN.this, "Sign In failed!", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            mDialog.dismiss();
                            Toast.makeText(SIGNIN.this, "Wrong username", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }

        });

        }
    public void open_main_activity() {
        Intent open_main_activity = new Intent(this, MainActivity.class);
        startActivity(open_main_activity);
    }
}
