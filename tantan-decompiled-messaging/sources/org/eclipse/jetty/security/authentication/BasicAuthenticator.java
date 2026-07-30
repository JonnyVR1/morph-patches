package org.eclipse.jetty.security.authentication;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.security.ServerAuthException;
import org.eclipse.jetty.security.UserAuthentication;
import org.eclipse.jetty.server.Authentication;
import org.eclipse.jetty.server.UserIdentity;
import org.eclipse.jetty.util.B64Code;
import org.eclipse.jetty.util.security.Constraint;
import p149l.bke0;
import p149l.gke0;

/* JADX INFO: loaded from: classes3.dex */
public class BasicAuthenticator extends LoginAuthenticator {
    @Override // org.eclipse.jetty.security.Authenticator
    public String getAuthMethod() {
        return Constraint.__BASIC_AUTH;
    }

    @Override // org.eclipse.jetty.security.Authenticator
    public boolean secureResponse(bke0 bke0Var, gke0 gke0Var, boolean z, Authentication.User user) throws ServerAuthException {
        return true;
    }

    @Override // org.eclipse.jetty.security.Authenticator
    public Authentication validateRequest(bke0 bke0Var, gke0 gke0Var, boolean z) throws ServerAuthException {
        int iIndexOf;
        String strDecode;
        int iIndexOf2;
        UserIdentity userIdentityLogin;
        HttpServletRequest httpServletRequest = (HttpServletRequest) bke0Var;
        HttpServletResponse httpServletResponse = (HttpServletResponse) gke0Var;
        String header = httpServletRequest.getHeader("Authorization");
        try {
            if (!z) {
                return new DeferredAuthentication(this);
            }
            if (header != null && (iIndexOf = header.indexOf(32)) > 0 && "basic".equalsIgnoreCase(header.substring(0, iIndexOf)) && (iIndexOf2 = (strDecode = B64Code.decode(header.substring(iIndexOf + 1), "ISO-8859-1")).indexOf(58)) > 0 && (userIdentityLogin = login(strDecode.substring(0, iIndexOf2), strDecode.substring(iIndexOf2 + 1), httpServletRequest)) != null) {
                return new UserAuthentication(getAuthMethod(), userIdentityLogin);
            }
            if (DeferredAuthentication.isDeferred(httpServletResponse)) {
                return Authentication.UNAUTHENTICATED;
            }
            httpServletResponse.setHeader(HttpHeaders.WWW_AUTHENTICATE, "basic realm=\"" + this._loginService.getName() + '\"');
            httpServletResponse.sendError(401);
            return Authentication.SEND_CONTINUE;
        } catch (IOException e) {
            throw new ServerAuthException(e);
        }
    }
}
