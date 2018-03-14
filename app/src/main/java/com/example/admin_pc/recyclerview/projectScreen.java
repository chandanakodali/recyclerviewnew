package com.example.admin_pc.recyclerview;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class projectScreen extends AppCompatActivity {

    private static final String TAG;

    static {
        TAG = "MyActivity";
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_screen);
         Log.i(TAG, "onCreate: started");

         getIncomingIntent();;
    }

    private void getIncomingIntent(){
        if(getIntent().hasExtra("project-name") && getIntent().hasExtra("project-description")) {
            String pname = getIntent().getStringExtra("project-name");
            String pdesc = getIntent().getStringExtra("project-description");

            setIntent(pname, pdesc);
        }
    }

    private void setIntent(String pname, String pdesc) {
        TextView name = (TextView) findViewById(R.id.project_name);
        TextView description = (TextView) findViewById(R.id.project_description);
        name.setText(pname);
        description.setText(pdesc);
    }
}
