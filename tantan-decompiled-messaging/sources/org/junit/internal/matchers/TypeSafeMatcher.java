package org.junit.internal.matchers;

import java.lang.reflect.Method;
import org.hamcrest.BaseMatcher;
import org.junit.internal.MethodSorter;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class TypeSafeMatcher<T> extends BaseMatcher<T> {
    private Class<?> expectedType;

    public TypeSafeMatcher() {
        this.expectedType = findExpectedType(getClass());
    }

    private static Class<?> findExpectedType(Class<?> cls) {
        while (cls != Object.class) {
            for (Method method : MethodSorter.getDeclaredMethods(cls)) {
                if (isMatchesSafelyMethod(method)) {
                    return method.getParameterTypes()[0];
                }
            }
            cls = cls.getSuperclass();
        }
        throw new Error("Cannot determine correct type for matchesSafely() method.");
    }

    private static boolean isMatchesSafelyMethod(Method method) {
        return method.getName().equals("matchesSafely") && method.getParameterTypes().length == 1 && !method.isSynthetic();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.hamcrest.Matcher
    public final boolean matches(Object obj) {
        return obj != 0 && this.expectedType.isInstance(obj) && matchesSafely(obj);
    }

    public abstract boolean matchesSafely(T t);

    /* JADX WARN: Multi-variable type inference failed */
    public TypeSafeMatcher(Class<T> cls) {
        this.expectedType = cls;
    }
}
