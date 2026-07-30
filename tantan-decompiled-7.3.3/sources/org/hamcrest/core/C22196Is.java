package org.hamcrest.core;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

/* JADX INFO: renamed from: org.hamcrest.core.Is */
/* JADX INFO: loaded from: classes3.dex */
public class C22196Is<T> extends BaseMatcher<T> {
    private final Matcher<T> matcher;

    public C22196Is(Matcher<T> matcher) {
        this.matcher = matcher;
    }

    @Factory
    /* JADX INFO: renamed from: is */
    public static <T> Matcher<T> m222372is(T t) {
        return m222373is(IsEqual.equalTo(t));
    }

    @Factory
    public static <T> Matcher<T> isA(Class<T> cls) {
        return m222373is(IsInstanceOf.instanceOf(cls));
    }

    @Override // org.hamcrest.BaseMatcher, org.hamcrest.Matcher
    public void describeMismatch(Object obj, Description description) {
        this.matcher.describeMismatch(obj, description);
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        description.appendText("is ").appendDescriptionOf(this.matcher);
    }

    @Override // org.hamcrest.Matcher
    public boolean matches(Object obj) {
        return this.matcher.matches(obj);
    }

    @Factory
    /* JADX INFO: renamed from: is */
    public static <T> Matcher<T> m222373is(Matcher<T> matcher) {
        return new C22196Is(matcher);
    }

    @Factory
    @Deprecated
    /* JADX INFO: renamed from: is */
    public static <T> Matcher<T> m222371is(Class<T> cls) {
        return m222373is(IsInstanceOf.instanceOf(cls));
    }
}
