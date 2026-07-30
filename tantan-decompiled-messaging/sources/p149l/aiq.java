package p149l;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes7.dex */
public final class aiq {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.aiq$a */
    public class C15632a<T> extends bti<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterable f70018b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ oh80 f70019c;

        public C15632a(Iterable iterable, oh80 oh80Var) {
            this.f70018b = iterable;
            this.f70019c = oh80Var;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.m15882l(this.f70018b.iterator(), this.f70019c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.aiq$b */
    public class C15633b<T> extends bti<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterable f70020b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gaj f70021c;

        public C15633b(Iterable iterable, gaj gajVar) {
            this.f70020b = iterable;
            this.f70021c = gajVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.m15869B(this.f70020b.iterator(), this.f70021c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.aiq$c */
    public class C15634c<T> extends bti<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterable f70022b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f70023c;

        /* JADX INFO: renamed from: l.aiq$c$a */
        public class a implements Iterator<T> {

            /* JADX INFO: renamed from: a */
            public boolean f70024a = true;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Iterator f70025b;

            public a(C15634c c15634c, Iterator it) {
                this.f70025b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f70025b.hasNext();
            }

            @Override // java.util.Iterator
            public T next() {
                T t = (T) this.f70025b.next();
                this.f70024a = false;
                return t;
            }

            @Override // java.util.Iterator
            public void remove() {
                sd5.m183447e(!this.f70024a);
                this.f70025b.remove();
            }
        }

        public C15634c(Iterable iterable, int i) {
            this.f70022b = iterable;
            this.f70023c = i;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            Iterable iterable = this.f70022b;
            if (iterable instanceof List) {
                List list = (List) iterable;
                return list.subList(Math.min(list.size(), this.f70023c), list.size()).iterator();
            }
            Iterator<T> it = iterable.iterator();
            Iterators.m15872b(it, this.f70023c);
            return new a(this, it);
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> boolean m96875a(Collection<T> collection, Iterable<? extends T> iterable) {
        return iterable instanceof Collection ? collection.addAll((Collection) iterable) : Iterators.m15871a(collection, ((Iterable) sf80.m183894p(iterable)).iterator());
    }

    /* JADX INFO: renamed from: b */
    public static <T> boolean m96876b(Iterable<T> iterable, oh80<? super T> oh80Var) {
        return Iterators.m15873c(iterable.iterator(), oh80Var);
    }

    /* JADX INFO: renamed from: c */
    public static <E> Collection<E> m96877c(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : Lists.m15925l(iterable.iterator());
    }

    /* JADX INFO: renamed from: d */
    public static <T> Iterable<T> m96878d(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return bti.m103838a(iterable, iterable2);
    }

    /* JADX INFO: renamed from: e */
    public static <T> Iterable<T> m96879e(Iterable<T> iterable, oh80<? super T> oh80Var) {
        sf80.m183894p(iterable);
        sf80.m183894p(oh80Var);
        return new C15632a(iterable, oh80Var);
    }

    /* JADX INFO: renamed from: f */
    public static <T> T m96880f(Iterable<? extends T> iterable, T t) {
        return (T) Iterators.m15886p(iterable.iterator(), t);
    }

    /* JADX INFO: renamed from: g */
    public static <T> T m96881g(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) Iterators.m15884n(iterable.iterator());
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return (T) m96883i(list);
        }
        lmr.m150601a();
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static <T> T m96882h(Iterable<? extends T> iterable, T t) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return t;
            }
            if (iterable instanceof List) {
                return (T) m96883i(Lists.m15915b(iterable));
            }
        }
        return (T) Iterators.m15885o(iterable.iterator(), t);
    }

    /* JADX INFO: renamed from: i */
    public static <T> T m96883i(List<T> list) {
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: j */
    public static <T> T m96884j(Iterable<T> iterable) {
        return (T) Iterators.m15887q(iterable.iterator());
    }

    /* JADX INFO: renamed from: k */
    public static boolean m96885k(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    /* JADX INFO: renamed from: l */
    public static <T> boolean m96886l(Iterable<T> iterable, oh80<? super T> oh80Var) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? m96887m((List) iterable, (oh80) sf80.m183894p(oh80Var)) : Iterators.m15893w(iterable.iterator(), oh80Var);
    }

    /* JADX INFO: renamed from: m */
    public static <T> boolean m96887m(List<T> list, oh80<? super T> oh80Var) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            T t = list.get(i);
            if (!oh80Var.apply(t)) {
                if (i > i2) {
                    try {
                        list.set(i2, t);
                    } catch (IllegalArgumentException unused) {
                        m96889o(list, oh80Var, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        m96889o(list, oh80Var, i2, i);
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
    public static <T> Iterable<T> m96888n(Iterable<T> iterable, int i) {
        sf80.m183894p(iterable);
        sf80.m183883e(i >= 0, "number to skip cannot be negative");
        return new C15634c(iterable, i);
    }

    /* JADX INFO: renamed from: o */
    public static <T> void m96889o(List<T> list, oh80<? super T> oh80Var, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (oh80Var.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    /* JADX INFO: renamed from: p */
    public static Object[] m96890p(Iterable<?> iterable) {
        return m96877c(iterable).toArray();
    }

    /* JADX INFO: renamed from: q */
    public static <T> T[] m96891q(Iterable<? extends T> iterable, T[] tArr) {
        return (T[]) m96877c(iterable).toArray(tArr);
    }

    /* JADX INFO: renamed from: r */
    public static String m96892r(Iterable<?> iterable) {
        return Iterators.m15868A(iterable.iterator());
    }

    /* JADX INFO: renamed from: s */
    public static <F, T> Iterable<T> m96893s(Iterable<F> iterable, gaj<? super F, ? extends T> gajVar) {
        sf80.m183894p(iterable);
        sf80.m183894p(gajVar);
        return new C15633b(iterable, gajVar);
    }
}
