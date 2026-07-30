package p133rx.internal.operators;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p133rx.C22306c;
import p133rx.exceptions.MissingBackpressureException;
import p149l.ig3;
import p149l.kc2;
import p149l.rc90;
import p149l.y3g0;
import p149l.z3g0;

/* JADX INFO: loaded from: classes3.dex */
public final class OperatorBufferWithSize<T> implements C22306c.c<List<T>, T> {

    /* JADX INFO: renamed from: a */
    public final int f207172a;

    /* JADX INFO: renamed from: b */
    public final int f207173b;

    public static final class BufferOverlap<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super List<T>> f207174e;

        /* JADX INFO: renamed from: f */
        public final int f207175f;

        /* JADX INFO: renamed from: g */
        public final int f207176g;

        /* JADX INFO: renamed from: h */
        public long f207177h;

        /* JADX INFO: renamed from: i */
        public final ArrayDeque<List<T>> f207178i = new ArrayDeque<>();

        /* JADX INFO: renamed from: j */
        public final AtomicLong f207179j = new AtomicLong();

        /* JADX INFO: renamed from: k */
        public long f207180k;

        public final class BufferOverlapProducer extends AtomicBoolean implements rc90 {
            private static final long serialVersionUID = -4015894850868853147L;

            public BufferOverlapProducer() {
            }

            @Override // p149l.rc90
            public void request(long j) {
                BufferOverlap bufferOverlap = BufferOverlap.this;
                if (!kc2.m145341g(bufferOverlap.f207179j, j, bufferOverlap.f207178i, bufferOverlap.f207174e) || j == 0) {
                    return;
                }
                if (get() || !compareAndSet(false, true)) {
                    bufferOverlap.m217048e(kc2.m145337c(bufferOverlap.f207176g, j));
                } else {
                    bufferOverlap.m217048e(kc2.m145335a(kc2.m145337c(bufferOverlap.f207176g, j - 1), bufferOverlap.f207175f));
                }
            }
        }

        public BufferOverlap(z3g0<? super List<T>> z3g0Var, int i, int i2) {
            this.f207174e = z3g0Var;
            this.f207175f = i;
            this.f207176g = i2;
            m217048e(0L);
        }

        /* JADX INFO: renamed from: i */
        public rc90 m221359i() {
            return new BufferOverlapProducer();
        }

