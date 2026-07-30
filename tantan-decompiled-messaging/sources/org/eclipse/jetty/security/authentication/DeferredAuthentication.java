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
import org.eclipse.jetty.util.C21953IO;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import p149l.bke0;
import p149l.gke0;
import p149l.jfd0;
import p149l.zje0;

/* JADX INFO: loaded from: classes3.dex */
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

        @Override // p149l.gke0
        public void flushBuffer() throws IOException {
        }

        @Override // p149l.gke0
        public int getBufferSize() {
            return 1024;
        }

        @Override // p149l.gke0
        public String getCharacterEncoding() {
            return null;
        }

        @Override // p149l.gke0
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

        @Override // p149l.gke0
        public Locale getLocale() {
            return null;
        }

        @Override // p149l.gke0
        public zje0 getOutputStream() throws IOException {
            return DeferredAuthentication.__nullOut;
        }

        @Override // javax.servlet.http.HttpServletResponse
        public int getStatus() {
            return 0;
        }

        @Override // p149l.gke0
        public PrintWriter getWriter() throws IOException {
            return C21953IO.getNullPrintWriter();
        }

        @Override // p149l.gke0
        public boolean isCommitted() {
            return true;
        }

        @Override // p149l.gke0
        public void reset() {
        }

        @Override // p149l.gke0
        public void resetBuffer() {
        }

        @Override // javax.servlet.http.HttpServletResponse
        public void sendError(int i) throws IOException {
        }

        @Override // javax.servlet.http.HttpServletResponse
        public void sendRedirect(String str) throws IOException {
        }

        @Override // p149l.gke0
        public void setBufferSize(int i) {
        }

        @Override // p149l.gke0
        public void setCharacterEncoding(String str) {
        }

        @Override // p149l.gke0
        public void setContentLength(int i) {
        }

        @Override // p149l.gke0
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

        @Override // p149l.gke0
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
    private static zje0 __nullOut = new zje0() { // from class: org.eclipse.jetty.security.authentication.DeferredAuthentication.2
        @Override // p149l.zje0
        public void print(String str) throws IOException {
        }

        @Override // p149l.zje0
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
            jfd0.m141176a("No Authenticator");
            throw null;
        }
    }

    public static boolean isDeferred(HttpServletResponse httpServletResponse) {
        return httpServletResponse == __deferredResponse;
    }

    @Override // org.eclipse.jetty.server.Authentication.Deferred
    public Authentication authenticate(bke0 bke0Var) {
        try {
            Authentication authenticationValidateRequest = this._authenticator.validateRequest(bke0Var, __deferredResponse, true);
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
    public Authentication login(String str, Object obj, bke0 bke0Var) {
        UserIdentity userIdentityLogin = this._authenticator.login(str, obj, bke0Var);
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
    public Authentication authenticate(bke0 bke0Var, gke0 gke0Var) {
        try {
            IdentityService identityService = this._authenticator.getLoginService().getIdentityService();
            Authentication authenticationValidateRequest = this._authenticator.validateRequest(bke0Var, gke0Var, true);
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
