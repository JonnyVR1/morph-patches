package org.eclipse.jetty.server;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.security.Principal;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.EventListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.servlet.DispatcherType;
import javax.servlet.ServletException;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestEvent;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.continuation.Continuation;
import org.eclipse.jetty.continuation.ContinuationListener;
import org.eclipse.jetty.http.HttpCookie;
import org.eclipse.jetty.http.HttpFields;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpMethods;
import org.eclipse.jetty.http.HttpParser;
import org.eclipse.jetty.http.HttpURI;
import org.eclipse.jetty.http.HttpVersions;
import org.eclipse.jetty.http.MimeTypes;
import org.eclipse.jetty.p127io.Buffer;
import org.eclipse.jetty.p127io.BufferUtil;
import org.eclipse.jetty.p127io.ByteArrayBuffer;
import org.eclipse.jetty.p127io.EndPoint;
import org.eclipse.jetty.p127io.nio.DirectNIOBuffer;
import org.eclipse.jetty.p127io.nio.IndirectNIOBuffer;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.util.Attributes;
import org.eclipse.jetty.util.AttributesMap;
import org.eclipse.jetty.util.LazyList;
import org.eclipse.jetty.util.MultiException;
import org.eclipse.jetty.util.MultiMap;
import org.eclipse.jetty.util.MultiPartInputStream;
import org.eclipse.jetty.util.StringUtil;
import org.eclipse.jetty.util.URIUtil;
import org.eclipse.jetty.util.UrlEncoded;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.java_websocket.WebSocket;
import p153l.ase0;
import p153l.c2d0;
import p153l.dse0;
import p153l.gse0;
import p153l.hnl;
import p153l.hse0;
import p153l.iig0;
import p153l.ise0;
import p153l.lse0;
import p153l.lu10;
import p153l.o21;
import p153l.qg60;
import p153l.r21;
import p153l.wpg0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
public class Request implements HttpServletRequest {
    private static final int _STREAM = 1;
    private static final String __ASYNC_FWD = "org.eclipse.asyncfwd";
    public static final String __MULTIPART_CONFIG_ELEMENT = "org.eclipse.multipartConfig";
    public static final String __MULTIPART_CONTEXT = "org.eclipse.multiPartContext";
    public static final String __MULTIPART_INPUT_STREAM = "org.eclipse.multiPartInputStream";
    private static final int __NONE = 0;
    private static final int __READER = 2;
    private volatile Attributes _attributes;
    private Authentication _authentication;
    private MultiMap<String> _baseParameters;
    private String _characterEncoding;
    protected AbstractHttpConnection _connection;
    private ContextHandler.Context _context;
    private String _contextPath;
    private CookieCutter _cookies;
    private long _dispatchTime;
    private DispatcherType _dispatcherType;
    private EndPoint _endp;
    private String _method;
    private MultiPartInputStream _multiPartInputStream;
    private boolean _newContext;
    private MultiMap<String> _parameters;
    private boolean _paramsExtracted;
    private String _pathInfo;
    private int _port;
    private String _queryEncoding;
    private String _queryString;
    private BufferedReader _reader;
    private String _readerEncoding;
    private String _remoteAddr;
    private String _remoteHost;
    private Object _requestAttributeListeners;
    private String _requestURI;
    private String _requestedSessionId;
    private Map<Object, hnl> _savedNewSessions;
    private UserIdentity.Scope _scope;
    private String _serverName;
    private String _servletPath;
    private hnl _session;
    private SessionManager _sessionManager;
    private long _timeStamp;
    private Buffer _timeStampBuffer;
    private HttpURI _uri;
    private static final Logger LOG = Log.getLogger((Class<?>) Request.class);
    private static final Collection __defaultLocale = Collections.singleton(Locale.getDefault());
    protected final AsyncContinuation _async = new AsyncContinuation();
    private boolean _asyncSupported = true;
    private boolean _cookiesExtracted = false;
    private boolean _dns = false;
    private boolean _handled = false;
    private int _inputState = 0;
    private String _protocol = HttpVersions.HTTP_1_1;
    private boolean _requestedSessionIdFromCookie = false;
    private String _scheme = "http";

    public static class MultiPartCleanerListener implements ise0 {
        @Override // p153l.ise0
        public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
            MultiPartInputStream multiPartInputStream = (MultiPartInputStream) servletRequestEvent.getServletRequest().getAttribute(Request.__MULTIPART_INPUT_STREAM);
            if (multiPartInputStream == null || ((ContextHandler.Context) servletRequestEvent.getServletRequest().getAttribute(Request.__MULTIPART_CONTEXT)) != servletRequestEvent.getServletContext()) {
                return;
            }
            try {
                multiPartInputStream.deleteParts();
            } catch (MultiException e) {
                servletRequestEvent.getServletContext().log("Errors deleting multipart tmp files", e);
            }
        }

