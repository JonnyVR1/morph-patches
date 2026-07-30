package com.tencent.cloud.p075ai.network.okio;

import java.io.Closeable;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.w */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC13794w extends Closeable {
    /* JADX INFO: renamed from: a */
    long mo81631a(C13776e c13776e, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    C13795x timeout();
}
