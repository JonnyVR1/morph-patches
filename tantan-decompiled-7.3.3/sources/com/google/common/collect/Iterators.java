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
import p153l.AbstractC17659i7;
import p153l.adj;
import p153l.gyj0;
import p153l.iyj0;
import p153l.k350;
import p153l.k950;
import p153l.mor;
import p153l.se5;
import p153l.sq60;
import p153l.tp80;
import p153l.wgj0;
import p153l.wtq0;
import p153l.xn80;

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
            se5.m185519e(false);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.common.collect.Iterators$a */
    public class C2835a<T> extends gyj0<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterator f10977a;

        public C2835a(Iterator it) {
            this.f10977a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10977a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return (T) this.f10977a.next();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.common.collect.Iterators$b */
    public class C2836b<T> extends AbstractIterator<T> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Iterator f10978c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ tp80 f10979d;

        public C2836b(Iterator it, tp80 tp80Var) {
            this.f10978c = it;
            this.f10979d = tp80Var;
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
        public T mo15619a() {
            while (this.f10978c.hasNext()) {
                T t = (T) this.f10978c.next();
                if (this.f10979d.apply(t)) {
                    return t;
                }
            }
            return m15620b();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, F] */
    /* JADX INFO: renamed from: com.google.common.collect.Iterators$c */
    public class C2837c<F, T> extends wgj0<F, T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ adj f10980b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2837c(Iterator it, adj adjVar) {
            super(it);
            this.f10980b = adjVar;
        }

        @Override // p153l.wgj0
        /* JADX INFO: renamed from: a */
        public T mo15951a(F f) {
            return (T) this.f10980b.apply(f);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.common.collect.Iterators$d */
    public class C2838d<T> extends gyj0<T> {

        /* JADX INFO: renamed from: a */
        public boolean f10981a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f10982b;

        public C2838d(Object obj) {
            this.f10982b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f10981a;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f10981a) {
                mor.m159308a();
                return null;
            }
            this.f10981a = true;
            return (T) this.f10982b;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$e */
    public static final class C2839e<T> extends AbstractC17659i7<T> {

        /* JADX INFO: renamed from: e */
        public static final iyj0<Object> f10983e = new C2839e(new Object[0], 0, 0, 0);

        /* JADX INFO: renamed from: c */
        public final T[] f10984c;

        /* JADX INFO: renamed from: d */
        public final int f10985d;

        public C2839e(T[] tArr, int i, int i2, int i3) {
            super(i2, i3);
            this.f10984c = tArr;
            this.f10985d = i;
        }

        @Override // p153l.AbstractC17659i7
        /* JADX INFO: renamed from: a */
        public T mo15662a(int i) {
            return this.f10984c[this.f10985d + i];
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$f */
    public static class C2840f<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public Iterator<? extends T> f10986a;

        /* JADX INFO: renamed from: b */
        public Iterator<? extends T> f10987b = Iterators.m15933i();

        /* JADX INFO: renamed from: c */
        public Iterator<? extends Iterator<? extends T>> f10988c;

        /* JADX INFO: renamed from: d */
        public Deque<Iterator<? extends Iterator<? extends T>>> f10989d;

        public C2840f(Iterator<? extends Iterator<? extends T>> it) {
            this.f10988c = (Iterator) xn80.m212111p(it);
        }

        /* JADX INFO: renamed from: a */
        public final Iterator<? extends Iterator<? extends T>> m15952a() {
            while (true) {
                Iterator<? extends Iterator<? extends T>> it = this.f10988c;
                if (it != null && it.hasNext()) {
                    return this.f10988c;
                }
                Deque<Iterator<? extends Iterator<? extends T>>> deque = this.f10989d;
                if (deque == null || deque.isEmpty()) {
                    return null;
                }
                this.f10988c = this.f10989d.removeFirst();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!((Iterator) xn80.m212111p(this.f10987b)).hasNext()) {
                Iterator<? extends Iterator<? extends T>> itM15952a = m15952a();
                this.f10988c = itM15952a;
                if (itM15952a == null) {
                    return false;
                }
                Iterator<? extends T> next = itM15952a.next();
                this.f10987b = next;
                if (next instanceof C2840f) {
                    C2840f c2840f = (C2840f) next;
                    this.f10987b = c2840f.f10987b;
                    if (this.f10989d == null) {
                        this.f10989d = new ArrayDeque();
                    }
                    this.f10989d.addFirst(this.f10988c);
                    if (c2840f.f10989d != null) {
                        while (!c2840f.f10989d.isEmpty()) {
                            this.f10989d.addFirst(c2840f.f10989d.removeLast());
                        }
                    }
                    this.f10988c = c2840f.f10988c;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                mor.m159308a();
                return null;
            }
            Iterator<? extends T> it = this.f10987b;
            this.f10986a = it;
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            Iterator<? extends T> it = this.f10986a;
            if (it == null) {
                wtq0.m207906a("no calls to next() since the last call to remove()");
            } else {
                it.remove();
                this.f10986a = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$g */
    public static class C2841g<T> extends gyj0<T> {

        /* JADX INFO: renamed from: a */
        public final Queue<sq60<T>> f10990a;

        public C2841g(Iterable<? extends Iterator<? extends T>> iterable, final Comparator<? super T> comparator) {
            this.f10990a = new PriorityQueue(2, new Comparator() { // from class: l.ekq
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return comparator.compare(((sq60) obj).peek(), ((sq60) obj2).peek());
                }
            });
            for (Iterator<? extends T> it : iterable) {
                if (it.hasNext()) {
                    this.f10990a.add(Iterators.m15944t(it));
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f10990a.isEmpty();
        }

        @Override // java.util.Iterator
        public T next() {
            sq60<T> sq60VarRemove = this.f10990a.remove();
            T next = sq60VarRemove.next();
            if (sq60VarRemove.hasNext()) {
                this.f10990a.add(sq60VarRemove);
            }
            return next;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$h */
    public static class C2842h<E> implements sq60<E> {

        /* JADX INFO: renamed from: a */
        public final Iterator<? extends E> f10991a;

        /* JADX INFO: renamed from: b */
        public boolean f10992b;

        /* JADX INFO: renamed from: c */
        public E f10993c;

        public C2842h(Iterator<? extends E> it) {
            this.f10991a = (Iterator) xn80.m212111p(it);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10992b || this.f10991a.hasNext();
        }

        @Override // p153l.sq60, java.util.Iterator
        public E next() {
            if (!this.f10992b) {
                return this.f10991a.next();
            }
            E e = (E) k350.m147997a(this.f10993c);
            this.f10992b = false;
            this.f10993c = null;
            return e;
        }

        @Override // p153l.sq60
        public E peek() {
            if (!this.f10992b) {
                this.f10993c = this.f10991a.next();
                this.f10992b = true;
            }
            return (E) k350.m147997a(this.f10993c);
        }

        @Override // java.util.Iterator
        public void remove() {
            xn80.m212118w(!this.f10992b, "Can't remove after you've peeked at next");
            this.f10991a.remove();
        }
    }

    /* JADX INFO: renamed from: A */
    public static String m15922A(Iterator<?> it) {
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
    public static <F, T> Iterator<T> m15923B(Iterator<F> it, adj<? super F, ? extends T> adjVar) {
        xn80.m212111p(adjVar);
        return new C2837c(it, adjVar);
    }

    /* JADX INFO: renamed from: C */
    public static <T> gyj0<T> m15924C(Iterator<? extends T> it) {
        xn80.m212111p(it);
        return it instanceof gyj0 ? (gyj0) it : new C2835a(it);
    }

    /* JADX INFO: renamed from: a */
    public static <T> boolean m15925a(Collection<T> collection, Iterator<? extends T> it) {
        xn80.m212111p(collection);
        xn80.m212111p(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: b */
    public static int m15926b(Iterator<?> it, int i) {
        xn80.m212111p(it);
        int i2 = 0;
        xn80.m212100e(i >= 0, "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: c */
    public static <T> boolean m15927c(Iterator<T> it, tp80<? super T> tp80Var) {
        return m15942r(it, tp80Var) != -1;
    }

    /* JADX INFO: renamed from: d */
    public static <T> ListIterator<T> m15928d(Iterator<T> it) {
        return (ListIterator) it;
    }

    /* JADX INFO: renamed from: e */
    public static void m15929e(Iterator<?> it) {
        xn80.m212111p(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* JADX INFO: renamed from: f */
    public static <T> Iterator<T> m15930f(Iterator<? extends Iterator<? extends T>> it) {
        return new C2840f(it);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m15931g(Iterator<?> it, Object obj) {
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
    public static boolean m15932h(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !k950.m148863a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    /* JADX INFO: renamed from: i */
    public static <T> gyj0<T> m15933i() {
        return m15934j();
    }

    /* JADX INFO: renamed from: j */
    public static <T> iyj0<T> m15934j() {
        return (iyj0<T>) C2839e.f10983e;
    }

    /* JADX INFO: renamed from: k */
    public static <T> Iterator<T> m15935k() {
        return EmptyModifiableIterator.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static <T> gyj0<T> m15936l(Iterator<T> it, tp80<? super T> tp80Var) {
        xn80.m212111p(it);
        xn80.m212111p(tp80Var);
        return new C2836b(it, tp80Var);
    }

    /* JADX INFO: renamed from: m */
    public static <T> T m15937m(Iterator<T> it, tp80<? super T> tp80Var) {
        xn80.m212111p(it);
        xn80.m212111p(tp80Var);
        while (it.hasNext()) {
            T next = it.next();
            if (tp80Var.apply(next)) {
                return next;
            }
        }
        mor.m159308a();
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static <T> T m15938n(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* JADX INFO: renamed from: o */
    public static <T> T m15939o(Iterator<? extends T> it, T t) {
        return it.hasNext() ? (T) m15938n(it) : t;
    }

    /* JADX INFO: renamed from: p */
    public static <T> T m15940p(Iterator<? extends T> it, T t) {
        return it.hasNext() ? it.next() : t;
    }

    /* JADX INFO: renamed from: q */
    public static <T> T m15941q(Iterator<T> it) {
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
    public static <T> int m15942r(Iterator<T> it, tp80<? super T> tp80Var) {
        xn80.m212112q(tp80Var, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (tp80Var.apply(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: s */
    public static <T> gyj0<T> m15943s(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
        xn80.m212112q(iterable, "iterators");
        xn80.m212112q(comparator, "comparator");
        return new C2841g(iterable, comparator);
    }

    /* JADX INFO: renamed from: t */
    public static <T> sq60<T> m15944t(Iterator<? extends T> it) {
        return it instanceof C2842h ? (C2842h) it : new C2842h(it);
    }

    /* JADX INFO: renamed from: u */
    public static <T> T m15945u(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m15946v(Iterator<?> it, Collection<?> collection) {
        xn80.m212111p(collection);
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
    public static <T> boolean m15947w(Iterator<T> it, tp80<? super T> tp80Var) {
        xn80.m212111p(tp80Var);
        boolean z = false;
        while (it.hasNext()) {
            if (tp80Var.apply(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m15948x(Iterator<?> it, Collection<?> collection) {
        xn80.m212111p(collection);
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
    public static <T> gyj0<T> m15949y(T t) {
        return new C2838d(t);
    }

    /* JADX INFO: renamed from: z */
    public static int m15950z(Iterator<?> it) {
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return Ints.m16523m(j);
    }
}
