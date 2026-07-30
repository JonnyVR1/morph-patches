package p149l;

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
public final class oyu0 extends mus0 {

    /* JADX INFO: renamed from: a */
    public final Context f146353a;

    /* JADX INFO: renamed from: b */
    public final rmw0 f146354b;

    /* JADX INFO: renamed from: c */
    public final lzu0 f146355c;

    /* JADX INFO: renamed from: d */
    public final wit0 f146356d;

    /* JADX INFO: renamed from: e */
    public final ArrayDeque f146357e;

    /* JADX INFO: renamed from: f */
    public final b5w0 f146358f;

    /* JADX INFO: renamed from: g */
    public final vvs0 f146359g;

    /* JADX INFO: renamed from: h */
    public final izu0 f146360h;

    public oyu0(Context context, rmw0 rmw0Var, vvs0 vvs0Var, wit0 wit0Var, lzu0 lzu0Var, ArrayDeque arrayDeque, izu0 izu0Var, b5w0 b5w0Var) {
        m7s0.m153417a(context);
        this.f146353a = context;
        this.f146354b = rmw0Var;
        this.f146359g = vvs0Var;
        this.f146355c = lzu0Var;
        this.f146356d = wit0Var;
        this.f146357e = arrayDeque;
        this.f146360h = izu0Var;
        this.f146358f = b5w0Var;
    }

    /* JADX INFO: renamed from: u8 */
    public static gnr m166700u8(gnr gnrVar, f3w0 f3w0Var, ims0 ims0Var, w4w0 w4w0Var, l4w0 l4w0Var) {
        yls0 yls0VarM137088a = ims0Var.m137088a("AFMA_getAdDictionary", fms0.f98370b, new ams0() { // from class: l.hyu0
            @Override // p149l.ams0
            /* JADX INFO: renamed from: a */
            public final Object mo97686a(JSONObject jSONObject) {
                return new mvs0(jSONObject);
            }
        });
        v4w0.m197068d(gnrVar, l4w0Var);
        g2w0 g2w0VarM206873a = f3w0Var.m212753b(zzflg.BUILD_URL, gnrVar).m206878f(yls0VarM137088a).m206873a();
        v4w0.m197067c(g2w0VarM206873a, w4w0Var, l4w0Var);
        return g2w0VarM206873a;
    }

