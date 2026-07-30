package org.junit.internal.builders;

import org.junit.internal.runners.SuiteMethod;
import org.junit.runner.Runner;
import org.junit.runners.model.RunnerBuilder;

/* JADX INFO: loaded from: classes3.dex */
public class SuiteMethodBuilder extends RunnerBuilder {
    public boolean hasSuiteMethod(Class<?> cls) {
        try {
            cls.getMethod("suite", null);
            return true;
        } catch (NoSuchMethodException unused) {
            return false;
        }
    }

    @Override // org.junit.runners.model.RunnerBuilder
    public Runner runnerForClass(Class<?> cls) throws Throwable {
        if (hasSuiteMethod(cls)) {
            return new SuiteMethod(cls);
        }
        return null;
    }
}
