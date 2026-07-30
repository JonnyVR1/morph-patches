package com.cmic.sso.sdk.p023e;

import com.cmic.sso.sdk.auth.TokenListener;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.cmic.sso.sdk.e.e */
/* JADX INFO: loaded from: classes.dex */
public class C1388e {

    /* JADX INFO: renamed from: a */
    private static ConcurrentHashMap<String, TokenListener> f5735a = new ConcurrentHashMap<>(16);

    /* JADX INFO: renamed from: a */
    public static boolean m7293a(String str) {
        return !f5735a.containsKey(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m7294b(String str) {
        f5735a.remove(str);
    }

    /* JADX INFO: renamed from: c */
    public static TokenListener m7295c(String str) {
        return f5735a.get(str);
    }

    /* JADX INFO: renamed from: a */
    public static void m7291a(String str, TokenListener tokenListener) {
        f5735a.put(str, tokenListener);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7292a() {
        return f5735a.isEmpty();
    }
}
