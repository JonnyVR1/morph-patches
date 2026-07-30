package com.tencent.cloud.p080ai.network.okhttp3;

import p153l.wg3;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.t */
/* JADX INFO: loaded from: classes12.dex */
public enum EnumC13934t {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");


    /* JADX INFO: renamed from: a */
    public final String f57799a;

    EnumC13934t(String str) {
        this.f57799a = str;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC13934t m83065a(String str) {
        str.getClass();
        switch (str) {
            case "TLSv1.1":
                return TLS_1_1;
            case "TLSv1.2":
                return TLS_1_2;
            case "TLSv1.3":
                return TLS_1_3;
            case "SSLv3":
                return SSL_3_0;
            case "TLSv1":
                return TLS_1_0;
            default:
                wg3.m206174a("Unexpected TLS version: ".concat(str));
                return null;
        }
    }
}
