package org.eclipse.jetty.client;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.concurrent.atomic.AtomicInteger;
import org.eclipse.jetty.http.HttpFields;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpSchemes;
import org.eclipse.jetty.http.HttpURI;
import org.eclipse.jetty.http.HttpVersions;
import org.eclipse.jetty.p123io.Buffer;
import org.eclipse.jetty.p123io.BufferCache;
import org.eclipse.jetty.p123io.ByteArrayBuffer;
import org.eclipse.jetty.p123io.Connection;
import org.eclipse.jetty.p123io.EndPoint;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.eclipse.jetty.util.thread.Timeout;
import org.java_websocket.WebSocket;
import p149l.qhg0;
import p149l.rhg0;

/* JADX INFO: loaded from: classes3.dex */
public class HttpExchange {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final Logger LOG = Log.getLogger((Class<?>) HttpExchange.class);
    public static final int STATUS_CANCELLED = 11;
    public static final int STATUS_CANCELLING = 10;
    public static final int STATUS_COMPLETED = 7;
    public static final int STATUS_EXCEPTED = 9;
    public static final int STATUS_EXPIRED = 8;
    public static final int STATUS_PARSING_CONTENT = 6;
    public static final int STATUS_PARSING_HEADERS = 5;
    public static final int STATUS_SENDING_REQUEST = 3;
    public static final int STATUS_START = 0;
    public static final int STATUS_WAITING_FOR_COMMIT = 2;
    public static final int STATUS_WAITING_FOR_CONNECTION = 1;
    public static final int STATUS_WAITING_FOR_RESPONSE = 4;
    private Address _address;
    private volatile AbstractHttpConnection _connection;
    boolean _onDone;
    boolean _onRequestCompleteDone;
    boolean _onResponseCompleteDone;
    private Buffer _requestContent;
    private InputStream _requestContentSource;
    private volatile Timeout.Task _timeoutTask;
    private String _uri;
    private String _method = "GET";
    private Buffer _scheme = HttpSchemes.HTTP_BUFFER;
    private int _version = 11;
    private final HttpFields _requestFields = new HttpFields();
    private AtomicInteger _status = new AtomicInteger(0);
    private boolean _retryStatus = false;
    private boolean _configureListeners = true;
    private HttpEventListener _listener = new Listener();
    private Address _localAddress = null;
    private long _timeout = -1;
    private long _lastStateChange = System.currentTimeMillis();
    private long _sent = -1;
    private int _lastState = -1;
    private int _lastStatePeriod = -1;

    @Deprecated
    public static class CachedExchange extends org.eclipse.jetty.client.CachedExchange {
        public CachedExchange(boolean z) {
            super(z);
        }
    }

    @Deprecated
    public static class ContentExchange extends org.eclipse.jetty.client.ContentExchange {
    }

    public class Listener implements HttpEventListener {
        private Listener() {
        }

        @Override // org.eclipse.jetty.client.HttpEventListener
        public void onConnectionFailed(Throwable th) {
            try {
                HttpExchange.this.onConnectionFailed(th);
            } finally {
                HttpExchange.this.done();
            }
        }

        @Override // org.eclipse.jetty.client.HttpEventListener
        public void onException(Throwable th) {
            try {
                HttpExchange.this.onException(th);
            } finally {
                HttpExchange.this.done();
            }
        }

        @Override // org.eclipse.jetty.client.HttpEventListener
        public void onExpire() {
            try {
                HttpExchange.this.onExpire();
            } finally {
                HttpExchange.this.done();
            }
        }

        @Override // org.eclipse.jetty.client.HttpEventListener
        public void onRequestCommitted() throws IOException {
            HttpExchange.this.onRequestCommitted();
        }

