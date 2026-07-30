package org.java_websocket;

import org.java_websocket.drafts.Draft;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.framing.Framedata;
import org.java_websocket.framing.PingFrame;
import org.java_websocket.framing.PongFrame;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.handshake.HandshakeImpl1Server;
import org.java_websocket.handshake.ServerHandshake;
import org.java_websocket.handshake.ServerHandshakeBuilder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class WebSocketAdapter implements WebSocketListener {
    @Override // org.java_websocket.WebSocketListener
    public void onWebsocketHandshakeReceivedAsClient(WebSocket webSocket, ClientHandshake clientHandshake, ServerHandshake serverHandshake) throws InvalidDataException {
    }

    @Override // org.java_websocket.WebSocketListener
    public ServerHandshakeBuilder onWebsocketHandshakeReceivedAsServer(WebSocket webSocket, Draft draft, ClientHandshake clientHandshake) throws InvalidDataException {
        return new HandshakeImpl1Server();
    }

    @Override // org.java_websocket.WebSocketListener
    public void onWebsocketHandshakeSentAsClient(WebSocket webSocket, ClientHandshake clientHandshake) throws InvalidDataException {
    }

    @Override // org.java_websocket.WebSocketListener
    @Deprecated
    public void onWebsocketMessageFragment(WebSocket webSocket, Framedata framedata) {
    }

    @Override // org.java_websocket.WebSocketListener
    public void onWebsocketPing(WebSocket webSocket, Framedata framedata) {
        webSocket.sendFrame(new PongFrame((PingFrame) framedata));
    }

    @Override // org.java_websocket.WebSocketListener
    public void onWebsocketPong(WebSocket webSocket, Framedata framedata) {
    }
}
