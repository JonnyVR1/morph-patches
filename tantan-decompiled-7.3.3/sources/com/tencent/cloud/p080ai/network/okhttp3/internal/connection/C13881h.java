package com.tencent.cloud.p080ai.network.okhttp3.internal.connection;

import java.io.IOException;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.connection.h */
/* JADX INFO: loaded from: classes12.dex */
public final class C13881h extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public IOException f57379a;

    /* JADX INFO: renamed from: b */
    public IOException f57380b;

    public C13881h(IOException iOException) {
        super(iOException);
        this.f57379a = iOException;
        this.f57380b = iOException;
    }
}
