package org.hamcrest.core;

import org.hamcrest.Factory;
import org.hamcrest.Matcher;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class StringEndsWith extends SubstringMatcher {
    public StringEndsWith(String str) {
        super(str);
    }

    @Factory
    public static Matcher<String> endsWith(String str) {
        return new StringEndsWith(str);
    }

    @Override // org.hamcrest.core.SubstringMatcher
    public boolean evalSubstringOf(String str) {
        return str.endsWith(this.substring);
    }

    @Override // org.hamcrest.core.SubstringMatcher
    public String relationship() {
        return "ending with";
    }
}
