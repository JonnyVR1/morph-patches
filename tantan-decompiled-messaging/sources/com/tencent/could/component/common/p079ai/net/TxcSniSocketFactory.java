package com.tencent.could.component.common.p079ai.net;

import android.net.SSLCertificateSocketFactory;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p149l.koq0;

/* JADX INFO: loaded from: classes2.dex */
public class TxcSniSocketFactory extends SSLSocketFactory {

    /* JADX INFO: renamed from: a */
    public HostnameVerifier f57331a = HttpsURLConnection.getDefaultHostnameVerifier();

    /* JADX INFO: renamed from: b */
    public HttpsURLConnection f57332b;

    public TxcSniSocketFactory(HttpsURLConnection httpsURLConnection) {
        this.f57332b = httpsURLConnection;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        String requestProperty = this.f57332b.getRequestProperty("Host");
        if (requestProperty != null) {
            str = requestProperty;
        }
        TxNetWorkHelper.getInstance().logError("TxcSniSocketFactory", "customized peerHost host: " + str);
        InetAddress inetAddress = socket.getInetAddress();
        if (z) {
            socket.close();
        }
        SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(0);
        SSLSocket sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket(inetAddress, i);
        sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
        sSLCertificateSocketFactory.setHostname(sSLSocket, str);
        SSLSession session = sSLSocket.getSession();
        HostnameVerifier hostnameVerifier = this.f57332b.getHostnameVerifier();
        if (hostnameVerifier == null) {
            TxNetWorkHelper.getInstance().logError("TxcSniSocketFactory", "current verifier is null, use default verifier.");
            hostnameVerifier = this.f57331a;
        }
        if (hostnameVerifier.verify(str, session)) {
            return sSLSocket;
        }
        koq0.m146754a("Cannot verify hostname: ", str);
        return null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        return null;
    }
}
