package org.eclipse.jetty.client;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.nio.channels.UnresolvedAddressException;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SSLEngine;
import org.eclipse.jetty.p127io.AsyncEndPoint;
import org.eclipse.jetty.p127io.Buffer;
import org.eclipse.jetty.p127io.ConnectedEndPoint;
import org.eclipse.jetty.p127io.Connection;
import org.eclipse.jetty.p127io.nio.AsyncConnection;
import org.eclipse.jetty.p127io.nio.SelectChannelEndPoint;
import org.eclipse.jetty.p127io.nio.SelectorManager;
import org.eclipse.jetty.p127io.nio.SslConnection;
import org.eclipse.jetty.util.component.AggregateLifeCycle;
import org.eclipse.jetty.util.component.Dumpable;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.eclipse.jetty.util.ssl.SslContextFactory;
import org.eclipse.jetty.util.thread.Timeout;

/* JADX INFO: loaded from: classes2.dex */
class SelectConnector extends AggregateLifeCycle implements HttpClient.Connector, Dumpable {
    private static final Logger LOG = Log.getLogger((Class<?>) SelectConnector.class);
    private final Map<SocketChannel, Timeout.Task> _connectingChannels;
    private final HttpClient _httpClient;
    private final Manager _selectorManager;

    public class ConnectTimeout extends Timeout.Task {
        private final SocketChannel channel;
        private final HttpDestination destination;

        public ConnectTimeout(SocketChannel socketChannel, HttpDestination httpDestination) {
            this.channel = socketChannel;
            this.destination = httpDestination;
        }

        @Override // org.eclipse.jetty.util.thread.Timeout.Task
        public void expired() {
            if (this.channel.isConnectionPending()) {
                SelectConnector.LOG.debug("Channel {} timed out while connecting, closing it", this.channel);
                try {
                    this.channel.close();
                } catch (IOException e) {
                    SelectConnector.LOG.ignore(e);
                }
                this.destination.onConnectionFailed(new SocketTimeoutException());
            }
        }
    }

    public class Manager extends SelectorManager {
        Logger LOG = SelectConnector.LOG;

        public Manager() {
        }

        private synchronized SSLEngine newSslEngine(SocketChannel socketChannel) throws IOException {
            SSLEngine sSLEngineNewSslEngine;
            try {
                SslContextFactory sslContextFactory = SelectConnector.this._httpClient.getSslContextFactory();
                sSLEngineNewSslEngine = socketChannel != null ? sslContextFactory.newSslEngine(socketChannel.socket().getInetAddress().getHostAddress(), socketChannel.socket().getPort()) : sslContextFactory.newSslEngine();
                sSLEngineNewSslEngine.setUseClientMode(true);
                sSLEngineNewSslEngine.beginHandshake();
            } catch (Throwable th) {
                throw th;
            }
            return sSLEngineNewSslEngine;
        }

        @Override // org.eclipse.jetty.p127io.nio.SelectorManager
        public void connectionFailed(SocketChannel socketChannel, Throwable th, Object obj) {
            Timeout.Task task = (Timeout.Task) SelectConnector.this._connectingChannels.remove(socketChannel);
            if (task != null) {
                task.cancel();
            }
            if (obj instanceof HttpDestination) {
                ((HttpDestination) obj).onConnectionFailed(th);
            } else {
                super.connectionFailed(socketChannel, th, obj);
            }
        }

        @Override // org.eclipse.jetty.p127io.nio.SelectorManager
        public boolean dispatch(Runnable runnable) {
            return SelectConnector.this._httpClient._threadPool.dispatch(runnable);
        }

        @Override // org.eclipse.jetty.p127io.nio.SelectorManager
        public void endPointClosed(SelectChannelEndPoint selectChannelEndPoint) {
        }

        @Override // org.eclipse.jetty.p127io.nio.SelectorManager
        public void endPointOpened(SelectChannelEndPoint selectChannelEndPoint) {
        }

        @Override // org.eclipse.jetty.p127io.nio.SelectorManager
        public void endPointUpgraded(ConnectedEndPoint connectedEndPoint, Connection connection) {
        }

        @Override // org.eclipse.jetty.p127io.nio.SelectorManager
        public AsyncConnection newConnection(SocketChannel socketChannel, AsyncEndPoint asyncEndPoint, Object obj) {
            return new AsyncHttpConnection(SelectConnector.this._httpClient.getRequestBuffers(), SelectConnector.this._httpClient.getResponseBuffers(), asyncEndPoint);
        }

