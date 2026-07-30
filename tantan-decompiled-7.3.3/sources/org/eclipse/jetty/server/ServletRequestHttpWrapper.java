package org.eclipse.jetty.server;

import java.io.IOException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import p153l.gse0;
import p153l.hnl;
import p153l.kse0;
import p153l.qg60;

/* JADX INFO: loaded from: classes2.dex */
public class ServletRequestHttpWrapper extends kse0 implements HttpServletRequest {
    public ServletRequestHttpWrapper(gse0 gse0Var) {
        super(gse0Var);
    }

    @Override // javax.servlet.http.HttpServletRequest
    public boolean authenticate(HttpServletResponse httpServletResponse) throws ServletException, IOException {
        return false;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public String getAuthType() {
        return null;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public String getContextPath() {
        return null;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public Cookie[] getCookies() {
        return null;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public long getDateHeader(String str) {
        return 0L;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public String getHeader(String str) {
        return null;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public Enumeration getHeaderNames() {
        return null;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public Enumeration getHeaders(String str) {
        return null;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public int getIntHeader(String str) {
        return 0;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public String getMethod() {
        return null;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public qg60 getPart(String str) throws ServletException, IOException {
        return null;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public Collection<qg60> getParts() throws ServletException, IOException {
        return null;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public String getPathInfo() {
        return null;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public String getPathTranslated() {
        return null;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public String getQueryString() {
        return null;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public String getRemoteUser() {
        return null;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public String getRequestURI() {
        return null;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public StringBuffer getRequestURL() {
        return null;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public String getRequestedSessionId() {
        return null;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public String getServletPath() {
        return null;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public hnl getSession(boolean z) {
        return null;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public Principal getUserPrincipal() {
        return null;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public boolean isRequestedSessionIdFromCookie() {
        return false;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public boolean isRequestedSessionIdFromURL() {
        return false;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public boolean isRequestedSessionIdFromUrl() {
        return false;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public boolean isRequestedSessionIdValid() {
        return false;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public boolean isUserInRole(String str) {
        return false;
    }

    @Override // javax.servlet.http.HttpServletRequest
    public void login(String str, String str2) throws ServletException {
    }

    @Override // javax.servlet.http.HttpServletRequest
    public void logout() throws ServletException {
    }

    @Override // javax.servlet.http.HttpServletRequest
    public hnl getSession() {
        return null;
    }
}
