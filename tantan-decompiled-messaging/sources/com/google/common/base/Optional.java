package com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import p149l.gaj;
import p149l.sf80;
import p149l.tyg0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: com.google.common.base.Optional$a */
    public class C2647a implements Iterable<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterable f10618a;

        /* JADX INFO: renamed from: com.google.common.base.Optional$a$a */
        public class a extends AbstractIterator<T> {

            /* JADX INFO: renamed from: c */
            public final Iterator<? extends Optional<? extends T>> f10619c;

            public a() {
                this.f10619c = (Iterator) sf80.m183894p(C2647a.this.f10618a.iterator());
            }

            @Override // com.google.common.base.AbstractIterator
            /* JADX INFO: renamed from: a */
            public T mo15408a() {
                while (this.f10619c.hasNext()) {
                    Optional<? extends T> next = this.f10619c.next();
                    if (next.isPresent()) {
                        return next.get();
                    }
                }
                return m15409b();
            }
        }

        public C2647a(Iterable iterable) {
            this.f10618a = iterable;
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
    public static <T> Optional<T> m15413of(T t) {
        return new Present(sf80.m183894p(t));
    }

    public static <T> Iterable<T> presentInstances(Iterable<? extends Optional<? extends T>> iterable) {
        sf80.m183894p(iterable);
        return new C2647a(iterable);
    }

    public abstract Set<T> asSet();

    public abstract boolean equals(Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    /* JADX INFO: renamed from: or */
    public abstract Optional<T> mo15405or(Optional<? extends T> optional);

    /* JADX INFO: renamed from: or */
    public abstract T mo15406or(T t);

    /* JADX INFO: renamed from: or */
    public abstract T mo15407or(tyg0<? extends T> tyg0Var);

    public abstract T orNull();

    public abstract String toString();

    public abstract <V> Optional<V> transform(gaj<? super T, V> gajVar);
}
