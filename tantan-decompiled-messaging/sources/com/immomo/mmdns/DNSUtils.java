package com.immomo.mmdns;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.cosmos.mdlog.MDLog;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class DNSUtils {
    public static String getCurrentProcessName(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return null;
        }
        int iMyPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        try {
            runningAppProcesses = activityManager.getRunningAppProcesses();
        } catch (Exception e) {
            MDLog.printErrStackTrace(LogTag.DNS, e);
            runningAppProcesses = null;
        }
        if (runningAppProcesses == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    public static boolean isIPHost(String str) {
        return Pattern.compile("(?:(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))\\.){3}(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))").matcher(str).matches();
    }
}
