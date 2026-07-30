package com.vivo.push.util;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: renamed from: com.vivo.push.util.w */
/* JADX INFO: loaded from: classes2.dex */
public final class C14802w extends C14781b {

    /* JADX INFO: renamed from: b */
    private static C14802w f61984b;

    /* JADX INFO: renamed from: b */
    public static synchronized C14802w m86216b() {
        try {
            if (f61984b == null) {
                f61984b = new C14802w();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f61984b;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m86218a(Context context) {
        if (this.f61946a == null) {
            this.f61946a = context;
            m86134a(context, "com.vivo.push_preferences");
        }
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m86219c() {
        byte[] bArrM86217c = m86217c(m86139b("com.vivo.push.secure_cache_iv", ""));
        return (bArrM86217c == null || bArrM86217c.length <= 0) ? new byte[]{34, HttpTokens.SPACE, 33, 37, 33, 34, HttpTokens.SPACE, 33, 33, 33, 34, 41, 35, HttpTokens.SPACE, HttpTokens.SPACE, HttpTokens.SPACE} : bArrM86217c;
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m86220d() {
        byte[] bArrM86217c = m86217c(m86139b("com.vivo.push.secure_cache_key", ""));
        return (bArrM86217c == null || bArrM86217c.length <= 0) ? new byte[]{33, 34, 35, 36, 37, 38, 39, 40, 41, HttpTokens.SPACE, 38, 37, 36, 35, 34, 33} : bArrM86217c;
    }

    /* JADX INFO: renamed from: c */
    private static byte[] m86217c(String str) {
        int length;
        byte[] bArr = null;
        try {
            String[] strArrSplit = str.split(Constants.SEPARATOR_COMMA);
            if (strArrSplit.length > 0) {
                bArr = new byte[strArrSplit.length];
                length = strArrSplit.length;
            } else {
                length = 0;
            }
            for (int i = 0; i < length; i++) {
                bArr[i] = Byte.parseByte(strArrSplit[i].trim());
            }
            return bArr;
        } catch (Exception e) {
            C14795p.m86179a("SharePreferenceManager", "getCodeBytes error:" + e.getMessage());
            return bArr;
        }
    }
}
