package com.example.todd.group4c_hw02;

/**
 * Team: 4C
 * Assignment: HW02
 * Filename: Contact.java
 * @author: Todd McCorkle, Deepak Rohan Sekar, Lori Quievryn
 */

import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Contact {

    String name;
    String phone;
    String email;
    Drawable imageURL;
    Drawable imageDefault = drawableURL("https://moodle2.uncc.edu/mod/resource/view.php?id=1160699");

    public Drawable getImageURL() {
        return imageURL;
    }

    public void setImageURL(Drawable imageURL) {
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Contact(String name, String phone, String email) {
        setName(name);
        setPhone(phone);
        setEmail(email);
        setImageURL(imageDefault);
    }

    public Drawable drawableURL(String url) {
        try {
            return Drawable.createFromStream(((java.io.InputStream)
                    new URL(url).getContent()), "this doesn't matter");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean validateEmail(String email){
        int iAtSymbol = email.indexOf("@");
        int iPeriod = email.lastIndexOf(".");
        return (iAtSymbol == email.lastIndexOf("@)") && iPeriod > iAtSymbol ? true : false);
    }

    @Override
    public String toString(){
        return getName() + ":   ph " + getPhone() + "  e " + getEmail();
    }
}
