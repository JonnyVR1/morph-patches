package com.tencent.cloud.p080ai.network.okhttp3.internal.connection;

import com.tencent.cloud.p080ai.network.okhttp3.internal.p081ws.RealWebSocket;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13940f;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13941g;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.connection.d */
/* JADX INFO: loaded from: classes12.dex */
public class C13877d extends RealWebSocket.Streams {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C13875b f57352a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13877d(C13878e c13878e, boolean z, InterfaceC13941g interfaceC13941g, InterfaceC13940f interfaceC13940f, C13875b c13875b) {
        super(z, interfaceC13941g, interfaceC13940f);
        this.f57352a = c13875b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f57352a.m82828a(-1L, true, true, null);
    }
}
