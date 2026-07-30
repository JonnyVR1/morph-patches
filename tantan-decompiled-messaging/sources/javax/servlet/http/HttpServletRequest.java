package javax.servlet.http;

import java.io.IOException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import javax.servlet.ServletException;
import p149l.bke0;
import p149l.l860;
import p149l.rkl;

/* JADX INFO: loaded from: classes2.dex */
public interface HttpServletRequest extends bke0 {
    boolean authenticate(HttpServletResponse httpServletResponse) throws ServletException, IOException;

    String getAuthType();

    String getContextPath();

    Cookie[] getCookies();

    long getDateHeader(String str);

    String getHeader(String str);

    Enumeration<String> getHeaderNames();

    Enumeration<String> getHeaders(String str);

    int getIntHeader(String str);

    String getMethod();

    l860 getPart(String str) throws ServletException, IOException;

    Collection<l860> getParts() throws ServletException, IOException;

    String getPathInfo();

    String getPathTranslated();

    String getQueryString();

    String getRemoteUser();

    String getRequestURI();

    StringBuffer getRequestURL();

    String getRequestedSessionId();

    String getServletPath();

    rkl getSession();

    rkl getSession(boolean z);

    Principal getUserPrincipal();

    boolean isRequestedSessionIdFromCookie();

    boolean isRequestedSessionIdFromURL();

    boolean isRequestedSessionIdFromUrl();

    boolean isRequestedSessionIdValid();

    boolean isUserInRole(String str);

    void login(String str, String str2) throws ServletException;

    void logout() throws ServletException;
}
