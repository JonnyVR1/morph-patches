package org.hamcrest;

import l.y9g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MatcherAssert {
    public static <T> void assertThat(String str, T t, Matcher<? super T> matcher) {
        if (matcher.matches(t)) {
            return;
        }
        StringDescription stringDescription = new StringDescription();
        stringDescription.appendText(str).appendText("\nExpected: ").appendDescriptionOf(matcher).appendText("\n     but: ");
        matcher.describeMismatch(t, stringDescription);
        throw new AssertionError(stringDescription.toString());
    }

    public static <T> void assertThat(T t, Matcher<? super T> matcher) {
        assertThat("", t, matcher);
    }

    public static void assertThat(String str, boolean z) {
        if (z) {
            return;
        }
        y9g0.a(str);
    }
}
