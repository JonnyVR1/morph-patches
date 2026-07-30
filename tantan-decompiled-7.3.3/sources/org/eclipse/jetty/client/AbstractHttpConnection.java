package org.eclipse.jetty.client;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import org.eclipse.jetty.client.security.Authentication;
import org.eclipse.jetty.http.HttpFields;
import org.eclipse.jetty.http.HttpGenerator;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpMethods;
import org.eclipse.jetty.http.HttpParser;
import org.eclipse.jetty.http.HttpVersions;
import org.eclipse.jetty.p127io.AbstractConnection;
import org.eclipse.jetty.p127io.Buffer;
import org.eclipse.jetty.p127io.Buffers;
import org.eclipse.jetty.p127io.Connection;
import org.eclipse.jetty.p127io.EndPoint;
import org.eclipse.jetty.p127io.EofException;
import org.eclipse.jetty.p127io.View;
import org.eclipse.jetty.util.component.AggregateLifeCycle;
import org.eclipse.jetty.util.component.Dumpable;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.eclipse.jetty.util.thread.Timeout;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractHttpConnection extends AbstractConnection implements Dumpable {
    private static final Logger LOG = Log.getLogger((Class<?>) AbstractHttpConnection.class);
    protected Buffer _connectionHeader;
    protected HttpDestination _destination;
    protected volatile HttpExchange _exchange;
    protected HttpGenerator _generator;
    protected boolean _http11;
    private AtomicBoolean _idle;
    private final Timeout.Task _idleTimeout;
    protected HttpParser _parser;
    protected HttpExchange _pipeline;
    protected boolean _reserved;
    protected int _status;

    public class ConnectionIdleTask extends Timeout.Task {
        private ConnectionIdleTask() {
        }

        @Override // org.eclipse.jetty.util.thread.Timeout.Task
        public void expired() {
            if (AbstractHttpConnection.this._idle.compareAndSet(true, false)) {
                AbstractHttpConnection abstractHttpConnection = AbstractHttpConnection.this;
                abstractHttpConnection._destination.returnIdleConnection(abstractHttpConnection);
            }
        }
    }

    public class Handler extends HttpParser.EventHandler {
        private Handler() {
        }

        @Override // org.eclipse.jetty.http.HttpParser.EventHandler
        public void content(Buffer buffer) throws IOException {
            HttpExchange httpExchange = AbstractHttpConnection.this._exchange;
            if (httpExchange != null) {
                httpExchange.getEventListener().onResponseContent(buffer);
            }
        }

        @Override // org.eclipse.jetty.http.HttpParser.EventHandler
        public void earlyEOF() {
            HttpExchange httpExchange = AbstractHttpConnection.this._exchange;
            if (httpExchange == null || httpExchange.isDone() || !httpExchange.setStatus(9)) {
                return;
            }
            httpExchange.getEventListener().onException(new EofException("early EOF"));
        }

        @Override // org.eclipse.jetty.http.HttpParser.EventHandler
        public void headerComplete() throws IOException {
            HttpExchange httpExchange = AbstractHttpConnection.this._exchange;
            if (httpExchange != null) {
                httpExchange.setStatus(6);
            }
        }

        @Override // org.eclipse.jetty.http.HttpParser.EventHandler
        public void messageComplete(long j) throws IOException {
            HttpExchange httpExchange = AbstractHttpConnection.this._exchange;
            if (httpExchange != null) {
                httpExchange.setStatus(7);
            }
        }

        @Override // org.eclipse.jetty.http.HttpParser.EventHandler
        public void parsedHeader(Buffer buffer, Buffer buffer2) throws IOException {
            HttpExchange httpExchange = AbstractHttpConnection.this._exchange;
            if (httpExchange != null) {
                if (HttpHeaders.CACHE.getOrdinal(buffer) == 1) {
                    AbstractHttpConnection.this._connectionHeader = HttpHeaderValues.CACHE.lookup(buffer2);
                }
                httpExchange.getEventListener().onResponseHeader(buffer, buffer2);
            }
        }

        @Override // org.eclipse.jetty.http.HttpParser.EventHandler
        public void startRequest(Buffer buffer, Buffer buffer2, Buffer buffer3) throws IOException {
        }

        @Override // org.eclipse.jetty.http.HttpParser.EventHandler
        public void startResponse(Buffer buffer, int i, Buffer buffer2) throws IOException {
            HttpExchange httpExchange = AbstractHttpConnection.this._exchange;
            if (httpExchange == null) {
                AbstractHttpConnection.LOG.warn("No exchange for response", new Object[0]);
                ((AbstractConnection) AbstractHttpConnection.this)._endp.close();
                return;
            }
            if (i == 100 || i == 102) {
                httpExchange.setEventListener(AbstractHttpConnection.this.new NonFinalResponseListener(httpExchange));
            } else if (i == 200 && HttpMethods.CONNECT.equalsIgnoreCase(httpExchange.getMethod())) {
                AbstractHttpConnection.this._parser.setHeadResponse(true);
            }
            AbstractHttpConnection.this._http11 = HttpVersions.HTTP_1_1_BUFFER.equals(buffer);
            AbstractHttpConnection.this._status = i;
            httpExchange.getEventListener().onResponseStatus(buffer, i, buffer2);
            httpExchange.setStatus(5);
        }
    }

    public class NonFinalResponseListener implements HttpEventListener {
        final HttpExchange _exchange;
        final HttpEventListener _next;

        public NonFinalResponseListener(HttpExchange httpExchange) {
            this._exchange = httpExchange;
            this._next = httpExchange.getEventListener();
        }

        @Override // org.eclipse.jetty.client.HttpEventListener
        public void onConnectionFailed(Throwable th) {
            this._exchange.setEventListener(this._next);
            this._next.onConnectionFailed(th);
        }

        @Override // org.eclipse.jetty.client.HttpEventListener
        public void onException(Throwable th) {
            this._exchange.setEventListener(this._next);
            this._next.onException(th);
        }

        @Override // org.eclipse.jetty.client.HttpEventListener
        public void onExpire() {
            this._exchange.setEventListener(this._next);
            this._next.onExpire();
        }

        @Override // org.eclipse.jetty.client.HttpEventListener
        public void onRequestCommitted() throws IOException {
        }

        @Override // org.eclipse.jetty.client.HttpEventListener
        public void onRequestComplete() throws IOException {
        }

        @Override // org.eclipse.jetty.client.HttpEventListener
        public void onResponseComplete() throws IOException {
            this._exchange.setEventListener(this._next);
            this._exchange.setStatus(4);
            AbstractHttpConnection.this._parser.reset();
        }

        @Override // org.eclipse.jetty.client.HttpEventListener
        public void onResponseContent(Buffer buffer) throws IOException {
        }

        @Override // org.eclipse.jetty.client.HttpEventListener
        public void onResponseHeader(Buffer buffer, Buffer buffer2) throws IOException {
            this._next.onResponseHeader(buffer, buffer2);
        }

        @Override // org.eclipse.jetty.client.HttpEventListener
        public void onResponseHeaderComplete() throws IOException {
            this._next.onResponseHeaderComplete();
        }

        @Override // org.eclipse.jetty.client.HttpEventListener
        public void onResponseStatus(Buffer buffer, int i, Buffer buffer2) throws IOException {
        }

        @Override // org.eclipse.jetty.client.HttpEventListener
        public void onRetry() {
            this._exchange.setEventListener(this._next);
            this._next.onRetry();
        }
    }

    public AbstractHttpConnection(Buffers buffers, Buffers buffers2, EndPoint endPoint) {
        super(endPoint);
        this._http11 = true;
        this._idleTimeout = new ConnectionIdleTask();
        this._idle = new AtomicBoolean(false);
        this._generator = new HttpGenerator(buffers, endPoint);
        this._parser = new HttpParser(buffers2, endPoint, new Handler());
    }

    private void adjustIdleTimeout() throws IOException {
        long timeout = this._exchange.getTimeout();
        if (timeout <= 0) {
            timeout = this._destination.getHttpClient().getTimeout();
        }
        long maxIdleTime = this._endp.getMaxIdleTime();
        if (timeout <= 0 || timeout <= maxIdleTime) {
            return;
        }
        this._endp.setMaxIdleTime(((int) timeout) * 2);
    }

    public boolean cancelIdleTimeout() {
        synchronized (this) {
            try {
                if (!this._idle.compareAndSet(true, false)) {
                    return false;
                }
                this._destination.getHttpClient().cancel(this._idleTimeout);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x0048, please report this as an issue */
    public void close() throws IOException {
        String string;
        String str;
        HttpExchange httpExchange = this._exchange;
        if (httpExchange != null && !httpExchange.isDone()) {
            switch (httpExchange.getStatus()) {
                case 6:
                    if (!this._endp.isInputShutdown() || !this._parser.isState(1)) {
                        string = httpExchange.toString();
                        if (this._endp.isOpen()) {
                            str = "closed: ";
                        } else if (this._endp.isInputShutdown()) {
                            str = "half closed: ";
                        } else {
                            str = "local close: ";
                        }
                        if (httpExchange.setStatus(9)) {
                            httpExchange.getEventListener().onException(new EofException(str + string));
                        }
                    }
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    break;
                default:
                    string = httpExchange.toString();
                    if (this._endp.isOpen()) {
                        str = "closed: ";
                    } else if (this._endp.isInputShutdown()) {
                        str = "half closed: ";
                    } else {
                        str = "local close: ";
                    }
                    if (httpExchange.setStatus(9)) {
                        httpExchange.getEventListener().onException(new EofException(str + string));
                    }
                    break;
            }
        }
        if (this._endp.isOpen()) {
            this._endp.close();
            this._destination.returnConnection(this, true);
        }
    }

    public void commitRequest() throws IOException {
        synchronized (this) {
            try {
                this._status = 0;
                if (this._exchange.getStatus() != 2) {
                    throw new IllegalStateException();
                }
                this._exchange.setStatus(3);
                this._generator.setVersion(this._exchange.getVersion());
                String method = this._exchange.getMethod();
                String requestURI = this._exchange.getRequestURI();
                if (this._destination.isProxied()) {
                    if (!HttpMethods.CONNECT.equals(method) && requestURI.startsWith("/")) {
                        boolean zIsSecure = this._destination.isSecure();
                        String host = this._destination.getAddress().getHost();
                        int port = this._destination.getAddress().getPort();
                        StringBuilder sb = new StringBuilder();
                        sb.append(zIsSecure ? "https" : "http");
                        sb.append("://");
                        sb.append(host);
                        if ((!zIsSecure || port != 443) && (zIsSecure || port != 80)) {
                            sb.append(":");
                            sb.append(port);
                        }
                        sb.append(requestURI);
                        requestURI = sb.toString();
                    }
                    Authentication proxyAuthentication = this._destination.getProxyAuthentication();
                    if (proxyAuthentication != null) {
                        proxyAuthentication.setCredentials(this._exchange);
                    }
                }
                this._generator.setRequest(method, requestURI);
                this._parser.setHeadResponse(HttpMethods.HEAD.equalsIgnoreCase(method));
                HttpFields requestFields = this._exchange.getRequestFields();
                if (this._exchange.getVersion() >= 11) {
                    Buffer buffer = HttpHeaders.HOST_BUFFER;
                    if (!requestFields.containsKey(buffer)) {
                        requestFields.add(buffer, this._destination.getHostHeader());
                    }
                }
                Buffer requestContent = this._exchange.getRequestContent();
                if (requestContent != null) {
                    requestFields.putLongField("Content-Length", requestContent.length());
                    this._generator.completeHeader(requestFields, false);
                    this._generator.addContent(new View(requestContent), true);
                    this._exchange.setStatus(4);
                } else if (this._exchange.getRequestContentSource() != null) {
                    this._generator.completeHeader(requestFields, false);
                } else {
                    requestFields.remove("Content-Length");
                    this._generator.completeHeader(requestFields, true);
                    this._exchange.setStatus(4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.eclipse.jetty.util.component.Dumpable
    public void dump(Appendable appendable, String str) throws IOException {
        synchronized (this) {
            appendable.append(String.valueOf(this)).append(SignParameters.NEW_LINE);
            AggregateLifeCycle.dump(appendable, str, Collections.singletonList(this._endp));
        }
    }

    public void exchangeExpired(HttpExchange httpExchange) {
        synchronized (this) {
            if (this._exchange == httpExchange) {
                try {
                    this._destination.returnConnection(this, true);
                } catch (IOException e) {
                    LOG.ignore(e);
                }
            }
        }
    }

    public HttpDestination getDestination() {
        return this._destination;
    }

    @Override // org.eclipse.jetty.p127io.Connection
    public abstract Connection handle() throws IOException;

    @Override // org.eclipse.jetty.p127io.Connection
    public boolean isIdle() {
        boolean z;
        synchronized (this) {
            z = this._exchange == null;
        }
        return z;
    }

    public boolean isReserved() {
        return this._reserved;
    }

    @Override // org.eclipse.jetty.p127io.Connection
    public boolean isSuspended() {
        return false;
    }

    @Override // org.eclipse.jetty.p127io.Connection
    public void onClose() {
    }

    public void reset() throws IOException {
        this._connectionHeader = null;
        this._parser.reset();
        this._generator.reset();
        this._http11 = true;
    }

    public boolean send(HttpExchange httpExchange) throws IOException {
        LOG.debug("Send {} on {}", httpExchange, this);
        synchronized (this) {
            try {
                if (this._exchange != null) {
                    if (this._pipeline == null) {
                        this._pipeline = httpExchange;
                        return true;
                    }
                    throw new IllegalStateException(this + " PIPELINED!!!  _exchange=" + this._exchange);
                }
                this._exchange = httpExchange;
                this._exchange.associate(this);
                boolean zIsOpen = this._endp.isOpen();
                HttpExchange httpExchange2 = this._exchange;
                if (zIsOpen) {
                    httpExchange2.setStatus(2);
                    adjustIdleTimeout();
                    return true;
                }
                httpExchange2.disassociate();
                this._exchange = null;
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setDestination(HttpDestination httpDestination) {
        this._destination = httpDestination;
    }

    public void setIdleTimeout() {
        synchronized (this) {
            try {
                if (!this._idle.compareAndSet(false, true)) {
                    throw new IllegalStateException();
                }
                this._destination.getHttpClient().scheduleIdle(this._idleTimeout);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setReserved(boolean z) {
        this._reserved = z;
    }

    public String toDetailString() {
        return toString() + " ex=" + this._exchange + " idle for " + this._idleTimeout.getAge();
    }

    @Override // org.eclipse.jetty.p127io.AbstractConnection
    public String toString() {
        String string = super.toString();
        HttpDestination httpDestination = this._destination;
        return String.format("%s %s g=%s p=%s", string, httpDestination == null ? "?.?.?.?:??" : httpDestination.getAddress(), this._generator, this._parser);
    }

    @Override // org.eclipse.jetty.util.component.Dumpable
    public String dump() {
        return AggregateLifeCycle.dump(this);
    }
}
