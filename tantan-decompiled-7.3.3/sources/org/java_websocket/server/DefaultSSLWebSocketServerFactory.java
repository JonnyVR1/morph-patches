package org.java_websocket.server;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import org.java_websocket.SSLSocketChannel2;
import org.java_websocket.WebSocket;
import org.java_websocket.WebSocketAdapter;
import org.java_websocket.WebSocketImpl;
import org.java_websocket.WebSocketServerFactory;
import org.java_websocket.drafts.Draft;
import p153l.fig0;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultSSLWebSocketServerFactory implements WebSocketServerFactory {
    protected ExecutorService exec;
    protected SSLContext sslcontext;

    public DefaultSSLWebSocketServerFactory(SSLContext sSLContext, ExecutorService executorService) {
        if (sSLContext == null || executorService == null) {
            fig0.m125680a();
            throw null;
        }
        this.sslcontext = sSLContext;
        this.exec = executorService;
    }

    @Override // org.java_websocket.WebSocketServerFactory
    public void close() {
        this.exec.shutdown();
    }

    @Override // org.java_websocket.WebSocketFactory
    public WebSocketImpl createWebSocket(WebSocketAdapter webSocketAdapter, Draft draft) {
        return new WebSocketImpl(webSocketAdapter, draft);
    }

    @Override // org.java_websocket.WebSocketServerFactory
    public ByteChannel wrapChannel(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException {
        SSLEngine sSLEngineCreateSSLEngine = this.sslcontext.createSSLEngine();
        ArrayList arrayList = new ArrayList(Arrays.asList(sSLEngineCreateSSLEngine.getEnabledCipherSuites()));
        arrayList.remove("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        sSLEngineCreateSSLEngine.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
        sSLEngineCreateSSLEngine.setUseClientMode(false);
        return new SSLSocketChannel2(socketChannel, sSLEngineCreateSSLEngine, this.exec, selectionKey);
    }

    @Override // org.java_websocket.WebSocketFactory
    public /* bridge */ /* synthetic */ WebSocket createWebSocket(WebSocketAdapter webSocketAdapter, List list) {
        return createWebSocket(webSocketAdapter, (List<Draft>) list);
    }

    @Override // org.java_websocket.WebSocketServerFactory, org.java_websocket.WebSocketFactory
    public WebSocketImpl createWebSocket(WebSocketAdapter webSocketAdapter, List<Draft> list) {
        return new WebSocketImpl(webSocketAdapter, list);
    }

    public DefaultSSLWebSocketServerFactory(SSLContext sSLContext) {
        this(sSLContext, Executors.newSingleThreadScheduledExecutor());
    }
}
