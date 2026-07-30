package com.tencent.cloud.p080ai.network.okhttp3.internal;

import com.tencent.cloud.p080ai.network.okhttp3.C13930p;
import org.eclipse.jetty.http.HttpMethods;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.d */
/* JADX INFO: loaded from: classes12.dex */
public final class C13884d {
    /* JADX INFO: renamed from: a */
    public static String m82869a(C13930p c13930p) {
        String strM83045b = c13930p.m83045b();
        String strM83047d = c13930p.m83047d();
        if (strM83047d == null) {
            return strM83045b;
        }
        return strM83045b + '?' + strM83047d;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m82870a(String str) {
        return (str.equals("GET") || str.equals(HttpMethods.HEAD)) ? false : true;
    }
}
