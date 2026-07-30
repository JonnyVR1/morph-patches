package p153l;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes7.dex */
public final class akq {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.akq$a */
    public class C15734a<T> extends xvi<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterable f72027b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ tp80 f72028c;

        public C15734a(Iterable iterable, tp80 tp80Var) {
            this.f72027b = iterable;
            this.f72028c = tp80Var;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.m15936l(this.f72027b.iterator(), this.f72028c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.akq$b */
    public class C15735b<T> extends xvi<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterable f72029b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ adj f72030c;

        public C15735b(Iterable iterable, adj adjVar) {
            this.f72029b = iterable;
            this.f72030c = adjVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.m15923B(this.f72029b.iterator(), this.f72030c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.akq$c */
    public class C15736c<T> extends xvi<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterable f72031b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f72032c;

        /* JADX INFO: renamed from: l.akq$c$a */
        public class a implements Iterator<T> {

            /* JADX INFO: renamed from: a */
            public boolean f72033a = true;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Iterator f72034b;

            public a(C15736c c15736c, Iterator it) {
                this.f72034b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f72034b.hasNext();
            }

            @Override // java.util.Iterator
            public T next() {
                T t = (T) this.f72034b.next();
                this.f72033a = false;
                return t;
            }

            @Override // java.util.Iterator
            public void remove() {
                se5.m185519e(!this.f72033a);
                this.f72034b.remove();
            }
        }

        public C15736c(Iterable iterable, int i) {
            this.f72031b = iterable;
            this.f72032c = i;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            Iterable iterable = this.f72031b;
            if (iterable instanceof List) {
                List list = (List) iterable;
                return list.subList(Math.min(list.size(), this.f72032c), list.size()).iterator();
            }
            Iterator<T> it = iterable.iterator();
            Iterators.m15926b(it, this.f72032c);
            return new a(this, it);
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> boolean m98593a(Collection<T> collection, Iterable<? extends T> iterable) {
        return iterable instanceof Collection ? collection.addAll((Collection) iterable) : Iterators.m15925a(collection, ((Iterable) xn80.m212111p(iterable)).iterator());
    }

    /* JADX INFO: renamed from: b */
    public static <T> boolean m98594b(Iterable<T> iterable, tp80<? super T> tp80Var) {
        return Iterators.m15927c(iterable.iterator(), tp80Var);
    }

    /* JADX INFO: renamed from: c */
    public static <E> Collection<E> m98595c(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : Lists.m15979l(iterable.iterator());
    }

    /* JADX INFO: renamed from: d */
    public static <T> Iterable<T> m98596d(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return xvi.m213229a(iterable, iterable2);
    }

    /* JADX INFO: renamed from: e */
    public static <T> Iterable<T> m98597e(Iterable<T> iterable, tp80<? super T> tp80Var) {
        xn80.m212111p(iterable);
        xn80.m212111p(tp80Var);
        return new C15734a(iterable, tp80Var);
    }

    /* JADX INFO: renamed from: f */
    public static <T> T m98598f(Iterable<? extends T> iterable, T t) {
        return (T) Iterators.m15940p(iterable.iterator(), t);
    }

    /* JADX INFO: renamed from: g */
    public static <T> T m98599g(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) Iterators.m15938n(iterable.iterator());
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return (T) m98601i(list);
        }
        mor.m159308a();
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static <T> T m98600h(Iterable<? extends T> iterable, T t) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return t;
            }
            if (iterable instanceof List) {
                return (T) m98601i(Lists.m15969b(iterable));
            }
        }
        return (T) Iterators.m15939o(iterable.iterator(), t);
    }

    /* JADX INFO: renamed from: i */
    public static <T> T m98601i(List<T> list) {
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: j */
    public static <T> T m98602j(Iterable<T> iterable) {
        return (T) Iterators.m15941q(iterable.iterator());
    }

    /* JADX INFO: renamed from: k */
    public static boolean m98603k(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    /* JADX INFO: renamed from: l */
    public static <T> boolean m98604l(Iterable<T> iterable, tp80<? super T> tp80Var) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? m98605m((List) iterable, (tp80) xn80.m212111p(tp80Var)) : Iterators.m15947w(iterable.iterator(), tp80Var);
    }

    /* JADX INFO: renamed from: m */
    public static <T> boolean m98605m(List<T> list, tp80<? super T> tp80Var) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            T t = list.get(i);
            if (!tp80Var.apply(t)) {
                if (i > i2) {
                    try {
                        list.set(i2, t);
                    } catch (IllegalArgumentException unused) {
                        m98607o(list, tp80Var, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        m98607o(list, tp80Var, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }

    /* JADX INFO: renamed from: n */
    public static <T> Iterable<T> m98606n(Iterable<T> iterable, int i) {
        xn80.m212111p(iterable);
        xn80.m212100e(i >= 0, "number to skip cannot be negative");
        return new C15736c(iterable, i);
    }

    /* JADX INFO: renamed from: o */
    public static <T> void m98607o(List<T> list, tp80<? super T> tp80Var, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (tp80Var.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    /* JADX INFO: renamed from: p */
    public static Object[] m98608p(Iterable<?> iterable) {
        return m98595c(iterable).toArray();
    }

    /* JADX INFO: renamed from: q */
    public static <T> T[] m98609q(Iterable<? extends T> iterable, T[] tArr) {
        return (T[]) m98595c(iterable).toArray(tArr);
    }

    /* JADX INFO: renamed from: r */
    public static String m98610r(Iterable<?> iterable) {
        return Iterators.m15922A(iterable.iterator());
    }

    /* JADX INFO: renamed from: s */
    public static <F, T> Iterable<T> m98611s(Iterable<F> iterable, adj<? super F, ? extends T> adjVar) {
        xn80.m212111p(iterable);
        xn80.m212111p(adjVar);
        return new C15735b(iterable, adjVar);
    }
}
