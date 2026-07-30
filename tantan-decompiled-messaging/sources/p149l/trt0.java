package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzflg;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class trt0 {

    /* JADX INFO: renamed from: a */
    public final zuu0 f171846a;

    /* JADX INFO: renamed from: b */
    public final iyv0 f171847b;

    /* JADX INFO: renamed from: c */
    public final f3w0 f171848c;

    /* JADX INFO: renamed from: d */
    public final xit0 f171849d;

    /* JADX INFO: renamed from: e */
    public final e8v0 f171850e;

    /* JADX INFO: renamed from: f */
    public final v3u0 f171851f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public vxv0 f171852g;

    /* JADX INFO: renamed from: h */
    public final jwu0 f171853h;

    /* JADX INFO: renamed from: i */
    public final gwt0 f171854i;

    /* JADX INFO: renamed from: j */
    public final Executor f171855j;

    /* JADX INFO: renamed from: k */
    public final wvu0 f171856k;

    /* JADX INFO: renamed from: l */
    public final n3v0 f171857l;

    /* JADX INFO: renamed from: m */
    public final exu0 f171858m;

    /* JADX INFO: renamed from: n */
    public final lxu0 f171859n;

    public trt0(zuu0 zuu0Var, iyv0 iyv0Var, f3w0 f3w0Var, xit0 xit0Var, e8v0 e8v0Var, v3u0 v3u0Var, @Nullable vxv0 vxv0Var, jwu0 jwu0Var, gwt0 gwt0Var, Executor executor, wvu0 wvu0Var, n3v0 n3v0Var, exu0 exu0Var, lxu0 lxu0Var) {
        this.f171846a = zuu0Var;
        this.f171847b = iyv0Var;
        this.f171848c = f3w0Var;
        this.f171849d = xit0Var;
        this.f171850e = e8v0Var;
        this.f171851f = v3u0Var;
        this.f171852g = vxv0Var;
        this.f171853h = jwu0Var;
        this.f171854i = gwt0Var;
        this.f171855j = executor;
        this.f171856k = wvu0Var;
        this.f171857l = n3v0Var;
        this.f171858m = exu0Var;
        this.f171859n = lxu0Var;
    }

    /* JADX INFO: renamed from: a */
    public final zze m190437a(Throwable th) {
        return pzv0.m172254b(th, this.f171857l);
    }

    /* JADX INFO: renamed from: c */
    public final v3u0 m190438c() {
        return this.f171851f;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vxv0 m190439d(vxv0 vxv0Var) throws Exception {
        this.f171849d.m209678a(vxv0Var);
        return vxv0Var;
    }

    /* JADX INFO: renamed from: e */
    public final gnr m190440e(final zzfjc zzfjcVar) {
        g2w0 g2w0VarM206873a = this.f171848c.m212753b(zzflg.GET_CACHE_KEY, this.f171854i.m128514c()).m206878f(new rlw0() { // from class: l.prt0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return this.f150947a.m190441f(zzfjcVar, (zzbze) obj);
            }
        }).m206873a();
        jmw0.m142245r(g2w0VarM206873a, new rrt0(this), this.f171855j);
        return g2w0VarM206873a;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ gnr m190441f(zzfjc zzfjcVar, zzbze zzbzeVar) throws Exception {
        zzbzeVar.zzi = zzfjcVar;
        return this.f171853h.m143673a(zzbzeVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ gnr m190442g(gnr gnrVar, gnr gnrVar2, gnr gnrVar3) throws Exception {
        return this.f171859n.m152093c((zzbze) gnrVar.get(), (JSONObject) gnrVar2.get(), (mvs0) gnrVar3.get());
    }

    /* JADX INFO: renamed from: h */
    public final gnr m190443h(zzbze zzbzeVar) {
        g2w0 g2w0VarM206873a = this.f171848c.m212753b(zzflg.NOTIFY_CACHE_HIT, this.f171853h.m143679g(zzbzeVar)).m206873a();
        jmw0.m142245r(g2w0VarM206873a, new srt0(this), this.f171855j);
        return g2w0VarM206873a;
    }

    /* JADX INFO: renamed from: i */
    public final gnr m190444i(gnr gnrVar) {
        x2w0 x2w0VarM206878f = this.f171848c.m212753b(zzflg.RENDERER, gnrVar).m206877e(new e2w0() { // from class: l.krt0
            @Override // p149l.e2w0
            public final Object zza(Object obj) throws Exception {
                vxv0 vxv0Var = (vxv0) obj;
                this.f124394a.m190439d(vxv0Var);
                return vxv0Var;
            }
        }).m206878f(this.f171850e);
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132432v5)).booleanValue()) {
            x2w0VarM206878f = x2w0VarM206878f.m206881i(((Integer) d1s0.m109677c().m144697a(m7s0.f132456x5)).intValue(), TimeUnit.SECONDS);
        }
        return x2w0VarM206878f.m206873a();
    }

    /* JADX INFO: renamed from: j */
    public final gnr m190445j() {
        zzl zzlVar = this.f171847b.f115494d;
        if (zzlVar.zzx == null && zzlVar.zzs == null) {
            return m190446k(this.f171854i.m128514c());
        }
        f3w0 f3w0Var = this.f171848c;
        zuu0 zuu0Var = this.f171846a;
        return l2w0.m148323c(zuu0Var.m220259a(), zzflg.PRELOADED_LOADER, f3w0Var).m206873a();
    }

    /* JADX INFO: renamed from: k */
    public final gnr m190446k(final gnr gnrVar) {
        vxv0 vxv0Var = this.f171852g;
        if (vxv0Var != null) {
            return l2w0.m148323c(jmw0.m142235h(vxv0Var), zzflg.SERVER_TRANSACTION, this.f171848c).m206873a();
        }
        vny0.m199067e().m100030j();
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132107Va)).booleanValue() || ((Boolean) has0.f106825c.m115379e()).booleanValue()) {
            x2w0 x2w0VarM212753b = this.f171848c.m212753b(zzflg.SERVER_TRANSACTION, gnrVar);
            final wvu0 wvu0Var = this.f171856k;
            Objects.requireNonNull(wvu0Var);
            return x2w0VarM212753b.m206878f(new rlw0() { // from class: l.qrt0
                @Override // p149l.rlw0
                public final gnr zza(Object obj) {
                    return wvu0Var.mo196005a((zzbze) obj);
                }
            }).m206873a();
        }
        final exu0 exu0Var = this.f171858m;
        Objects.requireNonNull(exu0Var);
        final gnr gnrVarM142241n = jmw0.m142241n(gnrVar, new rlw0() { // from class: l.lrt0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return exu0Var.m118707a((zzbze) obj);
            }
        }, this.f171855j);
        x2w0 x2w0VarM212753b2 = this.f171848c.m212753b(zzflg.BUILD_URL, gnrVarM142241n);
        final jwu0 jwu0Var = this.f171853h;
        Objects.requireNonNull(jwu0Var);
        final g2w0 g2w0VarM206873a = x2w0VarM212753b2.m206878f(new rlw0() { // from class: l.mrt0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return jwu0Var.m143674b((JSONObject) obj);
            }
        }).m206873a();
        return this.f171848c.m212752a(zzflg.SERVER_TRANSACTION, gnrVar, gnrVarM142241n, g2w0VarM206873a).m139497a(new Callable() { // from class: l.nrt0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f140220a.m190442g(gnrVar, gnrVarM142241n, g2w0VarM206873a);
            }
        }).m206878f(new rlw0() { // from class: l.ort0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return (gnr) obj;
            }
        }).m206873a();
    }

    /* JADX INFO: renamed from: l */
    public final void m190447l(vxv0 vxv0Var) {
        this.f171852g = vxv0Var;
    }
}
