package org.hamcrest.internal;

import org.hamcrest.Description;
import org.hamcrest.SelfDescribing;

/* JADX INFO: loaded from: classes3.dex */
public class SelfDescribingValue<T> implements SelfDescribing {
    private T value;

    public SelfDescribingValue(T t) {
        this.value = t;
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        description.appendValue(this.value);
    }
}
