package javax.servlet.http;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.tencent.wcdb.BuildConfig;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.MessageFormat;
import java.util.Enumeration;
import java.util.ResourceBundle;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.http.MimeTypes;
import p149l.bke0;
import p149l.dk40;
import p149l.gke0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class HttpServlet extends GenericServlet {
    private static final String HEADER_IFMODSINCE = "If-Modified-Since";
    private static final String HEADER_LASTMOD = "Last-Modified";
    private static final String METHOD_DELETE = "DELETE";
    private static final String METHOD_GET = "GET";
    private static final String METHOD_HEAD = "HEAD";
    private static final String METHOD_OPTIONS = "OPTIONS";
    private static final String METHOD_POST = "POST";
    private static final String METHOD_PUT = "PUT";
    private static final String METHOD_TRACE = "TRACE";
    private static final String LSTRING_FILE = "javax.servlet.http.LocalStrings";
    private static ResourceBundle lStrings = ResourceBundle.getBundle(LSTRING_FILE);

    private Method[] getAllDeclaredMethods(Class<?> cls) {
        if (cls.equals(HttpServlet.class)) {
            return null;
        }
        Method[] allDeclaredMethods = getAllDeclaredMethods(cls.getSuperclass());
        Method[] declaredMethods = cls.getDeclaredMethods();
        if (allDeclaredMethods == null || allDeclaredMethods.length <= 0) {
            return declaredMethods;
        }
        Method[] methodArr = new Method[allDeclaredMethods.length + declaredMethods.length];
        System.arraycopy(allDeclaredMethods, 0, methodArr, 0, allDeclaredMethods.length);
        System.arraycopy(declaredMethods, 0, methodArr, allDeclaredMethods.length, declaredMethods.length);
        return methodArr;
    }

    private void maybeSetLastModified(HttpServletResponse httpServletResponse, long j) {
        if (!httpServletResponse.containsHeader("Last-Modified") && j >= 0) {
            httpServletResponse.setDateHeader("Last-Modified", j);
        }
    }

    public void doDelete(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        String protocol = httpServletRequest.getProtocol();
        String string = lStrings.getString("http.method_delete_not_supported");
        if (protocol.endsWith(BuildConfig.VERSION_NAME)) {
            httpServletResponse.sendError(HttpStatus.METHOD_NOT_ALLOWED_405, string);
        } else {
            httpServletResponse.sendError(400, string);
        }
    }

    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        String protocol = httpServletRequest.getProtocol();
        String string = lStrings.getString("http.method_get_not_supported");
        if (protocol.endsWith(BuildConfig.VERSION_NAME)) {
            httpServletResponse.sendError(HttpStatus.METHOD_NOT_ALLOWED_405, string);
        } else {
            httpServletResponse.sendError(400, string);
        }
    }

    public void doHead(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        dk40 dk40Var = new dk40(httpServletResponse);
        doGet(httpServletRequest, dk40Var);
        dk40Var.m112161a();
    }

    public void doOptions(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        for (Method method : getAllDeclaredMethods(getClass())) {
            if (method.getName().equals("doGet")) {
                z = true;
                z2 = true;
            }
            if (method.getName().equals("doPost")) {
                z3 = true;
            }
            if (method.getName().equals("doPut")) {
                z4 = true;
            }
            if (method.getName().equals("doDelete")) {
                z5 = true;
            }
        }
        String strConcat = z ? "GET" : null;
        if (z2) {
            strConcat = strConcat == null ? "HEAD" : strConcat.concat(", HEAD");
        }
        if (z3) {
            strConcat = strConcat == null ? "POST" : strConcat.concat(", POST");
        }
        if (z4) {
            strConcat = strConcat == null ? "PUT" : strConcat.concat(", PUT");
        }
        if (z5) {
            strConcat = strConcat == null ? "DELETE" : strConcat.concat(", DELETE");
        }
        httpServletResponse.setHeader(HttpHeaders.ALLOW, (strConcat == null ? "TRACE" : strConcat.concat(", TRACE")).concat(", OPTIONS"));
    }

    public void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        String protocol = httpServletRequest.getProtocol();
        String string = lStrings.getString("http.method_post_not_supported");
        if (protocol.endsWith(BuildConfig.VERSION_NAME)) {
            httpServletResponse.sendError(HttpStatus.METHOD_NOT_ALLOWED_405, string);
        } else {
            httpServletResponse.sendError(400, string);
        }
    }

    public void doPut(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        String protocol = httpServletRequest.getProtocol();
        String string = lStrings.getString("http.method_put_not_supported");
        if (protocol.endsWith(BuildConfig.VERSION_NAME)) {
            httpServletResponse.sendError(HttpStatus.METHOD_NOT_ALLOWED_405, string);
        } else {
            httpServletResponse.sendError(400, string);
        }
    }

    public void doTrace(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        StringBuilder sb = new StringBuilder("TRACE ");
        sb.append(httpServletRequest.getRequestURI());
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(httpServletRequest.getProtocol());
        Enumeration<String> headerNames = httpServletRequest.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String strNextElement = headerNames.nextElement();
            sb.append("\r\n");
            sb.append(strNextElement);
            sb.append(": ");
            sb.append(httpServletRequest.getHeader(strNextElement));
        }
        sb.append("\r\n");
        int length = sb.length();
        httpServletResponse.setContentType(MimeTypes.MESSAGE_HTTP);
        httpServletResponse.setContentLength(length);
        httpServletResponse.getOutputStream().print(sb.toString());
    }

    public long getLastModified(HttpServletRequest httpServletRequest) {
        return -1L;
    }

    public void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        String method = httpServletRequest.getMethod();
        if (method.equals("GET")) {
            long lastModified = getLastModified(httpServletRequest);
            if (lastModified == -1) {
                doGet(httpServletRequest, httpServletResponse);
                return;
            } else if (httpServletRequest.getDateHeader("If-Modified-Since") >= lastModified) {
                httpServletResponse.setStatus(HttpStatus.NOT_MODIFIED_304);
                return;
            } else {
                maybeSetLastModified(httpServletResponse, lastModified);
                doGet(httpServletRequest, httpServletResponse);
                return;
            }
        }
        if (method.equals("HEAD")) {
            maybeSetLastModified(httpServletResponse, getLastModified(httpServletRequest));
            doHead(httpServletRequest, httpServletResponse);
            return;
        }
        if (method.equals("POST")) {
            doPost(httpServletRequest, httpServletResponse);
            return;
        }
        if (method.equals("PUT")) {
            doPut(httpServletRequest, httpServletResponse);
            return;
        }
        if (method.equals("DELETE")) {
            doDelete(httpServletRequest, httpServletResponse);
            return;
        }
        if (method.equals("OPTIONS")) {
            doOptions(httpServletRequest, httpServletResponse);
        } else if (method.equals("TRACE")) {
            doTrace(httpServletRequest, httpServletResponse);
        } else {
            httpServletResponse.sendError(501, MessageFormat.format(lStrings.getString("http.method_not_implemented"), method));
        }
    }

    @Override // javax.servlet.GenericServlet, p149l.tje0
    public void service(bke0 bke0Var, gke0 gke0Var) throws ServletException, IOException {
        if ((bke0Var instanceof HttpServletRequest) && (gke0Var instanceof HttpServletResponse)) {
            service((HttpServletRequest) bke0Var, (HttpServletResponse) gke0Var);
            return;
        }
        throw new ServletException("non-HTTP request or response");
    }
}
