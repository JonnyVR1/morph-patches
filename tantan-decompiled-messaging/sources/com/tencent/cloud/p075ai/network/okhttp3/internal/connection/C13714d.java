package com.tencent.cloud.p075ai.network.okhttp3.internal.connection;

import com.tencent.cloud.p075ai.network.okhttp3.internal.p076ws.RealWebSocket;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13777f;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13778g;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.connection.d */
/* JADX INFO: loaded from: classes13.dex */
public class C13714d extends RealWebSocket.Streams {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C13712b f56504a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13714d(C13715e c13715e, boolean z, InterfaceC13778g interfaceC13778g, InterfaceC13777f interfaceC13777f, C13712b c13712b) {
        super(z, interfaceC13778g, interfaceC13777f);
        this.f56504a = c13712b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f56504a.m81645a(-1L, true, true, null);
    }
}
