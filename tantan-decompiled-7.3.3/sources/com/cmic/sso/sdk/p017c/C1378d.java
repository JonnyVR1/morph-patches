package com.cmic.sso.sdk.p017c;

import android.net.Network;
import android.net.SSLCertificateSocketFactory;
import com.cmic.sso.sdk.C1339a;
import com.cmic.sso.sdk.p023e.C1386c;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import p153l.qxq0;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.d */
/* JADX INFO: loaded from: classes.dex */
public class C1378d extends AbstractC1359a {

    /* JADX INFO: renamed from: b */
    private static final String[] f5691b = {"TLSv1.2"};

    /* JADX INFO: renamed from: d */
    private final HttpsURLConnection f5694d;

    /* JADX INFO: renamed from: e */
    private final Network f5695e;

    /* JADX INFO: renamed from: f */
    private final C1339a f5696f;

    /* JADX INFO: renamed from: c */
    private final String f5693c = C1378d.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    HostnameVerifier f5692a = HttpsURLConnection.getDefaultHostnameVerifier();

    public C1378d(HttpsURLConnection httpsURLConnection, Network network, C1339a c1339a) {
        this.f5694d = httpsURLConnection;
        this.f5695e = network;
        this.f5696f = c1339a;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        String requestProperty = this.f5694d.getRequestProperty("Host");
        if (requestProperty != null) {
            str = requestProperty;
        }
        C1386c.m7288b(this.f5693c, "customized createSocket. host: " + str);
        C1386c.m7288b(this.f5693c, "plainSocket localAddress: " + socket.getLocalAddress().getHostAddress());
        if (z) {
            C1386c.m7288b(this.f5693c, "plainSocket close");
            socket.close();
        }
        SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(0);
        SSLSocket sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket();
        Network network = this.f5695e;
        if (network != null) {
            network.bindSocket(sSLSocket);
        }
        sSLSocket.connect(socket.getRemoteSocketAddress());
        this.f5696f.m7015a("socketip", sSLSocket.getLocalAddress().getHostAddress());
        sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
        C1386c.m7288b(this.f5693c, "Setting SNI hostname");
        sSLCertificateSocketFactory.setHostname(sSLSocket, str);
        SSLSession session = sSLSocket.getSession();
        if (!this.f5692a.verify(str, session)) {
            qxq0.m178615a("Cannot verify hostname: ", str);
            return null;
        }
        C1386c.m7288b(this.f5693c, "Established " + session.getProtocol() + " connection with " + session.getPeerHost() + " using " + session.getCipherSuite());
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
