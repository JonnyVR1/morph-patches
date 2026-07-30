package org.java_websocket;

import java.util.List;
import org.java_websocket.drafts.Draft;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface WebSocketFactory {
    WebSocket createWebSocket(WebSocketAdapter webSocketAdapter, List<Draft> list);

    WebSocket createWebSocket(WebSocketAdapter webSocketAdapter, Draft draft);
}
