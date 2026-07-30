package org.junit.internal.builders;

import l.nhi0;
import org.junit.internal.runners.JUnit38ClassRunner;
import org.junit.runner.Runner;
import org.junit.runners.model.RunnerBuilder;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
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
