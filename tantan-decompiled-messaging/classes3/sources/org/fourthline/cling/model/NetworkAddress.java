package org.fourthline.cling.model;

import java.net.InetAddress;
import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class NetworkAddress {
    protected InetAddress address;
    protected byte[] hardwareAddress;
    protected int port;

    public NetworkAddress(InetAddress inetAddress, int i, byte[] bArr) {
        this.address = inetAddress;
        this.port = i;
        this.hardwareAddress = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkAddress networkAddress = (NetworkAddress) obj;
        return this.port == networkAddress.port && this.address.equals(networkAddress.address) && Arrays.equals(this.hardwareAddress, networkAddress.hardwareAddress);
    }

    public InetAddress getAddress() {
        return this.address;
    }

    public byte[] getHardwareAddress() {
        return this.hardwareAddress;
    }

    public int getPort() {
        return this.port;
    }

    public int hashCode() {
        int iHashCode = ((this.address.hashCode() * 31) + this.port) * 31;
        byte[] bArr = this.hardwareAddress;
        return iHashCode + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public NetworkAddress(InetAddress inetAddress, int i) {
        this(inetAddress, i, null);
    }
}
