package com.vivo.push.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: renamed from: com.vivo.push.util.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C14649r {
    /* JADX INFO: renamed from: a */
    public static NetworkInfo m85026a(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception e) {
            C14647p.m85010a("NetUtils", e);
            return null;
        }
    }
}
