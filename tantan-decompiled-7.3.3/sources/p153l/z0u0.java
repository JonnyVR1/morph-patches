package p153l;

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
public final class z0u0 {

    /* JADX INFO: renamed from: a */
    public final f4v0 f202391a;

    /* JADX INFO: renamed from: b */
    public final o7w0 f202392b;

    /* JADX INFO: renamed from: c */
    public final lcw0 f202393c;

    /* JADX INFO: renamed from: d */
    public final dst0 f202394d;

    /* JADX INFO: renamed from: e */
    public final khv0 f202395e;

    /* JADX INFO: renamed from: f */
    public final bdu0 f202396f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public b7w0 f202397g;

    /* JADX INFO: renamed from: h */
    public final p5v0 f202398h;

    /* JADX INFO: renamed from: i */
    public final m5u0 f202399i;

    /* JADX INFO: renamed from: j */
    public final Executor f202400j;

    /* JADX INFO: renamed from: k */
    public final c5v0 f202401k;

    /* JADX INFO: renamed from: l */
    public final tcv0 f202402l;

    /* JADX INFO: renamed from: m */
    public final k6v0 f202403m;

    /* JADX INFO: renamed from: n */
    public final r6v0 f202404n;

    public z0u0(f4v0 f4v0Var, o7w0 o7w0Var, lcw0 lcw0Var, dst0 dst0Var, khv0 khv0Var, bdu0 bdu0Var, @Nullable b7w0 b7w0Var, p5v0 p5v0Var, m5u0 m5u0Var, Executor executor, c5v0 c5v0Var, tcv0 tcv0Var, k6v0 k6v0Var, r6v0 r6v0Var) {
        this.f202391a = f4v0Var;
        this.f202392b = o7w0Var;
        this.f202393c = lcw0Var;
        this.f202394d = dst0Var;
        this.f202395e = khv0Var;
        this.f202396f = bdu0Var;
        this.f202397g = b7w0Var;
        this.f202398h = p5v0Var;
        this.f202399i = m5u0Var;
        this.f202400j = executor;
        this.f202401k = c5v0Var;
        this.f202402l = tcv0Var;
        this.f202403m = k6v0Var;
        this.f202404n = r6v0Var;
    }

    /* JADX INFO: renamed from: a */
    public final zze m218166a(Throwable th) {
        return v8w0.m200325b(th, this.f202402l);
    }

    /* JADX INFO: renamed from: c */
    public final bdu0 m218167c() {
        return this.f202396f;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ b7w0 m218168d(b7w0 b7w0Var) throws Exception {
        this.f202394d.m117777a(b7w0Var);
        return b7w0Var;
    }

    /* JADX INFO: renamed from: e */
    public final hpr m218169e(final zzfjc zzfjcVar) {
        mbw0 mbw0VarM115303a = this.f202393c.m120409b(zzflg.GET_CACHE_KEY, this.f202399i.m157126c()).m115308f(new xuw0() { // from class: l.v0u0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return this.f181900a.m218170f(zzfjcVar, (zzbze) obj);
            }
        }).m115303a();
        pvw0.m173991r(mbw0VarM115303a, new x0u0(this), this.f202400j);
        return mbw0VarM115303a;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ hpr m218170f(zzfjc zzfjcVar, zzbze zzbzeVar) throws Exception {
        zzbzeVar.zzi = zzfjcVar;
        return this.f202398h.m170683a(zzbzeVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ hpr m218171g(hpr hprVar, hpr hprVar2, hpr hprVar3) throws Exception {
        return this.f202404n.m180053c((zzbze) hprVar.get(), (JSONObject) hprVar2.get(), (s4t0) hprVar3.get());
    }

    /* JADX INFO: renamed from: h */
    public final hpr m218172h(zzbze zzbzeVar) {
        mbw0 mbw0VarM115303a = this.f202393c.m120409b(zzflg.NOTIFY_CACHE_HIT, this.f202398h.m170689g(zzbzeVar)).m115303a();
        pvw0.m173991r(mbw0VarM115303a, new y0u0(this), this.f202400j);
        return mbw0VarM115303a;
    }

    /* JADX INFO: renamed from: i */
    public final hpr m218173i(hpr hprVar) {
        dcw0 dcw0VarM115308f = this.f202393c.m120409b(zzflg.RENDERER, hprVar).m115307e(new kbw0() { // from class: l.q0u0
            @Override // p153l.kbw0
            public final Object zza(Object obj) throws Exception {
                b7w0 b7w0Var = (b7w0) obj;
                this.f155089a.m218168d(b7w0Var);
                return b7w0Var;
            }
        }).m115308f(this.f202395e);
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168503v5)).booleanValue()) {
            dcw0VarM115308f = dcw0VarM115308f.m115311i(((Integer) jas0.m144075c().m176505a(sgs0.f168527x5)).intValue(), TimeUnit.SECONDS);
        }
        return dcw0VarM115308f.m115303a();
    }

