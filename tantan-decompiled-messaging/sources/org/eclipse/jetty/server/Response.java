package org.eclipse.jetty.server;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.http.HttpCookie;
import org.eclipse.jetty.http.HttpFields;
import org.eclipse.jetty.http.HttpGenerator;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.http.HttpURI;
import org.eclipse.jetty.http.HttpVersions;
import org.eclipse.jetty.http.MimeTypes;
import org.eclipse.jetty.p123io.BufferCache;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.ErrorHandler;
import org.eclipse.jetty.util.ByteArrayISO8859Writer;
import org.eclipse.jetty.util.QuotedStringTokenizer;
import org.eclipse.jetty.util.StringUtil;
import org.eclipse.jetty.util.URIUtil;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.java_websocket.WebSocket;
import p149l.aag0;
import p149l.qkq0;
import p149l.rkl;
import p149l.x9g0;
import p149l.zje0;

/* JADX INFO: loaded from: classes3.dex */
public class Response implements HttpServletResponse {
    public static final String HTTP_ONLY_COMMENT = "__HTTP_ONLY__";
    private static final Logger LOG = Log.getLogger((Class<?>) Response.class);
    public static final int NONE = 0;
    public static final String SET_INCLUDE_HEADER_PREFIX = "org.eclipse.jetty.server.include.";
    public static final int STREAM = 1;
    public static final int WRITER = 2;
    private BufferCache.CachedBuffer _cachedMimeType;
    private String _characterEncoding;
    private final AbstractHttpConnection _connection;
    private String _contentType;
    private boolean _explicitEncoding;
    private Locale _locale;
    private String _mimeType;
    private volatile int _outputState;
    private String _reason;
    private int _status = 200;
    private PrintWriter _writer;

    public static class NullOutput extends zje0 {
        private NullOutput() {
        }

        @Override // p149l.zje0
        public void print(String str) throws IOException {
        }

        @Override // p149l.zje0
        public void println(String str) throws IOException {
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
        }
    }

    public Response(AbstractHttpConnection abstractHttpConnection) {
        this._connection = abstractHttpConnection;
    }

    public static Response getResponse(HttpServletResponse httpServletResponse) {
        return httpServletResponse instanceof Response ? (Response) httpServletResponse : AbstractHttpConnection.getCurrentConnection().getResponse();
    }

    @Override // javax.servlet.http.HttpServletResponse
    public void addCookie(Cookie cookie) {
        String str;
        boolean z;
        String comment = cookie.getComment();
        if (comment == null || comment.indexOf(HTTP_ONLY_COMMENT) < 0) {
            str = comment;
            z = false;
        } else {
            String strTrim = comment.replace(HTTP_ONLY_COMMENT, "").trim();
            if (strTrim.length() == 0) {
                strTrim = null;
            }
            str = strTrim;
            z = true;
        }
        this._connection.getResponseFields().addSetCookie(cookie.getName(), cookie.getValue(), cookie.getDomain(), cookie.getPath(), cookie.getMaxAge(), str, cookie.getSecure(), z || cookie.isHttpOnly(), cookie.getVersion());
    }

    @Override // javax.servlet.http.HttpServletResponse
    public void addDateHeader(String str, long j) {
        if (this._connection.isIncluding()) {
            return;
        }
        this._connection.getResponseFields().addDateField(str, j);
    }

    @Override // javax.servlet.http.HttpServletResponse
    public void addHeader(String str, String str2) {
        if (this._connection.isIncluding()) {
            if (!str.startsWith(SET_INCLUDE_HEADER_PREFIX)) {
                return;
            } else {
                str = str.substring(33);
            }
        }
        this._connection.getResponseFields().add(str, str2);
        if ("Content-Length".equalsIgnoreCase(str)) {
            this._connection._generator.setContentLength(Long.parseLong(str2));
        }
    }

    @Override // javax.servlet.http.HttpServletResponse
    public void addIntHeader(String str, int i) {
        if (this._connection.isIncluding()) {
            return;
        }
        long j = i;
        this._connection.getResponseFields().addLongField(str, j);
        if ("Content-Length".equalsIgnoreCase(str)) {
            this._connection._generator.setContentLength(j);
        }
    }

    public void complete() throws IOException {
        this._connection.completeResponse();
    }

    @Override // javax.servlet.http.HttpServletResponse
    public boolean containsHeader(String str) {
        return this._connection.getResponseFields().containsKey(str);
    }

