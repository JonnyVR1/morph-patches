package org.fourthline.cling.model.message;

import java.net.InetAddress;

/* JADX INFO: loaded from: classes3.dex */
public interface Connection {
    InetAddress getLocalAddress();

    InetAddress getRemoteAddress();

    boolean isOpen();
}
