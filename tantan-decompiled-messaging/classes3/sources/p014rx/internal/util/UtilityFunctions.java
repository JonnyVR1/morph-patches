package p014rx.internal.util;

import p003l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class UtilityFunctions {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: rx.internal.util.UtilityFunctions$a */
    public static class C1176a<T> implements w9j<T, T> {
        @Override // p003l.w9j
        public T call(T t) {
            return t;
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> w9j<? super T, Boolean> m9943a() {
        return AlwaysTrue.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static <T> w9j<T, T> m9944b() {
        return new C1176a();
    }

    public enum AlwaysFalse implements w9j<Object, Boolean> {
        INSTANCE;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p003l.w9j
        public Boolean call(Object obj) {
            return Boolean.FALSE;
        }
    }

    public enum AlwaysTrue implements w9j<Object, Boolean> {
        INSTANCE;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p003l.w9j
        public Boolean call(Object obj) {
            return Boolean.TRUE;
        }
    }
}
