package org.eclipse.jetty.http.gzip;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import l.phg0;
import l.qkl;
import l.qkq0;
import l.zje0;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.util.StringUtil;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class CompressedResponseWrapper extends qkl {
    public static final int DEFAULT_BUFFER_SIZE = 8192;
    public static final int DEFAULT_MIN_COMPRESS_SIZE = 256;
    private int _bufferSize;
    private AbstractCompressedStream _compressedStream;
    private long _contentLength;
    private Set<String> _mimeTypes;
    private int _minCompressSize;
    private boolean _noCompression;
    protected HttpServletRequest _request;
    private PrintWriter _writer;

    public CompressedResponseWrapper(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        super(httpServletResponse);
        this._bufferSize = 8192;
        this._minCompressSize = 256;
        this._contentLength = -1L;
        this._request = httpServletRequest;
    }

    public void addHeader(String str, String str2) {
        if ("content-length".equalsIgnoreCase(str)) {
            long j = Long.parseLong(str2);
            this._contentLength = j;
            AbstractCompressedStream abstractCompressedStream = this._compressedStream;
            if (abstractCompressedStream != null) {
                abstractCompressedStream.setContentLength(j);
                return;
            }
            return;
        }
        if ("content-type".equalsIgnoreCase(str)) {
            setContentType(str2);
            return;
        }
        if (!"content-encoding".equalsIgnoreCase(str)) {
            super.addHeader(str, str2);
            return;
        }
        super.addHeader(str, str2);
        if (isCommitted()) {
            return;
        }
        noCompression();
    }

    public void finish() throws IOException {
        if (this._writer != null && !this._compressedStream.isClosed()) {
            this._writer.flush();
        }
        AbstractCompressedStream abstractCompressedStream = this._compressedStream;
        if (abstractCompressedStream != null) {
            abstractCompressedStream.finish();
        }
    }

    public void flushBuffer() throws IOException {
        PrintWriter printWriter = this._writer;
        if (printWriter != null) {
            printWriter.flush();
        }
        AbstractCompressedStream abstractCompressedStream = this._compressedStream;
        if (abstractCompressedStream != null) {
            abstractCompressedStream.finish();
        } else {
            getResponse().flushBuffer();
        }
    }

    public zje0 getOutputStream() throws IOException {
        CompressedResponseWrapper compressedResponseWrapper;
        if (this._compressedStream != null) {
            compressedResponseWrapper = this;
            if (compressedResponseWrapper._writer != null) {
                qkq0.a("getWriter() called");
                return null;
            }
        } else {
            if (getResponse().isCommitted() || this._noCompression) {
                setContentLength(this._contentLength);
                return getResponse().getOutputStream();
            }
            compressedResponseWrapper = this;
            compressedResponseWrapper._compressedStream = compressedResponseWrapper.newCompressedStream(this._request, (HttpServletResponse) getResponse(), this._contentLength, this._bufferSize, this._minCompressSize);
        }
        return compressedResponseWrapper._compressedStream;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.io.OutputStream, org.eclipse.jetty.http.gzip.AbstractCompressedStream] */
    public PrintWriter getWriter() throws IOException {
        CompressedResponseWrapper compressedResponseWrapper;
        if (this._writer != null) {
            compressedResponseWrapper = this;
        } else {
            if (this._compressedStream != null) {
                qkq0.a("getOutputStream() called");
                return null;
            }
            if (getResponse().isCommitted() || this._noCompression) {
                setContentLength(this._contentLength);
                return getResponse().getWriter();
            }
            CompressedResponseWrapper compressedResponseWrapper2 = this;
            ?? NewCompressedStream = compressedResponseWrapper2.newCompressedStream(this._request, getResponse(), this._contentLength, this._bufferSize, this._minCompressSize);
            compressedResponseWrapper2._compressedStream = NewCompressedStream;
            compressedResponseWrapper2._writer = compressedResponseWrapper2.newWriter(NewCompressedStream, compressedResponseWrapper2.getCharacterEncoding());
            compressedResponseWrapper = compressedResponseWrapper2;
        }
        return compressedResponseWrapper._writer;
    }

    public abstract AbstractCompressedStream newCompressedStream(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, long j, int i, int i2) throws IOException;

    public PrintWriter newWriter(OutputStream outputStream, String str) throws UnsupportedEncodingException {
        return str == null ? new PrintWriter(outputStream) : new PrintWriter(new OutputStreamWriter(outputStream, str));
    }

    public void noCompression() {
        this._noCompression = true;
        AbstractCompressedStream abstractCompressedStream = this._compressedStream;
        if (abstractCompressedStream != null) {
            try {
                abstractCompressedStream.doNotCompress();
            } catch (IOException e) {
                phg0.a(e);
            }
        }
    }

    public void reset() {
        super/*l.hke0*/.reset();
        AbstractCompressedStream abstractCompressedStream = this._compressedStream;
        if (abstractCompressedStream != null) {
            abstractCompressedStream.resetBuffer();
        }
        this._writer = null;
        this._compressedStream = null;
        this._noCompression = false;
        this._contentLength = -1L;
    }

    public void resetBuffer() {
        super/*l.hke0*/.resetBuffer();
        AbstractCompressedStream abstractCompressedStream = this._compressedStream;
        if (abstractCompressedStream != null) {
            abstractCompressedStream.resetBuffer();
        }
        this._writer = null;
        this._compressedStream = null;
    }

    public void sendError(int i, String str) throws IOException {
        resetBuffer();
        super.sendError(i, str);
    }

    public void sendRedirect(String str) throws IOException {
        resetBuffer();
        super.sendRedirect(str);
    }

    public void setBufferSize(int i) {
        this._bufferSize = i;
    }

    public void setContentLength(long j) {
        this._contentLength = j;
        AbstractCompressedStream abstractCompressedStream = this._compressedStream;
        if (abstractCompressedStream != null) {
            abstractCompressedStream.setContentLength(j);
            return;
        }
        if (!this._noCompression || j < 0) {
            return;
        }
        HttpServletResponse response = getResponse();
        long j2 = this._contentLength;
        if (j2 < 2147483647L) {
            response.setContentLength((int) j2);
        } else {
            response.setHeader(HttpHeaders.CONTENT_LENGTH, Long.toString(j2));
        }
    }

    public void setContentType(String str) {
        int iIndexOf;
        super/*l.hke0*/.setContentType(str);
        if (str != null && (iIndexOf = str.indexOf(";")) > 0) {
            str = str.substring(0, iIndexOf);
        }
        AbstractCompressedStream abstractCompressedStream = this._compressedStream;
        if (abstractCompressedStream == null || abstractCompressedStream.getOutputStream() == null) {
            if (this._mimeTypes != null || str == null || !str.contains(HttpHeaderValues.GZIP)) {
                Set<String> set = this._mimeTypes;
                if (set == null) {
                    return;
                }
                if (str != null && set.contains(StringUtil.asciiToLowerCase(str))) {
                    return;
                }
            }
            noCompression();
        }
    }

    public void setHeader(String str, String str2) {
        if ("content-length".equalsIgnoreCase(str)) {
            setContentLength(Long.parseLong(str2));
            return;
        }
        if ("content-type".equalsIgnoreCase(str)) {
            setContentType(str2);
            return;
        }
        if (!"content-encoding".equalsIgnoreCase(str)) {
            super.setHeader(str, str2);
            return;
        }
        super.setHeader(str, str2);
        if (isCommitted()) {
            return;
        }
        noCompression();
    }

    public void setIntHeader(String str, int i) {
        if (!"content-length".equalsIgnoreCase(str)) {
            super.setIntHeader(str, i);
            return;
        }
        long j = i;
        this._contentLength = j;
        AbstractCompressedStream abstractCompressedStream = this._compressedStream;
        if (abstractCompressedStream != null) {
            abstractCompressedStream.setContentLength(j);
        }
    }

    public void setMimeTypes(Set<String> set) {
        this._mimeTypes = set;
    }

    public void setMinCompressSize(int i) {
        this._minCompressSize = i;
    }

    public void setStatus(int i, String str) {
        super.setStatus(i, str);
        if (i < 200 || i == 204 || i == 205 || i >= 300) {
            noCompression();
        }
    }

    public void sendError(int i) throws IOException {
        resetBuffer();
        super.sendError(i);
    }

    public void setStatus(int i) {
        super.setStatus(i);
        if (i < 200 || i == 204 || i == 205 || i >= 300) {
            noCompression();
        }
    }

    public void setContentLength(int i) {
        setContentLength(i);
    }
}
