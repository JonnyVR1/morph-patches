package org.junit.experimental.results;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ResultMatchers {
    public static Matcher<PrintableResult> failureCountIs(final int i) {
        return new TypeSafeMatcher<PrintableResult>() { // from class: org.junit.experimental.results.ResultMatchers.1
            @Override // org.hamcrest.SelfDescribing
            public void describeTo(Description description) {
                description.appendText("has " + i + " failures");
            }

            @Override // org.hamcrest.TypeSafeMatcher
            public boolean matchesSafely(PrintableResult printableResult) {
                return printableResult.failureCount() == i;
            }
        };
    }

    public static Matcher<PrintableResult> hasFailureContaining(final String str) {
        return new BaseMatcher<PrintableResult>() { // from class: org.junit.experimental.results.ResultMatchers.3
            @Override // org.hamcrest.SelfDescribing
            public void describeTo(Description description) {
                description.appendText("has failure containing " + str);
            }

            @Override // org.hamcrest.Matcher
            public boolean matches(Object obj) {
                return obj.toString().contains(str);
            }
        };
    }

    public static Matcher<Object> hasSingleFailureContaining(final String str) {
        return new BaseMatcher<Object>() { // from class: org.junit.experimental.results.ResultMatchers.2
            @Override // org.hamcrest.SelfDescribing
            public void describeTo(Description description) {
                description.appendText("has single failure containing " + str);
            }

            @Override // org.hamcrest.Matcher
            public boolean matches(Object obj) {
                return obj.toString().contains(str) && ResultMatchers.failureCountIs(1).matches(obj);
            }
        };
    }

    public static Matcher<PrintableResult> isSuccessful() {
        return failureCountIs(0);
    }
}
