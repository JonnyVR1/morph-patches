package p153l;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes6.dex */
public final class oht0 extends SSLSocketFactory {

    /* JADX INFO: renamed from: a */
    public final SSLSocketFactory f147485a = (SSLSocketFactory) SSLSocketFactory.getDefault();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pht0 f147486b;

    public oht0(pht0 pht0Var) {
        this.f147486b = pht0Var;
    }

    /* JADX INFO: renamed from: a */
    public final Socket m167741a(Socket socket) throws SocketException {
        pht0 pht0Var = this.f147486b;
        if (pht0Var.f152488s > 0) {
            socket.setReceiveBufferSize(pht0Var.f152488s);
        }
        this.f147486b.f152489t.add(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        Socket socketCreateSocket = this.f147485a.createSocket(str, i);
        m167741a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f147485a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f147485a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket socketCreateSocket = this.f147485a.createSocket(str, i, inetAddress, i2);
        m167741a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket socketCreateSocket = this.f147485a.createSocket(inetAddress, i);
        m167741a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket socketCreateSocket = this.f147485a.createSocket(inetAddress, i, inetAddress2, i2);
        m167741a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket socketCreateSocket = this.f147485a.createSocket(socket, str, i, z);
        m167741a(socketCreateSocket);
        return socketCreateSocket;
    }
}
