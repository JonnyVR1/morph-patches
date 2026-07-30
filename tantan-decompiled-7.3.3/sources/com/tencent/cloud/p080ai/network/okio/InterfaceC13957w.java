package com.tencent.cloud.p080ai.network.okio;

import java.io.Closeable;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.w */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC13957w extends Closeable {
    /* JADX INFO: renamed from: a */
    long mo82814a(C13939e c13939e, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    C13958x timeout();
}
