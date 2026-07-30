package com.cmic.sso.sdk.p017c;

import com.cmic.sso.sdk.C1339a;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.c */
/* JADX INFO: loaded from: classes.dex */
public class C1373c extends AbstractC1359a {

    /* JADX INFO: renamed from: a */
    private static final String[] f5671a = {"TLSv1.2"};

    /* JADX INFO: renamed from: b */
    private final C1339a f5672b;

    public C1373c(SSLSocketFactory sSLSocketFactory, C1339a c1339a) {
        this.delegate = sSLSocketFactory;
        this.f5672b = c1339a;
    }

    /* JADX INFO: renamed from: a */
    private Socket m7213a(Socket socket) {
        this.f5672b.m7015a("socketip", socket.getLocalAddress().getHostAddress());
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        return m7213a(this.delegate.createSocket());
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    public String toString() {
        return "Tls12SocketFactory";
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return m7213a(this.delegate.createSocket(socket, str, i, z));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        return m7213a(this.delegate.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return m7213a(this.delegate.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return m7213a(this.delegate.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return m7213a(this.delegate.createSocket(inetAddress, i, inetAddress2, i2));
    }
}
