/**
 * Team: 4C
 * Assignment: HW02
 * Filename: MainActivity.java
 * @author: Todd McCorkle, Deepak Rohan Sekar, Lori Quievryn
 */
package com.example.todd.group4c_hw02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.app_icon);
        actionBar.setTitle(R.string.edit_contacts);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        Button buttonContact = (Button) findViewById(R.id.buttonCreateContact);
        buttonContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CreateContact.class);

                startActivity(i);

            }
        });




    }//end onCreate
}//end main
