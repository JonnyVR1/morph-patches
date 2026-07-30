package com.vivo.push.util;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: renamed from: com.vivo.push.util.w */
/* JADX INFO: loaded from: classes2.dex */
public final class C14654w extends C14633b {

    /* JADX INFO: renamed from: b */
    private static C14654w f61137b;

    /* JADX INFO: renamed from: b */
    public static synchronized C14654w m85045b() {
        try {
            if (f61137b == null) {
                f61137b = new C14654w();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f61137b;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m85047a(Context context) {
        if (this.f61099a == null) {
            this.f61099a = context;
            m84963a(context, "com.vivo.push_preferences");
        }
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m85048c() {
        byte[] bArrM85046c = m85046c(m84968b("com.vivo.push.secure_cache_iv", ""));
        return (bArrM85046c == null || bArrM85046c.length <= 0) ? new byte[]{34, HttpTokens.SPACE, 33, 37, 33, 34, HttpTokens.SPACE, 33, 33, 33, 34, 41, 35, HttpTokens.SPACE, HttpTokens.SPACE, HttpTokens.SPACE} : bArrM85046c;
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m85049d() {
        byte[] bArrM85046c = m85046c(m84968b("com.vivo.push.secure_cache_key", ""));
        return (bArrM85046c == null || bArrM85046c.length <= 0) ? new byte[]{33, 34, 35, 36, 37, 38, 39, 40, 41, HttpTokens.SPACE, 38, 37, 36, 35, 34, 33} : bArrM85046c;
    }

    /* JADX INFO: renamed from: c */
    private static byte[] m85046c(String str) {
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
            C14647p.m85008a("SharePreferenceManager", "getCodeBytes error:" + e.getMessage());
            return bArr;
        }
    }
}
