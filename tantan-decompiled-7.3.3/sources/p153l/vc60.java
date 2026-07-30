package p153l;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class vc60 {

    /* JADX INFO: renamed from: a */
    public static String f183335a = "";

    /* JADX INFO: renamed from: b */
    public static int f183336b = 0;

    /* JADX INFO: renamed from: c */
    public static String f183337c = "";

    /* JADX INFO: renamed from: d */
    public static String f183338d = "";

    /* JADX INFO: renamed from: a */
    public static String m200786a() {
        if (!TextUtils.isEmpty(f183338d)) {
            return f183338d;
        }
        String str = m200793h(Process.myPid()) + "(" + Process.myPid() + ")";
        f183338d = str;
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static PackageInfo m200787b(Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        return packageInfo == null ? new PackageInfo() : packageInfo;
    }

    /* JADX INFO: renamed from: c */
    public static String m200788c() {
        return TextUtils.isEmpty(f183337c) ? "fail" : f183337c;
    }

    /* JADX INFO: renamed from: d */
    public static ActivityManager.ProcessErrorStateInfo m200789d(Context context, long j) {
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
        f610.m124263a("getErrorStateInfo end!", new Object[0]);
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static int m200790e() {
        return f183336b;
    }

    /* JADX INFO: renamed from: f */
    public static String m200791f() {
        return TextUtils.isEmpty(f183335a) ? "fail" : f183335a;
    }

    /* JADX INFO: renamed from: g */
    public static void m200792g(Context context) {
        if (TextUtils.isEmpty(du2.m118058r())) {
            f183335a = m200787b(context).versionName;
        } else {
            f183335a = du2.m118058r();
        }
        if (du2.m118057q() > 0) {
            f183336b = du2.m118057q();
        } else {
            f183336b = m200787b(context).versionCode;
        }
        f183337c = m200787b(context).packageName;
    }

    /* JADX INFO: renamed from: h */
    public static String m200793h(int i) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/" + i + "/cmdline"));
            try {
                String line = bufferedReader.readLine();
                if (!TextUtils.isEmpty(line)) {
                    line = line.trim();
                }
                m1m.m156698a(bufferedReader);
                return line;
            } catch (Throwable th) {
                th = th;
                try {
                    th.printStackTrace();
                    return null;
                } finally {
                    m1m.m156698a(bufferedReader);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
    }
}
