package p149l;

import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.C2104b0;
import com.google.android.gms.internal.ads.C2288y;
import com.google.android.gms.internal.ads.C2296z;
import com.google.android.gms.internal.ads.zzead;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class stv0 implements suv0 {

    /* JADX INFO: renamed from: a */
    public final suv0 f166390a;

    /* JADX INFO: renamed from: b */
    public final suv0 f166391b;

    /* JADX INFO: renamed from: c */
    public final b1w0 f166392c;

    /* JADX INFO: renamed from: d */
    public final String f166393d;

    /* JADX INFO: renamed from: e */
    public jwt0 f166394e;

    /* JADX INFO: renamed from: f */
    public final Executor f166395f;

    public stv0(suv0 suv0Var, suv0 suv0Var2, b1w0 b1w0Var, String str, Executor executor) {
        this.f166390a = suv0Var;
        this.f166391b = suv0Var2;
        this.f166392c = b1w0Var;
        this.f166393d = str;
        this.f166395f = executor;
    }

    @Override // p149l.suv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ gnr mo104000a(tuv0 tuv0Var, ruv0 ruv0Var, Object obj) {
        return m185978e(tuv0Var, ruv0Var, null);
    }

    @Override // p149l.suv0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized jwt0 zzd() {
        return this.f166394e;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gnr m185976c(tuv0 tuv0Var, rtv0 rtv0Var, ruv0 ruv0Var, jwt0 jwt0Var, xtv0 xtv0Var) throws Exception {
        if (xtv0Var != null) {
            rtv0 rtv0Var2 = new rtv0(rtv0Var.f160999a, rtv0Var.f161000b, rtv0Var.f161001c, rtv0Var.f161002d, rtv0Var.f161003e, rtv0Var.f161004f, xtv0Var.f194439a);
            if (xtv0Var.f194441c != null) {
                this.f166394e = null;
                this.f166392c.m99882e(rtv0Var2);
                return m185979f(xtv0Var.f194441c, tuv0Var);
            }
            gnr gnrVarM99881a = this.f166392c.m99881a(rtv0Var2);
            if (gnrVarM99881a != null) {
                this.f166394e = null;
                return jmw0.m142241n(gnrVarM99881a, new rlw0() { // from class: l.otv0
                    @Override // p149l.rlw0
                    public final gnr zza(Object obj) {
                        return this.f145632a.m185977d((y0w0) obj);
                    }
                }, this.f166395f);
            }
            this.f166392c.m99882e(rtv0Var2);
            tuv0Var = new tuv0(tuv0Var.f172226b, xtv0Var.f194440b);
        }
        gnr gnrVarM108813c = ((cuv0) this.f166390a).m108813c(tuv0Var, ruv0Var, jwt0Var);
        this.f166394e = jwt0Var;
        return gnrVarM108813c;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gnr m185977d(y0w0 y0w0Var) throws Exception {
        a1w0 a1w0Var;
        if (y0w0Var == null || y0w0Var.f195362a == null || (a1w0Var = y0w0Var.f195363b) == null) {
            throw new zzead(1, "Empty prefetch");
        }
        u3s0 u3s0VarM12527L = C2104b0.m12527L();
        t3s0 t3s0VarM13479L = C2288y.m13479L();
        t3s0VarM13479L.m187126t(2);
        t3s0VarM13479L.m187124r(C2296z.m13508N());
        u3s0VarM12527L.m191614q(t3s0VarM13479L);
        y0w0Var.f195362a.f141385a.zzb().m190438c().mo97688B((C2104b0) u3s0VarM12527L.m153521m());
        return m185979f(y0w0Var.f195362a, ((rtv0) a1w0Var).f161000b);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized gnr m185978e(final tuv0 tuv0Var, final ruv0 ruv0Var, jwt0 jwt0Var) {
        iwt0 iwt0VarMo156774a = ruv0Var.mo156774a(tuv0Var.f172226b);
        iwt0VarMo156774a.mo106786k(new ttv0(this.f166393d));
        final jwt0 jwt0Var2 = (jwt0) iwt0VarMo156774a.zzh();
        jwt0Var2.zzg();
        jwt0Var2.zzg();
        zzl zzlVar = jwt0Var2.zzg().f115494d;
        if (zzlVar.zzs != null || zzlVar.zzx != null) {
            this.f166394e = jwt0Var2;
            return ((cuv0) this.f166390a).m108813c(tuv0Var, ruv0Var, jwt0Var2);
        }
        iyv0 iyv0VarZzg = jwt0Var2.zzg();
        final rtv0 rtv0Var = new rtv0(ruv0Var, tuv0Var, iyv0VarZzg.f115494d, iyv0VarZzg.f115496f, this.f166395f, iyv0VarZzg.f115500j, null);
        return jmw0.m142241n(amw0.m97696C(((ytv0) this.f166391b).m216087c(tuv0Var, ruv0Var, jwt0Var2)), new rlw0() { // from class: l.ptv0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return this.f151221a.m185976c(tuv0Var, rtv0Var, ruv0Var, jwt0Var2, (xtv0) obj);
            }
        }, this.f166395f);
    }

    /* JADX INFO: renamed from: f */
    public final gnr m185979f(o0w0 o0w0Var, tuv0 tuv0Var) {
        jwt0 jwt0Var = o0w0Var.f141385a;
        this.f166394e = jwt0Var;
        if (o0w0Var.f141387c != null) {
            if (jwt0Var.zzf() != null) {
                o0w0Var.f141387c.m117801g().mo138773q(o0w0Var.f141385a.zzf());
            }
            return jmw0.m142235h(o0w0Var.f141387c);
        }
        jwt0Var.zzb().m190447l(o0w0Var.f141386b);
        return ((cuv0) this.f166390a).m108813c(tuv0Var, null, o0w0Var.f141385a);
    }
}
