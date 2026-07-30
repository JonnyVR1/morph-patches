package org.eclipse.jetty.security;

import java.io.IOException;
import java.io.Serializable;
import java.security.Principal;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.security.auth.Subject;
import l.qkq0;
import org.eclipse.jetty.server.UserIdentity;
import org.eclipse.jetty.util.component.AbstractLifeCycle;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.eclipse.jetty.util.security.Credential;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class MappedLoginService extends AbstractLifeCycle implements LoginService {
    private static final Logger LOG = Log.getLogger((Class<?>) MappedLoginService.class);
    protected String _name;
    protected IdentityService _identityService = new DefaultIdentityService();
    protected final ConcurrentMap<String, UserIdentity> _users = new ConcurrentHashMap();

    public static class Anonymous implements UserPrincipal, Serializable {
        private static final long serialVersionUID = 1097640442553284845L;

        @Override // org.eclipse.jetty.security.MappedLoginService.UserPrincipal
        public boolean authenticate(Object obj) {
            return false;
        }

        @Override // java.security.Principal
        public String getName() {
            return "Anonymous";
        }

        @Override // org.eclipse.jetty.security.MappedLoginService.UserPrincipal
        public boolean isAuthenticated() {
            return false;
        }
    }

    public static class KnownUser implements UserPrincipal, Serializable {
        private static final long serialVersionUID = -6226920753748399662L;
        private final Credential _credential;
        private final String _name;

        public KnownUser(String str, Credential credential) {
            this._name = str;
            this._credential = credential;
        }

        @Override // org.eclipse.jetty.security.MappedLoginService.UserPrincipal
        public boolean authenticate(Object obj) {
            Credential credential = this._credential;
            return credential != null && credential.check(obj);
        }

        @Override // java.security.Principal
        public String getName() {
            return this._name;
        }

        @Override // org.eclipse.jetty.security.MappedLoginService.UserPrincipal
        public boolean isAuthenticated() {
            return true;
        }

        @Override // java.security.Principal
        public String toString() {
            return this._name;
        }
    }

    public static class RolePrincipal implements Principal, Serializable {
        private static final long serialVersionUID = 2998397924051854402L;
        private final String _roleName;

        public RolePrincipal(String str) {
            this._roleName = str;
        }

        @Override // java.security.Principal
        public String getName() {
            return this._roleName;
        }
    }

    public interface UserPrincipal extends Principal, Serializable {
        boolean authenticate(Object obj);

        boolean isAuthenticated();
    }

    @Override // org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        loadUsers();
        super.doStart();
    }

    @Override // org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStop() throws Exception {
        super.doStop();
    }

    @Override // org.eclipse.jetty.security.LoginService
    public IdentityService getIdentityService() {
        return this._identityService;
    }

    @Override // org.eclipse.jetty.security.LoginService
    public String getName() {
        return this._name;
    }

    public ConcurrentMap<String, UserIdentity> getUsers() {
        return this._users;
    }

    public abstract UserIdentity loadUser(String str);

    public abstract void loadUsers() throws IOException;

    public UserIdentity login(String str, Object obj) {
        UserIdentity userIdentityLoadUser = this._users.get(str);
        if (userIdentityLoadUser == null) {
            userIdentityLoadUser = loadUser(str);
        }
        if (userIdentityLoadUser == null || !((UserPrincipal) userIdentityLoadUser.getUserPrincipal()).authenticate(obj)) {
            return null;
        }
        return userIdentityLoadUser;
    }

    @Override // org.eclipse.jetty.security.LoginService
    public void logout(UserIdentity userIdentity) {
        LOG.debug("logout {}", userIdentity);
    }

    public synchronized UserIdentity putUser(String str, Object obj) {
        UserIdentity userIdentityNewUserIdentity;
        try {
            if (obj instanceof UserIdentity) {
                userIdentityNewUserIdentity = (UserIdentity) obj;
            } else {
                Credential credential = obj instanceof Credential ? (Credential) obj : Credential.getCredential(obj.toString());
                KnownUser knownUser = new KnownUser(str, credential);
                Subject subject = new Subject();
                subject.getPrincipals().add(knownUser);
                subject.getPrivateCredentials().add(credential);
                subject.setReadOnly();
                userIdentityNewUserIdentity = this._identityService.newUserIdentity(subject, knownUser, IdentityService.NO_ROLES);
            }
            this._users.put(str, userIdentityNewUserIdentity);
        } catch (Throwable th) {
            throw th;
        }
        return userIdentityNewUserIdentity;
    }

    public void removeUser(String str) {
        this._users.remove(str);
    }

    @Override // org.eclipse.jetty.security.LoginService
    public void setIdentityService(IdentityService identityService) {
        if (isRunning()) {
            qkq0.a("Running");
        } else {
            this._identityService = identityService;
        }
    }

    public void setName(String str) {
        if (isRunning()) {
            qkq0.a("Running");
        } else {
            this._name = str;
        }
    }

    public void setUsers(Map<String, UserIdentity> map) {
        if (isRunning()) {
            qkq0.a("Running");
        } else {
            this._users.clear();
            this._users.putAll(map);
        }
    }

    public String toString() {
        return getClass().getSimpleName() + "[" + this._name + "]";
    }

    @Override // org.eclipse.jetty.security.LoginService
    public boolean validate(UserIdentity userIdentity) {
        return this._users.containsKey(userIdentity.getUserPrincipal().getName()) || loadUser(userIdentity.getUserPrincipal().getName()) != null;
    }

    public synchronized UserIdentity putUser(String str, Credential credential, String[] strArr) {
        UserIdentity userIdentityNewUserIdentity;
        try {
            KnownUser knownUser = new KnownUser(str, credential);
            Subject subject = new Subject();
            subject.getPrincipals().add(knownUser);
            subject.getPrivateCredentials().add(credential);
            if (strArr != null) {
                for (String str2 : strArr) {
                    subject.getPrincipals().add(new RolePrincipal(str2));
                }
            }
            subject.setReadOnly();
            userIdentityNewUserIdentity = this._identityService.newUserIdentity(subject, knownUser, strArr);
            this._users.put(str, userIdentityNewUserIdentity);
        } catch (Throwable th) {
            throw th;
        }
        return userIdentityNewUserIdentity;
    }
}
