package p153l;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Looper;
import android.os.Process;
import com.cosmos.mdlog.MDLog;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class kv0 {

    /* JADX INFO: renamed from: a */
    private static String f128934a = "AppContext";

    /* JADX INFO: renamed from: b */
    public static Context f128935b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f128936c = false;

    /* JADX INFO: renamed from: d */
    public static boolean f128937d = false;

    /* JADX INFO: renamed from: e */
    private static String f128938e;

    /* JADX INFO: renamed from: a */
    public static Context m151647a() {
        return f128935b;
    }

    /* JADX INFO: renamed from: b */
    public static String m151648b() throws Throwable {
        ActivityManager.RunningAppProcessInfo next;
        int i;
        FileInputStream fileInputStream = null;
        if (f128935b == null) {
            return null;
        }
        int iMyPid = Process.myPid();
        if (iMyPid <= 0) {
            return "";
        }
        try {
            Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) m151647a().getSystemService("activity")).getRunningAppProcesses().iterator();
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
                        i1m.m138142b(fileInputStream2);
                        return str;
                    }
                    i1m.m138142b(fileInputStream2);
                } catch (Exception e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    MDLog.printErrStackTrace(kv0.class.getName(), e);
                    i1m.m138142b(fileInputStream);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    i1m.m138142b(fileInputStream);
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
    public static String m151649c() {
        Context context = f128935b;
        if (context == null) {
            return null;
        }
        if (f128938e == null) {
            String packageName = context.getPackageName();
            f128938e = packageName;
            if (packageName.indexOf(":") >= 0) {
                String str = f128938e;
                f128938e = str.substring(0, str.lastIndexOf(":"));
            }
        }
        return f128938e;
    }

    /* JADX INFO: renamed from: d */
    public static void m151650d(Context context) {
        f128935b = context;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m151651e() {
        Context context = f128935b;
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
    public static boolean m151652f() {
        Looper looperMyLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        MDLog.m7449i(f128934a, "isRunningInMainThread myLooper=" + looperMyLooper + ", mainLooper=" + mainLooper);
        return looperMyLooper == mainLooper;
    }
}
