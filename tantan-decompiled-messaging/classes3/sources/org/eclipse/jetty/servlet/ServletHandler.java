package org.eclipse.jetty.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import javax.servlet.DispatcherType;
import javax.servlet.ServletException;
import javax.servlet.UnavailableException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import l.aag0;
import l.ake0;
import l.bke0;
import l.gke0;
import l.ike0;
import l.jii;
import l.qii;
import l.tje0;
import l.vje0;
import org.eclipse.jetty.continuation.ContinuationThrowable;
import org.eclipse.jetty.http.HttpException;
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.http.PathMap;
import org.eclipse.jetty.p004io.EofException;
import org.eclipse.jetty.p004io.RuntimeIOException;
import org.eclipse.jetty.security.IdentityService;
import org.eclipse.jetty.security.SecurityHandler;
import org.eclipse.jetty.server.AbstractHttpConnection;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServletRequestHttpWrapper;
import org.eclipse.jetty.server.ServletResponseHttpWrapper;
import org.eclipse.jetty.server.UserIdentity;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.ScopedHandler;
import org.eclipse.jetty.util.LazyList;
import org.eclipse.jetty.util.MultiException;
import org.eclipse.jetty.util.MultiMap;
import org.eclipse.jetty.util.TypeUtil;
import org.eclipse.jetty.util.URIUtil;
import org.eclipse.jetty.util.component.AggregateLifeCycle;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ServletHandler extends ScopedHandler {
    private static final Logger LOG = Log.getLogger((Class<?>) ServletHandler.class);
    public static final String __DEFAULT_SERVLET = "default";
    private ServletContextHandler _contextHandler;
    private FilterMapping[] _filterMappings;
    private MultiMap<String> _filterNameMappings;
    private List<FilterMapping> _filterPathMappings;
    private IdentityService _identityService;
    private ContextHandler.Context _servletContext;
    private ServletMapping[] _servletMappings;
    private PathMap _servletPathMap;
    private FilterHolder[] _filters = new FilterHolder[0];
    private boolean _filterChainsCached = true;
    private int _maxFilterChainsCacheSize = 512;
    private boolean _startWithUnavailable = true;
    private ServletHolder[] _servlets = new ServletHolder[0];
    private final Map<String, FilterHolder> _filterNameMap = new HashMap();
    private final Map<String, ServletHolder> _servletNameMap = new HashMap();
    protected final ConcurrentMap<String, qii>[] _chainCache = new ConcurrentMap[31];
    protected final Queue<String>[] _chainLRU = new Queue[31];

    public class CachedChain implements qii {
        FilterHolder _filterHolder;
        CachedChain _next;
        ServletHolder _servletHolder;

        public CachedChain(Object obj, ServletHolder servletHolder) {
            if (LazyList.size(obj) <= 0) {
                this._servletHolder = servletHolder;
            } else {
                this._filterHolder = (FilterHolder) LazyList.get(obj, 0);
                this._next = ServletHandler.this.new CachedChain(LazyList.remove(obj, 0), servletHolder);
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: javax.servlet.ServletException */
        /* JADX INFO: Thrown type has an unknown type hierarchy: javax.servlet.UnavailableException */
        public void doFilter(bke0 bke0Var, gke0 gke0Var) throws UnavailableException, ServletException, IOException {
            Request request = bke0Var instanceof Request ? (Request) bke0Var : AbstractHttpConnection.getCurrentConnection().getRequest();
            if (this._filterHolder == null) {
                HttpServletRequest httpServletRequest = (HttpServletRequest) bke0Var;
                if (this._servletHolder != null) {
                    if (ServletHandler.LOG.isDebugEnabled()) {
                        ServletHandler.LOG.debug("call servlet " + this._servletHolder, new Object[0]);
                    }
                    this._servletHolder.handle(request, bke0Var, gke0Var);
                    return;
                }
                Handler handler = ServletHandler.this.getHandler();
                ServletHandler servletHandler = ServletHandler.this;
                if (handler == null) {
                    servletHandler.notFound(httpServletRequest, (HttpServletResponse) gke0Var);
                    return;
                } else {
                    servletHandler.nextHandle(URIUtil.addPaths(httpServletRequest.getServletPath(), httpServletRequest.getPathInfo()), request, httpServletRequest, (HttpServletResponse) gke0Var);
                    return;
                }
            }
            if (ServletHandler.LOG.isDebugEnabled()) {
                ServletHandler.LOG.debug("call filter " + this._filterHolder, new Object[0]);
            }
            jii filter = this._filterHolder.getFilter();
            if (this._filterHolder.isAsyncSupported()) {
                filter.doFilter(bke0Var, gke0Var, this._next);
                return;
            }
            if (!request.isAsyncSupported()) {
                filter.doFilter(bke0Var, gke0Var, this._next);
                return;
            }
            try {
                request.setAsyncSupported(false);
                filter.doFilter(bke0Var, gke0Var, this._next);
            } finally {
                request.setAsyncSupported(true);
            }
        }

        public String toString() {
            if (this._filterHolder == null) {
                ServletHolder servletHolder = this._servletHolder;
                return servletHolder != null ? servletHolder.toString() : "null";
            }
            return this._filterHolder + "->" + this._next.toString();
        }
    }

    public class Chain implements qii {
        final Request _baseRequest;
        final Object _chain;
        int _filter = 0;
        final ServletHolder _servletHolder;

        public Chain(Request request, Object obj, ServletHolder servletHolder) {
            this._baseRequest = request;
            this._chain = obj;
            this._servletHolder = servletHolder;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: javax.servlet.ServletException */
        /* JADX INFO: Thrown type has an unknown type hierarchy: javax.servlet.UnavailableException */
        public void doFilter(bke0 bke0Var, gke0 gke0Var) throws UnavailableException, ServletException, IOException {
            if (ServletHandler.LOG.isDebugEnabled()) {
                ServletHandler.LOG.debug("doFilter " + this._filter, new Object[0]);
            }
            if (this._filter >= LazyList.size(this._chain)) {
                HttpServletRequest httpServletRequest = (HttpServletRequest) bke0Var;
                if (this._servletHolder == null) {
                    if (ServletHandler.this.getHandler() == null) {
                        ServletHandler.this.notFound(httpServletRequest, (HttpServletResponse) gke0Var);
                        return;
                    } else {
                        ServletHandler.this.nextHandle(URIUtil.addPaths(httpServletRequest.getServletPath(), httpServletRequest.getPathInfo()), bke0Var instanceof Request ? (Request) bke0Var : AbstractHttpConnection.getCurrentConnection().getRequest(), httpServletRequest, (HttpServletResponse) gke0Var);
                        return;
                    }
                }
                if (ServletHandler.LOG.isDebugEnabled()) {
                    ServletHandler.LOG.debug("call servlet " + this._servletHolder, new Object[0]);
                }
                this._servletHolder.handle(this._baseRequest, bke0Var, gke0Var);
                return;
            }
            Object obj = this._chain;
            int i = this._filter;
            this._filter = i + 1;
            FilterHolder filterHolder = (FilterHolder) LazyList.get(obj, i);
            if (ServletHandler.LOG.isDebugEnabled()) {
                ServletHandler.LOG.debug("call filter " + filterHolder, new Object[0]);
            }
            jii filter = filterHolder.getFilter();
            if (filterHolder.isAsyncSupported() || !this._baseRequest.isAsyncSupported()) {
                filter.doFilter(bke0Var, gke0Var, this);
                return;
            }
            try {
                this._baseRequest.setAsyncSupported(false);
                filter.doFilter(bke0Var, gke0Var, this);
            } finally {
                this._baseRequest.setAsyncSupported(true);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < LazyList.size(this._chain); i++) {
                sb.append(LazyList.get(this._chain, i).toString());
                sb.append("->");
            }
            sb.append(this._servletHolder);
            return sb.toString();
        }
    }

    private qii getFilterChain(Request request, String str, ServletHolder servletHolder) {
        Object objAdd;
        MultiMap<String> multiMap;
        ConcurrentMap<String, qii>[] concurrentMapArr;
        qii qiiVar;
        String name = str == null ? servletHolder.getName() : str;
        int iDispatch = FilterMapping.dispatch(request.getDispatcherType());
        if (this._filterChainsCached && (concurrentMapArr = this._chainCache) != null && (qiiVar = concurrentMapArr[iDispatch].get(name)) != null) {
            return qiiVar;
        }
        if (str == null || this._filterPathMappings == null) {
            objAdd = null;
        } else {
            objAdd = null;
            for (int i = 0; i < this._filterPathMappings.size(); i++) {
                FilterMapping filterMapping = this._filterPathMappings.get(i);
                if (filterMapping.appliesTo(str, iDispatch)) {
                    objAdd = LazyList.add(objAdd, filterMapping.getFilterHolder());
                }
            }
        }
        if (servletHolder != null && (multiMap = this._filterNameMappings) != null && multiMap.size() > 0 && this._filterNameMappings.size() > 0) {
            Object obj = this._filterNameMappings.get(servletHolder.getName());
            for (int i2 = 0; i2 < LazyList.size(obj); i2++) {
                FilterMapping filterMapping2 = (FilterMapping) LazyList.get(obj, i2);
                if (filterMapping2.appliesTo(iDispatch)) {
                    objAdd = LazyList.add(objAdd, filterMapping2.getFilterHolder());
                }
            }
            Object obj2 = this._filterNameMappings.get("*");
            for (int i3 = 0; i3 < LazyList.size(obj2); i3++) {
                FilterMapping filterMapping3 = (FilterMapping) LazyList.get(obj2, i3);
                if (filterMapping3.appliesTo(iDispatch)) {
                    objAdd = LazyList.add(objAdd, filterMapping3.getFilterHolder());
                }
            }
        }
        if (objAdd == null) {
            return null;
        }
        if (!this._filterChainsCached) {
            if (LazyList.size(objAdd) > 0) {
                return new Chain(request, objAdd, servletHolder);
            }
            return null;
        }
        CachedChain cachedChain = LazyList.size(objAdd) > 0 ? new CachedChain(objAdd, servletHolder) : null;
        ConcurrentMap<String, qii> concurrentMap = this._chainCache[iDispatch];
        Queue<String> queue = this._chainLRU[iDispatch];
        while (this._maxFilterChainsCacheSize > 0 && concurrentMap.size() >= this._maxFilterChainsCacheSize) {
            String strPoll = queue.poll();
            if (strPoll == null) {
                concurrentMap.clear();
                break;
            }
            concurrentMap.remove(strPoll);
        }
        concurrentMap.put(name, cachedChain);
        queue.add(name);
        return cachedChain;
    }

    private void invalidateChainsCache() {
        Queue<String> queue = this._chainLRU[1];
        if (queue != null) {
            queue.clear();
            this._chainLRU[2].clear();
            this._chainLRU[4].clear();
            this._chainLRU[8].clear();
            this._chainLRU[16].clear();
            this._chainCache[1].clear();
            this._chainCache[2].clear();
            this._chainCache[4].clear();
            this._chainCache[8].clear();
            this._chainCache[16].clear();
        }
    }

    public void addFilter(FilterHolder filterHolder, FilterMapping filterMapping) throws Throwable {
        if (filterHolder != null) {
            setFilters((FilterHolder[]) LazyList.addToArray(getFilters(), filterHolder, FilterHolder.class));
        }
        if (filterMapping != null) {
            setFilterMappings((FilterMapping[]) LazyList.addToArray(getFilterMappings(), filterMapping, FilterMapping.class));
        }
    }

    public void addFilterMapping(FilterMapping filterMapping) {
        if (filterMapping != null) {
            setFilterMappings((FilterMapping[]) LazyList.addToArray(getFilterMappings(), filterMapping, FilterMapping.class));
        }
    }

    public void addFilterWithMapping(FilterHolder filterHolder, String str, EnumSet<DispatcherType> enumSet) throws Throwable {
        FilterHolder[] filters = getFilters();
        if (filters != null) {
            filters = (FilterHolder[]) filters.clone();
        }
        try {
            setFilters((FilterHolder[]) LazyList.addToArray(filters, filterHolder, FilterHolder.class));
            FilterMapping filterMapping = new FilterMapping();
            filterMapping.setFilterName(filterHolder.getName());
            filterMapping.setPathSpec(str);
            filterMapping.setDispatcherTypes(enumSet);
            setFilterMappings((FilterMapping[]) LazyList.addToArray(getFilterMappings(), filterMapping, FilterMapping.class));
        } catch (Error e) {
            setFilters(filters);
            throw e;
        } catch (RuntimeException e2) {
            setFilters(filters);
            throw e2;
        }
    }

    public void addServlet(ServletHolder servletHolder) throws Throwable {
        setServlets((ServletHolder[]) LazyList.addToArray(getServlets(), servletHolder, ServletHolder.class));
    }

    public void addServletMapping(ServletMapping servletMapping) {
        setServletMappings((ServletMapping[]) LazyList.addToArray(getServletMappings(), servletMapping, ServletMapping.class));
    }

    public void addServletWithMapping(ServletHolder servletHolder, String str) throws Throwable {
        ServletHolder[] servlets = getServlets();
        if (servlets != null) {
            servlets = (ServletHolder[]) servlets.clone();
        }
        try {
            setServlets((ServletHolder[]) LazyList.addToArray(servlets, servletHolder, ServletHolder.class));
            ServletMapping servletMapping = new ServletMapping();
            servletMapping.setServletName(servletHolder.getName());
            servletMapping.setPathSpec(str);
            setServletMappings((ServletMapping[]) LazyList.addToArray(getServletMappings(), servletMapping, ServletMapping.class));
        } catch (Exception e) {
            setServlets(servlets);
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            aag0.a(e);
        }
    }

    public void destroyFilter(jii jiiVar) {
        ServletContextHandler servletContextHandler = this._contextHandler;
        if (servletContextHandler != null) {
            servletContextHandler.destroyFilter(jiiVar);
        }
    }

    public void destroyServlet(tje0 tje0Var) {
        ServletContextHandler servletContextHandler = this._contextHandler;
        if (servletContextHandler != null) {
            servletContextHandler.destroyServlet(tje0Var);
        }
    }

    @Override // org.eclipse.jetty.server.handler.ScopedHandler
    public void doHandle(String str, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        FilterMapping[] filterMappingArr;
        ServletException rootCause;
        FilterMapping[] filterMappingArr2;
        DispatcherType dispatcherType = request.getDispatcherType();
        ServletHolder servletHolder = (ServletHolder) request.getUserIdentityScope();
        qii filterChain = null;
        if (str.startsWith("/")) {
            if (servletHolder != null && (filterMappingArr2 = this._filterMappings) != null && filterMappingArr2.length > 0) {
                filterChain = getFilterChain(request, str, servletHolder);
            }
        } else if (servletHolder != null && (filterMappingArr = this._filterMappings) != null && filterMappingArr.length > 0) {
            filterChain = getFilterChain(request, null, servletHolder);
        }
        LOG.debug("chain={}", filterChain);
        try {
            try {
                try {
                    try {
                        try {
                            if (servletHolder != null) {
                                HttpServletRequest request2 = httpServletRequest instanceof ServletRequestHttpWrapper ? ((ServletRequestHttpWrapper) httpServletRequest).getRequest() : httpServletRequest;
                                HttpServletResponse response = httpServletResponse instanceof ServletResponseHttpWrapper ? ((ServletResponseHttpWrapper) httpServletResponse).getResponse() : httpServletResponse;
                                if (filterChain != null) {
                                    filterChain.doFilter(request2, response);
                                } else {
                                    servletHolder.handle(request, request2, response);
                                }
                            } else if (getHandler() == null) {
                                notFound(httpServletRequest, httpServletResponse);
                            } else {
                                nextHandle(str, request, httpServletRequest, httpServletResponse);
                            }
                            if (servletHolder != null) {
                                request.setHandled(true);
                            }
                        } catch (ContinuationThrowable e) {
                            throw e;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        if (!DispatcherType.REQUEST.equals(dispatcherType) && !DispatcherType.ASYNC.equals(dispatcherType)) {
                            if (e instanceof IOException) {
                                throw ((IOException) e);
                            }
                            if (e instanceof RuntimeException) {
                                throw ((RuntimeException) e);
                            }
                            if (e instanceof ServletException) {
                                throw e;
                            }
                        }
                        if (e instanceof UnavailableException) {
                            LOG.debug(e);
                        } else if (e instanceof ServletException) {
                            LOG.debug(e);
                            rootCause = e.getRootCause();
                            if (rootCause != null) {
                                e = rootCause;
                            }
                        } else if (e instanceof RuntimeIOException) {
                            LOG.debug(e);
                            rootCause = (IOException) ((RuntimeIOException) e).getCause();
                            if (rootCause != null) {
                                e = rootCause;
                            }
                        }
                        if (e instanceof HttpException) {
                            throw ((HttpException) e);
                        }
                        if (e instanceof RuntimeIOException) {
                            throw ((RuntimeIOException) e);
                        }
                        if (e instanceof EofException) {
                            throw ((EofException) e);
                        }
                        Logger logger = LOG;
                        if (logger.isDebugEnabled()) {
                            logger.warn(httpServletRequest.getRequestURI(), (Throwable) e);
                            logger.debug(httpServletRequest.toString(), new Object[0]);
                        } else if ((e instanceof IOException) || (e instanceof UnavailableException)) {
                            logger.debug(httpServletRequest.getRequestURI(), (Throwable) e);
                        } else {
                            logger.warn(httpServletRequest.getRequestURI(), (Throwable) e);
                        }
                        if (httpServletResponse.isCommitted()) {
                            logger.debug("Response already committed for handling " + e, new Object[0]);
                        } else {
                            httpServletRequest.setAttribute("javax.servlet.error.exception_type", e.getClass());
                            httpServletRequest.setAttribute("javax.servlet.error.exception", e);
                            if (!(e instanceof UnavailableException)) {
                                httpServletResponse.sendError(HttpStatus.INTERNAL_SERVER_ERROR_500, e.getMessage());
                            } else if (((UnavailableException) e).isPermanent()) {
                                httpServletResponse.sendError(HttpStatus.NOT_FOUND_404, e.getMessage());
                            } else {
                                httpServletResponse.sendError(HttpStatus.SERVICE_UNAVAILABLE_503, e.getMessage());
                            }
                        }
                        if (servletHolder != null) {
                            request.setHandled(true);
                        }
                    }
                } catch (Error e3) {
                    if (!DispatcherType.REQUEST.equals(dispatcherType) && !DispatcherType.ASYNC.equals(dispatcherType)) {
                        throw e3;
                    }
                    Logger logger2 = LOG;
                    logger2.warn("Error for " + httpServletRequest.getRequestURI(), e3);
                    if (logger2.isDebugEnabled()) {
                        logger2.debug(httpServletRequest.toString(), new Object[0]);
                    }
                    if (httpServletResponse.isCommitted()) {
                        logger2.debug("Response already committed for handling ", e3);
                    } else {
                        httpServletRequest.setAttribute("javax.servlet.error.exception_type", e3.getClass());
                        httpServletRequest.setAttribute("javax.servlet.error.exception", e3);
                        httpServletResponse.sendError(HttpStatus.INTERNAL_SERVER_ERROR_500, e3.getMessage());
                    }
                    if (servletHolder == null) {
                        return;
                    }
                    request.setHandled(true);
                }
            } catch (EofException e4) {
                throw e4;
            } catch (RuntimeIOException e5) {
                throw e5;
            }
        } catch (Throwable th) {
            if (servletHolder != null) {
                request.setHandled(true);
            }
            throw th;
        }
    }

    @Override // org.eclipse.jetty.server.handler.ScopedHandler
    public void doScope(String str, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        ServletHolder servletHolder;
        String servletPath = request.getServletPath();
        String pathInfo = request.getPathInfo();
        DispatcherType dispatcherType = request.getDispatcherType();
        if (str.startsWith("/")) {
            PathMap.Entry holderEntry = getHolderEntry(str);
            if (holderEntry != null) {
                servletHolder = (ServletHolder) holderEntry.getValue();
                String str2 = (String) holderEntry.getKey();
                String mapped = holderEntry.getMapped() != null ? holderEntry.getMapped() : PathMap.pathMatch(str2, str);
                String strPathInfo = PathMap.pathInfo(str2, str);
                if (DispatcherType.INCLUDE.equals(dispatcherType)) {
                    request.setAttribute("javax.servlet.include.servlet_path", mapped);
                    request.setAttribute("javax.servlet.include.path_info", strPathInfo);
                } else {
                    request.setServletPath(mapped);
                    request.setPathInfo(strPathInfo);
                }
            } else {
                servletHolder = null;
            }
        } else {
            servletHolder = this._servletNameMap.get(str);
        }
        Logger logger = LOG;
        if (logger.isDebugEnabled()) {
            logger.debug("servlet {}|{}|{} -> {}", request.getContextPath(), request.getServletPath(), request.getPathInfo(), servletHolder);
        }
        try {
            UserIdentity.Scope userIdentityScope = request.getUserIdentityScope();
            request.setUserIdentityScope(servletHolder);
            if (never()) {
                nextScope(str, request, httpServletRequest, httpServletResponse);
            } else {
                ScopedHandler scopedHandler = this._nextScope;
                if (scopedHandler != null) {
                    scopedHandler.doScope(str, request, httpServletRequest, httpServletResponse);
                } else {
                    ScopedHandler scopedHandler2 = this._outerScope;
                    if (scopedHandler2 != null) {
                        scopedHandler2.doHandle(str, request, httpServletRequest, httpServletResponse);
                    } else {
                        doHandle(str, request, httpServletRequest, httpServletResponse);
                    }
                }
            }
            if (userIdentityScope != null) {
                request.setUserIdentityScope(userIdentityScope);
            }
        } finally {
            if (0 != 0) {
                request.setUserIdentityScope(null);
            }
            if (!DispatcherType.INCLUDE.equals(dispatcherType)) {
                request.setServletPath(servletPath);
                request.setPathInfo(pathInfo);
            }
        }
    }

    @Override // org.eclipse.jetty.server.handler.ScopedHandler, org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public synchronized void doStart() throws Exception {
        SecurityHandler securityHandler;
        try {
            ContextHandler.Context currentContext = ContextHandler.getCurrentContext();
            this._servletContext = currentContext;
            ServletContextHandler servletContextHandler = (ServletContextHandler) (currentContext == null ? null : currentContext.getContextHandler());
            this._contextHandler = servletContextHandler;
            if (servletContextHandler != null && (securityHandler = (SecurityHandler) servletContextHandler.getChildHandlerByClass(SecurityHandler.class)) != null) {
                this._identityService = securityHandler.getIdentityService();
            }
            updateNameMappings();
            updateMappings();
            if (this._filterChainsCached) {
                this._chainCache[1] = new ConcurrentHashMap();
                this._chainCache[2] = new ConcurrentHashMap();
                this._chainCache[4] = new ConcurrentHashMap();
                this._chainCache[8] = new ConcurrentHashMap();
                this._chainCache[16] = new ConcurrentHashMap();
                this._chainLRU[1] = new ConcurrentLinkedQueue();
                this._chainLRU[2] = new ConcurrentLinkedQueue();
                this._chainLRU[4] = new ConcurrentLinkedQueue();
                this._chainLRU[8] = new ConcurrentLinkedQueue();
                this._chainLRU[16] = new ConcurrentLinkedQueue();
            }
            super.doStart();
            ServletContextHandler servletContextHandler2 = this._contextHandler;
            if (servletContextHandler2 == null || servletContextHandler2 == null) {
                initialize();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0025 A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:13:0x0018, B:15:0x0021, B:17:0x0025, B:20:0x002a, B:23:0x0033, B:25:0x003c), top: B:30:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x002a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x003c A[EDGE_INSN: B:39:0x003c->B:25:0x003c BREAK  A[LOOP:1: B:18:0x0026->B:24:0x003a], SYNTHETIC] */
    @Override // org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public synchronized void doStop() throws Exception {
        ServletHolder[] servletHolderArr;
        int length;
        int i;
        super.doStop();
        FilterHolder[] filterHolderArr = this._filters;
        if (filterHolderArr != null) {
            int length2 = filterHolderArr.length;
            while (true) {
                int i2 = length2 - 1;
                if (length2 <= 0) {
                    break;
                }
                try {
                    this._filters[i2].stop();
                } catch (Exception e) {
                    LOG.warn(Log.EXCEPTION, e);
                }
                length2 = i2;
            }
            servletHolderArr = this._servlets;
            if (servletHolderArr != null) {
                length = servletHolderArr.length;
                while (true) {
                    i = length - 1;
                    if (length > 0) {
                        break;
                    }
                    try {
                        this._servlets[i].stop();
                    } catch (Exception e2) {
                        LOG.warn(Log.EXCEPTION, e2);
                    }
                    length = i;
                }
            }
            this._filterPathMappings = null;
            this._filterNameMappings = null;
            this._servletPathMap = null;
        } else {
            servletHolderArr = this._servlets;
            if (servletHolderArr != null) {
                length = servletHolderArr.length;
                while (true) {
                    i = length - 1;
                    if (length > 0) {
                        break;
                        break;
                    } else {
                        this._servlets[i].stop();
                        length = i;
                    }
                }
            }
            this._filterPathMappings = null;
            this._filterNameMappings = null;
            this._servletPathMap = null;
        }
        throw th;
    }

    @Override // org.eclipse.jetty.server.handler.AbstractHandlerContainer, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.Dumpable
    public void dump(Appendable appendable, String str) throws IOException {
        super.dumpThis(appendable);
        AggregateLifeCycle.dump(appendable, str, TypeUtil.asList(getHandlers()), getBeans(), TypeUtil.asList(getFilterMappings()), TypeUtil.asList(getFilters()), TypeUtil.asList(getServletMappings()), TypeUtil.asList(getServlets()));
    }

    public Object getContextLog() {
        return null;
    }

    public FilterHolder getFilter(String str) {
        return this._filterNameMap.get(str);
    }

    public FilterMapping[] getFilterMappings() {
        return this._filterMappings;
    }

    public FilterHolder[] getFilters() {
        return this._filters;
    }

    public PathMap.Entry getHolderEntry(String str) {
        PathMap pathMap = this._servletPathMap;
        if (pathMap == null) {
            return null;
        }
        return pathMap.getMatch(str);
    }

    public IdentityService getIdentityService() {
        return this._identityService;
    }

    public int getMaxFilterChainsCacheSize() {
        return this._maxFilterChainsCacheSize;
    }

    public ServletHolder getServlet(String str) {
        return this._servletNameMap.get(str);
    }

    public vje0 getServletContext() {
        return this._servletContext;
    }

    public ServletMapping getServletMapping(String str) {
        ServletMapping[] servletMappingArr = this._servletMappings;
        ServletMapping servletMapping = null;
        if (servletMappingArr != null) {
            for (ServletMapping servletMapping2 : servletMappingArr) {
                String[] pathSpecs = servletMapping2.getPathSpecs();
                if (pathSpecs != null) {
                    for (String str2 : pathSpecs) {
                        if (str.equals(str2)) {
                            servletMapping = servletMapping2;
                        }
                    }
                }
            }
        }
        return servletMapping;
    }

    public ServletMapping[] getServletMappings() {
        return this._servletMappings;
    }

    public ServletHolder[] getServlets() {
        return this._servlets;
    }

    public void initialize() throws Exception {
        MultiException multiException = new MultiException();
        if (this._filters != null) {
            int i = 0;
            while (true) {
                FilterHolder[] filterHolderArr = this._filters;
                if (i >= filterHolderArr.length) {
                    break;
                }
                filterHolderArr[i].start();
                i++;
            }
        }
        ServletHolder[] servletHolderArr = this._servlets;
        if (servletHolderArr != null) {
            ServletHolder[] servletHolderArr2 = (ServletHolder[]) servletHolderArr.clone();
            Arrays.sort(servletHolderArr2);
            for (int i2 = 0; i2 < servletHolderArr2.length; i2++) {
                try {
                    if (servletHolderArr2[i2].getClassName() != null || servletHolderArr2[i2].getForcedPath() == null) {
                        servletHolderArr2[i2].start();
                    } else {
                        ServletHolder servletHolder = (ServletHolder) this._servletPathMap.match(servletHolderArr2[i2].getForcedPath());
                        if (servletHolder == null || servletHolder.getClassName() == null) {
                            multiException.add(new IllegalStateException("No forced path servlet for " + servletHolderArr2[i2].getForcedPath()));
                        } else {
                            servletHolderArr2[i2].setClassName(servletHolder.getClassName());
                            servletHolderArr2[i2].start();
                        }
                    }
                } catch (Throwable th) {
                    LOG.debug(Log.EXCEPTION, th);
                    multiException.add(th);
                }
            }
            multiException.ifExceptionThrow();
        }
    }

    public boolean isAvailable() {
        if (!isStarted()) {
            return false;
        }
        for (ServletHolder servletHolder : getServlets()) {
            if (servletHolder != null && !servletHolder.isAvailable()) {
                return false;
            }
        }
        return true;
    }

    public boolean isFilterChainsCached() {
        return this._filterChainsCached;
    }

    public boolean isStartWithUnavailable() {
        return this._startWithUnavailable;
    }

    public FilterHolder newFilterHolder(Holder.Source source) {
        return new FilterHolder(source);
    }

    public ServletHolder newServletHolder(Holder.Source source) {
        return new ServletHolder(source);
    }

    public void notFound(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        Logger logger = LOG;
        if (logger.isDebugEnabled()) {
            logger.debug("Not Found " + httpServletRequest.getRequestURI(), new Object[0]);
        }
    }

    public void prependFilterMapping(FilterMapping filterMapping) {
        if (filterMapping != null) {
            FilterMapping[] filterMappings = getFilterMappings();
            if (filterMappings == null || filterMappings.length == 0) {
                setFilterMappings(new FilterMapping[]{filterMapping});
                return;
            }
            FilterMapping[] filterMappingArr = new FilterMapping[filterMappings.length + 1];
            System.arraycopy(filterMappings, 0, filterMappingArr, 1, filterMappings.length);
            filterMappingArr[0] = filterMapping;
            setFilterMappings(filterMappingArr);
        }
    }

    public void setFilterChainsCached(boolean z) {
        this._filterChainsCached = z;
    }

    public void setFilterMappings(FilterMapping[] filterMappingArr) {
        ServletHandler servletHandler;
        FilterMapping[] filterMappingArr2;
        if (getServer() != null) {
            servletHandler = this;
            filterMappingArr2 = filterMappingArr;
            getServer().getContainer().update((Object) servletHandler, (Object[]) this._filterMappings, (Object[]) filterMappingArr2, "filterMapping", true);
        } else {
            servletHandler = this;
            filterMappingArr2 = filterMappingArr;
        }
        servletHandler._filterMappings = filterMappingArr2;
        servletHandler.updateMappings();
        servletHandler.invalidateChainsCache();
    }

    public synchronized void setFilters(FilterHolder[] filterHolderArr) throws Throwable {
        ServletHandler servletHandler;
        FilterHolder[] filterHolderArr2;
        try {
            try {
                if (getServer() != null) {
                    servletHandler = this;
                    filterHolderArr2 = filterHolderArr;
                    getServer().getContainer().update((Object) servletHandler, (Object[]) this._filters, (Object[]) filterHolderArr2, "filter", true);
                } else {
                    servletHandler = this;
                    filterHolderArr2 = filterHolderArr;
                }
                servletHandler._filters = filterHolderArr2;
                servletHandler.updateNameMappings();
                servletHandler.invalidateChainsCache();
                return;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
        throw th;
    }

    public void setMaxFilterChainsCacheSize(int i) {
        this._maxFilterChainsCacheSize = i;
    }

    @Override // org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.server.Handler
    public void setServer(Server server) {
        ServletHandler servletHandler;
        Server server2 = getServer();
        if (server2 == null || server2 == server) {
            servletHandler = this;
        } else {
            getServer().getContainer().update((Object) this, (Object[]) this._filters, (Object[]) null, "filter", true);
            servletHandler = this;
            servletHandler.getServer().getContainer().update((Object) servletHandler, (Object[]) servletHandler._filterMappings, (Object[]) null, "filterMapping", true);
            servletHandler.getServer().getContainer().update((Object) servletHandler, (Object[]) servletHandler._servlets, (Object[]) null, "servlet", true);
            servletHandler.getServer().getContainer().update((Object) servletHandler, (Object[]) servletHandler._servletMappings, (Object[]) null, "servletMapping", true);
        }
        super.setServer(server);
        if (server == null || server2 == server) {
            return;
        }
        server.getContainer().update((Object) servletHandler, (Object[]) null, (Object[]) servletHandler._filters, "filter", true);
        server.getContainer().update((Object) servletHandler, (Object[]) null, (Object[]) servletHandler._filterMappings, "filterMapping", true);
        server.getContainer().update((Object) servletHandler, (Object[]) null, (Object[]) servletHandler._servlets, "servlet", true);
        server.getContainer().update((Object) servletHandler, (Object[]) null, (Object[]) servletHandler._servletMappings, "servletMapping", true);
    }

    public void setServletMappings(ServletMapping[] servletMappingArr) {
        ServletHandler servletHandler;
        ServletMapping[] servletMappingArr2;
        if (getServer() != null) {
            servletHandler = this;
            servletMappingArr2 = servletMappingArr;
            getServer().getContainer().update((Object) servletHandler, (Object[]) this._servletMappings, (Object[]) servletMappingArr2, "servletMapping", true);
        } else {
            servletHandler = this;
            servletMappingArr2 = servletMappingArr;
        }
        servletHandler._servletMappings = servletMappingArr2;
        servletHandler.updateMappings();
        servletHandler.invalidateChainsCache();
    }

    public Set<String> setServletSecurity(ake0.a aVar, ike0 ike0Var) {
        ServletContextHandler servletContextHandler = this._contextHandler;
        return servletContextHandler != null ? servletContextHandler.setServletSecurity(aVar, ike0Var) : Collections.EMPTY_SET;
    }

    public synchronized void setServlets(ServletHolder[] servletHolderArr) throws Throwable {
        ServletHandler servletHandler;
        ServletHolder[] servletHolderArr2;
        try {
            try {
                if (getServer() != null) {
                    servletHandler = this;
                    servletHolderArr2 = servletHolderArr;
                    getServer().getContainer().update((Object) servletHandler, (Object[]) this._servlets, (Object[]) servletHolderArr2, "servlet", true);
                } else {
                    servletHandler = this;
                    servletHolderArr2 = servletHolderArr;
                }
                servletHandler._servlets = servletHolderArr2;
                servletHandler.updateNameMappings();
                servletHandler.invalidateChainsCache();
                return;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
        throw th;
    }

    public void setStartWithUnavailable(boolean z) {
        this._startWithUnavailable = z;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x01b2 A[Catch: all -> 0x000d, Exception -> 0x01a6, TRY_LEAVE, TryCatch #0 {Exception -> 0x01a6, blocks: (B:66:0x019b, B:68:0x019f, B:77:0x01b2, B:73:0x01a8, B:75:0x01ac), top: B:84:0x019b, outer: #1 }] */
    public synchronized void updateMappings() {
        try {
            if (this._filterMappings != null) {
                this._filterPathMappings = new ArrayList();
                this._filterNameMappings = new MultiMap<>();
                int i = 0;
                while (true) {
                    FilterMapping[] filterMappingArr = this._filterMappings;
                    if (i >= filterMappingArr.length) {
                        break;
                    }
                    FilterHolder filterHolder = this._filterNameMap.get(filterMappingArr[i].getFilterName());
                    if (filterHolder == null) {
                        throw new IllegalStateException("No filter named " + this._filterMappings[i].getFilterName());
                    }
                    this._filterMappings[i].setFilterHolder(filterHolder);
                    if (this._filterMappings[i].getPathSpecs() != null) {
                        this._filterPathMappings.add(this._filterMappings[i]);
                    }
                    if (this._filterMappings[i].getServletNames() != null) {
                        for (String str : this._filterMappings[i].getServletNames()) {
                            if (str != null) {
                                this._filterNameMappings.add(str, this._filterMappings[i]);
                            }
                        }
                    }
                    i++;
                }
            } else {
                this._filterPathMappings = null;
                this._filterNameMappings = null;
            }
            if (this._servletMappings == null || this._servletNameMap == null) {
                this._servletPathMap = null;
            } else {
                PathMap pathMap = new PathMap();
                int i2 = 0;
                while (true) {
                    ServletMapping[] servletMappingArr = this._servletMappings;
                    if (i2 >= servletMappingArr.length) {
                        this._servletPathMap = pathMap;
                        break;
                    }
                    ServletHolder servletHolder = this._servletNameMap.get(servletMappingArr[i2].getServletName());
                    if (servletHolder == null) {
                        throw new IllegalStateException("No such servlet: " + this._servletMappings[i2].getServletName());
                    }
                    if (servletHolder.isEnabled() && this._servletMappings[i2].getPathSpecs() != null) {
                        for (String str2 : this._servletMappings[i2].getPathSpecs()) {
                            if (str2 != null) {
                                pathMap.put(str2, servletHolder);
                            }
                        }
                    }
                    i2++;
                }
            }
            ConcurrentMap<String, qii>[] concurrentMapArr = this._chainCache;
            if (concurrentMapArr != null) {
                int length = concurrentMapArr.length;
                while (true) {
                    int i3 = length - 1;
                    if (length <= 0) {
                        break;
                    }
                    ConcurrentMap<String, qii> concurrentMap = this._chainCache[i3];
                    if (concurrentMap != null) {
                        concurrentMap.clear();
                    }
                    length = i3;
                }
            }
            Logger logger = LOG;
            if (logger.isDebugEnabled()) {
                logger.debug("filterNameMap=" + this._filterNameMap, new Object[0]);
                logger.debug("pathFilters=" + this._filterPathMappings, new Object[0]);
                logger.debug("servletFilterMap=" + this._filterNameMappings, new Object[0]);
                logger.debug("servletPathMap=" + this._servletPathMap, new Object[0]);
                logger.debug("servletNameMap=" + this._servletNameMap, new Object[0]);
            }
            try {
                ServletContextHandler servletContextHandler = this._contextHandler;
                if (servletContextHandler != null && servletContextHandler.isStarted()) {
                    initialize();
                } else if (this._contextHandler == null && isStarted()) {
                    initialize();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void updateNameMappings() {
        try {
            this._filterNameMap.clear();
            int i = 0;
            if (this._filters != null) {
                int i2 = 0;
                while (true) {
                    FilterHolder[] filterHolderArr = this._filters;
                    if (i2 >= filterHolderArr.length) {
                        break;
                    }
                    this._filterNameMap.put(filterHolderArr[i2].getName(), this._filters[i2]);
                    this._filters[i2].setServletHandler(this);
                    i2++;
                }
            }
            this._servletNameMap.clear();
            if (this._servlets != null) {
                while (true) {
                    ServletHolder[] servletHolderArr = this._servlets;
                    if (i >= servletHolderArr.length) {
                        break;
                    }
                    this._servletNameMap.put(servletHolderArr[i].getName(), this._servlets[i]);
                    this._servlets[i].setServletHandler(this);
                    i++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public FilterHolder addFilter(String str, String str2, EnumSet<DispatcherType> enumSet) {
        return addFilterWithMapping(str, str2, enumSet);
    }

    public void addFilter(FilterHolder filterHolder) throws Throwable {
        if (filterHolder != null) {
            setFilters((FilterHolder[]) LazyList.addToArray(getFilters(), filterHolder, FilterHolder.class));
        }
    }

    public FilterHolder addFilterWithMapping(String str, String str2, EnumSet<DispatcherType> enumSet) throws Throwable {
        FilterHolder filterHolderNewFilterHolder = newFilterHolder(Holder.Source.EMBEDDED);
        filterHolderNewFilterHolder.setName(str + "-" + this._filters.length);
        filterHolderNewFilterHolder.setClassName(str);
        addFilterWithMapping(filterHolderNewFilterHolder, str2, enumSet);
        return filterHolderNewFilterHolder;
    }

    public ServletHolder addServletWithMapping(Class<? extends tje0> cls, String str) throws Throwable {
        ServletHolder servletHolderNewServletHolder = newServletHolder(Holder.Source.EMBEDDED);
        servletHolderNewServletHolder.setHeldClass(cls);
        setServlets((ServletHolder[]) LazyList.addToArray(getServlets(), servletHolderNewServletHolder, ServletHolder.class));
        addServletWithMapping(servletHolderNewServletHolder, str);
        return servletHolderNewServletHolder;
    }

    public FilterHolder addFilterWithMapping(Class<? extends jii> cls, String str, EnumSet<DispatcherType> enumSet) throws Throwable {
        FilterHolder filterHolderNewFilterHolder = newFilterHolder(Holder.Source.EMBEDDED);
        filterHolderNewFilterHolder.setHeldClass(cls);
        addFilterWithMapping(filterHolderNewFilterHolder, str, enumSet);
        return filterHolderNewFilterHolder;
    }

    public ServletHolder addServletWithMapping(String str, String str2) throws Throwable {
        ServletHolder servletHolderNewServletHolder = newServletHolder(null);
        servletHolderNewServletHolder.setName(str + "-" + LazyList.size(this._servlets));
        servletHolderNewServletHolder.setClassName(str);
        addServletWithMapping(servletHolderNewServletHolder, str2);
        return servletHolderNewServletHolder;
    }

    public FilterHolder addFilterWithMapping(Class<? extends jii> cls, String str, int i) throws Throwable {
        FilterHolder filterHolderNewFilterHolder = newFilterHolder(Holder.Source.EMBEDDED);
        filterHolderNewFilterHolder.setHeldClass(cls);
        addFilterWithMapping(filterHolderNewFilterHolder, str, i);
        return filterHolderNewFilterHolder;
    }

    public FilterHolder addFilterWithMapping(String str, String str2, int i) throws Throwable {
        FilterHolder filterHolderNewFilterHolder = newFilterHolder(null);
        filterHolderNewFilterHolder.setName(str + "-" + this._filters.length);
        filterHolderNewFilterHolder.setClassName(str);
        addFilterWithMapping(filterHolderNewFilterHolder, str2, i);
        return filterHolderNewFilterHolder;
    }

    public void addFilterWithMapping(FilterHolder filterHolder, String str, int i) throws Throwable {
        FilterHolder[] filters = getFilters();
        if (filters != null) {
            filters = (FilterHolder[]) filters.clone();
        }
        try {
            setFilters((FilterHolder[]) LazyList.addToArray(filters, filterHolder, FilterHolder.class));
            FilterMapping filterMapping = new FilterMapping();
            filterMapping.setFilterName(filterHolder.getName());
            filterMapping.setPathSpec(str);
            filterMapping.setDispatches(i);
            setFilterMappings((FilterMapping[]) LazyList.addToArray(getFilterMappings(), filterMapping, FilterMapping.class));
        } catch (Error e) {
            setFilters(filters);
            throw e;
        } catch (RuntimeException e2) {
            setFilters(filters);
            throw e2;
        }
    }
}
