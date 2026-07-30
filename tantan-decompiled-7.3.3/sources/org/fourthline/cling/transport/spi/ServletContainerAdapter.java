package org.fourthline.cling.transport.spi;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import p153l.yre0;

/* JADX INFO: loaded from: classes3.dex */
public interface ServletContainerAdapter {
    int addConnector(String str, int i) throws IOException;

    void registerServlet(String str, yre0 yre0Var);

    void removeConnector(String str, int i);

    void setExecutorService(ExecutorService executorService);

    void startIfNotRunning();

    void stopIfRunning();
}
