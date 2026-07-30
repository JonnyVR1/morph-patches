package org.eclipse.jetty.security;

import org.eclipse.jetty.security.authentication.BasicAuthenticator;
import org.eclipse.jetty.security.authentication.ClientCertAuthenticator;
import org.eclipse.jetty.security.authentication.DigestAuthenticator;
import org.eclipse.jetty.security.authentication.FormAuthenticator;
import org.eclipse.jetty.security.authentication.SpnegoAuthenticator;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.security.Constraint;
import p153l.ase0;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultAuthenticatorFactory implements Authenticator.Factory {
    LoginService _loginService;

    @Override // org.eclipse.jetty.security.Authenticator.Factory
    public Authenticator getAuthenticator(Server server, ase0 ase0Var, Authenticator.AuthConfiguration authConfiguration, IdentityService identityService, LoginService loginService) {
        Authenticator basicAuthenticator;
        String authMethod = authConfiguration.getAuthMethod();
        if (authMethod == null || Constraint.__BASIC_AUTH.equalsIgnoreCase(authMethod)) {
            basicAuthenticator = new BasicAuthenticator();
        } else if (Constraint.__DIGEST_AUTH.equalsIgnoreCase(authMethod)) {
            basicAuthenticator = new DigestAuthenticator();
        } else if (Constraint.__FORM_AUTH.equalsIgnoreCase(authMethod)) {
            basicAuthenticator = new FormAuthenticator();
        } else if (Constraint.__SPNEGO_AUTH.equalsIgnoreCase(authMethod)) {
            basicAuthenticator = new SpnegoAuthenticator();
        } else {
            basicAuthenticator = Constraint.__NEGOTIATE_AUTH.equalsIgnoreCase(authMethod) ? new SpnegoAuthenticator(Constraint.__NEGOTIATE_AUTH) : null;
        }
        return (Constraint.__CERT_AUTH.equalsIgnoreCase(authMethod) || Constraint.__CERT_AUTH2.equalsIgnoreCase(authMethod)) ? new ClientCertAuthenticator() : basicAuthenticator;
    }

    public LoginService getLoginService() {
        return this._loginService;
    }

    public void setLoginService(LoginService loginService) {
        this._loginService = loginService;
    }
}
