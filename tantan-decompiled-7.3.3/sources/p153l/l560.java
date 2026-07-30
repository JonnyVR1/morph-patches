package p153l;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class l560<T, R> implements C22421c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C22421c<T> f130070a;

    /* JADX INFO: renamed from: b */
    public final C22421c<?>[] f130071b;

    /* JADX INFO: renamed from: c */
    public final Iterable<C22421c<?>> f130072c;

    /* JADX INFO: renamed from: d */
    public final zcj<R> f130073d;

    /* JADX INFO: renamed from: l.l560$a */
    public static final class C18351a<T, R> extends gcg0<T> {

        /* JADX INFO: renamed from: j */
        public static final Object f130074j = new Object();

        /* JADX INFO: renamed from: e */
        public final gcg0<? super R> f130075e;

        /* JADX INFO: renamed from: f */
        public final zcj<R> f130076f;

        /* JADX INFO: renamed from: g */
        public final AtomicReferenceArray<Object> f130077g;

        /* JADX INFO: renamed from: h */
        public final AtomicInteger f130078h;

        /* JADX INFO: renamed from: i */
        public boolean f130079i;

        public C18351a(gcg0<? super R> gcg0Var, zcj<R> zcjVar, int i) {
            this.f130075e = gcg0Var;
            this.f130076f = zcjVar;
            AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(i + 1);
            for (int i2 = 0; i2 <= i; i2++) {
                atomicReferenceArray.lazySet(i2, f130074j);
            }
            this.f130077g = atomicReferenceArray;
            this.f130078h = new AtomicInteger(i);
            m129868e(0L);
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: f */
        public void mo95773f(vk90 vk90Var) {
            super.mo95773f(vk90Var);
            this.f130075e.mo95773f(vk90Var);
        }

        /* JADX INFO: renamed from: g */
        public void m152924g(int i) {
            if (this.f130077g.get(i) == f130074j) {
                onCompleted();
            }
        }

        /* JADX INFO: renamed from: h */
        public void m152925h(int i, Throwable th) {
            onError(th);
        }

        /* JADX INFO: renamed from: i */
        public void m152926i(int i, Object obj) {
            if (this.f130077g.getAndSet(i, obj) == f130074j) {
                this.f130078h.decrementAndGet();
            }
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (this.f130079i) {
                return;
            }
            this.f130079i = true;
            unsubscribe();
            this.f130075e.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            if (this.f130079i) {
                hrd0.m136792j(th);
                return;
            }
            this.f130079i = true;
            unsubscribe();
            this.f130075e.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            if (this.f130079i) {
                return;
            }
            if (this.f130078h.get() != 0) {
                m129868e(1L);
                return;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.f130077g;
            int length = atomicReferenceArray.length();
            atomicReferenceArray.lazySet(0, t);
            Object[] objArr = new Object[atomicReferenceArray.length()];
            for (int i = 0; i < length; i++) {
                objArr[i] = atomicReferenceArray.get(i);
            }
            try {
                this.f130075e.onNext(this.f130076f.call(objArr));
            } catch (Throwable th) {
                j6f.m143663e(th);
                onError(th);
            }
        }
    }

    /* JADX INFO: renamed from: l.l560$b */
    public static final class C18352b extends gcg0<Object> {

        /* JADX INFO: renamed from: e */
        public final C18351a<?, ?> f130080e;

        /* JADX INFO: renamed from: f */
        public final int f130081f;

        public C18352b(C18351a<?, ?> c18351a, int i) {
            this.f130080e = c18351a;
            this.f130081f = i;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f130080e.m152924g(this.f130081f);
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f130080e.m152925h(this.f130081f, th);
        }

        @Override // p153l.bb50
        public void onNext(Object obj) {
            this.f130080e.m152926i(this.f130081f, obj);
        }
    }

    public l560(C22421c<T> c22421c, C22421c<?>[] c22421cArr, Iterable<C22421c<?>> iterable, zcj<R> zcjVar) {
        this.f130070a = c22421c;
        this.f130071b = c22421cArr;
        this.f130072c = iterable;
        this.f130073d = zcjVar;
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super R> gcg0Var) {
        int length;
        are0 are0Var = new are0(gcg0Var);
        C22421c<?>[] c22421cArr = this.f130071b;
        int i = 0;
        if (c22421cArr != null) {
            length = c22421cArr.length;
        } else {
            c22421cArr = new C22421c[8];
            int i2 = 0;
            for (C22421c<?> c22421c : this.f130072c) {
                if (i2 == c22421cArr.length) {
                    c22421cArr = (C22421c[]) Arrays.copyOf(c22421cArr, (i2 >> 2) + i2);
                }
                c22421cArr[i2] = c22421c;
                i2++;
            }
            length = i2;
        }
        C18351a c18351a = new C18351a(gcg0Var, this.f130073d, length);
        are0Var.m129866b(c18351a);
        while (i < length) {
            if (are0Var.isUnsubscribed()) {
                return;
            }
            int i3 = i + 1;
            C18352b c18352b = new C18352b(c18351a, i3);
            c18351a.m129866b(c18352b);
            c22421cArr[i].unsafeSubscribe(c18352b);
            i = i3;
        }
        this.f130070a.unsafeSubscribe(c18351a);
    }
}
