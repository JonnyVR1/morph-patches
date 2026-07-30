package p149l;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class p460 {

    /* JADX INFO: renamed from: a */
    public static String f147036a = "";

    /* JADX INFO: renamed from: b */
    public static int f147037b = 0;

    /* JADX INFO: renamed from: c */
    public static String f147038c = "";

    /* JADX INFO: renamed from: d */
    public static String f147039d = "";

    /* JADX INFO: renamed from: a */
    public static String m167365a() {
        if (!TextUtils.isEmpty(f147039d)) {
            return f147039d;
        }
        String str = m167372h(Process.myPid()) + "(" + Process.myPid() + ")";
        f147039d = str;
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static PackageInfo m167366b(Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        return packageInfo == null ? new PackageInfo() : packageInfo;
    }

    /* JADX INFO: renamed from: c */
    public static String m167367c() {
        return TextUtils.isEmpty(f147038c) ? "fail" : f147038c;
    }

    /* JADX INFO: renamed from: d */
    public static ActivityManager.ProcessErrorStateInfo m167368d(Context context, long j) {
        if (j < 0) {
            j = 0;
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return null;
            }
            long j2 = j / 500;
            int i = 0;
            while (true) {
                List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
                if (processesInErrorState != null) {
                    for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                        if (processErrorStateInfo.condition == 2 && processErrorStateInfo.pid == Process.myPid()) {
                            return processErrorStateInfo;
                        }
                    }
                }
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused) {
                }
                int i2 = i + 1;
                if (i < j2) {
                    i = i2;
                }
            }
        } catch (Throwable unused2) {
        }
        vx00.m200471a("getErrorStateInfo end!", new Object[0]);
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static int m167369e() {
        return f147037b;
    }

    /* JADX INFO: renamed from: f */
    public static String m167370f() {
        return TextUtils.isEmpty(f147036a) ? "fail" : f147036a;
    }

    /* JADX INFO: renamed from: g */
    public static void m167371g(Context context) {
        if (TextUtils.isEmpty(nt2.m160827r())) {
            f147036a = m167366b(context).versionName;
        } else {
            f147036a = nt2.m160827r();
        }
        if (nt2.m160826q() > 0) {
            f147037b = nt2.m160826q();
        } else {
            f147037b = m167366b(context).versionCode;
        }
        f147038c = m167366b(context).packageName;
    }

    /* JADX INFO: renamed from: h */
    public static String m167372h(int i) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/" + i + "/cmdline"));
            try {
                String line = bufferedReader.readLine();
                if (!TextUtils.isEmpty(line)) {
                    line = line.trim();
                }
                ryl.m181666a(bufferedReader);
                return line;
            } catch (Throwable th) {
                th = th;
                try {
                    th.printStackTrace();
                    return null;
                } finally {
                    ryl.m181666a(bufferedReader);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
    }
}
