package p153l;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileInputStream;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class lv0 {

    /* JADX INFO: renamed from: a */
    public static Context f133670a = null;

    /* JADX INFO: renamed from: b */
    public static boolean f133671b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f133672c = false;

    /* JADX INFO: renamed from: d */
    private static String f133673d;

    /* JADX INFO: renamed from: e */
    private static String f133674e;

    /* JADX INFO: renamed from: a */
    public static Context m155971a() {
        return f133670a;
    }

    /* JADX INFO: renamed from: b */
    public static String m155972b() throws Throwable {
        FileInputStream fileInputStream;
        int i;
        FileInputStream fileInputStream2 = null;
        runningAppProcessInfo = null;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = null;
        if (f133670a == null) {
            return null;
        }
        if (!TextUtils.isEmpty(f133674e)) {
            return f133674e;
        }
        int iMyPid = Process.myPid();
        if (iMyPid <= 0) {
            return "";
        }
        byte[] bArr = new byte[128];
        try {
            fileInputStream = new FileInputStream("/proc/" + iMyPid + "/cmdline");
            try {
                try {
                    int i2 = fileInputStream.read(bArr);
                    if (i2 > 0) {
                        for (0; i < i2; i + 1) {
                            byte b = bArr[i];
                            i = (b <= 128 && b > 0) ? i + 1 : 0;
                            i2 = i;
                            break;
                        }
                        String str = new String(bArr, 0, i2);
                        if (!TextUtils.isEmpty(str)) {
                            f133674e = str;
                            n1m.m161127b(fileInputStream);
                            return str;
                        }
                    }
                } catch (Exception e) {
                    e = e;
                    Log.e("AppContext", "", e);
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                n1m.m161127b(fileInputStream2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            n1m.m161127b(fileInputStream2);
            throw th;
        }
        n1m.m161127b(fileInputStream);
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 : ((ActivityManager) m155971a().getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo2.pid == iMyPid) {
                    runningAppProcessInfo = runningAppProcessInfo2;
                    break;
                }
            }
        } catch (Exception unused) {
        }
        if (runningAppProcessInfo == null || !TextUtils.isEmpty(runningAppProcessInfo.processName)) {
            return "";
        }
        String str2 = runningAppProcessInfo.processName;
        f133674e = str2;
        return str2;
    }

    /* JADX INFO: renamed from: c */
    public static String m155973c() {
        Context context = f133670a;
        if (context == null) {
            return null;
        }
        if (f133673d == null) {
            String packageName = context.getPackageName();
            f133673d = packageName;
            if (packageName.indexOf(":") >= 0) {
                String str = f133673d;
                f133673d = str.substring(0, str.lastIndexOf(":"));
            }
        }
        return f133673d;
    }

    /* JADX INFO: renamed from: d */
    public static String m155974d() {
        return Locale.getDefault().getLanguage();
    }

    /* JADX INFO: renamed from: e */
    public static void m155975e(Context context) {
        f133670a = context;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m155976f() {
        Context context = f133670a;
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

    /* JADX INFO: renamed from: g */
    public static boolean m155977g() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
