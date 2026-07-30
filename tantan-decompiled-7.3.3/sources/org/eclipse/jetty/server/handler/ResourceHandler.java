package org.eclipse.jetty.server.handler;

import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.http.HttpFields;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpMethods;
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.http.MimeTypes;
import org.eclipse.jetty.p127io.Buffer;
import org.eclipse.jetty.p127io.ByteArrayBuffer;
import org.eclipse.jetty.p127io.WriterOutputStream;
import org.eclipse.jetty.server.AbstractHttpConnection;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Response;
import org.eclipse.jetty.util.URIUtil;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.eclipse.jetty.util.resource.FileResource;
import org.eclipse.jetty.util.resource.Resource;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceHandler extends HandlerWrapper {
    private static final Logger LOG = Log.getLogger((Class<?>) ResourceHandler.class);
    boolean _aliases;
    Resource _baseResource;
    ByteArrayBuffer _cacheControl;
    ContextHandler _context;
    Resource _defaultStylesheet;
    boolean _directory;
    Resource _stylesheet;
    String[] _welcomeFiles = {"index.html"};
    MimeTypes _mimeTypes = new MimeTypes();

    public void doDirectory(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Resource resource) throws IOException {
        if (!this._directory) {
            httpServletResponse.sendError(403);
            return;
        }
        String listHTML = resource.getListHTML(httpServletRequest.getRequestURI(), httpServletRequest.getPathInfo().lastIndexOf("/") > 0);
        httpServletResponse.setContentType("text/html; charset=UTF-8");
        httpServletResponse.getWriter().println(listHTML);
    }

    public void doResponseHeaders(HttpServletResponse httpServletResponse, Resource resource, String str) {
        if (str != null) {
            httpServletResponse.setContentType(str);
        }
        long length = resource.length();
        if (!(httpServletResponse instanceof Response)) {
            if (length > 0) {
                httpServletResponse.setHeader("Content-Length", Long.toString(length));
            }
            ByteArrayBuffer byteArrayBuffer = this._cacheControl;
            if (byteArrayBuffer != null) {
                httpServletResponse.setHeader("Cache-Control", byteArrayBuffer.toString());
                return;
            }
            return;
        }
        HttpFields httpFields = ((Response) httpServletResponse).getHttpFields();
        if (length > 0) {
            httpFields.putLongField(HttpHeaders.CONTENT_LENGTH_BUFFER, length);
        }
        ByteArrayBuffer byteArrayBuffer2 = this._cacheControl;
        if (byteArrayBuffer2 != null) {
            httpFields.put(HttpHeaders.CACHE_CONTROL_BUFFER, byteArrayBuffer2);
        }
    }

    @Override // org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        ContextHandler.Context currentContext = ContextHandler.getCurrentContext();
        ContextHandler contextHandler = currentContext == null ? null : currentContext.getContextHandler();
        this._context = contextHandler;
        if (contextHandler != null) {
            this._aliases = contextHandler.isAliases();
        }
        if (this._aliases || FileResource.getCheckAliases()) {
            super.doStart();
        } else {
            wtq0.m207906a("Alias checking disabled");
        }
    }

    public Resource getBaseResource() {
        Resource resource = this._baseResource;
        if (resource == null) {
            return null;
        }
        return resource;
    }

    public String getCacheControl() {
        return this._cacheControl.toString();
    }

    public MimeTypes getMimeTypes() {
        return this._mimeTypes;
    }

    public Resource getResource(HttpServletRequest httpServletRequest) throws MalformedURLException {
        String servletPath;
        String pathInfo;
        if (httpServletRequest.getAttribute("javax.servlet.include.request_uri") != null) {
            servletPath = (String) httpServletRequest.getAttribute("javax.servlet.include.servlet_path");
            pathInfo = (String) httpServletRequest.getAttribute("javax.servlet.include.path_info");
            if (servletPath == null && pathInfo == null) {
                servletPath = httpServletRequest.getServletPath();
                pathInfo = httpServletRequest.getPathInfo();
            }
        } else {
            servletPath = httpServletRequest.getServletPath();
            pathInfo = httpServletRequest.getPathInfo();
        }
        return getResource(URIUtil.addPaths(servletPath, pathInfo));
    }

    public String getResourceBase() {
        Resource resource = this._baseResource;
        if (resource == null) {
            return null;
        }
        return resource.toString();
    }

    public Resource getStylesheet() {
        Resource resource = this._stylesheet;
        if (resource != null) {
            return resource;
        }
        if (this._defaultStylesheet == null) {
            try {
                this._defaultStylesheet = Resource.newResource(getClass().getResource("/jetty-dir.css"));
            } catch (IOException e) {
                Logger logger = LOG;
                logger.warn(e.toString(), new Object[0]);
                logger.debug(e);
            }
        }
        return this._defaultStylesheet;
    }

    public Resource getWelcome(Resource resource) throws IOException {
        int i = 0;
        while (true) {
            String[] strArr = this._welcomeFiles;
            if (i >= strArr.length) {
                return null;
            }
            Resource resourceAddPath = resource.addPath(strArr[i]);
            if (resourceAddPath.exists() && !resourceAddPath.isDirectory()) {
                return resourceAddPath;
            }
            i++;
        }
    }

    public String[] getWelcomeFiles() {
        return this._welcomeFiles;
    }

    @Override // org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.Handler
    public void handle(String str, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        boolean z;
        Resource resource;
        OutputStream writerOutputStream;
        if (request.isHandled()) {
            return;
        }
        if ("GET".equals(httpServletRequest.getMethod())) {
            z = false;
        } else {
            if (!HttpMethods.HEAD.equals(httpServletRequest.getMethod())) {
                super.handle(str, request, httpServletRequest, httpServletResponse);
                return;
            }
            z = true;
        }
        Resource resource2 = getResource(httpServletRequest);
        if (resource2 == null || !resource2.exists()) {
            if (!str.endsWith("/jetty-dir.css")) {
                super.handle(str, request, httpServletRequest, httpServletResponse);
                return;
            }
            resource2 = getStylesheet();
            if (resource2 == null) {
                return;
            } else {
                httpServletResponse.setContentType("text/css");
            }
        }
        if (!this._aliases && resource2.getAlias() != null) {
            LOG.info(resource2 + " aliased to " + resource2.getAlias(), new Object[0]);
            return;
        }
        request.setHandled(true);
        if (!resource2.isDirectory()) {
            resource = resource2;
        } else {
            if (!httpServletRequest.getPathInfo().endsWith("/")) {
                httpServletResponse.sendRedirect(httpServletResponse.encodeRedirectURL(URIUtil.addPaths(httpServletRequest.getRequestURI(), "/")));
                return;
            }
            Resource welcome = getWelcome(resource2);
            if (welcome == null || !welcome.exists()) {
                doDirectory(httpServletRequest, httpServletResponse, resource2);
                request.setHandled(true);
                return;
            }
            resource = welcome;
        }
        long jLastModified = resource.lastModified();
        if (jLastModified > 0) {
            long dateHeader = httpServletRequest.getDateHeader("If-Modified-Since");
            if (dateHeader > 0 && jLastModified / 1000 <= dateHeader / 1000) {
                httpServletResponse.setStatus(HttpStatus.NOT_MODIFIED_304);
                return;
            }
        }
        Buffer mimeByExtension = this._mimeTypes.getMimeByExtension(resource.toString());
        if (mimeByExtension == null) {
            mimeByExtension = this._mimeTypes.getMimeByExtension(httpServletRequest.getPathInfo());
        }
        doResponseHeaders(httpServletResponse, resource, mimeByExtension != null ? mimeByExtension.toString() : null);
        httpServletResponse.setDateHeader("Last-Modified", jLastModified);
        if (z) {
            return;
        }
        try {
            writerOutputStream = httpServletResponse.getOutputStream();
        } catch (IllegalStateException unused) {
            writerOutputStream = new WriterOutputStream(httpServletResponse.getWriter());
        }
        OutputStream outputStream = writerOutputStream;
        if (outputStream instanceof AbstractHttpConnection.Output) {
            ((AbstractHttpConnection.Output) outputStream).sendContent(resource.getInputStream());
        } else {
            resource.writeTo(outputStream, 0L, resource.length());
        }
    }

    public boolean isAliases() {
        return this._aliases;
    }

    public boolean isDirectoriesListed() {
        return this._directory;
    }

    public void setAliases(boolean z) {
        this._aliases = z;
    }

    public void setBaseResource(Resource resource) {
        this._baseResource = resource;
    }

    public void setCacheControl(String str) {
        this._cacheControl = str == null ? null : new ByteArrayBuffer(str);
    }

    public void setDirectoriesListed(boolean z) {
        this._directory = z;
    }

    public void setMimeTypes(MimeTypes mimeTypes) {
        this._mimeTypes = mimeTypes;
    }

    public void setResourceBase(String str) {
        try {
            setBaseResource(Resource.newResource(str));
        } catch (Exception e) {
            Logger logger = LOG;
            logger.warn(e.toString(), new Object[0]);
            logger.debug(e);
            wg3.m206174a(str);
        }
    }

    public void setStylesheet(String str) {
        try {
            Resource resourceNewResource = Resource.newResource(str);
            this._stylesheet = resourceNewResource;
            if (resourceNewResource.exists()) {
                return;
            }
            LOG.warn("unable to find custom stylesheet: " + str, new Object[0]);
            this._stylesheet = null;
        } catch (Exception e) {
            Logger logger = LOG;
            logger.warn(e.toString(), new Object[0]);
            logger.debug(e);
            throw new IllegalArgumentException(str.toString());
        }
    }

    public void setWelcomeFiles(String[] strArr) {
        this._welcomeFiles = strArr;
    }

    public Resource getResource(String str) throws MalformedURLException {
        ContextHandler contextHandler;
        if (str != null && str.startsWith("/")) {
            Resource baseResource = this._baseResource;
            if (baseResource == null && ((contextHandler = this._context) == null || (baseResource = contextHandler.getBaseResource()) == null)) {
                return null;
            }
            try {
                return baseResource.addPath(URIUtil.canonicalPath(str));
            } catch (Exception e) {
                LOG.ignore(e);
                return null;
            }
        }
        throw new MalformedURLException(str);
    }
}
