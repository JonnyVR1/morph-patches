package org.hamcrest;

import l.ig3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class CustomTypeSafeMatcher<T> extends TypeSafeMatcher<T> {
    private final String fixedDescription;

    public CustomTypeSafeMatcher(String str) {
        if (str != null) {
            this.fixedDescription = str;
        } else {
            ig3.a("Description must be non null!");
            throw null;
        }
    }

    @Override // org.hamcrest.SelfDescribing
    public final void describeTo(Description description) {
        description.appendText(this.fixedDescription);
    }
}
