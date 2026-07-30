package org.eclipse.jetty.p123io.nio;

import java.nio.ByteBuffer;
import org.eclipse.jetty.p123io.ByteArrayBuffer;
import p149l.x9g0;

/* JADX INFO: loaded from: classes3.dex */
public class IndirectNIOBuffer extends ByteArrayBuffer implements NIOBuffer {
    protected final ByteBuffer _buf;

    public IndirectNIOBuffer(ByteBuffer byteBuffer, boolean z) {
        super(byteBuffer.array(), 0, 0, z ? 0 : 2, false);
        if (byteBuffer.isDirect()) {
            x9g0.m207497a();
            throw null;
        }
        this._buf = byteBuffer;
        this._get = byteBuffer.position();
        this._put = byteBuffer.limit();
        byteBuffer.position(0);
        byteBuffer.limit(byteBuffer.capacity());
    }

    @Override // org.eclipse.jetty.p123io.nio.NIOBuffer
    public ByteBuffer getByteBuffer() {
        return this._buf;
    }

    @Override // org.eclipse.jetty.p123io.nio.NIOBuffer
    public boolean isDirect() {
        return false;
    }

    public IndirectNIOBuffer(int i) {
        super(i, 2, false);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(this._bytes);
        this._buf = byteBufferWrap;
        byteBufferWrap.position(0);
        byteBufferWrap.limit(byteBufferWrap.capacity());
    }
}
