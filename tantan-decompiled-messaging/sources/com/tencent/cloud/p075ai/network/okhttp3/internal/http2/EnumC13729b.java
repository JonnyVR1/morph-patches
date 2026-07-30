package com.tencent.cloud.p075ai.network.okhttp3.internal.http2;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.b */
/* JADX INFO: loaded from: classes13.dex */
public enum EnumC13729b {
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
    public final int f56620a;

    EnumC13729b(int i) {
        this.f56620a = i;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC13729b m81716a(int i) {
        for (EnumC13729b enumC13729b : values()) {
            if (enumC13729b.f56620a == i) {
                return enumC13729b;
            }
        }
        return null;
    }
}
