package com.example.sunshine;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    public boolean testing = false;
    public boolean onCreate = false;
    public boolean onResumse = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onCreate = true;
    }

    @Override
    protected void onResume() {
        super.onResume();
        onResumse = true;
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        testing = true;
    }

    @Override
    protected void onPause() {
        super.onPause();
        testing = false;
        onCreate = false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    boolean isVisible(){
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
