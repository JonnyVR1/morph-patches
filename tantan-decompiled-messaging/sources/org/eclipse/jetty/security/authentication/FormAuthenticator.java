package org.eclipse.jetty.security.authentication;

import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.MimeTypes;
import org.eclipse.jetty.security.Authenticator;
import org.eclipse.jetty.security.LoginService;
import org.eclipse.jetty.security.ServerAuthException;
import org.eclipse.jetty.security.UserAuthentication;
import org.eclipse.jetty.server.AbstractHttpConnection;
import org.eclipse.jetty.server.Authentication;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.UserIdentity;
import org.eclipse.jetty.util.MultiMap;
import org.eclipse.jetty.util.StringUtil;
import org.eclipse.jetty.util.URIUtil;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.eclipse.jetty.util.security.Constraint;
import p149l.bke0;
import p149l.gke0;
import p149l.pkl;
import p149l.qkl;
import p149l.rkl;
import p149l.ytc0;

/* JADX INFO: loaded from: classes3.dex */
public class FormAuthenticator extends LoginAuthenticator {
    private static final Logger LOG = Log.getLogger((Class<?>) FormAuthenticator.class);
    public static final String __FORM_DISPATCH = "org.eclipse.jetty.security.dispatch";
    public static final String __FORM_ERROR_PAGE = "org.eclipse.jetty.security.form_error_page";
    public static final String __FORM_LOGIN_PAGE = "org.eclipse.jetty.security.form_login_page";
    public static final String __J_PASSWORD = "j_password";
    public static final String __J_POST = "org.eclipse.jetty.security.form_POST";
    public static final String __J_SECURITY_CHECK = "/j_security_check";
    public static final String __J_URI = "org.eclipse.jetty.security.form_URI";
    public static final String __J_USERNAME = "j_username";
    private boolean _alwaysSaveUri;
    private boolean _dispatch;
    private String _formErrorPage;
    private String _formErrorPath;
    private String _formLoginPage;
    private String _formLoginPath;

    public static class FormAuthentication extends UserAuthentication implements Authentication.ResponseSent {
        public FormAuthentication(String str, UserIdentity userIdentity) {
            super(str, userIdentity);
        }

        @Override // org.eclipse.jetty.security.UserAuthentication
        public String toString() {
            return "Form" + super.toString();
        }
    }

    public static class FormRequest extends pkl {
        public FormRequest(HttpServletRequest httpServletRequest) {
            super(httpServletRequest);
        }

        @Override // p149l.pkl, javax.servlet.http.HttpServletRequest
        public long getDateHeader(String str) {
            if (str.toLowerCase(Locale.ENGLISH).startsWith("if-")) {
                return -1L;
            }
            return super.getDateHeader(str);
        }

        @Override // p149l.pkl, javax.servlet.http.HttpServletRequest
        public String getHeader(String str) {
            if (str.toLowerCase(Locale.ENGLISH).startsWith("if-")) {
                return null;
            }
            return super.getHeader(str);
        }

        @Override // p149l.pkl, javax.servlet.http.HttpServletRequest
        public Enumeration getHeaderNames() {
            return Collections.enumeration(Collections.list(super.getHeaderNames()));
        }

        @Override // p149l.pkl, javax.servlet.http.HttpServletRequest
        public Enumeration getHeaders(String str) {
            return str.toLowerCase(Locale.ENGLISH).startsWith("if-") ? Collections.enumeration(Collections.EMPTY_LIST) : super.getHeaders(str);
        }
    }

    public static class FormResponse extends qkl {
        public FormResponse(HttpServletResponse httpServletResponse) {
            super(httpServletResponse);
        }

        private boolean notIgnored(String str) {
            return ("Cache-Control".equalsIgnoreCase(str) || "Pragma".equalsIgnoreCase(str) || "ETag".equalsIgnoreCase(str) || "Expires".equalsIgnoreCase(str) || "Last-Modified".equalsIgnoreCase(str) || HttpHeaders.AGE.equalsIgnoreCase(str)) ? false : true;
        }

        @Override // p149l.qkl, javax.servlet.http.HttpServletResponse
        public void addDateHeader(String str, long j) {
            if (notIgnored(str)) {
                super.addDateHeader(str, j);
            }
        }

        @Override // p149l.qkl, javax.servlet.http.HttpServletResponse
        public void addHeader(String str, String str2) {
            if (notIgnored(str)) {
                super.addHeader(str, str2);
            }
        }

        @Override // p149l.qkl, javax.servlet.http.HttpServletResponse
        public void setDateHeader(String str, long j) {
            if (notIgnored(str)) {
                super.setDateHeader(str, j);
            }
        }

        @Override // p149l.qkl, javax.servlet.http.HttpServletResponse
        public void setHeader(String str, String str2) {
            if (notIgnored(str)) {
                super.setHeader(str, str2);
            }
        }
    }

