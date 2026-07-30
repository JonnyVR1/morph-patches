package org.eclipse.jetty.security.authentication;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.security.IdentityService;
import org.eclipse.jetty.security.ServerAuthException;
import org.eclipse.jetty.security.UserAuthentication;
import org.eclipse.jetty.server.Authentication;
import org.eclipse.jetty.server.UserIdentity;
import org.eclipse.jetty.util.C22074IO;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import p153l.ese0;
import p153l.gse0;
import p153l.lse0;
import p153l.mnd0;

/* JADX INFO: loaded from: classes2.dex */
public class DeferredAuthentication implements Authentication.Deferred {
    private static final Logger LOG = Log.getLogger((Class<?>) DeferredAuthentication.class);
    static final HttpServletResponse __deferredResponse = new HttpServletResponse() { // from class: org.eclipse.jetty.security.authentication.DeferredAuthentication.1
        @Override // javax.servlet.http.HttpServletResponse
        public void addCookie(Cookie cookie) {
        }

        @Override // javax.servlet.http.HttpServletResponse
        public void addDateHeader(String str, long j) {
        }

        @Override // javax.servlet.http.HttpServletResponse
        public void addHeader(String str, String str2) {
        }

        @Override // javax.servlet.http.HttpServletResponse
        public void addIntHeader(String str, int i) {
        }

        @Override // javax.servlet.http.HttpServletResponse
        public boolean containsHeader(String str) {
            return false;
        }

        @Override // javax.servlet.http.HttpServletResponse
        public String encodeRedirectURL(String str) {
            return null;
        }

        @Override // javax.servlet.http.HttpServletResponse
        public String encodeRedirectUrl(String str) {
            return null;
        }

        @Override // javax.servlet.http.HttpServletResponse
        public String encodeURL(String str) {
            return null;
        }

        @Override // javax.servlet.http.HttpServletResponse
        public String encodeUrl(String str) {
            return null;
        }

        @Override // p153l.lse0
        public void flushBuffer() throws IOException {
        }

        @Override // p153l.lse0
        public int getBufferSize() {
            return 1024;
        }

        @Override // p153l.lse0
        public String getCharacterEncoding() {
            return null;
        }

        @Override // p153l.lse0
        public String getContentType() {
            return null;
        }

        @Override // javax.servlet.http.HttpServletResponse
        public String getHeader(String str) {
            return null;
        }

        @Override // javax.servlet.http.HttpServletResponse
        public Collection<String> getHeaderNames() {
            return Collections.EMPTY_LIST;
        }

        @Override // javax.servlet.http.HttpServletResponse
        public Collection<String> getHeaders(String str) {
            return Collections.EMPTY_LIST;
        }

        @Override // p153l.lse0
        public Locale getLocale() {
            return null;
        }

        @Override // p153l.lse0
        public ese0 getOutputStream() throws IOException {
            return DeferredAuthentication.__nullOut;
        }

        @Override // javax.servlet.http.HttpServletResponse
        public int getStatus() {
            return 0;
        }

        @Override // p153l.lse0
        public PrintWriter getWriter() throws IOException {
            return C22074IO.getNullPrintWriter();
        }

        @Override // p153l.lse0
        public boolean isCommitted() {
            return true;
        }

        @Override // p153l.lse0
        public void reset() {
        }

        @Override // p153l.lse0
        public void resetBuffer() {
        }

        @Override // javax.servlet.http.HttpServletResponse
        public void sendError(int i) throws IOException {
        }

        @Override // javax.servlet.http.HttpServletResponse
        public void sendRedirect(String str) throws IOException {
        }

        @Override // p153l.lse0
        public void setBufferSize(int i) {
        }

        @Override // p153l.lse0
        public void setCharacterEncoding(String str) {
        }

        @Override // p153l.lse0
        public void setContentLength(int i) {
        }

        @Override // p153l.lse0
        public void setContentType(String str) {
        }

        @Override // javax.servlet.http.HttpServletResponse
        public void setDateHeader(String str, long j) {
        }

        @Override // javax.servlet.http.HttpServletResponse
        public void setHeader(String str, String str2) {
        }

        @Override // javax.servlet.http.HttpServletResponse
        public void setIntHeader(String str, int i) {
        }

        @Override // p153l.lse0
        public void setLocale(Locale locale) {
        }

        @Override // javax.servlet.http.HttpServletResponse
        public void setStatus(int i) {
        }

        @Override // javax.servlet.http.HttpServletResponse
        public void sendError(int i, String str) throws IOException {
        }

        @Override // javax.servlet.http.HttpServletResponse
        public void setStatus(int i, String str) {
        }
    };
    private static ese0 __nullOut = new ese0() { // from class: org.eclipse.jetty.security.authentication.DeferredAuthentication.2
        @Override // p153l.ese0
        public void print(String str) throws IOException {
        }

        @Override // p153l.ese0
        public void println(String str) throws IOException {
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
        }
    };
    protected final LoginAuthenticator _authenticator;
    private Object _previousAssociation;

    public DeferredAuthentication(LoginAuthenticator loginAuthenticator) {
        if (loginAuthenticator != null) {
            this._authenticator = loginAuthenticator;
        } else {
            mnd0.m159157a("No Authenticator");
            throw null;
        }
    }

    public static boolean isDeferred(HttpServletResponse httpServletResponse) {
        return httpServletResponse == __deferredResponse;
    }

    @Override // org.eclipse.jetty.server.Authentication.Deferred
    public Authentication authenticate(gse0 gse0Var) {
        try {
            Authentication authenticationValidateRequest = this._authenticator.validateRequest(gse0Var, __deferredResponse, true);
            if (authenticationValidateRequest == null || !(authenticationValidateRequest instanceof Authentication.User) || (authenticationValidateRequest instanceof Authentication.ResponseSent)) {
                return this;
            }
            IdentityService identityService = this._authenticator.getLoginService().getIdentityService();
            if (identityService == null) {
                return authenticationValidateRequest;
            }
            this._previousAssociation = identityService.associate(((Authentication.User) authenticationValidateRequest).getUserIdentity());
            return authenticationValidateRequest;
        } catch (ServerAuthException e) {
            LOG.debug(e);
            return this;
        }
    }

    public Object getPreviousAssociation() {
        return this._previousAssociation;
    }

    @Override // org.eclipse.jetty.server.Authentication.Deferred
    public Authentication login(String str, Object obj, gse0 gse0Var) {
        UserIdentity userIdentityLogin = this._authenticator.login(str, obj, gse0Var);
        if (userIdentityLogin == null) {
            return null;
        }
        IdentityService identityService = this._authenticator.getLoginService().getIdentityService();
        UserAuthentication userAuthentication = new UserAuthentication("API", userIdentityLogin);
        if (identityService != null) {
            this._previousAssociation = identityService.associate(userIdentityLogin);
        }
        return userAuthentication;
    }

    @Override // org.eclipse.jetty.server.Authentication.Deferred
    public Authentication authenticate(gse0 gse0Var, lse0 lse0Var) {
        try {
            IdentityService identityService = this._authenticator.getLoginService().getIdentityService();
            Authentication authenticationValidateRequest = this._authenticator.validateRequest(gse0Var, lse0Var, true);
            if (!(authenticationValidateRequest instanceof Authentication.User) || identityService == null) {
                return authenticationValidateRequest;
            }
            this._previousAssociation = identityService.associate(((Authentication.User) authenticationValidateRequest).getUserIdentity());
            return authenticationValidateRequest;
        } catch (ServerAuthException e) {
            LOG.debug(e);
            return this;
        }
    }
}
