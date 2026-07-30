package org.eclipse.jetty.server;

import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.eclipse.jetty.p004io.ByteArrayBuffer;
import org.eclipse.jetty.p004io.ByteArrayEndPoint;
import org.eclipse.jetty.p004io.Connection;
import org.eclipse.jetty.util.StringUtil;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class LocalConnector extends AbstractConnector {
    private static final Logger LOG = Log.getLogger((Class<?>) LocalConnector.class);
    private final BlockingQueue<Request> _requests = new LinkedBlockingQueue();

    public class Request implements Runnable {
        private final boolean _keepOpen;
        private final CountDownLatch _latch;
        private final ByteArrayBuffer _requestsBuffer;
        private volatile ByteArrayBuffer _responsesBuffer;

        private Request(ByteArrayBuffer byteArrayBuffer, boolean z, CountDownLatch countDownLatch) {
            this._requestsBuffer = byteArrayBuffer;
            this._keepOpen = z;
            this._latch = countDownLatch;
        }

        public ByteArrayBuffer getResponsesBuffer() {
            return this._responsesBuffer;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ByteArrayEndPoint byteArrayEndPoint = new ByteArrayEndPoint(this._requestsBuffer.asArray(), 1024) { // from class: org.eclipse.jetty.server.LocalConnector.Request.1
                    @Override // org.eclipse.jetty.p004io.ByteArrayEndPoint, org.eclipse.jetty.p004io.ConnectedEndPoint
                    public void setConnection(Connection connection) {
                        if (getConnection() != null && connection != getConnection()) {
                            LocalConnector.this.connectionUpgraded(getConnection(), connection);
                        }
                        super.setConnection(connection);
                    }
                };
                byteArrayEndPoint.setGrowOutput(true);
                LocalConnector localConnector = LocalConnector.this;
                BlockingHttpConnection blockingHttpConnection = new BlockingHttpConnection(localConnector, byteArrayEndPoint, localConnector.getServer());
                byteArrayEndPoint.setConnection(blockingHttpConnection);
                LocalConnector.this.connectionOpened(blockingHttpConnection);
                boolean z = this._keepOpen;
                while (byteArrayEndPoint.getIn().length() > 0 && byteArrayEndPoint.isOpen()) {
                    try {
                        try {
                            try {
                                while (true) {
                                    Connection connection = byteArrayEndPoint.getConnection();
                                    Connection connectionHandle = connection.handle();
                                    if (connectionHandle != connection) {
                                        byteArrayEndPoint.setConnection(connectionHandle);
                                    }
                                }
                            } catch (IOException e) {
                                LocalConnector.LOG.debug(e);
                                LocalConnector.this.connectionClosed(blockingHttpConnection);
                            }
                        } catch (Throwable th) {
                            if (!z) {
                                LocalConnector.this.connectionClosed(blockingHttpConnection);
                            }
                            this._responsesBuffer = byteArrayEndPoint.getOut();
                            throw th;
                        }
                    } catch (Exception e2) {
                        LocalConnector.LOG.warn(e2);
                        LocalConnector.this.connectionClosed(blockingHttpConnection);
                    }
                }
                if (!z) {
                    LocalConnector.this.connectionClosed(blockingHttpConnection);
                }
                this._responsesBuffer = byteArrayEndPoint.getOut();
                CountDownLatch countDownLatch = this._latch;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
            } catch (Throwable th2) {
                CountDownLatch countDownLatch2 = this._latch;
                if (countDownLatch2 != null) {
                    countDownLatch2.countDown();
                }
                throw th2;
            }
        }
    }

    public LocalConnector() {
        setMaxIdleTime(30000);
    }

    @Override // org.eclipse.jetty.server.AbstractConnector
    public void accept(int i) throws InterruptedException, IOException {
        getThreadPool().dispatch(this._requests.take());
    }

    @Override // org.eclipse.jetty.server.Connector
    public void close() throws IOException {
    }

    public void executeRequest(String str) throws IOException {
        this._requests.add(new Request(new ByteArrayBuffer(str, StringUtil.__UTF8), true, null));
    }

    @Override // org.eclipse.jetty.server.Connector
    public Object getConnection() {
        return this;
    }

    @Override // org.eclipse.jetty.server.Connector
    public int getLocalPort() {
        return -1;
    }

    public ByteArrayBuffer getResponses(ByteArrayBuffer byteArrayBuffer, boolean z) throws Exception {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Request request = new Request(byteArrayBuffer, z, countDownLatch);
        this._requests.add(request);
        countDownLatch.await(getMaxIdleTime(), TimeUnit.MILLISECONDS);
        return request.getResponsesBuffer();
    }

    @Override // org.eclipse.jetty.server.Connector
    public void open() throws IOException {
    }

    public String getResponses(String str, boolean z) throws Exception {
        ByteArrayBuffer responses = getResponses(new ByteArrayBuffer(str, "ISO-8859-1"), z);
        if (responses == null) {
            return null;
        }
        return responses.toString("ISO-8859-1");
    }

    public String getResponses(String str) throws Exception {
        return getResponses(str, false);
    }
}
