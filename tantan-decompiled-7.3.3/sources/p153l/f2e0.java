package p153l;

import java.util.concurrent.TimeUnit;
import p137rx.C22420b;
import p137rx.C22421c;
import p137rx.internal.schedulers.SchedulerWhen;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f2e0 {

    /* JADX INFO: renamed from: a */
    public static final long f96870a = TimeUnit.MINUTES.toNanos(Long.getLong("rx.scheduler.drift-tolerance", 15).longValue());

    /* JADX INFO: renamed from: l.f2e0$a */
    public static abstract class AbstractC16877a implements kcg0 {

        /* JADX INFO: renamed from: l.f2e0$a$a */
        public class a implements x20 {

            /* JADX INFO: renamed from: a */
            public long f96871a;

            /* JADX INFO: renamed from: b */
            public long f96872b;

            /* JADX INFO: renamed from: c */
            public long f96873c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ long f96874d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ long f96875e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ x20 f96876f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ mu10 f96877g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ long f96878h;

            public a(long j, long j2, x20 x20Var, mu10 mu10Var, long j3) {
                this.f96874d = j;
                this.f96875e = j2;
                this.f96876f = x20Var;
                this.f96877g = mu10Var;
                this.f96878h = j3;
                this.f96872b = j;
                this.f96873c = j2;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0038  */
            @Override // p153l.x20
            public void call() {
                long j;
                this.f96876f.call();
                if (this.f96877g.isUnsubscribed()) {
                    return;
                }
                long nanos = TimeUnit.MILLISECONDS.toNanos(AbstractC16877a.this.mo123610a());
                long j2 = f2e0.f96870a;
                long j3 = nanos + j2;
                long j4 = this.f96872b;
                if (j3 >= j4) {
                    long j5 = this.f96878h;
                    if (nanos >= j4 + j5 + j2) {
                        long j6 = this.f96878h;
                        long j7 = nanos + j6;
                        long j8 = this.f96871a + 1;
                        this.f96871a = j8;
                        this.f96873c = j7 - (j6 * j8);
                        j = j7;
                    } else {
                        long j9 = this.f96873c;
                        long j10 = this.f96871a + 1;
                        this.f96871a = j10;
                        j = j9 + (j10 * j5);
                    }
                } else {
                    long j11 = this.f96878h;
                    long j12 = nanos + j11;
                    long j13 = this.f96871a + 1;
                    this.f96871a = j13;
                    this.f96873c = j12 - (j11 * j13);
                    j = j12;
                }
                this.f96872b = nanos;
                this.f96877g.m160064a(AbstractC16877a.this.mo102837c(this, j - nanos, TimeUnit.NANOSECONDS));
            }
        }

        /* JADX INFO: renamed from: a */
        public long mo123610a() {
            return System.currentTimeMillis();
        }

        /* JADX INFO: renamed from: b */
        public abstract kcg0 mo102836b(x20 x20Var);

        /* JADX INFO: renamed from: c */
        public abstract kcg0 mo102837c(x20 x20Var, long j, TimeUnit timeUnit);

        /* JADX INFO: renamed from: d */
        public kcg0 m123611d(x20 x20Var, long j, long j2, TimeUnit timeUnit) {
            long nanos = timeUnit.toNanos(j2);
            long nanos2 = TimeUnit.MILLISECONDS.toNanos(mo123610a());
            long nanos3 = nanos2 + timeUnit.toNanos(j);
            mu10 mu10Var = new mu10();
            a aVar = new a(nanos2, nanos3, x20Var, mu10Var, nanos);
            mu10 mu10Var2 = new mu10();
            mu10Var.m160064a(mu10Var2);
            mu10Var2.m160064a(mo102837c(aVar, j, timeUnit));
            return mu10Var;
        }
    }

    public abstract AbstractC16877a createWorker();

    public long now() {
        return System.currentTimeMillis();
    }

    public <S extends f2e0 & kcg0> S when(qcj<C22421c<C22421c<C22420b>>, C22420b> qcjVar) {
        return new SchedulerWhen(qcjVar, this);
    }
}
