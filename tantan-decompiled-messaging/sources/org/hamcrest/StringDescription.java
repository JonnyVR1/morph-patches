package org.hamcrest;

import java.io.IOException;
import p149l.pkq0;

/* JADX INFO: loaded from: classes3.dex */
public class StringDescription extends BaseDescription {
    private final Appendable out;

    public StringDescription() {
        this(new StringBuilder());
    }

    public static String asString(SelfDescribing selfDescribing) {
        return toString(selfDescribing);
    }

    public static String toString(SelfDescribing selfDescribing) {
        return new StringDescription().appendDescriptionOf(selfDescribing).toString();
    }

    @Override // org.hamcrest.BaseDescription
    public void append(String str) {
        try {
            this.out.append(str);
        } catch (IOException e) {
            pkq0.m170054a("Could not write description", e);
        }
    }

    public StringDescription(Appendable appendable) {
        this.out = appendable;
    }

    @Override // org.hamcrest.BaseDescription
    public void append(char c) {
        try {
            this.out.append(c);
        } catch (IOException e) {
            pkq0.m170054a("Could not write description", e);
        }
    }

    public String toString() {
        return this.out.toString();
    }
}
