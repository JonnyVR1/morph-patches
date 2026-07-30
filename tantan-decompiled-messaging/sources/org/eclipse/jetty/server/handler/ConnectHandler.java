package org.eclipse.jetty.server.handler;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.http.HttpMethods;
import org.eclipse.jetty.http.HttpParser;
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.p123io.AsyncEndPoint;
import org.eclipse.jetty.p123io.Buffer;
import org.eclipse.jetty.p123io.ConnectedEndPoint;
import org.eclipse.jetty.p123io.Connection;
import org.eclipse.jetty.p123io.EndPoint;
import org.eclipse.jetty.p123io.nio.AsyncConnection;
import org.eclipse.jetty.p123io.nio.IndirectNIOBuffer;
import org.eclipse.jetty.p123io.nio.SelectChannelEndPoint;
import org.eclipse.jetty.p123io.nio.SelectorManager;
import org.eclipse.jetty.server.AbstractHttpConnection;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.HostMap;
import org.eclipse.jetty.util.TypeUtil;
import org.eclipse.jetty.util.component.AggregateLifeCycle;
import org.eclipse.jetty.util.component.LifeCycle;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.eclipse.jetty.util.thread.ThreadPool;
import org.slf4j.Marker;
import p149l.rhg0;

/* JADX INFO: loaded from: classes3.dex */
public class ConnectHandler extends HandlerWrapper {
    private static final Logger LOG = Log.getLogger((Class<?>) ConnectHandler.class);
    private HostMap<String> _black;
    private volatile int _connectTimeout;
    private volatile boolean _privateThreadPool;
    private final SelectorManager _selectorManager;
    private volatile ThreadPool _threadPool;
    private HostMap<String> _white;
    private volatile int _writeTimeout;

    public class ClientToProxyConnection implements AsyncConnection {
        private final SocketChannel _channel;
        private final ConcurrentMap<String, Object> _context;
        private final EndPoint _endPoint;
        private final long _timestamp;
        private volatile ProxyToServerConnection _toServer;
        private final Buffer _buffer = new IndirectNIOBuffer(4096);
        private boolean _firstTime = true;

        public ClientToProxyConnection(ConcurrentMap<String, Object> concurrentMap, SocketChannel socketChannel, EndPoint endPoint, long j) {
            this._context = concurrentMap;
            this._channel = socketChannel;
            this._endPoint = endPoint;
            this._timestamp = j;
        }

        public void close() {
            try {
                closeClient();
            } catch (IOException e) {
                ConnectHandler.LOG.debug(this + ": unexpected exception closing the client", e);
            }
            try {
                closeServer();
            } catch (IOException e2) {
                ConnectHandler.LOG.debug(this + ": unexpected exception closing the server", e2);
            }
        }

        public void closeClient() throws IOException {
            this._endPoint.close();
        }

        public void closeServer() throws IOException {
            this._toServer.closeServer();
        }

        @Override // org.eclipse.jetty.p123io.Connection
        public long getTimeStamp() {
            return this._timestamp;
        }

        @Override // org.eclipse.jetty.p123io.Connection
        public Connection handle() throws IOException {
            ConnectHandler.LOG.debug("{}: begin reading from client", this);
            try {
                try {
                    if (this._firstTime) {
                        this._firstTime = false;
                        ConnectHandler.this.register(this._channel, this._toServer);
                        ConnectHandler.LOG.debug("{}: registered channel {} with connection {}", this, this._channel, this._toServer);
                    }
                    while (true) {
                        int i = ConnectHandler.this.read(this._endPoint, this._buffer, this._context);
                        if (i == -1) {
                            ConnectHandler.LOG.debug("{}: client closed connection {}", this, this._endPoint);
                            if (!this._endPoint.isOutputShutdown() && this._endPoint.isOpen()) {
                                this._toServer.shutdownOutput();
                                break;
                            }
                            closeServer();
                            break;
                        }
                        if (i == 0) {
                            break;
                        }
                        ConnectHandler.LOG.debug("{}: read from client {} bytes {}", this, Integer.valueOf(i), this._endPoint);
                        ConnectHandler.LOG.debug("{}: written to {} {} bytes", this, this._toServer, Integer.valueOf(ConnectHandler.this.write(this._toServer._endPoint, this._buffer, this._context)));
                    }
                    ConnectHandler.LOG.debug("{}: end reading from client", this);
                    return this;
                } catch (ClosedChannelException e) {
                    ConnectHandler.LOG.debug(e);
                    closeServer();
                    throw e;
                } catch (IOException e2) {
                    ConnectHandler.LOG.warn(this + ": unexpected exception", e2);
                    close();
                    throw e2;
                } catch (RuntimeException e3) {
                    ConnectHandler.LOG.warn(this + ": unexpected exception", e3);
                    close();
                    throw e3;
                }
            } catch (Throwable th) {
                ConnectHandler.LOG.debug("{}: end reading from client", this);
                throw th;
            }
        }

