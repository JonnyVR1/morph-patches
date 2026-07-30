package org.java_websocket.handshake;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class HandshakeImpl1Server extends HandshakedataImpl1 implements ServerHandshakeBuilder {
    private short httpstatus;
    private String httpstatusmessage;

    @Override // org.java_websocket.handshake.ServerHandshake
    public short getHttpStatus() {
        return this.httpstatus;
    }

    @Override // org.java_websocket.handshake.ServerHandshake
    public String getHttpStatusMessage() {
        return this.httpstatusmessage;
    }

    @Override // org.java_websocket.handshake.ServerHandshakeBuilder
    public void setHttpStatus(short s) {
        this.httpstatus = s;
    }

    @Override // org.java_websocket.handshake.ServerHandshakeBuilder
    public void setHttpStatusMessage(String str) {
        this.httpstatusmessage = str;
    }
}
