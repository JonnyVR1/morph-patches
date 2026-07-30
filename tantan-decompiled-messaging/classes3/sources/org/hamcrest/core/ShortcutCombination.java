package org.hamcrest.core;

import java.util.Iterator;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
abstract class ShortcutCombination<T> extends BaseMatcher<T> {
    private final Iterable<Matcher<? super T>> matchers;

    public ShortcutCombination(Iterable<Matcher<? super T>> iterable) {
        this.matchers = iterable;
    }

    @Override // org.hamcrest.SelfDescribing
    public abstract void describeTo(Description description);

    public void describeTo(Description description, String str) {
        description.appendList("(", " " + str + " ", ")", this.matchers);
    }

    @Override // org.hamcrest.Matcher
    public abstract boolean matches(Object obj);

    public boolean matches(Object obj, boolean z) {
        Iterator<Matcher<? super T>> it = this.matchers.iterator();
        while (it.hasNext()) {
            if (it.next().matches(obj) == z) {
                return z;
            }
        }
        return !z;
    }
}
