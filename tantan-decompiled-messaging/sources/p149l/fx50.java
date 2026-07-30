package p149l;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class fx50<T, R> implements C22306c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C22306c<T> f99724a;

    /* JADX INFO: renamed from: b */
    public final C22306c<?>[] f99725b;

    /* JADX INFO: renamed from: c */
    public final Iterable<C22306c<?>> f99726c;

    /* JADX INFO: renamed from: d */
    public final faj<R> f99727d;

    /* JADX INFO: renamed from: l.fx50$a */
    public static final class C16955a<T, R> extends z3g0<T> {

        /* JADX INFO: renamed from: j */
        public static final Object f99728j = new Object();

        /* JADX INFO: renamed from: e */
        public final z3g0<? super R> f99729e;

        /* JADX INFO: renamed from: f */
        public final faj<R> f99730f;

        /* JADX INFO: renamed from: g */
        public final AtomicReferenceArray<Object> f99731g;

        /* JADX INFO: renamed from: h */
        public final AtomicInteger f99732h;

        /* JADX INFO: renamed from: i */
        public boolean f99733i;

        public C16955a(z3g0<? super R> z3g0Var, faj<R> fajVar, int i) {
            this.f99729e = z3g0Var;
            this.f99730f = fajVar;
            AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(i + 1);
            for (int i2 = 0; i2 <= i; i2++) {
                atomicReferenceArray.lazySet(i2, f99728j);
            }
            this.f99731g = atomicReferenceArray;
            this.f99732h = new AtomicInteger(i);
            m217048e(0L);
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo106696f(rc90 rc90Var) {
            super.mo106696f(rc90Var);
            this.f99729e.mo106696f(rc90Var);
        }

        /* JADX INFO: renamed from: g */
        public void m123620g(int i) {
            if (this.f99731g.get(i) == f99728j) {
                onCompleted();
            }
        }

        /* JADX INFO: renamed from: h */
        public void m123621h(int i, Throwable th) {
            onError(th);
        }

        /* JADX INFO: renamed from: i */
        public void m123622i(int i, Object obj) {
            if (this.f99731g.getAndSet(i, obj) == f99728j) {
                this.f99732h.decrementAndGet();
            }
        }

        @Override // p149l.m250
        public void onCompleted() {
            if (this.f99733i) {
                return;
            }
            this.f99733i = true;
            unsubscribe();
            this.f99729e.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            if (this.f99733i) {
                ejd0.m116793j(th);
                return;
            }
            this.f99733i = true;
            unsubscribe();
            this.f99729e.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            if (this.f99733i) {
                return;
            }
            if (this.f99732h.get() != 0) {
                m217048e(1L);
                return;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.f99731g;
            int length = atomicReferenceArray.length();
            atomicReferenceArray.lazySet(0, t);
            Object[] objArr = new Object[atomicReferenceArray.length()];
            for (int i = 0; i < length; i++) {
                objArr[i] = atomicReferenceArray.get(i);
            }
            try {
                this.f99729e.onNext(this.f99730f.call(objArr));
            } catch (Throwable th) {
                f5f.m119491e(th);
                onError(th);
            }
        }
    }

    /* JADX INFO: renamed from: l.fx50$b */
    public static final class C16956b extends z3g0<Object> {

        /* JADX INFO: renamed from: e */
        public final C16955a<?, ?> f99734e;

        /* JADX INFO: renamed from: f */
        public final int f99735f;

        public C16956b(C16955a<?, ?> c16955a, int i) {
            this.f99734e = c16955a;
            this.f99735f = i;
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f99734e.m123620g(this.f99735f);
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f99734e.m123621h(this.f99735f, th);
        }

        @Override // p149l.m250
        public void onNext(Object obj) {
            this.f99734e.m123622i(this.f99735f, obj);
        }
    }

    public fx50(C22306c<T> c22306c, C22306c<?>[] c22306cArr, Iterable<C22306c<?>> iterable, faj<R> fajVar) {
        this.f99724a = c22306c;
        this.f99725b = c22306cArr;
        this.f99726c = iterable;
        this.f99727d = fajVar;
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super R> z3g0Var) {
        int length;
        vie0 vie0Var = new vie0(z3g0Var);
        C22306c<?>[] c22306cArr = this.f99725b;
        int i = 0;
        if (c22306cArr != null) {
            length = c22306cArr.length;
        } else {
            c22306cArr = new C22306c[8];
            int i2 = 0;
            for (C22306c<?> c22306c : this.f99726c) {
                if (i2 == c22306cArr.length) {
                    c22306cArr = (C22306c[]) Arrays.copyOf(c22306cArr, (i2 >> 2) + i2);
                }
                c22306cArr[i2] = c22306c;
                i2++;
            }
            length = i2;
        }
        C16955a c16955a = new C16955a(z3g0Var, this.f99727d, length);
        vie0Var.m217046b(c16955a);
        while (i < length) {
            if (vie0Var.isUnsubscribed()) {
                return;
            }
            int i3 = i + 1;
            C16956b c16956b = new C16956b(c16955a, i3);
            c16955a.m217046b(c16956b);
            c22306cArr[i].unsafeSubscribe(c16956b);
            i = i3;
        }
        this.f99724a.unsafeSubscribe(c16955a);
    }
}
