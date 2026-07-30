package com.tencent.cloud.p080ai.network.okhttp3.internal.http2;

import java.io.IOException;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.v */
/* JADX INFO: loaded from: classes12.dex */
public final class C13912v extends IOException {

    /* JADX INFO: renamed from: a */
    public final EnumC13892b f57634a;

    public C13912v(EnumC13892b enumC13892b) {
        super("stream was reset: " + enumC13892b);
        this.f57634a = enumC13892b;
    }
}
