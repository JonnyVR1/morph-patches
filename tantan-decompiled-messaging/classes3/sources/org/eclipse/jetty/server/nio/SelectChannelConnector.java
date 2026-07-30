package org.eclipse.jetty.server.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import org.eclipse.jetty.p004io.AsyncEndPoint;
import org.eclipse.jetty.p004io.ConnectedEndPoint;
import org.eclipse.jetty.p004io.Connection;
import org.eclipse.jetty.p004io.EndPoint;
import org.eclipse.jetty.p004io.nio.AsyncConnection;
import org.eclipse.jetty.p004io.nio.SelectChannelEndPoint;
import org.eclipse.jetty.p004io.nio.SelectorManager;
import org.eclipse.jetty.server.AsyncHttpConnection;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.util.thread.ThreadPool;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SelectChannelConnector extends AbstractNIOConnector {
    protected ServerSocketChannel _acceptChannel;
    private int _localPort = -1;
    private int _lowResourcesConnections;
    private int _lowResourcesMaxIdleTime;
    private final SelectorManager _manager;

    public final class ConnectorSelectorManager extends SelectorManager {
        private ConnectorSelectorManager() {
        }

        @Override // org.eclipse.jetty.p004io.nio.SelectorManager
        public boolean dispatch(Runnable runnable) {
            ThreadPool threadPool = SelectChannelConnector.this.getThreadPool();
            if (threadPool == null) {
                threadPool = SelectChannelConnector.this.getServer().getThreadPool();
            }
            return threadPool.dispatch(runnable);
        }

        @Override // org.eclipse.jetty.p004io.nio.SelectorManager
        public void endPointClosed(SelectChannelEndPoint selectChannelEndPoint) {
            SelectChannelConnector.this.endPointClosed(selectChannelEndPoint);
        }

        @Override // org.eclipse.jetty.p004io.nio.SelectorManager
        public void endPointOpened(SelectChannelEndPoint selectChannelEndPoint) {
            SelectChannelConnector.this.connectionOpened(selectChannelEndPoint.getConnection());
        }

        @Override // org.eclipse.jetty.p004io.nio.SelectorManager
        public void endPointUpgraded(ConnectedEndPoint connectedEndPoint, Connection connection) {
            SelectChannelConnector.this.connectionUpgraded(connection, connectedEndPoint.getConnection());
        }

        @Override // org.eclipse.jetty.p004io.nio.SelectorManager
        public AsyncConnection newConnection(SocketChannel socketChannel, AsyncEndPoint asyncEndPoint, Object obj) {
            return SelectChannelConnector.this.newConnection(socketChannel, asyncEndPoint);
        }

        @Override // org.eclipse.jetty.p004io.nio.SelectorManager
        public SelectChannelEndPoint newEndPoint(SocketChannel socketChannel, SelectorManager.SelectSet selectSet, SelectionKey selectionKey) throws IOException {
            return SelectChannelConnector.this.newEndPoint(socketChannel, selectSet, selectionKey);
        }
    }

    public SelectChannelConnector() {
        ConnectorSelectorManager connectorSelectorManager = new ConnectorSelectorManager();
        this._manager = connectorSelectorManager;
        connectorSelectorManager.setMaxIdleTime(getMaxIdleTime());
        addBean(connectorSelectorManager, true);
        setAcceptors(Math.max(1, (Runtime.getRuntime().availableProcessors() + 3) / 4));
    }

    @Override // org.eclipse.jetty.server.AbstractConnector
    public void accept(int i) throws IOException {
        ServerSocketChannel serverSocketChannel;
        synchronized (this) {
            serverSocketChannel = this._acceptChannel;
        }
        if (serverSocketChannel != null && serverSocketChannel.isOpen() && this._manager.isStarted()) {
            SocketChannel socketChannelAccept = serverSocketChannel.accept();
            socketChannelAccept.configureBlocking(false);
            configure(socketChannelAccept.socket());
            this._manager.register(socketChannelAccept);
        }
    }

    @Override // org.eclipse.jetty.server.Connector
    public void close() throws IOException {
        synchronized (this) {
            try {
                ServerSocketChannel serverSocketChannel = this._acceptChannel;
                if (serverSocketChannel != null) {
                    removeBean(serverSocketChannel);
                    if (this._acceptChannel.isOpen()) {
                        this._acceptChannel.close();
                    }
                }
                this._acceptChannel = null;
                this._localPort = -2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.eclipse.jetty.server.AbstractConnector, org.eclipse.jetty.server.Connector
    public void customize(EndPoint endPoint, Request request) throws IOException {
        request.setTimeStamp(System.currentTimeMillis());
        endPoint.setMaxIdleTime(this._maxIdleTime);
        super.customize(endPoint, request);
    }

    @Override // org.eclipse.jetty.server.AbstractConnector, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        this._manager.setSelectSets(getAcceptors());
        this._manager.setMaxIdleTime(getMaxIdleTime());
        this._manager.setLowResourcesConnections(getLowResourcesConnections());
        this._manager.setLowResourcesMaxIdleTime(getLowResourcesMaxIdleTime());
        super.doStart();
    }

    public void endPointClosed(SelectChannelEndPoint selectChannelEndPoint) {
        connectionClosed(selectChannelEndPoint.getConnection());
    }

    @Override // org.eclipse.jetty.server.Connector
    public synchronized Object getConnection() {
        return this._acceptChannel;
    }

    @Override // org.eclipse.jetty.server.Connector
    public int getLocalPort() {
        int i;
        synchronized (this) {
            i = this._localPort;
        }
        return i;
    }

    public int getLowResourcesConnections() {
        return this._lowResourcesConnections;
    }

    @Override // org.eclipse.jetty.server.AbstractConnector
    public int getLowResourcesMaxIdleTime() {
        return this._lowResourcesMaxIdleTime;
    }

    public SelectorManager getSelectorManager() {
        return this._manager;
    }

    public AsyncConnection newConnection(SocketChannel socketChannel, AsyncEndPoint asyncEndPoint) {
        return new AsyncHttpConnection(this, asyncEndPoint, getServer());
    }

    public SelectChannelEndPoint newEndPoint(SocketChannel socketChannel, SelectorManager.SelectSet selectSet, SelectionKey selectionKey) throws IOException {
        SelectChannelEndPoint selectChannelEndPoint = new SelectChannelEndPoint(socketChannel, selectSet, selectionKey, this._maxIdleTime);
        selectChannelEndPoint.setConnection(selectSet.getManager().newConnection(socketChannel, selectChannelEndPoint, selectionKey.attachment()));
        return selectChannelEndPoint;
    }

    public void open() throws IOException {
        synchronized (this) {
            try {
                if (this._acceptChannel == null) {
                    ServerSocketChannel serverSocketChannelOpen = ServerSocketChannel.open();
                    this._acceptChannel = serverSocketChannelOpen;
                    serverSocketChannelOpen.configureBlocking(true);
                    this._acceptChannel.socket().setReuseAddress(getReuseAddress());
                    this._acceptChannel.socket().bind(getHost() == null ? new InetSocketAddress(getPort()) : new InetSocketAddress(getHost(), getPort()), getAcceptQueueSize());
                    int localPort = this._acceptChannel.socket().getLocalPort();
                    this._localPort = localPort;
                    if (localPort <= 0) {
                        throw new IOException("Server channel not bound");
                    }
                    addBean(this._acceptChannel);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.eclipse.jetty.server.AbstractConnector, org.eclipse.jetty.server.Connector
    public void persist(EndPoint endPoint) throws IOException {
        ((AsyncEndPoint) endPoint).setCheckForIdle(true);
        super.persist(endPoint);
    }

    public void setLowResourcesConnections(int i) {
        this._lowResourcesConnections = i;
    }

    @Override // org.eclipse.jetty.server.AbstractConnector
    public void setLowResourcesMaxIdleTime(int i) {
        this._lowResourcesMaxIdleTime = i;
        super.setLowResourcesMaxIdleTime(i);
    }

    @Override // org.eclipse.jetty.server.AbstractConnector, org.eclipse.jetty.server.Connector
    public void setMaxIdleTime(int i) {
        this._manager.setMaxIdleTime(i);
        super.setMaxIdleTime(i);
    }

    @Override // org.eclipse.jetty.server.AbstractConnector
    public void setThreadPool(ThreadPool threadPool) {
        super.setThreadPool(threadPool);
        removeBean(this._manager);
        addBean(this._manager, true);
    }
}
