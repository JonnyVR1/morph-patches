package org.eclipse.jetty.security;

import java.util.Set;
import l.bke0;
import l.gke0;
import l.vje0;
import org.eclipse.jetty.server.Authentication;
import org.eclipse.jetty.server.Server;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
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
        Authenticator getAuthenticator(Server server, vje0 vje0Var, AuthConfiguration authConfiguration, IdentityService identityService, LoginService loginService);
    }

    String getAuthMethod();

    boolean secureResponse(bke0 bke0Var, gke0 gke0Var, boolean z, Authentication.User user) throws ServerAuthException;

    void setConfiguration(AuthConfiguration authConfiguration);

    Authentication validateRequest(bke0 bke0Var, gke0 gke0Var, boolean z) throws ServerAuthException;
}
