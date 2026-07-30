package org.eclipse.jetty.client;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import org.eclipse.jetty.client.security.Authentication;
import org.eclipse.jetty.client.security.SecurityListener;
import org.eclipse.jetty.http.HttpCookie;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpMethods;
import org.eclipse.jetty.http.PathMap;
import org.eclipse.jetty.p123io.Buffer;
import org.eclipse.jetty.p123io.ByteArrayBuffer;
import org.eclipse.jetty.p123io.EndPoint;
import org.eclipse.jetty.util.component.AggregateLifeCycle;
import org.eclipse.jetty.util.component.Dumpable;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.java_websocket.WebSocket;

/* JADX INFO: loaded from: classes3.dex */
public class HttpDestination implements Dumpable {
    private static final Logger LOG = Log.getLogger((Class<?>) HttpDestination.class);
    private final Address _address;
    private PathMap _authorizations;
    private final HttpClient _client;
    private List<HttpCookie> _cookies;
    private final ByteArrayBuffer _hostHeader;
    private volatile int _maxConnections;
    private volatile int _maxQueueSize;
    private volatile Address _proxy;
    private Authentication _proxyAuthentication;
    private final boolean _ssl;
    private final List<HttpExchange> _queue = new LinkedList();
    private final List<AbstractHttpConnection> _connections = new LinkedList();
    private final BlockingQueue<Object> _newQueue = new ArrayBlockingQueue(10, true);
    private final List<AbstractHttpConnection> _idle = new ArrayList();
    private int _pendingConnections = 0;
    private int _newConnection = 0;

    public class ConnectExchange extends ContentExchange {
        private final HttpExchange exchange;
        private final SelectConnector.UpgradableEndPoint proxyEndPoint;

        public ConnectExchange(Address address, SelectConnector.UpgradableEndPoint upgradableEndPoint, HttpExchange httpExchange) {
            this.proxyEndPoint = upgradableEndPoint;
            this.exchange = httpExchange;
            setMethod(HttpMethods.CONNECT);
            setVersion(httpExchange.getVersion());
            String string = address.toString();
            setRequestURI(string);
            addRequestHeader("Host", string);
            addRequestHeader(HttpHeaders.PROXY_CONNECTION, "keep-alive");
            addRequestHeader("User-Agent", "Jetty-Client");
        }

        @Override // org.eclipse.jetty.client.HttpExchange
        public void onConnectionFailed(Throwable th) {
            HttpDestination.this.onConnectionFailed(th);
        }

        @Override // org.eclipse.jetty.client.HttpExchange
        public void onException(Throwable th) {
            HttpDestination.this._queue.remove(this.exchange);
            if (this.exchange.setStatus(9)) {
                this.exchange.getEventListener().onException(th);
            }
        }

        @Override // org.eclipse.jetty.client.HttpExchange
        public void onExpire() {
            HttpDestination.this._queue.remove(this.exchange);
            if (this.exchange.setStatus(8)) {
                this.exchange.getEventListener().onExpire();
            }
        }

        @Override // org.eclipse.jetty.client.HttpExchange
        public void onResponseComplete() throws IOException {
            int responseStatus = getResponseStatus();
            if (responseStatus == 200) {
                this.proxyEndPoint.upgrade();
                return;
            }
            if (responseStatus == 504) {
                onExpire();
                return;
            }
            onException(new ProtocolException("Proxy: " + this.proxyEndPoint.getRemoteAddr() + ":" + this.proxyEndPoint.getRemotePort() + " didn't return http return code 200, but " + responseStatus + " while trying to request: " + this.exchange.getAddress().toString()));
        }
    }

    public HttpDestination(HttpClient httpClient, Address address, boolean z) {
        this._client = httpClient;
        this._address = address;
        this._ssl = z;
        this._maxConnections = httpClient.getMaxConnectionsPerAddress();
        this._maxQueueSize = httpClient.getMaxQueueSizePerAddress();
        String host = address.getHost();
        if (address.getPort() != (z ? WebSocket.DEFAULT_WSS_PORT : 80)) {
            host = host + ":" + address.getPort();
        }
        this._hostHeader = new ByteArrayBuffer(host);
    }

