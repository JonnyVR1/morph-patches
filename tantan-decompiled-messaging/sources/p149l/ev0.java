package p149l;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import com.immomo.mmutil.log.Log4Android;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ev0 {

    /* JADX INFO: renamed from: a */
    public static Context f93300a = null;

    /* JADX INFO: renamed from: b */
    public static boolean f93301b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f93302c = false;

    /* JADX INFO: renamed from: d */
    private static String f93303d;

    /* JADX INFO: renamed from: e */
    private static String f93304e;

    /* JADX INFO: renamed from: a */
    public static Context m118233a() {
        return f93300a;
    }

    /* JADX INFO: renamed from: b */
    public static String m118234b() throws Throwable {
        ActivityManager.RunningAppProcessInfo next;
        int i;
        FileInputStream fileInputStream = null;
        if (f93300a == null) {
            return null;
        }
        if (!TextUtils.isEmpty(f93304e)) {
            return f93304e;
        }
        int iMyPid = Process.myPid();
        if (iMyPid <= 0) {
            return "";
        }
        try {
            Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) m118233a().getSystemService("activity")).getRunningAppProcesses().iterator();
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
                        syl.m186709b(fileInputStream2);
                        return str;
                    }
                    syl.m186709b(fileInputStream2);
                } catch (Exception e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    MDLog.printErrStackTrace(ev0.class.getName(), e);
                    syl.m186709b(fileInputStream);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    syl.m186709b(fileInputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
            return "";
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m118235c() {
        Context context = f93300a;
        if (context == null) {
            return null;
        }
        if (f93303d == null) {
            String packageName = context.getPackageName();
            f93303d = packageName;
            if (packageName.indexOf(":") >= 0) {
                String str = f93303d;
                f93303d = str.substring(0, str.lastIndexOf(":"));
            }
        }
        return f93303d;
    }

    /* JADX INFO: renamed from: d */
    public static void m118236d(Context context) {
        f93300a = context;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m118237e() {
        Context context = f93300a;
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
    public static boolean m118238f() {
        Looper looperMyLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        Log4Android.m18417f().m18423g("isRunningInMainThread myLooper=" + looperMyLooper + ", mainLooper=" + mainLooper);
        return looperMyLooper == mainLooper;
    }
}
