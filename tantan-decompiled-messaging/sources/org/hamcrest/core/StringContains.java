package org.hamcrest.core;

import org.hamcrest.Factory;
import org.hamcrest.Matcher;

/* JADX INFO: loaded from: classes3.dex */
public class StringContains extends SubstringMatcher {
    public StringContains(String str) {
        super(str);
    }

    @Factory
    public static Matcher<String> containsString(String str) {
        return new StringContains(str);
    }

    @Override // org.hamcrest.core.SubstringMatcher
    public boolean evalSubstringOf(String str) {
        return str.indexOf(this.substring) >= 0;
    }

    @Override // org.hamcrest.core.SubstringMatcher
    public String relationship() {
        return "containing";
    }
}
