package com.cmic.sso.sdk.p022e;

import android.util.Log;

/* JADX INFO: renamed from: com.cmic.sso.sdk.e.c */
/* JADX INFO: loaded from: classes.dex */
public class C1363c {

    /* JADX INFO: renamed from: a */
    private static final C1363c f5696a = new C1363c();

    /* JADX INFO: renamed from: b */
    private static boolean f5697b = false;

    /* JADX INFO: renamed from: a */
    public static void m7232a(String str, String str2) {
        if (f5697b) {
            Log.e("CMCC-SDK:" + str, "" + str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m7234b(String str, String str2) {
    }

    /* JADX INFO: renamed from: a */
    public static void m7233a(boolean z) {
        f5697b = z;
    }
}
