package p153l;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class k4w0 implements mmv0 {

    /* JADX INFO: renamed from: a */
    public final Context f123939a;

    /* JADX INFO: renamed from: b */
    public final Executor f123940b;

    /* JADX INFO: renamed from: c */
    public final dlt0 f123941c;

    /* JADX INFO: renamed from: d */
    public final wlv0 f123942d;

    /* JADX INFO: renamed from: e */
    public final o5w0 f123943e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public yhs0 f123944f;

    /* JADX INFO: renamed from: g */
    public final hew0 f123945g;

    /* JADX INFO: renamed from: h */
    public final m7w0 f123946h;

    /* JADX INFO: renamed from: i */
    public hpr f123947i;

    public k4w0(Context context, Executor executor, dlt0 dlt0Var, wlv0 wlv0Var, o5w0 o5w0Var, m7w0 m7w0Var) {
        this.f123939a = context;
        this.f123940b = executor;
        this.f123941c = dlt0Var;
        this.f123942d = wlv0Var;
        this.f123946h = m7w0Var;
        this.f123943e = o5w0Var;
        this.f123945g = dlt0Var.mo116869D();
    }

    @Override // p153l.mmv0
    /* JADX INFO: renamed from: a */
    public final boolean mo95567a(zzl zzlVar, String str, kmv0 kmv0Var, lmv0 lmv0Var) {
        piu0 piu0VarZzf;
        cew0 cew0VarMo150796d;
        if (str == null) {
            dct0.m115295d("Ad unit ID should not be null for interstitial ad.");
            this.f123940b.execute(new Runnable() { // from class: l.e4w0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f92162a.m148305g();
                }
            });
            return false;
        }
        if (zza()) {
            return false;
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168080N8)).booleanValue() && zzlVar.zzf) {
            this.f123941c.mo116882p().m143049n(true);
        }
        zzq zzqVar = ((d4w0) kmv0Var).f85082a;
        m7w0 m7w0Var = this.f123946h;
        m7w0Var.m157315J(str);
        m7w0Var.m157314I(zzqVar);
        m7w0Var.m157327e(zzlVar);
        Context context = this.f123939a;
        o7w0 o7w0VarM157329g = m7w0Var.m157329g();
        rdw0 rdw0VarM176210b = qdw0.m176210b(context, bew0.m103790f(o7w0VarM157329g), 4, zzlVar);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168249b8)).booleanValue()) {
            oiu0 oiu0VarMo116878l = this.f123941c.mo116878l();
            q5u0 q5u0Var = new q5u0();
            q5u0Var.m175527e(this.f123939a);
            q5u0Var.m175531i(o7w0VarM157329g);
            oiu0VarMo116878l.mo141542n(q5u0Var.m175532j());
            ldu0 ldu0Var = new ldu0();
            ldu0Var.m153815m(this.f123942d, this.f123940b);
            ldu0Var.m153816n(this.f123942d, this.f123940b);
            oiu0VarMo116878l.mo141540i(ldu0Var.m153819q());
            oiu0VarMo116878l.mo141541m(new ujv0(this.f123944f));
            piu0VarZzf = oiu0VarMo116878l.zzh();
        } else {
            ldu0 ldu0Var2 = new ldu0();
            o5w0 o5w0Var = this.f123943e;
            if (o5w0Var != null) {
                ldu0Var2.m153810h(o5w0Var, this.f123940b);
                ldu0Var2.m153811i(this.f123943e, this.f123940b);
                ldu0Var2.m153807e(this.f123943e, this.f123940b);
            }
            oiu0 oiu0VarMo116878l2 = this.f123941c.mo116878l();
            q5u0 q5u0Var2 = new q5u0();
            q5u0Var2.m175527e(this.f123939a);
            q5u0Var2.m175531i(o7w0VarM157329g);
            oiu0VarMo116878l2.mo141542n(q5u0Var2.m175532j());
            ldu0Var2.m153815m(this.f123942d, this.f123940b);
            ldu0Var2.m153810h(this.f123942d, this.f123940b);
            ldu0Var2.m153811i(this.f123942d, this.f123940b);
            ldu0Var2.m153807e(this.f123942d, this.f123940b);
            ldu0Var2.m153806d(this.f123942d, this.f123940b);
            ldu0Var2.m153817o(this.f123942d, this.f123940b);
            ldu0Var2.m153816n(this.f123942d, this.f123940b);
            ldu0Var2.m153814l(this.f123942d, this.f123940b);
            ldu0Var2.m153808f(this.f123942d, this.f123940b);
            oiu0VarMo116878l2.mo141540i(ldu0Var2.m153819q());
            oiu0VarMo116878l2.mo141541m(new ujv0(this.f123944f));
            piu0VarZzf = oiu0VarMo116878l2.zzh();
        }
        piu0 piu0Var = piu0VarZzf;
        if (((Boolean) ris0.f163391c.m149974e()).booleanValue()) {
            cew0VarMo150796d = piu0Var.mo150796d();
            cew0VarMo150796d.m109468h(4);
            cew0VarMo150796d.m109462b(zzlVar.zzp);
        } else {
            cew0VarMo150796d = null;
        }
        cew0 cew0Var = cew0VarMo150796d;
        z0u0 z0u0VarMo150793a = piu0Var.mo150793a();
        hpr hprVarM218173i = z0u0VarMo150793a.m218173i(z0u0VarMo150793a.m218174j());
        this.f123947i = hprVarM218173i;
        pvw0.m173991r(hprVarM218173i, new j4w0(this, lmv0Var, cew0Var, rdw0VarM176210b, piu0Var), this.f123940b);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m148305g() {
        this.f123942d.mo103145u(v8w0.m200327d(6, null, null));
    }

    /* JADX INFO: renamed from: h */
    public final void m148306h(yhs0 yhs0Var) {
        this.f123944f = yhs0Var;
    }

    @Override // p153l.mmv0
    public final boolean zza() {
        hpr hprVar = this.f123947i;
        return (hprVar == null || hprVar.isDone()) ? false : true;
    }
}
