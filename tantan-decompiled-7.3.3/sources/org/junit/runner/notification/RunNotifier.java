package org.junit.runner.notification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.junit.runner.Description;
import org.junit.runner.Result;
import p153l.mnd0;

/* JADX INFO: loaded from: classes3.dex */
public class RunNotifier {
    private final List<RunListener> listeners = new CopyOnWriteArrayList();
    private volatile boolean pleaseStop = false;

    /* JADX INFO: Access modifiers changed from: private */
    public void fireTestFailures(List<RunListener> list, final List<Failure> list2) {
        if (list2.isEmpty()) {
            return;
        }
        new SafeNotifier(list) { // from class: org.junit.runner.notification.RunNotifier.4
            @Override // org.junit.runner.notification.RunNotifier.SafeNotifier
            public void notifyListener(RunListener runListener) throws Exception {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    runListener.testFailure((Failure) it.next());
                }
            }
        }.run();
    }

    public void addFirstListener(RunListener runListener) {
        if (runListener != null) {
            this.listeners.add(0, wrapIfNotThreadSafe(runListener));
        } else {
            mnd0.m159157a("Cannot add a null listener");
        }
    }

    public void addListener(RunListener runListener) {
        if (runListener != null) {
            this.listeners.add(wrapIfNotThreadSafe(runListener));
        } else {
            mnd0.m159157a("Cannot add a null listener");
        }
    }

    public void fireTestAssumptionFailed(final Failure failure) {
        new SafeNotifier() { // from class: org.junit.runner.notification.RunNotifier.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(RunNotifier.this);
            }

            @Override // org.junit.runner.notification.RunNotifier.SafeNotifier
            public void notifyListener(RunListener runListener) throws Exception {
                runListener.testAssumptionFailure(failure);
            }
        }.run();
    }

    public void fireTestFailure(Failure failure) {
        fireTestFailures(this.listeners, Arrays.asList(failure));
    }

    public void fireTestFinished(final Description description) {
        new SafeNotifier() { // from class: org.junit.runner.notification.RunNotifier.7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(RunNotifier.this);
            }

            @Override // org.junit.runner.notification.RunNotifier.SafeNotifier
            public void notifyListener(RunListener runListener) throws Exception {
                runListener.testFinished(description);
            }
        }.run();
    }

    public void fireTestIgnored(final Description description) {
        new SafeNotifier() { // from class: org.junit.runner.notification.RunNotifier.6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(RunNotifier.this);
            }

            @Override // org.junit.runner.notification.RunNotifier.SafeNotifier
            public void notifyListener(RunListener runListener) throws Exception {
                runListener.testIgnored(description);
            }
        }.run();
    }

    public void fireTestRunFinished(final Result result) {
        new SafeNotifier() { // from class: org.junit.runner.notification.RunNotifier.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(RunNotifier.this);
            }

            @Override // org.junit.runner.notification.RunNotifier.SafeNotifier
            public void notifyListener(RunListener runListener) throws Exception {
                runListener.testRunFinished(result);
            }
        }.run();
    }

    public void fireTestRunStarted(final Description description) {
        new SafeNotifier() { // from class: org.junit.runner.notification.RunNotifier.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(RunNotifier.this);
            }

            @Override // org.junit.runner.notification.RunNotifier.SafeNotifier
            public void notifyListener(RunListener runListener) throws Exception {
                runListener.testRunStarted(description);
            }
        }.run();
    }

    public void fireTestStarted(final Description description) throws StoppedByUserException {
        if (this.pleaseStop) {
            throw new StoppedByUserException();
        }
        new SafeNotifier() { // from class: org.junit.runner.notification.RunNotifier.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(RunNotifier.this);
            }

            @Override // org.junit.runner.notification.RunNotifier.SafeNotifier
            public void notifyListener(RunListener runListener) throws Exception {
                runListener.testStarted(description);
            }
        }.run();
    }

    public void pleaseStop() {
        this.pleaseStop = true;
    }

    public void removeListener(RunListener runListener) {
        if (runListener != null) {
            this.listeners.remove(wrapIfNotThreadSafe(runListener));
        } else {
            mnd0.m159157a("Cannot remove a null listener");
        }
    }

    public RunListener wrapIfNotThreadSafe(RunListener runListener) {
        return runListener.getClass().isAnnotationPresent(RunListener.ThreadSafe.class) ? runListener : new SynchronizedRunListener(runListener, this);
    }

    public abstract class SafeNotifier {
        private final List<RunListener> currentListeners;

        public SafeNotifier(RunNotifier runNotifier) {
            this(runNotifier.listeners);
        }

        public abstract void notifyListener(RunListener runListener) throws Exception;

        public void run() {
            int size = this.currentListeners.size();
            ArrayList arrayList = new ArrayList(size);
            ArrayList arrayList2 = new ArrayList(size);
            for (RunListener runListener : this.currentListeners) {
                try {
                    notifyListener(runListener);
                    arrayList.add(runListener);
                } catch (Exception e) {
                    arrayList2.add(new Failure(Description.TEST_MECHANISM, e));
                }
            }
            RunNotifier.this.fireTestFailures(arrayList, arrayList2);
        }

        public SafeNotifier(List<RunListener> list) {
            this.currentListeners = list;
        }
    }
}
