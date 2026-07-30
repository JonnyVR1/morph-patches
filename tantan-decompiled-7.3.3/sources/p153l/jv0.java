package p153l;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import java.io.FileInputStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class jv0 {

    /* JADX INFO: renamed from: a */
    public static Context f122755a = null;

    /* JADX INFO: renamed from: b */
    public static boolean f122756b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f122757c = false;

    /* JADX INFO: renamed from: d */
    private static String f122758d;

    /* JADX INFO: renamed from: e */
    private static String f122759e;

    /* JADX INFO: renamed from: a */
    public static Context m147001a() {
        return f122755a;
    }

    /* JADX INFO: renamed from: b */
    public static String m147002b() throws Throwable {
        ActivityManager.RunningAppProcessInfo next;
        int i;
        FileInputStream fileInputStream = null;
        if (f122755a == null) {
            return null;
        }
        if (!TextUtils.isEmpty(f122759e)) {
            return f122759e;
        }
        int iMyPid = Process.myPid();
        if (iMyPid <= 0) {
            return "";
        }
        try {
            Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) m147001a().getSystemService("activity")).getRunningAppProcesses().iterator();
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
                        h1m.m133352b(fileInputStream2);
                        return str;
                    }
                    h1m.m133352b(fileInputStream2);
                } catch (Exception e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    MDLog.printErrStackTrace(jv0.class.getName(), e);
                    h1m.m133352b(fileInputStream);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    h1m.m133352b(fileInputStream);
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
    public static String m147003c() {
        Context context = f122755a;
        if (context == null) {
            return null;
        }
        if (f122758d == null) {
            String packageName = context.getPackageName();
            f122758d = packageName;
            if (packageName.indexOf(":") >= 0) {
                String str = f122758d;
                f122758d = str.substring(0, str.lastIndexOf(":"));
            }
        }
        return f122758d;
    }

    /* JADX INFO: renamed from: d */
    public static void m147004d(Context context) {
        f122755a = context;
    }
}
