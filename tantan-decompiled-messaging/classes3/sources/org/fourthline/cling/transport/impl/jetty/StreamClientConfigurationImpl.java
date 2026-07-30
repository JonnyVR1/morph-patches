package org.fourthline.cling.transport.impl.jetty;

import java.util.concurrent.ExecutorService;
import org.fourthline.cling.transport.spi.AbstractStreamClientConfiguration;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class StreamClientConfigurationImpl extends AbstractStreamClientConfiguration {
    public StreamClientConfigurationImpl(ExecutorService executorService) {
        super(executorService);
    }

    public int getRequestRetryCount() {
        return 0;
    }

    public StreamClientConfigurationImpl(ExecutorService executorService, int i) {
        super(executorService, i);
    }
}
