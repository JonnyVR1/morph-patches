package com.tencent.cloud.p075ai.network.okhttp3.internal;

import com.tencent.cloud.p075ai.network.okhttp3.C13767p;
import org.eclipse.jetty.http.HttpMethods;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.d */
/* JADX INFO: loaded from: classes13.dex */
public final class C13721d {
    /* JADX INFO: renamed from: a */
    public static String m81686a(C13767p c13767p) {
        String strM81862b = c13767p.m81862b();
        String strM81864d = c13767p.m81864d();
        if (strM81864d == null) {
            return strM81862b;
        }
        return strM81862b + '?' + strM81864d;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m81687a(String str) {
        return (str.equals("GET") || str.equals(HttpMethods.HEAD)) ? false : true;
    }
}
