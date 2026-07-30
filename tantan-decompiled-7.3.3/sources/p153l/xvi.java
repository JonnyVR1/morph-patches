package p153l;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public abstract class xvi<E> implements Iterable<E> {

    /* JADX INFO: renamed from: a */
    public final Optional<Iterable<E>> f196402a;

    /* JADX INFO: renamed from: l.xvi$a */
    public class C21456a extends xvi<E> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterable f196403b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21456a(Iterable iterable, Iterable iterable2) {
            super(iterable);
            this.f196403b = iterable2;
        }

        @Override // java.lang.Iterable
        public Iterator<E> iterator() {
            return this.f196403b.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.xvi$b */
    public class C21457b<T> extends xvi<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterable[] f196404b;

        /* JADX INFO: renamed from: l.xvi$b$a */
        public class a extends AbstractC17659i7<Iterator<? extends T>> {
            public a(int i) {
                super(i);
            }

            @Override // p153l.AbstractC17659i7
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Iterator<? extends T> mo15662a(int i) {
                return C21457b.this.f196404b[i].iterator();
            }
        }

        public C21457b(Iterable[] iterableArr) {
            this.f196404b = iterableArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.m15930f(new a(this.f196404b.length));
        }
    }

    public xvi() {
        this.f196402a = Optional.absent();
    }

    /* JADX INFO: renamed from: a */
    public static <T> xvi<T> m213229a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return m213230c(iterable, iterable2);
    }

    /* JADX INFO: renamed from: c */
    public static <T> xvi<T> m213230c(Iterable<? extends T>... iterableArr) {
        for (Iterable<? extends T> iterable : iterableArr) {
            xn80.m212111p(iterable);
        }
        return new C21457b(iterableArr);
    }

    /* JADX INFO: renamed from: g */
    public static <E> xvi<E> m213231g(Iterable<E> iterable) {
        return iterable instanceof xvi ? (xvi) iterable : new C21456a(iterable, iterable);
    }

    /* JADX INFO: renamed from: f */
    public final xvi<E> m213232f(tp80<? super E> tp80Var) {
        return m213231g(akq.m98597e(m213233h(), tp80Var));
    }

    /* JADX INFO: renamed from: h */
    public final Iterable<E> m213233h() {
        return this.f196402a.mo15460or(this);
    }

    /* JADX INFO: renamed from: i */
    public final ImmutableSet<E> m213234i() {
        return ImmutableSet.copyOf(m213233h());
    }

    public String toString() {
        return akq.m98610r(m213233h());
    }

    public xvi(Iterable<E> iterable) {
        this.f196402a = Optional.m15467of(iterable);
    }
}
