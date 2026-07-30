package org.fourthline.cling.transport.spi;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface StreamClientConfiguration {
    int getLogWarningSeconds();

    ExecutorService getRequestExecutorService();

    int getTimeoutSeconds();

    String getUserAgentValue(int i, int i2);
}
