package org.hamcrest;

import org.hamcrest.core.AllOf;
import org.hamcrest.core.AnyOf;
import org.hamcrest.core.C0874Is;
import org.hamcrest.core.CombinableMatcher;
import org.hamcrest.core.DescribedAs;
import org.hamcrest.core.Every;
import org.hamcrest.core.IsAnything;
import org.hamcrest.core.IsCollectionContaining;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsInstanceOf;
import org.hamcrest.core.IsNot;
import org.hamcrest.core.IsNull;
import org.hamcrest.core.IsSame;
import org.hamcrest.core.StringContains;
import org.hamcrest.core.StringEndsWith;
import org.hamcrest.core.StringStartsWith;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CoreMatchers {
    public static <T> Matcher<T> allOf(Iterable<Matcher<? super T>> iterable) {
        return AllOf.allOf(iterable);
    }

    public static <T> Matcher<T> any(Class<T> cls) {
        return IsInstanceOf.any(cls);
    }

    public static <T> AnyOf<T> anyOf(Iterable<Matcher<? super T>> iterable) {
        return AnyOf.anyOf(iterable);
    }

    public static Matcher<Object> anything() {
        return IsAnything.anything();
    }

    public static <LHS> CombinableMatcher.CombinableBothMatcher<LHS> both(Matcher<? super LHS> matcher) {
        return CombinableMatcher.both(matcher);
    }

    public static Matcher<String> containsString(String str) {
        return StringContains.containsString(str);
    }

    public static <T> Matcher<T> describedAs(String str, Matcher<T> matcher, Object... objArr) {
        return DescribedAs.describedAs(str, matcher, objArr);
    }

    public static <LHS> CombinableMatcher.CombinableEitherMatcher<LHS> either(Matcher<? super LHS> matcher) {
        return CombinableMatcher.either(matcher);
    }

    public static Matcher<String> endsWith(String str) {
        return StringEndsWith.endsWith(str);
    }

    public static <T> Matcher<T> equalTo(T t) {
        return IsEqual.equalTo(t);
    }

    public static <U> Matcher<Iterable<U>> everyItem(Matcher<U> matcher) {
        return Every.everyItem(matcher);
    }

    public static <T> Matcher<Iterable<? super T>> hasItem(T t) {
        return IsCollectionContaining.hasItem(t);
    }

    public static <T> Matcher<Iterable<T>> hasItems(T... tArr) {
        return IsCollectionContaining.hasItems(tArr);
    }

    public static <T> Matcher<T> instanceOf(Class<?> cls) {
        return IsInstanceOf.instanceOf(cls);
    }

    /* JADX INFO: renamed from: is */
    public static <T> Matcher<T> m9578is(T t) {
        return C0874Is.m9583is(t);
    }

    public static <T> Matcher<T> isA(Class<T> cls) {
        return C0874Is.isA(cls);
    }

    public static <T> Matcher<T> not(Matcher<T> matcher) {
        return IsNot.not((Matcher) matcher);
    }

    public static Matcher<Object> notNullValue() {
        return IsNull.notNullValue();
    }

    public static Matcher<Object> nullValue() {
        return IsNull.nullValue();
    }

    public static <T> Matcher<T> sameInstance(T t) {
        return IsSame.sameInstance(t);
    }

    public static Matcher<String> startsWith(String str) {
        return StringStartsWith.startsWith(str);
    }

    public static <T> Matcher<T> theInstance(T t) {
        return IsSame.theInstance(t);
    }

    public static <T> Matcher<T> allOf(Matcher<? super T>... matcherArr) {
        return AllOf.allOf(matcherArr);
    }

    public static <T> AnyOf<T> anyOf(Matcher<T> matcher, Matcher<? super T> matcher2, Matcher<? super T> matcher3) {
        return AnyOf.anyOf(matcher, matcher2, matcher3);
    }

    public static Matcher<Object> anything(String str) {
        return IsAnything.anything(str);
    }

    public static <T> Matcher<Iterable<? super T>> hasItem(Matcher<? super T> matcher) {
        return IsCollectionContaining.hasItem((Matcher) matcher);
    }

    public static <T> Matcher<Iterable<T>> hasItems(Matcher<? super T>... matcherArr) {
        return IsCollectionContaining.hasItems((Matcher[]) matcherArr);
    }

    /* JADX INFO: renamed from: is */
    public static <T> Matcher<T> m9579is(Matcher<T> matcher) {
        return C0874Is.m9584is((Matcher) matcher);
    }

    public static <T> Matcher<T> not(T t) {
        return IsNot.not(t);
    }

    public static <T> Matcher<T> notNullValue(Class<T> cls) {
        return IsNull.notNullValue(cls);
    }

    public static <T> Matcher<T> nullValue(Class<T> cls) {
        return IsNull.nullValue(cls);
    }

    public static <T> Matcher<T> allOf(Matcher<? super T> matcher, Matcher<? super T> matcher2) {
        return AllOf.allOf(matcher, matcher2);
    }

    public static <T> AnyOf<T> anyOf(Matcher<T> matcher, Matcher<? super T> matcher2, Matcher<? super T> matcher3, Matcher<? super T> matcher4) {
        return AnyOf.anyOf(matcher, matcher2, matcher3, matcher4);
    }

    /* JADX INFO: renamed from: is */
    public static <T> Matcher<T> m9577is(Class<T> cls) {
        return C0874Is.m9582is((Class) cls);
    }

    public static <T> Matcher<T> allOf(Matcher<? super T> matcher, Matcher<? super T> matcher2, Matcher<? super T> matcher3) {
        return AllOf.allOf(matcher, matcher2, matcher3);
    }

    public static <T> AnyOf<T> anyOf(Matcher<T> matcher, Matcher<? super T> matcher2, Matcher<? super T> matcher3, Matcher<? super T> matcher4, Matcher<? super T> matcher5) {
        return AnyOf.anyOf(matcher, matcher2, matcher3, matcher4, matcher5);
    }

    public static <T> Matcher<T> allOf(Matcher<? super T> matcher, Matcher<? super T> matcher2, Matcher<? super T> matcher3, Matcher<? super T> matcher4) {
        return AllOf.allOf(matcher, matcher2, matcher3, matcher4);
    }

    public static <T> AnyOf<T> anyOf(Matcher<T> matcher, Matcher<? super T> matcher2, Matcher<? super T> matcher3, Matcher<? super T> matcher4, Matcher<? super T> matcher5, Matcher<? super T> matcher6) {
        return AnyOf.anyOf(matcher, matcher2, matcher3, matcher4, matcher5, matcher6);
    }

    public static <T> Matcher<T> allOf(Matcher<? super T> matcher, Matcher<? super T> matcher2, Matcher<? super T> matcher3, Matcher<? super T> matcher4, Matcher<? super T> matcher5) {
        return AllOf.allOf(matcher, matcher2, matcher3, matcher4, matcher5);
    }

    public static <T> AnyOf<T> anyOf(Matcher<T> matcher, Matcher<? super T> matcher2) {
        return AnyOf.anyOf(matcher, matcher2);
    }

    public static <T> Matcher<T> allOf(Matcher<? super T> matcher, Matcher<? super T> matcher2, Matcher<? super T> matcher3, Matcher<? super T> matcher4, Matcher<? super T> matcher5, Matcher<? super T> matcher6) {
        return AllOf.allOf(matcher, matcher2, matcher3, matcher4, matcher5, matcher6);
    }

    public static <T> AnyOf<T> anyOf(Matcher<? super T>... matcherArr) {
        return AnyOf.anyOf(matcherArr);
    }
}
