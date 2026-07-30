package com.cmic.sso.sdk.p016c;

import android.net.Network;
import android.net.SSLCertificateSocketFactory;
import com.cmic.sso.sdk.C1316a;
import com.cmic.sso.sdk.p022e.C1363c;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import p149l.koq0;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.d */
/* JADX INFO: loaded from: classes.dex */
public class C1355d extends AbstractC1336a {

    /* JADX INFO: renamed from: b */
    private static final String[] f5654b = {"TLSv1.2"};

    /* JADX INFO: renamed from: d */
    private final HttpsURLConnection f5657d;

    /* JADX INFO: renamed from: e */
    private final Network f5658e;

    /* JADX INFO: renamed from: f */
    private final C1316a f5659f;

    /* JADX INFO: renamed from: c */
    private final String f5656c = C1355d.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    HostnameVerifier f5655a = HttpsURLConnection.getDefaultHostnameVerifier();

    public C1355d(HttpsURLConnection httpsURLConnection, Network network, C1316a c1316a) {
        this.f5657d = httpsURLConnection;
        this.f5658e = network;
        this.f5659f = c1316a;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        String requestProperty = this.f5657d.getRequestProperty("Host");
        if (requestProperty != null) {
            str = requestProperty;
        }
        C1363c.m7234b(this.f5656c, "customized createSocket. host: " + str);
        C1363c.m7234b(this.f5656c, "plainSocket localAddress: " + socket.getLocalAddress().getHostAddress());
        if (z) {
            C1363c.m7234b(this.f5656c, "plainSocket close");
            socket.close();
        }
        SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(0);
        SSLSocket sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket();
        Network network = this.f5658e;
        if (network != null) {
            network.bindSocket(sSLSocket);
        }
        sSLSocket.connect(socket.getRemoteSocketAddress());
        this.f5659f.m6961a("socketip", sSLSocket.getLocalAddress().getHostAddress());
        sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
        C1363c.m7234b(this.f5656c, "Setting SNI hostname");
        sSLCertificateSocketFactory.setHostname(sSLSocket, str);
        SSLSession session = sSLSocket.getSession();
        if (!this.f5655a.verify(str, session)) {
            koq0.m146754a("Cannot verify hostname: ", str);
            return null;
        }
        C1363c.m7234b(this.f5656c, "Established " + session.getProtocol() + " connection with " + session.getPeerHost() + " using " + session.getCipherSuite());
        return sSLSocket;
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
}
