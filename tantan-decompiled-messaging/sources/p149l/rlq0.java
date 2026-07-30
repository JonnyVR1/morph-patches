package p149l;

import android.os.Build;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
class rlq0 extends SSLSocketFactory {

    /* JADX INFO: renamed from: b */
    private static final String[] f159995b = {"TLSv1", "TLSv1.1", "TLSv1.2", "TLSv1.3"};

    /* JADX INFO: renamed from: c */
    private static final String[] f159996c = {"TLSv1", "TLSv1.1", "TLSv1.2"};

    /* JADX INFO: renamed from: a */
    final SSLSocketFactory f159997a;

    public rlq0(SSLSocketFactory sSLSocketFactory) {
        this.f159997a = sSLSocketFactory;
    }

    /* JADX INFO: renamed from: a */
    private Socket m179878a(Socket socket) {
        if (socket instanceof SSLSocket) {
            if (Build.VERSION.SDK_INT >= 29) {
                ((SSLSocket) socket).setEnabledProtocols(f159995b);
                return socket;
            }
            ((SSLSocket) socket).setEnabledProtocols(f159996c);
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        return m179878a(this.f159997a.createSocket(str, i));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.f159997a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.f159997a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return m179878a(this.f159997a.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        return m179878a(this.f159997a.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return m179878a(this.f159997a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return m179878a(this.f159997a.createSocket(socket, str, i, z));
    }
}
