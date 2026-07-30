package org.eclipse.jetty.server;

import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Map;
import javax.servlet.DispatcherType;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.util.Attributes;
import org.eclipse.jetty.util.LazyList;
import org.eclipse.jetty.util.MultiMap;
import org.eclipse.jetty.util.UrlEncoded;
import p149l.bke0;
import p149l.gke0;
import p149l.ytc0;

/* JADX INFO: loaded from: classes3.dex */
public class Dispatcher implements ytc0 {
    public static final String __FORWARD_PREFIX = "javax.servlet.forward.";
    public static final String __INCLUDE_PREFIX = "javax.servlet.include.";
    public static final String __JSP_FILE = "org.apache.catalina.jsp_file";
    private final ContextHandler _contextHandler;
    private final String _dQuery;
    private final String _named;
    private final String _path;
    private final String _uri;

    public class ForwardAttributes implements Attributes {
        final Attributes _attr;
        String _contextPath;
        String _pathInfo;
        String _query;
        String _requestURI;
        String _servletPath;

        public ForwardAttributes(Attributes attributes) {
            this._attr = attributes;
        }

        @Override // org.eclipse.jetty.util.Attributes
        public void clearAttributes() {
            throw new IllegalStateException();
        }

        @Override // org.eclipse.jetty.util.Attributes
        public Object getAttribute(String str) {
            if (Dispatcher.this._named == null) {
                if (str.equals("javax.servlet.forward.path_info")) {
                    return this._pathInfo;
                }
                if (str.equals("javax.servlet.forward.request_uri")) {
                    return this._requestURI;
                }
                if (str.equals("javax.servlet.forward.servlet_path")) {
                    return this._servletPath;
                }
                if (str.equals("javax.servlet.forward.context_path")) {
                    return this._contextPath;
                }
                if (str.equals("javax.servlet.forward.query_string")) {
                    return this._query;
                }
            }
            if (str.startsWith(Dispatcher.__INCLUDE_PREFIX)) {
                return null;
            }
            return this._attr.getAttribute(str);
        }

        @Override // org.eclipse.jetty.util.Attributes
        public Enumeration getAttributeNames() {
            HashSet hashSet = new HashSet();
            Enumeration<String> attributeNames = this._attr.getAttributeNames();
            while (attributeNames.hasMoreElements()) {
                String strNextElement = attributeNames.nextElement();
                if (!strNextElement.startsWith(Dispatcher.__INCLUDE_PREFIX) && !strNextElement.startsWith(Dispatcher.__FORWARD_PREFIX)) {
                    hashSet.add(strNextElement);
                }
            }
            if (Dispatcher.this._named == null) {
                if (this._pathInfo != null) {
                    hashSet.add("javax.servlet.forward.path_info");
                } else {
                    hashSet.remove("javax.servlet.forward.path_info");
                }
                hashSet.add("javax.servlet.forward.request_uri");
                hashSet.add("javax.servlet.forward.servlet_path");
                hashSet.add("javax.servlet.forward.context_path");
                if (this._query != null) {
                    hashSet.add("javax.servlet.forward.query_string");
                } else {
                    hashSet.remove("javax.servlet.forward.query_string");
                }
            }
            return Collections.enumeration(hashSet);
        }

        @Override // org.eclipse.jetty.util.Attributes
        public void removeAttribute(String str) {
            setAttribute(str, null);
        }

        @Override // org.eclipse.jetty.util.Attributes
        public void setAttribute(String str, Object obj) {
            if (Dispatcher.this._named != null || !str.startsWith("javax.servlet.")) {
                Attributes attributes = this._attr;
                if (obj == null) {
                    attributes.removeAttribute(str);
                    return;
                } else {
                    attributes.setAttribute(str, obj);
                    return;
                }
            }
            if (str.equals("javax.servlet.forward.path_info")) {
                this._pathInfo = (String) obj;
                return;
            }
            if (str.equals("javax.servlet.forward.request_uri")) {
                this._requestURI = (String) obj;
                return;
            }
            if (str.equals("javax.servlet.forward.servlet_path")) {
                this._servletPath = (String) obj;
                return;
            }
            if (str.equals("javax.servlet.forward.context_path")) {
                this._contextPath = (String) obj;
                return;
            }
            if (str.equals("javax.servlet.forward.query_string")) {
                this._query = (String) obj;
                return;
            }
            Attributes attributes2 = this._attr;
            if (obj == null) {
                attributes2.removeAttribute(str);
            } else {
                attributes2.setAttribute(str, obj);
            }
        }

        public String toString() {
            return "FORWARD+" + this._attr.toString();
        }
    }

    public class IncludeAttributes implements Attributes {
        final Attributes _attr;
        String _contextPath;
        String _pathInfo;
        String _query;
        String _requestURI;
        String _servletPath;

        public IncludeAttributes(Attributes attributes) {
            this._attr = attributes;
        }

        @Override // org.eclipse.jetty.util.Attributes
        public void clearAttributes() {
            throw new IllegalStateException();
        }

