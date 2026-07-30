package com.p046p1.mobile.putong.account.api;

import com.p046p1.mobile.putong.data.Counter;
import com.tantanapp.common.network.RunnerProxy;
import p133rx.C22306c;
import p149l.mkd0;
import p149l.mu5;
import p149l.w9j;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.api.b */
/* JADX INFO: loaded from: classes9.dex */
public class C4576b extends RunnerProxy {

    /* JADX INFO: renamed from: a */
    public static final String f16336a = mu5.f135738f + "/v1";

    /* JADX INFO: renamed from: b */
    public static final String f16337b = mu5.f135754v + "/v2";

    /* JADX INFO: renamed from: c */
    public static final String f16338c = mu5.f135737e + "/v2";

    /* JADX INFO: renamed from: d */
    public static final String f16339d = mu5.f135744l;

    /* JADX INFO: renamed from: e */
    public static final String f16340e = mu5.m156376a(Counter.TYPE) + "/v2";

    /* JADX INFO: renamed from: f */
    public static final String f16341f = mu5.f135746n + "/v1";

    public C4576b() {
        setErrorHandler(new w9j() { // from class: l.xf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C21383yf.m214460a((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static String m28371a(String str) {
        return f16336a + str;
    }

    /* JADX INFO: renamed from: b */
    public static String m28372b(String str) {
        return f16337b + str;
    }

    /* JADX INFO: renamed from: c */
    public static String m28373c(String str) {
        return f16338c + str;
    }

    /* JADX INFO: renamed from: d */
    public static String m28374d(String str) {
        return f16340e + str;
    }

    /* JADX INFO: renamed from: e */
    public static String m28375e(String str) {
        return f16341f + str;
    }

    /* JADX INFO: renamed from: f */
    public static <T> C22306c.d<T, T> m28376f() {
        return mkd0.m154951C();
    }
}
