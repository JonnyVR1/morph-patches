package org.junit.internal.runners;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;
import p153l.mnd0;

/* JADX INFO: loaded from: classes3.dex */
public class ErrorReportingRunner extends Runner {
    private final List<Throwable> causes;
    private final Class<?> testClass;

    public ErrorReportingRunner(Class<?> cls, Throwable th) {
        if (cls == null) {
            mnd0.m159157a("Test class cannot be null");
            throw null;
        }
        this.testClass = cls;
        this.causes = getCauses(th);
    }

    private Description describeCause(Throwable th) {
        return Description.createTestDescription(this.testClass, "initializationError");
    }

    private List<Throwable> getCauses(Throwable th) {
        if (th instanceof InvocationTargetException) {
            return getCauses(th.getCause());
        }
        if (th instanceof org.junit.runners.model.InitializationError) {
            return ((org.junit.runners.model.InitializationError) th).getCauses();
        }
        return th instanceof InitializationError ? ((InitializationError) th).getCauses() : Arrays.asList(th);
    }

    private void runCause(Throwable th, RunNotifier runNotifier) {
        Description descriptionDescribeCause = describeCause(th);
        runNotifier.fireTestStarted(descriptionDescribeCause);
        runNotifier.fireTestFailure(new Failure(descriptionDescribeCause, th));
        runNotifier.fireTestFinished(descriptionDescribeCause);
    }

    @Override // org.junit.runner.Runner, org.junit.runner.Describable
    public Description getDescription() {
        Description descriptionCreateSuiteDescription = Description.createSuiteDescription(this.testClass);
        Iterator<Throwable> it = this.causes.iterator();
        while (it.hasNext()) {
            descriptionCreateSuiteDescription.addChild(describeCause(it.next()));
        }
        return descriptionCreateSuiteDescription;
    }

    @Override // org.junit.runner.Runner
    public void run(RunNotifier runNotifier) {
        Iterator<Throwable> it = this.causes.iterator();
        while (it.hasNext()) {
            runCause(it.next(), runNotifier);
        }
    }
}
