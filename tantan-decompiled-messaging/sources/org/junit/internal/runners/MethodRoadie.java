package org.junit.internal.runners;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.TestTimedOutException;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class MethodRoadie {
    private final Description description;
    private final RunNotifier notifier;
    private final Object test;
    private TestMethod testMethod;

    public MethodRoadie(Object obj, TestMethod testMethod, RunNotifier runNotifier, Description description) {
        this.test = obj;
        this.notifier = runNotifier;
        this.description = description;
        this.testMethod = testMethod;
    }

    private void runAfters() {
        Iterator<Method> it = this.testMethod.getAfters().iterator();
        while (it.hasNext()) {
            try {
                it.next().invoke(this.test, null);
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
                Iterator<Method> it = this.testMethod.getBefores().iterator();
                while (it.hasNext()) {
                    it.next().invoke(this.test, null);
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

    private void runWithTimeout(final long j) {
        runBeforesThenTestThenAfters(new Runnable() { // from class: org.junit.internal.runners.MethodRoadie.1
            @Override // java.lang.Runnable
            public void run() {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                Future futureSubmit = executorServiceNewSingleThreadExecutor.submit(new Callable<Object>() { // from class: org.junit.internal.runners.MethodRoadie.1.1
                    @Override // java.util.concurrent.Callable
                    public Object call() throws Exception {
                        MethodRoadie.this.runTestMethod();
                        return null;
                    }
                });
                executorServiceNewSingleThreadExecutor.shutdown();
                try {
                    if (!executorServiceNewSingleThreadExecutor.awaitTermination(j, timeUnit)) {
                        executorServiceNewSingleThreadExecutor.shutdownNow();
                    }
                    futureSubmit.get(0L, timeUnit);
                } catch (TimeoutException unused) {
                    MethodRoadie.this.addFailure(new TestTimedOutException(j, timeUnit));
                } catch (Exception e) {
                    MethodRoadie.this.addFailure(e);
                }
            }
        });
    }

    public void addFailure(Throwable th) {
        this.notifier.fireTestFailure(new Failure(this.description, th));
    }

    public void run() {
        boolean zIsIgnored = this.testMethod.isIgnored();
        RunNotifier runNotifier = this.notifier;
        if (zIsIgnored) {
            runNotifier.fireTestIgnored(this.description);
            return;
        }
        runNotifier.fireTestStarted(this.description);
        try {
            long timeout = this.testMethod.getTimeout();
            if (timeout > 0) {
                runWithTimeout(timeout);
            } else {
                runTest();
            }
        } finally {
            this.notifier.fireTestFinished(this.description);
        }
    }

    public void runBeforesThenTestThenAfters(Runnable runnable) {
        try {
            try {
                runBefores();
                runnable.run();
                runAfters();
            } catch (FailedBefore unused) {
                runAfters();
            } catch (Exception unused2) {
                throw new RuntimeException("test should never throw an exception to this level");
            }
        } catch (Throwable th) {
            runAfters();
            throw th;
        }
    }

    public void runTest() {
        runBeforesThenTestThenAfters(new Runnable() { // from class: org.junit.internal.runners.MethodRoadie.2
            @Override // java.lang.Runnable
            public void run() {
                MethodRoadie.this.runTestMethod();
            }
        });
    }

    public void runTestMethod() {
        try {
            this.testMethod.invoke(this.test);
            if (this.testMethod.expectsException()) {
                addFailure(new AssertionError("Expected exception: ".concat(this.testMethod.getExpectedException().getName())));
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof AssumptionViolatedException) {
                return;
            }
            if (!this.testMethod.expectsException()) {
                addFailure(targetException);
                return;
            }
            if (this.testMethod.isUnexpected(targetException)) {
                addFailure(new Exception("Unexpected exception, expected<" + this.testMethod.getExpectedException().getName() + "> but was<" + targetException.getClass().getName() + ">", targetException));
            }
        } catch (Throwable th) {
            addFailure(th);
        }
    }
}
