package org.eclipse.jetty.p004io;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ThreadLocalBuffers extends AbstractBuffers {
    private final ThreadLocal<ThreadBuffers> _buffers;

    public static class ThreadBuffers {
        Buffer _buffer;
        Buffer _header;
        Buffer _other;
    }

    public ThreadLocalBuffers(Buffers.Type type, int i, Buffers.Type type2, int i2, Buffers.Type type3) {
        super(type, i, type2, i2, type3);
        this._buffers = new ThreadLocal<ThreadBuffers>() { // from class: org.eclipse.jetty.io.ThreadLocalBuffers.1
            @Override // java.lang.ThreadLocal
            public ThreadBuffers initialValue() {
                return new ThreadBuffers();
            }
        };
    }

    @Override // org.eclipse.jetty.p004io.Buffers
    public Buffer getBuffer() {
        ThreadBuffers threadBuffers = this._buffers.get();
        Buffer buffer = threadBuffers._buffer;
        if (buffer != null) {
            threadBuffers._buffer = null;
            return buffer;
        }
        Buffer buffer2 = threadBuffers._other;
        if (buffer2 == null || !isBuffer(buffer2)) {
            return newBuffer();
        }
        Buffer buffer3 = threadBuffers._other;
        threadBuffers._other = null;
        return buffer3;
    }

    @Override // org.eclipse.jetty.p004io.Buffers
    public Buffer getHeader() {
        ThreadBuffers threadBuffers = this._buffers.get();
        Buffer buffer = threadBuffers._header;
        if (buffer != null) {
            threadBuffers._header = null;
            return buffer;
        }
        Buffer buffer2 = threadBuffers._other;
        if (buffer2 == null || !isHeader(buffer2)) {
            return newHeader();
        }
        Buffer buffer3 = threadBuffers._other;
        threadBuffers._other = null;
        return buffer3;
    }

    @Override // org.eclipse.jetty.p004io.Buffers
    public void returnBuffer(Buffer buffer) {
        buffer.clear();
        if (buffer.isVolatile() || buffer.isImmutable()) {
            return;
        }
        ThreadBuffers threadBuffers = this._buffers.get();
        if (threadBuffers._header == null && isHeader(buffer)) {
            threadBuffers._header = buffer;
        } else if (threadBuffers._buffer == null && isBuffer(buffer)) {
            threadBuffers._buffer = buffer;
        } else {
            threadBuffers._other = buffer;
        }
    }

    @Override // org.eclipse.jetty.p004io.AbstractBuffers
    public String toString() {
        return "{{" + getHeaderSize() + "," + getBufferSize() + "}}";
    }

    @Override // org.eclipse.jetty.p004io.Buffers
    public Buffer getBuffer(int i) {
        ThreadBuffers threadBuffers = this._buffers.get();
        Buffer buffer = threadBuffers._other;
        if (buffer != null && buffer.capacity() == i) {
            Buffer buffer2 = threadBuffers._other;
            threadBuffers._other = null;
            return buffer2;
        }
        return newBuffer(i);
    }
}
