package p153l;

import android.os.Build;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
class xuq0 extends SSLSocketFactory {

    /* JADX INFO: renamed from: b */
    private static final String[] f196307b = {"TLSv1", "TLSv1.1", "TLSv1.2", "TLSv1.3"};

    /* JADX INFO: renamed from: c */
    private static final String[] f196308c = {"TLSv1", "TLSv1.1", "TLSv1.2"};

    /* JADX INFO: renamed from: a */
    final SSLSocketFactory f196309a;

    public xuq0(SSLSocketFactory sSLSocketFactory) {
        this.f196309a = sSLSocketFactory;
    }

    /* JADX INFO: renamed from: a */
    private Socket m213185a(Socket socket) {
        if (socket instanceof SSLSocket) {
            if (Build.VERSION.SDK_INT >= 29) {
                ((SSLSocket) socket).setEnabledProtocols(f196307b);
                return socket;
            }
            ((SSLSocket) socket).setEnabledProtocols(f196308c);
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        return m213185a(this.f196309a.createSocket(str, i));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.f196309a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.f196309a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return m213185a(this.f196309a.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        return m213185a(this.f196309a.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return m213185a(this.f196309a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return m213185a(this.f196309a.createSocket(socket, str, i, z));
    }
}
