package p153l;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzecf;
import java.io.InputStream;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class p5v0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f150696a;

    /* JADX INFO: renamed from: b */
    public final q4v0 f150697b;

    /* JADX INFO: renamed from: c */
    public final kpx0 f150698c;

    /* JADX INFO: renamed from: d */
    public final hew0 f150699d;

    /* JADX INFO: renamed from: e */
    public final Context f150700e;

    /* JADX INFO: renamed from: f */
    public final zzcei f150701f;

    public p5v0(xvw0 xvw0Var, q4v0 q4v0Var, kpx0 kpx0Var, hew0 hew0Var, Context context, zzcei zzceiVar) {
        this.f150696a = xvw0Var;
        this.f150697b = q4v0Var;
        this.f150698c = kpx0Var;
        this.f150699d = hew0Var;
        this.f150700e = context;
        this.f150701f = zzceiVar;
    }

    /* JADX INFO: renamed from: a */
    public final hpr m170683a(final zzbze zzbzeVar) {
        xuw0 xuw0Var = new xuw0() { // from class: l.j5v0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                String str = new String(itw0.m142130b((InputStream) obj), cow0.f82931c);
                zzbze zzbzeVar2 = zzbzeVar;
                zzbzeVar2.zzj = str;
                return pvw0.m173981h(zzbzeVar2);
            }
        };
        final q4v0 q4v0Var = this.f150697b;
        Objects.requireNonNull(q4v0Var);
        return m170690h(zzbzeVar, new o5v0() { // from class: l.k5v0
            @Override // p153l.o5v0
            /* JADX INFO: renamed from: a */
            public final hpr mo133676a(zzbze zzbzeVar2) {
                return q4v0Var.m175260b(zzbzeVar2);
            }
        }, new o5v0() { // from class: l.l5v0
            @Override // p153l.o5v0
            /* JADX INFO: renamed from: a */
            public final hpr mo133676a(zzbze zzbzeVar2) {
                return this.f130191a.m170686d(zzbzeVar2);
            }
        }, xuw0Var);
    }

    /* JADX INFO: renamed from: b */
    public final hpr m170684b(JSONObject jSONObject) {
        return pvw0.m173987n(gvw0.m132580C(pvw0.m173981h(jSONObject)), bxy0.m106924h().m127699a(this.f150700e, this.f150701f, this.f150699d).m169486a("AFMA_getAdDictionary", lvs0.f133729b, new gvs0() { // from class: l.f5v0
            @Override // p153l.gvs0
            /* JADX INFO: renamed from: a */
            public final Object mo124251a(JSONObject jSONObject2) {
                return new s4t0(jSONObject2);
            }
        }), this.f150696a);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hpr m170685c(o5v0 o5v0Var, zzbze zzbzeVar, xuw0 xuw0Var, zzecf zzecfVar) throws Exception {
        return pvw0.m173987n(o5v0Var.mo133676a(zzbzeVar), xuw0Var, this.f150696a);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ hpr m170686d(zzbze zzbzeVar) {
        return ((u7v0) this.f150698c.zzb()).m194884o8(zzbzeVar, Binder.getCallingUid());
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ hpr m170687e(zzbze zzbzeVar) {
        return this.f150697b.m175261c(zzbzeVar.zzh);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ hpr m170688f(zzbze zzbzeVar) {
        return ((u7v0) this.f150698c.zzb()).m194887r8(zzbzeVar.zzh);
    }

    /* JADX INFO: renamed from: g */
    public final hpr m170689g(zzbze zzbzeVar) {
        return m170690h(zzbzeVar, new o5v0() { // from class: l.h5v0
            @Override // p153l.o5v0
            /* JADX INFO: renamed from: a */
            public final hpr mo133676a(zzbze zzbzeVar2) {
                return this.f107980a.m170687e(zzbzeVar2);
            }
        }, new o5v0() { // from class: l.i5v0
            @Override // p153l.o5v0
            /* JADX INFO: renamed from: a */
            public final hpr mo133676a(zzbze zzbzeVar2) {
                return this.f113100a.m170688f(zzbzeVar2);
            }
        }, new xuw0() { // from class: l.g5v0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return pvw0.m173981h(null);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final hpr m170690h(final zzbze zzbzeVar, o5v0 o5v0Var, final o5v0 o5v0Var2, final xuw0 xuw0Var) {
        hpr hprVarM173979f;
        String str = zzbzeVar.zzd;
        bxy0.m106934r();
        if (C2098b.m12362b(str)) {
            hprVarM173979f = pvw0.m173980g(new zzecf(1));
        } else {
            hprVarM173979f = pvw0.m173979f(o5v0Var.mo133676a(zzbzeVar), ExecutionException.class, new xuw0() { // from class: l.n5v0
                @Override // p153l.xuw0
                public final hpr zza(Object obj) {
                    Throwable cause = (ExecutionException) obj;
                    if (cause.getCause() != null) {
                        cause = cause.getCause();
                    }
                    return pvw0.m173980g(cause);
                }
            }, this.f150696a);
        }
        return pvw0.m173979f(pvw0.m173987n(gvw0.m132580C(hprVarM173979f), xuw0Var, this.f150696a), zzecf.class, new xuw0() { // from class: l.m5v0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return this.f134945a.m170685c(o5v0Var2, zzbzeVar, xuw0Var, (zzecf) obj);
            }
        }, this.f150696a);
    }
}
