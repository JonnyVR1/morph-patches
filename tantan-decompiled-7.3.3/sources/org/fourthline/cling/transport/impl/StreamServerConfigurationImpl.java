package org.fourthline.cling.transport.impl;

import org.fourthline.cling.transport.spi.StreamServerConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public class StreamServerConfigurationImpl implements StreamServerConfiguration {
    private int listenPort;
    private int tcpConnectionBacklog;

    public StreamServerConfigurationImpl(int i) {
        this.listenPort = i;
    }

    @Override // org.fourthline.cling.transport.spi.StreamServerConfiguration
    public int getListenPort() {
        return this.listenPort;
    }

    public int getTcpConnectionBacklog() {
        return this.tcpConnectionBacklog;
    }

    public void setListenPort(int i) {
        this.listenPort = i;
    }

    public void setTcpConnectionBacklog(int i) {
        this.tcpConnectionBacklog = i;
    }

    public StreamServerConfigurationImpl() {
    }
}
