package org.junit.runner;

import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Computer {
    public static Computer serial() {
        return new Computer();
    }

    public Runner getRunner(RunnerBuilder runnerBuilder, Class<?> cls) throws Throwable {
        return runnerBuilder.runnerForClass(cls);
    }

    public Runner getSuite(final RunnerBuilder runnerBuilder, Class<?>[] clsArr) throws InitializationError {
        return new Suite(new RunnerBuilder() { // from class: org.junit.runner.Computer.1
            @Override // org.junit.runners.model.RunnerBuilder
            public Runner runnerForClass(Class<?> cls) throws Throwable {
                return Computer.this.getRunner(runnerBuilder, cls);
            }
        }, clsArr);
    }
}
