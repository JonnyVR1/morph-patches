package p003l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import l.f31;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class pf50<T> implements C1099c.a<T> {

    /* JADX INFO: renamed from: a */
    public final Iterable<? extends C1099c<? extends T>> f6394a;

    /* JADX INFO: renamed from: l.pf50$a */
    public class C0472a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicReference f6395a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0475d f6396b;

        public C0472a(AtomicReference atomicReference, C0475d c0475d) {
            this.f6395a = atomicReference;
            this.f6396b = c0475d;
        }

        @Override // p003l.d30
        public void call() {
            C0474c c0474c = (C0474c) this.f6395a.get();
            if (c0474c != null) {
                c0474c.unsubscribe();
            }
            pf50.m6848k(this.f6396b.f6405b);
        }
    }

    /* JADX INFO: renamed from: l.pf50$b */
    public class C0473b implements rc90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicReference f6398a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0475d f6399b;

        public C0473b(AtomicReference atomicReference, C0475d c0475d) {
            this.f6398a = atomicReference;
            this.f6399b = c0475d;
        }

        @Override // p003l.rc90
        public void request(long j) {
            C0474c c0474c = (C0474c) this.f6398a.get();
            if (c0474c != null) {
                c0474c.m6852i(j);
                return;
            }
            for (C0474c<T> c0474c2 : this.f6399b.f6405b) {
                if (!c0474c2.isUnsubscribed()) {
                    if (this.f6398a.get() == c0474c2) {
                        c0474c2.m6852i(j);
                        return;
                    }
                    c0474c2.m6852i(j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.pf50$c */
    public static final class C0474c<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super T> f6401e;

        /* JADX INFO: renamed from: f */
        public final C0475d<T> f6402f;

        /* JADX INFO: renamed from: g */
        public boolean f6403g;

        public C0474c(long j, z3g0<? super T> z3g0Var, C0475d<T> c0475d) {
            this.f6401e = z3g0Var;
            this.f6402f = c0475d;
            m9242e(j);
        }

        /* JADX INFO: renamed from: h */
        private boolean m6851h() {
            if (this.f6403g) {
                return true;
            }
            if (this.f6402f.f6404a.get() == this) {
                this.f6403g = true;
                return true;
            }
            boolean zA = f31.a(this.f6402f.f6404a, (Object) null, this);
            C0475d<T> c0475d = this.f6402f;
            if (!zA) {
                c0475d.m6853a();
                return false;
            }
            c0475d.m6854b(this);
            this.f6403g = true;
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public void m6852i(long j) {
            m9242e(j);
        }

        @Override // p003l.m250
        public void onCompleted() {
            if (m6851h()) {
                this.f6401e.onCompleted();
            }
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            if (m6851h()) {
                this.f6401e.onError(th);
            }
        }

        @Override // p003l.m250
        public void onNext(T t) {
            if (m6851h()) {
                this.f6401e.onNext(t);
            }
        }
    }

    /* JADX INFO: renamed from: l.pf50$d */
    public static final class C0475d<T> {

        /* JADX INFO: renamed from: a */
        public final AtomicReference<C0474c<T>> f6404a = new AtomicReference<>();

        /* JADX INFO: renamed from: b */
        public final Collection<C0474c<T>> f6405b = new ConcurrentLinkedQueue();

        /* JADX INFO: renamed from: a */
        public void m6853a() {
            C0474c<T> c0474c = this.f6404a.get();
            if (c0474c != null) {
                m6854b(c0474c);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m6854b(C0474c<T> c0474c) {
            for (C0474c<T> c0474c2 : this.f6405b) {
                if (c0474c2 != c0474c) {
                    c0474c2.unsubscribe();
                }
            }
            this.f6405b.clear();
        }
    }

    public pf50(Iterable<? extends C1099c<? extends T>> iterable) {
        this.f6394a = iterable;
    }

    /* JADX INFO: renamed from: a */
    public static <T> C1099c.a<T> m6839a(Iterable<? extends C1099c<? extends T>> iterable) {
        return new pf50(iterable);
    }

    /* JADX INFO: renamed from: b */
    public static <T> C1099c.a<T> m6840b(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1099c);
        arrayList.add(c1099c2);
        return m6839a(arrayList);
    }

    /* JADX INFO: renamed from: c */
    public static <T> C1099c.a<T> m6841c(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1099c);
        arrayList.add(c1099c2);
        arrayList.add(c1099c3);
        return m6839a(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public static <T> C1099c.a<T> m6842d(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1099c);
        arrayList.add(c1099c2);
        arrayList.add(c1099c3);
        arrayList.add(c1099c4);
        return m6839a(arrayList);
    }

    /* JADX INFO: renamed from: e */
    public static <T> C1099c.a<T> m6843e(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1099c);
        arrayList.add(c1099c2);
        arrayList.add(c1099c3);
        arrayList.add(c1099c4);
        arrayList.add(c1099c5);
        return m6839a(arrayList);
    }

    /* JADX INFO: renamed from: f */
    public static <T> C1099c.a<T> m6844f(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5, C1099c<? extends T> c1099c6) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1099c);
        arrayList.add(c1099c2);
        arrayList.add(c1099c3);
        arrayList.add(c1099c4);
        arrayList.add(c1099c5);
        arrayList.add(c1099c6);
        return m6839a(arrayList);
    }

    /* JADX INFO: renamed from: g */
    public static <T> C1099c.a<T> m6845g(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5, C1099c<? extends T> c1099c6, C1099c<? extends T> c1099c7) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1099c);
        arrayList.add(c1099c2);
        arrayList.add(c1099c3);
        arrayList.add(c1099c4);
        arrayList.add(c1099c5);
        arrayList.add(c1099c6);
        arrayList.add(c1099c7);
        return m6839a(arrayList);
    }

    /* JADX INFO: renamed from: h */
    public static <T> C1099c.a<T> m6846h(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5, C1099c<? extends T> c1099c6, C1099c<? extends T> c1099c7, C1099c<? extends T> c1099c8) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1099c);
        arrayList.add(c1099c2);
        arrayList.add(c1099c3);
        arrayList.add(c1099c4);
        arrayList.add(c1099c5);
        arrayList.add(c1099c6);
        arrayList.add(c1099c7);
        arrayList.add(c1099c8);
        return m6839a(arrayList);
    }

    /* JADX INFO: renamed from: i */
    public static <T> C1099c.a<T> m6847i(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5, C1099c<? extends T> c1099c6, C1099c<? extends T> c1099c7, C1099c<? extends T> c1099c8, C1099c<? extends T> c1099c9) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1099c);
        arrayList.add(c1099c2);
        arrayList.add(c1099c3);
        arrayList.add(c1099c4);
        arrayList.add(c1099c5);
        arrayList.add(c1099c6);
        arrayList.add(c1099c7);
        arrayList.add(c1099c8);
        arrayList.add(c1099c9);
        return m6839a(arrayList);
    }

    /* JADX INFO: renamed from: k */
    public static <T> void m6848k(Collection<C0474c<T>> collection) {
        if (collection.isEmpty()) {
            return;
        }
        Iterator<C0474c<T>> it = collection.iterator();
        while (it.hasNext()) {
            it.next().unsubscribe();
        }
        collection.clear();
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        C0475d c0475d = new C0475d();
        AtomicReference<C0474c<T>> atomicReference = c0475d.f6404a;
        z3g0Var.m9240b(h4g0.m4914a(new C0472a(atomicReference, c0475d)));
        for (C1099c<? extends T> c1099c : this.f6394a) {
            if (z3g0Var.isUnsubscribed()) {
                break;
            }
            C0474c<T> c0474c = new C0474c<>(0L, z3g0Var, c0475d);
            c0475d.f6405b.add(c0474c);
            C0474c<T> c0474c2 = atomicReference.get();
            if (c0474c2 != null) {
                c0475d.m6854b(c0474c2);
                return;
            }
            c1099c.unsafeSubscribe(c0474c);
        }
        if (z3g0Var.isUnsubscribed()) {
            m6848k(c0475d.f6405b);
        }
        z3g0Var.mo3257f(new C0473b(atomicReference, c0475d));
    }
}
