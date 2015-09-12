package com.example.todd.group4c_hw02;

/**
 * Team: 4C
 * Assignment: HW02
 * Filename: MainActivity.java
 * @author: Todd McCorkle, Deepak Rohan Sekar, Lori Quievryn
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    Button buttonCreateContact;
    Button buttonEditContact;
    Button buttonDisplayContact;
    Button buttonDeleteContact;
    Button buttonFinish;

    //Pass Result Codes


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList <Contact> arrContacts = new ArrayList<Contact>();
        arrContacts.add(new Contact("Alvin Arka", "1234567890", "aarka@gmail.com"));
        arrContacts.add(new Contact("Betty Boop", "2345678901", "bboop@gmail.com"));
        arrContacts.add(new Contact("Carl Capps", "", "ccapps@gmail.com"));
        arrContacts.add(new Contact("Dana Devon", "1234567890", ""));
        arrContacts.add(new Contact("Evan Egger", "", ""));

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.app_icon);
        actionBar.setTitle(R.string.edit_contacts);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        //Button Intializations
        buttonCreateContact = (Button) findViewById(R.id.buttonCreateContact);
        buttonDeleteContact = (Button) findViewById(R.id.buttonDeleteContact);
        buttonEditContact = (Button) findViewById(R.id.buttonEditContact);
        buttonDisplayContact = (Button) findViewById(R.id.buttonDisplayContact);
        buttonFinish = (Button) findViewById(R.id.buttonFinish);

        buttonCreateContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CreateContact.class);
                startActivity(i);

            }
        });


        buttonDisplayContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, DisplayContacts.class);
                startActivity(i);

            }
        });

        buttonEditContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, EditContact.class);
                startActivity(i);

            }
        });

        buttonDeleteContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, DeleteContact.class);
                startActivity(i);

            }
        });

        buttonFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }//end onCreate
}//end main
