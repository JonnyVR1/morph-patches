package org.eclipse.jetty.server;

import javax.servlet.http.HttpServletRequest;
import org.eclipse.jetty.util.component.LifeCycle;
import p153l.hnl;

/* JADX INFO: loaded from: classes2.dex */
public interface SessionIdManager extends LifeCycle {
    void addSession(hnl hnlVar);

    String getClusterId(String str);

    String getNodeId(String str, HttpServletRequest httpServletRequest);

    String getWorkerName();

    boolean idInUse(String str);

    void invalidateAll(String str);

    String newSessionId(HttpServletRequest httpServletRequest, long j);

    void removeSession(hnl hnlVar);
}
