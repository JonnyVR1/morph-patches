package com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import p153l.adj;
import p153l.b7h0;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: com.google.common.base.Optional$a */
    public class C2670a implements Iterable<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterable f10655a;

        /* JADX INFO: renamed from: com.google.common.base.Optional$a$a */
        public class a extends AbstractIterator<T> {

            /* JADX INFO: renamed from: c */
            public final Iterator<? extends Optional<? extends T>> f10656c;

            public a() {
                this.f10656c = (Iterator) xn80.m212111p(C2670a.this.f10655a.iterator());
            }

            @Override // com.google.common.base.AbstractIterator
            /* JADX INFO: renamed from: a */
            public T mo15462a() {
                while (this.f10656c.hasNext()) {
                    Optional<? extends T> next = this.f10656c.next();
                    if (next.isPresent()) {
                        return next.get();
                    }
                }
                return m15463b();
            }
        }

        public C2670a(Iterable iterable) {
            this.f10655a = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return new a();
        }
    }

    public static <T> Optional<T> absent() {
        return Absent.withType();
    }

    public static <T> Optional<T> fromNullable(T t) {
        return t == null ? absent() : new Present(t);
    }

    /* JADX INFO: renamed from: of */
    public static <T> Optional<T> m15467of(T t) {
        return new Present(xn80.m212111p(t));
    }

    public static <T> Iterable<T> presentInstances(Iterable<? extends Optional<? extends T>> iterable) {
        xn80.m212111p(iterable);
        return new C2670a(iterable);
    }

    public abstract Set<T> asSet();

    public abstract boolean equals(Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    /* JADX INFO: renamed from: or */
    public abstract Optional<T> mo15459or(Optional<? extends T> optional);

    /* JADX INFO: renamed from: or */
    public abstract T mo15460or(T t);

    /* JADX INFO: renamed from: or */
    public abstract T mo15461or(b7h0<? extends T> b7h0Var);

    public abstract T orNull();

    public abstract String toString();

    public abstract <V> Optional<V> transform(adj<? super T, V> adjVar);
}
