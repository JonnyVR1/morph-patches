package p153l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class vn50<T> implements C22421c.a<T> {

    /* JADX INFO: renamed from: a */
    public final Iterable<? extends C22421c<? extends T>> f184825a;

    /* JADX INFO: renamed from: l.vn50$a */
    public class C20861a implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicReference f184826a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C20864d f184827b;

        public C20861a(AtomicReference atomicReference, C20864d c20864d) {
            this.f184826a = atomicReference;
            this.f184827b = c20864d;
        }

        @Override // p153l.x20
        public void call() {
            C20863c c20863c = (C20863c) this.f184826a.get();
            if (c20863c != null) {
                c20863c.unsubscribe();
            }
            vn50.m201934k(this.f184827b.f184836b);
        }
    }

    /* JADX INFO: renamed from: l.vn50$b */
    public class C20862b implements vk90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicReference f184829a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C20864d f184830b;

        public C20862b(AtomicReference atomicReference, C20864d c20864d) {
            this.f184829a = atomicReference;
            this.f184830b = c20864d;
        }

        @Override // p153l.vk90
        public void request(long j) {
            C20863c c20863c = (C20863c) this.f184829a.get();
            if (c20863c != null) {
                c20863c.m201938i(j);
                return;
            }
            for (C20863c<T> c20863c2 : this.f184830b.f184836b) {
                if (!c20863c2.isUnsubscribed()) {
                    if (this.f184829a.get() == c20863c2) {
                        c20863c2.m201938i(j);
                        return;
                    }
                    c20863c2.m201938i(j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.vn50$c */
    public static final class C20863c<T> extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super T> f184832e;

        /* JADX INFO: renamed from: f */
        public final C20864d<T> f184833f;

        /* JADX INFO: renamed from: g */
        public boolean f184834g;

        public C20863c(long j, gcg0<? super T> gcg0Var, C20864d<T> c20864d) {
            this.f184832e = gcg0Var;
            this.f184833f = c20864d;
            m129868e(j);
        }

        /* JADX INFO: renamed from: h */
        private boolean m201937h() {
            if (this.f184834g) {
                return true;
            }
            if (this.f184833f.f184835a.get() == this) {
                this.f184834g = true;
                return true;
            }
            boolean zM156916a = m31.m156916a(this.f184833f.f184835a, null, this);
            C20864d<T> c20864d = this.f184833f;
            if (!zM156916a) {
                c20864d.m201939a();
                return false;
            }
            c20864d.m201940b(this);
            this.f184834g = true;
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public void m201938i(long j) {
            m129868e(j);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (m201937h()) {
                this.f184832e.onCompleted();
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            if (m201937h()) {
                this.f184832e.onError(th);
            }
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            if (m201937h()) {
                this.f184832e.onNext(t);
            }
        }
    }

    /* JADX INFO: renamed from: l.vn50$d */
    public static final class C20864d<T> {

        /* JADX INFO: renamed from: a */
        public final AtomicReference<C20863c<T>> f184835a = new AtomicReference<>();

        /* JADX INFO: renamed from: b */
        public final Collection<C20863c<T>> f184836b = new ConcurrentLinkedQueue();

        /* JADX INFO: renamed from: a */
        public void m201939a() {
            C20863c<T> c20863c = this.f184835a.get();
            if (c20863c != null) {
                m201940b(c20863c);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m201940b(C20863c<T> c20863c) {
            for (C20863c<T> c20863c2 : this.f184836b) {
                if (c20863c2 != c20863c) {
                    c20863c2.unsubscribe();
                }
            }
            this.f184836b.clear();
        }
    }

    public vn50(Iterable<? extends C22421c<? extends T>> iterable) {
        this.f184825a = iterable;
    }

    /* JADX INFO: renamed from: a */
    public static <T> C22421c.a<T> m201925a(Iterable<? extends C22421c<? extends T>> iterable) {
        return new vn50(iterable);
    }

    /* JADX INFO: renamed from: b */
    public static <T> C22421c.a<T> m201926b(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c22421c);
        arrayList.add(c22421c2);
        return m201925a(arrayList);
    }

    /* JADX INFO: renamed from: c */
    public static <T> C22421c.a<T> m201927c(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c22421c);
        arrayList.add(c22421c2);
        arrayList.add(c22421c3);
        return m201925a(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public static <T> C22421c.a<T> m201928d(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c22421c);
        arrayList.add(c22421c2);
        arrayList.add(c22421c3);
        arrayList.add(c22421c4);
        return m201925a(arrayList);
    }

    /* JADX INFO: renamed from: e */
    public static <T> C22421c.a<T> m201929e(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c22421c);
        arrayList.add(c22421c2);
        arrayList.add(c22421c3);
        arrayList.add(c22421c4);
        arrayList.add(c22421c5);
        return m201925a(arrayList);
    }

    /* JADX INFO: renamed from: f */
    public static <T> C22421c.a<T> m201930f(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5, C22421c<? extends T> c22421c6) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c22421c);
        arrayList.add(c22421c2);
        arrayList.add(c22421c3);
        arrayList.add(c22421c4);
        arrayList.add(c22421c5);
        arrayList.add(c22421c6);
        return m201925a(arrayList);
    }

    /* JADX INFO: renamed from: g */
    public static <T> C22421c.a<T> m201931g(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5, C22421c<? extends T> c22421c6, C22421c<? extends T> c22421c7) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c22421c);
        arrayList.add(c22421c2);
        arrayList.add(c22421c3);
        arrayList.add(c22421c4);
        arrayList.add(c22421c5);
        arrayList.add(c22421c6);
        arrayList.add(c22421c7);
        return m201925a(arrayList);
    }

    /* JADX INFO: renamed from: h */
    public static <T> C22421c.a<T> m201932h(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5, C22421c<? extends T> c22421c6, C22421c<? extends T> c22421c7, C22421c<? extends T> c22421c8) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c22421c);
        arrayList.add(c22421c2);
        arrayList.add(c22421c3);
        arrayList.add(c22421c4);
        arrayList.add(c22421c5);
        arrayList.add(c22421c6);
        arrayList.add(c22421c7);
        arrayList.add(c22421c8);
        return m201925a(arrayList);
    }

    /* JADX INFO: renamed from: i */
    public static <T> C22421c.a<T> m201933i(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5, C22421c<? extends T> c22421c6, C22421c<? extends T> c22421c7, C22421c<? extends T> c22421c8, C22421c<? extends T> c22421c9) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c22421c);
        arrayList.add(c22421c2);
        arrayList.add(c22421c3);
        arrayList.add(c22421c4);
        arrayList.add(c22421c5);
        arrayList.add(c22421c6);
        arrayList.add(c22421c7);
        arrayList.add(c22421c8);
        arrayList.add(c22421c9);
        return m201925a(arrayList);
    }

    /* JADX INFO: renamed from: k */
    public static <T> void m201934k(Collection<C20863c<T>> collection) {
        if (collection.isEmpty()) {
            return;
        }
        Iterator<C20863c<T>> it = collection.iterator();
        while (it.hasNext()) {
            it.next().unsubscribe();
        }
        collection.clear();
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super T> gcg0Var) {
        C20864d c20864d = new C20864d();
        AtomicReference<C20863c<T>> atomicReference = c20864d.f184835a;
        gcg0Var.m129866b(pcg0.m171648a(new C20861a(atomicReference, c20864d)));
        for (C22421c<? extends T> c22421c : this.f184825a) {
            if (gcg0Var.isUnsubscribed()) {
                break;
            }
            C20863c<T> c20863c = new C20863c<>(0L, gcg0Var, c20864d);
            c20864d.f184836b.add(c20863c);
            C20863c<T> c20863c2 = atomicReference.get();
            if (c20863c2 != null) {
                c20864d.m201940b(c20863c2);
                return;
            }
            c22421c.unsafeSubscribe(c20863c);
        }
        if (gcg0Var.isUnsubscribed()) {
            m201934k(c20864d.f184836b);
        }
        gcg0Var.mo95773f(new C20862b(atomicReference, c20864d));
    }
}
