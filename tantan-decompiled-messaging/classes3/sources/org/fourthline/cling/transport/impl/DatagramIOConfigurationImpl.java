package org.fourthline.cling.transport.impl;

import org.fourthline.cling.transport.spi.DatagramIOConfiguration;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DatagramIOConfigurationImpl implements DatagramIOConfiguration {
    private int maxDatagramBytes;
    private int timeToLive;

    public DatagramIOConfigurationImpl() {
        this.timeToLive = 4;
        this.maxDatagramBytes = 640;
    }

    @Override // org.fourthline.cling.transport.spi.DatagramIOConfiguration
    public int getMaxDatagramBytes() {
        return this.maxDatagramBytes;
    }

    @Override // org.fourthline.cling.transport.spi.DatagramIOConfiguration
    public int getTimeToLive() {
        return this.timeToLive;
    }

    public void setMaxDatagramBytes(int i) {
        this.maxDatagramBytes = i;
    }

    public void setTimeToLive(int i) {
        this.timeToLive = i;
    }

    public DatagramIOConfigurationImpl(int i, int i2) {
        this.timeToLive = i;
        this.maxDatagramBytes = i2;
    }
}
