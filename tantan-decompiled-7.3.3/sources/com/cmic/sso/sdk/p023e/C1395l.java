package com.cmic.sso.sdk.p023e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: com.cmic.sso.sdk.e.l */
/* JADX INFO: loaded from: classes.dex */
public class C1395l {
    @SuppressLint({"PackageManagerGetSignatures"})
    /* JADX INFO: renamed from: a */
    public static byte[] m7343a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        if (context.getPackageName().equalsIgnoreCase(str)) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 64);
                if (packageInfo.packageName.equals(str)) {
                    return packageInfo.signatures[0].toByteArray();
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
