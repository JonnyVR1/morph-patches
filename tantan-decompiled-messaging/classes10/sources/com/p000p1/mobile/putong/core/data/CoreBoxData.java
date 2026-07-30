package com.p000p1.mobile.putong.core.data;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CoreBoxData<T> {
    public T box;

    private CoreBoxData(T t) {
        this.box = t;
    }

    public static <T> CoreBoxData box(T t) {
        return new CoreBoxData(t);
    }
}
