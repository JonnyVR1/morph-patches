package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes11.dex */
public class wc60 {

    /* JADX INFO: renamed from: a */
    public static String f188392a;

    /* JADX INFO: renamed from: b */
    public static int f188393b;

    /* JADX INFO: renamed from: a */
    public static PackageInfo m205793a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384);
        } catch (Exception unused) {
            mum.f138826c.error("Injecter::", "Get package info error.");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m205794b(Context context) {
        PackageInfo packageInfoM205793a = m205793a(context);
        if (packageInfoM205793a != null) {
            String str = packageInfoM205793a.versionName;
            int i = packageInfoM205793a.versionCode;
            SharedPreferences sharedPreferences = context.getSharedPreferences("SP_INJECTER_CACHE", 0);
            if (str.equals(sharedPreferences.getString("LAST_VERSION_NAME", null)) && i == sharedPreferences.getInt("LAST_VERSION_CODE", -1)) {
                return false;
            }
            f188392a = str;
            f188393b = i;
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static void m205795c(Context context) {
        if (TextUtils.isEmpty(f188392a) || f188393b == 0) {
            return;
        }
        context.getSharedPreferences("SP_INJECTER_CACHE", 0).edit().putString("LAST_VERSION_NAME", f188392a).putInt("LAST_VERSION_CODE", f188393b).apply();
    }
}
