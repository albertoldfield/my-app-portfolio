package com.betterideafactory.udacity.appportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class ApplicationLauncher extends ActionBarActivity {

    private Toast toastLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_launcher);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_application_launcher, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void launchApplication(View view) {

        StringBuilder toastText = new StringBuilder();
        toastText.append("Launching application ");
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Button button = (Button) view;
        toastText.append(button.getText());

        if (toastLauncher != null) {
            toastLauncher.cancel();
        }

        toastLauncher = Toast.makeText(context, toastText, duration);
        toastLauncher.show();
    }
}
