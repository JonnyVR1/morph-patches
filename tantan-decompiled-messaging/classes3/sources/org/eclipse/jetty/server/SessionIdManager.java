package org.eclipse.jetty.server;

import javax.servlet.http.HttpServletRequest;
import l.rkl;
import org.eclipse.jetty.util.component.LifeCycle;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface SessionIdManager extends LifeCycle {
    void addSession(rkl rklVar);

    String getClusterId(String str);

    String getNodeId(String str, HttpServletRequest httpServletRequest);

    String getWorkerName();

    boolean idInUse(String str);

    void invalidateAll(String str);

    String newSessionId(HttpServletRequest httpServletRequest, long j);

    void removeSession(rkl rklVar);
}
