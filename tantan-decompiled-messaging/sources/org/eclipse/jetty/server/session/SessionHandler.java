package org.eclipse.jetty.server.session;

import java.io.IOException;
import java.util.EnumSet;
import java.util.EventListener;
import javax.servlet.DispatcherType;
import javax.servlet.ServletException;
import javax.servlet.SessionTrackingMode;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.http.HttpCookie;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.SessionManager;
import org.eclipse.jetty.server.handler.ScopedHandler;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import p149l.ohg0;
import p149l.rkl;

/* JADX INFO: loaded from: classes3.dex */
public class SessionHandler extends ScopedHandler {
    private SessionManager _sessionManager;
    static final Logger LOG = Log.getLogger("org.eclipse.jetty.server.session");
    public static final EnumSet<SessionTrackingMode> DEFAULT_TRACKING = EnumSet.of(SessionTrackingMode.COOKIE, SessionTrackingMode.URL);

    public SessionHandler() {
        this(new HashSessionManager());
    }

    public void addEventListener(EventListener eventListener) {
        SessionManager sessionManager = this._sessionManager;
        if (sessionManager != null) {
            sessionManager.addEventListener(eventListener);
        }
    }

    public void checkRequestedSessionId(Request request, HttpServletRequest httpServletRequest) {
        boolean z;
        int iIndexOf;
        char cCharAt;
        Cookie[] cookies;
        String requestedSessionId = httpServletRequest.getRequestedSessionId();
        SessionManager sessionManager = getSessionManager();
        if (requestedSessionId != null && sessionManager != null) {
            rkl httpSession = sessionManager.getHttpSession(requestedSessionId);
            if (httpSession == null || !sessionManager.isValid(httpSession)) {
                return;
            }
            request.setSession(httpSession);
            return;
        }
        if (DispatcherType.REQUEST.equals(request.getDispatcherType())) {
            rkl httpSession2 = null;
            if (!this._sessionManager.isUsingCookies() || (cookies = httpServletRequest.getCookies()) == null || cookies.length <= 0) {
                z = false;
            } else {
                String name = sessionManager.getSessionCookieConfig().getName();
                z = false;
                for (int i = 0; i < cookies.length; i++) {
                    if (name.equalsIgnoreCase(cookies[i].getName())) {
                        requestedSessionId = cookies[i].getValue();
                        Logger logger = LOG;
                        logger.debug("Got Session ID {} from cookie", requestedSessionId);
                        if (requestedSessionId != null) {
                            httpSession2 = sessionManager.getHttpSession(requestedSessionId);
                            if (httpSession2 != null && sessionManager.isValid(httpSession2)) {
                                z = true;
                                break;
                            }
                        } else {
                            logger.warn("null session id from cookie", new Object[0]);
                        }
                        z = true;
                    }
                }
            }
            if (requestedSessionId == null || httpSession2 == null) {
                String requestURI = httpServletRequest.getRequestURI();
                String sessionIdPathParameterNamePrefix = sessionManager.getSessionIdPathParameterNamePrefix();
                if (sessionIdPathParameterNamePrefix != null && (iIndexOf = requestURI.indexOf(sessionIdPathParameterNamePrefix)) >= 0) {
                    int length = iIndexOf + sessionIdPathParameterNamePrefix.length();
                    int i2 = length;
                    while (i2 < requestURI.length() && (cCharAt = requestURI.charAt(i2)) != ';' && cCharAt != '#' && cCharAt != '?' && cCharAt != '/') {
                        i2++;
                    }
                    requestedSessionId = requestURI.substring(length, i2);
                    httpSession2 = sessionManager.getHttpSession(requestedSessionId);
                    Logger logger2 = LOG;
                    if (logger2.isDebugEnabled()) {
                        logger2.debug("Got Session ID {} from URL", requestedSessionId);
                    }
                    z = false;
                }
            }
            request.setRequestedSessionId(requestedSessionId);
            request.setRequestedSessionIdFromCookie(requestedSessionId != null && z);
            if (httpSession2 == null || !sessionManager.isValid(httpSession2)) {
                return;
            }
            request.setSession(httpSession2);
        }
    }

    public void clearEventListeners() {
        SessionManager sessionManager = this._sessionManager;
        if (sessionManager != null) {
            sessionManager.clearEventListeners();
        }
    }

    @Override // org.eclipse.jetty.server.handler.ScopedHandler
    public void doHandle(String str, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        if (never()) {
            nextHandle(str, request, httpServletRequest, httpServletResponse);
            return;
        }
        ScopedHandler scopedHandler = this._nextScope;
        if (scopedHandler != null && scopedHandler == this._handler) {
            scopedHandler.doHandle(str, request, httpServletRequest, httpServletResponse);
            return;
        }
        Handler handler = this._handler;
        if (handler != null) {
            handler.handle(str, request, httpServletRequest, httpServletResponse);
        }
    }

