package p153l;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes11.dex */
public class wx0 {
    /* JADX INFO: renamed from: a */
    public static String m208361a(Context context) {
        try {
            return "" + context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            wu80.m207938b(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m208362b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            wu80.m207938b(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m208363c(Context context) {
        return context == null ? "" : context.getPackageName();
    }

    /* JADX INFO: renamed from: d */
    public static int m208364d(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return c050.m107319e(context).m107322a() ? 1 : 0;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
