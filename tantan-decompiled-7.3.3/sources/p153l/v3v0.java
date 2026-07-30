package p153l;

import android.os.Binder;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzecf;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class v3v0 {

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f182302a;

    /* JADX INFO: renamed from: b */
    public final xvw0 f182303b;

    /* JADX INFO: renamed from: c */
    public final xvw0 f182304c;

    /* JADX INFO: renamed from: d */
    public final m4v0 f182305d;

    /* JADX INFO: renamed from: e */
    public final kpx0 f182306e;

    public v3v0(ScheduledExecutorService scheduledExecutorService, xvw0 xvw0Var, xvw0 xvw0Var2, m4v0 m4v0Var, kpx0 kpx0Var) {
        this.f182302a = scheduledExecutorService;
        this.f182303b = xvw0Var;
        this.f182304c = xvw0Var2;
        this.f182305d = m4v0Var;
        this.f182306e = kpx0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hpr m199629a(zzbze zzbzeVar, int i, Throwable th) throws Exception {
        return ((u7v0) this.f182306e.zzb()).m194886q8(zzbzeVar, i);
    }

    /* JADX INFO: renamed from: b */
    public final hpr m199630b(final zzbze zzbzeVar) {
        hpr hprVarMo155969R;
        String str = zzbzeVar.zzd;
        bxy0.m106934r();
        if (C2098b.m12362b(str)) {
            hprVarMo155969R = pvw0.m173980g(new zzecf(1));
        } else {
            hprVarMo155969R = ((Boolean) jas0.m144075c().m176505a(sgs0.f167923A7)).booleanValue() ? this.f182304c.mo155969R(new Callable() { // from class: l.n3v0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f140037a.m199631c(zzbzeVar);
                }
            }) : this.f182305d.m157063b(zzbzeVar);
        }
        final int callingUid = Binder.getCallingUid();
        return pvw0.m173979f((gvw0) pvw0.m173988o(gvw0.m132580C(hprVarMo155969R), ((Integer) jas0.m144075c().m176505a(sgs0.f168527x5)).intValue(), TimeUnit.SECONDS, this.f182302a), Throwable.class, new xuw0() { // from class: l.u3v0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return this.f177378a.m199629a(zzbzeVar, callingUid, (Throwable) obj);
            }
        }, this.f182303b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InputStream m199631c(zzbze zzbzeVar) throws Exception {
        return (InputStream) this.f182305d.m157063b(zzbzeVar).get(((Integer) jas0.m144075c().m176505a(sgs0.f168527x5)).intValue(), TimeUnit.SECONDS);
    }
}
