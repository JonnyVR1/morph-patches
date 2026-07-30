package com.cmic.sso.sdk.p016c;

import com.cmic.sso.sdk.C1316a;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.c */
/* JADX INFO: loaded from: classes.dex */
public class C1350c extends AbstractC1336a {

    /* JADX INFO: renamed from: a */
    private static final String[] f5634a = {"TLSv1.2"};

    /* JADX INFO: renamed from: b */
    private final C1316a f5635b;

    public C1350c(SSLSocketFactory sSLSocketFactory, C1316a c1316a) {
        this.delegate = sSLSocketFactory;
        this.f5635b = c1316a;
    }

    /* JADX INFO: renamed from: a */
    private Socket m7159a(Socket socket) {
        this.f5635b.m6961a("socketip", socket.getLocalAddress().getHostAddress());
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        return m7159a(this.delegate.createSocket());
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
        return m7159a(this.delegate.createSocket(socket, str, i, z));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        return m7159a(this.delegate.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return m7159a(this.delegate.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return m7159a(this.delegate.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return m7159a(this.delegate.createSocket(inetAddress, i, inetAddress2, i2));
    }
}
