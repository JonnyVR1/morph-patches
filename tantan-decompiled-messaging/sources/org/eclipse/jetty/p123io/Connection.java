package org.eclipse.jetty.p123io;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface Connection {
    long getTimeStamp();

    Connection handle() throws IOException;

    boolean isIdle();

    boolean isSuspended();

    void onClose();

    void onIdleExpired(long j);
}
