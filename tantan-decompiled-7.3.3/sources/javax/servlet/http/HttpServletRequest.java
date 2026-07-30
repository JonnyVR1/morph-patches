package javax.servlet.http;

import java.io.IOException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import javax.servlet.ServletException;
import p153l.gse0;
import p153l.hnl;
import p153l.qg60;

/* JADX INFO: loaded from: classes2.dex */
public interface HttpServletRequest extends gse0 {
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

    qg60 getPart(String str) throws ServletException, IOException;

    Collection<qg60> getParts() throws ServletException, IOException;

    String getPathInfo();

    String getPathTranslated();

    String getQueryString();

    String getRemoteUser();

    String getRequestURI();

    StringBuffer getRequestURL();

    String getRequestedSessionId();

    String getServletPath();

    hnl getSession();

    hnl getSession(boolean z);

    Principal getUserPrincipal();

    boolean isRequestedSessionIdFromCookie();

    boolean isRequestedSessionIdFromURL();

    boolean isRequestedSessionIdFromUrl();

    boolean isRequestedSessionIdValid();

    boolean isUserInRole(String str);

    void login(String str, String str2) throws ServletException;

    void logout() throws ServletException;
}
