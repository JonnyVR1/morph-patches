package org.eclipse.jetty.p004io.bio;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import org.eclipse.jetty.util.StringUtil;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SocketEndPoint extends StreamEndPoint {
    private static final Logger LOG = Log.getLogger((Class<?>) SocketEndPoint.class);
    final InetSocketAddress _local;
    final InetSocketAddress _remote;
    final Socket _socket;

    public SocketEndPoint(Socket socket, int i) throws IOException {
        super(socket.getInputStream(), socket.getOutputStream());
        this._socket = socket;
        this._local = (InetSocketAddress) socket.getLocalSocketAddress();
        this._remote = (InetSocketAddress) socket.getRemoteSocketAddress();
        socket.setSoTimeout(i > 0 ? i : 0);
        super.setMaxIdleTime(i);
    }

    @Override // org.eclipse.jetty.p004io.bio.StreamEndPoint, org.eclipse.jetty.p004io.EndPoint
    public void close() throws IOException {
        this._socket.close();
        this._in = null;
        this._out = null;
    }

    @Override // org.eclipse.jetty.p004io.bio.StreamEndPoint, org.eclipse.jetty.p004io.EndPoint
    public String getLocalAddr() {
        InetSocketAddress inetSocketAddress = this._local;
        return (inetSocketAddress == null || inetSocketAddress.getAddress() == null || this._local.getAddress().isAnyLocalAddress()) ? StringUtil.ALL_INTERFACES : this._local.getAddress().getHostAddress();
    }

    @Override // org.eclipse.jetty.p004io.bio.StreamEndPoint, org.eclipse.jetty.p004io.EndPoint
    public String getLocalHost() {
        InetSocketAddress inetSocketAddress = this._local;
        return (inetSocketAddress == null || inetSocketAddress.getAddress() == null || this._local.getAddress().isAnyLocalAddress()) ? StringUtil.ALL_INTERFACES : this._local.getAddress().getCanonicalHostName();
    }

    @Override // org.eclipse.jetty.p004io.bio.StreamEndPoint, org.eclipse.jetty.p004io.EndPoint
    public int getLocalPort() {
        InetSocketAddress inetSocketAddress = this._local;
        if (inetSocketAddress == null) {
            return -1;
        }
        return inetSocketAddress.getPort();
    }

    @Override // org.eclipse.jetty.p004io.bio.StreamEndPoint, org.eclipse.jetty.p004io.EndPoint
    public String getRemoteAddr() {
        InetAddress address;
        InetSocketAddress inetSocketAddress = this._remote;
        if (inetSocketAddress == null || (address = inetSocketAddress.getAddress()) == null) {
            return null;
        }
        return address.getHostAddress();
    }

    @Override // org.eclipse.jetty.p004io.bio.StreamEndPoint, org.eclipse.jetty.p004io.EndPoint
    public String getRemoteHost() {
        InetSocketAddress inetSocketAddress = this._remote;
        if (inetSocketAddress == null) {
            return null;
        }
        return inetSocketAddress.getAddress().getCanonicalHostName();
    }

    @Override // org.eclipse.jetty.p004io.bio.StreamEndPoint, org.eclipse.jetty.p004io.EndPoint
    public int getRemotePort() {
        InetSocketAddress inetSocketAddress = this._remote;
        if (inetSocketAddress == null) {
            return -1;
        }
        return inetSocketAddress.getPort();
    }

    @Override // org.eclipse.jetty.p004io.bio.StreamEndPoint, org.eclipse.jetty.p004io.EndPoint
    public Object getTransport() {
        return this._socket;
    }

    @Override // org.eclipse.jetty.p004io.bio.StreamEndPoint
    public void idleExpired() throws IOException {
        try {
            if (isInputShutdown()) {
                return;
            }
            shutdownInput();
        } catch (IOException e) {
            LOG.ignore(e);
            this._socket.close();
        }
    }

    @Override // org.eclipse.jetty.p004io.bio.StreamEndPoint, org.eclipse.jetty.p004io.EndPoint
    public boolean isInputShutdown() {
        Socket socket = this._socket;
        if (socket instanceof SSLSocket) {
            return super.isInputShutdown();
        }
        return socket.isClosed() || this._socket.isInputShutdown();
    }

    @Override // org.eclipse.jetty.p004io.bio.StreamEndPoint, org.eclipse.jetty.p004io.EndPoint
    public boolean isOpen() {
        Socket socket;
        return (!super.isOpen() || (socket = this._socket) == null || socket.isClosed()) ? false : true;
    }

    @Override // org.eclipse.jetty.p004io.bio.StreamEndPoint, org.eclipse.jetty.p004io.EndPoint
    public boolean isOutputShutdown() {
        Socket socket = this._socket;
        if (socket instanceof SSLSocket) {
            return super.isOutputShutdown();
        }
        return socket.isClosed() || this._socket.isOutputShutdown();
    }

    @Override // org.eclipse.jetty.p004io.bio.StreamEndPoint, org.eclipse.jetty.p004io.EndPoint
    public void setMaxIdleTime(int i) throws IOException {
        if (i != getMaxIdleTime()) {
            this._socket.setSoTimeout(i > 0 ? i : 0);
        }
        super.setMaxIdleTime(i);
    }

    @Override // org.eclipse.jetty.p004io.bio.StreamEndPoint, org.eclipse.jetty.p004io.EndPoint
    public void shutdownInput() throws IOException {
        if (this._socket instanceof SSLSocket) {
            super.shutdownInput();
        } else {
            shutdownSocketInput();
        }
    }

    @Override // org.eclipse.jetty.p004io.bio.StreamEndPoint, org.eclipse.jetty.p004io.EndPoint
    public void shutdownOutput() throws IOException {
        if (this._socket instanceof SSLSocket) {
            super.shutdownOutput();
        } else {
            shutdownSocketOutput();
        }
    }

    public void shutdownSocketInput() throws IOException {
        if (this._socket.isClosed()) {
            return;
        }
        if (!this._socket.isInputShutdown()) {
            this._socket.shutdownInput();
        }
        if (this._socket.isOutputShutdown()) {
            this._socket.close();
        }
    }

    public final void shutdownSocketOutput() throws IOException {
        if (this._socket.isClosed()) {
            return;
        }
        if (!this._socket.isOutputShutdown()) {
            this._socket.shutdownOutput();
        }
        if (this._socket.isInputShutdown()) {
            this._socket.close();
        }
    }

    public String toString() {
        return this._local + " <--> " + this._remote;
    }

    public SocketEndPoint(Socket socket) throws IOException {
        super(socket.getInputStream(), socket.getOutputStream());
        this._socket = socket;
        this._local = (InetSocketAddress) socket.getLocalSocketAddress();
        this._remote = (InetSocketAddress) socket.getRemoteSocketAddress();
        super.setMaxIdleTime(socket.getSoTimeout());
    }
}
