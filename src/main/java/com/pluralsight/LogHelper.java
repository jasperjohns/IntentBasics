package com.pluralsight;

import android.util.Log;

/**
 * Created by IntelliJ IDEA.
 * User: Jim
 * Date: 9/6/11
 * Time: 1:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class LogHelper {
    public static void ProcessAndThreadId(String label){
        String logMessage = String.format("%s, Process ID:%d, Thread ID:%d", label, android.os.Process.myPid(), android.os.Process.myTid());
        Log.i("com.pluralsight", logMessage);
    }
}