    @Override // javax.servlet.http.HttpServletResponse
    public String encodeRedirectURL(String str) {
        return encodeURL(str);
    }

    @Override // javax.servlet.http.HttpServletResponse
    @Deprecated
    public String encodeRedirectUrl(String str) {
        return encodeRedirectURL(str);
    }

    @Override // javax.servlet.http.HttpServletResponse
    public String encodeURL(String str) {
        HttpURI httpURI;
        Request request = this._connection.getRequest();
        SessionManager sessionManager = request.getSessionManager();
        if (sessionManager != null) {
            String str2 = "";
            if (sessionManager.isCheckingRemoteSessionIdEncoding() && URIUtil.hasScheme(str)) {
                httpURI = new HttpURI(str);
                String path = httpURI.getPath();
                if (path == null) {
                    path = "";
                }
                int port = httpURI.getPort();
                if (port < 0) {
                    port = "https".equalsIgnoreCase(httpURI.getScheme()) ? WebSocket.DEFAULT_WSS_PORT : 80;
                }
                if (request.getServerName().equalsIgnoreCase(httpURI.getHost()) && request.getServerPort() == port && path.startsWith(request.getContextPath())) {
                }
            } else {
                httpURI = null;
            }
            String sessionIdPathParameterNamePrefix = sessionManager.getSessionIdPathParameterNamePrefix();
            if (sessionIdPathParameterNamePrefix != null) {
                if (str == null) {
                    return null;
                }
                if (request.isRequestedSessionIdFromCookie()) {
                    int iIndexOf = str.indexOf(sessionIdPathParameterNamePrefix);
                    if (iIndexOf != -1) {
                        int iIndexOf2 = str.indexOf("?", iIndexOf);
                        if (iIndexOf2 < 0) {
                            iIndexOf2 = str.indexOf("#", iIndexOf);
                        }
                        return iIndexOf2 <= iIndexOf ? str.substring(0, iIndexOf) : str.substring(0, iIndexOf).concat(str.substring(iIndexOf2));
                    }
                } else {
                    rkl session = request.getSession(false);
                    if (session != null && sessionManager.isValid(session)) {
                        String nodeId = sessionManager.getNodeId(session);
                        if (httpURI == null) {
                            httpURI = new HttpURI(str);
                        }
                        int iIndexOf3 = str.indexOf(sessionIdPathParameterNamePrefix);
                        if (iIndexOf3 != -1) {
                            int iIndexOf4 = str.indexOf("?", iIndexOf3);
                            if (iIndexOf4 < 0) {
                                iIndexOf4 = str.indexOf("#", iIndexOf3);
                            }
                            if (iIndexOf4 <= iIndexOf3) {
                                return str.substring(0, iIndexOf3 + sessionIdPathParameterNamePrefix.length()) + nodeId;
                            }
                            return str.substring(0, iIndexOf3 + sessionIdPathParameterNamePrefix.length()) + nodeId + str.substring(iIndexOf4);
                        }
                        int iIndexOf5 = str.indexOf(63);
                        if (iIndexOf5 < 0) {
                            iIndexOf5 = str.indexOf(35);
                        }
                        if (iIndexOf5 < 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            if (("https".equalsIgnoreCase(httpURI.getScheme()) || "http".equalsIgnoreCase(httpURI.getScheme())) && httpURI.getPath() == null) {
                                str2 = "/";
                            }
                            sb.append(str2);
                            sb.append(sessionIdPathParameterNamePrefix);
                            sb.append(nodeId);
                            return sb.toString();
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str.substring(0, iIndexOf5));
                        if (("https".equalsIgnoreCase(httpURI.getScheme()) || "http".equalsIgnoreCase(httpURI.getScheme())) && httpURI.getPath() == null) {
                            str2 = "/";
                        }
                        sb2.append(str2);
                        sb2.append(sessionIdPathParameterNamePrefix);
                        sb2.append(nodeId);
                        sb2.append(str.substring(iIndexOf5));
                        return sb2.toString();
                    }
                }
                return str;
            }
        }
        return str;
    }

    @Override // javax.servlet.http.HttpServletResponse
    @Deprecated
    public String encodeUrl(String str) {
        return encodeURL(str);
    }

    @Override // p149l.gke0
    public void flushBuffer() throws IOException {
        this._connection.flushResponse();
    }

