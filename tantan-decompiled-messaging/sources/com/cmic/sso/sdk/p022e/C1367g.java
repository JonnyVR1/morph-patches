package com.cmic.sso.sdk.p022e;

import android.content.Context;

/* JADX INFO: renamed from: com.cmic.sso.sdk.e.g */
/* JADX INFO: loaded from: classes.dex */
public class C1367g {
    /* JADX INFO: renamed from: a */
    public static boolean m7246a(Context context, String str) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }
}
