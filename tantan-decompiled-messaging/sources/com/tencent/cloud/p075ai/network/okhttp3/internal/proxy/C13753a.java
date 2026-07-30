package com.tencent.cloud.p075ai.network.okhttp3.internal.proxy;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import p149l.ig3;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.proxy.a */
/* JADX INFO: loaded from: classes13.dex */
public class C13753a extends ProxySelector {
    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        if (uri != null) {
            return Collections.singletonList(Proxy.NO_PROXY);
        }
        ig3.m135964a("uri must not be null");
        return null;
    }
}
