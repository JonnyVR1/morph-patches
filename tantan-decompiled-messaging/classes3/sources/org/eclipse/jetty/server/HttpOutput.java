package org.eclipse.jetty.server;

import java.io.IOException;
import java.io.Writer;
import l.rhg0;
import l.zje0;
import org.eclipse.jetty.http.AbstractGenerator;
import org.eclipse.jetty.p004io.Buffer;
import org.eclipse.jetty.p004io.ByteArrayBuffer;
import org.eclipse.jetty.p004io.EofException;
import org.eclipse.jetty.util.ByteArrayOutputStream2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
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
            rhg0.a("Closed");
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
                rhg0.a("Closed");
                return;
            }
        } while (this._generator.isOpen());
        throw new EofException();
    }

    public void close() throws IOException {
        this._closed = true;
    }

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

    public void print(String str) throws IOException {
        write(str.getBytes());
    }

    public void reopen() {
        this._closed = false;
    }

    public void write(byte[] bArr) throws IOException {
        write(new ByteArrayBuffer(bArr));
    }

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

    public void write(byte[] bArr, int i, int i2) throws IOException {
        write(new ByteArrayBuffer(bArr, i, i2));
    }
}