        @Override // org.eclipse.jetty.util.Attributes
        public Object getAttribute(String str) {
            if (Dispatcher.this._named == null) {
                if (str.equals("javax.servlet.include.path_info")) {
                    return this._pathInfo;
                }
                if (str.equals("javax.servlet.include.servlet_path")) {
                    return this._servletPath;
                }
                if (str.equals("javax.servlet.include.context_path")) {
                    return this._contextPath;
                }
                if (str.equals("javax.servlet.include.query_string")) {
                    return this._query;
                }
                if (str.equals("javax.servlet.include.request_uri")) {
                    return this._requestURI;
                }
            } else if (str.startsWith(Dispatcher.__INCLUDE_PREFIX)) {
                return null;
            }
            return this._attr.getAttribute(str);
        }

        @Override // org.eclipse.jetty.util.Attributes
        public Enumeration getAttributeNames() {
            HashSet hashSet = new HashSet();
            Enumeration<String> attributeNames = this._attr.getAttributeNames();
            while (attributeNames.hasMoreElements()) {
                String strNextElement = attributeNames.nextElement();
                if (!strNextElement.startsWith(Dispatcher.__INCLUDE_PREFIX)) {
                    hashSet.add(strNextElement);
                }
            }
            if (Dispatcher.this._named == null) {
                if (this._pathInfo != null) {
                    hashSet.add("javax.servlet.include.path_info");
                } else {
                    hashSet.remove("javax.servlet.include.path_info");
                }
                hashSet.add("javax.servlet.include.request_uri");
                hashSet.add("javax.servlet.include.servlet_path");
                hashSet.add("javax.servlet.include.context_path");
                if (this._query != null) {
                    hashSet.add("javax.servlet.include.query_string");
                } else {
                    hashSet.remove("javax.servlet.include.query_string");
                }
            }
            return Collections.enumeration(hashSet);
        }

        @Override // org.eclipse.jetty.util.Attributes
        public void removeAttribute(String str) {
            setAttribute(str, null);
        }

        @Override // org.eclipse.jetty.util.Attributes
        public void setAttribute(String str, Object obj) {
            if (Dispatcher.this._named != null || !str.startsWith("javax.servlet.")) {
                Attributes attributes = this._attr;
                if (obj == null) {
                    attributes.removeAttribute(str);
                    return;
                } else {
                    attributes.setAttribute(str, obj);
                    return;
                }
            }
            if (str.equals("javax.servlet.include.path_info")) {
                this._pathInfo = (String) obj;
                return;
            }
            if (str.equals("javax.servlet.include.request_uri")) {
                this._requestURI = (String) obj;
                return;
            }
            if (str.equals("javax.servlet.include.servlet_path")) {
                this._servletPath = (String) obj;
                return;
            }
            if (str.equals("javax.servlet.include.context_path")) {
                this._contextPath = (String) obj;
                return;
            }
            if (str.equals("javax.servlet.include.query_string")) {
                this._query = (String) obj;
                return;
            }
            Attributes attributes2 = this._attr;
            if (obj == null) {
                attributes2.removeAttribute(str);
            } else {
                attributes2.setAttribute(str, obj);
            }
        }

        public String toString() {
            return "INCLUDE+" + this._attr.toString();
        }
    }

    public Dispatcher(ContextHandler contextHandler, String str, String str2, String str3) {
        this._contextHandler = contextHandler;
        this._uri = str;
        this._path = str2;
        this._dQuery = str3;
        this._named = null;
    }

    private void commitResponse(gke0 gke0Var, Request request) throws IOException {
        if (request.getResponse().isWriting()) {
            try {
                gke0Var.getWriter().close();
            } catch (IllegalStateException unused) {
                gke0Var.getOutputStream().close();
            }
        } else {
            try {
                gke0Var.getOutputStream().close();
            } catch (IllegalStateException unused2) {
                gke0Var.getWriter().close();
            }
        }
    }

    public void error(bke0 bke0Var, gke0 gke0Var) throws ServletException, IOException {
        forward(bke0Var, gke0Var, DispatcherType.ERROR);
    }

