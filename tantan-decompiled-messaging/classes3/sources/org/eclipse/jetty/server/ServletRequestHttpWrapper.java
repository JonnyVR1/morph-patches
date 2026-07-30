package org.eclipse.jetty.server;

import java.io.IOException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import l.bke0;
import l.fke0;
import l.l860;
import l.rkl;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ServletRequestHttpWrapper extends fke0 implements HttpServletRequest {
    public ServletRequestHttpWrapper(bke0 bke0Var) {
        super(bke0Var);
    }

    public boolean authenticate(HttpServletResponse httpServletResponse) throws ServletException, IOException {
        return false;
    }

    public String getAuthType() {
        return null;
    }

    public String getContextPath() {
        return null;
    }

    public Cookie[] getCookies() {
        return null;
    }

    public long getDateHeader(String str) {
        return 0L;
    }

    public String getHeader(String str) {
        return null;
    }

    public Enumeration getHeaderNames() {
        return null;
    }

    public Enumeration getHeaders(String str) {
        return null;
    }

    public int getIntHeader(String str) {
        return 0;
    }

    public String getMethod() {
        return null;
    }

    public l860 getPart(String str) throws ServletException, IOException {
        return null;
    }

    public Collection<l860> getParts() throws ServletException, IOException {
        return null;
    }

    public String getPathInfo() {
        return null;
    }

    public String getPathTranslated() {
        return null;
    }

    public String getQueryString() {
        return null;
    }

    public String getRemoteUser() {
        return null;
    }

    public String getRequestURI() {
        return null;
    }

    public StringBuffer getRequestURL() {
        return null;
    }

    public String getRequestedSessionId() {
        return null;
    }

    public String getServletPath() {
        return null;
    }

    public rkl getSession(boolean z) {
        return null;
    }

    public Principal getUserPrincipal() {
        return null;
    }

    public boolean isRequestedSessionIdFromCookie() {
        return false;
    }

    public boolean isRequestedSessionIdFromURL() {
        return false;
    }

    public boolean isRequestedSessionIdFromUrl() {
        return false;
    }

    public boolean isRequestedSessionIdValid() {
        return false;
    }

    public boolean isUserInRole(String str) {
        return false;
    }

    public void login(String str, String str2) throws ServletException {
    }

    public void logout() throws ServletException {
    }

    public rkl getSession() {
        return null;
    }
}
