package org.junit.internal.matchers;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Throwable;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class StacktracePrintingMatcher<T extends Throwable> extends org.hamcrest.TypeSafeMatcher<T> {
    private final Matcher<T> throwableMatcher;

    public StacktracePrintingMatcher(Matcher<T> matcher) {
        this.throwableMatcher = matcher;
    }

    @Factory
    public static <T extends Exception> Matcher<T> isException(Matcher<T> matcher) {
        return new StacktracePrintingMatcher(matcher);
    }

    @Factory
    public static <T extends Throwable> Matcher<T> isThrowable(Matcher<T> matcher) {
        return new StacktracePrintingMatcher(matcher);
    }

    private String readStacktrace(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // org.hamcrest.TypeSafeMatcher
    public void describeMismatchSafely(T t, Description description) {
        this.throwableMatcher.describeMismatch(t, description);
        description.appendText("\nStacktrace was: ");
        description.appendText(readStacktrace(t));
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        this.throwableMatcher.describeTo(description);
    }

    @Override // org.hamcrest.TypeSafeMatcher
    public boolean matchesSafely(T t) {
        return this.throwableMatcher.matches(t);
    }
}
