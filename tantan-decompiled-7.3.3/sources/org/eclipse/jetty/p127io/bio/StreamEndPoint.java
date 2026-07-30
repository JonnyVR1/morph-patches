package org.eclipse.jetty.p127io.bio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import org.eclipse.jetty.p127io.Buffer;
import org.eclipse.jetty.p127io.EndPoint;
import p153l.zpg0;

/* JADX INFO: loaded from: classes2.dex */
public class StreamEndPoint implements EndPoint {
    InputStream _in;
    boolean _ishut;
    int _maxIdleTime;
    boolean _oshut;
    OutputStream _out;

    public StreamEndPoint(InputStream inputStream, OutputStream outputStream) {
        this._in = inputStream;
        this._out = outputStream;
    }

    @Override // org.eclipse.jetty.p127io.EndPoint
    public boolean blockReadable(long j) throws IOException {
        return true;
    }

    @Override // org.eclipse.jetty.p127io.EndPoint
    public boolean blockWritable(long j) throws IOException {
        return true;
    }

    @Override // org.eclipse.jetty.p127io.EndPoint
    public void close() throws IOException {
        InputStream inputStream = this._in;
        if (inputStream != null) {
            inputStream.close();
        }
        this._in = null;
        OutputStream outputStream = this._out;
        if (outputStream != null) {
            outputStream.close();
        }
        this._out = null;
    }

    @Override // org.eclipse.jetty.p127io.EndPoint
    public int fill(Buffer buffer) throws IOException {
        if (this._ishut) {
            return -1;
        }
        if (this._in == null) {
            return 0;
        }
        int iSpace = buffer.space();
        if (iSpace <= 0) {
            if (buffer.hasContent()) {
                return 0;
            }
            zpg0.m220844a("FULL");
            return 0;
        }
        try {
            int from = buffer.readFrom(this._in, iSpace);
            if (from < 0) {
                shutdownInput();
            }
            return from;
        } catch (SocketTimeoutException unused) {
            idleExpired();
            return -1;
        }
    }

    @Override // org.eclipse.jetty.p127io.EndPoint
    public int flush(Buffer buffer, Buffer buffer2, Buffer buffer3) throws IOException {
        int iFlush;
        int length;
        int length2;
        if (buffer == null || (length2 = buffer.length()) <= 0) {
            iFlush = 0;
        } else {
            iFlush = flush(buffer);
            if (iFlush < length2) {
                return iFlush;
            }
        }
        if (buffer2 != null && (length = buffer2.length()) > 0) {
            int iFlush2 = flush(buffer2);
            if (iFlush2 < 0) {
                return iFlush > 0 ? iFlush : iFlush2;
            }
            iFlush += iFlush2;
            if (iFlush2 < length) {
                return iFlush;
            }
        }
        if (buffer3 == null || buffer3.length() <= 0) {
            return iFlush;
        }
        int iFlush3 = flush(buffer3);
        if (iFlush3 < 0) {
            return iFlush > 0 ? iFlush : iFlush3;
        }
        return iFlush + iFlush3;
    }

    public InputStream getInputStream() {
        return this._in;
    }

    @Override // org.eclipse.jetty.p127io.EndPoint
    public String getLocalAddr() {
        return null;
    }

    @Override // org.eclipse.jetty.p127io.EndPoint
    public String getLocalHost() {
        return null;
    }

    @Override // org.eclipse.jetty.p127io.EndPoint
    public int getLocalPort() {
        return 0;
    }

    @Override // org.eclipse.jetty.p127io.EndPoint
    public int getMaxIdleTime() {
        return this._maxIdleTime;
    }

    public OutputStream getOutputStream() {
        return this._out;
    }

    @Override // org.eclipse.jetty.p127io.EndPoint
    public String getRemoteAddr() {
        return null;
    }

    @Override // org.eclipse.jetty.p127io.EndPoint
    public String getRemoteHost() {
        return null;
    }

    @Override // org.eclipse.jetty.p127io.EndPoint
    public int getRemotePort() {
        return 0;
    }

    @Override // org.eclipse.jetty.p127io.EndPoint
    public Object getTransport() {
        return null;
    }

    public void idleExpired() throws IOException {
        InputStream inputStream = this._in;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // org.eclipse.jetty.p127io.EndPoint
    public boolean isBlocking() {
        return true;
    }

    public final boolean isClosed() {
        return !isOpen();
    }

    @Override // org.eclipse.jetty.p127io.EndPoint
    public boolean isInputShutdown() {
        return this._ishut;
    }

    @Override // org.eclipse.jetty.p127io.EndPoint
    public boolean isOpen() {
        return this._in != null;
    }

    @Override // org.eclipse.jetty.p127io.EndPoint
    public boolean isOutputShutdown() {
        return this._oshut;
    }

    public void setInputStream(InputStream inputStream) {
        this._in = inputStream;
    }

    @Override // org.eclipse.jetty.p127io.EndPoint
    public void setMaxIdleTime(int i) throws IOException {
        this._maxIdleTime = i;
    }

    public void setOutputStream(OutputStream outputStream) {
        this._out = outputStream;
    }

    @Override // org.eclipse.jetty.p127io.EndPoint
    public void shutdownInput() throws IOException {
        InputStream inputStream;
        this._ishut = true;
        if (!this._oshut || (inputStream = this._in) == null) {
            return;
        }
        inputStream.close();
    }

    @Override // org.eclipse.jetty.p127io.EndPoint
    public void shutdownOutput() throws IOException {
        OutputStream outputStream;
        this._oshut = true;
        if (!this._ishut || (outputStream = this._out) == null) {
            return;
        }
        outputStream.close();
    }

    @Override // org.eclipse.jetty.p127io.EndPoint
    public int flush(Buffer buffer) throws IOException {
        if (this._oshut) {
            return -1;
        }
        if (this._out == null) {
            return 0;
        }
        int length = buffer.length();
        if (length > 0) {
            buffer.writeTo(this._out);
        }
        if (!buffer.isImmutable()) {
            buffer.clear();
        }
        return length;
    }

    @Override // org.eclipse.jetty.p127io.EndPoint
    public void flush() throws IOException {
        OutputStream outputStream = this._out;
        if (outputStream != null) {
            outputStream.flush();
        }
    }
}
