package com.momo.rtcbase;

/* JADX INFO: loaded from: classes8.dex */
public interface Predicate<T> {
    default Predicate<T> and(final Predicate<? super T> predicate) {
        return new Predicate<T>() { // from class: com.momo.rtcbase.Predicate.2
            @Override // com.momo.rtcbase.Predicate
            public boolean test(T t) {
                return Predicate.this.test(t) && predicate.test(t);
            }
        };
    }

    default Predicate<T> negate() {
        return new Predicate<T>() { // from class: com.momo.rtcbase.Predicate.3
            @Override // com.momo.rtcbase.Predicate
            public boolean test(T t) {
                return !Predicate.this.test(t);
            }
        };
    }

    /* JADX INFO: renamed from: or */
    default Predicate<T> m21203or(final Predicate<? super T> predicate) {
        return new Predicate<T>() { // from class: com.momo.rtcbase.Predicate.1
            @Override // com.momo.rtcbase.Predicate
            public boolean test(T t) {
                return Predicate.this.test(t) || predicate.test(t);
            }
        };
    }

    boolean test(T t);
}
