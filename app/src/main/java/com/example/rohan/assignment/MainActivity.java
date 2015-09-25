package com.example.rohan.assignment;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements OnClickListener {

    private final String TAG = "ANDROID";

    TextView  tv;
    Button clearbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Identifying the view Components
        tv = (TextView)findViewById(R.id.textView);
        clearbtn = (Button)findViewById(R.id.clear);
        // Setting the appropriate properties
        tv.setText("onCreate\n");
        clearbtn.setOnClickListener(this);

        Log.i(TAG, "onCreate");
    }

    @Override
    protected void onStart(){
    super.onStart();
        Log.i(TAG,"onStart");
        tv.append("onStart\n");

    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG,"onRestart");
        tv.append("onRestart\n");

    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG,"onResume");
        tv.append("onResume\n");

    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG,"onPause");
        tv.append("onPause\n");

    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG,"onStop");
        tv.append("onStop\n");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG,"onDestroy");
        tv.append("onDestroy\n");
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG,"onRestoreInstanceState");
        tv.append("onRestoreInstanceState\n");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG,"onSaveInstanceState");
        tv.append("onSaveInstanceState\n");
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

    @Override
    public void onClick(View v) {
        tv.setText("");

    }

}
