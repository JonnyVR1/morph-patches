package com.tencent.cloud.p075ai.network.okhttp3;

import p149l.ig3;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.t */
/* JADX INFO: loaded from: classes13.dex */
public enum EnumC13771t {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");


    /* JADX INFO: renamed from: a */
    public final String f56951a;

    EnumC13771t(String str) {
        this.f56951a = str;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC13771t m81882a(String str) {
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
                ig3.m135964a("Unexpected TLS version: ".concat(str));
                return null;
        }
    }
}
