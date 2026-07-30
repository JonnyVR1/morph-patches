package com.cmic.sso.sdk.p023e;

import android.util.Log;

/* JADX INFO: renamed from: com.cmic.sso.sdk.e.c */
/* JADX INFO: loaded from: classes.dex */
public class C1386c {

    /* JADX INFO: renamed from: a */
    private static final C1386c f5733a = new C1386c();

    /* JADX INFO: renamed from: b */
    private static boolean f5734b = false;

    /* JADX INFO: renamed from: a */
    public static void m7286a(String str, String str2) {
        if (f5734b) {
            Log.e("CMCC-SDK:" + str, "" + str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m7288b(String str, String str2) {
    }

    /* JADX INFO: renamed from: a */
    public static void m7287a(boolean z) {
        f5734b = z;
    }
}
