package p153l;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class r360<T, R> implements C22421c.c<R, T> {

    /* JADX INFO: renamed from: a */
    public final qcj<? super T, ? extends R> f160998a;

    /* JADX INFO: renamed from: b */
    public final qcj<? super Throwable, ? extends R> f160999b;

    /* JADX INFO: renamed from: c */
    public final pcj<? extends R> f161000c;

    /* JADX INFO: renamed from: l.r360$a */
    public class C19752a implements vk90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C19753b f161001a;

        public C19752a(C19753b c19753b) {
            this.f161001a = c19753b;
        }

        @Override // p153l.vk90
        public void request(long j) {
            this.f161001a.m179581h(j);
        }
    }

    /* JADX INFO: renamed from: l.r360$b */
    public static final class C19753b<T, R> extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super R> f161003e;

        /* JADX INFO: renamed from: f */
        public final qcj<? super T, ? extends R> f161004f;

        /* JADX INFO: renamed from: g */
        public final qcj<? super Throwable, ? extends R> f161005g;

        /* JADX INFO: renamed from: h */
        public final pcj<? extends R> f161006h;

        /* JADX INFO: renamed from: i */
        public final AtomicLong f161007i = new AtomicLong();

        /* JADX INFO: renamed from: j */
        public final AtomicLong f161008j = new AtomicLong();

        /* JADX INFO: renamed from: k */
        public final AtomicReference<vk90> f161009k = new AtomicReference<>();

        /* JADX INFO: renamed from: l */
        public long f161010l;

        /* JADX INFO: renamed from: m */
        public R f161011m;

        public C19753b(gcg0<? super R> gcg0Var, qcj<? super T, ? extends R> qcjVar, qcj<? super Throwable, ? extends R> qcjVar2, pcj<? extends R> pcjVar) {
            this.f161003e = gcg0Var;
            this.f161004f = qcjVar;
            this.f161005g = qcjVar2;
            this.f161006h = pcjVar;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: f */
        public void mo95773f(vk90 vk90Var) {
            if (!m31.m156916a(this.f161009k, null, vk90Var)) {
                wtq0.m207906a("Producer already set!");
                return;
            }
            long andSet = this.f161008j.getAndSet(0L);
            if (andSet != 0) {
                vk90Var.request(andSet);
            }
        }

        /* JADX INFO: renamed from: g */
        public void m179580g() {
            long j = this.f161010l;
            if (j == 0 || this.f161009k.get() == null) {
                return;
            }
            rc2.m180777i(this.f161007i, j);
        }

        /* JADX INFO: renamed from: h */
        public void m179581h(long j) {
            if (j < 0) {
                fcg0.m125008a("n >= 0 required but it was ", j);
                return;
            }
            if (j == 0) {
                return;
            }
            while (true) {
                long j2 = this.f161007i.get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    long j3 = Long.MAX_VALUE & j2;
                    if (this.f161007i.compareAndSet(j2, Long.MIN_VALUE | rc2.m180769a(j3, j))) {
                        if (j3 == 0) {
                            if (!this.f161003e.isUnsubscribed()) {
                                this.f161003e.onNext(this.f161011m);
                            }
                            if (this.f161003e.isUnsubscribed()) {
                                return;
                            }
                            this.f161003e.onCompleted();
                            return;
                        }
                        return;
                    }
                } else {
                    if (this.f161007i.compareAndSet(j2, rc2.m180769a(j2, j))) {
                        AtomicReference<vk90> atomicReference = this.f161009k;
                        vk90 vk90Var = atomicReference.get();
                        if (vk90Var != null) {
                            vk90Var.request(j);
                            return;
                        }
                        rc2.m180770b(this.f161008j, j);
                        vk90 vk90Var2 = atomicReference.get();
                        if (vk90Var2 != null) {
                            long andSet = this.f161008j.getAndSet(0L);
                            if (andSet != 0) {
                                vk90Var2.request(andSet);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: i */
        public void m179582i() {
            long j;
            do {
                j = this.f161007i.get();
                if ((j & Long.MIN_VALUE) != 0) {
                    return;
                }
            } while (!this.f161007i.compareAndSet(j, Long.MIN_VALUE | j));
            if (j != 0 || this.f161009k.get() == null) {
                if (!this.f161003e.isUnsubscribed()) {
                    this.f161003e.onNext(this.f161011m);
                }
                if (this.f161003e.isUnsubscribed()) {
                    return;
                }
                this.f161003e.onCompleted();
            }
        }

        @Override // p153l.bb50
        public void onCompleted() {
            m179580g();
            try {
                this.f161011m = this.f161006h.call();
            } catch (Throwable th) {
                j6f.m143664f(th, this.f161003e);
            }
            m179582i();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            m179580g();
            try {
                this.f161011m = this.f161005g.call(th);
            } catch (Throwable th2) {
                j6f.m143665g(th2, this.f161003e, th);
            }
            m179582i();
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            try {
                this.f161010l++;
                this.f161003e.onNext(this.f161004f.call(t));
            } catch (Throwable th) {
                j6f.m143665g(th, this.f161003e, t);
            }
        }
    }

    public r360(qcj<? super T, ? extends R> qcjVar, qcj<? super Throwable, ? extends R> qcjVar2, pcj<? extends R> pcjVar) {
        this.f160998a = qcjVar;
        this.f160999b = qcjVar2;
        this.f161000c = pcjVar;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super R> gcg0Var) {
        C19753b c19753b = new C19753b(gcg0Var, this.f160998a, this.f160999b, this.f161000c);
        gcg0Var.m129866b(c19753b);
        gcg0Var.mo95773f(new C19752a(c19753b));
        return c19753b;
    }
}
