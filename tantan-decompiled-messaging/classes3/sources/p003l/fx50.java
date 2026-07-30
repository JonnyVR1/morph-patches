package p003l;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class fx50<T, R> implements C1099c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C1099c<T> f3749a;

    /* JADX INFO: renamed from: b */
    public final C1099c<?>[] f3750b;

    /* JADX INFO: renamed from: c */
    public final Iterable<C1099c<?>> f3751c;

    /* JADX INFO: renamed from: d */
    public final faj<R> f3752d;

    /* JADX INFO: renamed from: l.fx50$a */
    public static final class C0297a<T, R> extends z3g0<T> {

        /* JADX INFO: renamed from: j */
        public static final Object f3753j = new Object();

        /* JADX INFO: renamed from: e */
        public final z3g0<? super R> f3754e;

        /* JADX INFO: renamed from: f */
        public final faj<R> f3755f;

        /* JADX INFO: renamed from: g */
        public final AtomicReferenceArray<Object> f3756g;

        /* JADX INFO: renamed from: h */
        public final AtomicInteger f3757h;

        /* JADX INFO: renamed from: i */
        public boolean f3758i;

        public C0297a(z3g0<? super R> z3g0Var, faj<R> fajVar, int i) {
            this.f3754e = z3g0Var;
            this.f3755f = fajVar;
            AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(i + 1);
            for (int i2 = 0; i2 <= i; i2++) {
                atomicReferenceArray.lazySet(i2, f3753j);
            }
            this.f3756g = atomicReferenceArray;
            this.f3757h = new AtomicInteger(i);
            m9242e(0L);
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo3257f(rc90 rc90Var) {
            super.mo3257f(rc90Var);
            this.f3754e.mo3257f(rc90Var);
        }

        /* JADX INFO: renamed from: g */
        public void m4475g(int i) {
            if (this.f3756g.get(i) == f3753j) {
                onCompleted();
            }
        }

        /* JADX INFO: renamed from: h */
        public void m4476h(int i, Throwable th) {
            onError(th);
        }

        /* JADX INFO: renamed from: i */
        public void m4477i(int i, Object obj) {
            if (this.f3756g.getAndSet(i, obj) == f3753j) {
                this.f3757h.decrementAndGet();
            }
        }

        @Override // p003l.m250
        public void onCompleted() {
            if (this.f3758i) {
                return;
            }
            this.f3758i = true;
            unsubscribe();
            this.f3754e.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            if (this.f3758i) {
                ejd0.m3864j(th);
                return;
            }
            this.f3758i = true;
            unsubscribe();
            this.f3754e.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            if (this.f3758i) {
                return;
            }
            if (this.f3757h.get() != 0) {
                m9242e(1L);
                return;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.f3756g;
            int length = atomicReferenceArray.length();
            atomicReferenceArray.lazySet(0, t);
            Object[] objArr = new Object[atomicReferenceArray.length()];
            for (int i = 0; i < length; i++) {
                objArr[i] = atomicReferenceArray.get(i);
            }
            try {
                this.f3754e.onNext(this.f3755f.call(objArr));
            } catch (Throwable th) {
                f5f.m3964e(th);
                onError(th);
            }
        }
    }

    /* JADX INFO: renamed from: l.fx50$b */
    public static final class C0298b extends z3g0<Object> {

        /* JADX INFO: renamed from: e */
        public final C0297a<?, ?> f3759e;

        /* JADX INFO: renamed from: f */
        public final int f3760f;

        public C0298b(C0297a<?, ?> c0297a, int i) {
            this.f3759e = c0297a;
            this.f3760f = i;
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f3759e.m4475g(this.f3760f);
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f3759e.m4476h(this.f3760f, th);
        }

        @Override // p003l.m250
        public void onNext(Object obj) {
            this.f3759e.m4477i(this.f3760f, obj);
        }
    }

    public fx50(C1099c<T> c1099c, C1099c<?>[] c1099cArr, Iterable<C1099c<?>> iterable, faj<R> fajVar) {
        this.f3749a = c1099c;
        this.f3750b = c1099cArr;
        this.f3751c = iterable;
        this.f3752d = fajVar;
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super R> z3g0Var) {
        int length;
        vie0 vie0Var = new vie0(z3g0Var);
        C1099c<?>[] c1099cArr = this.f3750b;
        int i = 0;
        if (c1099cArr != null) {
            length = c1099cArr.length;
        } else {
            c1099cArr = new C1099c[8];
            int i2 = 0;
            for (C1099c<?> c1099c : this.f3751c) {
                if (i2 == c1099cArr.length) {
                    c1099cArr = (C1099c[]) Arrays.copyOf(c1099cArr, (i2 >> 2) + i2);
                }
                c1099cArr[i2] = c1099c;
                i2++;
            }
            length = i2;
        }
        C0297a c0297a = new C0297a(z3g0Var, this.f3752d, length);
        vie0Var.m9240b(c0297a);
        while (i < length) {
            if (vie0Var.isUnsubscribed()) {
                return;
            }
            int i3 = i + 1;
            C0298b c0298b = new C0298b(c0297a, i3);
            c0297a.m9240b(c0298b);
            c1099cArr[i].unsafeSubscribe(c0298b);
            i = i3;
        }
        this.f3749a.unsafeSubscribe(c0297a);
    }
}
