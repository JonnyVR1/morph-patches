package p153l;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzcei;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a1w0 implements mmv0 {

    /* JADX INFO: renamed from: a */
    public final Context f67878a;

    /* JADX INFO: renamed from: b */
    public final Executor f67879b;

    /* JADX INFO: renamed from: c */
    public final dlt0 f67880c;

    /* JADX INFO: renamed from: d */
    public final v1w0 f67881d;

    /* JADX INFO: renamed from: e */
    public final y3w0 f67882e;

    /* JADX INFO: renamed from: f */
    public final zzcei f67883f;

    /* JADX INFO: renamed from: g */
    public final ViewGroup f67884g;

    /* JADX INFO: renamed from: h */
    public final hew0 f67885h;

    /* JADX INFO: renamed from: i */
    public final m7w0 f67886i;

    /* JADX INFO: renamed from: j */
    public hpr f67887j;

    public a1w0(Context context, Executor executor, dlt0 dlt0Var, y3w0 y3w0Var, v1w0 v1w0Var, m7w0 m7w0Var, zzcei zzceiVar) {
        this.f67878a = context;
        this.f67879b = executor;
        this.f67880c = dlt0Var;
        this.f67882e = y3w0Var;
        this.f67881d = v1w0Var;
        this.f67886i = m7w0Var;
        this.f67883f = zzceiVar;
        this.f67884g = new FrameLayout(context);
        this.f67885h = dlt0Var.mo116869D();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    @Override // p153l.mmv0
    /* JADX INFO: renamed from: a */
    public final synchronized boolean mo95567a(zzl zzlVar, String str, kmv0 kmv0Var, lmv0 lmv0Var) throws Throwable {
        Throwable th;
        boolean z;
        cew0 cew0Var;
        try {
            try {
                if (((Boolean) wis0.f189387d.m149974e()).booleanValue()) {
                    try {
                        if (((Boolean) jas0.m144075c().m176505a(sgs0.f167998Ga)).booleanValue()) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    z = false;
                }
                if (this.f67883f.zzc < ((Integer) jas0.m144075c().m176505a(sgs0.f168010Ha)).intValue() || !z) {
                    Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                }
                if (str == null) {
                    dct0.m115295d("Ad unit ID should not be null for app open ad.");
                    this.f67879b.execute(new Runnable() { // from class: l.u0w0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f176948a.m95569j();
                        }
                    });
                    return false;
                }
                if (this.f67887j != null) {
                    return false;
                }
                if (((Boolean) ris0.f163391c.m149974e()).booleanValue()) {
                    y3w0 y3w0Var = this.f67882e;
                    if (y3w0Var.zzd() != null) {
                        cew0 cew0VarZzh = ((vvt0) y3w0Var.zzd()).zzh();
                        cew0VarZzh.m109468h(7);
                        cew0VarZzh.m109462b(zzlVar.zzp);
                        cew0Var = cew0VarZzh;
                    } else {
                        cew0Var = null;
                    }
                } else {
                    cew0Var = null;
                }
                q8w0.m175827a(this.f67878a, zzlVar.zzf);
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168080N8)).booleanValue() && zzlVar.zzf) {
                    this.f67880c.mo116882p().m143049n(true);
                }
                m7w0 m7w0Var = this.f67886i;
                m7w0Var.m157315J(str);
                m7w0Var.m157314I(zzq.m12306F());
                m7w0Var.m157327e(zzlVar);
                Context context = this.f67878a;
                o7w0 o7w0VarM157329g = m7w0Var.m157329g();
                rdw0 rdw0VarM176210b = qdw0.m176210b(context, bew0.m103790f(o7w0VarM157329g), 7, zzlVar);
                z0w0 z0w0Var = new z0w0(null);
                z0w0Var.f202432a = o7w0VarM157329g;
                hpr hprVarMo119326a = this.f67882e.mo119326a(new z3w0(z0w0Var, null), new x3w0() { // from class: l.v0w0
                    @Override // p153l.x3w0
                    /* JADX INFO: renamed from: a */
                    public final o5u0 mo184819a(w3w0 w3w0Var) {
                        return this.f181907a.m95571l(w3w0Var);
                    }
                }, null);
                this.f67887j = hprVarMo119326a;
                pvw0.m173991r(hprVarMo119326a, new x0w0(this, lmv0Var, cew0Var, rdw0VarM176210b, z0w0Var), this.f67879b);
                return true;
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    /* JADX INFO: renamed from: d */
    public abstract o5u0 mo95568d(rwt0 rwt0Var, s5u0 s5u0Var, ndu0 ndu0Var);

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m95569j() {
        this.f67881d.mo103145u(v8w0.m200327d(6, null, null));
    }

    /* JADX INFO: renamed from: k */
    public final void m95570k(zzw zzwVar) {
        this.f67886i.m157316K(zzwVar);
    }

    /* JADX INFO: renamed from: l */
    public final synchronized o5u0 m95571l(w3w0 w3w0Var) {
        z0w0 z0w0Var = (z0w0) w3w0Var;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168236a8)).booleanValue()) {
            rwt0 rwt0Var = new rwt0(this.f67884g);
            q5u0 q5u0Var = new q5u0();
            q5u0Var.m175527e(this.f67878a);
            q5u0Var.m175531i(z0w0Var.f202432a);
            s5u0 s5u0VarM175532j = q5u0Var.m175532j();
            ldu0 ldu0Var = new ldu0();
            ldu0Var.m153808f(this.f67881d, this.f67879b);
            ldu0Var.m153817o(this.f67881d, this.f67879b);
            return mo95568d(rwt0Var, s5u0VarM175532j, ldu0Var.m153819q());
        }
        v1w0 v1w0VarM199083i = v1w0.m199083i(this.f67881d);
        ldu0 ldu0Var2 = new ldu0();
        ldu0Var2.m153807e(v1w0VarM199083i, this.f67879b);
        ldu0Var2.m153812j(v1w0VarM199083i, this.f67879b);
        ldu0Var2.m153813k(v1w0VarM199083i, this.f67879b);
        ldu0Var2.m153814l(v1w0VarM199083i, this.f67879b);
        ldu0Var2.m153808f(v1w0VarM199083i, this.f67879b);
        ldu0Var2.m153817o(v1w0VarM199083i, this.f67879b);
        ldu0Var2.m153818p(v1w0VarM199083i);
        rwt0 rwt0Var2 = new rwt0(this.f67884g);
        q5u0 q5u0Var2 = new q5u0();
        q5u0Var2.m175527e(this.f67878a);
        q5u0Var2.m175531i(z0w0Var.f202432a);
        return mo95568d(rwt0Var2, q5u0Var2.m175532j(), ldu0Var2.m153819q());
    }

    @Override // p153l.mmv0
    public final boolean zza() {
        hpr hprVar = this.f67887j;
        return (hprVar == null || hprVar.isDone()) ? false : true;
    }
}
