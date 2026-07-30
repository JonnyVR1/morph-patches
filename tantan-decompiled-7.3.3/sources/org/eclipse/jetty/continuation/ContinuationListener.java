package org.eclipse.jetty.continuation;

import java.util.EventListener;

/* JADX INFO: loaded from: classes2.dex */
public interface ContinuationListener extends EventListener {
    void onComplete(Continuation continuation);

    void onTimeout(Continuation continuation);
}
