package p149l;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class rfv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final y1t0 f159201a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public yw0 f159202b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f159203c;

    /* JADX INFO: renamed from: d */
    public final rmw0 f159204d;

    /* JADX INFO: renamed from: e */
    public final Context f159205e;

    public rfv0(Context context, y1t0 y1t0Var, ScheduledExecutorService scheduledExecutorService, rmw0 rmw0Var) {
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f131919G2)).booleanValue()) {
            this.f159202b = xw0.m211309a(context);
        }
        this.f159205e = context;
        this.f159201a = y1t0Var;
        this.f159203c = scheduledExecutorService;
        this.f159204d = rmw0Var;
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 11;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131871C2)).booleanValue()) {
            if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f131931H2)).booleanValue()) {
                if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f131883D2)).booleanValue()) {
                    return jmw0.m142240m(icw0.m135370a(this.f159202b.mo13755a(), null), new yew0() { // from class: l.ofv0
                        @Override // p149l.yew0
                        public final Object apply(Object obj) {
                            zw0 zw0Var = (zw0) obj;
                            return new sfv0(zw0Var.m220497a(), zw0Var.m220498b());
                        }
                    }, i3t0.f111377f);
                }
                Task<zw0> taskM186800a = ((Boolean) d1s0.m109677c().m144697a(m7s0.f131919G2)).booleanValue() ? szv0.m186800a(this.f159205e) : this.f159202b.mo13755a();
                if (taskM186800a == null) {
                    return jmw0.m142235h(new sfv0(null, -1));
                }
                gnr gnrVarM142241n = jmw0.m142241n(icw0.m135370a(taskM186800a, null), new rlw0() { // from class: l.pfv0
                    @Override // p149l.rlw0
                    public final gnr zza(Object obj) {
                        zw0 zw0Var = (zw0) obj;
                        return zw0Var == null ? jmw0.m142235h(new sfv0(null, -1)) : jmw0.m142235h(new sfv0(zw0Var.m220497a(), zw0Var.m220498b()));
                    }
                }, i3t0.f111377f);
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131895E2)).booleanValue()) {
                    gnrVarM142241n = jmw0.m142242o(gnrVarM142241n, ((Long) d1s0.m109677c().m144697a(m7s0.f131907F2)).longValue(), TimeUnit.MILLISECONDS, this.f159203c);
                }
                return jmw0.m142232e(gnrVarM142241n, Exception.class, new yew0() { // from class: l.qfv0
                    @Override // p149l.yew0
                    public final Object apply(Object obj) {
                        this.f154293a.f159201a.m212290w((Exception) obj, "AppSetIdInfoSignal");
                        return new sfv0(null, -1);
                    }
                }, this.f159204d);
            }
        }
        return jmw0.m142235h(new sfv0(null, -1));
    }
}
