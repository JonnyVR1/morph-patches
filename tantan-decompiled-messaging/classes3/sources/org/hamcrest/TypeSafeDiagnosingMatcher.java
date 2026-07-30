package org.hamcrest;

import org.hamcrest.internal.ReflectiveTypeFinder;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class TypeSafeDiagnosingMatcher<T> extends BaseMatcher<T> {
    private static final ReflectiveTypeFinder TYPE_FINDER = new ReflectiveTypeFinder("matchesSafely", 2, 0);
    private final Class<?> expectedType;

    public TypeSafeDiagnosingMatcher(ReflectiveTypeFinder reflectiveTypeFinder) {
        this.expectedType = reflectiveTypeFinder.findExpectedType(getClass());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.hamcrest.BaseMatcher, org.hamcrest.Matcher
    public final void describeMismatch(Object obj, Description description) {
        if (obj == 0 || !this.expectedType.isInstance(obj)) {
            super.describeMismatch(obj, description);
        } else {
            matchesSafely(obj, description);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.hamcrest.Matcher
    public final boolean matches(Object obj) {
        return obj != 0 && this.expectedType.isInstance(obj) && matchesSafely(obj, new Description.NullDescription());
    }

    public abstract boolean matchesSafely(T t, Description description);

    public TypeSafeDiagnosingMatcher(Class<?> cls) {
        this.expectedType = cls;
    }

    public TypeSafeDiagnosingMatcher() {
        this(TYPE_FINDER);
    }
}
