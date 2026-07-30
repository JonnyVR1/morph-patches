package p149l;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes13.dex */
public class px0 {
    /* JADX INFO: renamed from: a */
    public static String m171777a(Context context) {
        try {
            return "" + context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            sm80.m184942b(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m171778b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            sm80.m184942b(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m171779c(Context context) {
        return context == null ? "" : context.getPackageName();
    }

    /* JADX INFO: renamed from: d */
    public static int m171780d(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return nr40.m160709e(context).m160712a() ? 1 : 0;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
