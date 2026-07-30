package org.junit.runners;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;
import org.junit.internal.builders.AllDefaultPossibilitiesBuilder;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;
import p149l.upk0;

/* JADX INFO: loaded from: classes3.dex */
public class Suite extends ParentRunner<Runner> {
    private final List<Runner> runners;

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface SuiteClasses {
        Class<?>[] value();
    }

    public Suite(Class<?> cls, Class<?>[] clsArr) throws InitializationError {
        this(new AllDefaultPossibilitiesBuilder(true), cls, clsArr);
    }

    public static Runner emptySuite() {
        try {
            return new Suite((Class<?>) null, (Class<?>[]) new Class[0]);
        } catch (InitializationError unused) {
            upk0.m194883a("This shouldn't be possible");
            return null;
        }
    }

    private static Class<?>[] getAnnotatedClasses(Class<?> cls) throws InitializationError {
        SuiteClasses suiteClasses = (SuiteClasses) cls.getAnnotation(SuiteClasses.class);
        if (suiteClasses != null) {
            return suiteClasses.value();
        }
        throw new InitializationError(String.format("class '%s' must have a SuiteClasses annotation", cls.getName()));
    }

    @Override // org.junit.runners.ParentRunner
    public List<Runner> getChildren() {
        return this.runners;
    }

    @Override // org.junit.runners.ParentRunner
    public void runChild(Runner runner, RunNotifier runNotifier) {
        runner.run(runNotifier);
    }

    @Override // org.junit.runners.ParentRunner
    public Description describeChild(Runner runner) {
        return runner.getDescription();
    }

    public Suite(RunnerBuilder runnerBuilder, Class<?>[] clsArr) throws InitializationError {
        this((Class<?>) null, runnerBuilder.runners((Class<?>) null, clsArr));
    }

    public Suite(Class<?> cls, RunnerBuilder runnerBuilder) throws InitializationError {
        this(runnerBuilder, cls, getAnnotatedClasses(cls));
    }

    public Suite(RunnerBuilder runnerBuilder, Class<?> cls, Class<?>[] clsArr) throws InitializationError {
        this(cls, runnerBuilder.runners(cls, clsArr));
    }

    public Suite(Class<?> cls, List<Runner> list) throws InitializationError {
        super(cls);
        this.runners = Collections.unmodifiableList(list);
    }
}