    public void fwdReset() {
        resetBuffer();
        this._writer = null;
        this._outputState = 0;
    }

    @Override // p149l.gke0
    public int getBufferSize() {
        return this._connection.getGenerator().getContentBufferSize();
    }

    @Override // p149l.gke0
    public String getCharacterEncoding() {
        if (this._characterEncoding == null) {
            this._characterEncoding = "ISO-8859-1";
        }
        return this._characterEncoding;
    }

    public long getContentCount() {
        AbstractHttpConnection abstractHttpConnection = this._connection;
        if (abstractHttpConnection == null || abstractHttpConnection.getGenerator() == null) {
            return -1L;
        }
        return this._connection.getGenerator().getContentWritten();
    }

    @Override // p149l.gke0
    public String getContentType() {
        return this._contentType;
    }

    @Override // javax.servlet.http.HttpServletResponse
    public String getHeader(String str) {
        return this._connection.getResponseFields().getStringField(str);
    }

    @Override // javax.servlet.http.HttpServletResponse
    public Collection<String> getHeaderNames() {
        return this._connection.getResponseFields().getFieldNamesCollection();
    }

    @Override // javax.servlet.http.HttpServletResponse
    public Collection<String> getHeaders(String str) {
        Collection<String> valuesCollection = this._connection.getResponseFields().getValuesCollection(str);
        return valuesCollection == null ? Collections.EMPTY_LIST : valuesCollection;
    }

    public HttpFields getHttpFields() {
        return this._connection.getResponseFields();
    }

    @Override // p149l.gke0
    public Locale getLocale() {
        Locale locale = this._locale;
        return locale == null ? Locale.getDefault() : locale;
    }

    @Override // p149l.gke0
    public zje0 getOutputStream() throws IOException {
        if (this._outputState != 0 && this._outputState != 1) {
            qkq0.m175383a("WRITER");
            return null;
        }
        zje0 outputStream = this._connection.getOutputStream();
        this._outputState = 1;
        return outputStream;
    }

    public String getReason() {
        return this._reason;
    }

    public String getSetCharacterEncoding() {
        return this._characterEncoding;
    }

    @Override // javax.servlet.http.HttpServletResponse
    public int getStatus() {
        return this._status;
    }

    @Override // p149l.gke0
    public PrintWriter getWriter() throws IOException {
        if (this._outputState != 0 && this._outputState != 2) {
            qkq0.m175383a("STREAM");
            return null;
        }
        if (this._writer == null) {
            String charsetFromContentType = this._characterEncoding;
            if (charsetFromContentType == null) {
                BufferCache.CachedBuffer cachedBuffer = this._cachedMimeType;
                if (cachedBuffer != null) {
                    charsetFromContentType = MimeTypes.getCharsetFromContentType(cachedBuffer);
                }
                if (charsetFromContentType == null) {
                    charsetFromContentType = "ISO-8859-1";
                }
                setCharacterEncoding(charsetFromContentType);
            }
            this._writer = this._connection.getPrintWriter(charsetFromContentType);
        }
        this._outputState = 2;
        return this._writer;
    }

    @Override // p149l.gke0
    public boolean isCommitted() {
        return this._connection.isResponseCommitted();
    }

    public boolean isOutputing() {
        return this._outputState != 0;
    }

    public boolean isWriting() {
        return this._outputState == 2;
    }

    public void recycle() {
        this._status = 200;
        this._reason = null;
        this._locale = null;
        this._mimeType = null;
        this._cachedMimeType = null;
        this._characterEncoding = null;
        this._explicitEncoding = false;
        this._contentType = null;
        this._writer = null;
        this._outputState = 0;
    }

