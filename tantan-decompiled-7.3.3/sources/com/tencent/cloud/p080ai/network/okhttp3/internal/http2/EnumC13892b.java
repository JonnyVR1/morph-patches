package com.tencent.cloud.p080ai.network.okhttp3.internal.http2;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.b */
/* JADX INFO: loaded from: classes12.dex */
public enum EnumC13892b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);


    /* JADX INFO: renamed from: a */
    public final int f57468a;

    EnumC13892b(int i) {
        this.f57468a = i;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC13892b m82899a(int i) {
        for (EnumC13892b enumC13892b : values()) {
            if (enumC13892b.f57468a == i) {
                return enumC13892b;
            }
        }
        return null;
    }
}
