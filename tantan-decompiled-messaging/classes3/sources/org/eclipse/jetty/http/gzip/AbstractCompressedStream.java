package org.eclipse.jetty.http.gzip;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.zip.DeflaterOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import l.ohg0;
import l.qkq0;
import l.rhg0;
import l.zje0;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.util.ByteArrayOutputStream2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class AbstractCompressedStream extends zje0 {
    protected ByteArrayOutputStream2 _bOut;
    protected int _bufferSize;
    protected boolean _closed;
    protected DeflaterOutputStream _compressedOutputStream;
    protected long _contentLength;
    protected boolean _doNotCompress;
    private final String _encoding;
    protected int _minCompressSize;
    protected OutputStream _out;
    protected HttpServletRequest _request;
    protected HttpServletResponse _response;

    public AbstractCompressedStream(String str, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, long j, int i, int i2) throws IOException {
        this._encoding = str;
        this._request = httpServletRequest;
        this._response = httpServletResponse;
        this._contentLength = j;
        this._bufferSize = i;
        this._minCompressSize = i2;
        if (i2 == 0) {
            doCompress();
        }
    }

    private void checkOut(int i) throws IOException {
        if (this._closed) {
            rhg0.a("CLOSED");
            return;
        }
        if (this._out != null) {
            if (this._bOut != null) {
                if (!this._response.isCommitted()) {
                    long j = this._contentLength;
                    if (j < 0 || j >= this._minCompressSize) {
                        if (i >= this._bOut.getBuf().length - this._bOut.getCount()) {
                            doCompress();
                            return;
                        }
                        return;
                    }
                }
                doNotCompress();
                return;
            }
            return;
        }
        if (!this._response.isCommitted()) {
            long j2 = this._contentLength;
            if (j2 < 0 || j2 >= this._minCompressSize) {
                if (i > this._minCompressSize) {
                    doCompress();
                    return;
                }
                ByteArrayOutputStream2 byteArrayOutputStream2 = new ByteArrayOutputStream2(this._bufferSize);
                this._bOut = byteArrayOutputStream2;
                this._out = byteArrayOutputStream2;
                return;
            }
        }
        doNotCompress();
    }

    public void close() throws IOException {
        if (this._closed) {
            return;
        }
        if (this._request.getAttribute("javax.servlet.include.request_uri") != null) {
            flush();
            return;
        }
        ByteArrayOutputStream2 byteArrayOutputStream2 = this._bOut;
        if (byteArrayOutputStream2 != null) {
            if (this._contentLength < 0) {
                this._contentLength = byteArrayOutputStream2.getCount();
            }
            if (this._contentLength < this._minCompressSize) {
                doNotCompress();
            } else {
                doCompress();
            }
        } else if (this._out == null) {
            doNotCompress();
        }
        DeflaterOutputStream deflaterOutputStream = this._compressedOutputStream;
        if (deflaterOutputStream != null) {
            deflaterOutputStream.close();
        } else {
            this._out.close();
        }
        this._closed = true;
    }

    public abstract DeflaterOutputStream createStream() throws IOException;

    public void doCompress() throws IOException {
        if (this._compressedOutputStream == null) {
            if (this._response.isCommitted()) {
                ohg0.a();
                return;
            }
            setHeader(HttpHeaders.CONTENT_ENCODING, this._encoding);
            if (!this._response.containsHeader(HttpHeaders.CONTENT_ENCODING)) {
                doNotCompress();
                return;
            }
            DeflaterOutputStream deflaterOutputStreamCreateStream = createStream();
            this._compressedOutputStream = deflaterOutputStreamCreateStream;
            this._out = deflaterOutputStreamCreateStream;
            ByteArrayOutputStream2 byteArrayOutputStream2 = this._bOut;
            if (byteArrayOutputStream2 != null) {
                deflaterOutputStreamCreateStream.write(byteArrayOutputStream2.getBuf(), 0, this._bOut.getCount());
                this._bOut = null;
            }
        }
    }

    public void doNotCompress() throws IOException {
        if (this._compressedOutputStream != null) {
            qkq0.a("Compressed output stream is already assigned.");
            return;
        }
        if (this._out == null || this._bOut != null) {
            this._doNotCompress = true;
            this._out = this._response.getOutputStream();
            setContentLength(this._contentLength);
            ByteArrayOutputStream2 byteArrayOutputStream2 = this._bOut;
            if (byteArrayOutputStream2 != null) {
                this._out.write(byteArrayOutputStream2.getBuf(), 0, this._bOut.getCount());
            }
            this._bOut = null;
        }
    }

    public void finish() throws IOException {
        if (this._closed) {
            return;
        }
        if (this._out == null || this._bOut != null) {
            long j = this._contentLength;
            if (j <= 0 || j >= this._minCompressSize) {
                doCompress();
            } else {
                doNotCompress();
            }
        }
        DeflaterOutputStream deflaterOutputStream = this._compressedOutputStream;
        if (deflaterOutputStream == null || this._closed) {
            return;
        }
        this._closed = true;
        deflaterOutputStream.close();
    }

    public void flush() throws IOException {
        if (this._out == null || this._bOut != null) {
            long j = this._contentLength;
            if (j <= 0 || j >= this._minCompressSize) {
                doCompress();
            } else {
                doNotCompress();
            }
        }
        this._out.flush();
    }

    public OutputStream getOutputStream() {
        return this._out;
    }

    public boolean isClosed() {
        return this._closed;
    }

    public PrintWriter newWriter(OutputStream outputStream, String str) throws UnsupportedEncodingException {
        return str == null ? new PrintWriter(outputStream) : new PrintWriter(new OutputStreamWriter(outputStream, str));
    }

    public void resetBuffer() {
        if (this._response.isCommitted()) {
            qkq0.a("Committed");
            return;
        }
        this._closed = false;
        this._out = null;
        this._bOut = null;
        if (this._compressedOutputStream != null) {
            this._response.setHeader(HttpHeaders.CONTENT_ENCODING, (String) null);
        }
        this._compressedOutputStream = null;
        this._doNotCompress = false;
    }

    public void setContentLength(long j) {
        this._contentLength = j;
        if (!this._doNotCompress || j < 0) {
            return;
        }
        HttpServletResponse httpServletResponse = this._response;
        if (j < 2147483647L) {
            httpServletResponse.setContentLength((int) j);
        } else {
            httpServletResponse.setHeader(HttpHeaders.CONTENT_LENGTH, Long.toString(j));
        }
    }

    public void setHeader(String str, String str2) {
        this._response.setHeader(str, str2);
    }

    public void write(int i) throws IOException {
        checkOut(1);
        this._out.write(i);
    }

    public void write(byte[] bArr) throws IOException {
        checkOut(bArr.length);
        this._out.write(bArr);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        checkOut(i2);
        this._out.write(bArr, i, i2);
    }
}
