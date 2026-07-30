package org.eclipse.jetty.security;

import java.io.IOException;
import java.security.Principal;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.servlet.DispatcherType;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSessionEvent;
import org.eclipse.jetty.security.authentication.DeferredAuthentication;
import org.eclipse.jetty.server.AbstractHttpConnection;
import org.eclipse.jetty.server.Authentication;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Response;
import org.eclipse.jetty.server.UserIdentity;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.HandlerWrapper;
import org.eclipse.jetty.server.session.AbstractSessionManager;
import org.eclipse.jetty.util.component.LifeCycle;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import p153l.mnl;
import p153l.wtq0;
import p153l.xtq0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SecurityHandler extends HandlerWrapper implements Authenticator.AuthConfiguration {
    private String _authMethod;
    private Authenticator _authenticator;
    private IdentityService _identityService;
    private LoginService _loginService;
    private boolean _loginServiceShared;
    private String _realmName;
    private static final Logger LOG = Log.getLogger((Class<?>) SecurityHandler.class);
    public static Principal __NO_USER = new Principal() { // from class: org.eclipse.jetty.security.SecurityHandler.2
        @Override // java.security.Principal
        public String getName() {
            return null;
        }

        @Override // java.security.Principal
        public String toString() {
            return "No User";
        }
    };
    public static Principal __NOBODY = new Principal() { // from class: org.eclipse.jetty.security.SecurityHandler.3
        @Override // java.security.Principal
        public String getName() {
            return "Nobody";
        }

        @Override // java.security.Principal
        public String toString() {
            return getName();
        }
    };
    private boolean _checkWelcomeFiles = false;
    private Authenticator.Factory _authenticatorFactory = new DefaultAuthenticatorFactory();
    private final Map<String, String> _initParameters = new HashMap();
    private boolean _renewSession = true;

    /* JADX INFO: renamed from: org.eclipse.jetty.security.SecurityHandler$4 */
    public static /* synthetic */ class C220404 {
        static final /* synthetic */ int[] $SwitchMap$javax$servlet$DispatcherType;

        static {
            int[] iArr = new int[DispatcherType.values().length];
            $SwitchMap$javax$servlet$DispatcherType = iArr;
            try {
                iArr[DispatcherType.REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$javax$servlet$DispatcherType[DispatcherType.ASYNC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$javax$servlet$DispatcherType[DispatcherType.FORWARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class NotChecked implements Principal {
        public NotChecked() {
        }

        @Override // java.security.Principal
        public String getName() {
            return null;
        }

        public SecurityHandler getSecurityHandler() {
            return SecurityHandler.this;
        }

        @Override // java.security.Principal
        public String toString() {
            return "NOT CHECKED";
        }
    }

    public static SecurityHandler getCurrentSecurityHandler() {
        ContextHandler.Context currentContext = ContextHandler.getCurrentContext();
        if (currentContext == null) {
            return null;
        }
        return (SecurityHandler) currentContext.getContextHandler().getChildHandlerByClass(SecurityHandler.class);
    }

    public boolean checkSecurity(Request request) {
        int i = C220404.$SwitchMap$javax$servlet$DispatcherType[request.getDispatcherType().ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i != 3 || !this._checkWelcomeFiles || request.getAttribute("org.eclipse.jetty.server.welcome") == null) {
            return false;
        }
        request.removeAttribute("org.eclipse.jetty.server.welcome");
        return true;
    }

    public abstract boolean checkUserDataPermissions(String str, Request request, Response response, Object obj) throws IOException;

    public abstract boolean checkWebResourcePermissions(String str, Request request, Response response, Object obj, UserIdentity userIdentity) throws IOException;

    @Override // org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        SecurityHandler securityHandler;
        Authenticator.Factory factory;
        ContextHandler.Context currentContext = ContextHandler.getCurrentContext();
        if (currentContext != null) {
            Enumeration initParameterNames = currentContext.getInitParameterNames();
            while (initParameterNames != null && initParameterNames.hasMoreElements()) {
                String str = (String) initParameterNames.nextElement();
                if (str.startsWith("org.eclipse.jetty.security.") && getInitParameter(str) == null) {
                    setInitParameter(str, currentContext.getInitParameter(str));
                }
            }
            currentContext.getContextHandler().addEventListener(new mnl() { // from class: org.eclipse.jetty.security.SecurityHandler.1
                @Override // p153l.mnl
                public void sessionCreated(HttpSessionEvent httpSessionEvent) {
                    Request request;
                    AbstractHttpConnection currentConnection = AbstractHttpConnection.getCurrentConnection();
                    if (currentConnection == null || (request = currentConnection.getRequest()) == null || !request.isSecure()) {
                        return;
                    }
                    httpSessionEvent.getSession().setAttribute(AbstractSessionManager.SESSION_KNOWN_ONLY_TO_AUTHENTICATED, Boolean.TRUE);
                }

                @Override // p153l.mnl
                public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
                }
            });
        }
        if (this._loginService == null) {
            LoginService loginServiceFindLoginService = findLoginService();
            this._loginService = loginServiceFindLoginService;
            if (loginServiceFindLoginService != null) {
                this._loginServiceShared = true;
            }
        }
        if (this._identityService == null) {
            LoginService loginService = this._loginService;
            if (loginService != null) {
                this._identityService = loginService.getIdentityService();
            }
            System.err.println("Null identity service, trying login service: " + this._identityService);
            if (this._identityService == null) {
                this._identityService = findIdentityService();
            }
            System.err.println("Finding identity service: " + this._identityService);
            if (this._identityService == null && this._realmName != null) {
                this._identityService = new DefaultIdentityService();
            }
        }
        if (this._loginService != null) {
            System.err.println("LoginService=" + this._loginService + " identityService=" + this._identityService);
            IdentityService identityService = this._loginService.getIdentityService();
            LoginService loginService2 = this._loginService;
            if (identityService == null) {
                loginService2.setIdentityService(this._identityService);
            } else if (loginService2.getIdentityService() != this._identityService) {
                xtq0.m213103a("LoginService has different IdentityService to ", this);
                return;
            }
        }
        if (!this._loginServiceShared) {
            LoginService loginService3 = this._loginService;
            if (loginService3 instanceof LifeCycle) {
                ((LifeCycle) loginService3).start();
            }
        }
        if (this._authenticator != null || (factory = this._authenticatorFactory) == null || this._identityService == null) {
            securityHandler = this;
        } else {
            securityHandler = this;
            Authenticator authenticator = factory.getAuthenticator(getServer(), ContextHandler.getCurrentContext(), securityHandler, this._identityService, this._loginService);
            securityHandler._authenticator = authenticator;
            if (authenticator != null) {
                securityHandler._authMethod = authenticator.getAuthMethod();
            }
        }
        Authenticator authenticator2 = securityHandler._authenticator;
        if (authenticator2 != null) {
            authenticator2.setConfiguration(securityHandler);
            Authenticator authenticator3 = securityHandler._authenticator;
            if (authenticator3 instanceof LifeCycle) {
                ((LifeCycle) authenticator3).start();
            }
        } else if (securityHandler._realmName != null) {
            LOG.warn("No ServerAuthentication for " + securityHandler, new Object[0]);
            wtq0.m207906a("No ServerAuthentication");
            return;
        }
        super.doStart();
    }

    @Override // org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStop() throws Exception {
        super.doStop();
        if (this._loginServiceShared) {
            return;
        }
        LoginService loginService = this._loginService;
        if (loginService instanceof LifeCycle) {
            ((LifeCycle) loginService).stop();
        }
    }

    public IdentityService findIdentityService() {
        return (IdentityService) getServer().getBean(IdentityService.class);
    }

    public LoginService findLoginService() {
        List<LoginService> beans = getServer().getBeans(LoginService.class);
        String realmName = getRealmName();
        if (realmName == null) {
            if (beans.size() == 1) {
                return (LoginService) beans.get(0);
            }
            return null;
        }
        for (LoginService loginService : beans) {
            if (loginService.getName() != null && loginService.getName().equals(realmName)) {
                return loginService;
            }
        }
        return null;
    }

    @Override // org.eclipse.jetty.security.Authenticator.AuthConfiguration
    public String getAuthMethod() {
        return this._authMethod;
    }

    public Authenticator getAuthenticator() {
        return this._authenticator;
    }

    public Authenticator.Factory getAuthenticatorFactory() {
        return this._authenticatorFactory;
    }

    @Override // org.eclipse.jetty.security.Authenticator.AuthConfiguration
    public IdentityService getIdentityService() {
        return this._identityService;
    }

    @Override // org.eclipse.jetty.security.Authenticator.AuthConfiguration
    public String getInitParameter(String str) {
        return this._initParameters.get(str);
    }

    @Override // org.eclipse.jetty.security.Authenticator.AuthConfiguration
    public Set<String> getInitParameterNames() {
        return this._initParameters.keySet();
    }

    @Override // org.eclipse.jetty.security.Authenticator.AuthConfiguration
    public LoginService getLoginService() {
        return this._loginService;
    }

    @Override // org.eclipse.jetty.security.Authenticator.AuthConfiguration
    public String getRealmName() {
        return this._realmName;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0145  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    @Override // org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.Handler
    public void handle(String str, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Throwable {
        HttpServletResponse httpServletResponse2;
        IdentityService identityService;
        IdentityService identityService2;
        HttpServletRequest httpServletRequest2 = httpServletRequest;
        HttpServletResponse httpServletResponse3 = httpServletResponse;
        Response response = request.getResponse();
        Handler handler = getHandler();
        if (handler == null) {
            return;
        }
        Authenticator authenticator = this._authenticator;
        if (!checkSecurity(request)) {
            handler.handle(str, request, httpServletRequest2, httpServletResponse3);
            return;
        }
        Object objPrepareConstraintInfo = prepareConstraintInfo(str, request);
        if (!checkUserDataPermissions(str, request, response, objPrepareConstraintInfo)) {
            if (request.isHandled()) {
                return;
            }
            httpServletResponse3.sendError(403);
            request.setHandled(true);
            return;
        }
        boolean zIsAuthMandatory = isAuthMandatory(request, response, objPrepareConstraintInfo);
        if (zIsAuthMandatory && authenticator == null) {
            LOG.warn("No authenticator for: " + objPrepareConstraintInfo, new Object[0]);
            if (request.isHandled()) {
                return;
            }
            httpServletResponse3.sendError(403);
            request.setHandled(true);
            return;
        }
        Object objAssociate = null;
        try {
            try {
                Authentication authentication = request.getAuthentication();
                if (authentication == null || authentication == Authentication.NOT_CHECKED) {
                    authentication = authenticator == null ? Authentication.UNAUTHENTICATED : authenticator.validateRequest(httpServletRequest2, httpServletResponse3, zIsAuthMandatory);
                }
                if (authentication instanceof Authentication.Wrapped) {
                    httpServletRequest2 = ((Authentication.Wrapped) authentication).getHttpServletRequest();
                    httpServletResponse3 = ((Authentication.Wrapped) authentication).getHttpServletResponse();
                }
                httpServletResponse2 = httpServletResponse3;
                try {
                    if (authentication instanceof Authentication.ResponseSent) {
                        request.setHandled(true);
                    } else {
                        if (!(authentication instanceof Authentication.User)) {
                            if (authentication instanceof Authentication.Deferred) {
                                DeferredAuthentication deferredAuthentication = (DeferredAuthentication) authentication;
                                request.setAuthentication(authentication);
                                try {
                                    handler.handle(str, request, httpServletRequest2, httpServletResponse2);
                                    Object previousAssociation = deferredAuthentication.getPreviousAssociation();
                                    if (authenticator != null) {
                                        try {
                                            Authentication authentication2 = request.getAuthentication();
                                            if (authentication2 instanceof Authentication.User) {
                                                authenticator.secureResponse(httpServletRequest2, httpServletResponse2, zIsAuthMandatory, (Authentication.User) authentication2);
                                            } else {
                                                authenticator.secureResponse(httpServletRequest2, httpServletResponse2, zIsAuthMandatory, null);
                                            }
                                        } catch (ServerAuthException e) {
                                            e = e;
                                            objAssociate = previousAssociation;
                                            httpServletResponse2.sendError(500, e.getMessage());
                                            identityService2 = this._identityService;
                                            if (identityService2 == null) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            objAssociate = previousAssociation;
                                            identityService = this._identityService;
                                            if (identityService != null) {
                                                identityService.disassociate(objAssociate);
                                            }
                                            throw th;
                                        }
                                    }
                                    objAssociate = previousAssociation;
                                } catch (Throwable th2) {
                                    deferredAuthentication.getPreviousAssociation();
                                    throw th2;
                                }
                            } else {
                                request.setAuthentication(authentication);
                                IdentityService identityService3 = this._identityService;
                                Object objAssociate2 = identityService3 != null ? identityService3.associate(null) : null;
                                try {
                                    handler.handle(str, request, httpServletRequest2, httpServletResponse2);
                                    if (authenticator != null) {
                                        authenticator.secureResponse(httpServletRequest2, httpServletResponse2, zIsAuthMandatory, null);
                                    }
                                    objAssociate = objAssociate2;
                                } catch (ServerAuthException e2) {
                                    e = e2;
                                    objAssociate = objAssociate2;
                                    httpServletResponse2.sendError(500, e.getMessage());
                                    identityService2 = this._identityService;
                                    if (identityService2 == null) {
                                        return;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    objAssociate = objAssociate2;
                                    identityService = this._identityService;
                                    if (identityService != null) {
                                        identityService.disassociate(objAssociate);
                                    }
                                    throw th;
                                }
                            }
                            identityService2.disassociate(objAssociate);
                        }
                        Authentication.User user = (Authentication.User) authentication;
                        request.setAuthentication(authentication);
                        IdentityService identityService4 = this._identityService;
                        objAssociate = identityService4 != null ? identityService4.associate(user.getUserIdentity()) : null;
                        if (zIsAuthMandatory && !checkWebResourcePermissions(str, request, response, objPrepareConstraintInfo, user.getUserIdentity())) {
                            httpServletResponse2.sendError(403, "!role");
                            request.setHandled(true);
                            IdentityService identityService5 = this._identityService;
                            if (identityService5 != null) {
                                identityService5.disassociate(objAssociate);
                                return;
                            }
                            return;
                        }
                        handler.handle(str, request, httpServletRequest2, httpServletResponse2);
                        if (authenticator != null) {
                            authenticator.secureResponse(httpServletRequest2, httpServletResponse2, zIsAuthMandatory, user);
                        }
                    }
                    identityService2 = this._identityService;
                    if (identityService2 == null) {
                        return;
                    }
                } catch (ServerAuthException e3) {
                    e = e3;
                }
            } catch (ServerAuthException e4) {
                e = e4;
                httpServletResponse2 = httpServletResponse3;
            }
            identityService2.disassociate(objAssociate);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public abstract boolean isAuthMandatory(Request request, Response response, Object obj);

    public boolean isCheckWelcomeFiles() {
        return this._checkWelcomeFiles;
    }

    @Override // org.eclipse.jetty.security.Authenticator.AuthConfiguration
    public boolean isSessionRenewedOnAuthentication() {
        return this._renewSession;
    }

    public void logout(Authentication.User user) {
        LOG.debug("logout {}", user);
        LoginService loginService = getLoginService();
        if (loginService != null) {
            loginService.logout(user.getUserIdentity());
        }
        IdentityService identityService = getIdentityService();
        if (identityService != null) {
            identityService.disassociate(null);
        }
    }

    public abstract Object prepareConstraintInfo(String str, Request request);

    public void setAuthMethod(String str) {
        if (isRunning()) {
            wtq0.m207906a("running");
        } else {
            this._authMethod = str;
        }
    }

    public void setAuthenticator(Authenticator authenticator) {
        if (isStarted()) {
            wtq0.m207906a("Started");
        } else {
            this._authenticator = authenticator;
        }
    }

    public void setAuthenticatorFactory(Authenticator.Factory factory) {
        if (isRunning()) {
            wtq0.m207906a("running");
        } else {
            this._authenticatorFactory = factory;
        }
    }

    public void setCheckWelcomeFiles(boolean z) {
        if (isRunning()) {
            wtq0.m207906a("running");
        } else {
            this._checkWelcomeFiles = z;
        }
    }

    public void setIdentityService(IdentityService identityService) {
        if (isStarted()) {
            wtq0.m207906a("Started");
        } else {
            this._identityService = identityService;
        }
    }

    public String setInitParameter(String str, String str2) {
        if (!isRunning()) {
            return this._initParameters.put(str, str2);
        }
        wtq0.m207906a("running");
        return null;
    }

    public void setLoginService(LoginService loginService) {
        if (isStarted()) {
            wtq0.m207906a("Started");
        } else {
            this._loginService = loginService;
            this._loginServiceShared = false;
        }
    }

    public void setRealmName(String str) {
        if (isRunning()) {
            wtq0.m207906a("running");
        } else {
            this._realmName = str;
        }
    }

    public void setSessionRenewedOnAuthentication(boolean z) {
        this._renewSession = z;
    }
}
