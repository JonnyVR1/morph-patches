package p153l;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes5.dex */
public class ocr extends SocketFactory {
    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        Socket socket = new Socket();
        socket.connect(new InetSocketAddress(str, i), 10000);
        socket.setSoTimeout(0);
        return socket;
    }

    @Override // javax.net.SocketFactory
    @Deprecated
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        throw new IOException("unsupport");
    }

    @Override // javax.net.SocketFactory
    @Deprecated
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        throw new IOException("unsupport");
    }

    @Override // javax.net.SocketFactory
    @Deprecated
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        throw new IOException("unsupport");
    }
}
