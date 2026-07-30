package org.fourthline.cling.transport.impl;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.fourthline.cling.transport.spi.MulticastReceiverConfiguration;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MulticastReceiverConfigurationImpl implements MulticastReceiverConfiguration {
    private InetAddress group;
    private int maxDatagramBytes;
    private int port;

    public MulticastReceiverConfigurationImpl(InetAddress inetAddress, int i, int i2) {
        this.group = inetAddress;
        this.port = i;
        this.maxDatagramBytes = i2;
    }

    @Override // org.fourthline.cling.transport.spi.MulticastReceiverConfiguration
    public InetAddress getGroup() {
        return this.group;
    }

    @Override // org.fourthline.cling.transport.spi.MulticastReceiverConfiguration
    public int getMaxDatagramBytes() {
        return this.maxDatagramBytes;
    }

    @Override // org.fourthline.cling.transport.spi.MulticastReceiverConfiguration
    public int getPort() {
        return this.port;
    }

    public void setGroup(InetAddress inetAddress) {
        this.group = inetAddress;
    }

    public void setMaxDatagramBytes(int i) {
        this.maxDatagramBytes = i;
    }

    public void setPort(int i) {
        this.port = i;
    }

    public MulticastReceiverConfigurationImpl(InetAddress inetAddress, int i) {
        this(inetAddress, i, 640);
    }

    public MulticastReceiverConfigurationImpl(String str, int i, int i2) throws UnknownHostException {
        this(InetAddress.getByName(str), i, i2);
    }

    public MulticastReceiverConfigurationImpl(String str, int i) throws UnknownHostException {
        this(InetAddress.getByName(str), i, 640);
    }
}
