package org.eclipse.jetty.security.authentication;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.security.ServerAuthException;
import org.eclipse.jetty.security.UserAuthentication;
import org.eclipse.jetty.server.Authentication;
import org.eclipse.jetty.server.UserIdentity;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.eclipse.jetty.util.security.Constraint;
import p153l.gse0;
import p153l.lse0;

/* JADX INFO: loaded from: classes2.dex */
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
    public boolean secureResponse(gse0 gse0Var, lse0 lse0Var, boolean z, Authentication.User user) throws ServerAuthException {
        return true;
    }

    @Override // org.eclipse.jetty.security.Authenticator
    public Authentication validateRequest(gse0 gse0Var, lse0 lse0Var, boolean z) throws ServerAuthException {
        UserIdentity userIdentityLogin;
        HttpServletResponse httpServletResponse = (HttpServletResponse) lse0Var;
        String header = ((HttpServletRequest) gse0Var).getHeader("Authorization");
        if (!z) {
            return new DeferredAuthentication(this);
        }
        if (header != null) {
            return (!header.startsWith(HttpHeaders.NEGOTIATE) || (userIdentityLogin = login(null, header.substring(10), gse0Var)) == null) ? Authentication.UNAUTHENTICATED : new UserAuthentication(getAuthMethod(), userIdentityLogin);
        }
        try {
            if (DeferredAuthentication.isDeferred(httpServletResponse)) {
                return Authentication.UNAUTHENTICATED;
            }
            LOG.debug("SpengoAuthenticator: sending challenge", new Object[0]);
            httpServletResponse.setHeader(HttpHeaders.WWW_AUTHENTICATE, HttpHeaders.NEGOTIATE);
            httpServletResponse.sendError(401);
            return Authentication.SEND_CONTINUE;
        } catch (IOException e) {
            throw new ServerAuthException(e);
        }
    }

    public SpnegoAuthenticator(String str) {
        this._authMethod = str;
    }
}
