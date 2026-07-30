package org.hamcrest;

import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CustomMatcher<T> extends BaseMatcher<T> {
    private final String fixedDescription;

    public CustomMatcher(String str) {
        if (str != null) {
            this.fixedDescription = str;
        } else {
            ig3.m135964a("Description should be non null!");
            throw null;
        }
    }

    @Override // org.hamcrest.SelfDescribing
    public final void describeTo(Description description) {
        description.appendText(this.fixedDescription);
    }
}
