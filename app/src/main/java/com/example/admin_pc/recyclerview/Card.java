package com.example.admin_pc.recyclerview;

import android.content.Intent;

import static android.support.v4.content.ContextCompat.startActivity;

/**
 * Created by ADMIN-PC on 3/8/2018.
 */

public class Card
{
    private int id;
    private String pname;
    private String pdescription;

    public Card(int id, String pname, String pdescription) {
        this.id = id;
        this.pname = pname;
        this.pdescription = pdescription;
    }

    /*public void redirection()
    {
        Intent  i = new Intent( Card.this , projectScreen.class );
        startActivity(i);
    }*/

    public int getId() {
        return id;
    }

    public String getPname() {
        return pname;
    }

    public String getPdescription() {
        return pdescription;
    }
}

