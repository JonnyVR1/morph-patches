package org.junit.internal.builders;

import java.lang.reflect.Modifier;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;

/* JADX INFO: loaded from: classes3.dex */
public class AnnotatedBuilder extends RunnerBuilder {
    private static final String CONSTRUCTOR_ERROR_FORMAT = "Custom runner class %s should have a public constructor with signature %s(Class testClass)";
    private final RunnerBuilder suiteBuilder;

    public AnnotatedBuilder(RunnerBuilder runnerBuilder) {
        this.suiteBuilder = runnerBuilder;
    }

    private Class<?> getEnclosingClassForNonStaticMemberClass(Class<?> cls) {
        if (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
            return null;
        }
        return cls.getEnclosingClass();
    }

    public Runner buildRunner(Class<? extends Runner> cls, Class<?> cls2) throws Exception {
        try {
            try {
                return cls.getConstructor(Class.class).newInstance(cls2);
            } catch (NoSuchMethodException unused) {
                String simpleName = cls.getSimpleName();
                throw new InitializationError(String.format(CONSTRUCTOR_ERROR_FORMAT, simpleName, simpleName));
            }
        } catch (NoSuchMethodException unused2) {
            return cls.getConstructor(Class.class, RunnerBuilder.class).newInstance(cls2, this.suiteBuilder);
        }
    }

    @Override // org.junit.runners.model.RunnerBuilder
    public Runner runnerForClass(Class<?> cls) throws Exception {
        Class<?> enclosingClassForNonStaticMemberClass = cls;
        while (enclosingClassForNonStaticMemberClass != null) {
            RunWith runWith = (RunWith) enclosingClassForNonStaticMemberClass.getAnnotation(RunWith.class);
            if (runWith != null) {
                return buildRunner(runWith.value(), cls);
            }
            enclosingClassForNonStaticMemberClass = getEnclosingClassForNonStaticMemberClass(enclosingClassForNonStaticMemberClass);
        }
        return null;
    }
}
