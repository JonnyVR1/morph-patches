package p149l;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes6.dex */
public final class i8t0 extends SSLSocketFactory {

    /* JADX INFO: renamed from: a */
    public final SSLSocketFactory f112069a = (SSLSocketFactory) SSLSocketFactory.getDefault();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ j8t0 f112070b;

    public i8t0(j8t0 j8t0Var) {
        this.f112070b = j8t0Var;
    }

    /* JADX INFO: renamed from: a */
    public final Socket m134985a(Socket socket) throws SocketException {
        j8t0 j8t0Var = this.f112070b;
        if (j8t0Var.f116802s > 0) {
            socket.setReceiveBufferSize(j8t0Var.f116802s);
        }
        this.f112070b.f116803t.add(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        Socket socketCreateSocket = this.f112069a.createSocket(str, i);
        m134985a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f112069a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f112069a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket socketCreateSocket = this.f112069a.createSocket(str, i, inetAddress, i2);
        m134985a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket socketCreateSocket = this.f112069a.createSocket(inetAddress, i);
        m134985a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket socketCreateSocket = this.f112069a.createSocket(inetAddress, i, inetAddress2, i2);
        m134985a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket socketCreateSocket = this.f112069a.createSocket(socket, str, i, z);
        m134985a(socketCreateSocket);
        return socketCreateSocket;
    }
}
