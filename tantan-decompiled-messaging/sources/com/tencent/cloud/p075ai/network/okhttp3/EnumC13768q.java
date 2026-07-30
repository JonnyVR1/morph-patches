package com.tencent.cloud.p075ai.network.okhttp3;

import java.io.IOException;
import p149l.rhg0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.q */
/* JADX INFO: loaded from: classes13.dex */
public enum EnumC13768q {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: a */
    public final String f56932a;

    EnumC13768q(String str) {
        this.f56932a = str;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC13768q m81876a(String str) throws IOException {
        EnumC13768q enumC13768q = HTTP_1_0;
        if (str.equals(enumC13768q.f56932a)) {
            return enumC13768q;
        }
        EnumC13768q enumC13768q2 = HTTP_1_1;
        if (str.equals(enumC13768q2.f56932a)) {
            return enumC13768q2;
        }
        EnumC13768q enumC13768q3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(enumC13768q3.f56932a)) {
            return enumC13768q3;
        }
        EnumC13768q enumC13768q4 = HTTP_2;
        if (str.equals(enumC13768q4.f56932a)) {
            return enumC13768q4;
        }
        EnumC13768q enumC13768q5 = SPDY_3;
        if (str.equals(enumC13768q5.f56932a)) {
            return enumC13768q5;
        }
        EnumC13768q enumC13768q6 = QUIC;
        if (str.equals(enumC13768q6.f56932a)) {
            return enumC13768q6;
        }
        rhg0.m179353a("Unexpected protocol: ".concat(str));
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f56932a;
    }
}
