package p149l;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public abstract class bti<E> implements Iterable<E> {

    /* JADX INFO: renamed from: a */
    public final Optional<Iterable<E>> f77227a;

    /* JADX INFO: renamed from: l.bti$a */
    public class C15970a extends bti<E> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterable f77228b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15970a(Iterable iterable, Iterable iterable2) {
            super(iterable);
            this.f77228b = iterable2;
        }

        @Override // java.lang.Iterable
        public Iterator<E> iterator() {
            return this.f77228b.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.bti$b */
    public class C15971b<T> extends bti<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterable[] f77229b;

        /* JADX INFO: renamed from: l.bti$b$a */
        public class a extends AbstractC18630n7<Iterator<? extends T>> {
            public a(int i) {
                super(i);
            }

            @Override // p149l.AbstractC18630n7
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Iterator<? extends T> mo15608a(int i) {
                return C15971b.this.f77229b[i].iterator();
            }
        }

        public C15971b(Iterable[] iterableArr) {
            this.f77229b = iterableArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.m15876f(new a(this.f77229b.length));
        }
    }

    public bti() {
        this.f77227a = Optional.absent();
    }

    /* JADX INFO: renamed from: a */
    public static <T> bti<T> m103838a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return m103839c(iterable, iterable2);
    }

    /* JADX INFO: renamed from: c */
    public static <T> bti<T> m103839c(Iterable<? extends T>... iterableArr) {
        for (Iterable<? extends T> iterable : iterableArr) {
            sf80.m183894p(iterable);
        }
        return new C15971b(iterableArr);
    }

    /* JADX INFO: renamed from: g */
    public static <E> bti<E> m103840g(Iterable<E> iterable) {
        return iterable instanceof bti ? (bti) iterable : new C15970a(iterable, iterable);
    }

    /* JADX INFO: renamed from: f */
    public final bti<E> m103841f(oh80<? super E> oh80Var) {
        return m103840g(aiq.m96879e(m103842h(), oh80Var));
    }

    /* JADX INFO: renamed from: h */
    public final Iterable<E> m103842h() {
        return this.f77227a.mo15406or(this);
    }

    /* JADX INFO: renamed from: i */
    public final ImmutableSet<E> m103843i() {
        return ImmutableSet.copyOf(m103842h());
    }

    public String toString() {
        return aiq.m96892r(m103842h());
    }

    public bti(Iterable<E> iterable) {
        this.f77227a = Optional.m15413of(iterable);
    }
}
