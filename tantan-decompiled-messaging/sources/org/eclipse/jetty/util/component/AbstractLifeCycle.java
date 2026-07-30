package org.eclipse.jetty.util.component;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractLifeCycle implements LifeCycle {
    public static final String FAILED = "FAILED";
    private static final Logger LOG = Log.getLogger((Class<?>) AbstractLifeCycle.class);
    public static final String RUNNING = "RUNNING";
    public static final String STARTED = "STARTED";
    public static final String STARTING = "STARTING";
    public static final String STOPPED = "STOPPED";
    public static final String STOPPING = "STOPPING";
    private final Object _lock = new Object();
    private final int __FAILED = -1;
    private final int __STOPPED = 0;
    private final int __STARTING = 1;
    private final int __STARTED = 2;
    private final int __STOPPING = 3;
    private volatile int _state = 0;
    protected final CopyOnWriteArrayList<LifeCycle.Listener> _listeners = new CopyOnWriteArrayList<>();

    public static abstract class AbstractLifeCycleListener implements LifeCycle.Listener {
        @Override // org.eclipse.jetty.util.component.LifeCycle.Listener
        public void lifeCycleFailure(LifeCycle lifeCycle, Throwable th) {
        }

        @Override // org.eclipse.jetty.util.component.LifeCycle.Listener
        public void lifeCycleStarted(LifeCycle lifeCycle) {
        }

        @Override // org.eclipse.jetty.util.component.LifeCycle.Listener
        public void lifeCycleStarting(LifeCycle lifeCycle) {
        }

        @Override // org.eclipse.jetty.util.component.LifeCycle.Listener
        public void lifeCycleStopped(LifeCycle lifeCycle) {
        }

        @Override // org.eclipse.jetty.util.component.LifeCycle.Listener
        public void lifeCycleStopping(LifeCycle lifeCycle) {
        }
    }

    public static String getState(LifeCycle lifeCycle) {
        if (lifeCycle.isStarting()) {
            return STARTING;
        }
        if (lifeCycle.isStarted()) {
            return STARTED;
        }
        if (lifeCycle.isStopping()) {
            return STOPPING;
        }
        return lifeCycle.isStopped() ? STOPPED : "FAILED";
    }

    private void setFailed(Throwable th) {
        this._state = -1;
        LOG.warn("FAILED " + this + ": " + th, th);
        Iterator<LifeCycle.Listener> it = this._listeners.iterator();
        while (it.hasNext()) {
            it.next().lifeCycleFailure(this, th);
        }
    }

    private void setStarted() {
        this._state = 2;
        LOG.debug("STARTED {}", this);
        Iterator<LifeCycle.Listener> it = this._listeners.iterator();
        while (it.hasNext()) {
            it.next().lifeCycleStarted(this);
        }
    }

    private void setStarting() {
        LOG.debug("starting {}", this);
        this._state = 1;
        Iterator<LifeCycle.Listener> it = this._listeners.iterator();
        while (it.hasNext()) {
            it.next().lifeCycleStarting(this);
        }
    }

    private void setStopped() {
        this._state = 0;
        LOG.debug("{} {}", STOPPED, this);
        Iterator<LifeCycle.Listener> it = this._listeners.iterator();
        while (it.hasNext()) {
            it.next().lifeCycleStopped(this);
        }
    }

    private void setStopping() {
        LOG.debug("stopping {}", this);
        this._state = 3;
        Iterator<LifeCycle.Listener> it = this._listeners.iterator();
        while (it.hasNext()) {
            it.next().lifeCycleStopping(this);
        }
    }

    @Override // org.eclipse.jetty.util.component.LifeCycle
    public void addLifeCycleListener(LifeCycle.Listener listener) {
        this._listeners.add(listener);
    }

    public void doStart() throws Exception {
    }

    public void doStop() throws Exception {
    }

    @Override // org.eclipse.jetty.util.component.LifeCycle
    public boolean isFailed() {
        return this._state == -1;
    }

    @Override // org.eclipse.jetty.util.component.LifeCycle
    public boolean isRunning() {
        int i = this._state;
        return i == 2 || i == 1;
    }

    @Override // org.eclipse.jetty.util.component.LifeCycle
    public boolean isStarted() {
        return this._state == 2;
    }

    @Override // org.eclipse.jetty.util.component.LifeCycle
    public boolean isStarting() {
        return this._state == 1;
    }

    @Override // org.eclipse.jetty.util.component.LifeCycle
    public boolean isStopped() {
        return this._state == 0;
    }

    @Override // org.eclipse.jetty.util.component.LifeCycle
    public boolean isStopping() {
        return this._state == 3;
    }

    @Override // org.eclipse.jetty.util.component.LifeCycle
    public void removeLifeCycleListener(LifeCycle.Listener listener) {
        this._listeners.remove(listener);
    }

    @Override // org.eclipse.jetty.util.component.LifeCycle
    public final void start() throws Exception {
        synchronized (this._lock) {
            try {
                try {
                    if (this._state != 2 && this._state != 1) {
                        setStarting();
                        doStart();
                        setStarted();
                    }
                } catch (Error e) {
                    setFailed(e);
                    throw e;
                } catch (Exception e2) {
                    setFailed(e2);
                    throw e2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.eclipse.jetty.util.component.LifeCycle
    public final void stop() throws Exception {
        synchronized (this._lock) {
            try {
                try {
                    if (this._state != 3 && this._state != 0) {
                        setStopping();
                        doStop();
                        setStopped();
                    }
                } catch (Error e) {
                    setFailed(e);
                    throw e;
                } catch (Exception e2) {
                    setFailed(e2);
                    throw e2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String getState() {
        int i = this._state;
        if (i == -1) {
            return "FAILED";
        }
        if (i == 0) {
            return STOPPED;
        }
        if (i == 1) {
            return STARTING;
        }
        if (i == 2) {
            return STARTED;
        }
        if (i != 3) {
            return null;
        }
        return STOPPING;
    }
}
