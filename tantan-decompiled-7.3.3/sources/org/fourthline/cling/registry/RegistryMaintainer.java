package org.fourthline.cling.registry;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class RegistryMaintainer implements Runnable {
    private static Logger log = Logger.getLogger(RegistryMaintainer.class.getName());
    private final RegistryImpl registry;
    private final int sleepIntervalMillis;
    private volatile boolean stopped = false;

    public RegistryMaintainer(RegistryImpl registryImpl, int i) {
        this.registry = registryImpl;
        this.sleepIntervalMillis = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.stopped = false;
        if (log.isLoggable(Level.FINE)) {
            log.fine("Running registry maintenance loop every milliseconds: " + this.sleepIntervalMillis);
        }
        while (!this.stopped) {
            try {
                this.registry.maintain();
                Thread.sleep(this.sleepIntervalMillis);
            } catch (InterruptedException unused) {
                this.stopped = true;
            }
        }
        log.fine("Stopped status on thread received, ending maintenance loop");
    }

    public void stop() {
        if (log.isLoggable(Level.FINE)) {
            log.fine("Setting stopped status on thread");
        }
        this.stopped = true;
    }
}