    /* JADX INFO: renamed from: j */
    public final hpr m218174j() {
        zzl zzlVar = this.f202392b.f145318d;
        if (zzlVar.zzx == null && zzlVar.zzs == null) {
            return m218175k(this.f202399i.m157126c());
        }
        lcw0 lcw0Var = this.f202393c;
        f4v0 f4v0Var = this.f202391a;
        return rbw0.m180767c(f4v0Var.m124043a(), zzflg.PRELOADED_LOADER, lcw0Var).m115303a();
    }

    /* JADX INFO: renamed from: k */
    public final hpr m218175k(final hpr hprVar) {
        b7w0 b7w0Var = this.f202397g;
        if (b7w0Var != null) {
            return rbw0.m180767c(pvw0.m173981h(b7w0Var), zzflg.SERVER_TRANSACTION, this.f202393c).m115303a();
        }
        bxy0.m106921e().m134425j();
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168178Va)).booleanValue() || ((Boolean) njs0.f142339c.m149974e()).booleanValue()) {
            dcw0 dcw0VarM120409b = this.f202393c.m120409b(zzflg.SERVER_TRANSACTION, hprVar);
            final c5v0 c5v0Var = this.f202401k;
            Objects.requireNonNull(c5v0Var);
            return dcw0VarM120409b.m115308f(new xuw0() { // from class: l.w0u0
                @Override // p153l.xuw0
                public final hpr zza(Object obj) {
                    return c5v0Var.mo95996a((zzbze) obj);
                }
            }).m115303a();
        }
        final k6v0 k6v0Var = this.f202403m;
        Objects.requireNonNull(k6v0Var);
        final hpr hprVarM173987n = pvw0.m173987n(hprVar, new xuw0() { // from class: l.r0u0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return k6v0Var.m148578a((zzbze) obj);
            }
        }, this.f202400j);
        dcw0 dcw0VarM120409b2 = this.f202393c.m120409b(zzflg.BUILD_URL, hprVarM173987n);
        final p5v0 p5v0Var = this.f202398h;
        Objects.requireNonNull(p5v0Var);
        final mbw0 mbw0VarM115303a = dcw0VarM120409b2.m115308f(new xuw0() { // from class: l.s0u0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return p5v0Var.m170684b((JSONObject) obj);
            }
        }).m115303a();
        return this.f202393c.m120408a(zzflg.SERVER_TRANSACTION, hprVar, hprVarM173987n, mbw0VarM115303a).m171533a(new Callable() { // from class: l.t0u0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f171561a.m218171g(hprVar, hprVarM173987n, mbw0VarM115303a);
            }
        }).m115308f(new xuw0() { // from class: l.u0u0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return (hpr) obj;
            }
        }).m115303a();
    }

    /* JADX INFO: renamed from: l */
    public final void m218176l(b7w0 b7w0Var) {
        this.f202397g = b7w0Var;
    }
}
