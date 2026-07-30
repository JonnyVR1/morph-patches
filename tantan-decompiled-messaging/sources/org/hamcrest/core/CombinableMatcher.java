package org.hamcrest.core;

import java.util.ArrayList;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeDiagnosingMatcher;

/* JADX INFO: loaded from: classes3.dex */
public class CombinableMatcher<T> extends TypeSafeDiagnosingMatcher<T> {
    private final Matcher<? super T> matcher;

    public static final class CombinableBothMatcher<X> {
        private final Matcher<? super X> first;

        public CombinableBothMatcher(Matcher<? super X> matcher) {
            this.first = matcher;
        }

        public CombinableMatcher<X> and(Matcher<? super X> matcher) {
            return new CombinableMatcher(this.first).and(matcher);
        }
    }

    public static final class CombinableEitherMatcher<X> {
        private final Matcher<? super X> first;

        public CombinableEitherMatcher(Matcher<? super X> matcher) {
            this.first = matcher;
        }

        /* JADX INFO: renamed from: or */
        public CombinableMatcher<X> m221124or(Matcher<? super X> matcher) {
            return new CombinableMatcher(this.first).m221123or(matcher);
        }
    }

    public CombinableMatcher(Matcher<? super T> matcher) {
        this.matcher = matcher;
    }

    @Factory
    public static <LHS> CombinableBothMatcher<LHS> both(Matcher<? super LHS> matcher) {
        return new CombinableBothMatcher<>(matcher);
    }

    @Factory
    public static <LHS> CombinableEitherMatcher<LHS> either(Matcher<? super LHS> matcher) {
        return new CombinableEitherMatcher<>(matcher);
    }

    private ArrayList<Matcher<? super T>> templatedListWith(Matcher<? super T> matcher) {
        ArrayList<Matcher<? super T>> arrayList = new ArrayList<>();
        arrayList.add(this.matcher);
        arrayList.add(matcher);
        return arrayList;
    }

    public CombinableMatcher<T> and(Matcher<? super T> matcher) {
        return new CombinableMatcher<>(new AllOf(templatedListWith(matcher)));
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        description.appendDescriptionOf(this.matcher);
    }

    @Override // org.hamcrest.TypeSafeDiagnosingMatcher
    public boolean matchesSafely(T t, Description description) {
        if (this.matcher.matches(t)) {
            return true;
        }
        this.matcher.describeMismatch(t, description);
        return false;
    }

    /* JADX INFO: renamed from: or */
    public CombinableMatcher<T> m221123or(Matcher<? super T> matcher) {
        return new CombinableMatcher<>(new AnyOf(templatedListWith(matcher)));
    }
}
