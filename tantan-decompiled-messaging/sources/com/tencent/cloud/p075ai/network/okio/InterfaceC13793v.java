package com.tencent.cloud.p075ai.network.okio;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.v */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC13793v extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    C13795x timeout();

    void write(C13776e c13776e, long j);
}
