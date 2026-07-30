package p153l;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileInputStream;

/* JADX INFO: loaded from: classes7.dex */
public class rqw {

    /* JADX INFO: renamed from: a */
    public static Context f164526a = null;

    /* JADX INFO: renamed from: b */
    public static boolean f164527b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f164528c = false;

    /* JADX INFO: renamed from: d */
    private static String f164529d;

    /* JADX INFO: renamed from: e */
    private static String f164530e;

    /* JADX INFO: renamed from: a */
    public static Context m182676a() {
        return f164526a;
    }

    /* JADX INFO: renamed from: b */
    public static String m182677b() throws Throwable {
        FileInputStream fileInputStream;
        int i;
        FileInputStream fileInputStream2 = null;
        runningAppProcessInfo = null;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = null;
        if (f164526a == null) {
            return null;
        }
        if (!TextUtils.isEmpty(f164530e)) {
            return f164530e;
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
                            f164530e = str;
                            j1m.m143148b(fileInputStream);
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
                j1m.m143148b(fileInputStream2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            j1m.m143148b(fileInputStream2);
            throw th;
        }
        j1m.m143148b(fileInputStream);
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 : ((ActivityManager) m182676a().getSystemService("activity")).getRunningAppProcesses()) {
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
        f164530e = str2;
        return str2;
    }

    /* JADX INFO: renamed from: c */
    public static String m182678c() {
        Context context = f164526a;
        if (context == null) {
            return null;
        }
        if (f164529d == null) {
            String packageName = context.getPackageName();
            f164529d = packageName;
            if (packageName.indexOf(":") >= 0) {
                String str = f164529d;
                f164529d = str.substring(0, str.lastIndexOf(":"));
            }
        }
        return f164529d;
    }

    /* JADX INFO: renamed from: d */
    public static void m182679d(Context context) {
        f164526a = context;
    }
}