    private AbstractHttpConnection getConnection(long j) throws IOException {
        boolean z;
        AbstractHttpConnection idleConnection = null;
        while (idleConnection == null) {
            idleConnection = getIdleConnection();
            if (idleConnection != null || j <= 0) {
                break;
            }
            synchronized (this) {
                try {
                    if (this._connections.size() + this._pendingConnections < this._maxConnections) {
                        z = true;
                        this._newConnection++;
                    } else {
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                startNewConnection();
                try {
                    Object objTake = this._newQueue.take();
                    if (!(objTake instanceof AbstractHttpConnection)) {
                        throw ((IOException) objTake);
                    }
                    idleConnection = (AbstractHttpConnection) objTake;
                } catch (InterruptedException e) {
                    LOG.ignore(e);
                }
            } else {
                try {
                    Thread.currentThread();
                    Thread.sleep(200L);
                    j -= 200;
                } catch (InterruptedException e2) {
                    LOG.ignore(e2);
                }
            }
        }
        return idleConnection;
    }

    public void addAuthorization(String str, Authentication authentication) {
        synchronized (this) {
            try {
                if (this._authorizations == null) {
                    this._authorizations = new PathMap();
                }
                this._authorizations.put(str, authentication);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addCookie(HttpCookie httpCookie) {
        synchronized (this) {
            try {
                if (this._cookies == null) {
                    this._cookies = new ArrayList();
                }
                this._cookies.add(httpCookie);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void close() throws IOException {
        synchronized (this) {
            try {
                Iterator<AbstractHttpConnection> it = this._connections.iterator();
                while (it.hasNext()) {
                    it.next().close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void doSend(HttpExchange httpExchange) throws IOException {
        boolean z;
        Authentication authentication;
        List<HttpCookie> list = this._cookies;
        if (list != null) {
            StringBuilder sb = null;
            for (HttpCookie httpCookie : list) {
                if (sb == null) {
                    sb = new StringBuilder();
                } else {
                    sb.append("; ");
                }
                sb.append(httpCookie.getName());
                sb.append("=");
                sb.append(httpCookie.getValue());
            }
            if (sb != null) {
                httpExchange.addRequestHeader("Cookie", sb.toString());
            }
        }
        PathMap pathMap = this._authorizations;
        if (pathMap != null && (authentication = (Authentication) pathMap.match(httpExchange.getRequestURI())) != null) {
            authentication.setCredentials(httpExchange);
        }
        httpExchange.scheduleTimeout(this);
        AbstractHttpConnection idleConnection = getIdleConnection();
        if (idleConnection != null) {
            send(idleConnection, httpExchange);
            return;
        }
        synchronized (this) {
            if (this._queue.size() == this._maxQueueSize) {
                throw new RejectedExecutionException("Queue full for address " + this._address);
            }
            this._queue.add(httpExchange);
            z = this._connections.size() + this._pendingConnections < this._maxConnections;
        }
        if (z) {
            startNewConnection();
        }
    }

    @Override // org.eclipse.jetty.util.component.Dumpable
    public void dump(Appendable appendable, String str) throws IOException {
        synchronized (this) {
            appendable.append(String.valueOf(this) + "idle=" + this._idle.size() + " pending=" + this._pendingConnections).append(SignParameters.NEW_LINE);
            AggregateLifeCycle.dump(appendable, str, this._connections);
        }
    }

    public void exchangeExpired(HttpExchange httpExchange) {
        synchronized (this) {
            this._queue.remove(httpExchange);
        }
    }

    public Address getAddress() {
        return this._address;
    }

    public int getConnections() {
        int size;
        synchronized (this) {
            size = this._connections.size();
        }
        return size;
    }

    public Buffer getHostHeader() {
        return this._hostHeader;
    }

    public HttpClient getHttpClient() {
        return this._client;
    }

    public AbstractHttpConnection getIdleConnection() throws IOException {
        AbstractHttpConnection abstractHttpConnectionRemove = null;
        do {
            synchronized (this) {
                if (abstractHttpConnectionRemove != null) {
                    try {
                        this._connections.remove(abstractHttpConnectionRemove);
                        abstractHttpConnectionRemove.close();
                        abstractHttpConnectionRemove = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this._idle.size() > 0) {
                    List<AbstractHttpConnection> list = this._idle;
                    abstractHttpConnectionRemove = list.remove(list.size() - 1);
                }
            }
            if (abstractHttpConnectionRemove == null) {
                return null;
            }
        } while (!abstractHttpConnectionRemove.cancelIdleTimeout());
        return abstractHttpConnectionRemove;
    }

    public int getIdleConnections() {
        int size;
        synchronized (this) {
            size = this._idle.size();
        }
        return size;
    }

    public int getMaxConnections() {
        return this._maxConnections;
    }

    public int getMaxQueueSize() {
        return this._maxQueueSize;
    }

    public Address getProxy() {
        return this._proxy;
    }

    public Authentication getProxyAuthentication() {
        return this._proxyAuthentication;
    }

    public boolean isProxied() {
        return this._proxy != null;
    }

    public boolean isSecure() {
        return this._ssl;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    public void onConnectionFailed(Throwable th) {
        boolean z;
        synchronized (this) {
            try {
                this._pendingConnections--;
                int i = this._newConnection;
                if (i > 0) {
                    this._newConnection = i - 1;
                    z = false;
                } else {
                    if (this._queue.size() > 0) {
                        HttpExchange httpExchangeRemove = this._queue.remove(0);
                        if (httpExchangeRemove.setStatus(9)) {
                            httpExchangeRemove.getEventListener().onConnectionFailed(th);
                        }
                        z = !this._queue.isEmpty() && this._client.isStarted();
                    }
                    th = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z) {
            startNewConnection();
        }
        if (th != null) {
            try {
                this._newQueue.put(th);
            } catch (InterruptedException e) {
                LOG.ignore(e);
            }
        }
    }

    public void onException(Throwable th) {
        synchronized (this) {
            try {
                this._pendingConnections--;
                if (this._queue.size() > 0) {
                    HttpExchange httpExchangeRemove = this._queue.remove(0);
                    if (httpExchangeRemove.setStatus(9)) {
                        httpExchangeRemove.getEventListener().onException(th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void onNewConnection(AbstractHttpConnection abstractHttpConnection) throws IOException {
        synchronized (this) {
            try {
                this._pendingConnections--;
                this._connections.add(abstractHttpConnection);
                int i = this._newConnection;
                if (i > 0) {
                    this._newConnection = i - 1;
                } else {
                    if (this._queue.size() == 0) {
                        abstractHttpConnection.setIdleTimeout();
                        this._idle.add(abstractHttpConnection);
                    } else {
                        EndPoint endPoint = abstractHttpConnection.getEndPoint();
                        if (isProxied() && (endPoint instanceof SelectConnector.UpgradableEndPoint)) {
                            ConnectExchange connectExchange = new ConnectExchange(getAddress(), (SelectConnector.UpgradableEndPoint) endPoint, this._queue.get(0));
                            connectExchange.setAddress(getProxy());
                            send(abstractHttpConnection, connectExchange);
                        } else {
                            send(abstractHttpConnection, this._queue.remove(0));
                        }
                    }
                    abstractHttpConnection = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (abstractHttpConnection != null) {
            try {
                this._newQueue.put(abstractHttpConnection);
            } catch (InterruptedException e) {
                LOG.ignore(e);
            }
        }
    }

    public void resend(HttpExchange httpExchange) throws IOException {
        httpExchange.getEventListener().onRetry();
        httpExchange.reset();
        doSend(httpExchange);
    }

    public AbstractHttpConnection reserveConnection(long j) throws IOException {
        AbstractHttpConnection connection = getConnection(j);
        if (connection != null) {
            connection.setReserved(true);
        }
        return connection;
    }

    public void returnConnection(AbstractHttpConnection abstractHttpConnection, boolean z) throws IOException {
        boolean zIsEmpty;
        if (abstractHttpConnection.isReserved()) {
            abstractHttpConnection.setReserved(false);
        }
        if (z) {
            try {
                abstractHttpConnection.close();
            } catch (IOException e) {
                LOG.ignore(e);
            }
        }
        if (this._client.isStarted()) {
            if (z || !abstractHttpConnection.getEndPoint().isOpen()) {
                synchronized (this) {
                    this._connections.remove(abstractHttpConnection);
                    zIsEmpty = this._queue.isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                startNewConnection();
                return;
            }
            synchronized (this) {
                try {
                    if (this._queue.size() == 0) {
                        abstractHttpConnection.setIdleTimeout();
                        this._idle.add(abstractHttpConnection);
                    } else {
                        send(abstractHttpConnection, this._queue.remove(0));
                    }
                    notifyAll();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void returnIdleConnection(AbstractHttpConnection abstractHttpConnection) {
        boolean z;
        abstractHttpConnection.onIdleExpired((abstractHttpConnection == null || abstractHttpConnection.getEndPoint() == null) ? -1L : abstractHttpConnection.getEndPoint().getMaxIdleTime());
        synchronized (this) {
            try {
                this._idle.remove(abstractHttpConnection);
                this._connections.remove(abstractHttpConnection);
                z = !this._queue.isEmpty() && this._client.isStarted();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            startNewConnection();
        }
    }

    public void send(HttpExchange httpExchange) throws IOException {
        LinkedList<String> registeredListeners = this._client.getRegisteredListeners();
        if (registeredListeners != null) {
            for (int size = registeredListeners.size(); size > 0; size--) {
                String str = registeredListeners.get(size - 1);
                try {
                    httpExchange.setEventListener((HttpEventListener) Class.forName(str).getDeclaredConstructor(HttpDestination.class, HttpExchange.class).newInstance(this, httpExchange));
                } catch (Exception e) {
                    throw new IOException("Unable to instantiate registered listener for destination: " + str, e) { // from class: org.eclipse.jetty.client.HttpDestination.1
                        final /* synthetic */ Exception val$e;

                        {
                            this.val$e = e;
                            initCause(e);
                        }
                    };
                }
            }
        }
        if (this._client.hasRealms()) {
            httpExchange.setEventListener(new SecurityListener(this, httpExchange));
        }
        doSend(httpExchange);
    }

    public void setMaxConnections(int i) {
        this._maxConnections = i;
    }

    public void setMaxQueueSize(int i) {
        this._maxQueueSize = i;
    }

    public void setProxy(Address address) {
        this._proxy = address;
    }

    public void setProxyAuthentication(Authentication authentication) {
        this._proxyAuthentication = authentication;
    }

    public void startNewConnection() {
        try {
            synchronized (this) {
                this._pendingConnections++;
            }
            HttpClient.Connector connector = this._client._connector;
            if (connector != null) {
                connector.startConnection(this);
            }
        } catch (Exception e) {
            LOG.debug(e);
            onConnectionFailed(e);
        }
    }

    public synchronized String toDetailString() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(toString());
        sb.append('\n');
        synchronized (this) {
            try {
                for (AbstractHttpConnection abstractHttpConnection : this._connections) {
                    sb.append(abstractHttpConnection.toDetailString());
                    if (this._idle.contains(abstractHttpConnection)) {
                        sb.append(" IDLE");
                    }
                    sb.append('\n');
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sb.toString();
        sb.append("--");
        sb.append('\n');
        return sb.toString();
    }

    public synchronized String toString() {
        return String.format("HttpDestination@%x//%s:%d(%d/%d,%d,%d/%d)%n", Integer.valueOf(hashCode()), this._address.getHost(), Integer.valueOf(this._address.getPort()), Integer.valueOf(this._connections.size()), Integer.valueOf(this._maxConnections), Integer.valueOf(this._idle.size()), Integer.valueOf(this._queue.size()), Integer.valueOf(this._maxQueueSize));
    }

    @Override // org.eclipse.jetty.util.component.Dumpable
    public String dump() {
        return AggregateLifeCycle.dump(this);
    }

    public void send(AbstractHttpConnection abstractHttpConnection, HttpExchange httpExchange) throws IOException {
        synchronized (this) {
            try {
                if (!abstractHttpConnection.send(httpExchange)) {
                    if (httpExchange.getStatus() <= 1) {
                        this._queue.add(0, httpExchange);
                    }
                    returnIdleConnection(abstractHttpConnection);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
