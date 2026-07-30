package com.p051p1.mobile.putong.account.api;

import com.p051p1.mobile.putong.data.Counter;
import com.tantanapp.common.network.RunnerProxy;
import p137rx.C22421c;
import p153l.psd0;
import p153l.qcj;
import p153l.qv5;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.api.b */
/* JADX INFO: loaded from: classes9.dex */
public class C4727b extends RunnerProxy {

    /* JADX INFO: renamed from: a */
    public static final String f17055a = qv5.f159702f + "/v1";

    /* JADX INFO: renamed from: b */
    public static final String f17056b = qv5.f159718v + "/v2";

    /* JADX INFO: renamed from: c */
    public static final String f17057c = qv5.f159701e + "/v2";

    /* JADX INFO: renamed from: d */
    public static final String f17058d = qv5.f159708l;

    /* JADX INFO: renamed from: e */
    public static final String f17059e = qv5.m178247a(Counter.TYPE) + "/v2";

    /* JADX INFO: renamed from: f */
    public static final String f17060f = qv5.f159710n + "/v1";

    public C4727b() {
        setErrorHandler(new qcj() { // from class: l.sf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C20299tf.m190905a((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static String m29370a(String str) {
        return f17055a + str;
    }

    /* JADX INFO: renamed from: b */
    public static String m29371b(String str) {
        return f17056b + str;
    }

    /* JADX INFO: renamed from: c */
    public static String m29372c(String str) {
        return f17057c + str;
    }

    /* JADX INFO: renamed from: d */
    public static String m29373d(String str) {
        return f17059e + str;
    }

    /* JADX INFO: renamed from: e */
    public static String m29374e(String str) {
        return f17060f + str;
    }

    /* JADX INFO: renamed from: f */
    public static <T> C22421c.d<T, T> m29375f() {
        return psd0.m173592C();
    }
}
