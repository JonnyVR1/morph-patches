package com.cmic.sso.sdk.p023e;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: com.cmic.sso.sdk.e.f */
/* JADX INFO: loaded from: classes.dex */
public class C1389f {
    /* JADX INFO: renamed from: a */
    public static String m7296a(Context context) {
        String str = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            String str2 = (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(m7299d(context), 0));
            if (str2 != null) {
                return str2;
            }
            try {
                PackageInfo packageInfoM7298c = m7298c(context);
                if (packageInfoM7298c == null) {
                    return null;
                }
                return context.getResources().getString(packageInfoM7298c.applicationInfo.labelRes);
            } catch (Exception e) {
                e = e;
                str = str2;
                e.printStackTrace();
                return str;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m7297b(Context context) {
        try {
            PackageInfo packageInfoM7298c = m7298c(context);
            if (packageInfoM7298c == null) {
                return "";
            }
            return m7299d(context) + "&" + packageInfoM7298c.versionName;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    private static PackageInfo m7298c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private static String m7299d(Context context) {
        PackageInfo packageInfoM7298c = m7298c(context);
        return packageInfoM7298c == null ? "" : packageInfoM7298c.packageName;
    }
}
