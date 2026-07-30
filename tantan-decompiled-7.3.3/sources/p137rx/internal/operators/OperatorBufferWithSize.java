package p137rx.internal.operators;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p137rx.C22421c;
import p137rx.exceptions.MissingBackpressureException;
import p153l.fcg0;
import p153l.gcg0;
import p153l.rc2;
import p153l.vk90;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public final class OperatorBufferWithSize<T> implements C22421c.c<List<T>, T> {

    /* JADX INFO: renamed from: a */
    public final int f208094a;

    /* JADX INFO: renamed from: b */
    public final int f208095b;

    public static final class BufferOverlap<T> extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super List<T>> f208096e;

        /* JADX INFO: renamed from: f */
        public final int f208097f;

        /* JADX INFO: renamed from: g */
        public final int f208098g;

        /* JADX INFO: renamed from: h */
        public long f208099h;

        /* JADX INFO: renamed from: i */
        public final ArrayDeque<List<T>> f208100i = new ArrayDeque<>();

        /* JADX INFO: renamed from: j */
        public final AtomicLong f208101j = new AtomicLong();

        /* JADX INFO: renamed from: k */
        public long f208102k;

        public final class BufferOverlapProducer extends AtomicBoolean implements vk90 {
            private static final long serialVersionUID = -4015894850868853147L;

            public BufferOverlapProducer() {
            }

            @Override // p153l.vk90
            public void request(long j) {
                BufferOverlap bufferOverlap = BufferOverlap.this;
                if (!rc2.m180775g(bufferOverlap.f208101j, j, bufferOverlap.f208100i, bufferOverlap.f208096e) || j == 0) {
                    return;
                }
                if (get() || !compareAndSet(false, true)) {
                    bufferOverlap.m129868e(rc2.m180771c(bufferOverlap.f208098g, j));
                } else {
                    bufferOverlap.m129868e(rc2.m180769a(rc2.m180771c(bufferOverlap.f208098g, j - 1), bufferOverlap.f208097f));
                }
            }
        }

        public BufferOverlap(gcg0<? super List<T>> gcg0Var, int i, int i2) {
            this.f208096e = gcg0Var;
            this.f208097f = i;
            this.f208098g = i2;
            m129868e(0L);
        }

        /* JADX INFO: renamed from: i */
        public vk90 m222605i() {
            return new BufferOverlapProducer();
        }

        @Override // p153l.bb50
        public void onCompleted() {
            long j = this.f208102k;
            if (j != 0) {
                if (j > this.f208101j.get()) {
                    this.f208096e.onError(new MissingBackpressureException("More produced than requested? " + j));
                    return;
                }
                this.f208101j.addAndGet(-j);
            }
            rc2.m180772d(this.f208101j, this.f208100i, this.f208096e);
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f208100i.clear();
            this.f208096e.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            long j = this.f208099h;
            if (j == 0) {
                this.f208100i.offer(new ArrayList(this.f208097f));
            }
            long j2 = j + 1;
            if (j2 == this.f208098g) {
                this.f208099h = 0L;
            } else {
                this.f208099h = j2;
            }
            Iterator<List<T>> it = this.f208100i.iterator();
            while (it.hasNext()) {
                it.next().add(t);
            }
            List<T> listPeek = this.f208100i.peek();
            if (listPeek == null || listPeek.size() != this.f208097f) {
                return;
            }
            this.f208100i.poll();
            this.f208102k++;
            this.f208096e.onNext(listPeek);
        }
    }

    public static final class BufferSkip<T> extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super List<T>> f208103e;

        /* JADX INFO: renamed from: f */
        public final int f208104f;

        /* JADX INFO: renamed from: g */
        public final int f208105g;

        /* JADX INFO: renamed from: h */
        public long f208106h;

        /* JADX INFO: renamed from: i */
        public List<T> f208107i;

        public final class BufferSkipProducer extends AtomicBoolean implements vk90 {
            private static final long serialVersionUID = 3428177408082367154L;

            public BufferSkipProducer() {
            }

            @Override // p153l.vk90
            public void request(long j) {
                if (j < 0) {
                    fcg0.m125008a("n >= 0 required but it was ", j);
                    return;
                }
                if (j != 0) {
                    BufferSkip bufferSkip = BufferSkip.this;
                    if (get() || !compareAndSet(false, true)) {
                        bufferSkip.m129868e(rc2.m180771c(j, bufferSkip.f208105g));
                    } else {
                        bufferSkip.m129868e(rc2.m180769a(rc2.m180771c(j, bufferSkip.f208104f), rc2.m180771c(bufferSkip.f208105g - bufferSkip.f208104f, j - 1)));
                    }
                }
            }
        }

        public BufferSkip(gcg0<? super List<T>> gcg0Var, int i, int i2) {
            this.f208103e = gcg0Var;
            this.f208104f = i;
            this.f208105g = i2;
            m129868e(0L);
        }

        /* JADX INFO: renamed from: i */
        public vk90 m222608i() {
            return new BufferSkipProducer();
        }

        @Override // p153l.bb50
        public void onCompleted() {
            List<T> list = this.f208107i;
            if (list != null) {
                this.f208107i = null;
                this.f208103e.onNext(list);
            }
            this.f208103e.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f208107i = null;
            this.f208103e.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            long j = this.f208106h;
            List arrayList = this.f208107i;
            if (j == 0) {
                arrayList = new ArrayList(this.f208104f);
                this.f208107i = arrayList;
            }
            long j2 = j + 1;
            if (j2 == this.f208105g) {
                this.f208106h = 0L;
            } else {
                this.f208106h = j2;
            }
            if (arrayList != null) {
                arrayList.add(t);
                if (arrayList.size() == this.f208104f) {
                    this.f208107i = null;
                    this.f208103e.onNext(arrayList);
                }
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorBufferWithSize$a */
    public static final class C22437a<T> extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super List<T>> f208108e;

        /* JADX INFO: renamed from: f */
        public final int f208109f;

        /* JADX INFO: renamed from: g */
        public List<T> f208110g;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorBufferWithSize$a$a */
        public class a implements vk90 {
            public a() {
            }

            @Override // p153l.vk90
            public void request(long j) {
                if (j < 0) {
                    fcg0.m125008a("n >= required but it was ", j);
                } else if (j != 0) {
                    C22437a.this.m129868e(rc2.m180771c(j, C22437a.this.f208109f));
                }
            }
        }

        public C22437a(gcg0<? super List<T>> gcg0Var, int i) {
            this.f208108e = gcg0Var;
            this.f208109f = i;
            m129868e(0L);
        }

        /* JADX INFO: renamed from: h */
        public vk90 m222610h() {
            return new a();
        }

        @Override // p153l.bb50
        public void onCompleted() {
            List<T> list = this.f208110g;
            if (list != null) {
                this.f208108e.onNext(list);
            }
            this.f208108e.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f208110g = null;
            this.f208108e.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            List arrayList = this.f208110g;
            if (arrayList == null) {
                arrayList = new ArrayList(this.f208109f);
                this.f208110g = arrayList;
            }
            arrayList.add(t);
            if (arrayList.size() == this.f208109f) {
                this.f208110g = null;
                this.f208108e.onNext(arrayList);
            }
        }
    }

    public OperatorBufferWithSize(int i, int i2) {
        if (i <= 0) {
            wg3.m206174a("count must be greater than 0");
            throw null;
        }
        if (i2 <= 0) {
            wg3.m206174a("skip must be greater than 0");
            throw null;
        }
        this.f208094a = i;
        this.f208095b = i2;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super List<T>> gcg0Var) {
        int i = this.f208095b;
        int i2 = this.f208094a;
        if (i == i2) {
            C22437a c22437a = new C22437a(gcg0Var, i2);
            gcg0Var.m129866b(c22437a);
            gcg0Var.mo95773f(c22437a.m222610h());
            return c22437a;
        }
        if (i > i2) {
            BufferSkip bufferSkip = new BufferSkip(gcg0Var, i2, i);
            gcg0Var.m129866b(bufferSkip);
            gcg0Var.mo95773f(bufferSkip.m222608i());
            return bufferSkip;
        }
        BufferOverlap bufferOverlap = new BufferOverlap(gcg0Var, i2, i);
        gcg0Var.m129866b(bufferOverlap);
        gcg0Var.mo95773f(bufferOverlap.m222605i());
        return bufferOverlap;
    }
}
