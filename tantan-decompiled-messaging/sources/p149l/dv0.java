package p149l;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Looper;
import android.os.Process;
import com.cosmos.mdlog.MDLog;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class dv0 {

    /* JADX INFO: renamed from: a */
    private static String f88022a = "AppContext";

    /* JADX INFO: renamed from: b */
    public static Context f88023b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f88024c = false;

    /* JADX INFO: renamed from: d */
    public static boolean f88025d = false;

    /* JADX INFO: renamed from: e */
    private static String f88026e;

    /* JADX INFO: renamed from: a */
    public static Context m113757a() {
        return f88023b;
    }

    /* JADX INFO: renamed from: b */
    public static String m113758b() throws Throwable {
        ActivityManager.RunningAppProcessInfo next;
        int i;
        FileInputStream fileInputStream = null;
        if (f88023b == null) {
            return null;
        }
        int iMyPid = Process.myPid();
        if (iMyPid <= 0) {
            return "";
        }
        try {
            Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) m113757a().getSystemService("activity")).getRunningAppProcesses().iterator();
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
                    int i2 = fileInputStream2.read(bArr);
                    if (i2 > 0) {
                        for (0; i < i2; i + 1) {
                            byte b = bArr[i];
                            i = (b <= 128 && b > 0) ? i + 1 : 0;
                            i2 = i;
                            break;
                        }
                        String str = new String(bArr, 0, i2);
                        oyl.m166672b(fileInputStream2);
                        return str;
                    }
                    oyl.m166672b(fileInputStream2);
                } catch (Exception e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    MDLog.printErrStackTrace(dv0.class.getName(), e);
                    oyl.m166672b(fileInputStream);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    oyl.m166672b(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        return "";
    }

    /* JADX INFO: renamed from: c */
    public static String m113759c() {
        Context context = f88023b;
        if (context == null) {
            return null;
        }
        if (f88026e == null) {
            String packageName = context.getPackageName();
            f88026e = packageName;
            if (packageName.indexOf(":") >= 0) {
                String str = f88026e;
                f88026e = str.substring(0, str.lastIndexOf(":"));
            }
        }
        return f88026e;
    }

    /* JADX INFO: renamed from: d */
    public static void m113760d(Context context) {
        f88023b = context;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m113761e() {
        Context context = f88023b;
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

    /* JADX INFO: renamed from: f */
    public static boolean m113762f() {
        Looper looperMyLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        MDLog.m7395i(f88022a, "isRunningInMainThread myLooper=" + looperMyLooper + ", mainLooper=" + mainLooper);
        return looperMyLooper == mainLooper;
    }
}
