package org.eclipse.jetty.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.http.HttpMethods;
import org.eclipse.jetty.server.AbstractHttpConnection;
import org.eclipse.jetty.server.Dispatcher;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.ErrorHandler;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import p153l.ase0;
import p153l.wg3;

/* JADX INFO: loaded from: classes2.dex */
public class ErrorPageErrorHandler extends ErrorHandler {
    public static final String ERROR_PAGE = "org.eclipse.jetty.server.error_page";
    public static final String GLOBAL_ERROR_PAGE = "org.eclipse.jetty.server.error_page.global";
    private static final Logger LOG = Log.getLogger((Class<?>) ErrorPageErrorHandler.class);
    protected ase0 _servletContext;
    private final Map<String, String> _errorPages = new HashMap();
    private final List<ErrorCodeRange> _errorPageList = new ArrayList();

    public class ErrorCodeRange {
        private int _from;
        private int _to;
        private String _uri;

        public ErrorCodeRange(int i, int i2, String str) throws IllegalArgumentException {
            if (i > i2) {
                wg3.m206174a("from>to");
                throw null;
            }
            this._from = i;
            this._to = i2;
            this._uri = str;
        }

        public String getUri() {
            return this._uri;
        }

        public boolean isInRange(int i) {
            return i >= this._from && i <= this._to;
        }

        public String toString() {
            return "from: " + this._from + ",to: " + this._to + ",uri: " + this._uri;
        }
    }

    public void addErrorPage(int i, int i2, String str) {
        this._errorPageList.add(new ErrorCodeRange(i, i2, str));
    }

    @Override // org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        super.doStart();
        this._servletContext = ContextHandler.getCurrentContext();
    }

    @Override // org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStop() throws Exception {
        super.doStop();
    }

    public Map<String, String> getErrorPages() {
        return this._errorPages;
    }

    @Override // org.eclipse.jetty.server.handler.ErrorHandler, org.eclipse.jetty.server.Handler
    public void handle(String str, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        String uri;
        String str2;
        Integer num;
        String method = httpServletRequest.getMethod();
        if (!method.equals("GET") && !method.equals("POST") && !method.equals(HttpMethods.HEAD)) {
            AbstractHttpConnection.getCurrentConnection().getRequest().setHandled(true);
            return;
        }
        if (this._errorPages != null) {
            Class<?> superclass = (Class) httpServletRequest.getAttribute("javax.servlet.error.exception_type");
            if (ServletException.class.equals(superclass)) {
                uri = this._errorPages.get(superclass.getName());
                if (uri == null) {
                    Throwable rootCause = (Throwable) httpServletRequest.getAttribute("javax.servlet.error.exception");
                    while (rootCause instanceof ServletException) {
                        rootCause = ((ServletException) rootCause).getRootCause();
                    }
                    if (rootCause != null) {
                        superclass = rootCause.getClass();
                    }
                }
            } else {
                uri = null;
            }
            while (uri == null && superclass != null) {
                uri = this._errorPages.get(superclass.getName());
                superclass = superclass.getSuperclass();
            }
            if (uri == null && (num = (Integer) httpServletRequest.getAttribute("javax.servlet.error.status_code")) != null && (uri = this._errorPages.get(Integer.toString(num.intValue()))) == null && this._errorPageList != null) {
                for (int i = 0; i < this._errorPageList.size(); i++) {
                    ErrorCodeRange errorCodeRange = this._errorPageList.get(i);
                    if (errorCodeRange.isInRange(num.intValue())) {
                        uri = errorCodeRange.getUri();
                        break;
                    }
                }
            }
            if (uri == null) {
                uri = this._errorPages.get(GLOBAL_ERROR_PAGE);
            }
            if (uri != null && ((str2 = (String) httpServletRequest.getAttribute(ERROR_PAGE)) == null || !str2.equals(uri))) {
                httpServletRequest.setAttribute(ERROR_PAGE, uri);
                Dispatcher dispatcher = (Dispatcher) this._servletContext.getRequestDispatcher(uri);
                try {
                    if (dispatcher != null) {
                        dispatcher.error(httpServletRequest, httpServletResponse);
                        return;
                    }
                    LOG.warn("No error page " + uri, new Object[0]);
                } catch (ServletException e) {
                    LOG.warn(Log.EXCEPTION, e);
                    return;
                }
            }
        }
        super.handle(str, request, httpServletRequest, httpServletResponse);
    }

    public void setErrorPages(Map<String, String> map) {
        this._errorPages.clear();
        if (map != null) {
            this._errorPages.putAll(map);
        }
    }

    public void addErrorPage(String str, String str2) {
        this._errorPages.put(str, str2);
    }

    public void addErrorPage(int i, String str) {
        this._errorPages.put(Integer.toString(i), str);
    }

    public void addErrorPage(Class<? extends Throwable> cls, String str) {
        this._errorPages.put(cls.getName(), str);
    }
}
