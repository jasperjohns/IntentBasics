package com.pluralsight;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class MyActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Intent intent = getIntent();
        Log.i("MyActivity", "onCreate - " + intent.toString());

        String createTime =
                (new SimpleDateFormat("HH:mm:ss")).format(System.currentTimeMillis());
        TextView textView = (TextView) findViewById(R.id.mainTextView);
        textView.setText("Created:" + createTime);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater() ;
        inflater.inflate(R.menu.main_menu, menu) ;
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menuShowOtherActivity:
                showOtherActivity();
                break;
            case R.id.menuRunService:
                runService();
                break;
            case R.id.menuShowHelloWorld:
                showHelloWorld();
                break;
            case R.id.menuShowPSHomePage:
                showPSHomePage();
                break;
            case R.id.menuQuit:
                finish();
                break;
            default:
                super.onOptionsItemSelected(item);
                break;
        }

        return true;
    }

    public void showOtherActivity()
    {
        Intent showOtherActivityIntent = new Intent(this, OtherActivity.class);
        startActivity(showOtherActivityIntent);
    }

    public   void runService(){
//        Intent startServiceIntent = new Intent(this, MyService.class);
        Intent startServiceIntent = new Intent("com.pluralsight.action.LOG_TIME");
        startService(startServiceIntent);
    }

    public void showHelloWorld(){
        Intent intent = new Intent("com.pluralsight.action.HELLO_WORLD");
        startActivity(intent);
    }

    public void showPSHomePage(){
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri uri = Uri.parse("http://www.pluralsight-training.net");
        intent.setData(uri);
        startActivity(intent);

    }

    @Override
    protected void onNewIntent(Intent intent) {
        Log.i("MyActivity", "onNewIntent - " + intent.toString());
    }
}
