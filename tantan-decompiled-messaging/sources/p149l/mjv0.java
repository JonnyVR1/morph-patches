package p149l;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class mjv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final qlv0 f134254a;

    /* JADX INFO: renamed from: b */
    public final long f134255b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f134256c;

    public mjv0(qlv0 qlv0Var, long j, ScheduledExecutorService scheduledExecutorService) {
        this.f134254a = qlv0Var;
        this.f134255b = j;
        this.f134256c = scheduledExecutorService;
    }

    @Override // p149l.qlv0
    public final int zza() {
        return this.f134254a.zza();
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        gnr gnrVarZzb = this.f134254a.zzb();
        long j = this.f134255b;
        if (j > 0) {
            gnrVarZzb = jmw0.m142242o(gnrVarZzb, j, TimeUnit.MILLISECONDS, this.f134256c);
        }
        return jmw0.m142233f(gnrVarZzb, Throwable.class, new rlw0() { // from class: l.ljv0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return jmw0.m142235h(null);
            }
        }, i3t0.f111377f);
    }
}
