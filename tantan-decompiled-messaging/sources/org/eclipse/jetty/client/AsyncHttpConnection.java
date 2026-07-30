package org.eclipse.jetty.client;

import java.io.IOException;
import org.eclipse.jetty.p123io.AsyncEndPoint;
import org.eclipse.jetty.p123io.Buffer;
import org.eclipse.jetty.p123io.Buffers;
import org.eclipse.jetty.p123io.Connection;
import org.eclipse.jetty.p123io.EndPoint;
import org.eclipse.jetty.p123io.nio.AsyncConnection;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class AsyncHttpConnection extends AbstractHttpConnection implements AsyncConnection {
    private static final Logger LOG = Log.getLogger((Class<?>) AsyncHttpConnection.class);
    private final AsyncEndPoint _asyncEndp;
    private boolean _requestComplete;
    private Buffer _requestContentChunk;

    public AsyncHttpConnection(Buffers buffers, Buffers buffers2, EndPoint endPoint) {
        super(buffers, buffers2, endPoint);
        this._asyncEndp = (AsyncEndPoint) endPoint;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x0232 A[Catch: all -> 0x023c, TryCatch #8 {all -> 0x023c, blocks: (B:133:0x022c, B:135:0x0232, B:138:0x023e, B:140:0x0242, B:142:0x024a, B:144:0x024e, B:145:0x0253, B:146:0x0256, B:148:0x025a, B:149:0x0261, B:151:0x0265, B:153:0x026b, B:154:0x0270), top: B:241:0x022c, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x024e A[Catch: all -> 0x023c, TryCatch #8 {all -> 0x023c, blocks: (B:133:0x022c, B:135:0x0232, B:138:0x023e, B:140:0x0242, B:142:0x024a, B:144:0x024e, B:145:0x0253, B:146:0x0256, B:148:0x025a, B:149:0x0261, B:151:0x0265, B:153:0x026b, B:154:0x0270), top: B:241:0x022c, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x025a A[Catch: all -> 0x023c, TryCatch #8 {all -> 0x023c, blocks: (B:133:0x022c, B:135:0x0232, B:138:0x023e, B:140:0x0242, B:142:0x024a, B:144:0x024e, B:145:0x0253, B:146:0x0256, B:148:0x025a, B:149:0x0261, B:151:0x0265, B:153:0x026b, B:154:0x0270), top: B:241:0x022c, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x027a A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:119:0x01ea, B:121:0x01f2, B:123:0x01fa, B:125:0x0200, B:127:0x0208, B:130:0x0213, B:158:0x0276, B:160:0x027a, B:162:0x027e, B:164:0x0282, B:165:0x0284, B:166:0x0285, B:167:0x028a, B:168:0x028b, B:169:0x028d, B:170:0x028e, B:171:0x0290), top: B:228:0x01ea, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x027e A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:119:0x01ea, B:121:0x01f2, B:123:0x01fa, B:125:0x0200, B:127:0x0208, B:130:0x0213, B:158:0x0276, B:160:0x027a, B:162:0x027e, B:164:0x0282, B:165:0x0284, B:166:0x0285, B:167:0x028a, B:168:0x028b, B:169:0x028d, B:170:0x028e, B:171:0x0290), top: B:228:0x01ea, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x0282 A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:119:0x01ea, B:121:0x01f2, B:123:0x01fa, B:125:0x0200, B:127:0x0208, B:130:0x0213, B:158:0x0276, B:160:0x027a, B:162:0x027e, B:164:0x0282, B:165:0x0284, B:166:0x0285, B:167:0x028a, B:168:0x028b, B:169:0x028d, B:170:0x028e, B:171:0x0290), top: B:228:0x01ea, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x0285 A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:119:0x01ea, B:121:0x01f2, B:123:0x01fa, B:125:0x0200, B:127:0x0208, B:130:0x0213, B:158:0x0276, B:160:0x027a, B:162:0x027e, B:164:0x0282, B:165:0x0284, B:166:0x0285, B:167:0x028a, B:168:0x028b, B:169:0x028d, B:170:0x028e, B:171:0x0290), top: B:228:0x01ea, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x028b A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:119:0x01ea, B:121:0x01f2, B:123:0x01fa, B:125:0x0200, B:127:0x0208, B:130:0x0213, B:158:0x0276, B:160:0x027a, B:162:0x027e, B:164:0x0282, B:165:0x0284, B:166:0x0285, B:167:0x028a, B:168:0x028b, B:169:0x028d, B:170:0x028e, B:171:0x0290), top: B:228:0x01ea, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x028e A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:119:0x01ea, B:121:0x01f2, B:123:0x01fa, B:125:0x0200, B:127:0x0208, B:130:0x0213, B:158:0x0276, B:160:0x027a, B:162:0x027e, B:164:0x0282, B:165:0x0284, B:166:0x0285, B:167:0x028a, B:168:0x028b, B:169:0x028d, B:170:0x028e, B:171:0x0290), top: B:228:0x01ea, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:228:0x01ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x022c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x0276 A[SYNTHETIC] */
    @Override // org.eclipse.jetty.client.AbstractHttpConnection, org.eclipse.jetty.p123io.Connection
    public Connection handle() throws IOException {
        boolean z;
        boolean z2;
        Throwable th;
        Connection connectionOnSwitchProtocol;
        HttpExchange httpExchange;
        HttpExchange httpExchange2;
        Connection connectionOnSwitchProtocol2;
        HttpExchange httpExchange3;
        Connection connectionOnSwitchProtocol3;
        boolean z3 = false;
        Connection connection = this;
        boolean z4 = false;
        for (boolean z5 = true; z5 && connection == this; z5 = z) {
            try {
                Logger logger = LOG;
                logger.debug("while open={} more={} progress={}", Boolean.valueOf(this._endp.isOpen()), Boolean.valueOf(this._parser.isMoreInBuffer()), Boolean.valueOf(z5));
                HttpExchange httpExchange4 = this._exchange;
                logger.debug("exchange {} on {}", httpExchange4, this);
                try {
                    if (this._generator.isCommitted() || httpExchange4 == null || httpExchange4.getStatus() != 2) {
                        z = false;
                    } else {
                        logger.debug("commit {}", httpExchange4);
                        try {
                            commitRequest();
                            z = true;
                        } catch (Throwable th2) {
                            th = th2;
                            z = true;
                            try {
                                Logger logger2 = LOG;
                                logger2.debug("Failure on " + this._exchange, th);
                                try {
                                    synchronized (this) {
                                        if (httpExchange4 != null) {
                                            if (!(th instanceof IOException)) {
                                                throw ((IOException) th);
                                            }
                                            if (!(th instanceof Error)) {
                                                throw ((Error) th);
                                            }
                                            if (th instanceof RuntimeException) {
                                                throw ((RuntimeException) th);
                                            }
                                            throw new RuntimeException(th);
                                        }
                                        try {
                                            if (httpExchange4.getStatus() != 10) {
                                                httpExchange4.getEventListener().onException(th);
                                            }
                                            logger2.debug("finally {} on {} progress={} {}", httpExchange4, this, Boolean.valueOf(z), this._endp);
                                            this._generator.setPersistent(false);
                                            reset();
                                            synchronized (this) {
                                                try {
                                                    httpExchange = this._exchange;
                                                    this._exchange = null;
                                                    if (httpExchange != null) {
                                                        httpExchange.cancelTimeout(this._destination.getHttpClient());
                                                    }
                                                    if (this._status == 101) {
                                                        httpExchange3 = this._pipeline;
                                                        if (httpExchange3 != null) {
                                                            this._destination.send(httpExchange3);
                                                        }
                                                        this._pipeline = null;
                                                        connection = connectionOnSwitchProtocol2;
                                                    }
                                                    httpExchange2 = this._pipeline;
                                                    if (httpExchange2 != null) {
                                                        this._destination.send(httpExchange2);
                                                        this._pipeline = null;
                                                    }
                                                    if (this._exchange == null) {
                                                        this._destination.returnConnection(this, true);
                                                    }
                                                    z4 = true;
                                                } catch (Throwable th3) {
                                                    throw th3;
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            throw th4;
                                        }
                                        this._parser.returnBuffers();
                                        this._generator.returnBuffers();
                                        LOG.debug("unhandle {} on {}", this._exchange, this._endp);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    z2 = true;
                                    LOG.debug("finally {} on {} progress={} {}", httpExchange4, this, Boolean.valueOf(z), this._endp);
                                    if (!z2 && (!this._generator.isComplete() || !this._parser.isComplete())) {
                                        throw th;
                                    }
                                    if (!z2 && this._parser.isPersistent() && this._generator.isPersistent()) {
                                        z3 = true;
                                    }
                                    this._generator.setPersistent(z3);
                                    reset();
                                    if (z3) {
                                        this._endp.setMaxIdleTime((int) this._destination.getHttpClient().getIdleTimeout());
                                    }
                                    synchronized (this) {
                                        try {
                                            HttpExchange httpExchange5 = this._exchange;
                                            this._exchange = null;
                                            if (httpExchange5 != null) {
                                                httpExchange5.cancelTimeout(this._destination.getHttpClient());
                                            }
                                            if (this._status == 101 && (connectionOnSwitchProtocol = httpExchange5.onSwitchProtocol(this._endp)) != null) {
                                                HttpExchange httpExchange6 = this._pipeline;
                                                if (httpExchange6 != null) {
                                                    this._destination.send(httpExchange6);
                                                }
                                                this._pipeline = null;
                                                connection = connectionOnSwitchProtocol;
                                            }
                                            HttpExchange httpExchange7 = this._pipeline;
                                            if (httpExchange7 != null) {
                                                if (z3 && connection == this) {
                                                    this._exchange = httpExchange7;
                                                } else {
                                                    this._destination.send(httpExchange7);
                                                }
                                                this._pipeline = null;
                                            }
                                            if (this._exchange == null && !isReserved()) {
                                                this._destination.returnConnection(this, true ^ z3);
                                            }
                                        } catch (Throwable th6) {
                                            throw th6;
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th7) {
                                z2 = z4;
                                th = th7;
                            }
                        }
                    }
                    try {
                        if (this._generator.isCommitted() && !this._generator.isComplete()) {
                            if (this._generator.flushBuffer() > 0) {
                                logger.debug("flushed", new Object[0]);
                                z = true;
                            }
                            if (this._generator.isState(2)) {
                                if (this._requestContentChunk == null) {
                                    this._requestContentChunk = httpExchange4.getRequestContentChunk(null);
                                }
                                if (this._requestContentChunk == null) {
                                    logger.debug("complete {}", httpExchange4);
                                    this._generator.complete();
                                } else if (this._generator.isEmpty()) {
                                    logger.debug("addChunk", new Object[0]);
                                    Buffer buffer = this._requestContentChunk;
                                    Buffer requestContentChunk = httpExchange4.getRequestContentChunk(null);
                                    this._requestContentChunk = requestContentChunk;
                                    this._generator.addContent(buffer, requestContentChunk == null);
                                    if (this._requestContentChunk == null) {
                                        httpExchange4.setStatus(4);
                                    }
                                }
                                z = true;
                            }
                        }
                        if (this._generator.isComplete() && !this._requestComplete) {
                            logger.debug("requestComplete {}", httpExchange4);
                            this._requestComplete = true;
                            httpExchange4.getEventListener().onRequestComplete();
                            z = true;
                        }
                        if (!this._parser.isComplete() && this._parser.parseAvailable()) {
                            logger.debug("parsed {}", httpExchange4);
                            z = true;
                        }
                        this._endp.flush();
                        if (this._asyncEndp.hasProgressed()) {
                            logger.debug("hasProgressed {}", httpExchange4);
                            z = true;
                        }
                        logger.debug("finally {} on {} progress={} {}", httpExchange4, this, Boolean.valueOf(z), this._endp);
                        if (z4 || (this._generator.isComplete() && this._parser.isComplete())) {
                            boolean z6 = !z4 && this._parser.isPersistent() && this._generator.isPersistent();
                            this._generator.setPersistent(z6);
                            reset();
                            if (z6) {
                                this._endp.setMaxIdleTime((int) this._destination.getHttpClient().getIdleTimeout());
                            }
                            synchronized (this) {
                                try {
                                    HttpExchange httpExchange8 = this._exchange;
                                    this._exchange = null;
                                    if (httpExchange8 != null) {
                                        httpExchange8.cancelTimeout(this._destination.getHttpClient());
                                    }
                                    if (this._status == 101 && (connectionOnSwitchProtocol3 = httpExchange8.onSwitchProtocol(this._endp)) != null) {
                                        HttpExchange httpExchange9 = this._pipeline;
                                        if (httpExchange9 != null) {
                                            this._destination.send(httpExchange9);
                                        }
                                        this._pipeline = null;
                                        connection = connectionOnSwitchProtocol3;
                                    }
                                    HttpExchange httpExchange10 = this._pipeline;
                                    if (httpExchange10 != null) {
                                        if (z6 && connection == this) {
                                            this._exchange = httpExchange10;
                                        } else {
                                            this._destination.send(httpExchange10);
                                        }
                                        this._pipeline = null;
                                    }
                                    if (this._exchange == null && !isReserved()) {
                                        this._destination.returnConnection(this, !z6);
                                    }
                                } catch (Throwable th8) {
                                    throw th8;
                                }
                            }
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        Logger logger3 = LOG;
                        logger3.debug("Failure on " + this._exchange, th);
                        synchronized (this) {
                            if (httpExchange4 != null) {
                                if (!(th instanceof IOException)) {
                                    throw ((IOException) th);
                                }
                                if (!(th instanceof Error)) {
                                    throw ((Error) th);
                                }
                                if (th instanceof RuntimeException) {
                                    throw ((RuntimeException) th);
                                }
                                throw new RuntimeException(th);
                            }
                            if (httpExchange4.getStatus() != 10 && httpExchange4.getStatus() != 11 && !httpExchange4.isDone() && httpExchange4.setStatus(9)) {
                                httpExchange4.getEventListener().onException(th);
                            }
                            this._parser.returnBuffers();
                            this._generator.returnBuffers();
                            LOG.debug("unhandle {} on {}", this._exchange, this._endp);
                            throw th;
                        }
                        logger3.debug("finally {} on {} progress={} {}", httpExchange4, this, Boolean.valueOf(z), this._endp);
                        this._generator.setPersistent(false);
                        reset();
                        synchronized (this) {
                            httpExchange = this._exchange;
                            this._exchange = null;
                            if (httpExchange != null) {
                                httpExchange.cancelTimeout(this._destination.getHttpClient());
                            }
                            if (this._status == 101 && (connectionOnSwitchProtocol2 = httpExchange.onSwitchProtocol(this._endp)) != null) {
                                httpExchange3 = this._pipeline;
                                if (httpExchange3 != null) {
                                    this._destination.send(httpExchange3);
                                }
                                this._pipeline = null;
                                connection = connectionOnSwitchProtocol2;
                            }
                            httpExchange2 = this._pipeline;
                            if (httpExchange2 != null) {
                                this._destination.send(httpExchange2);
                                this._pipeline = null;
                            }
                            if (this._exchange == null && !isReserved()) {
                                this._destination.returnConnection(this, true);
                            }
                        }
                        z4 = true;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    z = false;
                }
            } catch (Throwable th11) {
                this._parser.returnBuffers();
                this._generator.returnBuffers();
                LOG.debug("unhandle {} on {}", this._exchange, this._endp);
                throw th11;
            }
        }
        this._parser.returnBuffers();
        this._generator.returnBuffers();
        LOG.debug("unhandle {} on {}", this._exchange, this._endp);
        return connection;
    }

    @Override // org.eclipse.jetty.p123io.nio.AsyncConnection
    public void onInputShutdown() throws IOException {
        if (this._generator.isIdle()) {
            this._endp.shutdownOutput();
        }
    }

    @Override // org.eclipse.jetty.client.AbstractHttpConnection
    public void reset() throws IOException {
        this._requestComplete = false;
        super.reset();
    }

    @Override // org.eclipse.jetty.client.AbstractHttpConnection
    public boolean send(HttpExchange httpExchange) throws IOException {
        boolean zSend = super.send(httpExchange);
        if (zSend) {
            this._asyncEndp.asyncDispatch();
        }
        return zSend;
    }
}
