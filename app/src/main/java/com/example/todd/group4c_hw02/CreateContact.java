package com.example.todd.group4c_hw02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
/**
 * Team: 4C
 * Assignment: HW02
 * Filename: CreateContact.java
 * @author: Todd McCorkle, Deepak Rohan Sekar, Lori Quievryn
 */
public class CreateContact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_contact);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.app_icon);
        actionBar.setTitle(R.string.create_contact);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        Button buttonCancel = (Button) findViewById(R.id.buttonCancelConact);
        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("A", "Closing the event");
                finish();
            }
        });
    }//end onCreate


}//end CreateContact

