package org.eclipse.jetty.security.authentication;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import l.bke0;
import l.gke0;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.security.ServerAuthException;
import org.eclipse.jetty.security.UserAuthentication;
import org.eclipse.jetty.server.Authentication;
import org.eclipse.jetty.server.UserIdentity;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.eclipse.jetty.util.security.Constraint;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SpnegoAuthenticator extends LoginAuthenticator {
    private static final Logger LOG = Log.getLogger((Class<?>) SpnegoAuthenticator.class);
    private String _authMethod;

    public SpnegoAuthenticator() {
        this._authMethod = Constraint.__SPNEGO_AUTH;
    }

    @Override // org.eclipse.jetty.security.Authenticator
    public String getAuthMethod() {
        return this._authMethod;
    }

    @Override // org.eclipse.jetty.security.Authenticator
    public boolean secureResponse(bke0 bke0Var, gke0 gke0Var, boolean z, Authentication.User user) throws ServerAuthException {
        return true;
    }

    @Override // org.eclipse.jetty.security.Authenticator
    public Authentication validateRequest(bke0 bke0Var, gke0 gke0Var, boolean z) throws ServerAuthException {
        UserIdentity userIdentityLogin;
        HttpServletResponse httpServletResponse = (HttpServletResponse) gke0Var;
        String header = ((HttpServletRequest) bke0Var).getHeader(HttpHeaders.AUTHORIZATION);
        if (!z) {
            return new DeferredAuthentication(this);
        }
        if (header != null) {
            return (!header.startsWith(HttpHeaders.NEGOTIATE) || (userIdentityLogin = login(null, header.substring(10), bke0Var)) == null) ? Authentication.UNAUTHENTICATED : new UserAuthentication(getAuthMethod(), userIdentityLogin);
        }
        try {
            if (DeferredAuthentication.isDeferred(httpServletResponse)) {
                return Authentication.UNAUTHENTICATED;
            }
            LOG.debug("SpengoAuthenticator: sending challenge", new Object[0]);
            httpServletResponse.setHeader(HttpHeaders.WWW_AUTHENTICATE, HttpHeaders.NEGOTIATE);
            httpServletResponse.sendError(HttpStatus.UNAUTHORIZED_401);
            return Authentication.SEND_CONTINUE;
        } catch (IOException e) {
            throw new ServerAuthException(e);
        }
    }

    public SpnegoAuthenticator(String str) {
        this._authMethod = str;
    }
}
