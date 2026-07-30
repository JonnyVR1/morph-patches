package org.eclipse.jetty.server;

import java.io.IOException;
import org.eclipse.jetty.http.HttpException;
import org.eclipse.jetty.p004io.AsyncEndPoint;
import org.eclipse.jetty.p004io.Connection;
import org.eclipse.jetty.p004io.EndPoint;
import org.eclipse.jetty.p004io.nio.AsyncConnection;
import org.eclipse.jetty.p004io.nio.SelectChannelEndPoint;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class AsyncHttpConnection extends AbstractHttpConnection implements AsyncConnection {
    private final AsyncEndPoint _asyncEndp;
    private boolean _readInterested;
    private int _total_no_progress;
    private static final int NO_PROGRESS_INFO = Integer.getInteger("org.mortbay.jetty.NO_PROGRESS_INFO", 100).intValue();
    private static final int NO_PROGRESS_CLOSE = Integer.getInteger("org.mortbay.jetty.NO_PROGRESS_CLOSE", 200).intValue();
    private static final Logger LOG = Log.getLogger((Class<?>) AsyncHttpConnection.class);

    public AsyncHttpConnection(Connector connector, EndPoint endPoint, Server server) {
        super(connector, endPoint, server);
        this._readInterested = true;
        this._asyncEndp = (AsyncEndPoint) endPoint;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x01ef A[Catch: all -> 0x00c5, TryCatch #4 {all -> 0x00c5, blocks: (B:42:0x0098, B:49:0x00b1, B:51:0x00b9, B:56:0x00ca, B:58:0x00d5, B:60:0x00dd, B:62:0x00eb, B:64:0x00fa, B:66:0x0106, B:104:0x01d8, B:111:0x01ef, B:113:0x01f9, B:114:0x0201, B:116:0x020c, B:118:0x0214, B:119:0x0222, B:121:0x0232, B:123:0x023e, B:124:0x0247), top: B:177:0x0098 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01f9 A[Catch: all -> 0x00c5, TryCatch #4 {all -> 0x00c5, blocks: (B:42:0x0098, B:49:0x00b1, B:51:0x00b9, B:56:0x00ca, B:58:0x00d5, B:60:0x00dd, B:62:0x00eb, B:64:0x00fa, B:66:0x0106, B:104:0x01d8, B:111:0x01ef, B:113:0x01f9, B:114:0x0201, B:116:0x020c, B:118:0x0214, B:119:0x0222, B:121:0x0232, B:123:0x023e, B:124:0x0247), top: B:177:0x0098 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0222 A[Catch: all -> 0x00c5, TryCatch #4 {all -> 0x00c5, blocks: (B:42:0x0098, B:49:0x00b1, B:51:0x00b9, B:56:0x00ca, B:58:0x00d5, B:60:0x00dd, B:62:0x00eb, B:64:0x00fa, B:66:0x0106, B:104:0x01d8, B:111:0x01ef, B:113:0x01f9, B:114:0x0201, B:116:0x020c, B:118:0x0214, B:119:0x0222, B:121:0x0232, B:123:0x023e, B:124:0x0247), top: B:177:0x0098 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:152:0x0308  */
    /* JADX WARN: Code duplicated, block: B:154:0x030b  */
    /* JADX WARN: Code duplicated, block: B:168:0x0374  */
    /* JADX WARN: Code duplicated, block: B:169:0x037e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0096  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:48:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b1 A[Catch: all -> 0x00c5, TryCatch #4 {all -> 0x00c5, blocks: (B:42:0x0098, B:49:0x00b1, B:51:0x00b9, B:56:0x00ca, B:58:0x00d5, B:60:0x00dd, B:62:0x00eb, B:64:0x00fa, B:66:0x0106, B:104:0x01d8, B:111:0x01ef, B:113:0x01f9, B:114:0x0201, B:116:0x020c, B:118:0x0214, B:119:0x0222, B:121:0x0232, B:123:0x023e, B:124:0x0247), top: B:177:0x0098 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00eb A[Catch: all -> 0x00c5, TryCatch #4 {all -> 0x00c5, blocks: (B:42:0x0098, B:49:0x00b1, B:51:0x00b9, B:56:0x00ca, B:58:0x00d5, B:60:0x00dd, B:62:0x00eb, B:64:0x00fa, B:66:0x0106, B:104:0x01d8, B:111:0x01ef, B:113:0x01f9, B:114:0x0201, B:116:0x020c, B:118:0x0214, B:119:0x0222, B:121:0x0232, B:123:0x023e, B:124:0x0247), top: B:177:0x0098 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    @Override // org.eclipse.jetty.server.AbstractHttpConnection, org.eclipse.jetty.p004io.Connection
    public Connection handle() throws Throwable {
        int i;
        int i2;
        int i3;
        int i4;
        EndPoint endPoint;
        int i5;
        int i6;
        int i7;
        ?? r15;
        boolean zIsComplete;
        boolean zIsComplete2;
        boolean z;
        ?? r0;
        Connection connection;
        ?? r16;
        ?? r17;
        ?? r18;
        boolean zIsComplete3;
        boolean zIsComplete4;
        ?? r19;
        Connection connection2;
        int i8 = 0;
        try {
            AbstractHttpConnection.setCurrentConnection(this);
            this._asyncEndp.setCheckForIdle(false);
            Connection connection3 = this;
            i = 0;
            ?? r1 = 1;
            while (r1 != 0 && connection3 == this) {
                try {
                    try {
                        try {
                            try {
                                if (!this._request._async.isAsync()) {
                                    if (!this._parser.isComplete() && this._parser.parseAvailable()) {
                                        r16 = 1;
                                    }
                                    r17 = r16;
                                    if (this._generator.isCommitted() && !this._generator.isComplete() && !this._endp.isOutputShutdown() && !this._request.getAsyncContinuation().isAsyncStarted() && this._generator.flushBuffer() > 0) {
                                        r17 = r16;
                                        r17 = r16;
                                        r17 = r16;
                                        r17 = r16;
                                        r17 = 1;
                                    }
                                    r17 = r16;
                                    r17 = r16;
                                    r17 = r16;
                                    r17 = r16;
                                    r17 = r16;
                                    r17 = r16;
                                    r17 = r16;
                                    r17 = r16;
                                    r17 = r16;
                                    r17 = r16;
                                    this._endp.flush();
                                    r18 = r17;
                                    if (this._asyncEndp.hasProgressed()) {
                                        r18 = 1;
                                    }
                                    i |= r18 == true ? 1 : 0;
                                    zIsComplete3 = this._parser.isComplete();
                                    zIsComplete4 = this._generator.isComplete();
                                    if (zIsComplete3 || !zIsComplete4) {
                                        r19 = i8;
                                    } else {
                                        r19 = 1;
                                    }
                                    if (zIsComplete3) {
                                        if (zIsComplete4) {
                                            if (this._response.getStatus() == 101 && (connection2 = (Connection) this._request.getAttribute("org.eclipse.jetty.io.Connection")) != null) {
                                                connection3 = connection2;
                                            }
                                            reset();
                                            if (!this._generator.isPersistent() && !this._endp.isOutputShutdown()) {
                                                LOG.warn("Safety net oshut!!!  IF YOU SEE THIS, PLEASE RAISE BUGZILLA", new Object[i8]);
                                                this._endp.shutdownOutput();
                                            }
                                            r18 = 1;
                                        } else {
                                            this._readInterested = i8;
                                            LOG.debug("Disabled read interest while writing response {}", this._endp);
                                        }
                                    }
                                    if (r19 == 0 && this._request.getAsyncContinuation().isAsyncStarted()) {
                                        LOG.debug("suspended {}", this);
                                        r18 = i8;
                                    }
                                    r0 = r18;
                                    i8 = 0;
                                    r1 = r0;
                                } else if (this._request._async.isDispatchable()) {
                                    handleRequest();
                                }
                                zIsComplete3 = this._parser.isComplete();
                                zIsComplete4 = this._generator.isComplete();
                                if (zIsComplete3) {
                                    r19 = i8;
                                } else {
                                    r19 = i8;
                                }
                                if (zIsComplete3) {
                                    if (zIsComplete4) {
                                        if (this._response.getStatus() == 101) {
                                            connection3 = connection2;
                                        }
                                        reset();
                                        if (!this._generator.isPersistent()) {
                                            LOG.warn("Safety net oshut!!!  IF YOU SEE THIS, PLEASE RAISE BUGZILLA", new Object[i8]);
                                            this._endp.shutdownOutput();
                                        }
                                        r18 = 1;
                                    } else {
                                        this._readInterested = i8;
                                        LOG.debug("Disabled read interest while writing response {}", this._endp);
                                    }
                                }
                                if (r19 == 0) {
                                    LOG.debug("suspended {}", this);
                                    r18 = i8;
                                }
                                r0 = r18;
                            } catch (Throwable th) {
                                th = th;
                                AbstractHttpConnection.setCurrentConnection(null);
                                if (this._request.getAsyncContinuation().isAsyncStarted()) {
                                    i2 = 1;
                                } else {
                                    this._parser.returnBuffers();
                                    this._generator.returnBuffers();
                                    i2 = 1;
                                    this._asyncEndp.setCheckForIdle(true);
                                }
                                if (i == 0) {
                                    int i9 = this._total_no_progress + i2;
                                    this._total_no_progress = i9;
                                    i3 = NO_PROGRESS_INFO;
                                    if (i3 > 0 && i9 % i3 == 0 && ((i5 = NO_PROGRESS_CLOSE) <= 0 || i9 < i5)) {
                                        LOG.info("EndPoint making no progress: " + this._total_no_progress + " " + this._endp + " " + this, new Object[0]);
                                    }
                                    i4 = NO_PROGRESS_CLOSE;
                                    if (i4 > 0 && this._total_no_progress == i4) {
                                        LOG.warn("Closing EndPoint making no progress: " + this._total_no_progress + " " + this._endp + " " + this, new Object[0]);
                                        endPoint = this._endp;
                                        if (endPoint instanceof SelectChannelEndPoint) {
                                            ((SelectChannelEndPoint) endPoint).getChannel().close();
                                        }
                                    }
                                } else {
                                    this._total_no_progress = 0;
                                }
                                throw th;
                            }
                            r17 = r16;
                            if (this._generator.isCommitted()) {
                                r17 = r16;
                                r17 = r16;
                                r17 = r16;
                                r17 = r16;
                                r17 = 1;
                            }
                            r17 = r16;
                            r17 = r16;
                            r17 = r16;
                            r17 = r16;
                            r17 = r16;
                            r17 = r16;
                            r17 = r16;
                            r17 = r16;
                            r17 = r16;
                            r17 = r16;
                            this._endp.flush();
                            r18 = r17;
                            if (this._asyncEndp.hasProgressed()) {
                                r18 = 1;
                            }
                            i |= r18 == true ? 1 : 0;
                        } catch (HttpException e) {
                            e = e;
                            Logger logger = LOG;
                            if (logger.isDebugEnabled()) {
                                logger.debug("uri=" + this._uri, new Object[i8]);
                                logger.debug("fields=" + this._requestFields, new Object[i8]);
                                logger.debug(e);
                            }
                            try {
                                this._generator.sendError(e.getStatus(), e.getReason(), null, true);
                                try {
                                    boolean zIsComplete5 = this._parser.isComplete();
                                    boolean zIsComplete6 = this._generator.isComplete();
                                    boolean z2 = zIsComplete5 && zIsComplete6;
                                    if (zIsComplete5) {
                                        if (zIsComplete6) {
                                            if (this._response.getStatus() == 101 && (connection = (Connection) this._request.getAttribute("org.eclipse.jetty.io.Connection")) != null) {
                                                connection3 = connection;
                                            }
                                            reset();
                                            if (!this._generator.isPersistent() && !this._endp.isOutputShutdown()) {
                                                logger.warn("Safety net oshut!!!  IF YOU SEE THIS, PLEASE RAISE BUGZILLA", new Object[0]);
                                                this._endp.shutdownOutput();
                                            }
                                        } else {
                                            this._readInterested = false;
                                            logger.debug("Disabled read interest while writing response {}", this._endp);
                                        }
                                    }
                                    if (z2 || !this._request.getAsyncContinuation().isAsyncStarted()) {
                                        r0 = 1;
                                    } else {
                                        logger.debug("suspended {}", this);
                                        r0 = 0;
                                    }
                                    i = 1;
                                } catch (Throwable th2) {
                                    th = th2;
                                    i = 1;
                                    AbstractHttpConnection.setCurrentConnection(null);
                                    if (this._request.getAsyncContinuation().isAsyncStarted()) {
                                        this._parser.returnBuffers();
                                        this._generator.returnBuffers();
                                        i2 = 1;
                                        this._asyncEndp.setCheckForIdle(true);
                                    } else {
                                        i2 = 1;
                                    }
                                    if (i == 0) {
                                        int i10 = this._total_no_progress + i2;
                                        this._total_no_progress = i10;
                                        i3 = NO_PROGRESS_INFO;
                                        if (i3 > 0) {
                                            LOG.info("EndPoint making no progress: " + this._total_no_progress + " " + this._endp + " " + this, new Object[0]);
                                        }
                                        i4 = NO_PROGRESS_CLOSE;
                                        if (i4 > 0) {
                                            LOG.warn("Closing EndPoint making no progress: " + this._total_no_progress + " " + this._endp + " " + this, new Object[0]);
                                            endPoint = this._endp;
                                            if (endPoint instanceof SelectChannelEndPoint) {
                                                ((SelectChannelEndPoint) endPoint).getChannel().close();
                                            }
                                        }
                                    } else {
                                        this._total_no_progress = 0;
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                r15 = 1;
                                i |= r15;
                                zIsComplete = this._parser.isComplete();
                                zIsComplete2 = this._generator.isComplete();
                                if (zIsComplete) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                if (zIsComplete) {
                                    if (zIsComplete2) {
                                        if (this._response.getStatus() == 101) {
                                        }
                                        reset();
                                        if (!this._generator.isPersistent()) {
                                            LOG.warn("Safety net oshut!!!  IF YOU SEE THIS, PLEASE RAISE BUGZILLA", new Object[0]);
                                            this._endp.shutdownOutput();
                                        }
                                    } else {
                                        this._readInterested = false;
                                        LOG.debug("Disabled read interest while writing response {}", this._endp);
                                    }
                                }
                                if (!z) {
                                    LOG.debug("suspended {}", this);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        r15 = r16;
                        i |= r15;
                        zIsComplete = this._parser.isComplete();
                        zIsComplete2 = this._generator.isComplete();
                        if (zIsComplete || !zIsComplete2) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (zIsComplete) {
                            if (zIsComplete2) {
                                if (this._response.getStatus() == 101) {
                                }
                                reset();
                                if (!this._generator.isPersistent() && !this._endp.isOutputShutdown()) {
                                    LOG.warn("Safety net oshut!!!  IF YOU SEE THIS, PLEASE RAISE BUGZILLA", new Object[0]);
                                    this._endp.shutdownOutput();
                                }
                            } else {
                                this._readInterested = false;
                                LOG.debug("Disabled read interest while writing response {}", this._endp);
                            }
                        }
                        if (!z && this._request.getAsyncContinuation().isAsyncStarted()) {
                            LOG.debug("suspended {}", this);
                        }
                        throw th;
                    }
                    r16 = i8;
                } catch (HttpException e2) {
                    e = e2;
                } catch (Throwable th5) {
                    th = th5;
                    r15 = i8;
                }
                i8 = 0;
                r1 = r0;
            }
            AbstractHttpConnection.setCurrentConnection(null);
            if (this._request.getAsyncContinuation().isAsyncStarted()) {
                i6 = 1;
            } else {
                this._parser.returnBuffers();
                this._generator.returnBuffers();
                i6 = 1;
                this._asyncEndp.setCheckForIdle(true);
            }
            if (i != 0) {
                this._total_no_progress = 0;
            } else {
                int i11 = this._total_no_progress + i6;
                this._total_no_progress = i11;
                int i12 = NO_PROGRESS_INFO;
                if (i12 > 0 && i11 % i12 == 0 && ((i7 = NO_PROGRESS_CLOSE) <= 0 || i11 < i7)) {
                    LOG.info("EndPoint making no progress: " + this._total_no_progress + " " + this._endp + " " + this, new Object[0]);
                }
                int i13 = NO_PROGRESS_CLOSE;
                if (i13 > 0 && this._total_no_progress == i13) {
                    LOG.warn("Closing EndPoint making no progress: " + this._total_no_progress + " " + this._endp + " " + this, new Object[0]);
                    EndPoint endPoint2 = this._endp;
                    if (endPoint2 instanceof SelectChannelEndPoint) {
                        ((SelectChannelEndPoint) endPoint2).getChannel().close();
                    }
                }
            }
            return connection3;
        } catch (Throwable th6) {
            th = th6;
            i = 0;
        }
    }

    @Override // org.eclipse.jetty.server.AbstractHttpConnection, org.eclipse.jetty.p004io.Connection
    public boolean isSuspended() {
        return !this._readInterested || super.isSuspended();
    }

    @Override // org.eclipse.jetty.p004io.nio.AsyncConnection
    public void onInputShutdown() throws IOException {
        if (this._generator.isIdle() && !this._request.getAsyncContinuation().isSuspended()) {
            this._endp.close();
        }
        if (this._parser.isIdle()) {
            this._parser.setPersistent(false);
        }
    }

    @Override // org.eclipse.jetty.server.AbstractHttpConnection
    public void reset() {
        this._readInterested = true;
        LOG.debug("Enabled read interest {}", this._endp);
        super.reset();
    }
}