    @Override // p149l.gke0
    public void reset() {
        resetBuffer();
        fwdReset();
        this._status = 200;
        this._reason = null;
        HttpFields responseFields = this._connection.getResponseFields();
        responseFields.clear();
        String stringField = this._connection.getRequestFields().getStringField(HttpHeaders.CONNECTION_BUFFER);
        if (stringField != null) {
            String[] strArrSplit = stringField.split(Constants.SEPARATOR_COMMA);
            for (int i = 0; strArrSplit != null && i < strArrSplit.length; i++) {
                BufferCache.CachedBuffer cachedBuffer = HttpHeaderValues.CACHE.get(strArrSplit[0].trim());
                if (cachedBuffer != null) {
                    int ordinal = cachedBuffer.getOrdinal();
                    if (ordinal == 1) {
                        responseFields.put(HttpHeaders.CONNECTION_BUFFER, HttpHeaderValues.CLOSE_BUFFER);
                    } else if (ordinal != 5) {
                        if (ordinal == 8) {
                            responseFields.put(HttpHeaders.CONNECTION_BUFFER, "TE");
                        }
                    } else if (HttpVersions.HTTP_1_0.equalsIgnoreCase(this._connection.getRequest().getProtocol())) {
                        responseFields.put(HttpHeaders.CONNECTION_BUFFER, "keep-alive");
                    }
                }
            }
        }
    }

    @Override // p149l.gke0
    public void resetBuffer() {
        if (isCommitted()) {
            qkq0.m175383a("Committed");
        } else {
            this._connection.getGenerator().resetBuffer();
        }
    }

    @Override // javax.servlet.http.HttpServletResponse
    public void sendError(int i, String str) throws IOException {
        if (this._connection.isIncluding()) {
            return;
        }
        if (isCommitted()) {
            LOG.warn("Committed before " + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str, new Object[0]);
        }
        resetBuffer();
        this._characterEncoding = null;
        setHeader("Expires", null);
        setHeader("Last-Modified", null);
        setHeader("Cache-Control", null);
        setHeader("Content-Type", null);
        setHeader("Content-Length", null);
        this._outputState = 0;
        setStatus(i, str);
        if (str == null) {
            str = HttpStatus.getMessage(i);
        }
        if (i != 204 && i != 304 && i != 206 && i >= 200) {
            Request request = this._connection.getRequest();
            ContextHandler.Context context = request.getContext();
            ErrorHandler errorHandler = context != null ? context.getContextHandler().getErrorHandler() : null;
            if (errorHandler == null) {
                errorHandler = (ErrorHandler) this._connection.getConnector().getServer().getBean(ErrorHandler.class);
            }
            if (errorHandler != null) {
                request.setAttribute("javax.servlet.error.status_code", new Integer(i));
                request.setAttribute("javax.servlet.error.message", str);
                request.setAttribute("javax.servlet.error.request_uri", request.getRequestURI());
                request.setAttribute("javax.servlet.error.servlet_name", request.getServletName());
                errorHandler.handle(null, this._connection.getRequest(), this._connection.getRequest(), this);
            } else {
                setHeader("Cache-Control", "must-revalidate,no-cache,no-store");
                setContentType(MimeTypes.TEXT_HTML_8859_1);
                ByteArrayISO8859Writer byteArrayISO8859Writer = new ByteArrayISO8859Writer(2048);
                if (str != null) {
                    str = StringUtil.replace(StringUtil.replace(StringUtil.replace(str, "&", "&amp;"), "<", "&lt;"), ">", "&gt;");
                }
                String requestURI = request.getRequestURI();
                if (requestURI != null) {
                    requestURI = StringUtil.replace(StringUtil.replace(StringUtil.replace(requestURI, "&", "&amp;"), "<", "&lt;"), ">", "&gt;");
                }
                byteArrayISO8859Writer.write("<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html;charset=ISO-8859-1\"/>\n");
                byteArrayISO8859Writer.write("<title>Error ");
                byteArrayISO8859Writer.write(Integer.toString(i));
                byteArrayISO8859Writer.write(' ');
                if (str == null) {
                    str = HttpStatus.getMessage(i);
                }
                byteArrayISO8859Writer.write(str);
                byteArrayISO8859Writer.write("</title>\n</head>\n<body>\n<h2>HTTP ERROR: ");
                byteArrayISO8859Writer.write(Integer.toString(i));
                byteArrayISO8859Writer.write("</h2>\n<p>Problem accessing ");
                byteArrayISO8859Writer.write(requestURI);
                byteArrayISO8859Writer.write(". Reason:\n<pre>    ");
                byteArrayISO8859Writer.write(str);
                byteArrayISO8859Writer.write("</pre>");
                byteArrayISO8859Writer.write("</p>\n<hr /><i><small>Powered by Jetty://</small></i>");
                for (int i2 = 0; i2 < 20; i2++) {
                    byteArrayISO8859Writer.write("\n                                                ");
                }
                byteArrayISO8859Writer.write("\n</body>\n</html>\n");
                byteArrayISO8859Writer.flush();
                setContentLength(byteArrayISO8859Writer.size());
                byteArrayISO8859Writer.writeTo(getOutputStream());
                byteArrayISO8859Writer.destroy();
            }
        } else if (i != 206) {
            this._connection.getRequestFields().remove(HttpHeaders.CONTENT_TYPE_BUFFER);
            this._connection.getRequestFields().remove(HttpHeaders.CONTENT_LENGTH_BUFFER);
            this._characterEncoding = null;
            this._mimeType = null;
            this._cachedMimeType = null;
        }
        complete();
    }

