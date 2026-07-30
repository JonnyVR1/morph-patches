package org.fourthline.cling.transport.spi;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import l.tje0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface ServletContainerAdapter {
    int addConnector(String str, int i) throws IOException;

    void registerServlet(String str, tje0 tje0Var);

    void removeConnector(String str, int i);

    void setExecutorService(ExecutorService executorService);

    void startIfNotRunning();

    void stopIfRunning();
}
