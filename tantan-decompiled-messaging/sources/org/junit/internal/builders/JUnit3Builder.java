package org.junit.internal.builders;

import org.junit.internal.runners.JUnit38ClassRunner;
import org.junit.runner.Runner;
import org.junit.runners.model.RunnerBuilder;
import p149l.nhi0;

/* JADX INFO: loaded from: classes3.dex */
public class JUnit3Builder extends RunnerBuilder {
    public boolean isPre4Test(Class<?> cls) {
        return nhi0.class.isAssignableFrom(cls);
    }

    @Override // org.junit.runners.model.RunnerBuilder
    public Runner runnerForClass(Class<?> cls) throws Throwable {
        if (isPre4Test(cls)) {
            return new JUnit38ClassRunner(cls);
        }
        return null;
    }
}
