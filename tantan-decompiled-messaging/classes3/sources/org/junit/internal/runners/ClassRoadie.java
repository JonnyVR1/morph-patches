package org.junit.internal.runners;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Deprecated
public class ClassRoadie {
    private Description description;
    private RunNotifier notifier;
    private final Runnable runnable;
    private TestClass testClass;

    public ClassRoadie(RunNotifier runNotifier, TestClass testClass, Description description, Runnable runnable) {
        this.notifier = runNotifier;
        this.testClass = testClass;
        this.description = description;
        this.runnable = runnable;
    }

    private void runAfters() {
        Iterator<Method> it = this.testClass.getAfters().iterator();
        while (it.hasNext()) {
            try {
                it.next().invoke(null, null);
            } catch (InvocationTargetException e) {
                addFailure(e.getTargetException());
            } catch (Throwable th) {
                addFailure(th);
            }
        }
    }

    private void runBefores() throws FailedBefore {
        try {
            try {
                Iterator<Method> it = this.testClass.getBefores().iterator();
                while (it.hasNext()) {
                    it.next().invoke(null, null);
                }
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            }
        } catch (AssumptionViolatedException unused) {
            throw new FailedBefore();
        } catch (Throwable th) {
            addFailure(th);
            throw new FailedBefore();
        }
    }

    public void addFailure(Throwable th) {
        this.notifier.fireTestFailure(new Failure(this.description, th));
    }

    public void runProtected() {
        try {
            runBefores();
            runUnprotected();
        } catch (FailedBefore unused) {
        } finally {
            runAfters();
        }
    }

    public void runUnprotected() {
        this.runnable.run();
    }
}
