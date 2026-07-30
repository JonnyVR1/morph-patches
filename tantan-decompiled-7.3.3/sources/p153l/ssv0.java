package p153l;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class ssv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final wuv0 f170521a;

    /* JADX INFO: renamed from: b */
    public final long f170522b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f170523c;

    public ssv0(wuv0 wuv0Var, long j, ScheduledExecutorService scheduledExecutorService) {
        this.f170521a = wuv0Var;
        this.f170522b = j;
        this.f170523c = scheduledExecutorService;
    }

    @Override // p153l.wuv0
    public final int zza() {
        return this.f170521a.zza();
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        hpr hprVarZzb = this.f170521a.zzb();
        long j = this.f170522b;
        if (j > 0) {
            hprVarZzb = pvw0.m173988o(hprVarZzb, j, TimeUnit.MILLISECONDS, this.f170523c);
        }
        return pvw0.m173979f(hprVarZzb, Throwable.class, new xuw0() { // from class: l.rsv0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return pvw0.m173981h(null);
            }
        }, oct0.f146738f);
    }
}