    public void sendProcessing() throws IOException {
        if (!this._connection.isExpecting102Processing() || isCommitted()) {
            return;
        }
        ((HttpGenerator) this._connection.getGenerator()).send1xx(102);
    }

    @Override // javax.servlet.http.HttpServletResponse
    public void sendRedirect(String str) throws IOException {
        if (this._connection.isIncluding()) {
            return;
        }
        if (str == null) {
            x9g0.m207497a();
            return;
        }
        if (!URIUtil.hasScheme(str)) {
            StringBuilder rootURL = this._connection.getRequest().getRootURL();
            if (str.startsWith("/")) {
                rootURL.append(str);
            } else {
                String requestURI = this._connection.getRequest().getRequestURI();
                if (!requestURI.endsWith("/")) {
                    requestURI = URIUtil.parentPath(requestURI);
                }
                String strAddPaths = URIUtil.addPaths(requestURI, str);
                if (strAddPaths == null) {
                    qkq0.m175383a("path cannot be above root");
                    return;
                } else {
                    if (!strAddPaths.startsWith("/")) {
                        rootURL.append('/');
                    }
                    rootURL.append(strAddPaths);
                }
            }
            str = rootURL.toString();
            HttpURI httpURI = new HttpURI(str);
            String decodedPath = httpURI.getDecodedPath();
            String strCanonicalPath = URIUtil.canonicalPath(decodedPath);
            if (strCanonicalPath == null) {
                x9g0.m207497a();
                return;
            }
            if (!strCanonicalPath.equals(decodedPath)) {
                StringBuilder rootURL2 = this._connection.getRequest().getRootURL();
                rootURL2.append(URIUtil.encodePath(strCanonicalPath));
                if (httpURI.getQuery() != null) {
                    rootURL2.append('?');
                    rootURL2.append(httpURI.getQuery());
                }
                if (httpURI.getFragment() != null) {
                    rootURL2.append('#');
                    rootURL2.append(httpURI.getFragment());
                }
                str = rootURL2.toString();
            }
        }
        resetBuffer();
        setHeader("Location", str);
        setStatus(302);
        complete();
    }

    @Override // p149l.gke0
    public void setBufferSize(int i) {
        if (isCommitted() || getContentCount() > 0) {
            qkq0.m175383a("Committed or content written");
        } else {
            this._connection.getGenerator().increaseContentBufferSize(i);
        }
    }

