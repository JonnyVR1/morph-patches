package org.junit.runners.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.internal.runners.ErrorReportingRunner;
import org.junit.runner.Runner;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class RunnerBuilder {
    private final Set<Class<?>> parents = new HashSet();

    private List<Runner> runners(Class<?>[] clsArr) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls : clsArr) {
            Runner runnerSafeRunnerForClass = safeRunnerForClass(cls);
            if (runnerSafeRunnerForClass != null) {
                arrayList.add(runnerSafeRunnerForClass);
            }
        }
        return arrayList;
    }

    public Class<?> addParent(Class<?> cls) throws InitializationError {
        if (this.parents.add(cls)) {
            return cls;
        }
        throw new InitializationError(String.format("class '%s' (possibly indirectly) contains itself as a SuiteClass", cls.getName()));
    }

    public void removeParent(Class<?> cls) {
        this.parents.remove(cls);
    }

    public abstract Runner runnerForClass(Class<?> cls) throws Throwable;

    public Runner safeRunnerForClass(Class<?> cls) {
        try {
            return runnerForClass(cls);
        } catch (Throwable th) {
            return new ErrorReportingRunner(cls, th);
        }
    }

    public List<Runner> runners(Class<?> cls, List<Class<?>> list) throws InitializationError {
        return runners(cls, (Class<?>[]) list.toArray(new Class[0]));
    }

    public List<Runner> runners(Class<?> cls, Class<?>[] clsArr) throws InitializationError {
        addParent(cls);
        try {
            return runners(clsArr);
        } finally {
            removeParent(cls);
        }
    }
}
