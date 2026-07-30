package org.junit.runner.notification;

import org.junit.runner.Description;
import org.junit.runner.Result;

/* JADX INFO: loaded from: classes3.dex */
@RunListener.ThreadSafe
final class SynchronizedRunListener extends RunListener {
    private final RunListener listener;
    private final Object monitor;

    public SynchronizedRunListener(RunListener runListener, Object obj) {
        this.listener = runListener;
        this.monitor = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SynchronizedRunListener) {
            return this.listener.equals(((SynchronizedRunListener) obj).listener);
        }
        return false;
    }

    public int hashCode() {
        return this.listener.hashCode();
    }

    @Override // org.junit.runner.notification.RunListener
    public void testAssumptionFailure(Failure failure) {
        synchronized (this.monitor) {
            this.listener.testAssumptionFailure(failure);
        }
    }

    @Override // org.junit.runner.notification.RunListener
    public void testFailure(Failure failure) throws Exception {
        synchronized (this.monitor) {
            this.listener.testFailure(failure);
        }
    }

    @Override // org.junit.runner.notification.RunListener
    public void testFinished(Description description) throws Exception {
        synchronized (this.monitor) {
            this.listener.testFinished(description);
        }
    }

    @Override // org.junit.runner.notification.RunListener
    public void testIgnored(Description description) throws Exception {
        synchronized (this.monitor) {
            this.listener.testIgnored(description);
        }
    }

    @Override // org.junit.runner.notification.RunListener
    public void testRunFinished(Result result) throws Exception {
        synchronized (this.monitor) {
            this.listener.testRunFinished(result);
        }
    }

    @Override // org.junit.runner.notification.RunListener
    public void testRunStarted(Description description) throws Exception {
        synchronized (this.monitor) {
            this.listener.testRunStarted(description);
        }
    }

    @Override // org.junit.runner.notification.RunListener
    public void testStarted(Description description) throws Exception {
        synchronized (this.monitor) {
            this.listener.testStarted(description);
        }
    }

    public String toString() {
        return this.listener.toString() + " (with synchronization wrapper)";
    }
}