    @Override // p149l.gke0
    public void setCharacterEncoding(String str) {
        BufferCache.CachedBuffer associate;
        if (this._connection.isIncluding() || this._outputState != 0 || isCommitted()) {
            return;
        }
        this._explicitEncoding = true;
        if (str == null) {
            if (this._characterEncoding != null) {
                this._characterEncoding = null;
                BufferCache.CachedBuffer cachedBuffer = this._cachedMimeType;
                if (cachedBuffer != null) {
                    this._contentType = cachedBuffer.toString();
                } else {
                    String str2 = this._mimeType;
                    if (str2 != null) {
                        this._contentType = str2;
                    } else {
                        this._contentType = null;
                    }
                }
                String str3 = this._contentType;
                AbstractHttpConnection abstractHttpConnection = this._connection;
                if (str3 == null) {
                    abstractHttpConnection.getResponseFields().remove(HttpHeaders.CONTENT_TYPE_BUFFER);
                    return;
                } else {
                    abstractHttpConnection.getResponseFields().put(HttpHeaders.CONTENT_TYPE_BUFFER, this._contentType);
                    return;
                }
            }
            return;
        }
        this._characterEncoding = str;
        String str4 = this._contentType;
        if (str4 != null) {
            int iIndexOf = str4.indexOf(59);
            if (iIndexOf < 0) {
                this._contentType = null;
                BufferCache.CachedBuffer cachedBuffer2 = this._cachedMimeType;
                if (cachedBuffer2 != null && (associate = cachedBuffer2.getAssociate(this._characterEncoding)) != null) {
                    this._contentType = associate.toString();
                    this._connection.getResponseFields().put(HttpHeaders.CONTENT_TYPE_BUFFER, associate);
                }
                if (this._contentType == null) {
                    this._contentType = this._mimeType + ";charset=" + QuotedStringTokenizer.quoteIfNeeded(this._characterEncoding, ";= ");
                    this._connection.getResponseFields().put(HttpHeaders.CONTENT_TYPE_BUFFER, this._contentType);
                    return;
                }
                return;
            }
            int iIndexOf2 = this._contentType.indexOf("charset=", iIndexOf);
            String str5 = this._contentType;
            if (iIndexOf2 < 0) {
                this._contentType = str5 + ";charset=" + QuotedStringTokenizer.quoteIfNeeded(this._characterEncoding, ";= ");
            } else {
                int i = iIndexOf2 + 8;
                int iIndexOf3 = str5.indexOf(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, i);
                String str6 = this._contentType;
                if (iIndexOf3 < 0) {
                    this._contentType = str6.substring(0, i) + QuotedStringTokenizer.quoteIfNeeded(this._characterEncoding, ";= ");
                } else {
                    this._contentType = str6.substring(0, i) + QuotedStringTokenizer.quoteIfNeeded(this._characterEncoding, ";= ") + this._contentType.substring(iIndexOf3);
                }
            }
            this._connection.getResponseFields().put(HttpHeaders.CONTENT_TYPE_BUFFER, this._contentType);
        }
    }

    @Override // p149l.gke0
    public void setContentLength(int i) {
        if (isCommitted() || this._connection.isIncluding()) {
            return;
        }
        long j = i;
        this._connection._generator.setContentLength(j);
        if (i > 0) {
            this._connection.getResponseFields().putLongField("Content-Length", j);
            if (this._connection._generator.isAllContentWritten()) {
                if (this._outputState == 2) {
                    this._writer.close();
                } else if (this._outputState == 1) {
                    try {
                        getOutputStream().close();
                    } catch (IOException e) {
                        aag0.m95543a(e);
                    }
                }
            }
        }
    }

