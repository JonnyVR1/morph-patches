package org.eclipse.jetty.p004io.nio;

import java.io.IOException;
import org.eclipse.jetty.p004io.Connection;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface AsyncConnection extends Connection {
    void onInputShutdown() throws IOException;
}
