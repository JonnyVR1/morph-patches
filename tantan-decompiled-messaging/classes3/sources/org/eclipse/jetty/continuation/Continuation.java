package org.eclipse.jetty.continuation;

import l.gke0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface Continuation {
    public static final String ATTRIBUTE = "org.eclipse.jetty.continuation";

    void addContinuationListener(ContinuationListener continuationListener);

    void complete();

    Object getAttribute(String str);

    gke0 getServletResponse();

    boolean isExpired();

    boolean isInitial();

    boolean isResponseWrapped();

    boolean isResumed();

    boolean isSuspended();

    void removeAttribute(String str);

    void resume();

    void setAttribute(String str, Object obj);

    void setTimeout(long j);

    void suspend();

    void suspend(gke0 gke0Var);

    void undispatch() throws ContinuationThrowable;
}
