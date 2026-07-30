package com.cmic.sso.sdk.p022e;

import com.cmic.sso.sdk.auth.TokenListener;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.cmic.sso.sdk.e.e */
/* JADX INFO: loaded from: classes.dex */
public class C1365e {

    /* JADX INFO: renamed from: a */
    private static ConcurrentHashMap<String, TokenListener> f5698a = new ConcurrentHashMap<>(16);

    /* JADX INFO: renamed from: a */
    public static boolean m7239a(String str) {
        return !f5698a.containsKey(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m7240b(String str) {
        f5698a.remove(str);
    }

    /* JADX INFO: renamed from: c */
    public static TokenListener m7241c(String str) {
        return f5698a.get(str);
    }

    /* JADX INFO: renamed from: a */
    public static void m7237a(String str, TokenListener tokenListener) {
        f5698a.put(str, tokenListener);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7238a() {
        return f5698a.isEmpty();
    }
}
