package com.vivo.push.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: renamed from: com.vivo.push.util.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C14797r {
    /* JADX INFO: renamed from: a */
    public static NetworkInfo m86197a(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception e) {
            C14795p.m86181a("NetUtils", e);
            return null;
        }
    }
}
