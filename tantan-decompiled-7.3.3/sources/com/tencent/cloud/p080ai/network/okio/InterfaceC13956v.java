package com.tencent.cloud.p080ai.network.okio;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.v */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC13956v extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    C13958x timeout();

    void write(C13939e c13939e, long j);
}
