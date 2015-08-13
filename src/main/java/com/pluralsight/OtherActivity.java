package com.pluralsight;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by IntelliJ IDEA.
 * User: Jim
 * Date: 8/25/11
 * Time: 11:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class OtherActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other);

        Log.i("OtherActivity", "onCreate");

    }



}