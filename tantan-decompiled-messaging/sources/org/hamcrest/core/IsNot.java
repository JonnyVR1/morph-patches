package org.hamcrest.core;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

/* JADX INFO: loaded from: classes3.dex */
public class IsNot<T> extends BaseMatcher<T> {
    private final Matcher<T> matcher;

    public IsNot(Matcher<T> matcher) {
        this.matcher = matcher;
    }

    @Factory
    public static <T> Matcher<T> not(T t) {
        return not(IsEqual.equalTo(t));
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        description.appendText("not ").appendDescriptionOf(this.matcher);
    }

    @Override // org.hamcrest.Matcher
    public boolean matches(Object obj) {
        return !this.matcher.matches(obj);
    }

    @Factory
    public static <T> Matcher<T> not(Matcher<T> matcher) {
        return new IsNot(matcher);
    }
}