    public FormAuthenticator(String str, String str2, boolean z) {
        this();
        if (str != null) {
            setLoginPage(str);
        }
        if (str2 != null) {
            setErrorPage(str2);
        }
        this._dispatch = z;
    }

    private void setErrorPage(String str) {
        if (str == null || str.trim().length() == 0) {
            this._formErrorPath = null;
            this._formErrorPage = null;
            return;
        }
        if (!str.startsWith("/")) {
            LOG.warn("form-error-page must start with /", new Object[0]);
            str = "/".concat(str);
        }
        this._formErrorPage = str;
        this._formErrorPath = str;
        if (str.indexOf(63) > 0) {
            String str2 = this._formErrorPath;
            this._formErrorPath = str2.substring(0, str2.indexOf(63));
        }
    }

    private void setLoginPage(String str) {
        if (!str.startsWith("/")) {
            LOG.warn("form-login-page must start with /", new Object[0]);
            str = "/".concat(str);
        }
        this._formLoginPage = str;
        this._formLoginPath = str;
        if (str.indexOf(63) > 0) {
            String str2 = this._formLoginPath;
            this._formLoginPath = str2.substring(0, str2.indexOf(63));
        }
    }

    public boolean getAlwaysSaveUri() {
        return this._alwaysSaveUri;
    }

    @Override // org.eclipse.jetty.security.Authenticator
    public String getAuthMethod() {
        return Constraint.__FORM_AUTH;
    }

    public boolean isJSecurityCheck(String str) {
        char cCharAt;
        int iIndexOf = str.indexOf(__J_SECURITY_CHECK);
        if (iIndexOf < 0) {
            return false;
        }
        int i = iIndexOf + 17;
        return i == str.length() || (cCharAt = str.charAt(i)) == ';' || cCharAt == '#' || cCharAt == '/' || cCharAt == '?';
    }

    public boolean isLoginOrErrorPage(String str) {
        if (str != null) {
            return str.equals(this._formErrorPath) || str.equals(this._formLoginPath);
        }
        return false;
    }

    @Override // org.eclipse.jetty.security.authentication.LoginAuthenticator
    public UserIdentity login(String str, Object obj, bke0 bke0Var) {
        UserIdentity userIdentityLogin = super.login(str, obj, bke0Var);
        if (userIdentityLogin != null) {
            ((HttpServletRequest) bke0Var).getSession(true).setAttribute(SessionAuthentication.__J_AUTHENTICATED, new SessionAuthentication(getAuthMethod(), userIdentityLogin, obj));
        }
        return userIdentityLogin;
    }

    @Override // org.eclipse.jetty.security.Authenticator
    public boolean secureResponse(bke0 bke0Var, gke0 gke0Var, boolean z, Authentication.User user) throws ServerAuthException {
        return true;
    }

    public void setAlwaysSaveUri(boolean z) {
        this._alwaysSaveUri = z;
    }

    @Override // org.eclipse.jetty.security.authentication.LoginAuthenticator, org.eclipse.jetty.security.Authenticator
    public void setConfiguration(Authenticator.AuthConfiguration authConfiguration) {
        super.setConfiguration(authConfiguration);
        String initParameter = authConfiguration.getInitParameter(__FORM_LOGIN_PAGE);
        if (initParameter != null) {
            setLoginPage(initParameter);
        }
        String initParameter2 = authConfiguration.getInitParameter(__FORM_ERROR_PAGE);
        if (initParameter2 != null) {
            setErrorPage(initParameter2);
        }
        String initParameter3 = authConfiguration.getInitParameter(__FORM_DISPATCH);
        this._dispatch = initParameter3 == null ? this._dispatch : Boolean.valueOf(initParameter3).booleanValue();
    }