        @Override // org.eclipse.jetty.p127io.nio.SelectorManager
        public SelectChannelEndPoint newEndPoint(SocketChannel socketChannel, SelectorManager.SelectSet selectSet, SelectionKey selectionKey) throws IOException {
            AsyncEndPoint upgradableEndPoint;
            Timeout.Task task = (Timeout.Task) SelectConnector.this._connectingChannels.remove(socketChannel);
            if (task != null) {
                task.cancel();
            }
            if (this.LOG.isDebugEnabled()) {
                this.LOG.debug("Channels with connection pending: {}", Integer.valueOf(SelectConnector.this._connectingChannels.size()));
            }
            HttpDestination httpDestination = (HttpDestination) selectionKey.attachment();
            SelectChannelEndPoint selectChannelEndPoint = new SelectChannelEndPoint(socketChannel, selectSet, selectionKey, (int) SelectConnector.this._httpClient.getIdleTimeout());
            if (httpDestination.isSecure()) {
                this.LOG.debug("secure to {}, proxied={}", socketChannel, Boolean.valueOf(httpDestination.isProxied()));
                upgradableEndPoint = new UpgradableEndPoint(selectChannelEndPoint, newSslEngine(socketChannel));
            } else {
                upgradableEndPoint = selectChannelEndPoint;
            }
            Connection connectionNewConnection = selectSet.getManager().newConnection(socketChannel, upgradableEndPoint, selectionKey.attachment());
            upgradableEndPoint.setConnection(connectionNewConnection);
            AbstractHttpConnection abstractHttpConnection = (AbstractHttpConnection) connectionNewConnection;
            abstractHttpConnection.setDestination(httpDestination);
            if (httpDestination.isSecure() && !httpDestination.isProxied()) {
                ((UpgradableEndPoint) upgradableEndPoint).upgrade();
            }
            httpDestination.onNewConnection(abstractHttpConnection);
            return selectChannelEndPoint;
        }
    }

    public SelectConnector(HttpClient httpClient) {
        Manager manager = new Manager();
        this._selectorManager = manager;
        this._connectingChannels = new ConcurrentHashMap();
        this._httpClient = httpClient;
        addBean(httpClient, false);
        addBean(manager, true);
    }

