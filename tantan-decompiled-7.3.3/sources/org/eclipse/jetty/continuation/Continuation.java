package org.eclipse.jetty.continuation;

import p153l.lse0;

/* JADX INFO: loaded from: classes2.dex */
public interface Continuation {
    public static final String ATTRIBUTE = "org.eclipse.jetty.continuation";

    void addContinuationListener(ContinuationListener continuationListener);

    void complete();

    Object getAttribute(String str);

    lse0 getServletResponse();

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

    void suspend(lse0 lse0Var);

    void undispatch() throws ContinuationThrowable;
}
