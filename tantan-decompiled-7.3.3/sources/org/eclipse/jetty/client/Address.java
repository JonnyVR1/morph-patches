package org.eclipse.jetty.client;

import java.net.InetSocketAddress;
import p153l.wg3;

/* JADX INFO: loaded from: classes2.dex */
public class Address {
    private final String host;
    private final int port;

    public Address(String str, int i) {
        if (str == null) {
            wg3.m206174a("Host is null");
            throw null;
        }
        this.host = str.trim();
        this.port = i;
    }

    public static Address from(String str) {
        int iIndexOf = str.indexOf(58);
        int i = 0;
        if (iIndexOf >= 0) {
            String strSubstring = str.substring(0, iIndexOf);
            i = Integer.parseInt(str.substring(iIndexOf + 1));
            str = strSubstring;
        }
        return new Address(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Address address = (Address) obj;
            if (this.host.equals(address.host) && this.port == address.port) {
                return true;
            }
        }
        return false;
    }

    public String getHost() {
        return this.host;
    }

    public int getPort() {
        return this.port;
    }

    public int hashCode() {
        return (this.host.hashCode() * 31) + this.port;
    }

    public InetSocketAddress toSocketAddress() {
        return new InetSocketAddress(getHost(), getPort());
    }

    public String toString() {
        return this.host + ":" + this.port;
    }
}
