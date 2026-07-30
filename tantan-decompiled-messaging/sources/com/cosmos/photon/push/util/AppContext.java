package com.cosmos.photon.push.util;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.cosmos.photon.push.PushMessageReceiver;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.meituan.robust.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;
import p149l.mc90;

/* JADX INFO: loaded from: classes.dex */
public class AppContext {
    public static boolean DEBUGGABLE;
    private static String appId;
    private static PushMessageReceiver messageReceiver;
    private static ContentResolver sContentResolver;
    public static Context sContext;
    private static String sPackageName;
    private static String userAgent;

    public static void closeAllQuietly(Closeable... closeableArr) {
        if (closeableArr == null) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    public static void closeQuietly(Closeable closeable) {
        closeAllQuietly(closeable);
    }

    public static String getAppId() {
        return appId;
    }

    public static String getAppSHA1() throws Exception {
        byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(sContext.getPackageManager().getPackageInfo(sContext.getPackageName(), 64).signatures[0].toByteArray());
        StringBuilder sb = new StringBuilder();
        for (byte b : bArrDigest) {
            String upperCase = Integer.toHexString(b & 255).toUpperCase(Locale.US);
            if (upperCase.length() == 1) {
                sb.append("0");
            }
            sb.append(upperCase);
            sb.append(":");
        }
        String string = sb.toString();
        return string.substring(0, string.length() - 1);
    }

    public static ContentResolver getContentResolver() {
        if (sContentResolver == null) {
            sContentResolver = getContext().getContentResolver();
        }
        return sContentResolver;
    }

    public static Context getContext() {
        return sContext;
    }

    public static String getCurrentProcessName() {
        return mc90.m153989a(sContext);
    }

    public static PushMessageReceiver getMessageReceiver() {
        return messageReceiver;
    }

    public static String getPackageName() {
        Context context = sContext;
        if (context == null) {
            return null;
        }
        if (sPackageName == null) {
            String packageName = context.getPackageName();
            sPackageName = packageName;
            if (packageName.indexOf(":") >= 0) {
                String str = sPackageName;
                sPackageName = str.substring(0, str.lastIndexOf(":"));
            }
        }
        return sPackageName;
    }

    public static String getSystemCountry() {
        return Locale.getDefault().getCountry();
    }

    public static String getSystemLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public static String getUserAgent() {
        if (TextUtils.isEmpty(userAgent)) {
            StringBuffer stringBuffer = new StringBuffer("MomoChat/2.6_0705_1445_tt Android/12310 (");
            stringBuffer.append(DeviceUtils.getModle() + Constants.PACKNAME_END);
            stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            stringBuffer.append("Android " + Build.VERSION.RELEASE + Constants.PACKNAME_END);
            stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            stringBuffer.append("Gapps " + (hasGoogleMap() ? 1 : 0) + Constants.PACKNAME_END);
            stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            stringBuffer.append(Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry() + Constants.PACKNAME_END);
            stringBuffer.append(" 1; ");
            stringBuffer.append(DeviceUtils.getManufacturer());
            stringBuffer.append(")");
            try {
                userAgent = new String(stringBuffer.toString().getBytes(), "UTF-8");
            } catch (Exception unused) {
                userAgent = stringBuffer.toString();
            }
        }
        return userAgent;
    }

    public static boolean hasGoogleMap() {
        try {
            Class.forName("com.google.android.maps.MapActivity");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void init(Context context) {
        sContext = context.getApplicationContext();
    }

    public static boolean isAppOnForeground() {
        Context context = sContext;
        if (context == null) {
            return false;
        }
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            int iMyPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.pid == iMyPid) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean isRunningInMainProcess() {
        String currentProcessName = getCurrentProcessName();
        return TextUtils.isEmpty(currentProcessName) || currentProcessName.equals(sContext.getPackageName());
    }

    public static boolean isRunningInMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void openDebug() {
        DEBUGGABLE = true;
    }

    public static void setAppId(String str) {
        appId = str;
    }

    public static void setMessageReceiver(PushMessageReceiver pushMessageReceiver) {
        messageReceiver = pushMessageReceiver;
    }
}
