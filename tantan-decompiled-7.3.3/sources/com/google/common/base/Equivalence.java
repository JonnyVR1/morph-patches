package com.google.common.base;

import java.io.Serializable;
import p153l.adj;
import p153l.k950;
import p153l.tp80;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Equivalence<T> {

    public static final class Equals extends Equivalence<Object> implements Serializable {
        static final Equals INSTANCE = new Equals();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return INSTANCE;
        }

        @Override // com.google.common.base.Equivalence
        public boolean doEquivalent(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.google.common.base.Equivalence
        public int doHash(Object obj) {
            return obj.hashCode();
        }
    }

    public static final class EquivalentToPredicate<T> implements tp80<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<T> equivalence;
        private final T target;

        public EquivalentToPredicate(Equivalence<T> equivalence, T t) {
            this.equivalence = (Equivalence) xn80.m212111p(equivalence);
            this.target = t;
        }

        @Override // p153l.tp80
        public boolean apply(T t) {
            return this.equivalence.equivalent(t, this.target);
        }

        @Override // p153l.tp80
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof EquivalentToPredicate) {
                EquivalentToPredicate equivalentToPredicate = (EquivalentToPredicate) obj;
                if (this.equivalence.equals(equivalentToPredicate.equivalence) && k950.m148863a(this.target, equivalentToPredicate.target)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return k950.m148864b(this.equivalence, this.target);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.equivalence);
            String strValueOf2 = String.valueOf(this.target);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 15 + strValueOf2.length());
            sb.append(strValueOf);
            sb.append(".equivalentTo(");
            sb.append(strValueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class Identity extends Equivalence<Object> implements Serializable {
        static final Identity INSTANCE = new Identity();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return INSTANCE;
        }

        @Override // com.google.common.base.Equivalence
        public boolean doEquivalent(Object obj, Object obj2) {
            return false;
        }

        @Override // com.google.common.base.Equivalence
        public int doHash(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public static final class Wrapper<T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<? super T> equivalence;
        private final T reference;

        private Wrapper(Equivalence<? super T> equivalence, T t) {
            this.equivalence = (Equivalence) xn80.m212111p(equivalence);
            this.reference = t;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Wrapper)) {
                return false;
            }
            Wrapper wrapper = (Wrapper) obj;
            if (this.equivalence.equals(wrapper.equivalence)) {
                return this.equivalence.equivalent(this.reference, wrapper.reference);
            }
            return false;
        }

        public T get() {
            return this.reference;
        }

        public int hashCode() {
            return this.equivalence.hash(this.reference);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.equivalence);
            String strValueOf2 = String.valueOf(this.reference);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 7 + strValueOf2.length());
            sb.append(strValueOf);
            sb.append(".wrap(");
            sb.append(strValueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static Equivalence<Object> equals() {
        return Equals.INSTANCE;
    }

    public static Equivalence<Object> identity() {
        return Identity.INSTANCE;
    }

    public abstract boolean doEquivalent(T t, T t2);

    public abstract int doHash(T t);

    public final boolean equivalent(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return doEquivalent(t, t2);
    }

    public final tp80<T> equivalentTo(T t) {
        return new EquivalentToPredicate(this, t);
    }

    public final int hash(T t) {
        if (t == null) {
            return 0;
        }
        return doHash(t);
    }

    public final <F> Equivalence<F> onResultOf(adj<? super F, ? extends T> adjVar) {
        return new FunctionalEquivalence(adjVar, this);
    }

    public final <S extends T> Equivalence<Iterable<S>> pairwise() {
        return new PairwiseEquivalence(this);
    }

    public final <S extends T> Wrapper<S> wrap(S s) {
        return new Wrapper<>(s);
    }
}
