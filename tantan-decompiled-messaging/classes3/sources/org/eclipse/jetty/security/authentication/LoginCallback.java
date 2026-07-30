package org.eclipse.jetty.security.authentication;

import java.security.Principal;
import javax.security.auth.Subject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface LoginCallback {
    void clearPassword();

    Object getCredential();

    String[] getRoles();

    Subject getSubject();

    String getUserName();

    Principal getUserPrincipal();

    boolean isSuccess();

    void setRoles(String[] strArr);

    void setSuccess(boolean z);

    void setUserPrincipal(Principal principal);
}
