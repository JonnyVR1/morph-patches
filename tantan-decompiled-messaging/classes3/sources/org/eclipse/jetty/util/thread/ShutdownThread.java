package org.eclipse.jetty.util.thread;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.eclipse.jetty.util.component.LifeCycle;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ShutdownThread extends Thread {
    private static final Logger LOG = Log.getLogger((Class<?>) ShutdownThread.class);
    private static final ShutdownThread _thread = new ShutdownThread();
    private boolean _hooked;
    private final List<LifeCycle> _lifeCycles = new CopyOnWriteArrayList();

    private ShutdownThread() {
    }

    public static synchronized void deregister(LifeCycle lifeCycle) {
        ShutdownThread shutdownThread = _thread;
        shutdownThread._lifeCycles.remove(lifeCycle);
        if (shutdownThread._lifeCycles.size() == 0) {
            shutdownThread.unhook();
        }
    }

    public static ShutdownThread getInstance() {
        return _thread;
    }

    private synchronized void hook() {
        try {
            try {
                if (!this._hooked) {
                    Runtime.getRuntime().addShutdownHook(this);
                }
                this._hooked = true;
            } catch (Exception e) {
                Logger logger = LOG;
                logger.ignore(e);
                logger.info("shutdown already commenced", new Object[0]);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void register(LifeCycle... lifeCycleArr) {
        ShutdownThread shutdownThread = _thread;
        shutdownThread._lifeCycles.addAll(Arrays.asList(lifeCycleArr));
        if (shutdownThread._lifeCycles.size() > 0) {
            shutdownThread.hook();
        }
    }

    private synchronized void unhook() {
        try {
            this._hooked = false;
            Runtime.getRuntime().removeShutdownHook(this);
        } catch (Exception e) {
            Logger logger = LOG;
            logger.ignore(e);
            logger.info("shutdown already commenced", new Object[0]);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        for (LifeCycle lifeCycle : _thread._lifeCycles) {
            try {
                if (lifeCycle.isStarted()) {
                    lifeCycle.stop();
                    LOG.debug("Stopped {}", lifeCycle);
                }
            } catch (Exception e) {
                LOG.debug(e);
            }
        }
    }

    public static synchronized void register(int i, LifeCycle... lifeCycleArr) {
        ShutdownThread shutdownThread = _thread;
        shutdownThread._lifeCycles.addAll(i, Arrays.asList(lifeCycleArr));
        if (shutdownThread._lifeCycles.size() > 0) {
            shutdownThread.hook();
        }
    }
}
