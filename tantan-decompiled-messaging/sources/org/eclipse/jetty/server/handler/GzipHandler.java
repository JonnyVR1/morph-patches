package org.eclipse.jetty.server.handler;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPOutputStream;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.continuation.Continuation;
import org.eclipse.jetty.continuation.ContinuationListener;
import org.eclipse.jetty.continuation.ContinuationSupport;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpMethods;
import org.eclipse.jetty.http.gzip.AbstractCompressedStream;
import org.eclipse.jetty.http.gzip.CompressedResponseWrapper;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class GzipHandler extends HandlerWrapper {
    private static final Logger LOG = Log.getLogger((Class<?>) GzipHandler.class);
    protected Set<String> _excluded;
    protected Set<String> _mimeTypes;
    protected int _bufferSize = 8192;
    protected int _minGzipSize = 256;

    public int getBufferSize() {
        return this._bufferSize;
    }

    public Set<String> getExcluded() {
        return this._excluded;
    }

    public Set<String> getMimeTypes() {
        return this._mimeTypes;
    }

    public int getMinGzipSize() {
        return this._minGzipSize;
    }

    @Override // org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.Handler
    public void handle(String str, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        if (this._handler == null || !isStarted()) {
            return;
        }
        String header = httpServletRequest.getHeader("accept-encoding");
        if (header == null || header.indexOf(HttpHeaderValues.GZIP) < 0 || httpServletResponse.containsHeader("Content-Encoding") || HttpMethods.HEAD.equalsIgnoreCase(httpServletRequest.getMethod())) {
            this._handler.handle(str, request, httpServletRequest, httpServletResponse);
            return;
        }
        if (this._excluded != null) {
            if (this._excluded.contains(httpServletRequest.getHeader("User-Agent"))) {
                this._handler.handle(str, request, httpServletRequest, httpServletResponse);
                return;
            }
        }
        final CompressedResponseWrapper compressedResponseWrapperNewGzipResponseWrapper = newGzipResponseWrapper(httpServletRequest, httpServletResponse);
        try {
            this._handler.handle(str, request, httpServletRequest, compressedResponseWrapperNewGzipResponseWrapper);
            Continuation continuation = ContinuationSupport.getContinuation(httpServletRequest);
            if (continuation.isSuspended() && continuation.isResponseWrapped()) {
                continuation.addContinuationListener(new ContinuationListener() { // from class: org.eclipse.jetty.server.handler.GzipHandler.1
                    @Override // org.eclipse.jetty.continuation.ContinuationListener
                    public void onComplete(Continuation continuation2) {
                        try {
                            compressedResponseWrapperNewGzipResponseWrapper.finish();
                        } catch (IOException e) {
                            GzipHandler.LOG.warn(e);
                        }
                    }

                    @Override // org.eclipse.jetty.continuation.ContinuationListener
                    public void onTimeout(Continuation continuation2) {
                    }
                });
            } else {
                compressedResponseWrapperNewGzipResponseWrapper.finish();
            }
        } catch (Throwable th) {
            Continuation continuation2 = ContinuationSupport.getContinuation(httpServletRequest);
            if (continuation2.isSuspended() && continuation2.isResponseWrapped()) {
                continuation2.addContinuationListener(new ContinuationListener() { // from class: org.eclipse.jetty.server.handler.GzipHandler.1
                    @Override // org.eclipse.jetty.continuation.ContinuationListener
                    public void onComplete(Continuation continuation3) {
                        try {
                            compressedResponseWrapperNewGzipResponseWrapper.finish();
                        } catch (IOException e) {
                            GzipHandler.LOG.warn(e);
                        }
                    }

                    @Override // org.eclipse.jetty.continuation.ContinuationListener
                    public void onTimeout(Continuation continuation3) {
                    }
                });
            } else if (httpServletResponse.isCommitted()) {
                compressedResponseWrapperNewGzipResponseWrapper.finish();
            } else {
                compressedResponseWrapperNewGzipResponseWrapper.resetBuffer();
                compressedResponseWrapperNewGzipResponseWrapper.noCompression();
            }
            throw th;
        }
    }

    public CompressedResponseWrapper newGzipResponseWrapper(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        return new CompressedResponseWrapper(httpServletRequest, httpServletResponse) { // from class: org.eclipse.jetty.server.handler.GzipHandler.2
            {
                super.setMimeTypes(GzipHandler.this._mimeTypes);
                super.setBufferSize(GzipHandler.this._bufferSize);
                super.setMinCompressSize(GzipHandler.this._minGzipSize);
            }

            @Override // org.eclipse.jetty.http.gzip.CompressedResponseWrapper
            public AbstractCompressedStream newCompressedStream(HttpServletRequest httpServletRequest2, HttpServletResponse httpServletResponse2, long j, int i, int i2) throws IOException {
                return new AbstractCompressedStream(HttpHeaderValues.GZIP, httpServletRequest2, httpServletResponse2, j, i, i2) { // from class: org.eclipse.jetty.server.handler.GzipHandler.2.1
                    @Override // org.eclipse.jetty.http.gzip.AbstractCompressedStream
                    public DeflaterOutputStream createStream() throws IOException {
                        return new GZIPOutputStream(this._response.getOutputStream(), this._bufferSize);
                    }
                };
            }

            @Override // org.eclipse.jetty.http.gzip.CompressedResponseWrapper
            public PrintWriter newWriter(OutputStream outputStream, String str) throws UnsupportedEncodingException {
                return GzipHandler.this.newWriter(outputStream, str);
            }
        };
    }

    public PrintWriter newWriter(OutputStream outputStream, String str) throws UnsupportedEncodingException {
        return str == null ? new PrintWriter(outputStream) : new PrintWriter(new OutputStreamWriter(outputStream, str));
    }

    public void setBufferSize(int i) {
        this._bufferSize = i;
    }

    public void setExcluded(String str) {
        if (str != null) {
            this._excluded = new HashSet();
            StringTokenizer stringTokenizer = new StringTokenizer(str, Constants.SEPARATOR_COMMA, false);
            while (stringTokenizer.hasMoreTokens()) {
                this._excluded.add(stringTokenizer.nextToken());
            }
        }
    }

    public void setMimeTypes(String str) {
        if (str != null) {
            this._mimeTypes = new HashSet();
            StringTokenizer stringTokenizer = new StringTokenizer(str, Constants.SEPARATOR_COMMA, false);
            while (stringTokenizer.hasMoreTokens()) {
                this._mimeTypes.add(stringTokenizer.nextToken());
            }
        }
    }

    public void setMinGzipSize(int i) {
        this._minGzipSize = i;
    }

    public void setExcluded(Set<String> set) {
        this._excluded = set;
    }

    public void setMimeTypes(Set<String> set) {
        this._mimeTypes = set;
    }
}
