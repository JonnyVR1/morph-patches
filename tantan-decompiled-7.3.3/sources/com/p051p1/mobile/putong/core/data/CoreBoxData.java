package com.p051p1.mobile.putong.core.data;

/* JADX INFO: loaded from: classes10.dex */
public class CoreBoxData<T> {
    public T box;

    private CoreBoxData(T t) {
        this.box = t;
    }

    public static <T> CoreBoxData box(T t) {
        return new CoreBoxData(t);
    }
}