        @Override // org.eclipse.jetty.p123io.Connection
        public boolean isIdle() {
            return false;
        }

        @Override // org.eclipse.jetty.p123io.Connection
        public boolean isSuspended() {
            return false;
        }

        @Override // org.eclipse.jetty.p123io.Connection
        public void onClose() {
        }

        @Override // org.eclipse.jetty.p123io.Connection
        public void onIdleExpired(long j) {
            try {
                shutdownOutput();
            } catch (Exception e) {
                ConnectHandler.LOG.debug(e);
                close();
            }
        }

        @Override // org.eclipse.jetty.p123io.nio.AsyncConnection
        public void onInputShutdown() throws IOException {
        }

        public void setConnection(ProxyToServerConnection proxyToServerConnection) {
            this._toServer = proxyToServerConnection;
        }

        public void shutdownOutput() throws IOException {
            this._endPoint.shutdownOutput();
        }

        public String toString() {
            return "ClientToProxy(:" + this._endPoint.getLocalPort() + "<=>:" + this._endPoint.getRemotePort() + ")";
        }
    }

    public class Manager extends SelectorManager {
        private Manager() {
        }

        @Override // org.eclipse.jetty.p123io.nio.SelectorManager
        public boolean dispatch(Runnable runnable) {
            return ConnectHandler.this._threadPool.dispatch(runnable);
        }

        @Override // org.eclipse.jetty.p123io.nio.SelectorManager
        public void endPointClosed(SelectChannelEndPoint selectChannelEndPoint) {
        }

        @Override // org.eclipse.jetty.p123io.nio.SelectorManager
        public void endPointOpened(SelectChannelEndPoint selectChannelEndPoint) {
            ((ProxyToServerConnection) selectChannelEndPoint.getSelectionKey().attachment()).ready();
        }

        @Override // org.eclipse.jetty.p123io.nio.SelectorManager
        public void endPointUpgraded(ConnectedEndPoint connectedEndPoint, Connection connection) {
        }

        @Override // org.eclipse.jetty.p123io.nio.SelectorManager
        public AsyncConnection newConnection(SocketChannel socketChannel, AsyncEndPoint asyncEndPoint, Object obj) {
            ProxyToServerConnection proxyToServerConnection = (ProxyToServerConnection) obj;
            proxyToServerConnection.setTimeStamp(System.currentTimeMillis());
            proxyToServerConnection.setEndPoint(asyncEndPoint);
            return proxyToServerConnection;
        }

        @Override // org.eclipse.jetty.p123io.nio.SelectorManager
        public SelectChannelEndPoint newEndPoint(SocketChannel socketChannel, SelectorManager.SelectSet selectSet, SelectionKey selectionKey) throws IOException {
            SelectChannelEndPoint selectChannelEndPoint = new SelectChannelEndPoint(socketChannel, selectSet, selectionKey, socketChannel.socket().getSoTimeout());
            selectChannelEndPoint.setConnection(selectSet.getManager().newConnection(socketChannel, selectChannelEndPoint, selectionKey.attachment()));
            selectChannelEndPoint.setMaxIdleTime(ConnectHandler.this._writeTimeout);
            return selectChannelEndPoint;
        }
    }

    public class ProxyToServerConnection implements AsyncConnection {
        private final ConcurrentMap<String, Object> _context;
        private volatile Buffer _data;
        private volatile AsyncEndPoint _endPoint;
        private volatile long _timestamp;
        private volatile ClientToProxyConnection _toClient;
        private final CountDownLatch _ready = new CountDownLatch(1);
        private final Buffer _buffer = new IndirectNIOBuffer(4096);

