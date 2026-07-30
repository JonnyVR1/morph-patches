package com.tantanapp.media.ttmediautils.app;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.tantanapp.media.ttmediautils.log.SLog;
import com.tantanapp.media.ttmediautils.p079io.IOUtils;
import java.io.FileInputStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public class AppContext {
    public static boolean DEBUGGABLE;
    private static String currentProcessName;
    public static Context sContext;

    public static Context getContext() {
        return sContext;
    }

    public static String getCurrentProcessName() throws Throwable {
        ActivityManager.RunningAppProcessInfo next;
        FileInputStream fileInputStream = null;
        if (sContext == null) {
            return null;
        }
        if (!TextUtils.isEmpty(currentProcessName)) {
            return currentProcessName;
        }
        int iMyPid = Process.myPid();
        if (iMyPid <= 0) {
            return "";
        }
        try {
            Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) getContext().getSystemService("activity")).getRunningAppProcesses().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.pid != iMyPid);
        } catch (Exception unused) {
        }
        if (next != null) {
            return next.processName;
        }
        byte[] bArr = new byte[128];
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream("/proc/" + iMyPid + "/cmdline");
                try {
                    int i = fileInputStream2.read(bArr);
                    if (i <= 0) {
                        IOUtils.closeQuietly(fileInputStream2);
                        return "";
                    }
                    for (int i2 = 0; i2 < i; i2++) {
                        byte b = bArr[i2];
                        if (b > 128 || b <= 0) {
                            i = i2;
                            break;
                        }
                    }
                    String str = new String(bArr, 0, i);
                    IOUtils.closeQuietly(fileInputStream2);
                    return str;
                } catch (Exception e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    SLog.m82595e(AppContext.class.getName(), e);
                    IOUtils.closeQuietly(fileInputStream);
                    return "";
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    IOUtils.closeQuietly(fileInputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void init(Context context) {
        sContext = context;
    }

    public static void openDebug() {
        DEBUGGABLE = true;
    }
}
