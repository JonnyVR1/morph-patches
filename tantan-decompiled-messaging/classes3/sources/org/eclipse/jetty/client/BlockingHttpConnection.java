package org.eclipse.jetty.client;

import java.io.IOException;
import org.eclipse.jetty.p004io.Buffer;
import org.eclipse.jetty.p004io.Buffers;
import org.eclipse.jetty.p004io.EndPoint;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class BlockingHttpConnection extends AbstractHttpConnection {
    private static final Logger LOG = Log.getLogger((Class<?>) BlockingHttpConnection.class);
    private boolean _requestComplete;
    private Buffer _requestContentChunk;

    public BlockingHttpConnection(Buffers buffers, Buffers buffers2, EndPoint endPoint) {
        super(buffers, buffers2, endPoint);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0268 */
    @Override // org.eclipse.jetty.client.AbstractHttpConnection, org.eclipse.jetty.p004io.Connection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.eclipse.jetty.p004io.Connection handle() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.client.BlockingHttpConnection.handle():org.eclipse.jetty.io.Connection");
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