        public ProxyToServerConnection(ConcurrentMap<String, Object> concurrentMap, Buffer buffer) {
            this._context = concurrentMap;
            this._data = buffer;
        }

        private void writeData() throws IOException {
            synchronized (this) {
                try {
                    if (this._data != null) {
                        try {
                            ConnectHandler.LOG.debug("{}: written to server {} bytes", this, Integer.valueOf(ConnectHandler.this.write(this._endPoint, this._data, this._context)));
                            this._data = null;
                        } catch (Throwable th) {
                            this._data = null;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void close() {
            try {
                closeClient();
            } catch (IOException e) {
                ConnectHandler.LOG.debug(this + ": unexpected exception closing the client", e);
            }
            try {
                closeServer();
            } catch (IOException e2) {
                ConnectHandler.LOG.debug(this + ": unexpected exception closing the server", e2);
            }
        }

        public void closeClient() throws IOException {
            this._toClient.closeClient();
        }

        public void closeServer() throws IOException {
            this._endPoint.close();
        }

        @Override // org.eclipse.jetty.p123io.Connection
        public long getTimeStamp() {
            return this._timestamp;
        }

        @Override // org.eclipse.jetty.p123io.Connection
        public Connection handle() throws IOException {
            ConnectHandler.LOG.debug("{}: begin reading from server", this);
            try {
                try {
                    try {
                        try {
                            writeData();
                            while (true) {
                                int i = ConnectHandler.this.read(this._endPoint, this._buffer, this._context);
                                if (i == -1) {
                                    ConnectHandler.LOG.debug("{}: server closed connection {}", this, this._endPoint);
                                    if (!this._endPoint.isOutputShutdown() && this._endPoint.isOpen()) {
                                        this._toClient.shutdownOutput();
                                        break;
                                    }
                                    closeClient();
                                    break;
                                }
                                if (i == 0) {
                                    break;
                                }
                                ConnectHandler.LOG.debug("{}: read from server {} bytes {}", this, Integer.valueOf(i), this._endPoint);
                                ConnectHandler.LOG.debug("{}: written to {} {} bytes", this, this._toClient, Integer.valueOf(ConnectHandler.this.write(this._toClient._endPoint, this._buffer, this._context)));
                            }
                            ConnectHandler.LOG.debug("{}: end reading from server", this);
                            return this;
                        } catch (ClosedChannelException e) {
                            ConnectHandler.LOG.debug(e);
                            throw e;
                        }
                    } catch (IOException e2) {
                        ConnectHandler.LOG.warn(this + ": unexpected exception", e2);
                        close();
                        throw e2;
                    }
                } catch (RuntimeException e3) {
                    ConnectHandler.LOG.warn(this + ": unexpected exception", e3);
                    close();
                    throw e3;
                }
            } catch (Throwable th) {
                ConnectHandler.LOG.debug("{}: end reading from server", this);
                throw th;
            }
        }

        @Override // org.eclipse.jetty.p123io.Connection
        public boolean isIdle() {
            return false;
        }

        @Override // org.eclipse.jetty.p123io.Connection
        public boolean isSuspended() {
            return false;
        }

        @Override // org.eclipse.jetty.p123io.Connection
        public void onClose() {
        }

        @Override // org.eclipse.jetty.p123io.Connection
        public void onIdleExpired(long j) {
            try {
                shutdownOutput();
            } catch (Exception e) {
                ConnectHandler.LOG.debug(e);
                close();
            }
        }

        @Override // org.eclipse.jetty.p123io.nio.AsyncConnection
        public void onInputShutdown() throws IOException {
        }

        public void ready() {
            this._ready.countDown();
        }

        public void setConnection(ClientToProxyConnection clientToProxyConnection) {
            this._toClient = clientToProxyConnection;
        }

        public void setEndPoint(AsyncEndPoint asyncEndPoint) {
            this._endPoint = asyncEndPoint;
        }

        public void setTimeStamp(long j) {
            this._timestamp = j;
        }

        public void shutdownOutput() throws IOException {
            writeData();
            this._endPoint.shutdownOutput();
        }

        public String toString() {
            return "ProxyToServer(:" + this._endPoint.getLocalPort() + "<=>:" + this._endPoint.getRemotePort() + ")";
        }

        public void waitReady(long j) throws IOException {
            try {
                this._ready.await(j, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                throw new IOException(e) { // from class: org.eclipse.jetty.server.handler.ConnectHandler.ProxyToServerConnection.1
                    final /* synthetic */ InterruptedException val$x;

                    {
                        this.val$x = e;
                        initCause(e);
                    }
                };
            }
        }
    }

    public ConnectHandler(Handler handler, String[] strArr, String[] strArr2) {
        this._selectorManager = new Manager();
        this._connectTimeout = 5000;
        this._writeTimeout = 30000;
        this._white = new HostMap<>();
        this._black = new HostMap<>();
        setHandler(handler);
        set(strArr, this._white);
        set(strArr2, this._black);
    }

    private void add(String str, HostMap<String> hostMap) {
        if (str == null || str.length() <= 0) {
            return;
        }
        String strTrim = str.trim();
        if (hostMap.get(strTrim) == null) {
            hostMap.put(strTrim, strTrim);
        }
    }

    private SocketChannel connectToServer(HttpServletRequest httpServletRequest, String str, int i) throws IOException {
        SocketChannel socketChannelConnect = connect(httpServletRequest, str, i);
        socketChannelConnect.configureBlocking(false);
        return socketChannelConnect;
    }

    private ClientToProxyConnection prepareConnections(ConcurrentMap<String, Object> concurrentMap, SocketChannel socketChannel, Buffer buffer) {
        AbstractHttpConnection currentConnection = AbstractHttpConnection.getCurrentConnection();
        ProxyToServerConnection proxyToServerConnectionNewProxyToServerConnection = newProxyToServerConnection(concurrentMap, buffer);
        ClientToProxyConnection clientToProxyConnectionNewClientToProxyConnection = newClientToProxyConnection(concurrentMap, socketChannel, currentConnection.getEndPoint(), currentConnection.getTimeStamp());
        clientToProxyConnectionNewClientToProxyConnection.setConnection(proxyToServerConnectionNewProxyToServerConnection);
        proxyToServerConnectionNewProxyToServerConnection.setConnection(clientToProxyConnectionNewClientToProxyConnection);
        return clientToProxyConnectionNewClientToProxyConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void register(SocketChannel socketChannel, ProxyToServerConnection proxyToServerConnection) throws IOException {
        this._selectorManager.register(socketChannel, proxyToServerConnection);
        proxyToServerConnection.waitReady(this._connectTimeout);
    }

    private void upgradeConnection(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Connection connection) throws IOException {
        httpServletRequest.setAttribute("org.eclipse.jetty.io.Connection", connection);
        httpServletResponse.setStatus(101);
        LOG.debug("Upgraded connection to {}", connection);
    }

    public void addBlack(String str) {
        add(str, this._black);
    }

    public void addWhite(String str) {
        add(str, this._white);
    }

    public SocketChannel connect(HttpServletRequest httpServletRequest, String str, int i) throws IOException {
        SocketChannel socketChannelOpen = SocketChannel.open();
        if (socketChannelOpen == null) {
            throw new IOException("unable to connect to " + str + ":" + i);
        }
        try {
            Logger logger = LOG;
            logger.debug("Establishing connection to {}:{}", str, Integer.valueOf(i));
            socketChannelOpen.socket().setTcpNoDelay(true);
            socketChannelOpen.socket().connect(new InetSocketAddress(str, i), getConnectTimeout());
            logger.debug("Established connection to {}:{}", str, Integer.valueOf(i));
            return socketChannelOpen;
        } catch (IOException e) {
            LOG.debug("Failed to establish connection to " + str + ":" + i, e);
            try {
                socketChannelOpen.close();
            } catch (IOException e2) {
                LOG.ignore(e2);
            }
            throw e;
        }
    }

    @Override // org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        super.doStart();
        if (this._threadPool == null) {
            this._threadPool = getServer().getThreadPool();
            this._privateThreadPool = false;
        }
        if ((this._threadPool instanceof LifeCycle) && !((LifeCycle) this._threadPool).isRunning()) {
            ((LifeCycle) this._threadPool).start();
        }
        this._selectorManager.start();
    }

    @Override // org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStop() throws Exception {
        this._selectorManager.stop();
        ThreadPool threadPool = this._threadPool;
        if (this._privateThreadPool && this._threadPool != null && (threadPool instanceof LifeCycle)) {
            ((LifeCycle) threadPool).stop();
        }
        super.doStop();
    }

    @Override // org.eclipse.jetty.server.handler.AbstractHandlerContainer, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.Dumpable
    public void dump(Appendable appendable, String str) throws IOException {
        dumpThis(appendable);
        if (this._privateThreadPool) {
            AggregateLifeCycle.dump(appendable, str, Arrays.asList(this._threadPool, this._selectorManager), TypeUtil.asList(getHandlers()), getBeans());
        } else {
            AggregateLifeCycle.dump(appendable, str, Arrays.asList(this._selectorManager), TypeUtil.asList(getHandlers()), getBeans());
        }
    }

    public int getConnectTimeout() {
        return this._connectTimeout;
    }

    public ThreadPool getThreadPool() {
        return this._threadPool;
    }

    public int getWriteTimeout() {
        return this._writeTimeout;
    }

    @Override // org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.Handler
    public void handle(String str, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        if (!HttpMethods.CONNECT.equalsIgnoreCase(httpServletRequest.getMethod())) {
            super.handle(str, request, httpServletRequest, httpServletResponse);
            return;
        }
        LOG.debug("CONNECT request for {}", httpServletRequest.getRequestURI());
        try {
            handleConnect(request, httpServletRequest, httpServletResponse, httpServletRequest.getRequestURI());
        } catch (Exception e) {
            Logger logger = LOG;
            logger.warn("ConnectHandler " + request.getUri() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + e, new Object[0]);
            logger.debug(e);
        }
    }

    public boolean handleAuthentication(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, String str) throws ServletException, IOException {
        return true;
    }

    public void handleConnect(Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, String str) throws ServletException, IOException {
        int i;
        IndirectNIOBuffer indirectNIOBuffer;
        if (handleAuthentication(httpServletRequest, httpServletResponse, str)) {
            int iIndexOf = str.indexOf(58);
            if (iIndexOf > 0) {
                String strSubstring = str.substring(0, iIndexOf);
                i = Integer.parseInt(str.substring(iIndexOf + 1));
                str = strSubstring;
            } else {
                i = 80;
            }
            if (!validateDestination(str)) {
                LOG.info("ProxyHandler: Forbidden destination ".concat(str), new Object[0]);
                httpServletResponse.setStatus(403);
                request.setHandled(true);
                return;
            }
            try {
                SocketChannel socketChannelConnectToServer = connectToServer(httpServletRequest, str, i);
                AbstractHttpConnection currentConnection = AbstractHttpConnection.getCurrentConnection();
                Buffer headerBuffer = ((HttpParser) currentConnection.getParser()).getHeaderBuffer();
                Buffer bodyBuffer = ((HttpParser) currentConnection.getParser()).getBodyBuffer();
                int length = (headerBuffer == null ? 0 : headerBuffer.length()) + (bodyBuffer != null ? bodyBuffer.length() : 0);
                if (length > 0) {
                    indirectNIOBuffer = new IndirectNIOBuffer(length);
                    if (headerBuffer != null) {
                        indirectNIOBuffer.put(headerBuffer);
                        headerBuffer.clear();
                    }
                    if (bodyBuffer != null) {
                        indirectNIOBuffer.put(bodyBuffer);
                        bodyBuffer.clear();
                    }
                } else {
                    indirectNIOBuffer = null;
                }
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                prepareContext(httpServletRequest, concurrentHashMap);
                ClientToProxyConnection clientToProxyConnectionPrepareConnections = prepareConnections(concurrentHashMap, socketChannelConnectToServer, indirectNIOBuffer);
                httpServletResponse.setStatus(200);
                request.getConnection().getGenerator().setPersistent(true);
                httpServletResponse.getOutputStream().close();
                upgradeConnection(httpServletRequest, httpServletResponse, clientToProxyConnectionPrepareConnections);
            } catch (SocketException e) {
                LOG.info("ConnectHandler: SocketException " + e.getMessage(), new Object[0]);
                httpServletResponse.setStatus(500);
                request.setHandled(true);
            } catch (SocketTimeoutException e2) {
                LOG.info("ConnectHandler: SocketTimeoutException" + e2.getMessage(), new Object[0]);
                httpServletResponse.setStatus(HttpStatus.GATEWAY_TIMEOUT_504);
                request.setHandled(true);
            } catch (IOException e3) {
                LOG.info("ConnectHandler: IOException" + e3.getMessage(), new Object[0]);
                httpServletResponse.setStatus(500);
                request.setHandled(true);
            }
        }
    }

    public ClientToProxyConnection newClientToProxyConnection(ConcurrentMap<String, Object> concurrentMap, SocketChannel socketChannel, EndPoint endPoint, long j) {
        return new ClientToProxyConnection(concurrentMap, socketChannel, endPoint, j);
    }

    public ProxyToServerConnection newProxyToServerConnection(ConcurrentMap<String, Object> concurrentMap, Buffer buffer) {
        return new ProxyToServerConnection(concurrentMap, buffer);
    }

    public void prepareContext(HttpServletRequest httpServletRequest, ConcurrentMap<String, Object> concurrentMap) {
    }

    public int read(EndPoint endPoint, Buffer buffer, ConcurrentMap<String, Object> concurrentMap) throws IOException {
        return endPoint.fill(buffer);
    }

    public void set(String[] strArr, HostMap<String> hostMap) {
        hostMap.clear();
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        for (String str : strArr) {
            add(str, hostMap);
        }
    }

    public void setBlack(String[] strArr) {
        set(strArr, this._black);
    }

    public void setConnectTimeout(int i) {
        this._connectTimeout = i;
    }

    @Override // org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.server.Handler
    public void setServer(Server server) {
        super.setServer(server);
        server.getContainer().update(this, (Object) null, this._selectorManager, "selectManager");
        if (this._privateThreadPool) {
            server.getContainer().update((Object) this, (Object) null, (Object) Boolean.valueOf(this._privateThreadPool), "threadpool", true);
        } else {
            this._threadPool = server.getThreadPool();
        }
    }

    public void setThreadPool(ThreadPool threadPool) {
        ConnectHandler connectHandler;
        ThreadPool threadPool2;
        if (getServer() != null) {
            connectHandler = this;
            threadPool2 = threadPool;
            getServer().getContainer().update((Object) connectHandler, (Object) (this._privateThreadPool ? this._threadPool : null), (Object) threadPool2, "threadpool", true);
        } else {
            connectHandler = this;
            threadPool2 = threadPool;
        }
        connectHandler._privateThreadPool = threadPool2 != null;
        connectHandler._threadPool = threadPool2;
    }

    public void setWhite(String[] strArr) {
        set(strArr, this._white);
    }

    public void setWriteTimeout(int i) {
        this._writeTimeout = i;
    }

    public boolean validateDestination(String str) {
        if (this._white.size() <= 0 || this._white.getLazyMatches(str) != null) {
            return this._black.size() <= 0 || this._black.getLazyMatches(str) == null;
        }
        return false;
    }

    public int write(EndPoint endPoint, Buffer buffer, ConcurrentMap<String, Object> concurrentMap) throws IOException {
        if (buffer == null) {
            return 0;
        }
        int length = buffer.length();
        StringBuilder sb = LOG.isDebugEnabled() ? new StringBuilder() : null;
        int iFlush = endPoint.flush(buffer);
        if (sb != null) {
            sb.append(iFlush);
        }
        while (buffer.length() > 0 && !endPoint.isOutputShutdown()) {
            if (!endPoint.isBlocking() && !endPoint.blockWritable(getWriteTimeout())) {
                rhg0.m179353a("Write timeout");
                return 0;
            }
            int iFlush2 = endPoint.flush(buffer);
            if (sb != null) {
                sb.append(Marker.ANY_NON_NULL_MARKER);
                sb.append(iFlush2);
            }
        }
        LOG.debug("Written {}/{} bytes {}", sb, Integer.valueOf(length), endPoint);
        buffer.compact();
        return length;
    }

    public ConnectHandler(String[] strArr, String[] strArr2) {
        this(null, strArr, strArr2);
    }

    public ConnectHandler(Handler handler) {
        this._selectorManager = new Manager();
        this._connectTimeout = 5000;
        this._writeTimeout = 30000;
        this._white = new HostMap<>();
        this._black = new HostMap<>();
        setHandler(handler);
    }

    public ConnectHandler() {
        this(null);
    }
}
