package org.java_websocket.protocols;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface IProtocol {
    boolean acceptProvidedProtocol(String str);

    IProtocol copyInstance();

    String getProvidedProtocol();

    String toString();
}
