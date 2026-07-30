package org.eclipse.jetty.p123io;

import org.eclipse.jetty.util.thread.Timeout;

/* JADX INFO: loaded from: classes3.dex */
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
