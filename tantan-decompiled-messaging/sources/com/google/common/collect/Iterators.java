package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import p149l.AbstractC18630n7;
import p149l.dpj0;
import p149l.fpj0;
import p149l.gaj;
import p149l.lmr;
import p149l.ni60;
import p149l.oh80;
import p149l.qkq0;
import p149l.s7j0;
import p149l.sd5;
import p149l.sf80;
import p149l.v050;
import p149l.vu40;

/* JADX INFO: loaded from: classes7.dex */
public final class Iterators {

    public enum EmptyModifiableIterator implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            sd5.m183447e(false);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.common.collect.Iterators$a */
    public class C2812a<T> extends dpj0<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterator f10940a;

        public C2812a(Iterator it) {
            this.f10940a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10940a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return (T) this.f10940a.next();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.common.collect.Iterators$b */
    public class C2813b<T> extends AbstractIterator<T> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Iterator f10941c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ oh80 f10942d;

        public C2813b(Iterator it, oh80 oh80Var) {
            this.f10941c = it;
            this.f10942d = oh80Var;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.AbstractIterator
        /* JADX INFO: renamed from: a */
        public T mo15565a() {
            while (this.f10941c.hasNext()) {
                T t = (T) this.f10941c.next();
                if (this.f10942d.apply(t)) {
                    return t;
                }
            }
            return m15566b();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, F] */
    /* JADX INFO: renamed from: com.google.common.collect.Iterators$c */
    public class C2814c<F, T> extends s7j0<F, T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gaj f10943b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2814c(Iterator it, gaj gajVar) {
            super(it);
            this.f10943b = gajVar;
        }

        @Override // p149l.s7j0
        /* JADX INFO: renamed from: a */
        public T mo15897a(F f) {
            return (T) this.f10943b.apply(f);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.common.collect.Iterators$d */
    public class C2815d<T> extends dpj0<T> {

        /* JADX INFO: renamed from: a */
        public boolean f10944a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f10945b;

        public C2815d(Object obj) {
            this.f10945b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f10944a;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f10944a) {
                lmr.m150601a();
                return null;
            }
            this.f10944a = true;
            return (T) this.f10945b;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$e */
    public static final class C2816e<T> extends AbstractC18630n7<T> {

        /* JADX INFO: renamed from: e */
        public static final fpj0<Object> f10946e = new C2816e(new Object[0], 0, 0, 0);

        /* JADX INFO: renamed from: c */
        public final T[] f10947c;

        /* JADX INFO: renamed from: d */
        public final int f10948d;

        public C2816e(T[] tArr, int i, int i2, int i3) {
            super(i2, i3);
            this.f10947c = tArr;
            this.f10948d = i;
        }

        @Override // p149l.AbstractC18630n7
        /* JADX INFO: renamed from: a */
        public T mo15608a(int i) {
            return this.f10947c[this.f10948d + i];
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$f */
    public static class C2817f<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public Iterator<? extends T> f10949a;

        /* JADX INFO: renamed from: b */
        public Iterator<? extends T> f10950b = Iterators.m15879i();

        /* JADX INFO: renamed from: c */
        public Iterator<? extends Iterator<? extends T>> f10951c;

        /* JADX INFO: renamed from: d */
        public Deque<Iterator<? extends Iterator<? extends T>>> f10952d;

        public C2817f(Iterator<? extends Iterator<? extends T>> it) {
            this.f10951c = (Iterator) sf80.m183894p(it);
        }

        /* JADX INFO: renamed from: a */
        public final Iterator<? extends Iterator<? extends T>> m15898a() {
            while (true) {
                Iterator<? extends Iterator<? extends T>> it = this.f10951c;
                if (it != null && it.hasNext()) {
                    return this.f10951c;
                }
                Deque<Iterator<? extends Iterator<? extends T>>> deque = this.f10952d;
                if (deque == null || deque.isEmpty()) {
                    return null;
                }
                this.f10951c = this.f10952d.removeFirst();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!((Iterator) sf80.m183894p(this.f10950b)).hasNext()) {
                Iterator<? extends Iterator<? extends T>> itM15898a = m15898a();
                this.f10951c = itM15898a;
                if (itM15898a == null) {
                    return false;
                }
                Iterator<? extends T> next = itM15898a.next();
                this.f10950b = next;
                if (next instanceof C2817f) {
                    C2817f c2817f = (C2817f) next;
                    this.f10950b = c2817f.f10950b;
                    if (this.f10952d == null) {
                        this.f10952d = new ArrayDeque();
                    }
                    this.f10952d.addFirst(this.f10951c);
                    if (c2817f.f10952d != null) {
                        while (!c2817f.f10952d.isEmpty()) {
                            this.f10952d.addFirst(c2817f.f10952d.removeLast());
                        }
                    }
                    this.f10951c = c2817f.f10951c;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                lmr.m150601a();
                return null;
            }
            Iterator<? extends T> it = this.f10950b;
            this.f10949a = it;
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            Iterator<? extends T> it = this.f10949a;
            if (it == null) {
                qkq0.m175383a("no calls to next() since the last call to remove()");
            } else {
                it.remove();
                this.f10949a = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$g */
    public static class C2818g<T> extends dpj0<T> {

        /* JADX INFO: renamed from: a */
        public final Queue<ni60<T>> f10953a;

        public C2818g(Iterable<? extends Iterator<? extends T>> iterable, final Comparator<? super T> comparator) {
            this.f10953a = new PriorityQueue(2, new Comparator() { // from class: l.eiq
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return comparator.compare(((ni60) obj).peek(), ((ni60) obj2).peek());
                }
            });
            for (Iterator<? extends T> it : iterable) {
                if (it.hasNext()) {
                    this.f10953a.add(Iterators.m15890t(it));
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f10953a.isEmpty();
        }

        @Override // java.util.Iterator
        public T next() {
            ni60<T> ni60VarRemove = this.f10953a.remove();
            T next = ni60VarRemove.next();
            if (ni60VarRemove.hasNext()) {
                this.f10953a.add(ni60VarRemove);
            }
            return next;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$h */
    public static class C2819h<E> implements ni60<E> {

        /* JADX INFO: renamed from: a */
        public final Iterator<? extends E> f10954a;

        /* JADX INFO: renamed from: b */
        public boolean f10955b;

        /* JADX INFO: renamed from: c */
        public E f10956c;

        public C2819h(Iterator<? extends E> it) {
            this.f10954a = (Iterator) sf80.m183894p(it);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10955b || this.f10954a.hasNext();
        }

        @Override // p149l.ni60, java.util.Iterator
        public E next() {
            if (!this.f10955b) {
                return this.f10954a.next();
            }
            E e = (E) vu40.m200060a(this.f10956c);
            this.f10955b = false;
            this.f10956c = null;
            return e;
        }

        @Override // p149l.ni60
        public E peek() {
            if (!this.f10955b) {
                this.f10956c = this.f10954a.next();
                this.f10955b = true;
            }
            return (E) vu40.m200060a(this.f10956c);
        }

        @Override // java.util.Iterator
        public void remove() {
            sf80.m183901w(!this.f10955b, "Can't remove after you've peeked at next");
            this.f10954a.remove();
        }
    }

    /* JADX INFO: renamed from: A */
    public static String m15868A(Iterator<?> it) {
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: B */
    public static <F, T> Iterator<T> m15869B(Iterator<F> it, gaj<? super F, ? extends T> gajVar) {
        sf80.m183894p(gajVar);
        return new C2814c(it, gajVar);
    }

    /* JADX INFO: renamed from: C */
    public static <T> dpj0<T> m15870C(Iterator<? extends T> it) {
        sf80.m183894p(it);
        return it instanceof dpj0 ? (dpj0) it : new C2812a(it);
    }

    /* JADX INFO: renamed from: a */
    public static <T> boolean m15871a(Collection<T> collection, Iterator<? extends T> it) {
        sf80.m183894p(collection);
        sf80.m183894p(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: b */
    public static int m15872b(Iterator<?> it, int i) {
        sf80.m183894p(it);
        int i2 = 0;
        sf80.m183883e(i >= 0, "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: c */
    public static <T> boolean m15873c(Iterator<T> it, oh80<? super T> oh80Var) {
        return m15888r(it, oh80Var) != -1;
    }

    /* JADX INFO: renamed from: d */
    public static <T> ListIterator<T> m15874d(Iterator<T> it) {
        return (ListIterator) it;
    }

    /* JADX INFO: renamed from: e */
    public static void m15875e(Iterator<?> it) {
        sf80.m183894p(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* JADX INFO: renamed from: f */
    public static <T> Iterator<T> m15876f(Iterator<? extends Iterator<? extends T>> it) {
        return new C2817f(it);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m15877g(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m15878h(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !v050.m196470a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    /* JADX INFO: renamed from: i */
    public static <T> dpj0<T> m15879i() {
        return m15880j();
    }

    /* JADX INFO: renamed from: j */
    public static <T> fpj0<T> m15880j() {
        return (fpj0<T>) C2816e.f10946e;
    }

    /* JADX INFO: renamed from: k */
    public static <T> Iterator<T> m15881k() {
        return EmptyModifiableIterator.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static <T> dpj0<T> m15882l(Iterator<T> it, oh80<? super T> oh80Var) {
        sf80.m183894p(it);
        sf80.m183894p(oh80Var);
        return new C2813b(it, oh80Var);
    }

    /* JADX INFO: renamed from: m */
    public static <T> T m15883m(Iterator<T> it, oh80<? super T> oh80Var) {
        sf80.m183894p(it);
        sf80.m183894p(oh80Var);
        while (it.hasNext()) {
            T next = it.next();
            if (oh80Var.apply(next)) {
                return next;
            }
        }
        lmr.m150601a();
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static <T> T m15884n(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* JADX INFO: renamed from: o */
    public static <T> T m15885o(Iterator<? extends T> it, T t) {
        return it.hasNext() ? (T) m15884n(it) : t;
    }

    /* JADX INFO: renamed from: p */
    public static <T> T m15886p(Iterator<? extends T> it, T t) {
        return it.hasNext() ? it.next() : t;
    }

    /* JADX INFO: renamed from: q */
    public static <T> T m15887q(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: r */
    public static <T> int m15888r(Iterator<T> it, oh80<? super T> oh80Var) {
        sf80.m183895q(oh80Var, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (oh80Var.apply(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: s */
    public static <T> dpj0<T> m15889s(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
        sf80.m183895q(iterable, "iterators");
        sf80.m183895q(comparator, "comparator");
        return new C2818g(iterable, comparator);
    }

    /* JADX INFO: renamed from: t */
    public static <T> ni60<T> m15890t(Iterator<? extends T> it) {
        return it instanceof C2819h ? (C2819h) it : new C2819h(it);
    }

    /* JADX INFO: renamed from: u */
    public static <T> T m15891u(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m15892v(Iterator<?> it, Collection<?> collection) {
        sf80.m183894p(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: w */
    public static <T> boolean m15893w(Iterator<T> it, oh80<? super T> oh80Var) {
        sf80.m183894p(oh80Var);
        boolean z = false;
        while (it.hasNext()) {
            if (oh80Var.apply(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m15894x(Iterator<?> it, Collection<?> collection) {
        sf80.m183894p(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: y */
    public static <T> dpj0<T> m15895y(T t) {
        return new C2815d(t);
    }

    /* JADX INFO: renamed from: z */
    public static int m15896z(Iterator<?> it) {
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return Ints.m16468m(j);
    }
}
