package org.java_websocket.handshake;

import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class HandshakeImpl1Client extends HandshakedataImpl1 implements ClientHandshakeBuilder {
    private String resourceDescriptor = "*";

    @Override // org.java_websocket.handshake.ClientHandshake
    public String getResourceDescriptor() {
        return this.resourceDescriptor;
    }

    @Override // org.java_websocket.handshake.ClientHandshakeBuilder
    public void setResourceDescriptor(String str) throws IllegalArgumentException {
        if (str != null) {
            this.resourceDescriptor = str;
        } else {
            ig3.m135964a("http resource descriptor must not be null");
        }
    }
}