        @Override // p153l.ise0
        public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        }
    }

    public Request(AbstractHttpConnection abstractHttpConnection) {
        setConnection(abstractHttpConnection);
    }

    public static Request getRequest(HttpServletRequest httpServletRequest) {
        return httpServletRequest instanceof Request ? (Request) httpServletRequest : AbstractHttpConnection.getCurrentConnection().getRequest();
    }

    public void addEventListener(EventListener eventListener) {
        if (eventListener instanceof hse0) {
            this._requestAttributeListeners = LazyList.add(this._requestAttributeListeners, eventListener);
        }
        if (eventListener instanceof ContinuationListener) {
            throw new IllegalArgumentException(eventListener.getClass().toString());
        }
        if (eventListener instanceof r21) {
            throw new IllegalArgumentException(eventListener.getClass().toString());
        }
    }

    @Override // javax.servlet.http.HttpServletRequest
    public boolean authenticate(HttpServletResponse httpServletResponse) throws ServletException, IOException {
        Authentication authentication = this._authentication;
        if (authentication instanceof Authentication.Deferred) {
            setAuthentication(((Authentication.Deferred) authentication).authenticate(this, httpServletResponse));
            return !(this._authentication instanceof Authentication.ResponseSent);
        }
        httpServletResponse.sendError(401);
        return false;
    }

    public void extractParameters() {
        int contentLength;
        int iIntValue;
        int iIntValue2;
        if (this._baseParameters == null) {
            this._baseParameters = new MultiMap<>(16);
        }
        if (this._paramsExtracted) {
            if (this._parameters == null) {
                this._parameters = this._baseParameters;
                return;
            }
            return;
        }
        this._paramsExtracted = true;
        try {
            HttpURI httpURI = this._uri;
            if (httpURI != null && httpURI.hasQuery()) {
                String str = this._queryEncoding;
                HttpURI httpURI2 = this._uri;
                if (str == null) {
                    httpURI2.decodeQueryTo(this._baseParameters);
                } else {
                    try {
                        httpURI2.decodeQueryTo(this._baseParameters, str);
                    } catch (UnsupportedEncodingException e) {
                        Logger logger = LOG;
                        if (logger.isDebugEnabled()) {
                            logger.warn(e);
                        } else {
                            logger.warn(e.toString(), new Object[0]);
                        }
                    }
                }
            }
            String characterEncoding = getCharacterEncoding();
            String contentType = getContentType();
            if (contentType != null && contentType.length() > 0 && MimeTypes.FORM_ENCODED.equalsIgnoreCase(HttpFields.valueParameters(contentType, null)) && this._inputState == 0 && (("POST".equals(getMethod()) || HttpMethods.PUT.equals(getMethod())) && (contentLength = getContentLength()) != 0)) {
                try {
                    ContextHandler.Context context = this._context;
                    if (context != null) {
                        iIntValue = context.getContextHandler().getMaxFormContentSize();
                        iIntValue2 = this._context.getContextHandler().getMaxFormKeys();
                    } else {
                        Number number = (Number) this._connection.getConnector().getServer().getAttribute("org.eclipse.jetty.server.Request.maxFormContentSize");
                        iIntValue = number == null ? 200000 : number.intValue();
                        Number number2 = (Number) this._connection.getConnector().getServer().getAttribute("org.eclipse.jetty.server.Request.maxFormKeys");
                        iIntValue2 = number2 == null ? 1000 : number2.intValue();
                    }
                    if (contentLength > iIntValue && iIntValue > 0) {
                        throw new IllegalStateException("Form too large" + contentLength + ">" + iIntValue);
                    }
                    dse0 inputStream = getInputStream();
                    MultiMap<String> multiMap = this._baseParameters;
                    if (contentLength >= 0) {
                        iIntValue = -1;
                    }
                    UrlEncoded.decodeTo(inputStream, multiMap, characterEncoding, iIntValue, iIntValue2);
                } catch (IOException e2) {
                    Logger logger2 = LOG;
                    if (logger2.isDebugEnabled()) {
                        logger2.warn(e2);
                    } else {
                        logger2.warn(e2.toString(), new Object[0]);
                    }
                }
            }
            MultiMap<String> multiMap2 = this._parameters;
            if (multiMap2 == null) {
                this._parameters = this._baseParameters;
            } else {
                MultiMap<String> multiMap3 = this._baseParameters;
                if (multiMap2 != multiMap3) {
                    for (Map.Entry<String, Object> entry : multiMap3.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        for (int i = 0; i < LazyList.size(value); i++) {
                            this._parameters.add(key, LazyList.get(value, i));
                        }
                    }
                }
            }
            if (this._parameters == null) {
                this._parameters = this._baseParameters;
            }
        } catch (Throwable th) {
            if (this._parameters == null) {
                this._parameters = this._baseParameters;
            }
            throw th;
        }
    }

    @Override // p153l.gse0
    public o21 getAsyncContext() {
        if (!this._async.isInitial() || this._async.isAsyncStarted()) {
            return this._async;
        }
        wtq0.m207906a(this._async.getStatusString());
        return null;
    }

    public AsyncContinuation getAsyncContinuation() {
        return this._async;
    }

    @Override // p153l.gse0
    public Object getAttribute(String str) {
        if ("org.eclipse.jetty.io.EndPoint.maxIdleTime".equalsIgnoreCase(str)) {
            return new Long(getConnection().getEndPoint().getMaxIdleTime());
        }
        Object attribute = this._attributes == null ? null : this._attributes.getAttribute(str);
        return (attribute == null && Continuation.ATTRIBUTE.equals(str)) ? this._async : attribute;
    }

    @Override // p153l.gse0
    public Enumeration getAttributeNames() {
        return this._attributes == null ? Collections.enumeration(Collections.EMPTY_LIST) : AttributesMap.getAttributeNamesCopy(this._attributes);
    }

    public Attributes getAttributes() {
        if (this._attributes == null) {
            this._attributes = new AttributesMap();
        }
        return this._attributes;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public String getAuthType() {
        Authentication authentication = this._authentication;
        if (authentication instanceof Authentication.Deferred) {
            setAuthentication(((Authentication.Deferred) authentication).authenticate(this));
        }
        Authentication authentication2 = this._authentication;
        if (authentication2 instanceof Authentication.User) {
            return ((Authentication.User) authentication2).getAuthMethod();
        }
        return null;
    }

    public Authentication getAuthentication() {
        return this._authentication;
    }

    @Override // p153l.gse0
    public String getCharacterEncoding() {
        return this._characterEncoding;
    }

    public AbstractHttpConnection getConnection() {
        return this._connection;
    }

    @Override // p153l.gse0
    public int getContentLength() {
        return (int) this._connection.getRequestFields().getLongField(HttpHeaders.CONTENT_LENGTH_BUFFER);
    }

    public long getContentRead() {
        AbstractHttpConnection abstractHttpConnection = this._connection;
        if (abstractHttpConnection == null || abstractHttpConnection.getParser() == null) {
            return -1L;
        }
        return ((HttpParser) this._connection.getParser()).getContentRead();
    }

    @Override // p153l.gse0
    public String getContentType() {
        return this._connection.getRequestFields().getStringField(HttpHeaders.CONTENT_TYPE_BUFFER);
    }

    public ContextHandler.Context getContext() {
        return this._context;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public String getContextPath() {
        return this._contextPath;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public Cookie[] getCookies() {
        if (this._cookiesExtracted) {
            CookieCutter cookieCutter = this._cookies;
            if (cookieCutter == null) {
                return null;
            }
            return cookieCutter.getCookies();
        }
        this._cookiesExtracted = true;
        Enumeration<String> values = this._connection.getRequestFields().getValues(HttpHeaders.COOKIE_BUFFER);
        if (values != null) {
            if (this._cookies == null) {
                this._cookies = new CookieCutter();
            }
            while (values.hasMoreElements()) {
                this._cookies.addCookieField(values.nextElement());
            }
        }
        CookieCutter cookieCutter2 = this._cookies;
        if (cookieCutter2 == null) {
            return null;
        }
        return cookieCutter2.getCookies();
    }

    @Override // javax.servlet.http.HttpServletRequest
    public long getDateHeader(String str) {
        return this._connection.getRequestFields().getDateField(str);
    }

    public long getDispatchTime() {
        return this._dispatchTime;
    }

    @Override // p153l.gse0
    public DispatcherType getDispatcherType() {
        return this._dispatcherType;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public String getHeader(String str) {
        return this._connection.getRequestFields().getStringField(str);
    }

    @Override // javax.servlet.http.HttpServletRequest
    public Enumeration getHeaderNames() {
        return this._connection.getRequestFields().getFieldNames();
    }

    @Override // javax.servlet.http.HttpServletRequest
    public Enumeration getHeaders(String str) {
        Enumeration<String> values = this._connection.getRequestFields().getValues(str);
        return values == null ? Collections.enumeration(Collections.EMPTY_LIST) : values;
    }

    public int getInputState() {
        return this._inputState;
    }

    @Override // p153l.gse0
    public dse0 getInputStream() throws IOException {
        int i = this._inputState;
        if (i == 0 || i == 1) {
            this._inputState = 1;
            return this._connection.getInputStream();
        }
        wtq0.m207906a("READER");
        return null;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public int getIntHeader(String str) {
        return (int) this._connection.getRequestFields().getLongField(str);
    }

    @Override // p153l.gse0
    public String getLocalAddr() {
        EndPoint endPoint = this._endp;
        if (endPoint == null) {
            return null;
        }
        return endPoint.getLocalAddr();
    }

    @Override // p153l.gse0
    public String getLocalName() {
        EndPoint endPoint = this._endp;
        if (endPoint == null) {
            return null;
        }
        if (this._dns) {
            return endPoint.getLocalHost();
        }
        String localAddr = endPoint.getLocalAddr();
        if (localAddr == null || localAddr.indexOf(58) < 0) {
            return localAddr;
        }
        return "[" + localAddr + Constants.AES_SUFFIX;
    }

    @Override // p153l.gse0
    public int getLocalPort() {
        EndPoint endPoint = this._endp;
        if (endPoint == null) {
            return 0;
        }
        return endPoint.getLocalPort();
    }

    @Override // p153l.gse0
    public Locale getLocale() {
        String strTrim;
        Enumeration<String> values = this._connection.getRequestFields().getValues(HttpHeaders.ACCEPT_LANGUAGE, HttpFields.__separators);
        if (values == null || !values.hasMoreElements()) {
            return Locale.getDefault();
        }
        List listQualityList = HttpFields.qualityList(values);
        if (listQualityList.size() == 0) {
            return Locale.getDefault();
        }
        if (listQualityList.size() <= 0) {
            return Locale.getDefault();
        }
        String strValueParameters = HttpFields.valueParameters((String) listQualityList.get(0), null);
        int iIndexOf = strValueParameters.indexOf(45);
        if (iIndexOf > -1) {
            strTrim = strValueParameters.substring(iIndexOf + 1).trim();
            strValueParameters = strValueParameters.substring(0, iIndexOf).trim();
        } else {
            strTrim = "";
        }
        return new Locale(strValueParameters, strTrim);
    }

    @Override // p153l.gse0
    public Enumeration getLocales() {
        String strTrim;
        Enumeration<String> values = this._connection.getRequestFields().getValues(HttpHeaders.ACCEPT_LANGUAGE, HttpFields.__separators);
        if (values == null || !values.hasMoreElements()) {
            return Collections.enumeration(__defaultLocale);
        }
        List listQualityList = HttpFields.qualityList(values);
        if (listQualityList.size() == 0) {
            return Collections.enumeration(__defaultLocale);
        }
        int size = listQualityList.size();
        Object objAdd = null;
        for (int i = 0; i < size; i++) {
            String strValueParameters = HttpFields.valueParameters((String) listQualityList.get(i), null);
            int iIndexOf = strValueParameters.indexOf(45);
            if (iIndexOf > -1) {
                strTrim = strValueParameters.substring(iIndexOf + 1).trim();
                strValueParameters = strValueParameters.substring(0, iIndexOf).trim();
            } else {
                strTrim = "";
            }
            objAdd = LazyList.add(LazyList.ensureSize(objAdd, size), new Locale(strValueParameters, strTrim));
        }
        return LazyList.size(objAdd) == 0 ? Collections.enumeration(__defaultLocale) : Collections.enumeration(LazyList.getList(objAdd));
    }

    @Override // javax.servlet.http.HttpServletRequest
    public String getMethod() {
        return this._method;
    }

    @Override // p153l.gse0
    public String getParameter(String str) {
        if (!this._paramsExtracted) {
            extractParameters();
        }
        return (String) this._parameters.getValue(str, 0);
    }

    @Override // p153l.gse0
    public Map getParameterMap() {
        if (!this._paramsExtracted) {
            extractParameters();
        }
        return Collections.unmodifiableMap(this._parameters.toStringArrayMap());
    }

    @Override // p153l.gse0
    public Enumeration getParameterNames() {
        if (!this._paramsExtracted) {
            extractParameters();
        }
        return Collections.enumeration(this._parameters.keySet());
    }

    @Override // p153l.gse0
    public String[] getParameterValues(String str) {
        if (!this._paramsExtracted) {
            extractParameters();
        }
        List values = this._parameters.getValues(str);
        if (values == null) {
            return null;
        }
        return (String[]) values.toArray(new String[values.size()]);
    }

    public MultiMap<String> getParameters() {
        return this._parameters;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public qg60 getPart(String str) throws ServletException, IOException {
        if (getContentType() == null || !getContentType().startsWith("multipart/form-data")) {
            throw new ServletException("Content-Type != multipart/form-data");
        }
        if (this._multiPartInputStream == null) {
            lu10 lu10Var = (lu10) getAttribute(__MULTIPART_CONFIG_ELEMENT);
            if (lu10Var == null) {
                wtq0.m207906a("No multipart config for servlet");
                return null;
            }
            dse0 inputStream = getInputStream();
            String contentType = getContentType();
            ContextHandler.Context context = this._context;
            MultiPartInputStream multiPartInputStream = new MultiPartInputStream(inputStream, contentType, lu10Var, context != null ? (File) context.getAttribute("javax.servlet.context.tempdir") : null);
            this._multiPartInputStream = multiPartInputStream;
            setAttribute(__MULTIPART_INPUT_STREAM, multiPartInputStream);
            setAttribute(__MULTIPART_CONTEXT, this._context);
            Iterator<qg60> it = this._multiPartInputStream.getParts().iterator();
            while (it.hasNext()) {
                MultiPartInputStream.MultiPart multiPart = (MultiPartInputStream.MultiPart) it.next();
                if (multiPart.getContentDispositionFilename() == null && multiPart.getFile() == null) {
                    String charsetFromContentType = multiPart.getContentType() != null ? MimeTypes.getCharsetFromContentType(new ByteArrayBuffer(multiPart.getContentType())) : null;
                    byte[] bytes = multiPart.getBytes();
                    if (charsetFromContentType == null) {
                        charsetFromContentType = "UTF-8";
                    }
                    String str2 = new String(bytes, charsetFromContentType);
                    getParameter("");
                    getParameters().add(multiPart.getName(), str2);
                }
            }
        }
        return this._multiPartInputStream.getPart(str);
    }

    @Override // javax.servlet.http.HttpServletRequest
    public Collection<qg60> getParts() throws ServletException, IOException {
        if (getContentType() == null || !getContentType().startsWith("multipart/form-data")) {
            throw new ServletException("Content-Type != multipart/form-data");
        }
        if (this._multiPartInputStream == null) {
            lu10 lu10Var = (lu10) getAttribute(__MULTIPART_CONFIG_ELEMENT);
            if (lu10Var == null) {
                wtq0.m207906a("No multipart config for servlet");
                return null;
            }
            dse0 inputStream = getInputStream();
            String contentType = getContentType();
            ContextHandler.Context context = this._context;
            MultiPartInputStream multiPartInputStream = new MultiPartInputStream(inputStream, contentType, lu10Var, context != null ? (File) context.getAttribute("javax.servlet.context.tempdir") : null);
            this._multiPartInputStream = multiPartInputStream;
            setAttribute(__MULTIPART_INPUT_STREAM, multiPartInputStream);
            setAttribute(__MULTIPART_CONTEXT, this._context);
            Iterator<qg60> it = this._multiPartInputStream.getParts().iterator();
            while (it.hasNext()) {
                MultiPartInputStream.MultiPart multiPart = (MultiPartInputStream.MultiPart) it.next();
                if (multiPart.getContentDispositionFilename() == null && multiPart.getFile() == null) {
                    String charsetFromContentType = multiPart.getContentType() != null ? MimeTypes.getCharsetFromContentType(new ByteArrayBuffer(multiPart.getContentType())) : null;
                    byte[] bytes = multiPart.getBytes();
                    if (charsetFromContentType == null) {
                        charsetFromContentType = "UTF-8";
                    }
                    String str = new String(bytes, charsetFromContentType);
                    getParameter("");
                    getParameters().add(multiPart.getName(), str);
                }
            }
        }
        return this._multiPartInputStream.getParts();
    }

    @Override // javax.servlet.http.HttpServletRequest
    public String getPathInfo() {
        return this._pathInfo;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public String getPathTranslated() {
        ContextHandler.Context context;
        String str = this._pathInfo;
        if (str == null || (context = this._context) == null) {
            return null;
        }
        return context.getRealPath(str);
    }

    @Override // p153l.gse0
    public String getProtocol() {
        return this._protocol;
    }

    public String getQueryEncoding() {
        return this._queryEncoding;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public String getQueryString() {
        HttpURI httpURI;
        if (this._queryString == null && (httpURI = this._uri) != null) {
            String str = this._queryEncoding;
            if (str == null) {
                this._queryString = httpURI.getQuery();
            } else {
                this._queryString = httpURI.getQuery(str);
            }
        }
        return this._queryString;
    }

    @Override // p153l.gse0
    public BufferedReader getReader() throws IOException {
        int i = this._inputState;
        if (i != 0 && i != 2) {
            wtq0.m207906a("STREAMED");
            return null;
        }
        if (i == 2) {
            return this._reader;
        }
        String characterEncoding = getCharacterEncoding();
        if (characterEncoding == null) {
            characterEncoding = "ISO-8859-1";
        }
        if (this._reader == null || !characterEncoding.equalsIgnoreCase(this._readerEncoding)) {
            final dse0 inputStream = getInputStream();
            this._readerEncoding = characterEncoding;
            this._reader = new BufferedReader(new InputStreamReader(inputStream, characterEncoding)) { // from class: org.eclipse.jetty.server.Request.1
                @Override // java.io.BufferedReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    inputStream.close();
                }
            };
        }
        this._inputState = 2;
        return this._reader;
    }

    @Override // p153l.gse0
    public String getRealPath(String str) {
        ContextHandler.Context context = this._context;
        if (context == null) {
            return null;
        }
        return context.getRealPath(str);
    }

    @Override // p153l.gse0
    public String getRemoteAddr() {
        String str = this._remoteAddr;
        if (str != null) {
            return str;
        }
        EndPoint endPoint = this._endp;
        if (endPoint == null) {
            return null;
        }
        return endPoint.getRemoteAddr();
    }

    @Override // p153l.gse0
    public String getRemoteHost() {
        if (!this._dns) {
            return getRemoteAddr();
        }
        String str = this._remoteHost;
        if (str != null) {
            return str;
        }
        EndPoint endPoint = this._endp;
        if (endPoint == null) {
            return null;
        }
        return endPoint.getRemoteHost();
    }

    @Override // p153l.gse0
    public int getRemotePort() {
        EndPoint endPoint = this._endp;
        if (endPoint == null) {
            return 0;
        }
        return endPoint.getRemotePort();
    }

    @Override // javax.servlet.http.HttpServletRequest
    public String getRemoteUser() {
        Principal userPrincipal = getUserPrincipal();
        if (userPrincipal == null) {
            return null;
        }
        return userPrincipal.getName();
    }

    @Override // p153l.gse0
    public c2d0 getRequestDispatcher(String str) {
        if (str == null || this._context == null) {
            return null;
        }
        if (!str.startsWith("/")) {
            String strAddPaths = URIUtil.addPaths(this._servletPath, this._pathInfo);
            int iLastIndexOf = strAddPaths.lastIndexOf("/");
            str = URIUtil.addPaths(iLastIndexOf > 1 ? strAddPaths.substring(0, iLastIndexOf + 1) : "/", str);
        }
        return this._context.getRequestDispatcher(str);
    }

    @Override // javax.servlet.http.HttpServletRequest
    public String getRequestURI() {
        HttpURI httpURI;
        if (this._requestURI == null && (httpURI = this._uri) != null) {
            this._requestURI = httpURI.getPathAndParam();
        }
        return this._requestURI;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public StringBuffer getRequestURL() {
        StringBuffer stringBuffer = new StringBuffer(48);
        synchronized (stringBuffer) {
            try {
                String scheme = getScheme();
                int serverPort = getServerPort();
                stringBuffer.append(scheme);
                stringBuffer.append("://");
                stringBuffer.append(getServerName());
                if (this._port > 0 && ((scheme.equalsIgnoreCase("http") && serverPort != 80) || (scheme.equalsIgnoreCase("https") && serverPort != 443))) {
                    stringBuffer.append(':');
                    stringBuffer.append(this._port);
                }
                stringBuffer.append(getRequestURI());
            } catch (Throwable th) {
                throw th;
            }
        }
        return stringBuffer;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public String getRequestedSessionId() {
        return this._requestedSessionId;
    }

    public UserIdentity getResolvedUserIdentity() {
        Authentication authentication = this._authentication;
        if (authentication instanceof Authentication.User) {
            return ((Authentication.User) authentication).getUserIdentity();
        }
        return null;
    }

    public Response getResponse() {
        return this._connection._response;
    }

    public StringBuilder getRootURL() {
        StringBuilder sb = new StringBuilder(48);
        String scheme = getScheme();
        int serverPort = getServerPort();
        sb.append(scheme);
        sb.append("://");
        sb.append(getServerName());
        if (serverPort > 0 && ((scheme.equalsIgnoreCase("http") && serverPort != 80) || (scheme.equalsIgnoreCase("https") && serverPort != 443))) {
            sb.append(':');
            sb.append(serverPort);
        }
        return sb;
    }

    @Override // p153l.gse0
    public String getScheme() {
        return this._scheme;
    }

    @Override // p153l.gse0
    public String getServerName() {
        String str = this._serverName;
        if (str != null) {
            return str;
        }
        HttpURI httpURI = this._uri;
        if (httpURI == null) {
            wtq0.m207906a("No uri");
            return null;
        }
        this._serverName = httpURI.getHost();
        this._port = this._uri.getPort();
        String str2 = this._serverName;
        if (str2 != null) {
            return str2;
        }
        Buffer buffer = this._connection.getRequestFields().get(HttpHeaders.HOST_BUFFER);
        if (buffer == null) {
            if (this._connection != null) {
                this._serverName = getLocalName();
                this._port = getLocalPort();
                String str3 = this._serverName;
                if (str3 != null && !StringUtil.ALL_INTERFACES.equals(str3)) {
                    return this._serverName;
                }
            }
            try {
                this._serverName = InetAddress.getLocalHost().getHostAddress();
            } catch (UnknownHostException e) {
                LOG.ignore(e);
            }
            return this._serverName;
        }
        int iPutIndex = buffer.putIndex();
        while (true) {
            int i = iPutIndex - 1;
            if (iPutIndex <= buffer.getIndex()) {
                break;
            }
            char cPeek = (char) (buffer.peek(i) & 255);
            if (cPeek == ':') {
                this._serverName = BufferUtil.to8859_1_String(buffer.peek(buffer.getIndex(), i - buffer.getIndex()));
                try {
                    try {
                        this._port = BufferUtil.toInt(buffer.peek(iPutIndex, (buffer.putIndex() - i) - 1));
                    } catch (NumberFormatException unused) {
                        AbstractHttpConnection abstractHttpConnection = this._connection;
                        if (abstractHttpConnection != null) {
                            abstractHttpConnection._generator.sendError(400, "Bad Host header", null, true);
                        }
                    }
                    return this._serverName;
                } catch (IOException e2) {
                    iig0.m140070a(e2);
                    return null;
                }
            }
            if (cPeek == ']') {
                break;
            }
            iPutIndex = i;
        }
        if (this._serverName == null || this._port < 0) {
            this._serverName = BufferUtil.to8859_1_String(buffer);
            this._port = 0;
        }
        return this._serverName;
    }

    @Override // p153l.gse0
    public int getServerPort() {
        HttpURI httpURI;
        if (this._port <= 0) {
            if (this._serverName == null) {
                getServerName();
            }
            if (this._port <= 0) {
                if (this._serverName == null || (httpURI = this._uri) == null) {
                    EndPoint endPoint = this._endp;
                    this._port = endPoint == null ? 0 : endPoint.getLocalPort();
                } else {
                    this._port = httpURI.getPort();
                }
            }
        }
        int i = this._port;
        if (i > 0) {
            return i;
        }
        if (getScheme().equalsIgnoreCase("https")) {
            return WebSocket.DEFAULT_WSS_PORT;
        }
        return 80;
    }

    @Override // p153l.gse0
    public ase0 getServletContext() {
        return this._context;
    }

    public String getServletName() {
        UserIdentity.Scope scope = this._scope;
        if (scope != null) {
            return scope.getName();
        }
        return null;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public String getServletPath() {
        if (this._servletPath == null) {
            this._servletPath = "";
        }
        return this._servletPath;
    }

    public lse0 getServletResponse() {
        return this._connection.getResponse();
    }

    @Override // javax.servlet.http.HttpServletRequest
    public hnl getSession(boolean z) {
        hnl hnlVar = this._session;
        if (hnlVar != null) {
            SessionManager sessionManager = this._sessionManager;
            if (sessionManager == null || sessionManager.isValid(hnlVar)) {
                return this._session;
            }
            this._session = null;
        }
        if (!z) {
            return null;
        }
        SessionManager sessionManager2 = this._sessionManager;
        if (sessionManager2 == null) {
            wtq0.m207906a("No SessionManager");
            return null;
        }
        hnl hnlVarNewHttpSession = sessionManager2.newHttpSession(this);
        this._session = hnlVarNewHttpSession;
        HttpCookie sessionCookie = this._sessionManager.getSessionCookie(hnlVarNewHttpSession, getContextPath(), isSecure());
        if (sessionCookie != null) {
            this._connection.getResponse().addCookie(sessionCookie);
        }
        return this._session;
    }

    public SessionManager getSessionManager() {
        return this._sessionManager;
    }

    public long getTimeStamp() {
        return this._timeStamp;
    }

    public Buffer getTimeStampBuffer() {
        if (this._timeStampBuffer == null) {
            long j = this._timeStamp;
            if (j > 0) {
                this._timeStampBuffer = HttpFields.__dateCache.formatBuffer(j);
            }
        }
        return this._timeStampBuffer;
    }

    public HttpURI getUri() {
        return this._uri;
    }

    public UserIdentity getUserIdentity() {
        Authentication authentication = this._authentication;
        if (authentication instanceof Authentication.Deferred) {
            setAuthentication(((Authentication.Deferred) authentication).authenticate(this));
        }
        Authentication authentication2 = this._authentication;
        if (authentication2 instanceof Authentication.User) {
            return ((Authentication.User) authentication2).getUserIdentity();
        }
        return null;
    }

    public UserIdentity.Scope getUserIdentityScope() {
        return this._scope;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public Principal getUserPrincipal() {
        Authentication authentication = this._authentication;
        if (authentication instanceof Authentication.Deferred) {
            setAuthentication(((Authentication.Deferred) authentication).authenticate(this));
        }
        Authentication authentication2 = this._authentication;
        if (authentication2 instanceof Authentication.User) {
            return ((Authentication.User) authentication2).getUserIdentity().getUserPrincipal();
        }
        return null;
    }

    @Override // p153l.gse0
    public boolean isAsyncStarted() {
        return this._async.isAsyncStarted();
    }

    @Override // p153l.gse0
    public boolean isAsyncSupported() {
        return this._asyncSupported;
    }

    public boolean isHandled() {
        return this._handled;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public boolean isRequestedSessionIdFromCookie() {
        return this._requestedSessionId != null && this._requestedSessionIdFromCookie;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public boolean isRequestedSessionIdFromURL() {
        return (this._requestedSessionId == null || this._requestedSessionIdFromCookie) ? false : true;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public boolean isRequestedSessionIdFromUrl() {
        return (this._requestedSessionId == null || this._requestedSessionIdFromCookie) ? false : true;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public boolean isRequestedSessionIdValid() {
        hnl session;
        return (this._requestedSessionId == null || (session = getSession(false)) == null || !this._sessionManager.getSessionIdManager().getClusterId(this._requestedSessionId).equals(this._sessionManager.getClusterId(session))) ? false : true;
    }

    @Override // p153l.gse0
    public boolean isSecure() {
        return this._connection.isConfidential(this);
    }

    @Override // javax.servlet.http.HttpServletRequest
    public boolean isUserInRole(String str) {
        Authentication authentication = this._authentication;
        if (authentication instanceof Authentication.Deferred) {
            setAuthentication(((Authentication.Deferred) authentication).authenticate(this));
        }
        Authentication authentication2 = this._authentication;
        if (authentication2 instanceof Authentication.User) {
            return ((Authentication.User) authentication2).isUserInRole(this._scope, str);
        }
        return false;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public void login(String str, String str2) throws ServletException {
        Authentication authentication = this._authentication;
        if (!(authentication instanceof Authentication.Deferred)) {
            throw new ServletException("Authenticated as " + this._authentication);
        }
        Authentication authenticationLogin = ((Authentication.Deferred) authentication).login(str, str2, this);
        this._authentication = authenticationLogin;
        if (authenticationLogin == null) {
            throw new ServletException();
        }
    }

    @Override // javax.servlet.http.HttpServletRequest
    public void logout() throws ServletException {
        Authentication authentication = this._authentication;
        if (authentication instanceof Authentication.User) {
            ((Authentication.User) authentication).logout();
        }
        this._authentication = Authentication.UNAUTHENTICATED;
    }

    public void mergeQueryString(String str) {
        boolean z;
        MultiMap<String> multiMap = new MultiMap<>();
        UrlEncoded.decodeTo(str, multiMap, "UTF-8");
        if (!this._paramsExtracted) {
            extractParameters();
        }
        MultiMap<String> multiMap2 = this._parameters;
        if (multiMap2 == null || multiMap2.size() <= 0) {
            z = false;
        } else {
            z = false;
            for (Map.Entry<String, Object> entry : this._parameters.entrySet()) {
                String key = entry.getKey();
                if (multiMap.containsKey(key)) {
                    z = true;
                }
                Object value = entry.getValue();
                for (int i = 0; i < LazyList.size(value); i++) {
                    multiMap.add(key, LazyList.get(value, i));
                }
            }
        }
        String str2 = this._queryString;
        if (str2 != null && str2.length() > 0) {
            if (z) {
                StringBuilder sb = new StringBuilder();
                MultiMap multiMap3 = new MultiMap();
                UrlEncoded.decodeTo(this._queryString, multiMap3, getQueryEncoding());
                MultiMap multiMap4 = new MultiMap();
                UrlEncoded.decodeTo(str, multiMap4, "UTF-8");
                for (Map.Entry entry2 : multiMap3.entrySet()) {
                    String str3 = (String) entry2.getKey();
                    if (!multiMap4.containsKey(str3)) {
                        Object value2 = entry2.getValue();
                        for (int i2 = 0; i2 < LazyList.size(value2); i2++) {
                            sb.append("&");
                            sb.append(str3);
                            sb.append("=");
                            sb.append(LazyList.get(value2, i2));
                        }
                    }
                }
                str = str + ((Object) sb);
            } else {
                str = str + "&" + this._queryString;
            }
        }
        setParameters(multiMap);
        setQueryString(str);
    }

    public hnl recoverNewSession(Object obj) {
        Map<Object, hnl> map = this._savedNewSessions;
        if (map == null) {
            return null;
        }
        return map.get(obj);
    }

    public void recycle() {
        if (this._inputState == 2) {
            try {
                int i = this._reader.read();
                while (i != -1) {
                    i = this._reader.read();
                }
            } catch (Exception e) {
                LOG.ignore(e);
                this._reader = null;
            }
        }
        setAuthentication(Authentication.NOT_CHECKED);
        this._async.recycle();
        this._asyncSupported = true;
        this._handled = false;
        if (this._context != null) {
            wtq0.m207906a("Request in context!");
            return;
        }
        if (this._attributes != null) {
            this._attributes.clearAttributes();
        }
        this._characterEncoding = null;
        this._contextPath = null;
        CookieCutter cookieCutter = this._cookies;
        if (cookieCutter != null) {
            cookieCutter.reset();
        }
        this._cookiesExtracted = false;
        this._context = null;
        this._serverName = null;
        this._method = null;
        this._pathInfo = null;
        this._port = 0;
        this._protocol = HttpVersions.HTTP_1_1;
        this._queryEncoding = null;
        this._queryString = null;
        this._requestedSessionId = null;
        this._requestedSessionIdFromCookie = false;
        this._session = null;
        this._sessionManager = null;
        this._requestURI = null;
        this._scope = null;
        this._scheme = "http";
        this._servletPath = null;
        this._timeStamp = 0L;
        this._timeStampBuffer = null;
        this._uri = null;
        MultiMap<String> multiMap = this._baseParameters;
        if (multiMap != null) {
            multiMap.clear();
        }
        this._parameters = null;
        this._paramsExtracted = false;
        this._inputState = 0;
        Map<Object, hnl> map = this._savedNewSessions;
        if (map != null) {
            map.clear();
        }
        this._savedNewSessions = null;
        this._multiPartInputStream = null;
    }

    @Override // p153l.gse0
    public void removeAttribute(String str) {
        Object attribute = this._attributes == null ? null : this._attributes.getAttribute(str);
        if (this._attributes != null) {
            this._attributes.removeAttribute(str);
        }
        if (attribute == null || this._requestAttributeListeners == null) {
            return;
        }
        ServletRequestAttributeEvent servletRequestAttributeEvent = new ServletRequestAttributeEvent(this._context, this, str, attribute);
        int size = LazyList.size(this._requestAttributeListeners);
        for (int i = 0; i < size; i++) {
            hse0 hse0Var = (hse0) LazyList.get(this._requestAttributeListeners, i);
            if (hse0Var != null) {
                hse0Var.m136970e(servletRequestAttributeEvent);
            }
        }
    }

    public void removeEventListener(EventListener eventListener) {
        this._requestAttributeListeners = LazyList.remove(this._requestAttributeListeners, eventListener);
    }

    public void saveNewSession(Object obj, hnl hnlVar) {
        if (this._savedNewSessions == null) {
            this._savedNewSessions = new HashMap();
        }
        this._savedNewSessions.put(obj, hnlVar);
    }

    public void setAsyncSupported(boolean z) {
        this._asyncSupported = z;
    }

    @Override // p153l.gse0
    public void setAttribute(String str, Object obj) {
        Object attribute = this._attributes == null ? null : this._attributes.getAttribute(str);
        if (str.startsWith("org.eclipse.jetty.")) {
            if ("org.eclipse.jetty.server.Request.queryEncoding".equals(str)) {
                setQueryEncoding(obj != null ? obj.toString() : null);
            } else if ("org.eclipse.jetty.server.sendContent".equals(str)) {
                try {
                    ((AbstractHttpConnection.Output) getServletResponse().getOutputStream()).sendContent(obj);
                } catch (IOException e) {
                    iig0.m140070a(e);
                    return;
                }
            } else if ("org.eclipse.jetty.server.ResponseBuffer".equals(str)) {
                try {
                    ByteBuffer byteBuffer = (ByteBuffer) obj;
                    synchronized (byteBuffer) {
                        try {
                            ((AbstractHttpConnection.Output) getServletResponse().getOutputStream()).sendResponse(byteBuffer.isDirect() ? new DirectNIOBuffer(byteBuffer, true) : new IndirectNIOBuffer(byteBuffer, true));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (IOException e2) {
                    iig0.m140070a(e2);
                    return;
                }
            } else if ("org.eclipse.jetty.io.EndPoint.maxIdleTime".equalsIgnoreCase(str)) {
                try {
                    getConnection().getEndPoint().setMaxIdleTime(Integer.valueOf(obj.toString()).intValue());
                } catch (IOException e3) {
                    iig0.m140070a(e3);
                    return;
                }
            }
        }
        if (this._attributes == null) {
            this._attributes = new AttributesMap();
        }
        this._attributes.setAttribute(str, obj);
        if (this._requestAttributeListeners != null) {
            ServletRequestAttributeEvent servletRequestAttributeEvent = new ServletRequestAttributeEvent(this._context, this, str, attribute == null ? obj : attribute);
            int size = LazyList.size(this._requestAttributeListeners);
            for (int i = 0; i < size; i++) {
                hse0 hse0Var = (hse0) LazyList.get(this._requestAttributeListeners, i);
                if (hse0Var != null) {
                    if (attribute == null) {
                        hse0Var.m136969d(servletRequestAttributeEvent);
                    } else if (obj == null) {
                        hse0Var.m136970e(servletRequestAttributeEvent);
                    } else {
                        hse0Var.m136971g(servletRequestAttributeEvent);
                    }
                }
            }
        }
    }

    public void setAttributes(Attributes attributes) {
        this._attributes = attributes;
    }

    public void setAuthentication(Authentication authentication) {
        this._authentication = authentication;
    }

    @Override // p153l.gse0
    public void setCharacterEncoding(String str) throws UnsupportedEncodingException {
        if (this._inputState != 0) {
            return;
        }
        this._characterEncoding = str;
        if (StringUtil.isUTF8(str)) {
            return;
        }
        "".getBytes(str);
    }

    public void setCharacterEncodingUnchecked(String str) {
        this._characterEncoding = str;
    }

    public final void setConnection(AbstractHttpConnection abstractHttpConnection) {
        this._connection = abstractHttpConnection;
        this._async.setConnection(abstractHttpConnection);
        this._endp = abstractHttpConnection.getEndPoint();
        this._dns = abstractHttpConnection.getResolveNames();
    }

    public void setContentType(String str) {
        this._connection.getRequestFields().put(HttpHeaders.CONTENT_TYPE_BUFFER, str);
    }

    public void setContext(ContextHandler.Context context) {
        this._newContext = this._context != context;
        this._context = context;
    }

    public void setContextPath(String str) {
        this._contextPath = str;
    }

    public void setCookies(Cookie[] cookieArr) {
        if (this._cookies == null) {
            this._cookies = new CookieCutter();
        }
        this._cookies.setCookies(cookieArr);
    }

    public void setDispatchTime(long j) {
        this._dispatchTime = j;
    }

    public void setDispatcherType(DispatcherType dispatcherType) {
        this._dispatcherType = dispatcherType;
    }

    public void setHandled(boolean z) {
        this._handled = z;
    }

    public void setMethod(String str) {
        this._method = str;
    }

    public void setParameters(MultiMap<String> multiMap) {
        if (multiMap == null) {
            multiMap = this._baseParameters;
        }
        this._parameters = multiMap;
        if (this._paramsExtracted && multiMap == null) {
            wpg0.m207458a();
        }
    }

    public void setPathInfo(String str) {
        this._pathInfo = str;
    }

    public void setProtocol(String str) {
        this._protocol = str;
    }

    public void setQueryEncoding(String str) {
        this._queryEncoding = str;
        this._queryString = null;
    }

    public void setQueryString(String str) {
        this._queryString = str;
        this._queryEncoding = null;
    }

    public void setRemoteAddr(String str) {
        this._remoteAddr = str;
    }

    public void setRemoteHost(String str) {
        this._remoteHost = str;
    }

    public void setRequestURI(String str) {
        this._requestURI = str;
    }

    public void setRequestedSessionId(String str) {
        this._requestedSessionId = str;
    }

    public void setRequestedSessionIdFromCookie(boolean z) {
        this._requestedSessionIdFromCookie = z;
    }

    public void setScheme(String str) {
        this._scheme = str;
    }

    public void setServerName(String str) {
        this._serverName = str;
    }

    public void setServerPort(int i) {
        this._port = i;
    }

    public void setServletPath(String str) {
        this._servletPath = str;
    }

    public void setSession(hnl hnlVar) {
        this._session = hnlVar;
    }

    public void setSessionManager(SessionManager sessionManager) {
        this._sessionManager = sessionManager;
    }

    public void setTimeStamp(long j) {
        this._timeStamp = j;
    }

    public void setUri(HttpURI httpURI) {
        this._uri = httpURI;
    }

    public void setUserIdentityScope(UserIdentity.Scope scope) {
        this._scope = scope;
    }

    @Override // p153l.gse0
    public o21 startAsync(gse0 gse0Var, lse0 lse0Var) throws IllegalStateException {
        if (this._asyncSupported) {
            this._async.suspend(this._context, gse0Var, lse0Var);
            return this._async;
        }
        wtq0.m207906a("!asyncSupported");
        return null;
    }

    public boolean takeNewContext() {
        boolean z = this._newContext;
        this._newContext = false;
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this._handled ? "[" : "(");
        sb.append(getMethod());
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(this._uri);
        sb.append(this._handled ? "]@" : ")@");
        sb.append(hashCode());
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(super.toString());
        return sb.toString();
    }

    @Override // p153l.gse0
    public o21 startAsync() throws IllegalStateException {
        if (this._asyncSupported) {
            this._async.suspend();
            return this._async;
        }
        wtq0.m207906a("!asyncSupported");
        return null;
    }

    public Request() {
    }

    @Override // javax.servlet.http.HttpServletRequest
    public hnl getSession() {
        return getSession(true);
    }
}