    public void forward(bke0 bke0Var, gke0 gke0Var, DispatcherType dispatcherType) throws ServletException, IOException {
        Request request = bke0Var instanceof Request ? (Request) bke0Var : AbstractHttpConnection.getCurrentConnection().getRequest();
        Response response = request.getResponse();
        gke0Var.resetBuffer();
        response.fwdReset();
        if (!(bke0Var instanceof HttpServletRequest)) {
            bke0Var = new ServletRequestHttpWrapper(bke0Var);
        }
        if (!(gke0Var instanceof HttpServletResponse)) {
            gke0Var = new ServletResponseHttpWrapper(gke0Var);
        }
        boolean zIsHandled = request.isHandled();
        String requestURI = request.getRequestURI();
        String contextPath = request.getContextPath();
        String servletPath = request.getServletPath();
        String pathInfo = request.getPathInfo();
        String queryString = request.getQueryString();
        Attributes attributes = request.getAttributes();
        DispatcherType dispatcherType2 = request.getDispatcherType();
        MultiMap<String> parameters = request.getParameters();
        try {
            request.setHandled(false);
            request.setDispatcherType(dispatcherType);
            String str = this._named;
            if (str != null) {
                this._contextHandler.handle(str, request, (HttpServletRequest) bke0Var, (HttpServletResponse) gke0Var);
            } else {
                String str2 = this._dQuery;
                if (str2 != null) {
                    if (parameters == null) {
                        request.extractParameters();
                        parameters = request.getParameters();
                    }
                    request.mergeQueryString(str2);
                }
                ForwardAttributes forwardAttributes = new ForwardAttributes(attributes);
                if (attributes.getAttribute("javax.servlet.forward.request_uri") != null) {
                    forwardAttributes._pathInfo = (String) attributes.getAttribute("javax.servlet.forward.path_info");
                    forwardAttributes._query = (String) attributes.getAttribute("javax.servlet.forward.query_string");
                    forwardAttributes._requestURI = (String) attributes.getAttribute("javax.servlet.forward.request_uri");
                    forwardAttributes._contextPath = (String) attributes.getAttribute("javax.servlet.forward.context_path");
                    forwardAttributes._servletPath = (String) attributes.getAttribute("javax.servlet.forward.servlet_path");
                } else {
                    forwardAttributes._pathInfo = pathInfo;
                    forwardAttributes._query = queryString;
                    forwardAttributes._requestURI = requestURI;
                    forwardAttributes._contextPath = contextPath;
                    forwardAttributes._servletPath = servletPath;
                }
                request.setRequestURI(this._uri);
                request.setContextPath(this._contextHandler.getContextPath());
                request.setServletPath(null);
                request.setPathInfo(this._uri);
                request.setAttributes(forwardAttributes);
                this._contextHandler.handle(this._path, request, (HttpServletRequest) bke0Var, (HttpServletResponse) gke0Var);
                if (!request.getAsyncContinuation().isAsyncStarted()) {
                    commitResponse(gke0Var, request);
                }
            }
        } finally {
            request.setHandled(zIsHandled);
            request.setRequestURI(requestURI);
            request.setContextPath(contextPath);
            request.setServletPath(servletPath);
            request.setPathInfo(pathInfo);
            request.setAttributes(attributes);
            request.setParameters(parameters);
            request.setQueryString(queryString);
            request.setDispatcherType(dispatcherType2);
        }
    }

    @Override // p149l.ytc0
    public void include(bke0 bke0Var, gke0 gke0Var) throws ServletException, IOException {
        Request request = bke0Var instanceof Request ? (Request) bke0Var : AbstractHttpConnection.getCurrentConnection().getRequest();
        if (!(bke0Var instanceof HttpServletRequest)) {
            bke0Var = new ServletRequestHttpWrapper(bke0Var);
        }
        if (!(gke0Var instanceof HttpServletResponse)) {
            gke0Var = new ServletResponseHttpWrapper(gke0Var);
        }
        DispatcherType dispatcherType = request.getDispatcherType();
        Attributes attributes = request.getAttributes();
        MultiMap<String> parameters = request.getParameters();
        try {
            request.setDispatcherType(DispatcherType.INCLUDE);
            request.getConnection().include();
            String str = this._named;
            if (str != null) {
                this._contextHandler.handle(str, request, (HttpServletRequest) bke0Var, (HttpServletResponse) gke0Var);
            } else {
                String str2 = this._dQuery;
                if (str2 != null) {
                    if (parameters == null) {
                        request.extractParameters();
                        parameters = request.getParameters();
                    }
                    MultiMap<String> multiMap = new MultiMap<>();
                    UrlEncoded.decodeTo(str2, multiMap, request.getCharacterEncoding());
                    if (parameters != null && parameters.size() > 0) {
                        for (Map.Entry<String, Object> entry : parameters.entrySet()) {
                            String key = entry.getKey();
                            Object value = entry.getValue();
                            for (int i = 0; i < LazyList.size(value); i++) {
                                multiMap.add(key, LazyList.get(value, i));
                            }
                        }
                    }
                    request.setParameters(multiMap);
                }
                IncludeAttributes includeAttributes = new IncludeAttributes(attributes);
                includeAttributes._requestURI = this._uri;
                includeAttributes._contextPath = this._contextHandler.getContextPath();
                includeAttributes._servletPath = null;
                includeAttributes._pathInfo = this._path;
                includeAttributes._query = str2;
                request.setAttributes(includeAttributes);
                this._contextHandler.handle(this._path, request, (HttpServletRequest) bke0Var, (HttpServletResponse) gke0Var);
            }
        } finally {
            request.setAttributes(attributes);
            request.getConnection().included();
            request.setParameters(parameters);
            request.setDispatcherType(dispatcherType);
        }
    }

    public Dispatcher(ContextHandler contextHandler, String str) throws IllegalStateException {
        this._contextHandler = contextHandler;
        this._named = str;
        this._uri = null;
        this._path = null;
        this._dQuery = null;
    }

    @Override // p149l.ytc0
    public void forward(bke0 bke0Var, gke0 gke0Var) throws ServletException, IOException {
        forward(bke0Var, gke0Var, DispatcherType.FORWARD);
    }
}
