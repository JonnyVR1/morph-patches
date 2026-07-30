package org.eclipse.jetty.server.nio;

import org.eclipse.jetty.http.HttpBuffersImpl;
import org.eclipse.jetty.p004io.Buffers;
import org.eclipse.jetty.server.AbstractConnector;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class AbstractNIOConnector extends AbstractConnector implements NIOConnector {
    public AbstractNIOConnector() {
        HttpBuffersImpl httpBuffersImpl = this._buffers;
        Buffers.Type type = Buffers.Type.DIRECT;
        httpBuffersImpl.setRequestBufferType(type);
        HttpBuffersImpl httpBuffersImpl2 = this._buffers;
        Buffers.Type type2 = Buffers.Type.INDIRECT;
        httpBuffersImpl2.setRequestHeaderType(type2);
        this._buffers.setResponseBufferType(type);
        this._buffers.setResponseHeaderType(type2);
    }

    @Override // org.eclipse.jetty.server.nio.NIOConnector
    public boolean getUseDirectBuffers() {
        return getRequestBufferType() == Buffers.Type.DIRECT;
    }

    public void setUseDirectBuffers(boolean z) {
        this._buffers.setRequestBufferType(z ? Buffers.Type.DIRECT : Buffers.Type.INDIRECT);
        this._buffers.setResponseBufferType(z ? Buffers.Type.DIRECT : Buffers.Type.INDIRECT);
    }
}
