package org.eclipse.jetty.security.authentication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.security.Authenticator;
import org.eclipse.jetty.security.IdentityService;
import org.eclipse.jetty.security.LoginService;
import org.eclipse.jetty.server.UserIdentity;
import org.eclipse.jetty.server.session.AbstractSessionManager;
import p149l.bke0;
import p149l.hjd0;
import p149l.rkl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LoginAuthenticator implements Authenticator {
    protected IdentityService _identityService;
    protected LoginService _loginService;
    private boolean _renewSession;

    public LoginService getLoginService() {
        return this._loginService;
    }

    public UserIdentity login(String str, Object obj, bke0 bke0Var) {
        UserIdentity userIdentityLogin = this._loginService.login(str, obj);
        if (userIdentityLogin == null) {
            return null;
        }
        renewSession((HttpServletRequest) bke0Var, null);
        return userIdentityLogin;
    }

    public rkl renewSession(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        rkl rklVarRenewSession;
        rkl session = httpServletRequest.getSession(false);
        if (!this._renewSession || session == null || session.getAttribute(AbstractSessionManager.SESSION_KNOWN_ONLY_TO_AUTHENTICATED) == Boolean.TRUE) {
            return session;
        }
        synchronized (this) {
            rklVarRenewSession = AbstractSessionManager.renewSession(httpServletRequest, session, true);
        }
        return rklVarRenewSession;
    }

    @Override // org.eclipse.jetty.security.Authenticator
    public void setConfiguration(Authenticator.AuthConfiguration authConfiguration) {
        LoginService loginService = authConfiguration.getLoginService();
        this._loginService = loginService;
        if (loginService == null) {
            hjd0.m131368a("No LoginService for ", this, " in ", authConfiguration);
            return;
        }
        IdentityService identityService = authConfiguration.getIdentityService();
        this._identityService = identityService;
        if (identityService != null) {
            this._renewSession = authConfiguration.isSessionRenewedOnAuthentication();
        } else {
            hjd0.m131368a("No IdentityService for ", this, " in ", authConfiguration);
        }
    }
}
