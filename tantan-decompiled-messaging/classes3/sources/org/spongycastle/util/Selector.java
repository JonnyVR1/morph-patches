package org.spongycastle.util;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface Selector<T> extends Cloneable {
    Object clone();

    boolean match(T t);
}