    /* JADX INFO: renamed from: v8 */
    public static gnr m166701v8(zzbze zzbzeVar, f3w0 f3w0Var, final umv0 umv0Var) {
        rlw0 rlw0Var = new rlw0() { // from class: l.xxu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return umv0Var.mo168410b().m189627a(exr0.m118703b().m134102j((Bundle) obj));
            }
        };
        return f3w0Var.m212753b(zzflg.GMS_SIGNALS, jmw0.m142235h(zzbzeVar.zza)).m206878f(rlw0Var).m206877e(new e2w0() { // from class: l.cyu0
            @Override // p149l.e2w0
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                xsu0.m210834k("Ad request signals:");
                xsu0.m210834k(jSONObject.toString(2));
                return jSONObject;
            }
        }).m206873a();
    }

    private final synchronized void zzo() {
        int iIntValue = ((Long) ias0.f112321c.m115379e()).intValue();
        while (this.f146357e.size() >= iIntValue) {
            this.f146357e.removeFirst();
        }
    }

    @Override // p149l.nus0
    /* JADX INFO: renamed from: L3 */
    public final void mo151818L3(zzbze zzbzeVar, hvs0 hvs0Var) {
        gnr gnrVarM166703p8 = m166703p8(zzbzeVar, Binder.getCallingUid());
        m166709x8(gnrVarM166703p8, hvs0Var);
        if (((Boolean) bas0.f74718c.m115379e()).booleanValue()) {
            lzu0 lzu0Var = this.f146355c;
            Objects.requireNonNull(lzu0Var);
            gnrVarM166703p8.addListener(new gyu0(lzu0Var), this.f146354b);
        }
    }

    @Override // p149l.nus0
    /* JADX INFO: renamed from: c3 */
    public final void mo151819c3(zzbze zzbzeVar, hvs0 hvs0Var) {
        m166709x8(m166704q8(zzbzeVar, Binder.getCallingUid()), hvs0Var);
    }

    /* JADX INFO: renamed from: o8 */
    public final gnr m166702o8(final zzbze zzbzeVar, int i) {
        if (!((Boolean) ias0.f112319a.m115379e()).booleanValue()) {
            return jmw0.m142234g(new Exception("Split request is disabled."));
        }
        zzfjc zzfjcVar = zzbzeVar.zzi;
        if (zzfjcVar == null) {
            return jmw0.m142234g(new Exception("Pool configuration missing from request."));
        }
        if (zzfjcVar.zzc == 0 || zzfjcVar.zzd == 0) {
            return jmw0.m142234g(new Exception("Caching is disabled."));
        }
        ims0 ims0VarM219292b = vny0.m199070h().m219292b(this.f146353a, zzcei.m13558F(), this.f146358f);
        umv0 umv0VarMo203355a = this.f146356d.mo203355a(zzbzeVar, i);
        f3w0 f3w0VarMo168411c = umv0VarMo203355a.mo168411c();
        final gnr gnrVarM166701v8 = m166701v8(zzbzeVar, f3w0VarMo168411c, umv0VarMo203355a);
        w4w0 w4w0VarMo168412d = umv0VarMo203355a.mo168412d();
        final l4w0 l4w0VarM144514a = k4w0.m144514a(this.f146353a, 9);
        final gnr gnrVarM166700u8 = m166700u8(gnrVarM166701v8, f3w0VarMo168411c, ims0VarM219292b, w4w0VarMo168412d, l4w0VarM144514a);
        return f3w0VarMo168411c.m212752a(zzflg.GET_URL_AND_CACHE_KEY, gnrVarM166701v8, gnrVarM166700u8).m139497a(new Callable() { // from class: l.fyu0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f99902a.m166706s8(gnrVarM166700u8, gnrVarM166701v8, zzbzeVar, l4w0VarM144514a);
            }
        }).m206873a();
    }

    /* JADX INFO: renamed from: p8 */
    public final gnr m166703p8(zzbze zzbzeVar, int i) {
        lyu0 lyu0VarM166707t8;
        g2w0 g2w0VarM206873a;
        ims0 ims0VarM219292b = vny0.m199070h().m219292b(this.f146353a, zzcei.m13558F(), this.f146358f);
        umv0 umv0VarMo203355a = this.f146356d.mo203355a(zzbzeVar, i);
        yls0 yls0VarM137088a = ims0VarM219292b.m137088a("google.afma.response.normalize", nyu0.f141162d, fms0.f98371c);
        if (((Boolean) ias0.f112319a.m115379e()).booleanValue()) {
            lyu0VarM166707t8 = m166707t8(zzbzeVar.zzh);
            if (lyu0VarM166707t8 == null) {
                xsu0.m210834k("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzbzeVar.zzj;
            lyu0VarM166707t8 = null;
            if (str != null && !str.isEmpty()) {
                xsu0.m210834k("Request contained a PoolKey but split request is disabled.");
            }
        }
        l4w0 l4w0VarM144514a = lyu0VarM166707t8 == null ? k4w0.m144514a(this.f146353a, 9) : lyu0VarM166707t8.f130608e;
        w4w0 w4w0VarMo168412d = umv0VarMo203355a.mo168412d();
        w4w0VarMo168412d.m201586d(zzbzeVar.zza.getStringArrayList("ad_types"));
        kzu0 kzu0Var = new kzu0(zzbzeVar.zzg, w4w0VarMo168412d, l4w0VarM144514a);
        hzu0 hzu0Var = new hzu0(this.f146353a, zzbzeVar.zzb.zza, this.f146359g, i);
        f3w0 f3w0VarMo168411c = umv0VarMo203355a.mo168411c();
        l4w0 l4w0VarM144514a2 = k4w0.m144514a(this.f146353a, 11);
        if (lyu0VarM166707t8 == null) {
            final gnr gnrVarM166701v8 = m166701v8(zzbzeVar, f3w0VarMo168411c, umv0VarMo203355a);
            final gnr gnrVarM166700u8 = m166700u8(gnrVarM166701v8, f3w0VarMo168411c, ims0VarM219292b, w4w0VarMo168412d, l4w0VarM144514a);
            l4w0 l4w0VarM144514a3 = k4w0.m144514a(this.f146353a, 10);
            final g2w0 g2w0VarM206873a2 = f3w0VarMo168411c.m212752a(zzflg.HTTP, gnrVarM166700u8, gnrVarM166701v8).m139497a(new Callable() { // from class: l.dyu0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new jzu0((JSONObject) gnrVarM166701v8.get(), (mvs0) gnrVarM166700u8.get());
                }
            }).m206877e(kzu0Var).m206877e(new r4w0(l4w0VarM144514a3)).m206877e(hzu0Var).m206873a();
            v4w0.m197065a(g2w0VarM206873a2, w4w0VarMo168412d, l4w0VarM144514a3);
            v4w0.m197068d(g2w0VarM206873a2, l4w0VarM144514a2);
            g2w0VarM206873a = f3w0VarMo168411c.m212752a(zzflg.PRE_PROCESS, gnrVarM166701v8, gnrVarM166700u8, g2w0VarM206873a2).m139497a(new Callable() { // from class: l.eyu0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new nyu0((bzu0) g2w0VarM206873a2.get(), (JSONObject) gnrVarM166701v8.get(), (mvs0) gnrVarM166700u8.get());
                }
            }).m206878f(yls0VarM137088a).m206873a();
        } else {
            jzu0 jzu0Var = new jzu0(lyu0VarM166707t8.f130605b, lyu0VarM166707t8.f130604a);
            l4w0 l4w0VarM144514a4 = k4w0.m144514a(this.f146353a, 10);
            final g2w0 g2w0VarM206873a3 = f3w0VarMo168411c.m212753b(zzflg.HTTP, jmw0.m142235h(jzu0Var)).m206877e(kzu0Var).m206877e(new r4w0(l4w0VarM144514a4)).m206877e(hzu0Var).m206873a();
            v4w0.m197065a(g2w0VarM206873a3, w4w0VarMo168412d, l4w0VarM144514a4);
            final gnr gnrVarM142235h = jmw0.m142235h(lyu0VarM166707t8);
            v4w0.m197068d(g2w0VarM206873a3, l4w0VarM144514a2);
            g2w0VarM206873a = f3w0VarMo168411c.m212752a(zzflg.PRE_PROCESS, g2w0VarM206873a3, gnrVarM142235h).m139497a(new Callable() { // from class: l.wxu0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    bzu0 bzu0Var = (bzu0) g2w0VarM206873a3.get();
                    gnr gnrVar = gnrVarM142235h;
                    return new nyu0(bzu0Var, ((lyu0) gnrVar.get()).f130605b, ((lyu0) gnrVar.get()).f130604a);
                }
            }).m206878f(yls0VarM137088a).m206873a();
        }
        v4w0.m197065a(g2w0VarM206873a, w4w0VarMo168412d, l4w0VarM144514a2);
        return g2w0VarM206873a;
    }

    @Override // p149l.nus0
    /* JADX INFO: renamed from: q3 */
    public final void mo151820q3(zzbze zzbzeVar, hvs0 hvs0Var) {
        m166709x8(m166702o8(zzbzeVar, Binder.getCallingUid()), hvs0Var);
    }

    /* JADX INFO: renamed from: q8 */
    public final gnr m166704q8(zzbze zzbzeVar, int i) {
        ims0 ims0VarM219292b = vny0.m199070h().m219292b(this.f146353a, zzcei.m13558F(), this.f146358f);
        if (!((Boolean) nas0.f137970a.m115379e()).booleanValue()) {
            return jmw0.m142234g(new Exception("Signal collection disabled."));
        }
        umv0 umv0VarMo203355a = this.f146356d.mo203355a(zzbzeVar, i);
        final tlv0 tlv0VarMo168409a = umv0VarMo203355a.mo168409a();
        yls0 yls0VarM137088a = ims0VarM219292b.m137088a("google.afma.request.getSignals", fms0.f98370b, fms0.f98371c);
        l4w0 l4w0VarM144514a = k4w0.m144514a(this.f146353a, 22);
        g2w0 g2w0VarM206873a = umv0VarMo203355a.mo168411c().m212753b(zzflg.GET_SIGNALS, jmw0.m142235h(zzbzeVar.zza)).m206877e(new r4w0(l4w0VarM144514a)).m206878f(new rlw0() { // from class: l.iyu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) throws JSONException {
                return tlv0VarMo168409a.m189627a(exr0.m118703b().m134102j((Bundle) obj));
            }
        }).m206874b(zzflg.JS_SIGNALS).m206878f(yls0VarM137088a).m206873a();
        w4w0 w4w0VarMo168412d = umv0VarMo203355a.mo168412d();
        w4w0VarMo168412d.m201586d(zzbzeVar.zza.getStringArrayList("ad_types"));
        v4w0.m197066b(g2w0VarM206873a, w4w0VarMo168412d, l4w0VarM144514a);
        if (((Boolean) bas0.f74720e.m115379e()).booleanValue()) {
            lzu0 lzu0Var = this.f146355c;
            Objects.requireNonNull(lzu0Var);
            g2w0VarM206873a.addListener(new gyu0(lzu0Var), this.f146354b);
        }
        return g2w0VarM206873a;
    }

    @Override // p149l.nus0
    /* JADX INFO: renamed from: r1 */
    public final void mo151821r1(String str, hvs0 hvs0Var) {
        m166709x8(m166705r8(str), hvs0Var);
    }

    /* JADX INFO: renamed from: r8 */
    public final gnr m166705r8(String str) {
        if (((Boolean) ias0.f112319a.m115379e()).booleanValue()) {
            return m166707t8(str) == null ? jmw0.m142234g(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : jmw0.m142235h(new jyu0(this));
        }
        return jmw0.m142234g(new Exception("Split request is disabled."));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s8 */
    public final /* synthetic */ InputStream m166706s8(gnr gnrVar, gnr gnrVar2, zzbze zzbzeVar, l4w0 l4w0Var) throws Exception {
        String strM156596c = ((mvs0) gnrVar.get()).m156596c();
        m166708w8(new lyu0((mvs0) gnrVar.get(), (JSONObject) gnrVar2.get(), zzbzeVar.zzh, strM156596c, l4w0Var));
        return new ByteArrayInputStream(strM156596c.getBytes(wew0.f185990c));
    }

    @Nullable
    /* JADX INFO: renamed from: t8 */
    public final synchronized lyu0 m166707t8(String str) {
        Iterator it = this.f146357e.iterator();
        while (it.hasNext()) {
            lyu0 lyu0Var = (lyu0) it.next();
            if (lyu0Var.f130606c.equals(str)) {
                it.remove();
                return lyu0Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w8 */
    public final synchronized void m166708w8(lyu0 lyu0Var) {
        zzo();
        this.f146357e.addLast(lyu0Var);
    }

    /* JADX INFO: renamed from: x8 */
    public final void m166709x8(gnr gnrVar, hvs0 hvs0Var) {
        jmw0.m142245r(jmw0.m142241n(gnrVar, new rlw0() { // from class: l.vxu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return jmw0.m142235h(ozv0.m166891a((InputStream) obj));
            }
        }, i3t0.f111372a), new kyu0(this, hvs0Var), i3t0.f111377f);
    }
}