        @Override // p149l.m250
        public void onCompleted() {
            long j = this.f207180k;
            if (j != 0) {
                if (j > this.f207179j.get()) {
                    this.f207174e.onError(new MissingBackpressureException("More produced than requested? " + j));
                    return;
                }
                this.f207179j.addAndGet(-j);
            }
            kc2.m145338d(this.f207179j, this.f207178i, this.f207174e);
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f207178i.clear();
            this.f207174e.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            long j = this.f207177h;
            if (j == 0) {
                this.f207178i.offer(new ArrayList(this.f207175f));
            }
            long j2 = j + 1;
            if (j2 == this.f207176g) {
                this.f207177h = 0L;
            } else {
                this.f207177h = j2;
            }
            Iterator<List<T>> it = this.f207178i.iterator();
            while (it.hasNext()) {
                it.next().add(t);
            }
            List<T> listPeek = this.f207178i.peek();
            if (listPeek == null || listPeek.size() != this.f207175f) {
                return;
            }
            this.f207178i.poll();
            this.f207180k++;
            this.f207174e.onNext(listPeek);
        }
    }

    public static final class BufferSkip<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super List<T>> f207181e;

        /* JADX INFO: renamed from: f */
        public final int f207182f;

        /* JADX INFO: renamed from: g */
        public final int f207183g;

        /* JADX INFO: renamed from: h */
        public long f207184h;

        /* JADX INFO: renamed from: i */
        public List<T> f207185i;

        public final class BufferSkipProducer extends AtomicBoolean implements rc90 {
            private static final long serialVersionUID = 3428177408082367154L;

            public BufferSkipProducer() {
            }

            @Override // p149l.rc90
            public void request(long j) {
                if (j < 0) {
                    y3g0.m212802a("n >= 0 required but it was ", j);
                    return;
                }
                if (j != 0) {
                    BufferSkip bufferSkip = BufferSkip.this;
                    if (get() || !compareAndSet(false, true)) {
                        bufferSkip.m217048e(kc2.m145337c(j, bufferSkip.f207183g));
                    } else {
                        bufferSkip.m217048e(kc2.m145335a(kc2.m145337c(j, bufferSkip.f207182f), kc2.m145337c(bufferSkip.f207183g - bufferSkip.f207182f, j - 1)));
                    }
                }
            }
        }

        public BufferSkip(z3g0<? super List<T>> z3g0Var, int i, int i2) {
            this.f207181e = z3g0Var;
            this.f207182f = i;
            this.f207183g = i2;
            m217048e(0L);
        }

        /* JADX INFO: renamed from: i */
        public rc90 m221362i() {
            return new BufferSkipProducer();
        }

        @Override // p149l.m250
        public void onCompleted() {
            List<T> list = this.f207185i;
            if (list != null) {
                this.f207185i = null;
                this.f207181e.onNext(list);
            }
            this.f207181e.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f207185i = null;
            this.f207181e.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            long j = this.f207184h;
            List arrayList = this.f207185i;
            if (j == 0) {
                arrayList = new ArrayList(this.f207182f);
                this.f207185i = arrayList;
            }
            long j2 = j + 1;
            if (j2 == this.f207183g) {
                this.f207184h = 0L;
            } else {
                this.f207184h = j2;
            }
            if (arrayList != null) {
                arrayList.add(t);
                if (arrayList.size() == this.f207182f) {
                    this.f207185i = null;
                    this.f207181e.onNext(arrayList);
                }
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorBufferWithSize$a */
    public static final class C22322a<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super List<T>> f207186e;

        /* JADX INFO: renamed from: f */
        public final int f207187f;

        /* JADX INFO: renamed from: g */
        public List<T> f207188g;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorBufferWithSize$a$a */
        public class a implements rc90 {
            public a() {
            }

            @Override // p149l.rc90
            public void request(long j) {
                if (j < 0) {
                    y3g0.m212802a("n >= required but it was ", j);
                } else if (j != 0) {
                    C22322a.this.m217048e(kc2.m145337c(j, C22322a.this.f207187f));
                }
            }
        }

        public C22322a(z3g0<? super List<T>> z3g0Var, int i) {
            this.f207186e = z3g0Var;
            this.f207187f = i;
            m217048e(0L);
        }

        /* JADX INFO: renamed from: h */
        public rc90 m221364h() {
            return new a();
        }

        @Override // p149l.m250
        public void onCompleted() {
            List<T> list = this.f207188g;
            if (list != null) {
                this.f207186e.onNext(list);
            }
            this.f207186e.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f207188g = null;
            this.f207186e.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            List arrayList = this.f207188g;
            if (arrayList == null) {
                arrayList = new ArrayList(this.f207187f);
                this.f207188g = arrayList;
            }
            arrayList.add(t);
            if (arrayList.size() == this.f207187f) {
                this.f207188g = null;
                this.f207186e.onNext(arrayList);
            }
        }
    }

    public OperatorBufferWithSize(int i, int i2) {
        if (i <= 0) {
            ig3.m135964a("count must be greater than 0");
            throw null;
        }
        if (i2 <= 0) {
            ig3.m135964a("skip must be greater than 0");
            throw null;
        }
        this.f207172a = i;
        this.f207173b = i2;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super List<T>> z3g0Var) {
        int i = this.f207173b;
        int i2 = this.f207172a;
        if (i == i2) {
            C22322a c22322a = new C22322a(z3g0Var, i2);
            z3g0Var.m217046b(c22322a);
            z3g0Var.mo106696f(c22322a.m221364h());
            return c22322a;
        }
        if (i > i2) {
            BufferSkip bufferSkip = new BufferSkip(z3g0Var, i2, i);
            z3g0Var.m217046b(bufferSkip);
            z3g0Var.mo106696f(bufferSkip.m221362i());
            return bufferSkip;
        }
        BufferOverlap bufferOverlap = new BufferOverlap(z3g0Var, i2, i);
        z3g0Var.m217046b(bufferOverlap);
        z3g0Var.mo106696f(bufferOverlap.m221359i());
        return bufferOverlap;
    }
}
