package org.java_websocket.server;

import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;
import org.java_websocket.WebSocket;
import org.java_websocket.WebSocketAdapter;
import org.java_websocket.WebSocketImpl;
import org.java_websocket.WebSocketServerFactory;
import org.java_websocket.drafts.Draft;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DefaultWebSocketServerFactory implements WebSocketServerFactory {
    @Override // org.java_websocket.WebSocketServerFactory
    public void close() {
    }

    @Override // org.java_websocket.WebSocketFactory
    public WebSocketImpl createWebSocket(WebSocketAdapter webSocketAdapter, Draft draft) {
        return new WebSocketImpl(webSocketAdapter, draft);
    }

    @Override // org.java_websocket.WebSocketServerFactory
    public SocketChannel wrapChannel(SocketChannel socketChannel, SelectionKey selectionKey) {
        return socketChannel;
    }

    @Override // org.java_websocket.WebSocketFactory
    public /* bridge */ /* synthetic */ WebSocket createWebSocket(WebSocketAdapter webSocketAdapter, List list) {
        return createWebSocket(webSocketAdapter, (List<Draft>) list);
    }

    @Override // org.java_websocket.WebSocketServerFactory, org.java_websocket.WebSocketFactory
    public WebSocketImpl createWebSocket(WebSocketAdapter webSocketAdapter, List<Draft> list) {
        return new WebSocketImpl(webSocketAdapter, list);
    }
}
