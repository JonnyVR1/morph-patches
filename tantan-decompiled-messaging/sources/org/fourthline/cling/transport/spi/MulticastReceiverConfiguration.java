package org.fourthline.cling.transport.spi;

import java.net.InetAddress;

/* JADX INFO: loaded from: classes3.dex */
public interface MulticastReceiverConfiguration {
    InetAddress getGroup();

    int getMaxDatagramBytes();

    int getPort();
}
