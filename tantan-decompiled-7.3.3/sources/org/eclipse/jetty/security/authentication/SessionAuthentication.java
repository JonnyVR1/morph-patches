package org.eclipse.jetty.security.authentication;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import org.eclipse.jetty.security.LoginService;
import org.eclipse.jetty.security.SecurityHandler;
import org.eclipse.jetty.server.Authentication;
import org.eclipse.jetty.server.UserIdentity;
import org.eclipse.jetty.server.session.AbstractSessionManager;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import p153l.hnl;
import p153l.inl;
import p153l.knl;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
public class SessionAuthentication implements Authentication.User, Serializable, inl, knl {
    private static final Logger LOG = Log.getLogger((Class<?>) SessionAuthentication.class);
    public static final String __J_AUTHENTICATED = "org.eclipse.jetty.security.UserIdentity";
    private static final long serialVersionUID = -4643200685888258706L;
    private final Object _credentials;
    private final String _method;
    private final String _name;
    private transient hnl _session;
    private transient UserIdentity _userIdentity;

    public SessionAuthentication(String str, UserIdentity userIdentity, Object obj) {
        this._method = str;
        this._userIdentity = userIdentity;
        this._name = userIdentity.getUserPrincipal().getName();
        this._credentials = obj;
    }

    private void doLogout() {
        SecurityHandler currentSecurityHandler = SecurityHandler.getCurrentSecurityHandler();
        if (currentSecurityHandler != null) {
            currentSecurityHandler.logout(this);
        }
        hnl hnlVar = this._session;
        if (hnlVar != null) {
            hnlVar.removeAttribute(AbstractSessionManager.SESSION_KNOWN_ONLY_TO_AUTHENTICATED);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        SecurityHandler currentSecurityHandler = SecurityHandler.getCurrentSecurityHandler();
        if (currentSecurityHandler == null) {
            wtq0.m207906a("!SecurityHandler");
            return;
        }
        LoginService loginService = currentSecurityHandler.getLoginService();
        if (loginService == null) {
            wtq0.m207906a("!LoginService");
        } else {
            this._userIdentity = loginService.login(this._name, this._credentials);
            LOG.debug("Deserialized and relogged in {}", this);
        }
    }

    @Override // org.eclipse.jetty.server.Authentication.User
    public String getAuthMethod() {
        return this._method;
    }

    @Override // org.eclipse.jetty.server.Authentication.User
    public UserIdentity getUserIdentity() {
        return this._userIdentity;
    }

    @Override // org.eclipse.jetty.server.Authentication.User
    public boolean isUserInRole(UserIdentity.Scope scope, String str) {
        return this._userIdentity.isUserInRole(str, scope);
    }

    @Override // org.eclipse.jetty.server.Authentication.User
    public void logout() {
        hnl hnlVar = this._session;
        if (hnlVar != null && hnlVar.getAttribute(__J_AUTHENTICATED) != null) {
            this._session.removeAttribute(__J_AUTHENTICATED);
        }
        doLogout();
    }

    @Override // p153l.inl
    public void sessionDidActivate(HttpSessionEvent httpSessionEvent) {
        if (this._session == null) {
            this._session = httpSessionEvent.getSession();
        }
    }

    @Override // p153l.inl
    public void sessionWillPassivate(HttpSessionEvent httpSessionEvent) {
    }

    public String toString() {
        return "Session" + super.toString();
    }

    @Override // p153l.knl
    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {
        if (this._session == null) {
            this._session = httpSessionBindingEvent.getSession();
        }
    }

    @Override // p153l.knl
    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
        doLogout();
    }
}
