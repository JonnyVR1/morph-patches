package p153l;

import android.os.Binder;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.internal.ads.zzbym;
import com.google.android.gms.internal.ads.zzecf;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes6.dex */
public final class u5v0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f177677a;

    /* JADX INFO: renamed from: b */
    public final xvw0 f177678b;

    /* JADX INFO: renamed from: c */
    public final u6v0 f177679c;

    /* JADX INFO: renamed from: d */
    public final kpx0 f177680d;

    public u5v0(xvw0 xvw0Var, xvw0 xvw0Var2, u6v0 u6v0Var, kpx0 kpx0Var) {
        this.f177677a = xvw0Var;
        this.f177678b = xvw0Var2;
        this.f177679c = u6v0Var;
        this.f177680d = kpx0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hpr m194627a(zzbym zzbymVar) throws Exception {
        return this.f177679c.m194721c(zzbymVar, ((Long) jas0.m144075c().m176505a(sgs0.f168202Xa)).longValue());
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hpr m194628b(zzbym zzbymVar, int i, zzecf zzecfVar) throws Exception {
        return ((e8v0) this.f177680d.zzb()).m119834o8(zzbymVar, i);
    }

    /* JADX INFO: renamed from: c */
    public final hpr m194629c(final zzbym zzbymVar) {
        hpr hprVarM173979f;
        String str = zzbymVar.zzf;
        bxy0.m106934r();
        if (C2098b.m12362b(str)) {
            hprVarM173979f = pvw0.m173980g(new zzecf(1, "Ads service proxy force local"));
        } else {
            hprVarM173979f = pvw0.m173979f(pvw0.m173984k(new wuw0() { // from class: l.r5v0
                @Override // p153l.wuw0
                public final hpr zza() {
                    return this.f161409a.m194627a(zzbymVar);
                }
            }, this.f177677a), ExecutionException.class, new xuw0() { // from class: l.s5v0
                @Override // p153l.xuw0
                public final hpr zza(Object obj) {
                    Throwable cause = (ExecutionException) obj;
                    if (cause.getCause() != null) {
                        cause = cause.getCause();
                    }
                    return pvw0.m173980g(cause);
                }
            }, this.f177678b);
        }
        final int callingUid = Binder.getCallingUid();
        return pvw0.m173979f(hprVarM173979f, zzecf.class, new xuw0() { // from class: l.t5v0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return this.f172235a.m194628b(zzbymVar, callingUid, (zzecf) obj);
            }
        }, this.f177678b);
    }
}
