package p153l;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class ozv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f149963a;

    /* JADX INFO: renamed from: b */
    public final Context f149964b;

    /* JADX INFO: renamed from: c */
    public final v1t0 f149965c;

    public ozv0(v1t0 v1t0Var, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.f149965c = v1t0Var;
        this.f149963a = scheduledExecutorService;
        this.f149964b = context;
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 49;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return pvw0.m173986m(pvw0.m173988o(pvw0.m173981h(new Bundle()), ((Long) jas0.m144075c().m176505a(sgs0.f168219Z3)).longValue(), TimeUnit.MILLISECONDS, this.f149963a), new eow0() { // from class: l.nzv0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                return new pzv0((Bundle) obj);
            }
        }, oct0.f146733a);
    }
}
