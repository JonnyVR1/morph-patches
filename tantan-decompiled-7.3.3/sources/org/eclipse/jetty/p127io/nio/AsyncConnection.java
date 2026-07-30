package org.eclipse.jetty.p127io.nio;

import java.io.IOException;
import org.eclipse.jetty.p127io.Connection;

/* JADX INFO: loaded from: classes2.dex */
public interface AsyncConnection extends Connection {
    void onInputShutdown() throws IOException;
}
