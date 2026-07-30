package org.eclipse.jetty.security.authentication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.security.Authenticator;
import org.eclipse.jetty.security.IdentityService;
import org.eclipse.jetty.security.LoginService;
import org.eclipse.jetty.server.UserIdentity;
import org.eclipse.jetty.server.session.AbstractSessionManager;
import p153l.gse0;
import p153l.hnl;
import p153l.krd0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LoginAuthenticator implements Authenticator {
    protected IdentityService _identityService;
    protected LoginService _loginService;
    private boolean _renewSession;

    public LoginService getLoginService() {
        return this._loginService;
    }

    public UserIdentity login(String str, Object obj, gse0 gse0Var) {
        UserIdentity userIdentityLogin = this._loginService.login(str, obj);
        if (userIdentityLogin == null) {
            return null;
        }
        renewSession((HttpServletRequest) gse0Var, null);
        return userIdentityLogin;
    }

    public hnl renewSession(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        hnl hnlVarRenewSession;
        hnl session = httpServletRequest.getSession(false);
        if (!this._renewSession || session == null || session.getAttribute(AbstractSessionManager.SESSION_KNOWN_ONLY_TO_AUTHENTICATED) == Boolean.TRUE) {
            return session;
        }
        synchronized (this) {
            hnlVarRenewSession = AbstractSessionManager.renewSession(httpServletRequest, session, true);
        }
        return hnlVarRenewSession;
    }

    @Override // org.eclipse.jetty.security.Authenticator
    public void setConfiguration(Authenticator.AuthConfiguration authConfiguration) {
        LoginService loginService = authConfiguration.getLoginService();
        this._loginService = loginService;
        if (loginService == null) {
            krd0.m151025a("No LoginService for ", this, " in ", authConfiguration);
            return;
        }
        IdentityService identityService = authConfiguration.getIdentityService();
        this._identityService = identityService;
        if (identityService != null) {
            this._renewSession = authConfiguration.isSessionRenewedOnAuthentication();
        } else {
            krd0.m151025a("No IdentityService for ", this, " in ", authConfiguration);
        }
    }
}
