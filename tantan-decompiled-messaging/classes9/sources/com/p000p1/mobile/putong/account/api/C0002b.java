package com.p000p1.mobile.putong.account.api;

import com.tantanapp.common.network.RunnerProxy;
import l.mkd0;
import l.w9j;
import p006l.mu5;
import rx.c;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.api.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0002b extends RunnerProxy {

    /* JADX INFO: renamed from: a */
    public static final String f325a = mu5.f17257f + "/v1";

    /* JADX INFO: renamed from: b */
    public static final String f326b = mu5.f17273v + "/v2";

    /* JADX INFO: renamed from: c */
    public static final String f327c = mu5.f17256e + "/v2";

    /* JADX INFO: renamed from: d */
    public static final String f328d = mu5.f17263l;

    /* JADX INFO: renamed from: e */
    public static final String f329e = mu5.m19508a("counter") + "/v2";

    /* JADX INFO: renamed from: f */
    public static final String f330f = mu5.f17265n + "/v1";

    public C0002b() {
        setErrorHandler(new w9j() { // from class: l.xf
            public final Object call(Object obj) {
                return C1478yf.m28231a((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static String m266a(String str) {
        return f325a + str;
    }

    /* JADX INFO: renamed from: b */
    public static String m267b(String str) {
        return f326b + str;
    }

    /* JADX INFO: renamed from: c */
    public static String m268c(String str) {
        return f327c + str;
    }

    /* JADX INFO: renamed from: d */
    public static String m269d(String str) {
        return f329e + str;
    }

    /* JADX INFO: renamed from: e */
    public static String m270e(String str) {
        return f330f + str;
    }

    /* JADX INFO: renamed from: f */
    public static <T> c.d<T, T> m271f() {
        return mkd0.C();
    }
}