    @Override // org.eclipse.jetty.security.Authenticator
    public Authentication validateRequest(bke0 bke0Var, gke0 gke0Var, boolean z) throws ServerAuthException {
        LoginService loginService;
        String contextPath;
        HttpServletRequest httpServletRequest = (HttpServletRequest) bke0Var;
        HttpServletResponse httpServletResponse = (HttpServletResponse) gke0Var;
        String requestURI = httpServletRequest.getRequestURI();
        if (requestURI == null) {
            requestURI = "/";
        }
        if (!z && !isJSecurityCheck(requestURI)) {
            return new DeferredAuthentication(this);
        }
        if (isLoginOrErrorPage(URIUtil.addPaths(httpServletRequest.getServletPath(), httpServletRequest.getPathInfo())) && !DeferredAuthentication.isDeferred(httpServletResponse)) {
            return new DeferredAuthentication(this);
        }
        rkl session = httpServletRequest.getSession(true);
        try {
            if (isJSecurityCheck(requestURI)) {
                String parameter = httpServletRequest.getParameter(__J_USERNAME);
                UserIdentity userIdentityLogin = login(parameter, httpServletRequest.getParameter(__J_PASSWORD), httpServletRequest);
                rkl session2 = httpServletRequest.getSession(true);
                if (userIdentityLogin != null) {
                    synchronized (session2) {
                        try {
                            contextPath = (String) session2.getAttribute(__J_URI);
                            if (contextPath == null || contextPath.length() == 0) {
                                contextPath = httpServletRequest.getContextPath();
                                if (contextPath.length() == 0) {
                                    contextPath = "/";
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    httpServletResponse.setContentLength(0);
                    httpServletResponse.sendRedirect(httpServletResponse.encodeRedirectURL(contextPath));
                    return new FormAuthentication(getAuthMethod(), userIdentityLogin);
                }
                Logger logger = LOG;
                if (logger.isDebugEnabled()) {
                    logger.debug("Form authentication FAILED for " + StringUtil.printable(parameter), new Object[0]);
                }
                String str = this._formErrorPage;
                if (str == null) {
                    if (httpServletResponse != null) {
                        httpServletResponse.sendError(403);
                    }
                } else if (this._dispatch) {
                    ytc0 requestDispatcher = httpServletRequest.getRequestDispatcher(str);
                    httpServletResponse.setHeader("Cache-Control", "No-cache");
                    httpServletResponse.setDateHeader("Expires", 1L);
                    requestDispatcher.forward(new FormRequest(httpServletRequest), new FormResponse(httpServletResponse));
                } else {
                    httpServletResponse.sendRedirect(httpServletResponse.encodeRedirectURL(URIUtil.addPaths(httpServletRequest.getContextPath(), this._formErrorPage)));
                }
                return Authentication.SEND_FAILURE;
            }
            Authentication authentication = (Authentication) session.getAttribute(SessionAuthentication.__J_AUTHENTICATED);
            if (authentication != null) {
                if (!(authentication instanceof Authentication.User) || (loginService = this._loginService) == null || loginService.validate(((Authentication.User) authentication).getUserIdentity())) {
                    String str2 = (String) session.getAttribute(__J_URI);
                    if (str2 != null) {
                        MultiMap<String> multiMap = (MultiMap) session.getAttribute(__J_POST);
                        if (multiMap != null) {
                            StringBuffer requestURL = httpServletRequest.getRequestURL();
                            if (httpServletRequest.getQueryString() != null) {
                                requestURL.append("?");
                                requestURL.append(httpServletRequest.getQueryString());
                            }
                            if (str2.equals(requestURL.toString())) {
                                session.removeAttribute(__J_POST);
                                Request request = bke0Var instanceof Request ? (Request) bke0Var : AbstractHttpConnection.getCurrentConnection().getRequest();
                                request.setMethod("POST");
                                request.setParameters(multiMap);
                                return authentication;
                            }
                        } else {
                            session.removeAttribute(__J_URI);
                        }
                    }
                    return authentication;
                }
                session.removeAttribute(SessionAuthentication.__J_AUTHENTICATED);
            }
            if (DeferredAuthentication.isDeferred(httpServletResponse)) {
                LOG.debug("auth deferred {}", session.getId());
                return Authentication.UNAUTHENTICATED;
            }
            synchronized (session) {
                try {
                    if (session.getAttribute(__J_URI) == null || this._alwaysSaveUri) {
                        StringBuffer requestURL2 = httpServletRequest.getRequestURL();
                        if (httpServletRequest.getQueryString() != null) {
                            requestURL2.append("?");
                            requestURL2.append(httpServletRequest.getQueryString());
                        }
                        session.setAttribute(__J_URI, requestURL2.toString());
                        if (MimeTypes.FORM_ENCODED.equalsIgnoreCase(bke0Var.getContentType()) && "POST".equals(httpServletRequest.getMethod())) {
                            Request request2 = bke0Var instanceof Request ? (Request) bke0Var : AbstractHttpConnection.getCurrentConnection().getRequest();
                            request2.extractParameters();
                            session.setAttribute(__J_POST, new MultiMap((MultiMap) request2.getParameters()));
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this._dispatch) {
                ytc0 requestDispatcher2 = httpServletRequest.getRequestDispatcher(this._formLoginPage);
                httpServletResponse.setHeader("Cache-Control", "No-cache");
                httpServletResponse.setDateHeader("Expires", 1L);
                requestDispatcher2.forward(new FormRequest(httpServletRequest), new FormResponse(httpServletResponse));
            } else {
                httpServletResponse.sendRedirect(httpServletResponse.encodeRedirectURL(URIUtil.addPaths(httpServletRequest.getContextPath(), this._formLoginPage)));
            }
            return Authentication.SEND_CONTINUE;
        } catch (IOException e) {
            throw new ServerAuthException(e);
        } catch (ServletException e2) {
            throw new ServerAuthException(e2);
        }
    }

    public FormAuthenticator() {
    }
}
