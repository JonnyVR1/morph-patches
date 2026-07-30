package org.eclipse.jetty.server;

import java.util.EventListener;
import java.util.Set;
import javax.servlet.SessionTrackingMode;
import javax.servlet.http.HttpServletRequest;
import org.eclipse.jetty.http.HttpCookie;
import org.eclipse.jetty.server.session.SessionHandler;
import org.eclipse.jetty.util.component.LifeCycle;
import p153l.hnl;
import p153l.pse0;

/* JADX INFO: loaded from: classes2.dex */
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

    HttpCookie access(hnl hnlVar, boolean z);

    void addEventListener(EventListener eventListener);

    void clearEventListeners();

    void complete(hnl hnlVar);

    String getClusterId(hnl hnlVar);

    Set<SessionTrackingMode> getDefaultSessionTrackingModes();

    Set<SessionTrackingMode> getEffectiveSessionTrackingModes();

    boolean getHttpOnly();

    hnl getHttpSession(String str);

    int getMaxInactiveInterval();

    @Deprecated
    SessionIdManager getMetaManager();

    String getNodeId(hnl hnlVar);

    HttpCookie getSessionCookie(hnl hnlVar, String str, boolean z);

    pse0 getSessionCookieConfig();

    SessionIdManager getSessionIdManager();

    String getSessionIdPathParameterName();

    String getSessionIdPathParameterNamePrefix();

    boolean isCheckingRemoteSessionIdEncoding();

    boolean isUsingCookies();

    boolean isUsingURLs();

    boolean isValid(hnl hnlVar);

    hnl newHttpSession(HttpServletRequest httpServletRequest);

    void removeEventListener(EventListener eventListener);

    void setCheckingRemoteSessionIdEncoding(boolean z);

    void setMaxInactiveInterval(int i);

    void setSessionHandler(SessionHandler sessionHandler);

    void setSessionIdManager(SessionIdManager sessionIdManager);

    void setSessionIdPathParameterName(String str);

    void setSessionTrackingModes(Set<SessionTrackingMode> set);
}
