package com.sina.weibo.sdk.utils;

import android.content.Context;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class NetworkHelper {
    public static String generateUA(Context context) {
        StringBuilder sb = new StringBuilder("Android__weibo__sdk__");
        try {
            sb.append(context.getPackageManager().getPackageInfo(context.getPackageName(), 16).versionName.replaceAll("\\s+", "_"));
        } catch (Exception unused) {
            sb.append("unknown");
        }
        return sb.toString();
    }

    public static boolean hasInternetPermission(Context context) {
        return context.getPackageManager().checkPermission("android.permission.INTERNET", context.getPackageName()) == 0;
    }
}
