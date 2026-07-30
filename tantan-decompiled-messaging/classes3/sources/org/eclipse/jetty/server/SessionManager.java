package org.eclipse.jetty.server;

import java.util.EventListener;
import java.util.Set;
import javax.servlet.SessionTrackingMode;
import javax.servlet.http.HttpServletRequest;
import l.kke0;
import l.rkl;
import org.eclipse.jetty.http.HttpCookie;
import org.eclipse.jetty.server.session.SessionHandler;
import org.eclipse.jetty.util.component.LifeCycle;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface SessionManager extends LifeCycle {
    public static final String __CheckRemoteSessionEncoding = "org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding";
    public static final String __DefaultSessionCookie = "JSESSIONID";
    public static final String __DefaultSessionDomain = null;
    public static final String __DefaultSessionIdPathParameterName = "jsessionid";
    public static final String __MaxAgeProperty = "org.eclipse.jetty.servlet.MaxAge";
    public static final String __SessionCookieProperty = "org.eclipse.jetty.servlet.SessionCookie";
    public static final String __SessionDomainProperty = "org.eclipse.jetty.servlet.SessionDomain";
    public static final String __SessionIdPathParameterNameProperty = "org.eclipse.jetty.servlet.SessionIdPathParameterName";
    public static final String __SessionPathProperty = "org.eclipse.jetty.servlet.SessionPath";

    HttpCookie access(rkl rklVar, boolean z);

    void addEventListener(EventListener eventListener);

    void clearEventListeners();

    void complete(rkl rklVar);

    String getClusterId(rkl rklVar);

    Set<SessionTrackingMode> getDefaultSessionTrackingModes();

    Set<SessionTrackingMode> getEffectiveSessionTrackingModes();

    boolean getHttpOnly();

    rkl getHttpSession(String str);

    int getMaxInactiveInterval();

    @Deprecated
    SessionIdManager getMetaManager();

    String getNodeId(rkl rklVar);

    HttpCookie getSessionCookie(rkl rklVar, String str, boolean z);

    kke0 getSessionCookieConfig();

    SessionIdManager getSessionIdManager();

    String getSessionIdPathParameterName();

    String getSessionIdPathParameterNamePrefix();

    boolean isCheckingRemoteSessionIdEncoding();

    boolean isUsingCookies();

    boolean isUsingURLs();

    boolean isValid(rkl rklVar);

    rkl newHttpSession(HttpServletRequest httpServletRequest);

    void removeEventListener(EventListener eventListener);

    void setCheckingRemoteSessionIdEncoding(boolean z);

    void setMaxInactiveInterval(int i);

    void setSessionHandler(SessionHandler sessionHandler);

    void setSessionIdManager(SessionIdManager sessionIdManager);

    void setSessionIdPathParameterName(String str);

    void setSessionTrackingModes(Set<SessionTrackingMode> set);
}
