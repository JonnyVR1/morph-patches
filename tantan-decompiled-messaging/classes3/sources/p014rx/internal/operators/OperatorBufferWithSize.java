package p014rx.internal.operators;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import l.ig3;
import p003l.kc2;
import p003l.rc90;
import p003l.y3g0;
import p003l.z3g0;
import p014rx.C1099c;
import p014rx.exceptions.MissingBackpressureException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class OperatorBufferWithSize<T> implements C1099c.c<List<T>, T> {

    /* JADX INFO: renamed from: a */
    public final int f10797a;

    /* JADX INFO: renamed from: b */
    public final int f10798b;

    public static final class BufferOverlap<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super List<T>> f10799e;

        /* JADX INFO: renamed from: f */
        public final int f10800f;

        /* JADX INFO: renamed from: g */
        public final int f10801g;

        /* JADX INFO: renamed from: h */
        public long f10802h;

        /* JADX INFO: renamed from: i */
        public final ArrayDeque<List<T>> f10803i = new ArrayDeque<>();

        /* JADX INFO: renamed from: j */
        public final AtomicLong f10804j = new AtomicLong();

        /* JADX INFO: renamed from: k */
        public long f10805k;

        public final class BufferOverlapProducer extends AtomicBoolean implements rc90 {
            private static final long serialVersionUID = -4015894850868853147L;

            public BufferOverlapProducer() {
            }

            @Override // p003l.rc90
            public void request(long j) {
                BufferOverlap bufferOverlap = BufferOverlap.this;
                if (!kc2.m5645g(bufferOverlap.f10804j, j, bufferOverlap.f10803i, bufferOverlap.f10799e) || j == 0) {
                    return;
                }
                if (get() || !compareAndSet(false, true)) {
                    bufferOverlap.m9242e(kc2.m5641c(bufferOverlap.f10801g, j));
                } else {
                    bufferOverlap.m9242e(kc2.m5639a(kc2.m5641c(bufferOverlap.f10801g, j - 1), bufferOverlap.f10800f));
                }
            }
        }

        public BufferOverlap(z3g0<? super List<T>> z3g0Var, int i, int i2) {
            this.f10799e = z3g0Var;
            this.f10800f = i;
            this.f10801g = i2;
            m9242e(0L);
        }

        /* JADX INFO: renamed from: i */
        public rc90 m9816i() {
            return new BufferOverlapProducer();
        }

        @Override // p003l.m250
        public void onCompleted() {
            long j = this.f10805k;
            if (j != 0) {
                if (j > this.f10804j.get()) {
                    this.f10799e.onError(new MissingBackpressureException("More produced than requested? " + j));
                    return;
                }
                this.f10804j.addAndGet(-j);
            }
            kc2.m5642d(this.f10804j, this.f10803i, this.f10799e);
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f10803i.clear();
            this.f10799e.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            long j = this.f10802h;
            if (j == 0) {
                this.f10803i.offer(new ArrayList(this.f10800f));
            }
            long j2 = j + 1;
            if (j2 == this.f10801g) {
                this.f10802h = 0L;
            } else {
                this.f10802h = j2;
            }
            Iterator<List<T>> it = this.f10803i.iterator();
            while (it.hasNext()) {
                it.next().add(t);
            }
            List<T> listPeek = this.f10803i.peek();
            if (listPeek == null || listPeek.size() != this.f10800f) {
                return;
            }
            this.f10803i.poll();
            this.f10805k++;
            this.f10799e.onNext(listPeek);
        }
    }

    public static final class BufferSkip<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super List<T>> f10806e;

        /* JADX INFO: renamed from: f */
        public final int f10807f;

        /* JADX INFO: renamed from: g */
        public final int f10808g;

        /* JADX INFO: renamed from: h */
        public long f10809h;

        /* JADX INFO: renamed from: i */
        public List<T> f10810i;

        public final class BufferSkipProducer extends AtomicBoolean implements rc90 {
            private static final long serialVersionUID = 3428177408082367154L;

            public BufferSkipProducer() {
            }

            @Override // p003l.rc90
            public void request(long j) {
                if (j < 0) {
                    y3g0.m8887a("n >= 0 required but it was ", j);
                    return;
                }
                if (j != 0) {
                    BufferSkip bufferSkip = BufferSkip.this;
                    if (get() || !compareAndSet(false, true)) {
                        bufferSkip.m9242e(kc2.m5641c(j, bufferSkip.f10808g));
                    } else {
                        bufferSkip.m9242e(kc2.m5639a(kc2.m5641c(j, bufferSkip.f10807f), kc2.m5641c(bufferSkip.f10808g - bufferSkip.f10807f, j - 1)));
                    }
                }
            }
        }

        public BufferSkip(z3g0<? super List<T>> z3g0Var, int i, int i2) {
            this.f10806e = z3g0Var;
            this.f10807f = i;
            this.f10808g = i2;
            m9242e(0L);
        }

        /* JADX INFO: renamed from: i */
        public rc90 m9819i() {
            return new BufferSkipProducer();
        }

        @Override // p003l.m250
        public void onCompleted() {
            List<T> list = this.f10810i;
            if (list != null) {
                this.f10810i = null;
                this.f10806e.onNext(list);
            }
            this.f10806e.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f10810i = null;
            this.f10806e.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            long j = this.f10809h;
            List arrayList = this.f10810i;
            if (j == 0) {
                arrayList = new ArrayList(this.f10807f);
                this.f10810i = arrayList;
            }
            long j2 = j + 1;
            if (j2 == this.f10808g) {
                this.f10809h = 0L;
            } else {
                this.f10809h = j2;
            }
            if (arrayList != null) {
                arrayList.add(t);
                if (arrayList.size() == this.f10807f) {
                    this.f10810i = null;
                    this.f10806e.onNext(arrayList);
                }
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorBufferWithSize$a */
    public static final class C1115a<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super List<T>> f10811e;

        /* JADX INFO: renamed from: f */
        public final int f10812f;

        /* JADX INFO: renamed from: g */
        public List<T> f10813g;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorBufferWithSize$a$a */
        public class a implements rc90 {
            public a() {
            }

            @Override // p003l.rc90
            public void request(long j) {
                if (j < 0) {
                    y3g0.m8887a("n >= required but it was ", j);
                } else if (j != 0) {
                    C1115a.this.m9242e(kc2.m5641c(j, C1115a.this.f10812f));
                }
            }
        }

        public C1115a(z3g0<? super List<T>> z3g0Var, int i) {
            this.f10811e = z3g0Var;
            this.f10812f = i;
            m9242e(0L);
        }

        /* JADX INFO: renamed from: h */
        public rc90 m9821h() {
            return new a();
        }

        @Override // p003l.m250
        public void onCompleted() {
            List<T> list = this.f10813g;
            if (list != null) {
                this.f10811e.onNext(list);
            }
            this.f10811e.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f10813g = null;
            this.f10811e.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            List arrayList = this.f10813g;
            if (arrayList == null) {
                arrayList = new ArrayList(this.f10812f);
                this.f10813g = arrayList;
            }
            arrayList.add(t);
            if (arrayList.size() == this.f10812f) {
                this.f10813g = null;
                this.f10811e.onNext(arrayList);
            }
        }
    }

    public OperatorBufferWithSize(int i, int i2) {
        if (i <= 0) {
            ig3.a("count must be greater than 0");
            throw null;
        }
        if (i2 <= 0) {
            ig3.a("skip must be greater than 0");
            throw null;
        }
        this.f10797a = i;
        this.f10798b = i2;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super List<T>> z3g0Var) {
        int i = this.f10798b;
        int i2 = this.f10797a;
        if (i == i2) {
            C1115a c1115a = new C1115a(z3g0Var, i2);
            z3g0Var.m9240b(c1115a);
            z3g0Var.mo3257f(c1115a.m9821h());
            return c1115a;
        }
        if (i > i2) {
            BufferSkip bufferSkip = new BufferSkip(z3g0Var, i2, i);
            z3g0Var.m9240b(bufferSkip);
            z3g0Var.mo3257f(bufferSkip.m9819i());
            return bufferSkip;
        }
        BufferOverlap bufferOverlap = new BufferOverlap(z3g0Var, i2, i);
        z3g0Var.m9240b(bufferOverlap);
        z3g0Var.mo3257f(bufferOverlap.m9816i());
        return bufferOverlap;
    }
}
