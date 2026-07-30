package com.cosmos.photon.baseim.p025im;

/* JADX INFO: loaded from: classes.dex */
public class Address {
    private String host;
    private int port;

    public Address(String str, int i) {
        this.host = str;
        this.port = i;
    }

    public String getHost() {
        return this.host;
    }

    public int getPort() {
        return this.port;
    }

    public void setHost(String str) {
        this.host = str;
    }

    public void setPort(int i) {
        this.port = i;
    }

    public String toString() {
        return "Address{host='" + this.host + "', port=" + this.port + '}';
    }

    public Address() {
    }
}
