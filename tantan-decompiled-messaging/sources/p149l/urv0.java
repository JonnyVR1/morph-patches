package p149l;

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
public abstract class urv0 implements gdv0 {

    /* JADX INFO: renamed from: a */
    public final Context f177896a;

    /* JADX INFO: renamed from: b */
    public final Executor f177897b;

    /* JADX INFO: renamed from: c */
    public final xbt0 f177898c;

    /* JADX INFO: renamed from: d */
    public final psv0 f177899d;

    /* JADX INFO: renamed from: e */
    public final suv0 f177900e;

    /* JADX INFO: renamed from: f */
    public final zzcei f177901f;

    /* JADX INFO: renamed from: g */
    public final ViewGroup f177902g;

    /* JADX INFO: renamed from: h */
    public final b5w0 f177903h;

    /* JADX INFO: renamed from: i */
    public final gyv0 f177904i;

    /* JADX INFO: renamed from: j */
    public gnr f177905j;

    public urv0(Context context, Executor executor, xbt0 xbt0Var, suv0 suv0Var, psv0 psv0Var, gyv0 gyv0Var, zzcei zzceiVar) {
        this.f177896a = context;
        this.f177897b = executor;
        this.f177898c = xbt0Var;
        this.f177900e = suv0Var;
        this.f177899d = psv0Var;
        this.f177904i = gyv0Var;
        this.f177901f = zzceiVar;
        this.f177902g = new FrameLayout(context);
        this.f177903h = xbt0Var.mo135792D();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    @Override // p149l.gdv0
    /* JADX INFO: renamed from: a */
    public final synchronized boolean mo113608a(zzl zzlVar, String str, edv0 edv0Var, fdv0 fdv0Var) throws Throwable {
        Throwable th;
        boolean z;
        w4w0 w4w0Var;
        try {
            try {
                if (((Boolean) q9s0.f153473d.m115379e()).booleanValue()) {
                    try {
                        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131927Ga)).booleanValue()) {
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
                if (this.f177901f.zzc < ((Integer) d1s0.m109677c().m144697a(m7s0.f131939Ha)).intValue() || !z) {
                    Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                }
                if (str == null) {
                    x2t0.m206866d("Ad unit ID should not be null for app open ad.");
                    this.f177897b.execute(new Runnable() { // from class: l.orv0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f145359a.m195130j();
                        }
                    });
                    return false;
                }
                if (this.f177905j != null) {
                    return false;
                }
                if (((Boolean) l9s0.f127142c.m115379e()).booleanValue()) {
                    suv0 suv0Var = this.f177900e;
                    if (suv0Var.zzd() != null) {
                        w4w0 w4w0VarZzh = ((pmt0) suv0Var.zzd()).zzh();
                        w4w0VarZzh.m201590h(7);
                        w4w0VarZzh.m201584b(zzlVar.zzp);
                        w4w0Var = w4w0VarZzh;
                    } else {
                        w4w0Var = null;
                    }
                } else {
                    w4w0Var = null;
                }
                kzv0.m147956a(this.f177896a, zzlVar.zzf);
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132009N8)).booleanValue() && zzlVar.zzf) {
                    this.f177898c.mo135805p().m113352n(true);
                }
                gyv0 gyv0Var = this.f177904i;
                gyv0Var.m128758J(str);
                gyv0Var.m128757I(zzq.m12252F());
                gyv0Var.m128770e(zzlVar);
                Context context = this.f177896a;
                iyv0 iyv0VarM128772g = gyv0Var.m128772g();
                l4w0 l4w0VarM144515b = k4w0.m144515b(context, v4w0.m197070f(iyv0VarM128772g), 7, zzlVar);
                trv0 trv0Var = new trv0(null);
                trv0Var.f171873a = iyv0VarM128772g;
                gnr gnrVarMo104000a = this.f177900e.mo104000a(new tuv0(trv0Var, null), new ruv0() { // from class: l.prv0
                    @Override // p149l.ruv0
                    /* JADX INFO: renamed from: a */
                    public final iwt0 mo156774a(quv0 quv0Var) {
                        return this.f150953a.m195132l(quv0Var);
                    }
                }, null);
                this.f177905j = gnrVarMo104000a;
                jmw0.m142245r(gnrVarMo104000a, new rrv0(this, fdv0Var, w4w0Var, l4w0VarM144515b, trv0Var), this.f177897b);
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
    public abstract iwt0 mo180719d(lnt0 lnt0Var, mwt0 mwt0Var, h4u0 h4u0Var);

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m195130j() {
        this.f177899d.mo97693u(pzv0.m172256d(6, null, null));
    }

    /* JADX INFO: renamed from: k */
    public final void m195131k(zzw zzwVar) {
        this.f177904i.m128759K(zzwVar);
    }

    /* JADX INFO: renamed from: l */
    public final synchronized iwt0 m195132l(quv0 quv0Var) {
        trv0 trv0Var = (trv0) quv0Var;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132165a8)).booleanValue()) {
            lnt0 lnt0Var = new lnt0(this.f177902g);
            kwt0 kwt0Var = new kwt0();
            kwt0Var.m147644e(this.f177896a);
            kwt0Var.m147648i(trv0Var.f171873a);
            mwt0 mwt0VarM147649j = kwt0Var.m147649j();
            f4u0 f4u0Var = new f4u0();
            f4u0Var.m119443f(this.f177899d, this.f177897b);
            f4u0Var.m119452o(this.f177899d, this.f177897b);
            return mo180719d(lnt0Var, mwt0VarM147649j, f4u0Var.m119454q());
        }
        psv0 psv0VarM171248i = psv0.m171248i(this.f177899d);
        f4u0 f4u0Var2 = new f4u0();
        f4u0Var2.m119442e(psv0VarM171248i, this.f177897b);
        f4u0Var2.m119447j(psv0VarM171248i, this.f177897b);
        f4u0Var2.m119448k(psv0VarM171248i, this.f177897b);
        f4u0Var2.m119449l(psv0VarM171248i, this.f177897b);
        f4u0Var2.m119443f(psv0VarM171248i, this.f177897b);
        f4u0Var2.m119452o(psv0VarM171248i, this.f177897b);
        f4u0Var2.m119453p(psv0VarM171248i);
        lnt0 lnt0Var2 = new lnt0(this.f177902g);
        kwt0 kwt0Var2 = new kwt0();
        kwt0Var2.m147644e(this.f177896a);
        kwt0Var2.m147648i(trv0Var.f171873a);
        return mo180719d(lnt0Var2, kwt0Var2.m147649j(), f4u0Var2.m119454q());
    }

    @Override // p149l.gdv0
    public final boolean zza() {
        gnr gnrVar = this.f177905j;
        return (gnrVar == null || gnrVar.isDone()) ? false : true;
    }
}
