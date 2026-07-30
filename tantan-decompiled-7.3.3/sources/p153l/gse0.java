package p153l;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;
import javax.servlet.DispatcherType;

/* JADX INFO: loaded from: classes2.dex */
public interface gse0 {
    o21 getAsyncContext();

    Object getAttribute(String str);

    Enumeration<String> getAttributeNames();

    String getCharacterEncoding();

    int getContentLength();

    String getContentType();

    DispatcherType getDispatcherType();

    dse0 getInputStream() throws IOException;

    String getLocalAddr();

    String getLocalName();

    int getLocalPort();

    Locale getLocale();

    Enumeration<Locale> getLocales();

    String getParameter(String str);

    Map<String, String[]> getParameterMap();

    Enumeration<String> getParameterNames();

    String[] getParameterValues(String str);

    String getProtocol();

    BufferedReader getReader() throws IOException;

    String getRealPath(String str);

    String getRemoteAddr();

    String getRemoteHost();

    int getRemotePort();

    c2d0 getRequestDispatcher(String str);

    String getScheme();

    String getServerName();

    int getServerPort();

    ase0 getServletContext();

    boolean isAsyncStarted();

    boolean isAsyncSupported();

    boolean isSecure();

    void removeAttribute(String str);

    void setAttribute(String str, Object obj);

    void setCharacterEncoding(String str) throws UnsupportedEncodingException;

    o21 startAsync() throws IllegalStateException;

    o21 startAsync(gse0 gse0Var, lse0 lse0Var) throws IllegalStateException;
}
