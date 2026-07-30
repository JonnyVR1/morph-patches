package p137rx.internal.util;

import p153l.qcj;

/* JADX INFO: loaded from: classes3.dex */
public final class UtilityFunctions {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: rx.internal.util.UtilityFunctions$a */
    public static class C22498a<T> implements qcj<T, T> {
        @Override // p153l.qcj
        public T call(T t) {
            return t;
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> qcj<? super T, Boolean> m222732a() {
        return AlwaysTrue.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static <T> qcj<T, T> m222733b() {
        return new C22498a();
    }

    public enum AlwaysFalse implements qcj<Object, Boolean> {
        INSTANCE;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p153l.qcj
        public Boolean call(Object obj) {
            return Boolean.FALSE;
        }
    }

    public enum AlwaysTrue implements qcj<Object, Boolean> {
        INSTANCE;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p153l.qcj
        public Boolean call(Object obj) {
            return Boolean.TRUE;
        }
    }
}
