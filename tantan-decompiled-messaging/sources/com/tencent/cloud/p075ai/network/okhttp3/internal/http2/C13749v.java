package com.tencent.cloud.p075ai.network.okhttp3.internal.http2;

import java.io.IOException;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.v */
/* JADX INFO: loaded from: classes13.dex */
public final class C13749v extends IOException {

    /* JADX INFO: renamed from: a */
    public final EnumC13729b f56786a;

    public C13749v(EnumC13729b enumC13729b) {
        super("stream was reset: " + enumC13729b);
        this.f56786a = enumC13729b;
    }
}
