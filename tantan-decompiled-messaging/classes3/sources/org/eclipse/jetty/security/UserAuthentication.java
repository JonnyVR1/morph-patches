package org.eclipse.jetty.security;

import org.eclipse.jetty.server.Authentication;
import org.eclipse.jetty.server.UserIdentity;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class UserAuthentication implements Authentication.User {
    private final String _method;
    private final UserIdentity _userIdentity;

    public UserAuthentication(String str, UserIdentity userIdentity) {
        this._method = str;
        this._userIdentity = userIdentity;
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
        SecurityHandler currentSecurityHandler = SecurityHandler.getCurrentSecurityHandler();
        if (currentSecurityHandler != null) {
            currentSecurityHandler.logout(this);
        }
    }

    public String toString() {
        return "{User," + getAuthMethod() + "," + this._userIdentity + "}";
    }
}
