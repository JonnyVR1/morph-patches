package org.java_websocket.handshake;

import l.ig3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
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
            ig3.a("http resource descriptor must not be null");
        }
    }
}
