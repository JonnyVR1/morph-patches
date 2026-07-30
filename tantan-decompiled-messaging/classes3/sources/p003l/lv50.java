package p003l;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import l.f31;
import l.qkq0;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class lv50<T, R> implements C1099c.c<R, T> {

    /* JADX INFO: renamed from: a */
    public final w9j<? super T, ? extends R> f5418a;

    /* JADX INFO: renamed from: b */
    public final w9j<? super Throwable, ? extends R> f5419b;

    /* JADX INFO: renamed from: c */
    public final v9j<? extends R> f5420c;

    /* JADX INFO: renamed from: l.lv50$a */
    public class C0409a implements rc90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0410b f5421a;

        public C0409a(C0410b c0410b) {
            this.f5421a = c0410b;
        }

        @Override // p003l.rc90
        public void request(long j) {
            this.f5421a.m6151h(j);
        }
    }

    /* JADX INFO: renamed from: l.lv50$b */
    public static final class C0410b<T, R> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super R> f5423e;

        /* JADX INFO: renamed from: f */
        public final w9j<? super T, ? extends R> f5424f;

        /* JADX INFO: renamed from: g */
        public final w9j<? super Throwable, ? extends R> f5425g;

        /* JADX INFO: renamed from: h */
        public final v9j<? extends R> f5426h;

        /* JADX INFO: renamed from: i */
        public final AtomicLong f5427i = new AtomicLong();

        /* JADX INFO: renamed from: j */
        public final AtomicLong f5428j = new AtomicLong();

        /* JADX INFO: renamed from: k */
        public final AtomicReference<rc90> f5429k = new AtomicReference<>();

        /* JADX INFO: renamed from: l */
        public long f5430l;

        /* JADX INFO: renamed from: m */
        public R f5431m;

        public C0410b(z3g0<? super R> z3g0Var, w9j<? super T, ? extends R> w9jVar, w9j<? super Throwable, ? extends R> w9jVar2, v9j<? extends R> v9jVar) {
            this.f5423e = z3g0Var;
            this.f5424f = w9jVar;
            this.f5425g = w9jVar2;
            this.f5426h = v9jVar;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo3257f(rc90 rc90Var) {
            if (!f31.a(this.f5429k, (Object) null, rc90Var)) {
                qkq0.a("Producer already set!");
                return;
            }
            long andSet = this.f5428j.getAndSet(0L);
            if (andSet != 0) {
                rc90Var.request(andSet);
            }
        }

        /* JADX INFO: renamed from: g */
        public void m6150g() {
            long j = this.f5430l;
            if (j == 0 || this.f5429k.get() == null) {
                return;
            }
            kc2.m5647i(this.f5427i, j);
        }

        /* JADX INFO: renamed from: h */
        public void m6151h(long j) {
            if (j < 0) {
                y3g0.m8887a("n >= 0 required but it was ", j);
                return;
            }
            if (j == 0) {
                return;
            }
            while (true) {
                long j2 = this.f5427i.get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    long j3 = Long.MAX_VALUE & j2;
                    if (this.f5427i.compareAndSet(j2, Long.MIN_VALUE | kc2.m5639a(j3, j))) {
                        if (j3 == 0) {
                            if (!this.f5423e.isUnsubscribed()) {
                                this.f5423e.onNext(this.f5431m);
                            }
                            if (this.f5423e.isUnsubscribed()) {
                                return;
                            }
                            this.f5423e.onCompleted();
                            return;
                        }
                        return;
                    }
                } else {
                    if (this.f5427i.compareAndSet(j2, kc2.m5639a(j2, j))) {
                        AtomicReference<rc90> atomicReference = this.f5429k;
                        rc90 rc90Var = atomicReference.get();
                        if (rc90Var != null) {
                            rc90Var.request(j);
                            return;
                        }
                        kc2.m5640b(this.f5428j, j);
                        rc90 rc90Var2 = atomicReference.get();
                        if (rc90Var2 != null) {
                            long andSet = this.f5428j.getAndSet(0L);
                            if (andSet != 0) {
                                rc90Var2.request(andSet);
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
        public void m6152i() {
            long j;
            do {
                j = this.f5427i.get();
                if ((j & Long.MIN_VALUE) != 0) {
                    return;
                }
            } while (!this.f5427i.compareAndSet(j, Long.MIN_VALUE | j));
            if (j != 0 || this.f5429k.get() == null) {
                if (!this.f5423e.isUnsubscribed()) {
                    this.f5423e.onNext(this.f5431m);
                }
                if (this.f5423e.isUnsubscribed()) {
                    return;
                }
                this.f5423e.onCompleted();
            }
        }

        @Override // p003l.m250
        public void onCompleted() {
            m6150g();
            try {
                this.f5431m = this.f5426h.call();
            } catch (Throwable th) {
                f5f.m3965f(th, this.f5423e);
            }
            m6152i();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            m6150g();
            try {
                this.f5431m = this.f5425g.call(th);
            } catch (Throwable th2) {
                f5f.m3966g(th2, this.f5423e, th);
            }
            m6152i();
        }

        @Override // p003l.m250
        public void onNext(T t) {
            try {
                this.f5430l++;
                this.f5423e.onNext(this.f5424f.call(t));
            } catch (Throwable th) {
                f5f.m3966g(th, this.f5423e, t);
            }
        }
    }

    public lv50(w9j<? super T, ? extends R> w9jVar, w9j<? super Throwable, ? extends R> w9jVar2, v9j<? extends R> v9jVar) {
        this.f5418a = w9jVar;
        this.f5419b = w9jVar2;
        this.f5420c = v9jVar;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super R> z3g0Var) {
        C0410b c0410b = new C0410b(z3g0Var, this.f5418a, this.f5419b, this.f5420c);
        z3g0Var.m9240b(c0410b);
        z3g0Var.mo3257f(new C0409a(c0410b));
        return c0410b;
    }
}
