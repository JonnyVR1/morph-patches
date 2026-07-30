package p153l;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzflg;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class u7v0 extends s3t0 {

    /* JADX INFO: renamed from: a */
    public final Context f177943a;

    /* JADX INFO: renamed from: b */
    public final xvw0 f177944b;

    /* JADX INFO: renamed from: c */
    public final r8v0 f177945c;

    /* JADX INFO: renamed from: d */
    public final cst0 f177946d;

    /* JADX INFO: renamed from: e */
    public final ArrayDeque f177947e;

    /* JADX INFO: renamed from: f */
    public final hew0 f177948f;

    /* JADX INFO: renamed from: g */
    public final b5t0 f177949g;

    /* JADX INFO: renamed from: h */
    public final o8v0 f177950h;

    public u7v0(Context context, xvw0 xvw0Var, b5t0 b5t0Var, cst0 cst0Var, r8v0 r8v0Var, ArrayDeque arrayDeque, o8v0 o8v0Var, hew0 hew0Var) {
        sgs0.m185829a(context);
        this.f177943a = context;
        this.f177944b = xvw0Var;
        this.f177949g = b5t0Var;
        this.f177945c = r8v0Var;
        this.f177946d = cst0Var;
        this.f177947e = arrayDeque;
        this.f177950h = o8v0Var;
        this.f177948f = hew0Var;
    }

    /* JADX INFO: renamed from: u8 */
    public static hpr m194882u8(hpr hprVar, lcw0 lcw0Var, ovs0 ovs0Var, cew0 cew0Var, rdw0 rdw0Var) {
        evs0 evs0VarM169486a = ovs0Var.m169486a("AFMA_getAdDictionary", lvs0.f133729b, new gvs0() { // from class: l.n7v0
            @Override // p153l.gvs0
            /* JADX INFO: renamed from: a */
            public final Object mo124251a(JSONObject jSONObject) {
                return new s4t0(jSONObject);
            }
        });
        bew0.m103788d(hprVar, rdw0Var);
        mbw0 mbw0VarM115303a = lcw0Var.m120409b(zzflg.BUILD_URL, hprVar).m115308f(evs0VarM169486a).m115303a();
        bew0.m103787c(mbw0VarM115303a, cew0Var, rdw0Var);
        return mbw0VarM115303a;
    }

    /* JADX INFO: renamed from: v8 */
    public static hpr m194883v8(zzbze zzbzeVar, lcw0 lcw0Var, final awv0 awv0Var) {
        xuw0 xuw0Var = new xuw0() { // from class: l.d7v0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return awv0Var.mo100718b().m221730a(k6s0.m148569b().m167055j((Bundle) obj));
            }
        };
        return lcw0Var.m120409b(zzflg.GMS_SIGNALS, pvw0.m173981h(zzbzeVar.zza)).m115308f(xuw0Var).m115307e(new kbw0() { // from class: l.i7v0
            @Override // p153l.kbw0
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                d2v0.m113737k("Ad request signals:");
                d2v0.m113737k(jSONObject.toString(2));
                return jSONObject;
            }
        }).m115303a();
    }

    private final synchronized void zzo() {
        int iIntValue = ((Long) ojs0.f147712c.m149974e()).intValue();
        while (this.f177947e.size() >= iIntValue) {
            this.f177947e.removeFirst();
        }
    }

    @Override // p153l.t3t0
    /* JADX INFO: renamed from: L3 */
    public final void mo179705L3(zzbze zzbzeVar, n4t0 n4t0Var) {
        hpr hprVarM194885p8 = m194885p8(zzbzeVar, Binder.getCallingUid());
        m194891x8(hprVarM194885p8, n4t0Var);
        if (((Boolean) hjs0.f110319c.m149974e()).booleanValue()) {
            r8v0 r8v0Var = this.f177945c;
            Objects.requireNonNull(r8v0Var);
            hprVarM194885p8.addListener(new m7v0(r8v0Var), this.f177944b);
        }
    }

    @Override // p153l.t3t0
    /* JADX INFO: renamed from: c3 */
    public final void mo179706c3(zzbze zzbzeVar, n4t0 n4t0Var) {
        m194891x8(m194886q8(zzbzeVar, Binder.getCallingUid()), n4t0Var);
    }

    /* JADX INFO: renamed from: o8 */
    public final hpr m194884o8(final zzbze zzbzeVar, int i) {
        if (!((Boolean) ojs0.f147710a.m149974e()).booleanValue()) {
            return pvw0.m173980g(new Exception("Split request is disabled."));
        }
        zzfjc zzfjcVar = zzbzeVar.zzi;
        if (zzfjcVar == null) {
            return pvw0.m173980g(new Exception("Pool configuration missing from request."));
        }
        if (zzfjcVar.zzc == 0 || zzfjcVar.zzd == 0) {
            return pvw0.m173980g(new Exception("Caching is disabled."));
        }
        ovs0 ovs0VarM127700b = bxy0.m106924h().m127700b(this.f177943a, zzcei.m13612F(), this.f177948f);
        awv0 awv0VarMo112233a = this.f177946d.mo112233a(zzbzeVar, i);
        lcw0 lcw0VarMo100719c = awv0VarMo112233a.mo100719c();
        final hpr hprVarM194883v8 = m194883v8(zzbzeVar, lcw0VarMo100719c, awv0VarMo112233a);
        cew0 cew0VarMo100720d = awv0VarMo112233a.mo100720d();
        final rdw0 rdw0VarM176209a = qdw0.m176209a(this.f177943a, 9);
        final hpr hprVarM194882u8 = m194882u8(hprVarM194883v8, lcw0VarMo100719c, ovs0VarM127700b, cew0VarMo100720d, rdw0VarM176209a);
        return lcw0VarMo100719c.m120408a(zzflg.GET_URL_AND_CACHE_KEY, hprVarM194883v8, hprVarM194882u8).m171533a(new Callable() { // from class: l.l7v0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f130386a.m194888s8(hprVarM194882u8, hprVarM194883v8, zzbzeVar, rdw0VarM176209a);
            }
        }).m115303a();
    }

    /* JADX INFO: renamed from: p8 */
    public final hpr m194885p8(zzbze zzbzeVar, int i) {
        r7v0 r7v0VarM194889t8;
        mbw0 mbw0VarM115303a;
        ovs0 ovs0VarM127700b = bxy0.m106924h().m127700b(this.f177943a, zzcei.m13612F(), this.f177948f);
        awv0 awv0VarMo112233a = this.f177946d.mo112233a(zzbzeVar, i);
        evs0 evs0VarM169486a = ovs0VarM127700b.m169486a("google.afma.response.normalize", t7v0.f172471d, lvs0.f133730c);
        if (((Boolean) ojs0.f147710a.m149974e()).booleanValue()) {
            r7v0VarM194889t8 = m194889t8(zzbzeVar.zzh);
            if (r7v0VarM194889t8 == null) {
                d2v0.m113737k("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzbzeVar.zzj;
            r7v0VarM194889t8 = null;
            if (str != null && !str.isEmpty()) {
                d2v0.m113737k("Request contained a PoolKey but split request is disabled.");
            }
        }
        rdw0 rdw0VarM176209a = r7v0VarM194889t8 == null ? qdw0.m176209a(this.f177943a, 9) : r7v0VarM194889t8.f161646e;
        cew0 cew0VarMo100720d = awv0VarMo112233a.mo100720d();
        cew0VarMo100720d.m109464d(zzbzeVar.zza.getStringArrayList("ad_types"));
        q8v0 q8v0Var = new q8v0(zzbzeVar.zzg, cew0VarMo100720d, rdw0VarM176209a);
        n8v0 n8v0Var = new n8v0(this.f177943a, zzbzeVar.zzb.zza, this.f177949g, i);
        lcw0 lcw0VarMo100719c = awv0VarMo112233a.mo100719c();
        rdw0 rdw0VarM176209a2 = qdw0.m176209a(this.f177943a, 11);
        if (r7v0VarM194889t8 == null) {
            final hpr hprVarM194883v8 = m194883v8(zzbzeVar, lcw0VarMo100719c, awv0VarMo112233a);
            final hpr hprVarM194882u8 = m194882u8(hprVarM194883v8, lcw0VarMo100719c, ovs0VarM127700b, cew0VarMo100720d, rdw0VarM176209a);
            rdw0 rdw0VarM176209a3 = qdw0.m176209a(this.f177943a, 10);
            final mbw0 mbw0VarM115303a2 = lcw0VarMo100719c.m120408a(zzflg.HTTP, hprVarM194882u8, hprVarM194883v8).m171533a(new Callable() { // from class: l.j7v0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new p8v0((JSONObject) hprVarM194883v8.get(), (s4t0) hprVarM194882u8.get());
                }
            }).m115307e(q8v0Var).m115307e(new xdw0(rdw0VarM176209a3)).m115307e(n8v0Var).m115303a();
            bew0.m103785a(mbw0VarM115303a2, cew0VarMo100720d, rdw0VarM176209a3);
            bew0.m103788d(mbw0VarM115303a2, rdw0VarM176209a2);
            mbw0VarM115303a = lcw0VarMo100719c.m120408a(zzflg.PRE_PROCESS, hprVarM194883v8, hprVarM194882u8, mbw0VarM115303a2).m171533a(new Callable() { // from class: l.k7v0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new t7v0((h8v0) mbw0VarM115303a2.get(), (JSONObject) hprVarM194883v8.get(), (s4t0) hprVarM194882u8.get());
                }
            }).m115308f(evs0VarM169486a).m115303a();
        } else {
            p8v0 p8v0Var = new p8v0(r7v0VarM194889t8.f161643b, r7v0VarM194889t8.f161642a);
            rdw0 rdw0VarM176209a4 = qdw0.m176209a(this.f177943a, 10);
            final mbw0 mbw0VarM115303a3 = lcw0VarMo100719c.m120409b(zzflg.HTTP, pvw0.m173981h(p8v0Var)).m115307e(q8v0Var).m115307e(new xdw0(rdw0VarM176209a4)).m115307e(n8v0Var).m115303a();
            bew0.m103785a(mbw0VarM115303a3, cew0VarMo100720d, rdw0VarM176209a4);
            final hpr hprVarM173981h = pvw0.m173981h(r7v0VarM194889t8);
            bew0.m103788d(mbw0VarM115303a3, rdw0VarM176209a2);
            mbw0VarM115303a = lcw0VarMo100719c.m120408a(zzflg.PRE_PROCESS, mbw0VarM115303a3, hprVarM173981h).m171533a(new Callable() { // from class: l.c7v0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    h8v0 h8v0Var = (h8v0) mbw0VarM115303a3.get();
                    hpr hprVar = hprVarM173981h;
                    return new t7v0(h8v0Var, ((r7v0) hprVar.get()).f161643b, ((r7v0) hprVar.get()).f161642a);
                }
            }).m115308f(evs0VarM169486a).m115303a();
        }
        bew0.m103785a(mbw0VarM115303a, cew0VarMo100720d, rdw0VarM176209a2);
        return mbw0VarM115303a;
    }

    @Override // p153l.t3t0
    /* JADX INFO: renamed from: q3 */
    public final void mo179707q3(zzbze zzbzeVar, n4t0 n4t0Var) {
        m194891x8(m194884o8(zzbzeVar, Binder.getCallingUid()), n4t0Var);
    }

    /* JADX INFO: renamed from: q8 */
    public final hpr m194886q8(zzbze zzbzeVar, int i) {
        ovs0 ovs0VarM127700b = bxy0.m106924h().m127700b(this.f177943a, zzcei.m13612F(), this.f177948f);
        if (!((Boolean) tjs0.f174612a.m149974e()).booleanValue()) {
            return pvw0.m173980g(new Exception("Signal collection disabled."));
        }
        awv0 awv0VarMo112233a = this.f177946d.mo112233a(zzbzeVar, i);
        final zuv0 zuv0VarMo100717a = awv0VarMo112233a.mo100717a();
        evs0 evs0VarM169486a = ovs0VarM127700b.m169486a("google.afma.request.getSignals", lvs0.f133729b, lvs0.f133730c);
        rdw0 rdw0VarM176209a = qdw0.m176209a(this.f177943a, 22);
        mbw0 mbw0VarM115303a = awv0VarMo112233a.mo100719c().m120409b(zzflg.GET_SIGNALS, pvw0.m173981h(zzbzeVar.zza)).m115307e(new xdw0(rdw0VarM176209a)).m115308f(new xuw0() { // from class: l.o7v0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) throws JSONException {
                return zuv0VarMo100717a.m221730a(k6s0.m148569b().m167055j((Bundle) obj));
            }
        }).m115304b(zzflg.JS_SIGNALS).m115308f(evs0VarM169486a).m115303a();
        cew0 cew0VarMo100720d = awv0VarMo112233a.mo100720d();
        cew0VarMo100720d.m109464d(zzbzeVar.zza.getStringArrayList("ad_types"));
        bew0.m103786b(mbw0VarM115303a, cew0VarMo100720d, rdw0VarM176209a);
        if (((Boolean) hjs0.f110321e.m149974e()).booleanValue()) {
            r8v0 r8v0Var = this.f177945c;
            Objects.requireNonNull(r8v0Var);
            mbw0VarM115303a.addListener(new m7v0(r8v0Var), this.f177944b);
        }
        return mbw0VarM115303a;
    }

    @Override // p153l.t3t0
    /* JADX INFO: renamed from: r1 */
    public final void mo179708r1(String str, n4t0 n4t0Var) {
        m194891x8(m194887r8(str), n4t0Var);
    }

    /* JADX INFO: renamed from: r8 */
    public final hpr m194887r8(String str) {
        if (((Boolean) ojs0.f147710a.m149974e()).booleanValue()) {
            return m194889t8(str) == null ? pvw0.m173980g(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : pvw0.m173981h(new p7v0(this));
        }
        return pvw0.m173980g(new Exception("Split request is disabled."));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s8 */
    public final /* synthetic */ InputStream m194888s8(hpr hprVar, hpr hprVar2, zzbze zzbzeVar, rdw0 rdw0Var) throws Exception {
        String strM184591c = ((s4t0) hprVar.get()).m184591c();
        m194890w8(new r7v0((s4t0) hprVar.get(), (JSONObject) hprVar2.get(), zzbzeVar.zzh, strM184591c, rdw0Var));
        return new ByteArrayInputStream(strM184591c.getBytes(cow0.f82931c));
    }

    @Nullable
    /* JADX INFO: renamed from: t8 */
    public final synchronized r7v0 m194889t8(String str) {
        Iterator it = this.f177947e.iterator();
        while (it.hasNext()) {
            r7v0 r7v0Var = (r7v0) it.next();
            if (r7v0Var.f161644c.equals(str)) {
                it.remove();
                return r7v0Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w8 */
    public final synchronized void m194890w8(r7v0 r7v0Var) {
        zzo();
        this.f177947e.addLast(r7v0Var);
    }

    /* JADX INFO: renamed from: x8 */
    public final void m194891x8(hpr hprVar, n4t0 n4t0Var) {
        pvw0.m173991r(pvw0.m173987n(hprVar, new xuw0() { // from class: l.b7v0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return pvw0.m173981h(u8w0.m195070a((InputStream) obj));
            }
        }, oct0.f146733a), new q7v0(this, n4t0Var), oct0.f146738f);
    }
}
