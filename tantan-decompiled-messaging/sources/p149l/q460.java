package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes13.dex */
public class q460 {

    /* JADX INFO: renamed from: a */
    public static String f152546a;

    /* JADX INFO: renamed from: b */
    public static int f152547b;

    /* JADX INFO: renamed from: a */
    public static PackageInfo m172926a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384);
        } catch (Exception unused) {
            ksm.f124490c.error("Injecter::", "Get package info error.");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m172927b(Context context) {
        PackageInfo packageInfoM172926a = m172926a(context);
        if (packageInfoM172926a != null) {
            String str = packageInfoM172926a.versionName;
            int i = packageInfoM172926a.versionCode;
            SharedPreferences sharedPreferences = context.getSharedPreferences("SP_INJECTER_CACHE", 0);
            if (str.equals(sharedPreferences.getString("LAST_VERSION_NAME", null)) && i == sharedPreferences.getInt("LAST_VERSION_CODE", -1)) {
                return false;
            }
            f152546a = str;
            f152547b = i;
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static void m172928c(Context context) {
        if (TextUtils.isEmpty(f152546a) || f152547b == 0) {
            return;
        }
        context.getSharedPreferences("SP_INJECTER_CACHE", 0).edit().putString("LAST_VERSION_NAME", f152546a).putInt("LAST_VERSION_CODE", f152547b).apply();
    }
}
