package com.tencent.cloud.p080ai.network.okhttp3;

import java.io.IOException;
import p153l.zpg0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.q */
/* JADX INFO: loaded from: classes12.dex */
public enum EnumC13931q {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: a */
    public final String f57780a;

    EnumC13931q(String str) {
        this.f57780a = str;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC13931q m83059a(String str) throws IOException {
        EnumC13931q enumC13931q = HTTP_1_0;
        if (str.equals(enumC13931q.f57780a)) {
            return enumC13931q;
        }
        EnumC13931q enumC13931q2 = HTTP_1_1;
        if (str.equals(enumC13931q2.f57780a)) {
            return enumC13931q2;
        }
        EnumC13931q enumC13931q3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(enumC13931q3.f57780a)) {
            return enumC13931q3;
        }
        EnumC13931q enumC13931q4 = HTTP_2;
        if (str.equals(enumC13931q4.f57780a)) {
            return enumC13931q4;
        }
        EnumC13931q enumC13931q5 = SPDY_3;
        if (str.equals(enumC13931q5.f57780a)) {
            return enumC13931q5;
        }
        EnumC13931q enumC13931q6 = QUIC;
        if (str.equals(enumC13931q6.f57780a)) {
            return enumC13931q6;
        }
        zpg0.m220844a("Unexpected protocol: ".concat(str));
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f57780a;
    }
}
