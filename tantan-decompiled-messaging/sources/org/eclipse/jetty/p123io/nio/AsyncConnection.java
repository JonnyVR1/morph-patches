package org.eclipse.jetty.p123io.nio;

import java.io.IOException;
import org.eclipse.jetty.p123io.Connection;

/* JADX INFO: loaded from: classes3.dex */
public interface AsyncConnection extends Connection {
    void onInputShutdown() throws IOException;
}
