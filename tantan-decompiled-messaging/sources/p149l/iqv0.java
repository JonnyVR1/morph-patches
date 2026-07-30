package p149l;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class iqv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f114553a;

    /* JADX INFO: renamed from: b */
    public final Context f114554b;

    /* JADX INFO: renamed from: c */
    public final pss0 f114555c;

    public iqv0(pss0 pss0Var, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.f114555c = pss0Var;
        this.f114553a = scheduledExecutorService;
        this.f114554b = context;
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 49;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return jmw0.m142240m(jmw0.m142242o(jmw0.m142235h(new Bundle()), ((Long) d1s0.m109677c().m144697a(m7s0.f132148Z3)).longValue(), TimeUnit.MILLISECONDS, this.f114553a), new yew0() { // from class: l.hqv0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                return new jqv0((Bundle) obj);
            }
        }, i3t0.f111372a);
    }
}