        @Override // org.eclipse.jetty.client.HttpEventListener
        public void onRequestComplete() throws IOException {
            try {
                HttpExchange.this.onRequestComplete();
                synchronized (HttpExchange.this) {
                    try {
                        HttpExchange httpExchange = HttpExchange.this;
                        httpExchange._onRequestCompleteDone = true;
                        boolean z = httpExchange._onDone | httpExchange._onResponseCompleteDone;
                        httpExchange._onDone = z;
                        if (z) {
                            httpExchange.disassociate();
                        }
                        HttpExchange.this.notifyAll();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                synchronized (HttpExchange.this) {
                    try {
                        HttpExchange httpExchange2 = HttpExchange.this;
                        httpExchange2._onRequestCompleteDone = true;
                        boolean z2 = httpExchange2._onDone | httpExchange2._onResponseCompleteDone;
                        httpExchange2._onDone = z2;
                        if (z2) {
                            httpExchange2.disassociate();
                        }
                        HttpExchange.this.notifyAll();
                        throw th2;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }

        @Override // org.eclipse.jetty.client.HttpEventListener
        public void onResponseComplete() throws IOException {
            try {
                HttpExchange.this.onResponseComplete();
                synchronized (HttpExchange.this) {
                    try {
                        HttpExchange httpExchange = HttpExchange.this;
                        httpExchange._onResponseCompleteDone = true;
                        boolean z = httpExchange._onDone | httpExchange._onRequestCompleteDone;
                        httpExchange._onDone = z;
                        if (z) {
                            httpExchange.disassociate();
                        }
                        HttpExchange.this.notifyAll();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                synchronized (HttpExchange.this) {
                    try {
                        HttpExchange httpExchange2 = HttpExchange.this;
                        httpExchange2._onResponseCompleteDone = true;
                        boolean z2 = httpExchange2._onDone | httpExchange2._onRequestCompleteDone;
                        httpExchange2._onDone = z2;
                        if (z2) {
                            httpExchange2.disassociate();
                        }
                        HttpExchange.this.notifyAll();
                        throw th2;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }

        @Override // org.eclipse.jetty.client.HttpEventListener
        public void onResponseContent(Buffer buffer) throws IOException {
            HttpExchange.this.onResponseContent(buffer);
        }

        @Override // org.eclipse.jetty.client.HttpEventListener
        public void onResponseHeader(Buffer buffer, Buffer buffer2) throws IOException {
            HttpExchange.this.onResponseHeader(buffer, buffer2);
        }

        @Override // org.eclipse.jetty.client.HttpEventListener
        public void onResponseHeaderComplete() throws IOException {
            HttpExchange.this.onResponseHeaderComplete();
        }

        @Override // org.eclipse.jetty.client.HttpEventListener
        public void onResponseStatus(Buffer buffer, int i, Buffer buffer2) throws IOException {
            HttpExchange.this.onResponseStatus(buffer, i, buffer2);
        }

        @Override // org.eclipse.jetty.client.HttpEventListener
        public void onRetry() {
            HttpExchange.this.setRetryStatus(true);
            try {
                HttpExchange.this.onRetry();
            } catch (IOException e) {
                HttpExchange.LOG.debug(e);
            }
        }
    }

    private void abort() {
        AbstractHttpConnection abstractHttpConnection = this._connection;
        try {
            if (abstractHttpConnection != null) {
                abstractHttpConnection.close();
            }
        } catch (IOException e) {
            LOG.debug(e);
        } finally {
            disassociate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void done() {
        synchronized (this) {
            disassociate();
            this._onDone = true;
            notifyAll();
        }
    }

    private boolean setStatusExpired(int i, int i2) {
        boolean zCompareAndSet = this._status.compareAndSet(i2, i);
        if (zCompareAndSet) {
            getEventListener().onExpire();
        }
        return zCompareAndSet;
    }

    public static String toState(int i) {
        switch (i) {
            case 0:
                return "START";
            case 1:
                return "CONNECTING";
            case 2:
                return "CONNECTED";
            case 3:
                return "SENDING";
            case 4:
                return "WAITING";
            case 5:
                return "HEADERS";
            case 6:
                return "CONTENT";
            case 7:
                return "COMPLETED";
            case 8:
                return "EXPIRED";
            case 9:
                return "EXCEPTED";
            case 10:
                return "CANCELLING";
            case 11:
                return "CANCELLED";
            default:
                return "UNKNOWN";
        }
    }

    public void addRequestHeader(String str, String str2) {
        getRequestFields().add(str, str2);
    }

    public void associate(AbstractHttpConnection abstractHttpConnection) {
        if (abstractHttpConnection.getEndPoint().getLocalAddr() != null) {
            this._localAddress = new Address(abstractHttpConnection.getEndPoint().getLocalAddr(), abstractHttpConnection.getEndPoint().getLocalPort());
        }
        this._connection = abstractHttpConnection;
        if (getStatus() == 10) {
            abort();
        }
    }

    public void cancel() {
        setStatus(10);
        abort();
    }

    public void cancelTimeout(HttpClient httpClient) {
        Timeout.Task task = this._timeoutTask;
        if (task != null) {
            httpClient.cancel(task);
        }
        this._timeoutTask = null;
    }

    public boolean configureListeners() {
        return this._configureListeners;
    }

    public AbstractHttpConnection disassociate() {
        AbstractHttpConnection abstractHttpConnection = this._connection;
        this._connection = null;
        if (getStatus() == 10) {
            setStatus(11);
        }
        return abstractHttpConnection;
    }

    public void expire(HttpDestination httpDestination) {
        if (getStatus() < 7) {
            setStatus(8);
        }
        httpDestination.exchangeExpired(this);
        AbstractHttpConnection abstractHttpConnection = this._connection;
        if (abstractHttpConnection != null) {
            abstractHttpConnection.exchangeExpired(this);
        }
    }

    public Address getAddress() {
        return this._address;
    }

    public HttpEventListener getEventListener() {
        return this._listener;
    }

    public Address getLocalAddress() {
        return this._localAddress;
    }

    public String getMethod() {
        return this._method;
    }

    public Buffer getRequestContent() {
        return this._requestContent;
    }

    public Buffer getRequestContentChunk(Buffer buffer) throws IOException {
        synchronized (this) {
            try {
                if (this._requestContentSource != null) {
                    if (buffer == null) {
                        buffer = new ByteArrayBuffer(8192);
                    }
                    int i = this._requestContentSource.read(buffer.array(), buffer.putIndex(), buffer.space());
                    if (i >= 0) {
                        buffer.setPutIndex(buffer.putIndex() + i);
                        return buffer;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public InputStream getRequestContentSource() {
        return this._requestContentSource;
    }

    public HttpFields getRequestFields() {
        return this._requestFields;
    }

    public String getRequestURI() {
        return this._uri;
    }

    public boolean getRetryStatus() {
        return this._retryStatus;
    }

    public Buffer getScheme() {
        return this._scheme;
    }

    public int getStatus() {
        return this._status.get();
    }

    public long getTimeout() {
        return this._timeout;
    }

    @Deprecated
    public String getURI() {
        return getRequestURI();
    }

    public int getVersion() {
        return this._version;
    }

    public boolean isAssociated() {
        return this._connection != null;
    }

    public boolean isDone() {
        boolean z;
        synchronized (this) {
            z = this._onDone;
        }
        return z;
    }

    public void onConnectionFailed(Throwable th) {
        LOG.warn("CONNECTION FAILED " + this, th);
    }

    public void onException(Throwable th) {
        LOG.warn(Log.EXCEPTION + this, th);
    }

    public void onExpire() {
        LOG.warn("EXPIRED " + this, new Object[0]);
    }

    public void onRequestCommitted() throws IOException {
    }

    public void onRequestComplete() throws IOException {
    }

    public void onResponseComplete() throws IOException {
    }

    public void onResponseContent(Buffer buffer) throws IOException {
    }

    public void onResponseHeader(Buffer buffer, Buffer buffer2) throws IOException {
    }

    public void onResponseHeaderComplete() throws IOException {
    }

    public void onResponseStatus(Buffer buffer, int i, Buffer buffer2) throws IOException {
    }

    public void onRetry() throws IOException {
        InputStream inputStream = this._requestContentSource;
        if (inputStream != null) {
            if (!inputStream.markSupported()) {
                rhg0.m179353a("Unsupported retry attempt");
            } else {
                this._requestContent = null;
                this._requestContentSource.reset();
            }
        }
    }

    public Connection onSwitchProtocol(EndPoint endPoint) throws IOException {
        return null;
    }

    public void reset() {
        synchronized (this) {
            this._timeoutTask = null;
            this._onRequestCompleteDone = false;
            this._onResponseCompleteDone = false;
            this._onDone = false;
            setStatus(0);
        }
    }

    public void scheduleTimeout(final HttpDestination httpDestination) {
        this._timeoutTask = new Timeout.Task() { // from class: org.eclipse.jetty.client.HttpExchange.1
            @Override // org.eclipse.jetty.util.thread.Timeout.Task
            public void expired() {
                HttpExchange.this.expire(httpDestination);
            }
        };
        HttpClient httpClient = httpDestination.getHttpClient();
        long timeout = getTimeout();
        Timeout.Task task = this._timeoutTask;
        if (timeout > 0) {
            httpClient.schedule(task, timeout);
        } else {
            httpClient.schedule(task);
        }
    }

    public void setAddress(Address address) {
        this._address = address;
    }

    public void setConfigureListeners(boolean z) {
        this._configureListeners = z;
    }

    public void setEventListener(HttpEventListener httpEventListener) {
        this._listener = httpEventListener;
    }

    public void setMethod(String str) {
        this._method = str;
    }

    public void setRequestContent(Buffer buffer) {
        this._requestContent = buffer;
    }

    public void setRequestContentSource(InputStream inputStream) {
        this._requestContentSource = inputStream;
        if (inputStream == null || !inputStream.markSupported()) {
            return;
        }
        this._requestContentSource.mark(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public void setRequestContentType(String str) {
        getRequestFields().put(HttpHeaders.CONTENT_TYPE_BUFFER, str);
    }

    public void setRequestHeader(String str, String str2) {
        getRequestFields().put(str, str2);
    }

    public void setRequestURI(String str) {
        this._uri = str;
    }

    public void setRetryStatus(boolean z) {
        this._retryStatus = z;
    }

    public void setScheme(String str) {
        if (str != null) {
            if ("http".equalsIgnoreCase(str)) {
                setScheme(HttpSchemes.HTTP_BUFFER);
            } else if ("https".equalsIgnoreCase(str)) {
                setScheme(HttpSchemes.HTTPS_BUFFER);
            } else {
                setScheme(new ByteArrayBuffer(str));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0086  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d0 A[Catch: IOException -> 0x001e, TryCatch #1 {IOException -> 0x001e, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x001b, B:13:0x0029, B:14:0x0040, B:89:0x0143, B:90:0x0162, B:91:0x0163, B:20:0x004b, B:31:0x0066, B:32:0x006b, B:35:0x0076, B:37:0x007c, B:38:0x0083, B:40:0x0088, B:41:0x008f, B:42:0x0094, B:48:0x00a8, B:49:0x00af, B:50:0x00b4, B:58:0x00cb, B:59:0x00d0, B:61:0x00d9, B:63:0x00dd, B:64:0x00e5, B:65:0x00eb, B:72:0x0102, B:73:0x0108, B:75:0x0112, B:77:0x0117, B:78:0x011d, B:82:0x012b, B:84:0x0130, B:85:0x0136), top: B:98:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0108 A[Catch: IOException -> 0x001e, TryCatch #1 {IOException -> 0x001e, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x001b, B:13:0x0029, B:14:0x0040, B:89:0x0143, B:90:0x0162, B:91:0x0163, B:20:0x004b, B:31:0x0066, B:32:0x006b, B:35:0x0076, B:37:0x007c, B:38:0x0083, B:40:0x0088, B:41:0x008f, B:42:0x0094, B:48:0x00a8, B:49:0x00af, B:50:0x00b4, B:58:0x00cb, B:59:0x00d0, B:61:0x00d9, B:63:0x00dd, B:64:0x00e5, B:65:0x00eb, B:72:0x0102, B:73:0x0108, B:75:0x0112, B:77:0x0117, B:78:0x011d, B:82:0x012b, B:84:0x0130, B:85:0x0136), top: B:98:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x011d A[Catch: IOException -> 0x001e, TryCatch #1 {IOException -> 0x001e, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x001b, B:13:0x0029, B:14:0x0040, B:89:0x0143, B:90:0x0162, B:91:0x0163, B:20:0x004b, B:31:0x0066, B:32:0x006b, B:35:0x0076, B:37:0x007c, B:38:0x0083, B:40:0x0088, B:41:0x008f, B:42:0x0094, B:48:0x00a8, B:49:0x00af, B:50:0x00b4, B:58:0x00cb, B:59:0x00d0, B:61:0x00d9, B:63:0x00dd, B:64:0x00e5, B:65:0x00eb, B:72:0x0102, B:73:0x0108, B:75:0x0112, B:77:0x0117, B:78:0x011d, B:82:0x012b, B:84:0x0130, B:85:0x0136), top: B:98:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0136 A[Catch: IOException -> 0x001e, TryCatch #1 {IOException -> 0x001e, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x001b, B:13:0x0029, B:14:0x0040, B:89:0x0143, B:90:0x0162, B:91:0x0163, B:20:0x004b, B:31:0x0066, B:32:0x006b, B:35:0x0076, B:37:0x007c, B:38:0x0083, B:40:0x0088, B:41:0x008f, B:42:0x0094, B:48:0x00a8, B:49:0x00af, B:50:0x00b4, B:58:0x00cb, B:59:0x00d0, B:61:0x00d9, B:63:0x00dd, B:64:0x00e5, B:65:0x00eb, B:72:0x0102, B:73:0x0108, B:75:0x0112, B:77:0x0117, B:78:0x011d, B:82:0x012b, B:84:0x0130, B:85:0x0136), top: B:98:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0140 A[ADDED_TO_REGION] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    public boolean setStatus(int i) {
        ?? r0 = 0;
         = 0;
         = 0;
         = 0;
         = 0;
        ?? r1 = 0;
        try {
            int i2 = this._status.get();
            ?? CompareAndSet = 3;
            if (i2 != i) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this._lastStatePeriod = (int) (jCurrentTimeMillis - this._lastStateChange);
                this._lastState = i2;
                this._lastStateChange = jCurrentTimeMillis;
                if (i == 3) {
                    this._sent = jCurrentTimeMillis;
                }
            }
            boolean z = true;
            try {
                switch (i2) {
                    case 0:
                        if (i != 0 && i != 1 && i != 2) {
                            switch (i) {
                                case 8:
                                    CompareAndSet = setStatusExpired(i, i2);
                                    break;
                                case 9:
                                case 10:
                                    CompareAndSet = this._status.compareAndSet(i2, i);
                                    break;
                                default:
                                    CompareAndSet = 0;
                                    break;
                            }
                        } else {
                            CompareAndSet = this._status.compareAndSet(i2, i);
                        }
                        z = false;
                        r1 = CompareAndSet;
                        if (r1 == 0 && !z) {
                            throw new IllegalStateException(toState(i2) + " => " + toState(i));
                        }
                        LOG.debug("setStatus {} {}", Integer.valueOf(i), this);
                        return r1;
                    case 1:
                        if (i != 2) {
                            switch (i) {
                                case 8:
                                    CompareAndSet = setStatusExpired(i, i2);
                                    break;
                                case 9:
                                case 10:
                                    CompareAndSet = this._status.compareAndSet(i2, i);
                                    break;
                                default:
                                    CompareAndSet = 0;
                                    break;
                            }
                        } else {
                            CompareAndSet = this._status.compareAndSet(i2, i);
                        }
                        z = false;
                        r1 = CompareAndSet;
                        if (r1 == 0) {
                            throw new IllegalStateException(toState(i2) + " => " + toState(i));
                        }
                        LOG.debug("setStatus {} {}", Integer.valueOf(i), this);
                        return r1;
                    case 2:
                        if (i != 3) {
                            switch (i) {
                                case 8:
                                    CompareAndSet = setStatusExpired(i, i2);
                                    break;
                                case 9:
                                case 10:
                                    CompareAndSet = this._status.compareAndSet(i2, i);
                                    break;
                                default:
                                    CompareAndSet = 0;
                                    break;
                            }
                        } else {
                            CompareAndSet = this._status.compareAndSet(i2, i);
                        }
                        z = false;
                        r1 = CompareAndSet;
                        if (r1 == 0) {
                            throw new IllegalStateException(toState(i2) + " => " + toState(i));
                        }
                        LOG.debug("setStatus {} {}", Integer.valueOf(i), this);
                        return r1;
                    case 3:
                        if (i != 4) {
                            switch (i) {
                                case 8:
                                    CompareAndSet = setStatusExpired(i, i2);
                                    break;
                                case 9:
                                case 10:
                                    CompareAndSet = this._status.compareAndSet(i2, i);
                                    break;
                                default:
                                    CompareAndSet = 0;
                                    break;
                            }
                        } else {
                            CompareAndSet = this._status.compareAndSet(i2, i);
                            if (CompareAndSet != 0) {
                                getEventListener().onRequestCommitted();
                                CompareAndSet = CompareAndSet;
                            }
                            break;
                        }
                        z = false;
                        r1 = CompareAndSet;
                        if (r1 == 0) {
                            throw new IllegalStateException(toState(i2) + " => " + toState(i));
                        }
                        LOG.debug("setStatus {} {}", Integer.valueOf(i), this);
                        return r1;
                    case 4:
                        if (i != 5) {
                            switch (i) {
                                case 8:
                                    CompareAndSet = setStatusExpired(i, i2);
                                    break;
                                case 9:
                                case 10:
                                    CompareAndSet = this._status.compareAndSet(i2, i);
                                    break;
                                default:
                                    CompareAndSet = 0;
                                    break;
                            }
                        } else {
                            CompareAndSet = this._status.compareAndSet(i2, i);
                        }
                        z = false;
                        r1 = CompareAndSet;
                        if (r1 == 0) {
                            throw new IllegalStateException(toState(i2) + " => " + toState(i));
                        }
                        LOG.debug("setStatus {} {}", Integer.valueOf(i), this);
                        return r1;
                    case 5:
                        switch (i) {
                            case 6:
                                CompareAndSet = this._status.compareAndSet(i2, i);
                                if (CompareAndSet != 0) {
                                    getEventListener().onResponseHeaderComplete();
                                    CompareAndSet = CompareAndSet;
                                    break;
                                }
                                z = false;
                                r1 = CompareAndSet;
                                if (r1 == 0) {
                                    throw new IllegalStateException(toState(i2) + " => " + toState(i));
                                }
                                LOG.debug("setStatus {} {}", Integer.valueOf(i), this);
                                return r1;
                            case 7:
                            default:
                                CompareAndSet = 0;
                                z = false;
                                r1 = CompareAndSet;
                                if (r1 == 0) {
                                    throw new IllegalStateException(toState(i2) + " => " + toState(i));
                                }
                                LOG.debug("setStatus {} {}", Integer.valueOf(i), this);
                                return r1;
                            case 8:
                                CompareAndSet = setStatusExpired(i, i2);
                                z = false;
                                r1 = CompareAndSet;
                                if (r1 == 0) {
                                    throw new IllegalStateException(toState(i2) + " => " + toState(i));
                                }
                                LOG.debug("setStatus {} {}", Integer.valueOf(i), this);
                                return r1;
                            case 9:
                            case 10:
                                CompareAndSet = this._status.compareAndSet(i2, i);
                                z = false;
                                r1 = CompareAndSet;
                                if (r1 == 0) {
                                    throw new IllegalStateException(toState(i2) + " => " + toState(i));
                                }
                                LOG.debug("setStatus {} {}", Integer.valueOf(i), this);
                                return r1;
                        }
                    case 6:
                        switch (i) {
                            case 7:
                                CompareAndSet = this._status.compareAndSet(i2, i);
                                if (CompareAndSet != 0) {
                                    getEventListener().onResponseComplete();
                                    CompareAndSet = CompareAndSet;
                                    break;
                                }
                                z = false;
                                r1 = CompareAndSet;
                                if (r1 == 0) {
                                    throw new IllegalStateException(toState(i2) + " => " + toState(i));
                                }
                                LOG.debug("setStatus {} {}", Integer.valueOf(i), this);
                                return r1;
                            case 8:
                                CompareAndSet = setStatusExpired(i, i2);
                                z = false;
                                r1 = CompareAndSet;
                                if (r1 == 0) {
                                    throw new IllegalStateException(toState(i2) + " => " + toState(i));
                                }
                                LOG.debug("setStatus {} {}", Integer.valueOf(i), this);
                                return r1;
                            case 9:
                            case 10:
                                CompareAndSet = this._status.compareAndSet(i2, i);
                                z = false;
                                r1 = CompareAndSet;
                                if (r1 == 0) {
                                    throw new IllegalStateException(toState(i2) + " => " + toState(i));
                                }
                                LOG.debug("setStatus {} {}", Integer.valueOf(i), this);
                                return r1;
                            default:
                                CompareAndSet = 0;
                                z = false;
                                r1 = CompareAndSet;
                                if (r1 == 0) {
                                    throw new IllegalStateException(toState(i2) + " => " + toState(i));
                                }
                                LOG.debug("setStatus {} {}", Integer.valueOf(i), this);
                                return r1;
                        }
                    case 7:
                        if (i != 0 && i != 4) {
                            switch (i) {
                                case 8:
                                case 10:
                                    break;
                                case 9:
                                    break;
                                default:
                                    z = false;
                                    break;
                            }
                            if (r1 == 0) {
                                throw new IllegalStateException(toState(i2) + " => " + toState(i));
                            }
                            LOG.debug("setStatus {} {}", Integer.valueOf(i), this);
                            return r1;
                        }
                        CompareAndSet = this._status.compareAndSet(i2, i);
                        z = false;
                        r1 = CompareAndSet;
                        if (r1 == 0) {
                            throw new IllegalStateException(toState(i2) + " => " + toState(i));
                        }
                        LOG.debug("setStatus {} {}", Integer.valueOf(i), this);
                        return r1;
                    case 8:
                    case 9:
                    case 11:
                        if (i == 0) {
                            CompareAndSet = this._status.compareAndSet(i2, i);
                            z = false;
                            r1 = CompareAndSet;
                        } else if (i == 7) {
                            done();
                        }
                        if (r1 == 0) {
                            throw new IllegalStateException(toState(i2) + " => " + toState(i));
                        }
                        LOG.debug("setStatus {} {}", Integer.valueOf(i), this);
                        return r1;
                    case 10:
                        if (i == 9 || i == 11) {
                            CompareAndSet = this._status.compareAndSet(i2, i);
                            if (CompareAndSet != 0) {
                                done();
                                CompareAndSet = CompareAndSet;
                            }
                            z = false;
                            r1 = CompareAndSet;
                            break;
                        }
                        if (r1 == 0) {
                            throw new IllegalStateException(toState(i2) + " => " + toState(i));
                        }
                        LOG.debug("setStatus {} {}", Integer.valueOf(i), this);
                        return r1;
                    default:
                        throw new AssertionError(i2 + " => " + i);
                }
            } catch (IOException e) {
                e = e;
                r0 = CompareAndSet;
                LOG.warn(e);
                return r0;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public void setTimeout(long j) {
        this._timeout = j;
    }

    public void setURI(URI uri) {
        if (!uri.isAbsolute()) {
            qhg0.m174539a("!Absolute URI: ", uri);
            return;
        }
        if (uri.isOpaque()) {
            qhg0.m174539a("Opaque URI: ", uri);
            return;
        }
        Logger logger = LOG;
        if (logger.isDebugEnabled()) {
            logger.debug("URI = {}", uri.toASCIIString());
        }
        String scheme = uri.getScheme();
        int port = uri.getPort();
        if (port <= 0) {
            port = "https".equalsIgnoreCase(scheme) ? WebSocket.DEFAULT_WSS_PORT : 80;
        }
        setScheme(scheme);
        setAddress(new Address(uri.getHost(), port));
        String completePath = new HttpURI(uri).getCompletePath();
        if (completePath == null) {
            completePath = "/";
        }
        setRequestURI(completePath);
    }

    public void setURL(String str) {
        setURI(URI.create(str));
    }

    public void setVersion(String str) {
        BufferCache.CachedBuffer cachedBuffer = HttpVersions.CACHE.get(str);
        if (cachedBuffer == null) {
            this._version = 10;
        } else {
            this._version = cachedBuffer.getOrdinal();
        }
    }

    public String toString() {
        String state = toState(getStatus());
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this._lastStateChange;
        String str = this._lastState >= 0 ? String.format("%s@%x=%s//%s%s#%s(%dms)->%s(%dms)", getClass().getSimpleName(), Integer.valueOf(hashCode()), this._method, this._address, this._uri, toState(this._lastState), Integer.valueOf(this._lastStatePeriod), state, Long.valueOf(j)) : String.format("%s@%x=%s//%s%s#%s(%dms)", getClass().getSimpleName(), Integer.valueOf(hashCode()), this._method, this._address, this._uri, state, Long.valueOf(j));
        if (getStatus() < 3 || this._sent <= 0) {
            return str;
        }
        return str + "sent=" + (jCurrentTimeMillis - this._sent) + "ms";
    }

    public int waitForDone() throws InterruptedException {
        int i;
        synchronized (this) {
            while (!isDone()) {
                try {
                    wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            i = this._status.get();
        }
        return i;
    }

    @Deprecated
    public void waitForStatus(int i) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    public void addRequestHeader(Buffer buffer, Buffer buffer2) {
        getRequestFields().add(buffer, buffer2);
    }

    @Deprecated
    public boolean isDone(int i) {
        return isDone();
    }

    public void setRequestHeader(Buffer buffer, Buffer buffer2) {
        getRequestFields().put(buffer, buffer2);
    }

    public void setVersion(int i) {
        this._version = i;
    }

    public void setScheme(Buffer buffer) {
        this._scheme = buffer;
    }

    @Deprecated
    public void setURI(String str) {
        setRequestURI(str);
    }
}
