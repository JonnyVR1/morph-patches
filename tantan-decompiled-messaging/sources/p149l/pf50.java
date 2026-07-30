package p149l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class pf50<T> implements C22306c.a<T> {

    /* JADX INFO: renamed from: a */
    public final Iterable<? extends C22306c<? extends T>> f148517a;

    /* JADX INFO: renamed from: l.pf50$a */
    public class C19196a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicReference f148518a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C19199d f148519b;

        public C19196a(AtomicReference atomicReference, C19199d c19199d) {
            this.f148518a = atomicReference;
            this.f148519b = c19199d;
        }

        @Override // p149l.d30
        public void call() {
            C19198c c19198c = (C19198c) this.f148518a.get();
            if (c19198c != null) {
                c19198c.unsubscribe();
            }
            pf50.m168594k(this.f148519b.f148528b);
        }
    }

    /* JADX INFO: renamed from: l.pf50$b */
    public class C19197b implements rc90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicReference f148521a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C19199d f148522b;

        public C19197b(AtomicReference atomicReference, C19199d c19199d) {
            this.f148521a = atomicReference;
            this.f148522b = c19199d;
        }

        @Override // p149l.rc90
        public void request(long j) {
            C19198c c19198c = (C19198c) this.f148521a.get();
            if (c19198c != null) {
                c19198c.m168598i(j);
                return;
            }
            for (C19198c<T> c19198c2 : this.f148522b.f148528b) {
                if (!c19198c2.isUnsubscribed()) {
                    if (this.f148521a.get() == c19198c2) {
                        c19198c2.m168598i(j);
                        return;
                    }
                    c19198c2.m168598i(j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.pf50$c */
    public static final class C19198c<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super T> f148524e;

        /* JADX INFO: renamed from: f */
        public final C19199d<T> f148525f;

        /* JADX INFO: renamed from: g */
        public boolean f148526g;

        public C19198c(long j, z3g0<? super T> z3g0Var, C19199d<T> c19199d) {
            this.f148524e = z3g0Var;
            this.f148525f = c19199d;
            m217048e(j);
        }

        /* JADX INFO: renamed from: h */
        private boolean m168597h() {
            if (this.f148526g) {
                return true;
            }
            if (this.f148525f.f148527a.get() == this) {
                this.f148526g = true;
                return true;
            }
            boolean zM119248a = f31.m119248a(this.f148525f.f148527a, null, this);
            C19199d<T> c19199d = this.f148525f;
            if (!zM119248a) {
                c19199d.m168599a();
                return false;
            }
            c19199d.m168600b(this);
            this.f148526g = true;
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public void m168598i(long j) {
            m217048e(j);
        }

        @Override // p149l.m250
        public void onCompleted() {
            if (m168597h()) {
                this.f148524e.onCompleted();
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            if (m168597h()) {
                this.f148524e.onError(th);
            }
        }

        @Override // p149l.m250
        public void onNext(T t) {
            if (m168597h()) {
                this.f148524e.onNext(t);
            }
        }
    }

    /* JADX INFO: renamed from: l.pf50$d */
    public static final class C19199d<T> {

        /* JADX INFO: renamed from: a */
        public final AtomicReference<C19198c<T>> f148527a = new AtomicReference<>();

        /* JADX INFO: renamed from: b */
        public final Collection<C19198c<T>> f148528b = new ConcurrentLinkedQueue();

        /* JADX INFO: renamed from: a */
        public void m168599a() {
            C19198c<T> c19198c = this.f148527a.get();
            if (c19198c != null) {
                m168600b(c19198c);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m168600b(C19198c<T> c19198c) {
            for (C19198c<T> c19198c2 : this.f148528b) {
                if (c19198c2 != c19198c) {
                    c19198c2.unsubscribe();
                }
            }
            this.f148528b.clear();
        }
    }

    public pf50(Iterable<? extends C22306c<? extends T>> iterable) {
        this.f148517a = iterable;
    }

    /* JADX INFO: renamed from: a */
    public static <T> C22306c.a<T> m168585a(Iterable<? extends C22306c<? extends T>> iterable) {
        return new pf50(iterable);
    }

    /* JADX INFO: renamed from: b */
    public static <T> C22306c.a<T> m168586b(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c22306c);
        arrayList.add(c22306c2);
        return m168585a(arrayList);
    }

    /* JADX INFO: renamed from: c */
    public static <T> C22306c.a<T> m168587c(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c22306c);
        arrayList.add(c22306c2);
        arrayList.add(c22306c3);
        return m168585a(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public static <T> C22306c.a<T> m168588d(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c22306c);
        arrayList.add(c22306c2);
        arrayList.add(c22306c3);
        arrayList.add(c22306c4);
        return m168585a(arrayList);
    }

    /* JADX INFO: renamed from: e */
    public static <T> C22306c.a<T> m168589e(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c22306c);
        arrayList.add(c22306c2);
        arrayList.add(c22306c3);
        arrayList.add(c22306c4);
        arrayList.add(c22306c5);
        return m168585a(arrayList);
    }

    /* JADX INFO: renamed from: f */
    public static <T> C22306c.a<T> m168590f(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5, C22306c<? extends T> c22306c6) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c22306c);
        arrayList.add(c22306c2);
        arrayList.add(c22306c3);
        arrayList.add(c22306c4);
        arrayList.add(c22306c5);
        arrayList.add(c22306c6);
        return m168585a(arrayList);
    }

    /* JADX INFO: renamed from: g */
    public static <T> C22306c.a<T> m168591g(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5, C22306c<? extends T> c22306c6, C22306c<? extends T> c22306c7) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c22306c);
        arrayList.add(c22306c2);
        arrayList.add(c22306c3);
        arrayList.add(c22306c4);
        arrayList.add(c22306c5);
        arrayList.add(c22306c6);
        arrayList.add(c22306c7);
        return m168585a(arrayList);
    }

    /* JADX INFO: renamed from: h */
    public static <T> C22306c.a<T> m168592h(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5, C22306c<? extends T> c22306c6, C22306c<? extends T> c22306c7, C22306c<? extends T> c22306c8) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c22306c);
        arrayList.add(c22306c2);
        arrayList.add(c22306c3);
        arrayList.add(c22306c4);
        arrayList.add(c22306c5);
        arrayList.add(c22306c6);
        arrayList.add(c22306c7);
        arrayList.add(c22306c8);
        return m168585a(arrayList);
    }

    /* JADX INFO: renamed from: i */
    public static <T> C22306c.a<T> m168593i(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5, C22306c<? extends T> c22306c6, C22306c<? extends T> c22306c7, C22306c<? extends T> c22306c8, C22306c<? extends T> c22306c9) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c22306c);
        arrayList.add(c22306c2);
        arrayList.add(c22306c3);
        arrayList.add(c22306c4);
        arrayList.add(c22306c5);
        arrayList.add(c22306c6);
        arrayList.add(c22306c7);
        arrayList.add(c22306c8);
        arrayList.add(c22306c9);
        return m168585a(arrayList);
    }

    /* JADX INFO: renamed from: k */
    public static <T> void m168594k(Collection<C19198c<T>> collection) {
        if (collection.isEmpty()) {
            return;
        }
        Iterator<C19198c<T>> it = collection.iterator();
        while (it.hasNext()) {
            it.next().unsubscribe();
        }
        collection.clear();
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        C19199d c19199d = new C19199d();
        AtomicReference<C19198c<T>> atomicReference = c19199d.f148527a;
        z3g0Var.m217046b(h4g0.m129240a(new C19196a(atomicReference, c19199d)));
        for (C22306c<? extends T> c22306c : this.f148517a) {
            if (z3g0Var.isUnsubscribed()) {
                break;
            }
            C19198c<T> c19198c = new C19198c<>(0L, z3g0Var, c19199d);
            c19199d.f148528b.add(c19198c);
            C19198c<T> c19198c2 = atomicReference.get();
            if (c19198c2 != null) {
                c19199d.m168600b(c19198c2);
                return;
            }
            c22306c.unsafeSubscribe(c19198c);
        }
        if (z3g0Var.isUnsubscribed()) {
            m168594k(c19199d.f148528b);
        }
        z3g0Var.mo106696f(new C19197b(atomicReference, c19199d));
    }
}