    @Override // p149l.gke0
    public void setContentType(String str) {
        if (isCommitted() || this._connection.isIncluding()) {
            return;
        }
        if (str == null) {
            if (this._locale == null) {
                this._characterEncoding = null;
            }
            this._mimeType = null;
            this._cachedMimeType = null;
            this._contentType = null;
            this._connection.getResponseFields().remove(HttpHeaders.CONTENT_TYPE_BUFFER);
            return;
        }
        int iIndexOf = str.indexOf(59);
        if (iIndexOf <= 0) {
            this._mimeType = str;
            BufferCache.CachedBuffer cachedBuffer = MimeTypes.CACHE.get(str);
            this._cachedMimeType = cachedBuffer;
            String str2 = this._characterEncoding;
            if (str2 == null) {
                if (cachedBuffer != null) {
                    this._contentType = cachedBuffer.toString();
                    this._connection.getResponseFields().put(HttpHeaders.CONTENT_TYPE_BUFFER, this._cachedMimeType);
                    return;
                } else {
                    this._contentType = str;
                    this._connection.getResponseFields().put(HttpHeaders.CONTENT_TYPE_BUFFER, this._contentType);
                    return;
                }
            }
            if (cachedBuffer == null) {
                this._contentType = str + ";charset=" + QuotedStringTokenizer.quoteIfNeeded(this._characterEncoding, ";= ");
                this._connection.getResponseFields().put(HttpHeaders.CONTENT_TYPE_BUFFER, this._contentType);
                return;
            }
            BufferCache.CachedBuffer associate = cachedBuffer.getAssociate(str2);
            if (associate != null) {
                this._contentType = associate.toString();
                this._connection.getResponseFields().put(HttpHeaders.CONTENT_TYPE_BUFFER, associate);
                return;
            }
            this._contentType = this._mimeType + ";charset=" + QuotedStringTokenizer.quoteIfNeeded(this._characterEncoding, ";= ");
            this._connection.getResponseFields().put(HttpHeaders.CONTENT_TYPE_BUFFER, this._contentType);
            return;
        }
        String strTrim = str.substring(0, iIndexOf).trim();
        this._mimeType = strTrim;
        BufferCache bufferCache = MimeTypes.CACHE;
        this._cachedMimeType = bufferCache.get(strTrim);
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf("charset=", i);
        if (iIndexOf2 < 0) {
            this._cachedMimeType = null;
            if (this._characterEncoding != null) {
                str = str + ";charset=" + QuotedStringTokenizer.quoteIfNeeded(this._characterEncoding, ";= ");
            }
            this._contentType = str;
            this._connection.getResponseFields().put(HttpHeaders.CONTENT_TYPE_BUFFER, this._contentType);
            return;
        }
        this._explicitEncoding = true;
        int i2 = iIndexOf2 + 8;
        int iIndexOf3 = str.indexOf(32, i2);
        if (this._outputState != 2) {
            if ((iIndexOf2 != i || iIndexOf3 >= 0) && !(iIndexOf2 == iIndexOf + 2 && iIndexOf3 < 0 && str.charAt(i) == ' ')) {
                if (iIndexOf3 > 0) {
                    this._characterEncoding = QuotedStringTokenizer.unquote(str.substring(i2, iIndexOf3));
                    this._contentType = str;
                    this._connection.getResponseFields().put(HttpHeaders.CONTENT_TYPE_BUFFER, this._contentType);
                    return;
                } else {
                    this._characterEncoding = QuotedStringTokenizer.unquote(str.substring(i2));
                    this._contentType = str;
                    this._connection.getResponseFields().put(HttpHeaders.CONTENT_TYPE_BUFFER, this._contentType);
                    return;
                }
            }
            this._cachedMimeType = bufferCache.get(this._mimeType);
            String strUnquote = QuotedStringTokenizer.unquote(str.substring(i2));
            this._characterEncoding = strUnquote;
            BufferCache.CachedBuffer cachedBuffer2 = this._cachedMimeType;
            if (cachedBuffer2 == null) {
                this._contentType = str;
                this._connection.getResponseFields().put(HttpHeaders.CONTENT_TYPE_BUFFER, this._contentType);
                return;
            }
            BufferCache.CachedBuffer associate2 = cachedBuffer2.getAssociate(strUnquote);
            if (associate2 != null) {
                this._contentType = associate2.toString();
                this._connection.getResponseFields().put(HttpHeaders.CONTENT_TYPE_BUFFER, associate2);
                return;
            } else {
                this._contentType = str;
                this._connection.getResponseFields().put(HttpHeaders.CONTENT_TYPE_BUFFER, this._contentType);
                return;
            }
        }
        if ((iIndexOf2 != i || iIndexOf3 >= 0) && !(iIndexOf2 == iIndexOf + 2 && iIndexOf3 < 0 && str.charAt(i) == ' ')) {
            if (iIndexOf3 < 0) {
                this._contentType = str.substring(0, iIndexOf2) + ";charset=" + QuotedStringTokenizer.quoteIfNeeded(this._characterEncoding, ";= ");
                this._connection.getResponseFields().put(HttpHeaders.CONTENT_TYPE_BUFFER, this._contentType);
                return;
            }
            this._contentType = str.substring(0, iIndexOf2) + str.substring(iIndexOf3) + ";charset=" + QuotedStringTokenizer.quoteIfNeeded(this._characterEncoding, ";= ");
            this._connection.getResponseFields().put(HttpHeaders.CONTENT_TYPE_BUFFER, this._contentType);
            return;
        }
        BufferCache.CachedBuffer cachedBuffer3 = this._cachedMimeType;
        if (cachedBuffer3 == null) {
            this._contentType = this._mimeType + ";charset=" + this._characterEncoding;
            this._connection.getResponseFields().put(HttpHeaders.CONTENT_TYPE_BUFFER, this._contentType);
            return;
        }
        BufferCache.CachedBuffer associate3 = cachedBuffer3.getAssociate(this._characterEncoding);
        if (associate3 != null) {
            this._contentType = associate3.toString();
            this._connection.getResponseFields().put(HttpHeaders.CONTENT_TYPE_BUFFER, associate3);
            return;
        }
        this._contentType = this._mimeType + ";charset=" + this._characterEncoding;
        this._connection.getResponseFields().put(HttpHeaders.CONTENT_TYPE_BUFFER, this._contentType);
    }

