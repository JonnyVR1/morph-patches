package org.junit.rules;

import java.util.ArrayList;
import java.util.List;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.matchers.JUnitMatchers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
class ExpectedExceptionMatcherBuilder {
    private final List<Matcher<?>> matchers = new ArrayList();

    private Matcher<Throwable> allOfTheMatchers() {
        return this.matchers.size() == 1 ? cast(this.matchers.get(0)) : CoreMatchers.allOf(castedMatchers());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Matcher<Throwable> cast(Matcher<?> matcher) {
        return matcher;
    }

    private List<Matcher<? super Throwable>> castedMatchers() {
        return new ArrayList(this.matchers);
    }

    public void add(Matcher<?> matcher) {
        this.matchers.add(matcher);
    }

    public Matcher<Throwable> build() {
        return JUnitMatchers.isThrowable(allOfTheMatchers());
    }

    public boolean expectsThrowable() {
        return !this.matchers.isEmpty();
    }
}
