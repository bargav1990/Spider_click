package com.example.bargav.spider_click;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.renderscript.Type;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends Activity {
    int num=0;
    @Override
   protected void onCreate(Bundle savedInstanceState) {

       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       final ImageButton ibtn=(ImageButton)findViewById(R.id.ibtn);
       final TextView text=(TextView)findViewById(R.id.text);
       Typeface type= Typeface.createFromAsset(getAssets(), "GOTHAM-LIGHT.TTF");
       text.setTypeface(type);
       ibtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               num++;
               text.setText(num + "");



           }
       });

   }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
