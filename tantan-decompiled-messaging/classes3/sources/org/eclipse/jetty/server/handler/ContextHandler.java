package org.eclipse.jetty.server.handler;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.EventListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.servlet.DispatcherType;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletException;
import javax.servlet.ServletRequestEvent;
import javax.servlet.SessionTrackingMode;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import l.ake0;
import l.bz00;
import l.cke0;
import l.dke0;
import l.fg3;
import l.ig3;
import l.jii;
import l.kke0;
import l.ohg0;
import l.qkq0;
import l.tje0;
import l.vje0;
import l.wje0;
import l.xje0;
import l.yji;
import l.ypq;
import l.ytc0;
import org.eclipse.jetty.http.HttpException;
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.http.MimeTypes;
import org.eclipse.jetty.p004io.Buffer;
import org.eclipse.jetty.server.AbstractHttpConnection;
import org.eclipse.jetty.server.Dispatcher;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.HandlerContainer;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.Attributes;
import org.eclipse.jetty.util.AttributesMap;
import org.eclipse.jetty.util.LazyList;
import org.eclipse.jetty.util.Loader;
import org.eclipse.jetty.util.StringUtil;
import org.eclipse.jetty.util.TypeUtil;
import org.eclipse.jetty.util.URIUtil;
import org.eclipse.jetty.util.component.AggregateLifeCycle;
import org.eclipse.jetty.util.component.Dumpable;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.eclipse.jetty.util.resource.Resource;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ContextHandler extends ScopedHandler implements Attributes, Server.Graceful {
    public static final String MANAGED_ATTRIBUTES = "org.eclipse.jetty.server.context.ManagedAttributes";
    private static final int __AVAILABLE = 1;
    private static final int __SHUTDOWN = 2;
    private static final int __STOPPED = 0;
    private static final int __UNAVAILABLE = 3;
    private boolean _aliases;
    private boolean _allowNullPathInfo;
    private final AttributesMap _attributes;
    private volatile int _availability;
    private boolean _available;
    private Resource _baseResource;
    private ClassLoader _classLoader;
    private boolean _compactPath;
    private Set<String> _connectors;
    private Object _contextAttributeListeners;
    private final AttributesMap _contextAttributes;
    private Object _contextListeners;
    private String _contextPath;
    private String _displayName;
    private ErrorHandler _errorHandler;
    private EventListener[] _eventListeners;
    private final Map<String, String> _initParams;
    private Map<String, String> _localeEncodingMap;
    private Logger _logger;
    private Map<String, Object> _managedAttributes;
    private int _maxFormContentSize;
    private int _maxFormKeys;
    private MimeTypes _mimeTypes;
    private String[] _protectedTargets;
    private Object _requestAttributeListeners;
    private Object _requestListeners;
    protected Context _scontext;
    private boolean _shutdown;
    private String[] _vhosts;
    private String[] _welcomeFiles;
    private static final Logger LOG = Log.getLogger((Class<?>) ContextHandler.class);
    private static final ThreadLocal<Context> __context = new ThreadLocal<>();

    public ContextHandler() {
        this._contextPath = "/";
        this._maxFormKeys = Integer.getInteger("org.eclipse.jetty.server.Request.maxFormKeys", 1000).intValue();
        this._maxFormContentSize = Integer.getInteger("org.eclipse.jetty.server.Request.maxFormContentSize", 200000).intValue();
        this._compactPath = false;
        this._aliases = false;
        this._shutdown = false;
        this._available = true;
        this._scontext = new Context();
        this._attributes = new AttributesMap();
        this._contextAttributes = new AttributesMap();
        this._initParams = new HashMap();
    }

    public static Context getCurrentContext() {
        return __context.get();
    }

    private String normalizeHostname(String str) {
        if (str == null) {
            return null;
        }
        return str.endsWith(".") ? str.substring(0, str.length() - 1) : str;
    }

    public void addEventListener(EventListener eventListener) {
        setEventListeners((EventListener[]) LazyList.addToArray(getEventListeners(), eventListener, EventListener.class));
    }

    public void addLocaleEncoding(String str, String str2) {
        if (this._localeEncodingMap == null) {
            this._localeEncodingMap = new HashMap();
        }
        this._localeEncodingMap.put(str, str2);
    }

    public void addVirtualHosts(String[] strArr) {
        if (strArr == null) {
            return;
        }
        ArrayList arrayList = this._vhosts != null ? new ArrayList(Arrays.asList(this._vhosts)) : new ArrayList();
        for (String str : strArr) {
            String strNormalizeHostname = normalizeHostname(str);
            if (!arrayList.contains(strNormalizeHostname)) {
                arrayList.add(strNormalizeHostname);
            }
        }
        this._vhosts = (String[]) arrayList.toArray(new String[0]);
    }

    public void callContextDestroyed(xje0 xje0Var, ServletContextEvent servletContextEvent) {
        xje0Var.contextDestroyed(servletContextEvent);
    }

    public void callContextInitialized(xje0 xje0Var, ServletContextEvent servletContextEvent) {
        xje0Var.contextInitialized(servletContextEvent);
        LOG.info("started {}", this);
    }

    public boolean checkContext(String str, Request request, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        String name;
        DispatcherType dispatcherType = request.getDispatcherType();
        int i = this._availability;
        if (i != 0 && i != 2) {
            if (i != 3) {
                if (DispatcherType.REQUEST.equals(dispatcherType) && request.isHandled()) {
                    return false;
                }
                String[] strArr = this._vhosts;
                if (strArr != null && strArr.length > 0) {
                    String strNormalizeHostname = normalizeHostname(request.getServerName());
                    boolean zRegionMatches = false;
                    int i2 = 0;
                    while (!zRegionMatches) {
                        String[] strArr2 = this._vhosts;
                        if (i2 >= strArr2.length) {
                            break;
                        }
                        String str2 = strArr2[i2];
                        if (str2 != null) {
                            zRegionMatches = str2.startsWith("*.") ? str2.regionMatches(true, 2, strNormalizeHostname, strNormalizeHostname.indexOf(".") + 1, str2.length() - 2) : str2.equalsIgnoreCase(strNormalizeHostname);
                        }
                        i2++;
                    }
                    if (!zRegionMatches) {
                        return false;
                    }
                }
                Set<String> set = this._connectors;
                if (set != null && set.size() > 0 && ((name = AbstractHttpConnection.getCurrentConnection().getConnector().getName()) == null || !this._connectors.contains(name))) {
                    return false;
                }
                if (this._contextPath.length() > 1) {
                    if (!str.startsWith(this._contextPath)) {
                        return false;
                    }
                    if (str.length() > this._contextPath.length() && str.charAt(this._contextPath.length()) != '/') {
                        return false;
                    }
                    if (!this._allowNullPathInfo && this._contextPath.length() == str.length()) {
                        request.setHandled(true);
                        if (request.getQueryString() != null) {
                            httpServletResponse.sendRedirect(URIUtil.addPaths(request.getRequestURI(), "/") + "?" + request.getQueryString());
                        } else {
                            httpServletResponse.sendRedirect(URIUtil.addPaths(request.getRequestURI(), "/"));
                        }
                        return false;
                    }
                }
                return true;
            }
            request.setHandled(true);
            httpServletResponse.sendError(HttpStatus.SERVICE_UNAVAILABLE_503);
        }
        return false;
    }

    public void checkManagedAttribute(String str, Object obj) {
        Map<String, Object> map = this._managedAttributes;
        if (map == null || !map.containsKey(str)) {
            return;
        }
        setManagedAttribute(str, obj);
    }

    @Override // org.eclipse.jetty.util.Attributes
    public void clearAttributes() {
        Enumeration<String> attributeNames = this._attributes.getAttributeNames();
        while (attributeNames.hasMoreElements()) {
            checkManagedAttribute(attributeNames.nextElement(), null);
        }
        this._attributes.clearAttributes();
    }

    @Override // org.eclipse.jetty.server.handler.ScopedHandler
    public void doHandle(String str, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        DispatcherType dispatcherType = request.getDispatcherType();
        boolean zTakeNewContext = request.takeNewContext();
        try {
            if (zTakeNewContext) {
                try {
                    Object obj = this._requestAttributeListeners;
                    if (obj != null) {
                        int size = LazyList.size(obj);
                        for (int i = 0; i < size; i++) {
                            request.addEventListener((EventListener) LazyList.get(this._requestAttributeListeners, i));
                        }
                    }
                    Object obj2 = this._requestListeners;
                    if (obj2 != null) {
                        int size2 = LazyList.size(obj2);
                        ServletRequestEvent servletRequestEvent = new ServletRequestEvent(this._scontext, httpServletRequest);
                        for (int i2 = 0; i2 < size2; i2++) {
                            ((dke0) LazyList.get(this._requestListeners, i2)).requestInitialized(servletRequestEvent);
                        }
                    }
                } catch (HttpException e) {
                    LOG.debug(e);
                    request.setHandled(true);
                    httpServletResponse.sendError(e.getStatus(), e.getReason());
                    if (!zTakeNewContext) {
                        return;
                    }
                    if (this._requestListeners != null) {
                        ServletRequestEvent servletRequestEvent2 = new ServletRequestEvent(this._scontext, httpServletRequest);
                        int size3 = LazyList.size(this._requestListeners);
                        while (true) {
                            int i3 = size3 - 1;
                            if (size3 <= 0) {
                                break;
                            }
                            ((dke0) LazyList.get(this._requestListeners, i3)).requestDestroyed(servletRequestEvent2);
                            size3 = i3;
                        }
                    }
                    Object obj3 = this._requestAttributeListeners;
                    if (obj3 == null) {
                        return;
                    }
                    int size4 = LazyList.size(obj3);
                    while (true) {
                        int i4 = size4 - 1;
                        if (size4 <= 0) {
                            return;
                        }
                        request.removeEventListener((EventListener) LazyList.get(this._requestAttributeListeners, i4));
                        size4 = i4;
                    }
                }
            }
            if (DispatcherType.REQUEST.equals(dispatcherType) && isProtectedTarget(str)) {
                throw new HttpException(HttpStatus.NOT_FOUND_404);
            }
            if (never()) {
                nextHandle(str, request, httpServletRequest, httpServletResponse);
            } else {
                ScopedHandler scopedHandler = this._nextScope;
                if (scopedHandler == null || scopedHandler != this._handler) {
                    Handler handler = this._handler;
                    if (handler != null) {
                        handler.handle(str, request, httpServletRequest, httpServletResponse);
                    }
                } else {
                    scopedHandler.doHandle(str, request, httpServletRequest, httpServletResponse);
                }
            }
            if (!zTakeNewContext) {
                return;
            }
            if (this._requestListeners != null) {
                ServletRequestEvent servletRequestEvent3 = new ServletRequestEvent(this._scontext, httpServletRequest);
                int size5 = LazyList.size(this._requestListeners);
                while (true) {
                    int i5 = size5 - 1;
                    if (size5 <= 0) {
                        break;
                    }
                    ((dke0) LazyList.get(this._requestListeners, i5)).requestDestroyed(servletRequestEvent3);
                    size5 = i5;
                }
            }
            Object obj4 = this._requestAttributeListeners;
            if (obj4 == null) {
                return;
            }
            int size6 = LazyList.size(obj4);
            while (true) {
                int i6 = size6 - 1;
                if (size6 <= 0) {
                    return;
                }
                request.removeEventListener((EventListener) LazyList.get(this._requestAttributeListeners, i6));
                size6 = i6;
            }
        } catch (Throwable th) {
            if (zTakeNewContext) {
                if (this._requestListeners != null) {
                    ServletRequestEvent servletRequestEvent4 = new ServletRequestEvent(this._scontext, httpServletRequest);
                    int size7 = LazyList.size(this._requestListeners);
                    while (true) {
                        int i7 = size7 - 1;
                        if (size7 <= 0) {
                            break;
                        }
                        ((dke0) LazyList.get(this._requestListeners, i7)).requestDestroyed(servletRequestEvent4);
                        size7 = i7;
                    }
                }
                Object obj5 = this._requestAttributeListeners;
                if (obj5 != null) {
                    int size8 = LazyList.size(obj5);
                    while (true) {
                        int i8 = size8 - 1;
                        if (size8 <= 0) {
                            break;
                        }
                        request.removeEventListener((EventListener) LazyList.get(this._requestAttributeListeners, i8));
                        size8 = i8;
                    }
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0 A[Catch: all -> 0x00d6, TryCatch #2 {all -> 0x00d6, blocks: (B:40:0x00b3, B:42:0x00c0, B:44:0x00c6, B:46:0x00cf, B:52:0x00e2, B:51:0x00dc, B:53:0x00e8, B:55:0x00ee, B:56:0x0103, B:58:0x0109, B:59:0x010d, B:61:0x0111, B:62:0x0115, B:64:0x0119, B:65:0x011d), top: B:92:0x00b3 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cf A[Catch: all -> 0x00d6, TryCatch #2 {all -> 0x00d6, blocks: (B:40:0x00b3, B:42:0x00c0, B:44:0x00c6, B:46:0x00cf, B:52:0x00e2, B:51:0x00dc, B:53:0x00e8, B:55:0x00ee, B:56:0x0103, B:58:0x0109, B:59:0x010d, B:61:0x0111, B:62:0x0115, B:64:0x0119, B:65:0x011d), top: B:92:0x00b3 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00dc A[Catch: all -> 0x00d6, TryCatch #2 {all -> 0x00d6, blocks: (B:40:0x00b3, B:42:0x00c0, B:44:0x00c6, B:46:0x00cf, B:52:0x00e2, B:51:0x00dc, B:53:0x00e8, B:55:0x00ee, B:56:0x0103, B:58:0x0109, B:59:0x010d, B:61:0x0111, B:62:0x0115, B:64:0x0119, B:65:0x011d), top: B:92:0x00b3 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ee A[Catch: all -> 0x00d6, TryCatch #2 {all -> 0x00d6, blocks: (B:40:0x00b3, B:42:0x00c0, B:44:0x00c6, B:46:0x00cf, B:52:0x00e2, B:51:0x00dc, B:53:0x00e8, B:55:0x00ee, B:56:0x0103, B:58:0x0109, B:59:0x010d, B:61:0x0111, B:62:0x0115, B:64:0x0119, B:65:0x011d), top: B:92:0x00b3 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0109 A[Catch: all -> 0x00d6, TryCatch #2 {all -> 0x00d6, blocks: (B:40:0x00b3, B:42:0x00c0, B:44:0x00c6, B:46:0x00cf, B:52:0x00e2, B:51:0x00dc, B:53:0x00e8, B:55:0x00ee, B:56:0x0103, B:58:0x0109, B:59:0x010d, B:61:0x0111, B:62:0x0115, B:64:0x0119, B:65:0x011d), top: B:92:0x00b3 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x010d A[Catch: all -> 0x00d6, TryCatch #2 {all -> 0x00d6, blocks: (B:40:0x00b3, B:42:0x00c0, B:44:0x00c6, B:46:0x00cf, B:52:0x00e2, B:51:0x00dc, B:53:0x00e8, B:55:0x00ee, B:56:0x0103, B:58:0x0109, B:59:0x010d, B:61:0x0111, B:62:0x0115, B:64:0x0119, B:65:0x011d), top: B:92:0x00b3 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0111 A[Catch: all -> 0x00d6, TryCatch #2 {all -> 0x00d6, blocks: (B:40:0x00b3, B:42:0x00c0, B:44:0x00c6, B:46:0x00cf, B:52:0x00e2, B:51:0x00dc, B:53:0x00e8, B:55:0x00ee, B:56:0x0103, B:58:0x0109, B:59:0x010d, B:61:0x0111, B:62:0x0115, B:64:0x0119, B:65:0x011d), top: B:92:0x00b3 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0115 A[Catch: all -> 0x00d6, TryCatch #2 {all -> 0x00d6, blocks: (B:40:0x00b3, B:42:0x00c0, B:44:0x00c6, B:46:0x00cf, B:52:0x00e2, B:51:0x00dc, B:53:0x00e8, B:55:0x00ee, B:56:0x0103, B:58:0x0109, B:59:0x010d, B:61:0x0111, B:62:0x0115, B:64:0x0119, B:65:0x011d), top: B:92:0x00b3 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0119 A[Catch: all -> 0x00d6, TryCatch #2 {all -> 0x00d6, blocks: (B:40:0x00b3, B:42:0x00c0, B:44:0x00c6, B:46:0x00cf, B:52:0x00e2, B:51:0x00dc, B:53:0x00e8, B:55:0x00ee, B:56:0x0103, B:58:0x0109, B:59:0x010d, B:61:0x0111, B:62:0x0115, B:64:0x0119, B:65:0x011d), top: B:92:0x00b3 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x011d A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #2 {all -> 0x00d6, blocks: (B:40:0x00b3, B:42:0x00c0, B:44:0x00c6, B:46:0x00cf, B:52:0x00e2, B:51:0x00dc, B:53:0x00e8, B:55:0x00ee, B:56:0x0103, B:58:0x0109, B:59:0x010d, B:61:0x0111, B:62:0x0115, B:64:0x0119, B:65:0x011d), top: B:92:0x00b3 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0124  */
    /* JADX WARN: Code duplicated, block: B:70:0x0128  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    @Override // org.eclipse.jetty.server.handler.ScopedHandler
    public void doScope(String str, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Throwable {
        String strCompactPath;
        String str2;
        Thread threadCurrentThread;
        ClassLoader contextClassLoader;
        String str3;
        String str4;
        String servletPath;
        String contextPath;
        String pathInfo;
        ThreadLocal<Context> threadLocal;
        ScopedHandler scopedHandler;
        ScopedHandler scopedHandler2;
        Logger logger = LOG;
        if (logger.isDebugEnabled()) {
            logger.debug("scope {}|{}|{} @ {}", request.getContextPath(), request.getServletPath(), request.getPathInfo(), this);
        }
        DispatcherType dispatcherType = request.getDispatcherType();
        Context context = request.getContext();
        try {
            try {
                try {
                    try {
                        try {
                            if (context != this._scontext) {
                                if (DispatcherType.REQUEST.equals(dispatcherType) || DispatcherType.ASYNC.equals(dispatcherType)) {
                                    strCompactPath = this._compactPath ? URIUtil.compactPath(str) : str;
                                    if (!checkContext(strCompactPath, request, httpServletResponse)) {
                                        return;
                                    }
                                    int length = strCompactPath.length();
                                    int length2 = this._contextPath.length();
                                    String str5 = this._contextPath;
                                    if (length <= length2) {
                                        if (str5.length() == 1) {
                                            strCompactPath = "/";
                                        } else {
                                            strCompactPath = "/";
                                            str2 = null;
                                        }
                                        if (this._classLoader != null) {
                                            threadCurrentThread = Thread.currentThread();
                                            contextClassLoader = threadCurrentThread.getContextClassLoader();
                                            threadCurrentThread.setContextClassLoader(this._classLoader);
                                        }
                                        contextPath = request.getContextPath();
                                        servletPath = request.getServletPath();
                                        pathInfo = request.getPathInfo();
                                        request.setContext(this._scontext);
                                        threadLocal = __context;
                                        threadLocal.set(this._scontext);
                                        if (!DispatcherType.INCLUDE.equals(dispatcherType) && strCompactPath.startsWith("/")) {
                                            if (this._contextPath.length() == 1) {
                                                request.setContextPath("");
                                            } else {
                                                request.setContextPath(this._contextPath);
                                            }
                                            request.setServletPath(null);
                                            request.setPathInfo(str2);
                                        }
                                        if (logger.isDebugEnabled()) {
                                            logger.debug("context={}|{}|{} @ {}", request.getContextPath(), request.getServletPath(), request.getPathInfo(), this);
                                        }
                                        if (never()) {
                                            nextScope(strCompactPath, request, httpServletRequest, httpServletResponse);
                                        } else {
                                            scopedHandler = this._nextScope;
                                            if (scopedHandler != null) {
                                                scopedHandler.doScope(strCompactPath, request, httpServletRequest, httpServletResponse);
                                            } else {
                                                scopedHandler2 = this._outerScope;
                                                if (scopedHandler2 != null) {
                                                    scopedHandler2.doHandle(strCompactPath, request, httpServletRequest, httpServletResponse);
                                                } else {
                                                    doHandle(strCompactPath, request, httpServletRequest, httpServletResponse);
                                                }
                                            }
                                        }
                                        if (context != this._scontext) {
                                            if (this._classLoader != null) {
                                                threadCurrentThread.setContextClassLoader(contextClassLoader);
                                            }
                                            request.setContext(context);
                                            threadLocal.set(context);
                                            request.setContextPath(contextPath);
                                            request.setServletPath(servletPath);
                                            request.setPathInfo(pathInfo);
                                            return;
                                        }
                                        return;
                                    }
                                    if (str5.length() > 1) {
                                        strCompactPath = strCompactPath.substring(this._contextPath.length());
                                    }
                                } else {
                                    strCompactPath = str;
                                }
                                str2 = strCompactPath;
                                if (this._classLoader != null) {
                                    threadCurrentThread = Thread.currentThread();
                                    contextClassLoader = threadCurrentThread.getContextClassLoader();
                                    threadCurrentThread.setContextClassLoader(this._classLoader);
                                }
                                contextPath = request.getContextPath();
                                servletPath = request.getServletPath();
                                pathInfo = request.getPathInfo();
                                request.setContext(this._scontext);
                                threadLocal = __context;
                                threadLocal.set(this._scontext);
                                if (!DispatcherType.INCLUDE.equals(dispatcherType)) {
                                    if (this._contextPath.length() == 1) {
                                        request.setContextPath("");
                                    } else {
                                        request.setContextPath(this._contextPath);
                                    }
                                    request.setServletPath(null);
                                    request.setPathInfo(str2);
                                }
                                if (logger.isDebugEnabled()) {
                                    logger.debug("context={}|{}|{} @ {}", request.getContextPath(), request.getServletPath(), request.getPathInfo(), this);
                                }
                                if (never()) {
                                    nextScope(strCompactPath, request, httpServletRequest, httpServletResponse);
                                } else {
                                    scopedHandler = this._nextScope;
                                    if (scopedHandler != null) {
                                        scopedHandler.doScope(strCompactPath, request, httpServletRequest, httpServletResponse);
                                    } else {
                                        scopedHandler2 = this._outerScope;
                                        if (scopedHandler2 != null) {
                                            scopedHandler2.doHandle(strCompactPath, request, httpServletRequest, httpServletResponse);
                                        } else {
                                            doHandle(strCompactPath, request, httpServletRequest, httpServletResponse);
                                        }
                                    }
                                }
                                if (context != this._scontext) {
                                    if (this._classLoader != null) {
                                        threadCurrentThread.setContextClassLoader(contextClassLoader);
                                    }
                                    request.setContext(context);
                                    threadLocal.set(context);
                                    request.setContextPath(contextPath);
                                    request.setServletPath(servletPath);
                                    request.setPathInfo(pathInfo);
                                    return;
                                }
                                return;
                            }
                            strCompactPath = str;
                            str2 = strCompactPath;
                            threadLocal.set(this._scontext);
                            if (!DispatcherType.INCLUDE.equals(dispatcherType)) {
                                if (this._contextPath.length() == 1) {
                                    request.setContextPath("");
                                } else {
                                    request.setContextPath(this._contextPath);
                                }
                                request.setServletPath(null);
                                request.setPathInfo(str2);
                            }
                            if (logger.isDebugEnabled()) {
                                logger.debug("context={}|{}|{} @ {}", request.getContextPath(), request.getServletPath(), request.getPathInfo(), this);
                            }
                            if (never()) {
                                nextScope(strCompactPath, request, httpServletRequest, httpServletResponse);
                            } else {
                                scopedHandler = this._nextScope;
                                if (scopedHandler != null) {
                                    scopedHandler.doScope(strCompactPath, request, httpServletRequest, httpServletResponse);
                                } else {
                                    scopedHandler2 = this._outerScope;
                                    if (scopedHandler2 != null) {
                                        scopedHandler2.doHandle(strCompactPath, request, httpServletRequest, httpServletResponse);
                                    } else {
                                        doHandle(strCompactPath, request, httpServletRequest, httpServletResponse);
                                    }
                                }
                            }
                            if (context != this._scontext) {
                                if (this._classLoader != null) {
                                    threadCurrentThread.setContextClassLoader(contextClassLoader);
                                }
                                request.setContext(context);
                                threadLocal.set(context);
                                request.setContextPath(contextPath);
                                request.setServletPath(servletPath);
                                request.setPathInfo(pathInfo);
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            str3 = pathInfo;
                            str4 = contextPath;
                            if (context != this._scontext) {
                                if (this._classLoader != null) {
                                    threadCurrentThread.setContextClassLoader(contextClassLoader);
                                }
                                request.setContext(context);
                                __context.set(context);
                                request.setContextPath(str4);
                                request.setServletPath(servletPath);
                                request.setPathInfo(str3);
                            }
                            throw th;
                        }
                        request.setContext(this._scontext);
                        threadLocal = __context;
                    } catch (Throwable th2) {
                        th = th2;
                        str3 = pathInfo;
                    }
                    pathInfo = request.getPathInfo();
                } catch (Throwable th3) {
                    th = th3;
                    str3 = null;
                }
                servletPath = request.getServletPath();
            } catch (Throwable th4) {
                th = th4;
                str3 = null;
                servletPath = null;
            }
            contextPath = request.getContextPath();
        } catch (Throwable th5) {
            th = th5;
            str3 = null;
            str4 = null;
            servletPath = null;
        }
        threadCurrentThread = null;
        contextClassLoader = null;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    @Override // org.eclipse.jetty.server.handler.ScopedHandler, org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        Thread threadCurrentThread;
        ClassLoader contextClassLoader;
        int i;
        this._availability = 0;
        if (this._contextPath == null) {
            qkq0.a("Null contextPath");
            return;
        }
        this._logger = Log.getLogger(getDisplayName() == null ? getContextPath() : getDisplayName());
        Context context = null;
        try {
            if (this._classLoader != null) {
                threadCurrentThread = Thread.currentThread();
                try {
                    contextClassLoader = threadCurrentThread.getContextClassLoader();
                    try {
                        threadCurrentThread.setContextClassLoader(this._classLoader);
                    } catch (Throwable th) {
                        th = th;
                        __context.set(context);
                        if (this._classLoader != null) {
                            threadCurrentThread.setContextClassLoader(contextClassLoader);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    contextClassLoader = null;
                    __context.set(context);
                    if (this._classLoader != null) {
                        threadCurrentThread.setContextClassLoader(contextClassLoader);
                    }
                    throw th;
                }
            } else {
                threadCurrentThread = null;
                contextClassLoader = null;
            }
            if (this._mimeTypes == null) {
                this._mimeTypes = new MimeTypes();
            }
            ThreadLocal<Context> threadLocal = __context;
            Context context2 = threadLocal.get();
            try {
                threadLocal.set(this._scontext);
                startContext();
                synchronized (this) {
                    try {
                        if (this._shutdown) {
                            i = 2;
                        } else {
                            i = this._available ? 1 : 3;
                        }
                        this._availability = i;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                threadLocal.set(context2);
                if (this._classLoader != null) {
                    threadCurrentThread.setContextClassLoader(contextClassLoader);
                }
            } catch (Throwable th4) {
                th = th4;
                context = context2;
                __context.set(context);
                if (this._classLoader != null) {
                    threadCurrentThread.setContextClassLoader(contextClassLoader);
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            threadCurrentThread = null;
            contextClassLoader = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    @Override // org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStop() throws Exception {
        ClassLoader contextClassLoader;
        Throwable th;
        Thread threadCurrentThread;
        this._availability = 0;
        ThreadLocal<Context> threadLocal = __context;
        Context context = threadLocal.get();
        threadLocal.set(this._scontext);
        try {
            if (this._classLoader != null) {
                threadCurrentThread = Thread.currentThread();
                try {
                    contextClassLoader = threadCurrentThread.getContextClassLoader();
                    try {
                        threadCurrentThread.setContextClassLoader(this._classLoader);
                    } catch (Throwable th2) {
                        th = th2;
                        LOG.info("stopped {}", this);
                        __context.set(context);
                        if (this._classLoader != null) {
                            threadCurrentThread.setContextClassLoader(contextClassLoader);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    contextClassLoader = null;
                    th = th3;
                    LOG.info("stopped {}", this);
                    __context.set(context);
                    if (this._classLoader != null) {
                        threadCurrentThread.setContextClassLoader(contextClassLoader);
                    }
                    throw th;
                }
            } else {
                threadCurrentThread = null;
                contextClassLoader = null;
            }
            super.doStop();
            if (this._contextListeners != null) {
                ServletContextEvent servletContextEvent = new ServletContextEvent(this._scontext);
                int size = LazyList.size(this._contextListeners);
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    ((xje0) LazyList.get(this._contextListeners, i)).contextDestroyed(servletContextEvent);
                    size = i;
                }
            }
            ErrorHandler errorHandler = this._errorHandler;
            if (errorHandler != null) {
                errorHandler.stop();
            }
            Enumeration attributeNames = this._scontext.getAttributeNames();
            while (attributeNames.hasMoreElements()) {
                checkManagedAttribute((String) attributeNames.nextElement(), null);
            }
            LOG.info("stopped {}", this);
            __context.set(context);
            if (this._classLoader != null) {
                threadCurrentThread.setContextClassLoader(contextClassLoader);
            }
            this._contextAttributes.clearAttributes();
        } catch (Throwable th4) {
            contextClassLoader = null;
            th = th4;
            threadCurrentThread = null;
        }
    }

    @Override // org.eclipse.jetty.server.handler.AbstractHandlerContainer, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.Dumpable
    public void dump(Appendable appendable, String str) throws IOException {
        dumpThis(appendable);
        AggregateLifeCycle.dump(appendable, str, Collections.singletonList(new CLDump(getClassLoader())), TypeUtil.asList(getHandlers()), getBeans(), this._initParams.entrySet(), this._attributes.getAttributeEntrySet(), this._contextAttributes.getAttributeEntrySet());
    }

    public boolean getAllowNullPathInfo() {
        return this._allowNullPathInfo;
    }

    @Override // org.eclipse.jetty.util.Attributes
    public Object getAttribute(String str) {
        return this._attributes.getAttribute(str);
    }

    @Override // org.eclipse.jetty.util.Attributes
    public Enumeration getAttributeNames() {
        return AttributesMap.getAttributeNamesCopy(this._attributes);
    }

    public Attributes getAttributes() {
        return this._attributes;
    }

    public Resource getBaseResource() {
        Resource resource = this._baseResource;
        if (resource == null) {
            return null;
        }
        return resource;
    }

    public ClassLoader getClassLoader() {
        return this._classLoader;
    }

    public String getClassPath() {
        ClassLoader classLoader = this._classLoader;
        if (classLoader == null || !(classLoader instanceof URLClassLoader)) {
            return null;
        }
        URL[] uRLs = ((URLClassLoader) classLoader).getURLs();
        StringBuilder sb = new StringBuilder();
        for (URL url : uRLs) {
            try {
                File file = newResource(url).getFile();
                if (file != null && file.exists()) {
                    if (sb.length() > 0) {
                        sb.append(File.pathSeparatorChar);
                    }
                    sb.append(file.getAbsolutePath());
                }
            } catch (IOException e) {
                LOG.debug(e);
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    public String[] getConnectorNames() {
        Set<String> set = this._connectors;
        if (set == null || set.size() == 0) {
            return null;
        }
        Set<String> set2 = this._connectors;
        return (String[]) set2.toArray(new String[set2.size()]);
    }

    public String getContextPath() {
        return this._contextPath;
    }

    public String getDisplayName() {
        return this._displayName;
    }

    public ErrorHandler getErrorHandler() {
        return this._errorHandler;
    }

    public EventListener[] getEventListeners() {
        return this._eventListeners;
    }

    public String getInitParameter(String str) {
        return this._initParams.get(str);
    }

    public Enumeration getInitParameterNames() {
        return Collections.enumeration(this._initParams.keySet());
    }

    public Map<String, String> getInitParams() {
        return this._initParams;
    }

    public String getLocaleEncoding(Locale locale) {
        Map<String, String> map = this._localeEncodingMap;
        if (map == null) {
            return null;
        }
        String str = map.get(locale.toString());
        return str == null ? this._localeEncodingMap.get(locale.getLanguage()) : str;
    }

    public Logger getLogger() {
        return this._logger;
    }

    public int getMaxFormContentSize() {
        return this._maxFormContentSize;
    }

    public int getMaxFormKeys() {
        return this._maxFormKeys;
    }

    public MimeTypes getMimeTypes() {
        if (this._mimeTypes == null) {
            this._mimeTypes = new MimeTypes();
        }
        return this._mimeTypes;
    }

    public String[] getProtectedTargets() {
        String[] strArr = this._protectedTargets;
        if (strArr == null) {
            return null;
        }
        String[] strArr2 = new String[strArr.length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        return strArr2;
    }

    public Resource getResource(String str) throws MalformedURLException {
        if (str == null || !str.startsWith("/")) {
            throw new MalformedURLException(str);
        }
        if (this._baseResource == null) {
            return null;
        }
        try {
            String strCanonicalPath = URIUtil.canonicalPath(str);
            Resource resourceAddPath = this._baseResource.addPath(strCanonicalPath);
            if (this._aliases || resourceAddPath.getAlias() == null) {
                return resourceAddPath;
            }
            if (resourceAddPath.exists()) {
                LOG.warn("Aliased resource: " + resourceAddPath + "~=" + resourceAddPath.getAlias(), new Object[0]);
            } else {
                if (strCanonicalPath.endsWith("/") && resourceAddPath.getAlias().toString().endsWith(strCanonicalPath)) {
                    return resourceAddPath;
                }
                Logger logger = LOG;
                if (logger.isDebugEnabled()) {
                    logger.debug("Aliased resource: " + resourceAddPath + "~=" + resourceAddPath.getAlias(), new Object[0]);
                }
            }
            return null;
        } catch (Exception e) {
            LOG.ignore(e);
            return null;
        }
    }

    public String getResourceBase() {
        Resource resource = this._baseResource;
        if (resource == null) {
            return null;
        }
        return resource.toString();
    }

    public Set<String> getResourcePaths(String str) {
        try {
            String strCanonicalPath = URIUtil.canonicalPath(str);
            Resource resource = getResource(strCanonicalPath);
            if (resource != null && resource.exists()) {
                if (!strCanonicalPath.endsWith("/")) {
                    strCanonicalPath = strCanonicalPath.concat("/");
                }
                String[] list = resource.list();
                if (list != null) {
                    HashSet hashSet = new HashSet();
                    for (String str2 : list) {
                        hashSet.add(strCanonicalPath + str2);
                    }
                    return hashSet;
                }
            }
        } catch (Exception e) {
            LOG.ignore(e);
        }
        return Collections.EMPTY_SET;
    }

    public Context getServletContext() {
        return this._scontext;
    }

    public String[] getVirtualHosts() {
        return this._vhosts;
    }

    public String[] getWelcomeFiles() {
        return this._welcomeFiles;
    }

    public void handle(Runnable runnable) throws Throwable {
        ClassLoader classLoader;
        Thread threadCurrentThread;
        Context context = null;
        contextClassLoader = null;
        ClassLoader contextClassLoader = null;
        try {
            ThreadLocal<Context> threadLocal = __context;
            Context context2 = threadLocal.get();
            try {
                threadLocal.set(this._scontext);
                if (this._classLoader != null) {
                    threadCurrentThread = Thread.currentThread();
                    try {
                        contextClassLoader = threadCurrentThread.getContextClassLoader();
                        threadCurrentThread.setContextClassLoader(this._classLoader);
                    } catch (Throwable th) {
                        th = th;
                        classLoader = contextClassLoader;
                        context = context2;
                        __context.set(context);
                        if (classLoader != null) {
                            threadCurrentThread.setContextClassLoader(classLoader);
                        }
                        throw th;
                    }
                } else {
                    threadCurrentThread = null;
                }
                runnable.run();
                threadLocal.set(context2);
                if (contextClassLoader != null) {
                    threadCurrentThread.setContextClassLoader(contextClassLoader);
                }
            } catch (Throwable th2) {
                th = th2;
                classLoader = null;
                threadCurrentThread = null;
            }
        } catch (Throwable th3) {
            th = th3;
            classLoader = null;
            threadCurrentThread = null;
        }
    }

    public boolean isAliases() {
        return this._aliases;
    }

    public boolean isAvailable() {
        boolean z;
        synchronized (this) {
            z = this._available;
        }
        return z;
    }

    public boolean isCompactPath() {
        return this._compactPath;
    }

    public boolean isProtectedTarget(String str) {
        boolean z = false;
        if (str != null && this._protectedTargets != null) {
            while (str.startsWith("//")) {
                str = URIUtil.compactPath(str);
            }
            int i = 0;
            while (!z) {
                String[] strArr = this._protectedTargets;
                if (i >= strArr.length) {
                    break;
                }
                int i2 = i + 1;
                boolean zStartsWithIgnoreCase = StringUtil.startsWithIgnoreCase(str, strArr[i]);
                i = i2;
                z = zStartsWithIgnoreCase;
            }
        }
        return z;
    }

    public boolean isShutdown() {
        boolean z;
        synchronized (this) {
            z = !this._shutdown;
        }
        return z;
    }

    public synchronized Class<?> loadClass(String str) throws ClassNotFoundException {
        if (str == null) {
            return null;
        }
        ClassLoader classLoader = this._classLoader;
        if (classLoader == null) {
            return Loader.loadClass(getClass(), str);
        }
        return classLoader.loadClass(str);
    }

    public Resource newResource(URL url) throws IOException {
        return Resource.newResource(url);
    }

    @Override // org.eclipse.jetty.util.Attributes
    public void removeAttribute(String str) {
        checkManagedAttribute(str, null);
        this._attributes.removeAttribute(str);
    }

    public void removeVirtualHosts(String[] strArr) {
        String[] strArr2;
        if (strArr == null || (strArr2 = this._vhosts) == null || strArr2.length == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(this._vhosts));
        for (String str : strArr) {
            String strNormalizeHostname = normalizeHostname(str);
            if (arrayList.contains(strNormalizeHostname)) {
                arrayList.remove(strNormalizeHostname);
            }
        }
        if (arrayList.isEmpty()) {
            this._vhosts = null;
        } else {
            this._vhosts = (String[]) arrayList.toArray(new String[0]);
        }
    }

    public void restrictEventListener(EventListener eventListener) {
    }

    public void setAliases(boolean z) {
        this._aliases = z;
    }

    public void setAllowNullPathInfo(boolean z) {
        this._allowNullPathInfo = z;
    }

    @Override // org.eclipse.jetty.util.Attributes
    public void setAttribute(String str, Object obj) {
        checkManagedAttribute(str, obj);
        this._attributes.setAttribute(str, obj);
    }

    public void setAttributes(Attributes attributes) {
        this._attributes.clearAttributes();
        this._attributes.addAll(attributes);
        Enumeration<String> attributeNames = this._attributes.getAttributeNames();
        while (attributeNames.hasMoreElements()) {
            String strNextElement = attributeNames.nextElement();
            checkManagedAttribute(strNextElement, attributes.getAttribute(strNextElement));
        }
    }

    public void setAvailable(boolean z) {
        int i;
        synchronized (this) {
            try {
                this._available = z;
                if (!isRunning()) {
                    i = 0;
                } else if (this._shutdown) {
                    i = 2;
                } else {
                    i = this._available ? 1 : 3;
                }
                this._availability = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setBaseResource(Resource resource) {
        this._baseResource = resource;
    }

    public void setClassLoader(ClassLoader classLoader) {
        this._classLoader = classLoader;
    }

    public void setCompactPath(boolean z) {
        this._compactPath = z;
    }

    public void setConnectorNames(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            this._connectors = null;
        } else {
            this._connectors = new HashSet(Arrays.asList(strArr));
        }
    }

    public void setContextPath(String str) {
        if (str != null && str.length() > 1 && str.endsWith("/")) {
            ig3.a("ends with /");
            return;
        }
        this._contextPath = str;
        if (getServer() != null) {
            if (getServer().isStarting() || getServer().isStarted()) {
                Handler[] childHandlersByClass = getServer().getChildHandlersByClass(ContextHandlerCollection.class);
                for (int i = 0; childHandlersByClass != null && i < childHandlersByClass.length; i++) {
                    ((ContextHandlerCollection) childHandlersByClass[i]).mapContexts();
                }
            }
        }
    }

    public void setDisplayName(String str) {
        this._displayName = str;
    }

    public void setErrorHandler(ErrorHandler errorHandler) {
        ContextHandler contextHandler;
        ErrorHandler errorHandler2;
        if (errorHandler != null) {
            errorHandler.setServer(getServer());
        }
        if (getServer() != null) {
            contextHandler = this;
            errorHandler2 = errorHandler;
            getServer().getContainer().update((Object) contextHandler, (Object) this._errorHandler, (Object) errorHandler2, "errorHandler", true);
        } else {
            contextHandler = this;
            errorHandler2 = errorHandler;
        }
        contextHandler._errorHandler = errorHandler2;
    }

    public void setEventListeners(EventListener[] eventListenerArr) {
        this._contextListeners = null;
        this._contextAttributeListeners = null;
        this._requestListeners = null;
        this._requestAttributeListeners = null;
        this._eventListeners = eventListenerArr;
        for (int i = 0; eventListenerArr != null && i < eventListenerArr.length; i++) {
            EventListener eventListener = this._eventListeners[i];
            if (eventListener instanceof xje0) {
                this._contextListeners = LazyList.add(this._contextListeners, eventListener);
            }
            if (eventListener instanceof wje0) {
                this._contextAttributeListeners = LazyList.add(this._contextAttributeListeners, eventListener);
            }
            if (eventListener instanceof dke0) {
                this._requestListeners = LazyList.add(this._requestListeners, eventListener);
            }
            if (eventListener instanceof cke0) {
                this._requestAttributeListeners = LazyList.add(this._requestAttributeListeners, eventListener);
            }
        }
    }

    public String setInitParameter(String str, String str2) {
        return this._initParams.put(str, str2);
    }

    public void setLogger(Logger logger) {
        this._logger = logger;
    }

    public void setManagedAttribute(String str, Object obj) {
        getServer().getContainer().update((Object) this, this._managedAttributes.put(str, obj), obj, str, true);
    }

    public void setMaxFormContentSize(int i) {
        this._maxFormContentSize = i;
    }

    public void setMaxFormKeys(int i) {
        this._maxFormKeys = i;
    }

    public void setMimeTypes(MimeTypes mimeTypes) {
        this._mimeTypes = mimeTypes;
    }

    public void setProtectedTargets(String[] strArr) {
        if (strArr == null) {
            this._protectedTargets = null;
            return;
        }
        String[] strArr2 = new String[strArr.length];
        this._protectedTargets = strArr2;
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
    }

    public void setResourceBase(String str) {
        try {
            setBaseResource(newResource(str));
        } catch (Exception e) {
            Logger logger = LOG;
            logger.warn(e.toString(), new Object[0]);
            logger.debug(e);
            ig3.a(str);
        }
    }

    @Override // org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.server.Handler
    public void setServer(Server server) {
        ContextHandler contextHandler;
        if (this._errorHandler == null) {
            super.setServer(server);
            return;
        }
        Server server2 = getServer();
        if (server2 == null || server2 == server) {
            contextHandler = this;
        } else {
            contextHandler = this;
            server2.getContainer().update((Object) contextHandler, (Object) this._errorHandler, (Object) null, "error", true);
        }
        super.setServer(server);
        if (server != null && server != server2) {
            server.getContainer().update((Object) contextHandler, (Object) null, (Object) contextHandler._errorHandler, "error", true);
        }
        contextHandler._errorHandler.setServer(server);
    }

    @Override // org.eclipse.jetty.server.Server.Graceful
    public void setShutdown(boolean z) {
        int i;
        synchronized (this) {
            try {
                this._shutdown = z;
                if (!isRunning()) {
                    i = 0;
                } else if (this._shutdown) {
                    i = 2;
                } else {
                    i = this._available ? 1 : 3;
                }
                this._availability = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setVirtualHosts(String[] strArr) {
        if (strArr == null) {
            this._vhosts = strArr;
            return;
        }
        this._vhosts = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            this._vhosts[i] = normalizeHostname(strArr[i]);
        }
    }

    public void setWelcomeFiles(String[] strArr) {
        this._welcomeFiles = strArr;
    }

    public void startContext() throws Exception {
        String str = this._initParams.get(MANAGED_ATTRIBUTES);
        if (str != null) {
            this._managedAttributes = new HashMap();
            for (String str2 : str.split(",")) {
                this._managedAttributes.put(str2, null);
            }
            Enumeration attributeNames = this._scontext.getAttributeNames();
            while (attributeNames.hasMoreElements()) {
                String str3 = (String) attributeNames.nextElement();
                checkManagedAttribute(str3, this._scontext.getAttribute(str3));
            }
        }
        super.doStart();
        ErrorHandler errorHandler = this._errorHandler;
        if (errorHandler != null) {
            errorHandler.start();
        }
        if (this._contextListeners != null) {
            ServletContextEvent servletContextEvent = new ServletContextEvent(this._scontext);
            for (int i = 0; i < LazyList.size(this._contextListeners); i++) {
                callContextInitialized((xje0) LazyList.get(this._contextListeners, i), servletContextEvent);
            }
        }
    }

    public String toString() {
        String name;
        String[] virtualHosts = getVirtualHosts();
        StringBuilder sb = new StringBuilder();
        Package r2 = getClass().getPackage();
        if (r2 != null && (name = r2.getName()) != null && name.length() > 0) {
            for (String str : name.split("\\.")) {
                sb.append(str.charAt(0));
                sb.append('.');
            }
        }
        sb.append(getClass().getSimpleName());
        sb.append('{');
        sb.append(getContextPath());
        sb.append(',');
        sb.append(getBaseResource());
        if (virtualHosts != null && virtualHosts.length > 0) {
            sb.append(',');
            sb.append(virtualHosts[0]);
        }
        sb.append('}');
        return sb.toString();
    }

    public Resource newResource(String str) throws IOException {
        return Resource.newResource(str);
    }

    public class Context implements vje0 {
        private static final String __unimplmented = "Unimplemented - use org.eclipse.jetty.servlet.ServletContextHandler";
        protected int _majorVersion = 3;
        protected int _minorVersion = 0;
        protected boolean _enabled = true;

        public Context() {
        }

        public yji.a addFilter(String str, Class<? extends jii> cls) {
            ContextHandler.LOG.warn(__unimplmented, new Object[0]);
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void addListener(String str) {
            if (!this._enabled) {
                bz00.a();
                return;
            }
            try {
                addListener((Class<? extends EventListener>) (ContextHandler.this._classLoader == null ? Loader.loadClass(ContextHandler.class, str) : ContextHandler.this._classLoader.loadClass(str)));
            } catch (ClassNotFoundException e) {
                fg3.a(e);
            }
        }

        public ake0.a addServlet(String str, Class<? extends tje0> cls) {
            ContextHandler.LOG.warn(__unimplmented, new Object[0]);
            return null;
        }

        public <T extends jii> T createFilter(Class<T> cls) throws ServletException {
            ContextHandler.LOG.warn(__unimplmented, new Object[0]);
            return null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: javax.servlet.ServletException */
        public <T extends EventListener> T createListener(Class<T> cls) throws ServletException {
            try {
                return cls.newInstance();
            } catch (IllegalAccessException e) {
                throw new ServletException(e);
            } catch (InstantiationException e2) {
                throw new ServletException(e2);
            }
        }

        public <T extends tje0> T createServlet(Class<T> cls) throws ServletException {
            ContextHandler.LOG.warn(__unimplmented, new Object[0]);
            return null;
        }

        public void declareRoles(String... strArr) {
            if (!ContextHandler.this.isStarting()) {
                ohg0.a();
            } else {
                if (this._enabled) {
                    return;
                }
                bz00.a();
            }
        }

        public synchronized Object getAttribute(String str) {
            Object attribute;
            attribute = ContextHandler.this.getAttribute(str);
            if (attribute == null && ContextHandler.this._contextAttributes != null) {
                attribute = ContextHandler.this._contextAttributes.getAttribute(str);
            }
            return attribute;
        }

        public synchronized Enumeration getAttributeNames() {
            HashSet hashSet;
            try {
                hashSet = new HashSet();
                if (ContextHandler.this._contextAttributes != null) {
                    Enumeration<String> attributeNames = ContextHandler.this._contextAttributes.getAttributeNames();
                    while (attributeNames.hasMoreElements()) {
                        hashSet.add(attributeNames.nextElement());
                    }
                }
                Enumeration<String> attributeNames2 = ContextHandler.this._attributes.getAttributeNames();
                while (attributeNames2.hasMoreElements()) {
                    hashSet.add(attributeNames2.nextElement());
                }
            } catch (Throwable th) {
                throw th;
            }
            return Collections.enumeration(hashSet);
        }

        public ClassLoader getClassLoader() {
            AccessController.checkPermission(new RuntimePermission("getClassLoader"));
            return ContextHandler.this._classLoader;
        }

        /* JADX WARN: Code duplicated, block: B:38:0x009d  */
        /* JADX WARN: Code duplicated, block: B:42:0x00b1 A[PHI: r4 r8
          0x00b1: PHI (r4v6 int) = (r4v2 int), (r4v2 int), (r4v2 int), (r4v9 int), (r4v2 int) binds: [B:6:0x0020, B:21:0x005b, B:23:0x0062, B:86:0x00b1, B:15:0x0044] A[DONT_GENERATE, DONT_INLINE]
          0x00b1: PHI (r8v8 java.lang.String) = 
          (r8v1 java.lang.String)
          (r8v1 java.lang.String)
          (r8v1 java.lang.String)
          (r8v12 java.lang.String)
          (r8v1 java.lang.String)
         binds: [B:6:0x0020, B:21:0x005b, B:23:0x0062, B:86:0x00b1, B:15:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:89:0x00a3 A[SYNTHETIC] */
        public vje0 getContext(String str) {
            int i;
            int i2;
            Context context = this;
            ArrayList arrayList = new ArrayList();
            Handler[] childHandlersByClass = ContextHandler.this.getServer().getChildHandlersByClass(ContextHandler.class);
            int length = childHandlersByClass.length;
            int i3 = 0;
            String str2 = null;
            while (i3 < length) {
                Handler handler = childHandlersByClass[i3];
                if (handler == null) {
                    i = length;
                } else {
                    ContextHandler contextHandler = (ContextHandler) handler;
                    String contextPath = contextHandler.getContextPath();
                    if (!str.equals(contextPath) && ((!str.startsWith(contextPath) || str.charAt(contextPath.length()) != '/') && !"/".equals(contextPath))) {
                        i = length;
                    } else if (ContextHandler.this.getVirtualHosts() == null || ContextHandler.this.getVirtualHosts().length <= 0) {
                        i = length;
                        if (str2 == null || contextPath.length() > str2.length()) {
                            arrayList.clear();
                            str2 = contextPath;
                        }
                        if (str2.equals(contextPath)) {
                            arrayList.add(contextHandler);
                        }
                    } else {
                        if (contextHandler.getVirtualHosts() != null && contextHandler.getVirtualHosts().length > 0) {
                            for (String str3 : ContextHandler.this.getVirtualHosts()) {
                                String[] virtualHosts = contextHandler.getVirtualHosts();
                                int length2 = virtualHosts.length;
                                int i4 = 0;
                                while (i4 < length2) {
                                    if (str3.equals(virtualHosts[i4])) {
                                        if (str2 != null) {
                                            i2 = length;
                                            if (contextPath.length() > str2.length()) {
                                            }
                                            if (str2.equals(contextPath)) {
                                                arrayList.add(contextHandler);
                                            }
                                        } else {
                                            i2 = length;
                                        }
                                        arrayList.clear();
                                        str2 = contextPath;
                                        if (str2.equals(contextPath)) {
                                            arrayList.add(contextHandler);
                                        }
                                    } else {
                                        i2 = length;
                                    }
                                    i4++;
                                    length = i2;
                                }
                            }
                        }
                        i = length;
                    }
                }
                i3++;
                context = this;
                length = i;
            }
            if (arrayList.size() > 0) {
                return ((ContextHandler) arrayList.get(0))._scontext;
            }
            String str4 = null;
            for (Handler handler2 : childHandlersByClass) {
                if (handler2 != null) {
                    ContextHandler contextHandler2 = (ContextHandler) handler2;
                    String contextPath2 = contextHandler2.getContextPath();
                    if (str.equals(contextPath2) || ((str.startsWith(contextPath2) && str.charAt(contextPath2.length()) == '/') || "/".equals(contextPath2))) {
                        if (str4 == null || contextPath2.length() > str4.length()) {
                            arrayList.clear();
                            str4 = contextPath2;
                        }
                        if (str4.equals(contextPath2)) {
                            arrayList.add(contextHandler2);
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                return ((ContextHandler) arrayList.get(0))._scontext;
            }
            return null;
        }

        public ContextHandler getContextHandler() {
            return ContextHandler.this;
        }

        public String getContextPath() {
            return (ContextHandler.this._contextPath == null || !ContextHandler.this._contextPath.equals("/")) ? ContextHandler.this._contextPath : "";
        }

        public Set<SessionTrackingMode> getDefaultSessionTrackingModes() {
            ContextHandler.LOG.warn(__unimplmented, new Object[0]);
            return null;
        }

        public int getEffectiveMajorVersion() {
            return this._majorVersion;
        }

        public int getEffectiveMinorVersion() {
            return this._minorVersion;
        }

        public Set<SessionTrackingMode> getEffectiveSessionTrackingModes() {
            ContextHandler.LOG.warn(__unimplmented, new Object[0]);
            return null;
        }

        public yji getFilterRegistration(String str) {
            ContextHandler.LOG.warn(__unimplmented, new Object[0]);
            return null;
        }

        public Map<String, ? extends yji> getFilterRegistrations() {
            ContextHandler.LOG.warn(__unimplmented, new Object[0]);
            return null;
        }

        public String getInitParameter(String str) {
            return ContextHandler.this.getInitParameter(str);
        }

        public Enumeration getInitParameterNames() {
            return ContextHandler.this.getInitParameterNames();
        }

        public ypq getJspConfigDescriptor() {
            ContextHandler.LOG.warn(__unimplmented, new Object[0]);
            return null;
        }

        public int getMajorVersion() {
            return 3;
        }

        public String getMimeType(String str) {
            Buffer mimeByExtension;
            if (ContextHandler.this._mimeTypes == null || (mimeByExtension = ContextHandler.this._mimeTypes.getMimeByExtension(str)) == null) {
                return null;
            }
            return mimeByExtension.toString();
        }

        public int getMinorVersion() {
            return 0;
        }

        public ytc0 getNamedDispatcher(String str) {
            return null;
        }

        public String getRealPath(String str) {
            File file;
            if (str == null) {
                return null;
            }
            if (str.length() == 0) {
                str = "/";
            } else if (str.charAt(0) != '/') {
                str = "/".concat(str);
            }
            try {
                Resource resource = ContextHandler.this.getResource(str);
                if (resource != null && (file = resource.getFile()) != null) {
                    return file.getCanonicalPath();
                }
            } catch (Exception e) {
                ContextHandler.LOG.ignore(e);
            }
            return null;
        }

        public ytc0 getRequestDispatcher(String str) {
            String strSubstring;
            if (str == null || !str.startsWith("/")) {
                return null;
            }
            try {
                int iIndexOf = str.indexOf(63);
                if (iIndexOf > 0) {
                    strSubstring = str.substring(iIndexOf + 1);
                    str = str.substring(0, iIndexOf);
                } else {
                    strSubstring = null;
                }
                return new Dispatcher(ContextHandler.this, URIUtil.addPaths(getContextPath(), str), URIUtil.canonicalPath(URIUtil.decodePath(str)), strSubstring);
            } catch (Exception e) {
                ContextHandler.LOG.ignore(e);
                return null;
            }
        }

        public URL getResource(String str) throws MalformedURLException {
            Resource resource = ContextHandler.this.getResource(str);
            if (resource == null || !resource.exists()) {
                return null;
            }
            return resource.getURL();
        }

        public InputStream getResourceAsStream(String str) {
            try {
                URL resource = getResource(str);
                if (resource == null) {
                    return null;
                }
                return Resource.newResource(resource).getInputStream();
            } catch (Exception e) {
                ContextHandler.LOG.ignore(e);
                return null;
            }
        }

        public Set getResourcePaths(String str) {
            return ContextHandler.this.getResourcePaths(str);
        }

        public String getServerInfo() {
            return "jetty/" + Server.getVersion();
        }

        @Deprecated
        public tje0 getServlet(String str) throws ServletException {
            return null;
        }

        public String getServletContextName() {
            String displayName = ContextHandler.this.getDisplayName();
            return displayName == null ? ContextHandler.this.getContextPath() : displayName;
        }

        @Deprecated
        public Enumeration getServletNames() {
            return Collections.enumeration(Collections.EMPTY_LIST);
        }

        public ake0 getServletRegistration(String str) {
            ContextHandler.LOG.warn(__unimplmented, new Object[0]);
            return null;
        }

        public Map<String, ? extends ake0> getServletRegistrations() {
            ContextHandler.LOG.warn(__unimplmented, new Object[0]);
            return null;
        }

        @Deprecated
        public Enumeration getServlets() {
            return Collections.enumeration(Collections.EMPTY_LIST);
        }

        public kke0 getSessionCookieConfig() {
            ContextHandler.LOG.warn(__unimplmented, new Object[0]);
            return null;
        }

        public boolean isEnabled() {
            return this._enabled;
        }

        public void log(String str) {
            ContextHandler.this._logger.info(str, new Object[0]);
        }

        public synchronized void removeAttribute(String str) {
            ContextHandler.this.checkManagedAttribute(str, null);
            AttributesMap attributesMap = ContextHandler.this._contextAttributes;
            ContextHandler contextHandler = ContextHandler.this;
            if (attributesMap == null) {
                contextHandler._attributes.removeAttribute(str);
                return;
            }
            Object attribute = contextHandler._contextAttributes.getAttribute(str);
            ContextHandler.this._contextAttributes.removeAttribute(str);
            if (attribute != null && ContextHandler.this._contextAttributeListeners != null) {
                ServletContextAttributeEvent servletContextAttributeEvent = new ServletContextAttributeEvent(ContextHandler.this._scontext, str, attribute);
                for (int i = 0; i < LazyList.size(ContextHandler.this._contextAttributeListeners); i++) {
                    ((wje0) LazyList.get(ContextHandler.this._contextAttributeListeners, i)).i(servletContextAttributeEvent);
                }
            }
        }

        public synchronized void setAttribute(String str, Object obj) {
            try {
                ContextHandler.this.checkManagedAttribute(str, obj);
                Object attribute = ContextHandler.this._contextAttributes.getAttribute(str);
                ContextHandler contextHandler = ContextHandler.this;
                if (obj == null) {
                    contextHandler._contextAttributes.removeAttribute(str);
                } else {
                    contextHandler._contextAttributes.setAttribute(str, obj);
                }
                if (ContextHandler.this._contextAttributeListeners != null) {
                    ServletContextAttributeEvent servletContextAttributeEvent = new ServletContextAttributeEvent(ContextHandler.this._scontext, str, attribute == null ? obj : attribute);
                    for (int i = 0; i < LazyList.size(ContextHandler.this._contextAttributeListeners); i++) {
                        wje0 wje0Var = (wje0) LazyList.get(ContextHandler.this._contextAttributeListeners, i);
                        if (attribute == null) {
                            wje0Var.b(servletContextAttributeEvent);
                        } else if (obj == null) {
                            wje0Var.i(servletContextAttributeEvent);
                        } else {
                            wje0Var.f(servletContextAttributeEvent);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public void setEffectiveMajorVersion(int i) {
            this._majorVersion = i;
        }

        public void setEffectiveMinorVersion(int i) {
            this._minorVersion = i;
        }

        public void setEnabled(boolean z) {
            this._enabled = z;
        }

        public boolean setInitParameter(String str, String str2) {
            if (ContextHandler.this.getInitParameter(str) != null) {
                return false;
            }
            ContextHandler.this.getInitParams().put(str, str2);
            return true;
        }

        public void setSessionTrackingModes(Set<SessionTrackingMode> set) {
            ContextHandler.LOG.warn(__unimplmented, new Object[0]);
        }

        public String toString() {
            return "ServletContext@" + ContextHandler.this.toString();
        }

        public void log(Exception exc, String str) {
            ContextHandler.this._logger.warn(str, exc);
        }

        public yji.a addFilter(String str, jii jiiVar) {
            ContextHandler.LOG.warn(__unimplmented, new Object[0]);
            return null;
        }

        public ake0.a addServlet(String str, tje0 tje0Var) {
            ContextHandler.LOG.warn(__unimplmented, new Object[0]);
            return null;
        }

        public void log(String str, Throwable th) {
            ContextHandler.this._logger.warn(str, th);
        }

        public yji.a addFilter(String str, String str2) {
            ContextHandler.LOG.warn(__unimplmented, new Object[0]);
            return null;
        }

        public ake0.a addServlet(String str, String str2) {
            ContextHandler.LOG.warn(__unimplmented, new Object[0]);
            return null;
        }

        public void setJspConfigDescriptor(ypq ypqVar) {
        }

        public <T extends EventListener> void addListener(T t) {
            if (this._enabled) {
                ContextHandler.this.addEventListener(t);
            } else {
                bz00.a();
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: javax.servlet.ServletException */
        public void addListener(Class<? extends EventListener> cls) {
            if (this._enabled) {
                try {
                    EventListener eventListenerCreateListener = createListener(cls);
                    ContextHandler.this.addEventListener(eventListenerCreateListener);
                    ContextHandler.this.restrictEventListener(eventListenerCreateListener);
                    return;
                } catch (ServletException e) {
                    fg3.a(e);
                    return;
                }
            }
            bz00.a();
        }
    }

    public String getLocaleEncoding(String str) {
        Map<String, String> map = this._localeEncodingMap;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public ContextHandler(Context context) {
        this._contextPath = "/";
        this._maxFormKeys = Integer.getInteger("org.eclipse.jetty.server.Request.maxFormKeys", 1000).intValue();
        this._maxFormContentSize = Integer.getInteger("org.eclipse.jetty.server.Request.maxFormContentSize", 200000).intValue();
        this._compactPath = false;
        this._aliases = false;
        this._shutdown = false;
        this._available = true;
        this._scontext = context;
        this._attributes = new AttributesMap();
        this._contextAttributes = new AttributesMap();
        this._initParams = new HashMap();
    }

    public static class CLDump implements Dumpable {
        final ClassLoader _loader;

        public CLDump(ClassLoader classLoader) {
            this._loader = classLoader;
        }

        @Override // org.eclipse.jetty.util.component.Dumpable
        public void dump(Appendable appendable, String str) throws IOException {
            ClassLoader parent;
            Object cLDump;
            appendable.append(String.valueOf(this._loader)).append("\n");
            ClassLoader classLoader = this._loader;
            if (classLoader == null || (parent = classLoader.getParent()) == null) {
                return;
            }
            if (!(parent instanceof Dumpable)) {
                cLDump = parent;
                cLDump = new CLDump(parent);
            }
            cLDump = parent;
            ClassLoader classLoader2 = this._loader;
            if (classLoader2 instanceof URLClassLoader) {
                AggregateLifeCycle.dump(appendable, str, TypeUtil.asList(((URLClassLoader) classLoader2).getURLs()), Collections.singleton(cLDump));
            } else {
                AggregateLifeCycle.dump(appendable, str, Collections.singleton(cLDump));
            }
        }

        @Override // org.eclipse.jetty.util.component.Dumpable
        public String dump() {
            return AggregateLifeCycle.dump(this);
        }
    }

    public ContextHandler(String str) {
        this();
        setContextPath(str);
    }

    public ContextHandler(HandlerContainer handlerContainer, String str) {
        this();
        setContextPath(str);
        if (handlerContainer instanceof HandlerWrapper) {
            ((HandlerWrapper) handlerContainer).setHandler(this);
        } else if (handlerContainer instanceof HandlerCollection) {
            ((HandlerCollection) handlerContainer).addHandler(this);
        }
    }
}
