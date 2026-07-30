package org.eclipse.jetty.security;

import java.util.Set;
import org.eclipse.jetty.server.Authentication;
import org.eclipse.jetty.server.Server;
import p153l.ase0;
import p153l.gse0;
import p153l.lse0;

/* JADX INFO: loaded from: classes2.dex */
public interface Authenticator {

    public interface AuthConfiguration {
        String getAuthMethod();

        IdentityService getIdentityService();

        String getInitParameter(String str);

        Set<String> getInitParameterNames();

        LoginService getLoginService();

        String getRealmName();

        boolean isSessionRenewedOnAuthentication();
    }

    public interface Factory {
        Authenticator getAuthenticator(Server server, ase0 ase0Var, AuthConfiguration authConfiguration, IdentityService identityService, LoginService loginService);
    }

    String getAuthMethod();

    boolean secureResponse(gse0 gse0Var, lse0 lse0Var, boolean z, Authentication.User user) throws ServerAuthException;

    void setConfiguration(AuthConfiguration authConfiguration);

    Authentication validateRequest(gse0 gse0Var, lse0 lse0Var, boolean z) throws ServerAuthException;
}
