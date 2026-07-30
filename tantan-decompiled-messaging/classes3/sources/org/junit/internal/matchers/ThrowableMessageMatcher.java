package org.junit.internal.matchers;

import java.lang.Throwable;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ThrowableMessageMatcher<T extends Throwable> extends org.hamcrest.TypeSafeMatcher<T> {
    private final Matcher<String> matcher;

    public ThrowableMessageMatcher(Matcher<String> matcher) {
        this.matcher = matcher;
    }

    @Factory
    public static <T extends Throwable> Matcher<T> hasMessage(Matcher<String> matcher) {
        return new ThrowableMessageMatcher(matcher);
    }

    @Override // org.hamcrest.TypeSafeMatcher
    public void describeMismatchSafely(T t, Description description) {
        description.appendText("message ");
        this.matcher.describeMismatch(t.getMessage(), description);
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        description.appendText("exception with message ");
        description.appendDescriptionOf(this.matcher);
    }

    @Override // org.hamcrest.TypeSafeMatcher
    public boolean matchesSafely(T t) {
        return this.matcher.matches(t.getMessage());
    }
}
