package org.fourthline.cling.transport.impl;

import java.util.concurrent.ExecutorService;
import org.fourthline.cling.transport.spi.AbstractStreamClientConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public class StreamClientConfigurationImpl extends AbstractStreamClientConfiguration {
    private boolean usePersistentConnections;

    public StreamClientConfigurationImpl(ExecutorService executorService) {
        super(executorService);
        this.usePersistentConnections = false;
    }

    public boolean isUsePersistentConnections() {
        return this.usePersistentConnections;
    }

    public void setUsePersistentConnections(boolean z) {
        this.usePersistentConnections = z;
    }

    public StreamClientConfigurationImpl(ExecutorService executorService, int i) {
        super(executorService, i);
        this.usePersistentConnections = false;
    }
}
