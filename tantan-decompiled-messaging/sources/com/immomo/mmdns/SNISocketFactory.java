package com.immomo.mmdns;

import android.net.SSLCertificateSocketFactory;
import com.cosmos.mdlog.MDLog;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: loaded from: classes7.dex */
public class SNISocketFactory extends SSLSocketFactory implements RealConnection.WithSniInfo {
    private boolean configureTlsExtensions = false;
    private KeyManager[] mKeyManagers;
    private String peerHost;
    private TrustManager[] trustManager;

    public SNISocketFactory(String str, TrustManager[] trustManagerArr, KeyManager[] keyManagerArr) {
        this.peerHost = str;
        this.trustManager = trustManagerArr;
        this.mKeyManagers = keyManagerArr;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        if (this.peerHost == null) {
            this.peerHost = str;
        }
        MDLog.m7389d(LogTag.DNS, "customized createSocket. host: " + this.peerHost);
        InetAddress inetAddress = socket.getInetAddress();
        if (z) {
            socket.close();
        }
        SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(0, MDDNSEntrance.getSslSessionCache());
        TrustManager[] trustManagerArr = this.trustManager;
        if (trustManagerArr != null) {
            sSLCertificateSocketFactory.setTrustManagers(trustManagerArr);
        }
        KeyManager[] keyManagerArr = this.mKeyManagers;
        if (keyManagerArr != null) {
            sSLCertificateSocketFactory.setKeyManagers(keyManagerArr);
        }
        SSLSocket sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket(inetAddress, i);
        sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
        if (this.configureTlsExtensions) {
            sSLCertificateSocketFactory.setHostname(sSLSocket, this.peerHost);
            if (!HttpsURLConnection.getDefaultHostnameVerifier().verify(this.peerHost, sSLSocket.getSession())) {
                throw new SSLPeerUnverifiedException("Cannot verify hostname: " + this.peerHost);
            }
        }
        return sSLSocket;
    }

    public void enableConfigureTlsExtensions() {
        this.configureTlsExtensions = true;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    public String getSniHostname() {
        return this.peerHost;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        return super.createSocket();
    }
}
