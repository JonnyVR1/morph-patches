package org.eclipse.jetty.server;

import java.io.IOException;
import org.eclipse.jetty.http.Generator;
import org.eclipse.jetty.http.HttpException;
import org.eclipse.jetty.http.Parser;
import org.eclipse.jetty.p127io.Connection;
import org.eclipse.jetty.p127io.EndPoint;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: classes2.dex */
public class BlockingHttpConnection extends AbstractHttpConnection {
    private static final Logger LOG = Log.getLogger((Class<?>) BlockingHttpConnection.class);

    public BlockingHttpConnection(Connector connector, EndPoint endPoint, Server server) {
        super(connector, endPoint, server);
    }

    @Override // org.eclipse.jetty.server.AbstractHttpConnection, org.eclipse.jetty.p127io.Connection
    public Connection handle() throws IOException {
        Connection connection;
        Connection connection2;
        try {
            AbstractHttpConnection.setCurrentConnection(this);
            Connection connection3 = this;
            while (this._endp.isOpen() && connection3 == this) {
                try {
                    try {
                        if (!this._parser.isComplete() && !this._endp.isInputShutdown()) {
                            this._parser.parseAvailable();
                        }
                        if (this._generator.isCommitted() && !this._generator.isComplete() && !this._endp.isOutputShutdown()) {
                            this._generator.flushBuffer();
                        }
                        this._endp.flush();
                        if (this._parser.isComplete() && this._generator.isComplete()) {
                            reset();
                            if (this._response.getStatus() == 101 && (connection2 = (Connection) this._request.getAttribute("org.eclipse.jetty.io.Connection")) != null) {
                                connection3 = connection2;
                            }
                            if (!this._generator.isPersistent() && !this._endp.isOutputShutdown()) {
                                LOG.warn("Safety net oshut!!! Please open a bugzilla", new Object[0]);
                                this._endp.shutdownOutput();
                            }
                        }
                        if (this._endp.isInputShutdown() && this._generator.isIdle() && !this._request.getAsyncContinuation().isSuspended()) {
                            this._endp.close();
                        }
                    } catch (HttpException e) {
                        Logger logger = LOG;
                        if (logger.isDebugEnabled()) {
                            logger.debug("uri=" + this._uri, new Object[0]);
                            logger.debug("fields=" + this._requestFields, new Object[0]);
                            logger.debug(e);
                        }
                        this._generator.sendError(e.getStatus(), e.getReason(), null, true);
                        this._parser.reset();
                        this._endp.shutdownOutput();
                        if (this._parser.isComplete() && this._generator.isComplete()) {
                            reset();
                            if (this._response.getStatus() == 101 && (connection = (Connection) this._request.getAttribute("org.eclipse.jetty.io.Connection")) != null) {
                                connection3 = connection;
                            }
                            if (!this._generator.isPersistent() && !this._endp.isOutputShutdown()) {
                                logger.warn("Safety net oshut!!! Please open a bugzilla", new Object[0]);
                                this._endp.shutdownOutput();
                            }
                        }
                        if (!this._endp.isInputShutdown() || !this._generator.isIdle() || this._request.getAsyncContinuation().isSuspended()) {
                        }
                    }
                } catch (Throwable th) {
                    if (this._parser.isComplete() && this._generator.isComplete()) {
                        reset();
                        if (this._response.getStatus() == 101) {
                        }
                        if (!this._generator.isPersistent() && !this._endp.isOutputShutdown()) {
                            LOG.warn("Safety net oshut!!! Please open a bugzilla", new Object[0]);
                            this._endp.shutdownOutput();
                        }
                    }
                    if (this._endp.isInputShutdown() && this._generator.isIdle() && !this._request.getAsyncContinuation().isSuspended()) {
                        this._endp.close();
                    }
                    throw th;
                }
            }
            AbstractHttpConnection.setCurrentConnection(null);
            this._parser.returnBuffers();
            this._generator.returnBuffers();
            return connection3;
        } catch (Throwable th2) {
            AbstractHttpConnection.setCurrentConnection(null);
            this._parser.returnBuffers();
            this._generator.returnBuffers();
            throw th2;
        }
    }

    @Override // org.eclipse.jetty.server.AbstractHttpConnection
    public void handleRequest() throws Throwable {
        super.handleRequest();
    }

    public BlockingHttpConnection(Connector connector, EndPoint endPoint, Server server, Parser parser, Generator generator, Request request) {
        super(connector, endPoint, server, parser, generator, request);
    }
}
