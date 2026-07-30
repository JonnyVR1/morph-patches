package p149l;

import java.util.concurrent.TimeUnit;
import p133rx.C22305b;
import p133rx.C22306c;
import p133rx.internal.schedulers.SchedulerWhen;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bud0 {

    /* JADX INFO: renamed from: a */
    public static final long f77306a = TimeUnit.MINUTES.toNanos(Long.getLong("rx.scheduler.drift-tolerance", 15).longValue());

    /* JADX INFO: renamed from: l.bud0$a */
    public static abstract class AbstractC15976a implements c4g0 {

        /* JADX INFO: renamed from: l.bud0$a$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public long f77307a;

            /* JADX INFO: renamed from: b */
            public long f77308b;

            /* JADX INFO: renamed from: c */
            public long f77309c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ long f77310d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ long f77311e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ d30 f77312f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ em10 f77313g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ long f77314h;

            public a(long j, long j2, d30 d30Var, em10 em10Var, long j3) {
                this.f77310d = j;
                this.f77311e = j2;
                this.f77312f = d30Var;
                this.f77313g = em10Var;
                this.f77314h = j3;
                this.f77308b = j;
                this.f77309c = j2;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0038  */
            @Override // p149l.d30
            public void call() {
                long j;
                this.f77312f.call();
                if (this.f77313g.isUnsubscribed()) {
                    return;
                }
                long nanos = TimeUnit.MILLISECONDS.toNanos(AbstractC15976a.this.mo103919a());
                long j2 = bud0.f77306a;
                long j3 = nanos + j2;
                long j4 = this.f77308b;
                if (j3 >= j4) {
                    long j5 = this.f77314h;
                    if (nanos >= j4 + j5 + j2) {
                        long j6 = this.f77314h;
                        long j7 = nanos + j6;
                        long j8 = this.f77307a + 1;
                        this.f77307a = j8;
                        this.f77309c = j7 - (j6 * j8);
                        j = j7;
                    } else {
                        long j9 = this.f77309c;
                        long j10 = this.f77307a + 1;
                        this.f77307a = j10;
                        j = j9 + (j10 * j5);
                    }
                } else {
                    long j11 = this.f77314h;
                    long j12 = nanos + j11;
                    long j13 = this.f77307a + 1;
                    this.f77307a = j13;
                    this.f77309c = j12 - (j11 * j13);
                    j = j12;
                }
                this.f77308b = nanos;
                this.f77313g.m117195a(AbstractC15976a.this.mo99202c(this, j - nanos, TimeUnit.NANOSECONDS));
            }
        }

        /* JADX INFO: renamed from: a */
        public long mo103919a() {
            return System.currentTimeMillis();
        }

        /* JADX INFO: renamed from: b */
        public abstract c4g0 mo99201b(d30 d30Var);

        /* JADX INFO: renamed from: c */
        public abstract c4g0 mo99202c(d30 d30Var, long j, TimeUnit timeUnit);

        /* JADX INFO: renamed from: d */
        public c4g0 m103920d(d30 d30Var, long j, long j2, TimeUnit timeUnit) {
            long nanos = timeUnit.toNanos(j2);
            long nanos2 = TimeUnit.MILLISECONDS.toNanos(mo103919a());
            long nanos3 = nanos2 + timeUnit.toNanos(j);
            em10 em10Var = new em10();
            a aVar = new a(nanos2, nanos3, d30Var, em10Var, nanos);
            em10 em10Var2 = new em10();
            em10Var.m117195a(em10Var2);
            em10Var2.m117195a(mo99202c(aVar, j, timeUnit));
            return em10Var;
        }
    }

    public abstract AbstractC15976a createWorker();

    public long now() {
        return System.currentTimeMillis();
    }

    public <S extends bud0 & c4g0> S when(w9j<C22306c<C22306c<C22305b>>, C22305b> w9jVar) {
        return new SchedulerWhen(w9jVar, this);
    }
}
