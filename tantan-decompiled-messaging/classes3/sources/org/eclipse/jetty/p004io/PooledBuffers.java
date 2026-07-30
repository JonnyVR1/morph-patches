package org.eclipse.jetty.p004io;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class PooledBuffers extends AbstractBuffers {
    private final Queue<Buffer> _buffers;
    private final Queue<Buffer> _headers;
    private final int _maxSize;
    private final boolean _otherBuffers;
    private final boolean _otherHeaders;
    private final Queue<Buffer> _others;
    private final AtomicInteger _size;

    public PooledBuffers(Buffers.Type type, int i, Buffers.Type type2, int i2, Buffers.Type type3, int i3) {
        super(type, i, type2, i2, type3);
        this._size = new AtomicInteger();
        this._headers = new ConcurrentLinkedQueue();
        this._buffers = new ConcurrentLinkedQueue();
        this._others = new ConcurrentLinkedQueue();
        this._otherHeaders = type == type3;
        this._otherBuffers = type2 == type3;
        this._maxSize = i3;
    }

    @Override // org.eclipse.jetty.p004io.Buffers
    public Buffer getBuffer(int i) {
        if (this._otherHeaders && i == getHeaderSize()) {
            return getHeader();
        }
        if (this._otherBuffers && i == getBufferSize()) {
            return getBuffer();
        }
        Buffer bufferPoll = this._others.poll();
        while (bufferPoll != null && bufferPoll.capacity() != i) {
            this._size.decrementAndGet();
            bufferPoll = this._others.poll();
        }
        if (bufferPoll == null) {
            return newBuffer(i);
        }
        this._size.decrementAndGet();
        return bufferPoll;
    }

    @Override // org.eclipse.jetty.p004io.Buffers
    public Buffer getHeader() {
        Buffer bufferPoll = this._headers.poll();
        if (bufferPoll == null) {
            return newHeader();
        }
        this._size.decrementAndGet();
        return bufferPoll;
    }

    @Override // org.eclipse.jetty.p004io.Buffers
    public void returnBuffer(Buffer buffer) {
        buffer.clear();
        if (buffer.isVolatile() || buffer.isImmutable()) {
            return;
        }
        if (this._size.incrementAndGet() > this._maxSize) {
            this._size.decrementAndGet();
            return;
        }
        if (isHeader(buffer)) {
            this._headers.add(buffer);
        } else if (isBuffer(buffer)) {
            this._buffers.add(buffer);
        } else {
            this._others.add(buffer);
        }
    }

    @Override // org.eclipse.jetty.p004io.AbstractBuffers
    public String toString() {
        return String.format("%s [%d/%d@%d,%d/%d@%d,%d/%d@-]", getClass().getSimpleName(), Integer.valueOf(this._headers.size()), Integer.valueOf(this._maxSize), Integer.valueOf(this._headerSize), Integer.valueOf(this._buffers.size()), Integer.valueOf(this._maxSize), Integer.valueOf(this._bufferSize), Integer.valueOf(this._others.size()), Integer.valueOf(this._maxSize));
    }

    @Override // org.eclipse.jetty.p004io.Buffers
    public Buffer getBuffer() {
        Buffer bufferPoll = this._buffers.poll();
        if (bufferPoll == null) {
            return newBuffer();
        }
        this._size.decrementAndGet();
        return bufferPoll;
    }
}
