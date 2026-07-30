package p003l;

import java.util.concurrent.TimeUnit;
import p014rx.C1098b;
import p014rx.C1099c;
import p014rx.internal.schedulers.SchedulerWhen;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class bud0 {

    /* JADX INFO: renamed from: a */
    public static final long f2495a = TimeUnit.MINUTES.toNanos(Long.getLong("rx.scheduler.drift-tolerance", 15).longValue());

    /* JADX INFO: renamed from: l.bud0$a */
    public static abstract class AbstractC0185a implements c4g0 {

        /* JADX INFO: renamed from: l.bud0$a$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public long f2496a;

            /* JADX INFO: renamed from: b */
            public long f2497b;

            /* JADX INFO: renamed from: c */
            public long f2498c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ long f2499d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ long f2500e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ d30 f2501f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ em10 f2502g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ long f2503h;

            public a(long j, long j2, d30 d30Var, em10 em10Var, long j3) {
                this.f2499d = j;
                this.f2500e = j2;
                this.f2501f = d30Var;
                this.f2502g = em10Var;
                this.f2503h = j3;
                this.f2497b = j;
                this.f2498c = j2;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0038  */
            @Override // p003l.d30
            public void call() {
                long j;
                this.f2501f.call();
                if (this.f2502g.isUnsubscribed()) {
                    return;
                }
                long nanos = TimeUnit.MILLISECONDS.toNanos(AbstractC0185a.this.mo3171a());
                long j2 = bud0.f2495a;
                long j3 = nanos + j2;
                long j4 = this.f2497b;
                if (j3 >= j4) {
                    long j5 = this.f2503h;
                    if (nanos >= j4 + j5 + j2) {
                        long j6 = this.f2503h;
                        long j7 = nanos + j6;
                        long j8 = this.f2496a + 1;
                        this.f2496a = j8;
                        this.f2498c = j7 - (j6 * j8);
                        j = j7;
                    } else {
                        long j9 = this.f2498c;
                        long j10 = this.f2496a + 1;
                        this.f2496a = j10;
                        j = j9 + (j10 * j5);
                    }
                } else {
                    long j11 = this.f2503h;
                    long j12 = nanos + j11;
                    long j13 = this.f2496a + 1;
                    this.f2496a = j13;
                    this.f2498c = j12 - (j11 * j13);
                    j = j12;
                }
                this.f2497b = nanos;
                this.f2502g.m3901a(AbstractC0185a.this.mo2915c(this, j - nanos, TimeUnit.NANOSECONDS));
            }
        }

        /* JADX INFO: renamed from: a */
        public long mo3171a() {
            return System.currentTimeMillis();
        }

        /* JADX INFO: renamed from: b */
        public abstract c4g0 mo2914b(d30 d30Var);

        /* JADX INFO: renamed from: c */
        public abstract c4g0 mo2915c(d30 d30Var, long j, TimeUnit timeUnit);

        /* JADX INFO: renamed from: d */
        public c4g0 m3172d(d30 d30Var, long j, long j2, TimeUnit timeUnit) {
            long nanos = timeUnit.toNanos(j2);
            long nanos2 = TimeUnit.MILLISECONDS.toNanos(mo3171a());
            long nanos3 = nanos2 + timeUnit.toNanos(j);
            em10 em10Var = new em10();
            a aVar = new a(nanos2, nanos3, d30Var, em10Var, nanos);
            em10 em10Var2 = new em10();
            em10Var.m3901a(em10Var2);
            em10Var2.m3901a(mo2915c(aVar, j, timeUnit));
            return em10Var;
        }
    }

    public abstract AbstractC0185a createWorker();

    public long now() {
        return System.currentTimeMillis();
    }

    public <S extends bud0 & c4g0> S when(w9j<C1099c<C1099c<C1098b>>, C1098b> w9jVar) {
        return new SchedulerWhen(w9jVar, this);
    }
}
