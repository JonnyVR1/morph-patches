package p149l;

import android.os.Binder;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzecf;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class puu0 {

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f151357a;

    /* JADX INFO: renamed from: b */
    public final rmw0 f151358b;

    /* JADX INFO: renamed from: c */
    public final rmw0 f151359c;

    /* JADX INFO: renamed from: d */
    public final gvu0 f151360d;

    /* JADX INFO: renamed from: e */
    public final egx0 f151361e;

    public puu0(ScheduledExecutorService scheduledExecutorService, rmw0 rmw0Var, rmw0 rmw0Var2, gvu0 gvu0Var, egx0 egx0Var) {
        this.f151357a = scheduledExecutorService;
        this.f151358b = rmw0Var;
        this.f151359c = rmw0Var2;
        this.f151360d = gvu0Var;
        this.f151361e = egx0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gnr m171480a(zzbze zzbzeVar, int i, Throwable th) throws Exception {
        return ((oyu0) this.f151361e.zzb()).m166704q8(zzbzeVar, i);
    }

    /* JADX INFO: renamed from: b */
    public final gnr m171481b(final zzbze zzbzeVar) {
        gnr gnrVarMo122102R;
        String str = zzbzeVar.zzd;
        vny0.m199080r();
        if (C2075b.m12308b(str)) {
            gnrVarMo122102R = jmw0.m142234g(new zzecf(1));
        } else {
            gnrVarMo122102R = ((Boolean) d1s0.m109677c().m144697a(m7s0.f131852A7)).booleanValue() ? this.f151359c.mo122102R(new Callable() { // from class: l.huu0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f109587a.m171482c(zzbzeVar);
                }
            }) : this.f151360d.m128294b(zzbzeVar);
        }
        final int callingUid = Binder.getCallingUid();
        return jmw0.m142233f((amw0) jmw0.m142242o(amw0.m97696C(gnrVarMo122102R), ((Integer) d1s0.m109677c().m144697a(m7s0.f132456x5)).intValue(), TimeUnit.SECONDS, this.f151357a), Throwable.class, new rlw0() { // from class: l.ouu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return this.f145738a.m171480a(zzbzeVar, callingUid, (Throwable) obj);
            }
        }, this.f151358b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InputStream m171482c(zzbze zzbzeVar) throws Exception {
        return (InputStream) this.f151360d.m128294b(zzbzeVar).get(((Integer) d1s0.m109677c().m144697a(m7s0.f132456x5)).intValue(), TimeUnit.SECONDS);
    }
}
