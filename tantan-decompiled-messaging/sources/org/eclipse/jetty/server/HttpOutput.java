package org.eclipse.jetty.server;

import java.io.IOException;
import java.io.Writer;
import org.eclipse.jetty.http.AbstractGenerator;
import org.eclipse.jetty.p123io.Buffer;
import org.eclipse.jetty.p123io.ByteArrayBuffer;
import org.eclipse.jetty.p123io.EofException;
import org.eclipse.jetty.util.ByteArrayOutputStream2;
import p149l.rhg0;
import p149l.zje0;

/* JADX INFO: loaded from: classes3.dex */
public class HttpOutput extends zje0 {
    ByteArrayOutputStream2 _bytes;
    String _characterEncoding;
    char[] _chars;
    private boolean _closed;
    protected final AbstractHttpConnection _connection;
    Writer _converter;
    protected final AbstractGenerator _generator;
    private ByteArrayBuffer _onebyte;

    public HttpOutput(AbstractHttpConnection abstractHttpConnection) {
        this._connection = abstractHttpConnection;
        this._generator = (AbstractGenerator) abstractHttpConnection.getGenerator();
    }

    private void write(Buffer buffer) throws IOException {
        if (this._closed) {
            rhg0.m179353a("Closed");
            return;
        }
        if (!this._generator.isOpen()) {
            throw new EofException();
        }
        do {
            boolean zIsBufferFull = this._generator.isBufferFull();
            AbstractGenerator abstractGenerator = this._generator;
            if (!zIsBufferFull) {
                abstractGenerator.addContent(buffer, false);
                if (this._generator.isAllContentWritten()) {
                    flush();
                    close();
                } else if (this._generator.isBufferFull()) {
                    this._connection.commitResponse(false);
                }
                while (buffer.length() > 0 && this._generator.isOpen()) {
                    this._generator.blockForOutput(getMaxIdleTime());
                }
                return;
            }
            abstractGenerator.blockForOutput(getMaxIdleTime());
            if (this._closed) {
                rhg0.m179353a("Closed");
                return;
            }
        } while (this._generator.isOpen());
        throw new EofException();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this._closed = true;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this._generator.flush(getMaxIdleTime());
    }

    public int getMaxIdleTime() {
        return this._connection.getMaxIdleTime();
    }

    public boolean isClosed() {
        return this._closed;
    }

    public boolean isWritten() {
        return this._generator.getContentWritten() > 0;
    }

    @Override // p149l.zje0
    public void print(String str) throws IOException {
        write(str.getBytes());
    }

    public void reopen() {
        this._closed = false;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(new ByteArrayBuffer(bArr));
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        ByteArrayBuffer byteArrayBuffer = this._onebyte;
        if (byteArrayBuffer == null) {
            this._onebyte = new ByteArrayBuffer(1);
        } else {
            byteArrayBuffer.clear();
        }
        this._onebyte.put((byte) i);
        write(this._onebyte);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        write(new ByteArrayBuffer(bArr, i, i2));
    }
}
