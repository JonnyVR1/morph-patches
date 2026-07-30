package p153l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzcab;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class y5w0 implements mmv0 {

    /* JADX INFO: renamed from: a */
    public final Context f197593a;

    /* JADX INFO: renamed from: b */
    public final Executor f197594b;

    /* JADX INFO: renamed from: c */
    public final dlt0 f197595c;

    /* JADX INFO: renamed from: d */
    public final o5w0 f197596d;

    /* JADX INFO: renamed from: e */
    public final y3w0 f197597e;

    /* JADX INFO: renamed from: f */
    public final c7w0 f197598f;

    /* JADX INFO: renamed from: g */
    public final hew0 f197599g;

    /* JADX INFO: renamed from: h */
    public final m7w0 f197600h;

    /* JADX INFO: renamed from: i */
    public hpr f197601i;

    public y5w0(Context context, Executor executor, dlt0 dlt0Var, y3w0 y3w0Var, o5w0 o5w0Var, m7w0 m7w0Var, c7w0 c7w0Var) {
        this.f197593a = context;
        this.f197594b = executor;
        this.f197595c = dlt0Var;
        this.f197597e = y3w0Var;
        this.f197596d = o5w0Var;
        this.f197600h = m7w0Var;
        this.f197598f = c7w0Var;
        this.f197599g = dlt0Var.mo116869D();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    @Override // p153l.mmv0
    /* JADX INFO: renamed from: a */
    public final boolean mo95567a(zzl zzlVar, String str, kmv0 kmv0Var, lmv0 lmv0Var) throws RemoteException {
        cew0 cew0Var;
        zzcab zzcabVar = new zzcab(zzlVar, str);
        if (zzcabVar.zzb == null) {
            dct0.m115295d("Ad unit ID should not be null for rewarded video ad.");
            this.f197594b.execute(new Runnable() { // from class: l.r5w0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f161412a.m214330h();
                }
            });
            return false;
        }
        hpr hprVar = this.f197601i;
        if (hprVar != null && !hprVar.isDone()) {
            return false;
        }
        if (((Boolean) ris0.f163391c.m149974e()).booleanValue()) {
            y3w0 y3w0Var = this.f197597e;
            if (y3w0Var.zzd() != null) {
                cew0 cew0VarZzh = ((psu0) y3w0Var.zzd()).zzh();
                cew0VarZzh.m109468h(5);
                cew0VarZzh.m109462b(zzcabVar.zza.zzp);
                cew0Var = cew0VarZzh;
            } else {
                cew0Var = null;
            }
        } else {
            cew0Var = null;
        }
        q8w0.m175827a(this.f197593a, zzcabVar.zza.zzf);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168080N8)).booleanValue() && zzcabVar.zza.zzf) {
            this.f197595c.mo116882p().m143049n(true);
        }
        m7w0 m7w0Var = this.f197600h;
        m7w0Var.m157315J(zzcabVar.zzb);
        m7w0Var.m157314I(zzq.m12308I());
        m7w0Var.m157327e(zzcabVar.zza);
        Context context = this.f197593a;
        o7w0 o7w0VarM157329g = m7w0Var.m157329g();
        rdw0 rdw0VarM176210b = qdw0.m176210b(context, bew0.m103790f(o7w0VarM157329g), 5, zzcabVar.zza);
        x5w0 x5w0Var = new x5w0(null);
        x5w0Var.f192537a = o7w0VarM157329g;
        hpr hprVarMo119326a = this.f197597e.mo119326a(new z3w0(x5w0Var, null), new x3w0() { // from class: l.s5w0
            @Override // p153l.x3w0
            /* JADX INFO: renamed from: a */
            public final o5u0 mo184819a(w3w0 w3w0Var) {
                return this.f166519a.m214332j(w3w0Var);
            }
        }, null);
        this.f197601i = hprVarMo119326a;
        pvw0.m173991r(hprVarMo119326a, new v5w0(this, lmv0Var, cew0Var, rdw0VarM176210b, x5w0Var), this.f197594b);
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m214330h() {
        this.f197596d.mo103145u(v8w0.m200327d(6, null, null));
    }

    /* JADX INFO: renamed from: i */
    public final void m214331i(int i) {
        this.f197600h.m157311F().m200154a(i);
    }

    /* JADX INFO: renamed from: j */
    public final osu0 m214332j(w3w0 w3w0Var) {
        osu0 osu0VarMo116880n = this.f197595c.mo116880n();
        q5u0 q5u0Var = new q5u0();
        q5u0Var.m175527e(this.f197593a);
        q5u0Var.m175531i(((x5w0) w3w0Var).f192537a);
        q5u0Var.m175530h(this.f197598f);
        osu0VarMo116880n.mo122066d(q5u0Var.m175532j());
        osu0VarMo116880n.mo122065a(new ldu0().m153819q());
        return osu0VarMo116880n;
    }

    @Override // p153l.mmv0
    public final boolean zza() {
        throw null;
    }
}
