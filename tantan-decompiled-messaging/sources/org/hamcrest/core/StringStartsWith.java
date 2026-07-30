package org.hamcrest.core;

import org.hamcrest.Factory;
import org.hamcrest.Matcher;

/* JADX INFO: loaded from: classes3.dex */
public class StringStartsWith extends SubstringMatcher {
    public StringStartsWith(String str) {
        super(str);
    }

    @Factory
    public static Matcher<String> startsWith(String str) {
        return new StringStartsWith(str);
    }

    @Override // org.hamcrest.core.SubstringMatcher
    public boolean evalSubstringOf(String str) {
        return str.startsWith(this.substring);
    }

    @Override // org.hamcrest.core.SubstringMatcher
    public String relationship() {
        return "starting with";
    }
}