    @Override // org.eclipse.jetty.server.handler.ScopedHandler
    public void doScope(String str, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Throwable {
        SessionManager sessionManager;
        rkl session;
        rkl session2;
        rkl rklVar = null;
        try {
            sessionManager = request.getSessionManager();
            try {
                session = request.getSession(false);
                try {
                    SessionManager sessionManager2 = this._sessionManager;
                    if (sessionManager != sessionManager2) {
                        request.setSessionManager(sessionManager2);
                        request.setSession(null);
                        checkRequestedSessionId(request, httpServletRequest);
                    }
                    if (this._sessionManager != null) {
                        session2 = request.getSession(false);
                        if (session2 == null) {
                            session2 = request.recoverNewSession(this._sessionManager);
                            if (session2 != null) {
                                request.setSession(session2);
                            }
                        } else if (session2 != session) {
                            try {
                                HttpCookie httpCookieAccess = this._sessionManager.access(session2, httpServletRequest.isSecure());
                                if (httpCookieAccess != null) {
                                    request.getResponse().addCookie(httpCookieAccess);
                                }
                                rklVar = session2;
                            } catch (Throwable th) {
                                th = th;
                                rklVar = session2;
                                if (rklVar != null) {
                                    this._sessionManager.complete(rklVar);
                                }
                                rkl session3 = request.getSession(false);
                                if (session3 != null && session == null && session3 != rklVar) {
                                    this._sessionManager.complete(session3);
                                }
                                if (sessionManager != null && sessionManager != this._sessionManager) {
                                    request.setSessionManager(sessionManager);
                                    request.setSession(session);
                                }
                                throw th;
                            }
                        }
                        rkl rklVar2 = session2;
                        session2 = null;
                        rklVar = rklVar2;
                    } else {
                        session2 = null;
                    }
                    Logger logger = LOG;
                    if (logger.isDebugEnabled()) {
                        logger.debug("sessionManager=" + this._sessionManager, new Object[0]);
                        logger.debug("session=" + rklVar, new Object[0]);
                    }
                    ScopedHandler scopedHandler = this._nextScope;
                    if (scopedHandler != null) {
                        scopedHandler.doScope(str, request, httpServletRequest, httpServletResponse);
                    } else {
                        ScopedHandler scopedHandler2 = this._outerScope;
                        if (scopedHandler2 != null) {
                            scopedHandler2.doHandle(str, request, httpServletRequest, httpServletResponse);
                        } else {
                            doHandle(str, request, httpServletRequest, httpServletResponse);
                        }
                    }
                    if (session2 != null) {
                        this._sessionManager.complete(session2);
                    }
                    rkl session4 = request.getSession(false);
                    if (session4 != null && session == null && session4 != session2) {
                        this._sessionManager.complete(session4);
                    }
                    if (sessionManager == null || sessionManager == this._sessionManager) {
                        return;
                    }
                    request.setSessionManager(sessionManager);
                    request.setSession(session);
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                session = null;
            }
        } catch (Throwable th4) {
            th = th4;
            sessionManager = null;
            session = null;
        }
    }

    @Override // org.eclipse.jetty.server.handler.ScopedHandler, org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        this._sessionManager.start();
        super.doStart();
    }

    @Override // org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStop() throws Exception {
        this._sessionManager.stop();
        super.doStop();
    }

    public SessionManager getSessionManager() {
        return this._sessionManager;
    }

    @Override // org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.server.Handler
    public void setServer(Server server) {
        SessionHandler sessionHandler;
        Server server2 = getServer();
        if (server2 == null || server2 == server) {
            sessionHandler = this;
        } else {
            sessionHandler = this;
            server2.getContainer().update((Object) sessionHandler, (Object) this._sessionManager, (Object) null, "sessionManager", true);
        }
        super.setServer(server);
        if (server == null || server == server2) {
            return;
        }
        server.getContainer().update((Object) sessionHandler, (Object) null, (Object) sessionHandler._sessionManager, "sessionManager", true);
    }

    public void setSessionManager(SessionManager sessionManager) {
        SessionHandler sessionHandler;
        SessionManager sessionManager2;
        if (isStarted()) {
            ohg0.m164364a();
            return;
        }
        SessionManager sessionManager3 = this._sessionManager;
        if (getServer() != null) {
            sessionHandler = this;
            sessionManager2 = sessionManager;
            getServer().getContainer().update((Object) sessionHandler, (Object) sessionManager3, (Object) sessionManager2, "sessionManager", true);
        } else {
            sessionHandler = this;
            sessionManager2 = sessionManager;
        }
        if (sessionManager2 != null) {
            sessionManager2.setSessionHandler(sessionHandler);
        }
        sessionHandler._sessionManager = sessionManager2;
        if (sessionManager3 != null) {
            sessionManager3.setSessionHandler(null);
        }
    }

    public SessionHandler(SessionManager sessionManager) {
        setSessionManager(sessionManager);
    }
}
