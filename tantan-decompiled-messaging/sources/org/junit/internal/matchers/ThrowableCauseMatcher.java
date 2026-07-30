package org.junit.internal.matchers;

import java.lang.Throwable;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

/* JADX INFO: loaded from: classes3.dex */
public class ThrowableCauseMatcher<T extends Throwable> extends org.hamcrest.TypeSafeMatcher<T> {
    private final Matcher<? extends Throwable> causeMatcher;

    public ThrowableCauseMatcher(Matcher<? extends Throwable> matcher) {
        this.causeMatcher = matcher;
    }

    @Factory
    public static <T extends Throwable> Matcher<T> hasCause(Matcher<? extends Throwable> matcher) {
        return new ThrowableCauseMatcher(matcher);
    }

    @Override // org.hamcrest.TypeSafeMatcher
    public void describeMismatchSafely(T t, Description description) {
        description.appendText("cause ");
        this.causeMatcher.describeMismatch(t.getCause(), description);
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        description.appendText("exception with cause ");
        description.appendDescriptionOf(this.causeMatcher);
    }

    @Override // org.hamcrest.TypeSafeMatcher
    public boolean matchesSafely(T t) {
        return this.causeMatcher.matches(t.getCause());
    }
}
