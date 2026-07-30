package org.java_websocket.handshake;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public interface Handshakedata {
    byte[] getContent();

    String getFieldValue(String str);

    boolean hasFieldValue(String str);

    Iterator<String> iterateHttpFields();
}