    @Override // org.eclipse.jetty.client.HttpClient.Connector
    public void startConnection(HttpDestination httpDestination) throws IOException {
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            SocketChannel socketChannelOpen = SocketChannel.open();
            Address proxy = httpDestination.isProxied() ? httpDestination.getProxy() : httpDestination.getAddress();
            socketChannelOpen.socket().setTcpNoDelay(true);
            if (this._httpClient.isConnectBlocking()) {
                socketChannelOpen.socket().connect(proxy.toSocketAddress(), this._httpClient.getConnectTimeout());
                socketChannelOpen.configureBlocking(false);
                this._selectorManager.register(socketChannelOpen, httpDestination);
                return;
            }
            socketChannelOpen.configureBlocking(false);
            socketChannelOpen.connect(proxy.toSocketAddress());
            this._selectorManager.register(socketChannelOpen, httpDestination);
            ConnectTimeout connectTimeout = new ConnectTimeout(socketChannelOpen, httpDestination);
            HttpClient httpClient = this._httpClient;
            httpClient.schedule(connectTimeout, httpClient.getConnectTimeout());
            this._connectingChannels.put(socketChannelOpen, connectTimeout);
        } catch (IOException e) {
            if (0 != 0) {
                abstractInterruptibleChannel.close();
            }
            httpDestination.onConnectionFailed(e);
        } catch (UnresolvedAddressException e2) {
            if (0 != 0) {
                abstractInterruptibleChannel.close();
            }
            httpDestination.onConnectionFailed(e2);
        }
    }

    public static class UpgradableEndPoint implements AsyncEndPoint {
        AsyncEndPoint _endp;
        SSLEngine _engine;

        public UpgradableEndPoint(AsyncEndPoint asyncEndPoint, SSLEngine sSLEngine) throws IOException {
            this._engine = sSLEngine;
            this._endp = asyncEndPoint;
        }

        @Override // org.eclipse.jetty.p127io.AsyncEndPoint
        public void asyncDispatch() {
            this._endp.asyncDispatch();
        }

        @Override // org.eclipse.jetty.p127io.EndPoint
        public boolean blockReadable(long j) throws IOException {
            return this._endp.blockReadable(j);
        }

        @Override // org.eclipse.jetty.p127io.EndPoint
        public boolean blockWritable(long j) throws IOException {
            return this._endp.blockWritable(j);
        }

        @Override // org.eclipse.jetty.p127io.AsyncEndPoint
        public void cancelTimeout(Timeout.Task task) {
            this._endp.cancelTimeout(task);
        }

        @Override // org.eclipse.jetty.p127io.EndPoint
        public void close() throws IOException {
            this._endp.close();
        }

        @Override // org.eclipse.jetty.p127io.AsyncEndPoint
        public void dispatch() {
            this._endp.asyncDispatch();
        }

        @Override // org.eclipse.jetty.p127io.EndPoint
        public int fill(Buffer buffer) throws IOException {
            return this._endp.fill(buffer);
        }

        @Override // org.eclipse.jetty.p127io.EndPoint
        public int flush(Buffer buffer) throws IOException {
            return this._endp.flush(buffer);
        }

        @Override // org.eclipse.jetty.p127io.ConnectedEndPoint
        public Connection getConnection() {
            return this._endp.getConnection();
        }

        @Override // org.eclipse.jetty.p127io.EndPoint
        public String getLocalAddr() {
            return this._endp.getLocalAddr();
        }

        @Override // org.eclipse.jetty.p127io.EndPoint
        public String getLocalHost() {
            return this._endp.getLocalHost();
        }

        @Override // org.eclipse.jetty.p127io.EndPoint
        public int getLocalPort() {
            return this._endp.getLocalPort();
        }

        @Override // org.eclipse.jetty.p127io.EndPoint
        public int getMaxIdleTime() {
            return this._endp.getMaxIdleTime();
        }

        @Override // org.eclipse.jetty.p127io.EndPoint
        public String getRemoteAddr() {
            return this._endp.getRemoteAddr();
        }

        @Override // org.eclipse.jetty.p127io.EndPoint
        public String getRemoteHost() {
            return this._endp.getRemoteHost();
        }

        @Override // org.eclipse.jetty.p127io.EndPoint
        public int getRemotePort() {
            return this._endp.getRemotePort();
        }

        @Override // org.eclipse.jetty.p127io.EndPoint
        public Object getTransport() {
            return this._endp.getTransport();
        }

        @Override // org.eclipse.jetty.p127io.AsyncEndPoint
        public boolean hasProgressed() {
            return this._endp.hasProgressed();
        }

        @Override // org.eclipse.jetty.p127io.EndPoint
        public boolean isBlocking() {
            return this._endp.isBlocking();
        }

        @Override // org.eclipse.jetty.p127io.AsyncEndPoint
        public boolean isCheckForIdle() {
            return this._endp.isCheckForIdle();
        }

        @Override // org.eclipse.jetty.p127io.EndPoint
        public boolean isInputShutdown() {
            return this._endp.isInputShutdown();
        }

        @Override // org.eclipse.jetty.p127io.EndPoint
        public boolean isOpen() {
            return this._endp.isOpen();
        }

        @Override // org.eclipse.jetty.p127io.EndPoint
        public boolean isOutputShutdown() {
            return this._endp.isOutputShutdown();
        }

        @Override // org.eclipse.jetty.p127io.AsyncEndPoint
        public boolean isWritable() {
            return this._endp.isWritable();
        }

        @Override // org.eclipse.jetty.p127io.AsyncEndPoint
        public void onIdleExpired(long j) {
            this._endp.onIdleExpired(j);
        }

        @Override // org.eclipse.jetty.p127io.AsyncEndPoint
        public void scheduleTimeout(Timeout.Task task, long j) {
            this._endp.scheduleTimeout(task, j);
        }

        @Override // org.eclipse.jetty.p127io.AsyncEndPoint
        public void scheduleWrite() {
            this._endp.scheduleWrite();
        }

        @Override // org.eclipse.jetty.p127io.AsyncEndPoint
        public void setCheckForIdle(boolean z) {
            this._endp.setCheckForIdle(z);
        }

        @Override // org.eclipse.jetty.p127io.ConnectedEndPoint
        public void setConnection(Connection connection) {
            this._endp.setConnection(connection);
        }

        @Override // org.eclipse.jetty.p127io.EndPoint
        public void setMaxIdleTime(int i) throws IOException {
            this._endp.setMaxIdleTime(i);
        }

        @Override // org.eclipse.jetty.p127io.EndPoint
        public void shutdownInput() throws IOException {
            this._endp.shutdownInput();
        }

        @Override // org.eclipse.jetty.p127io.EndPoint
        public void shutdownOutput() throws IOException {
            this._endp.shutdownOutput();
        }

        public String toString() {
            return "Upgradable:" + this._endp.toString();
        }

        public void upgrade() {
            AsyncHttpConnection asyncHttpConnection = (AsyncHttpConnection) this._endp.getConnection();
            SslConnection sslConnection = new SslConnection(this._engine, this._endp);
            this._endp.setConnection(sslConnection);
            this._endp = sslConnection.getSslEndPoint();
            sslConnection.getSslEndPoint().setConnection(asyncHttpConnection);
            SelectConnector.LOG.debug("upgrade {} to {} for {}", this, sslConnection, asyncHttpConnection);
        }

        @Override // org.eclipse.jetty.p127io.EndPoint
        public int flush(Buffer buffer, Buffer buffer2, Buffer buffer3) throws IOException {
            return this._endp.flush(buffer, buffer2, buffer3);
        }

        @Override // org.eclipse.jetty.p127io.EndPoint
        public void flush() throws IOException {
            this._endp.flush();
        }
    }
}
