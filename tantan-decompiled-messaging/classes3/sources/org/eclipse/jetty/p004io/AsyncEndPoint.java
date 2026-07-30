package org.eclipse.jetty.p004io;

import org.eclipse.jetty.util.thread.Timeout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface AsyncEndPoint extends ConnectedEndPoint {
    void asyncDispatch();

    void cancelTimeout(Timeout.Task task);

    void dispatch();

    boolean hasProgressed();

    boolean isCheckForIdle();

    boolean isWritable();

    void onIdleExpired(long j);

    void scheduleTimeout(Timeout.Task task, long j);

    void scheduleWrite();

    void setCheckForIdle(boolean z);
}
