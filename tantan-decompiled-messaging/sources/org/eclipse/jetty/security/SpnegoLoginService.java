package org.eclipse.jetty.security;

import com.google.android.gms.common.api.Api;
import java.util.Properties;
import javax.security.auth.Subject;
import org.eclipse.jetty.server.UserIdentity;
import org.eclipse.jetty.util.B64Code;
import org.eclipse.jetty.util.component.AbstractLifeCycle;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.eclipse.jetty.util.resource.Resource;
import org.ietf.jgss.GSSContext;
import org.ietf.jgss.GSSException;
import org.ietf.jgss.GSSManager;
import org.ietf.jgss.Oid;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class SpnegoLoginService extends AbstractLifeCycle implements LoginService {
    private static final Logger LOG = Log.getLogger((Class<?>) SpnegoLoginService.class);
    private String _config;
    protected IdentityService _identityService;
    protected String _name;
    private String _targetName;

    public SpnegoLoginService(String str, String str2) {
        setName(str);
        setConfig(str2);
    }

    @Override // org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        Properties properties = new Properties();
        properties.load(Resource.newResource(this._config).getInputStream());
        String property = properties.getProperty("targetName");
        this._targetName = property;
        LOG.debug("Target Name {}", property);
        super.doStart();
    }

    public String getConfig() {
        return this._config;
    }

    @Override // org.eclipse.jetty.security.LoginService
    public IdentityService getIdentityService() {
        return this._identityService;
    }

    @Override // org.eclipse.jetty.security.LoginService
    public String getName() {
        return this._name;
    }

    @Override // org.eclipse.jetty.security.LoginService
    public UserIdentity login(String str, Object obj) {
        byte[] bArrDecode = B64Code.decode((String) obj);
        GSSManager gSSManager = GSSManager.getInstance();
        try {
            GSSContext gSSContextCreateContext = gSSManager.createContext(gSSManager.createCredential(gSSManager.createName(this._targetName, (Oid) null), Api.BaseClientBuilder.API_PRIORITY_OTHER, new Oid("1.3.6.1.5.5.2"), 2));
            if (gSSContextCreateContext == null) {
                LOG.debug("SpnegoUserRealm: failed to establish GSSContext", new Object[0]);
            } else {
                while (!gSSContextCreateContext.isEstablished()) {
                    bArrDecode = gSSContextCreateContext.acceptSecContext(bArrDecode, 0, bArrDecode.length);
                }
                if (gSSContextCreateContext.isEstablished()) {
                    String string = gSSContextCreateContext.getSrcName().toString();
                    String strSubstring = string.substring(string.indexOf(64) + 1);
                    Logger logger = LOG;
                    logger.debug("SpnegoUserRealm: established a security context", new Object[0]);
                    logger.debug("Client Principal is: " + gSSContextCreateContext.getSrcName(), new Object[0]);
                    logger.debug("Server Principal is: " + gSSContextCreateContext.getTargName(), new Object[0]);
                    logger.debug("Client Default Role: " + strSubstring, new Object[0]);
                    SpnegoUserPrincipal spnegoUserPrincipal = new SpnegoUserPrincipal(string, bArrDecode);
                    Subject subject = new Subject();
                    subject.getPrincipals().add(spnegoUserPrincipal);
                    return this._identityService.newUserIdentity(subject, spnegoUserPrincipal, new String[]{strSubstring});
                }
            }
        } catch (GSSException e) {
            LOG.warn(e);
        }
        return null;
    }

    @Override // org.eclipse.jetty.security.LoginService
    public void logout(UserIdentity userIdentity) {
    }

    public void setConfig(String str) {
        if (isRunning()) {
            qkq0.m175383a("Running");
        } else {
            this._config = str;
        }
    }

    @Override // org.eclipse.jetty.security.LoginService
    public void setIdentityService(IdentityService identityService) {
        this._identityService = identityService;
    }

    public void setName(String str) {
        if (isRunning()) {
            qkq0.m175383a("Running");
        } else {
            this._name = str;
        }
    }

    @Override // org.eclipse.jetty.security.LoginService
    public boolean validate(UserIdentity userIdentity) {
        return false;
    }

    public SpnegoLoginService(String str) {
        setName(str);
    }

    public SpnegoLoginService() {
    }
}
