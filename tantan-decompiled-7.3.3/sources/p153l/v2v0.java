package p153l;

import android.os.Binder;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzecf;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class v2v0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f182119a;

    /* JADX INFO: renamed from: b */
    public final xvw0 f182120b;

    /* JADX INFO: renamed from: c */
    public final i4v0 f182121c;

    /* JADX INFO: renamed from: d */
    public final kpx0 f182122d;

    public v2v0(xvw0 xvw0Var, xvw0 xvw0Var2, i4v0 i4v0Var, kpx0 kpx0Var) {
        this.f182119a = xvw0Var;
        this.f182120b = xvw0Var2;
        this.f182121c = i4v0Var;
        this.f182122d = kpx0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hpr m199152a(zzbze zzbzeVar, int i, zzecf zzecfVar) throws Exception {
        return ((u7v0) this.f182122d.zzb()).m194885p8(zzbzeVar, i);
    }

    /* JADX INFO: renamed from: b */
    public final hpr m199153b(final zzbze zzbzeVar) {
        hpr hprVarM173979f;
        String str = zzbzeVar.zzd;
        bxy0.m106934r();
        if (C2098b.m12362b(str)) {
            hprVarM173979f = pvw0.m173980g(new zzecf(1));
        } else {
            hprVarM173979f = pvw0.m173979f(this.f182119a.mo155969R(new Callable() { // from class: l.s2v0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f165934a.m199154c(zzbzeVar);
                }
            }), ExecutionException.class, new xuw0() { // from class: l.t2v0
                @Override // p153l.xuw0
                public final hpr zza(Object obj) {
                    return pvw0.m173980g(((ExecutionException) obj).getCause());
                }
            }, this.f182120b);
        }
        final int callingUid = Binder.getCallingUid();
        return pvw0.m173979f(hprVarM173979f, zzecf.class, new xuw0() { // from class: l.u2v0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return this.f177246a.m199152a(zzbzeVar, callingUid, (zzecf) obj);
            }
        }, this.f182120b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InputStream m199154c(zzbze zzbzeVar) throws Exception {
        tct0 tct0Var;
        final i4v0 i4v0Var = this.f182121c;
        synchronized (i4v0Var.f123932b) {
            try {
                if (i4v0Var.f123933c) {
                    tct0Var = i4v0Var.f123931a;
                } else {
                    i4v0Var.f123933c = true;
                    i4v0Var.f123935e = zzbzeVar;
                    i4v0Var.f123936f.checkAvailabilityAndConnect();
                    i4v0Var.f123931a.addListener(new Runnable() { // from class: l.h4v0
                        @Override // java.lang.Runnable
                        public final void run() {
                            i4v0Var.m148299a();
                        }
                    }, oct0.f146738f);
                    tct0Var = i4v0Var.f123931a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (InputStream) tct0Var.get(((Integer) jas0.m144075c().m176505a(sgs0.f168527x5)).intValue(), TimeUnit.SECONDS);
    }
}
