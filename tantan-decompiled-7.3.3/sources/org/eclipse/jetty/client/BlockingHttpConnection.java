package org.eclipse.jetty.client;

import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.io.IOException;
import java.io.InterruptedIOException;
import org.eclipse.jetty.p127io.Buffer;
import org.eclipse.jetty.p127io.Buffers;
import org.eclipse.jetty.p127io.Connection;
import org.eclipse.jetty.p127io.EndPoint;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: classes2.dex */
public class BlockingHttpConnection extends AbstractHttpConnection {
    private static final Logger LOG = Log.getLogger((Class<?>) BlockingHttpConnection.class);
    private boolean _requestComplete;
    private Buffer _requestContentChunk;

    public BlockingHttpConnection(Buffers buffers, Buffers buffers2, EndPoint endPoint) {
        super(buffers, buffers2, endPoint);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0268 */
    @Override // org.eclipse.jetty.client.AbstractHttpConnection, org.eclipse.jetty.p127io.Connection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Connection handle() throws IOException {
        HttpExchange httpExchange;
        boolean z;
        Throwable th;
        boolean z2 = false;
        Connection connectionOnSwitchProtocol = this;
        boolean z3 = false;
        while (this._endp.isOpen() && connectionOnSwitchProtocol == this) {
            try {
                LOG.debug("open={} more={}", Boolean.valueOf(this._endp.isOpen()), Boolean.valueOf(this._parser.isMoreInBuffer()));
                synchronized (this) {
                    httpExchange = this._exchange;
                    while (httpExchange == null) {
                        try {
                            wait();
                            httpExchange = this._exchange;
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                }
                Logger logger = LOG;
                logger.debug("exchange {}", httpExchange);
                boolean z4 = true;
                try {
                    if (!this._generator.isCommitted() && httpExchange.getStatus() == 2) {
                        logger.debug("commit", new Object[0]);
                        commitRequest();
                    }
                    while (this._generator.isCommitted() && !this._generator.isComplete()) {
                        if (this._generator.flushBuffer() > 0) {
                            LOG.debug("flushed", new Object[0]);
                        }
                        if (this._generator.isState(2)) {
                            if (this._requestContentChunk == null) {
                                this._requestContentChunk = httpExchange.getRequestContentChunk(null);
                            }
                            if (this._requestContentChunk == null) {
                                LOG.debug("complete", new Object[0]);
                                this._generator.complete();
                            } else if (this._generator.isEmpty()) {
                                LOG.debug("addChunk", new Object[0]);
                                Buffer buffer = this._requestContentChunk;
                                Buffer requestContentChunk = httpExchange.getRequestContentChunk(null);
                                this._requestContentChunk = requestContentChunk;
                                this._generator.addContent(buffer, requestContentChunk == null);
                                if (this._requestContentChunk == null) {
                                    httpExchange.setStatus(4);
                                }
                            }
                        }
                    }
                    if (this._generator.isComplete() && !this._requestComplete) {
                        LOG.debug("requestComplete", new Object[0]);
                        this._requestComplete = true;
                        httpExchange.getEventListener().onRequestComplete();
                    }
                    if (!this._parser.isComplete() && this._parser.parseAvailable()) {
                        LOG.debug("parsed", new Object[0]);
                    }
                    this._endp.flush();
                    Logger logger2 = LOG;
                    logger2.debug("{} {}", this._generator, this._parser);
                    logger2.debug(WeJson.EMPTY_MAP, this._endp);
                    if (z3 || (this._generator.isComplete() && this._parser.isComplete())) {
                        if (z3 || !this._parser.isPersistent() || !this._generator.isPersistent()) {
                            z4 = false;
                        }
                        this._generator.setPersistent(z4);
                        reset();
                        if (z4) {
                            this._endp.setMaxIdleTime((int) this._destination.getHttpClient().getIdleTimeout());
                        }
                        synchronized (this) {
                            try {
                                HttpExchange httpExchange2 = this._exchange;
                                this._exchange = null;
                                if (httpExchange2 != null) {
                                    httpExchange2.cancelTimeout(this._destination.getHttpClient());
                                }
                                if (this._status == 101) {
                                    connectionOnSwitchProtocol = httpExchange2.onSwitchProtocol(this._endp);
                                    this._pipeline = null;
                                    this._pipeline = null;
                                }
                                HttpExchange httpExchange3 = this._pipeline;
                                if (httpExchange3 != null) {
                                    if (z4 && connectionOnSwitchProtocol == this) {
                                        this._exchange = httpExchange3;
                                    } else {
                                        this._destination.send(httpExchange3);
                                    }
                                    this._pipeline = null;
                                }
                                if (this._exchange == null && !isReserved()) {
                                    this._destination.returnConnection(this, !z4);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        Logger logger3 = LOG;
                        logger3.debug("Failure on " + this._exchange, th3);
                        synchronized (this) {
                            try {
                                if (httpExchange.getStatus() != 10 && httpExchange.getStatus() != 11 && !httpExchange.isDone() && httpExchange.setStatus(9)) {
                                    httpExchange.getEventListener().onException(th3);
                                }
                                logger3.debug("{} {}", this._generator, this._parser);
                                logger3.debug(WeJson.EMPTY_MAP, this._endp);
                                this._generator.setPersistent(false);
                                reset();
                                synchronized (this) {
                                    try {
                                        HttpExchange httpExchange4 = this._exchange;
                                        this._exchange = null;
                                        if (httpExchange4 != null) {
                                            httpExchange4.cancelTimeout(this._destination.getHttpClient());
                                        }
                                        if (this._status == 101) {
                                            connectionOnSwitchProtocol = httpExchange4.onSwitchProtocol(this._endp);
                                            this._pipeline = null;
                                            this._pipeline = null;
                                        }
                                        HttpExchange httpExchange5 = this._pipeline;
                                        if (httpExchange5 != null) {
                                            this._destination.send(httpExchange5);
                                            this._pipeline = null;
                                        }
                                        if (this._exchange == null && !isReserved()) {
                                            this._destination.returnConnection(this, true);
                                        }
                                        z3 = true;
                                    } catch (Throwable th4) {
                                        throw th4;
                                    }
                                }
                            } catch (Throwable th5) {
                                throw th5;
                            }
                        }
                    } catch (Throwable th6) {
                        z = z3;
                        th = th6;
                    }
                }
            } catch (Throwable th7) {
                this._parser.returnBuffers();
                this._generator.returnBuffers();
                throw th7;
            }
        }
        this._parser.returnBuffers();
        this._generator.returnBuffers();
        return connectionOnSwitchProtocol;
        Logger logger4 = LOG;
        logger4.debug("{} {}", this._generator, this._parser);
        logger4.debug(WeJson.EMPTY_MAP, this._endp);
        if (!z && (!this._generator.isComplete() || !this._parser.isComplete())) {
            throw th;
        }
        if (!z && this._parser.isPersistent() && this._generator.isPersistent()) {
            z2 = true;
        }
        this._generator.setPersistent(z2);
        reset();
        if (z2) {
            this._endp.setMaxIdleTime((int) this._destination.getHttpClient().getIdleTimeout());
        }
        synchronized (this) {
            try {
                HttpExchange httpExchange6 = this._exchange;
                this._exchange = null;
                if (httpExchange6 != null) {
                    httpExchange6.cancelTimeout(this._destination.getHttpClient());
                }
                if (this._status == 101) {
                    connectionOnSwitchProtocol = httpExchange6.onSwitchProtocol(this._endp);
                    this._pipeline = null;
                    this._pipeline = null;
                }
                HttpExchange httpExchange7 = this._pipeline;
                if (httpExchange7 != null) {
                    if (z2 && connectionOnSwitchProtocol == this) {
                        this._exchange = httpExchange7;
                    } else {
                        this._destination.send(httpExchange7);
                    }
                    this._pipeline = null;
                }
                if (this._exchange == null && !isReserved()) {
                    this._destination.returnConnection(this, !z2);
                }
                throw th;
            } catch (Throwable th8) {
                throw th8;
            }
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
        if (!zSend) {
            return zSend;
        }
        synchronized (this) {
            notifyAll();
        }
        return zSend;
    }
}
