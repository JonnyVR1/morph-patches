package com.tencent.cloud.p075ai.network.okhttp3.internal.connection;

import java.io.IOException;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.connection.h */
/* JADX INFO: loaded from: classes13.dex */
public final class C13718h extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public IOException f56531a;

    /* JADX INFO: renamed from: b */
    public IOException f56532b;

    public C13718h(IOException iOException) {
        super(iOException);
        this.f56531a = iOException;
        this.f56532b = iOException;
    }
}
