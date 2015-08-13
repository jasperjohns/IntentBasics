package com.pluralsight;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by IntelliJ IDEA.
 * User: Jim
 * Date: 9/6/11
 * Time: 2:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class AirplaneModeReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        boolean modeIsOn = intent.getBooleanExtra("state", false);
        Log.i("AirplaneModeReceiver", "Mode is " +(modeIsOn ? "on" : "off"));
    }
}