    @Override // javax.servlet.http.HttpServletResponse
    public void setDateHeader(String str, long j) {
        if (this._connection.isIncluding()) {
            return;
        }
        this._connection.getResponseFields().putDateField(str, j);
    }

    @Override // javax.servlet.http.HttpServletResponse
    public void setHeader(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            setContentType(str2);
            return;
        }
        if (this._connection.isIncluding()) {
            if (!str.startsWith(SET_INCLUDE_HEADER_PREFIX)) {
                return;
            } else {
                str = str.substring(33);
            }
        }
        this._connection.getResponseFields().put(str, str2);
        if ("Content-Length".equalsIgnoreCase(str)) {
            AbstractHttpConnection abstractHttpConnection = this._connection;
            if (str2 == null) {
                abstractHttpConnection._generator.setContentLength(-1L);
            } else {
                abstractHttpConnection._generator.setContentLength(Long.parseLong(str2));
            }
        }
    }

    @Override // javax.servlet.http.HttpServletResponse
    public void setIntHeader(String str, int i) {
        if (this._connection.isIncluding()) {
            return;
        }
        long j = i;
        this._connection.getResponseFields().putLongField(str, j);
        if ("Content-Length".equalsIgnoreCase(str)) {
            this._connection._generator.setContentLength(j);
        }
    }

    @Override // p149l.gke0
    public void setLocale(Locale locale) {
        String localeEncoding;
        if (locale == null || isCommitted() || this._connection.isIncluding()) {
            return;
        }
        this._locale = locale;
        this._connection.getResponseFields().put(HttpHeaders.CONTENT_LANGUAGE_BUFFER, locale.toString().replace('_', '-'));
        if (this._explicitEncoding || this._outputState != 0 || this._connection.getRequest().getContext() == null || (localeEncoding = this._connection.getRequest().getContext().getContextHandler().getLocaleEncoding(locale)) == null || localeEncoding.length() <= 0) {
            return;
        }
        this._characterEncoding = localeEncoding;
        String contentType = getContentType();
        if (contentType != null) {
            this._characterEncoding = localeEncoding;
            int iIndexOf = contentType.indexOf(59);
            if (iIndexOf < 0) {
                this._mimeType = contentType;
                this._contentType = contentType + ";charset=" + localeEncoding;
            } else {
                this._mimeType = contentType.substring(0, iIndexOf);
                String str = this._mimeType + ";charset=" + localeEncoding;
                this._mimeType = str;
                this._contentType = str;
            }
            this._cachedMimeType = MimeTypes.CACHE.get(this._mimeType);
            this._connection.getResponseFields().put(HttpHeaders.CONTENT_TYPE_BUFFER, this._contentType);
        }
    }

    public void setLongContentLength(long j) {
        if (isCommitted() || this._connection.isIncluding()) {
            return;
        }
        this._connection._generator.setContentLength(j);
        this._connection.getResponseFields().putLongField("Content-Length", j);
    }

    @Override // javax.servlet.http.HttpServletResponse
    public void setStatus(int i, String str) {
        if (i <= 0) {
            x9g0.m207497a();
        } else {
            if (this._connection.isIncluding()) {
                return;
            }
            this._status = i;
            this._reason = str;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HTTP/1.1 ");
        sb.append(this._status);
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        String str = this._reason;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(System.getProperty("line.separator"));
        sb.append(this._connection.getResponseFields().toString());
        return sb.toString();
    }

    @Override // javax.servlet.http.HttpServletResponse
    public void setStatus(int i) {
        setStatus(i, null);
    }

    public void addCookie(HttpCookie httpCookie) {
        this._connection.getResponseFields().addSetCookie(httpCookie);
    }

    public void reset(boolean z) {
        if (!z) {
            reset();
            return;
        }
        HttpFields responseFields = this._connection.getResponseFields();
        ArrayList arrayList = new ArrayList(5);
        Enumeration<String> values = responseFields.getValues("Set-Cookie");
        while (values.hasMoreElements()) {
            arrayList.add(values.nextElement());
        }
        reset();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            responseFields.add("Set-Cookie", (String) it.next());
        }
    }

    @Override // javax.servlet.http.HttpServletResponse
    public void sendError(int i) throws IOException {
        if (i == 102) {
            sendProcessing();
        } else {
            sendError(i, null);
        }
    }
}
