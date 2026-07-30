package p153l;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.C2098b;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class j2w0 implements mmv0 {

    /* JADX INFO: renamed from: a */
    public final Context f118116a;

    /* JADX INFO: renamed from: b */
    public final Executor f118117b;

    /* JADX INFO: renamed from: c */
    public final dlt0 f118118c;

    /* JADX INFO: renamed from: d */
    public final wlv0 f118119d;

    /* JADX INFO: renamed from: e */
    public final amv0 f118120e;

    /* JADX INFO: renamed from: f */
    public final ViewGroup f118121f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public yhs0 f118122g;

    /* JADX INFO: renamed from: h */
    public final r9u0 f118123h;

    /* JADX INFO: renamed from: i */
    public final hew0 f118124i;

    /* JADX INFO: renamed from: j */
    public final lcu0 f118125j;

    /* JADX INFO: renamed from: k */
    public final m7w0 f118126k;

    /* JADX INFO: renamed from: l */
    public hpr f118127l;

    public j2w0(Context context, Executor executor, zzq zzqVar, dlt0 dlt0Var, wlv0 wlv0Var, amv0 amv0Var, m7w0 m7w0Var, lcu0 lcu0Var) {
        this.f118116a = context;
        this.f118117b = executor;
        this.f118118c = dlt0Var;
        this.f118119d = wlv0Var;
        this.f118120e = amv0Var;
        this.f118126k = m7w0Var;
        this.f118123h = dlt0Var.mo116877k();
        this.f118124i = dlt0Var.mo116869D();
        this.f118121f = new FrameLayout(context);
        this.f118125j = lcu0Var;
        m7w0Var.m157314I(zzqVar);
    }

    @Override // p153l.mmv0
    /* JADX INFO: renamed from: a */
    public final boolean mo95567a(zzl zzlVar, String str, @Nullable kmv0 kmv0Var, lmv0 lmv0Var) throws RemoteException {
        zxt0 zxt0VarZzk;
        if (str == null) {
            dct0.m115295d("Ad unit ID should not be null for banner ad.");
            this.f118117b.execute(new Runnable() { // from class: l.f2w0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f96933a.m143293l();
                }
            });
            return false;
        }
        if (!zza()) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168080N8)).booleanValue() && zzlVar.zzf) {
                this.f118118c.mo116882p().m143049n(true);
            }
            m7w0 m7w0Var = this.f118126k;
            m7w0Var.m157315J(str);
            m7w0Var.m157327e(zzlVar);
            Context context = this.f118116a;
            o7w0 o7w0VarM157329g = m7w0Var.m157329g();
            rdw0 rdw0VarM176210b = qdw0.m176210b(context, bew0.m103790f(o7w0VarM157329g), 3, zzlVar);
            cew0 cew0VarMo121819f = null;
            if (!((Boolean) njs0.f142341e.m149974e()).booleanValue() || !this.f118126k.m157334x().zzk) {
                boolean zBooleanValue = ((Boolean) jas0.m144075c().m176505a(sgs0.f168223Z7)).booleanValue();
                dlt0 dlt0Var = this.f118118c;
                if (zBooleanValue) {
                    yxt0 yxt0VarMo116876j = dlt0Var.mo116876j();
                    q5u0 q5u0Var = new q5u0();
                    q5u0Var.m175527e(this.f118116a);
                    q5u0Var.m175531i(o7w0VarM157329g);
                    yxt0VarMo116876j.mo111697o(q5u0Var.m175532j());
                    ldu0 ldu0Var = new ldu0();
                    ldu0Var.m153815m(this.f118119d, this.f118117b);
                    ldu0Var.m153816n(this.f118119d, this.f118117b);
                    yxt0VarMo116876j.mo111694g(ldu0Var.m153819q());
                    yxt0VarMo116876j.mo111698p(new ujv0(this.f118122g));
                    yxt0VarMo116876j.mo111691c(new lju0(fmu0.f99840h, null));
                    yxt0VarMo116876j.mo111692e(new vyt0(this.f118123h, this.f118125j));
                    yxt0VarMo116876j.mo111690b(new rwt0(this.f118121f));
                    zxt0VarZzk = yxt0VarMo116876j.zzh();
                } else {
                    yxt0 yxt0VarMo116876j2 = dlt0Var.mo116876j();
                    q5u0 q5u0Var2 = new q5u0();
                    q5u0Var2.m175527e(this.f118116a);
                    q5u0Var2.m175531i(o7w0VarM157329g);
                    yxt0VarMo116876j2.mo111697o(q5u0Var2.m175532j());
                    ldu0 ldu0Var2 = new ldu0();
                    ldu0Var2.m153815m(this.f118119d, this.f118117b);
                    ldu0Var2.m153806d(this.f118119d, this.f118117b);
                    ldu0Var2.m153806d(this.f118120e, this.f118117b);
                    ldu0Var2.m153817o(this.f118119d, this.f118117b);
                    ldu0Var2.m153809g(this.f118119d, this.f118117b);
                    ldu0Var2.m153810h(this.f118119d, this.f118117b);
                    ldu0Var2.m153811i(this.f118119d, this.f118117b);
                    ldu0Var2.m153807e(this.f118119d, this.f118117b);
                    ldu0Var2.m153816n(this.f118119d, this.f118117b);
                    ldu0Var2.m153814l(this.f118119d, this.f118117b);
                    yxt0VarMo116876j2.mo111694g(ldu0Var2.m153819q());
                    yxt0VarMo116876j2.mo111698p(new ujv0(this.f118122g));
                    yxt0VarMo116876j2.mo111691c(new lju0(fmu0.f99840h, null));
                    yxt0VarMo116876j2.mo111692e(new vyt0(this.f118123h, this.f118125j));
                    yxt0VarMo116876j2.mo111690b(new rwt0(this.f118121f));
                    zxt0VarZzk = yxt0VarMo116876j2.zzh();
                }
                zxt0 zxt0Var = zxt0VarZzk;
                if (((Boolean) ris0.f163391c.m149974e()).booleanValue()) {
                    cew0VarMo121819f = zxt0Var.mo121819f();
                    cew0VarMo121819f.m109468h(3);
                    cew0VarMo121819f.m109462b(zzlVar.zzp);
                }
                z0u0 z0u0VarMo121817d = zxt0Var.mo121817d();
                hpr hprVarM218173i = z0u0VarMo121817d.m218173i(z0u0VarMo121817d.m218174j());
                this.f118127l = hprVarM218173i;
                pvw0.m173991r(hprVarM218173i, new i2w0(this, lmv0Var, cew0VarMo121819f, rdw0VarM176210b, zxt0Var), this.f118117b);
                return true;
            }
            wlv0 wlv0Var = this.f118119d;
            if (wlv0Var != null) {
                wlv0Var.mo103145u(v8w0.m200327d(7, null, null));
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final ViewGroup m143291c() {
        return this.f118121f;
    }

    /* JADX INFO: renamed from: h */
    public final m7w0 m143292h() {
        return this.f118126k;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m143293l() {
        this.f118119d.mo103145u(v8w0.m200327d(6, null, null));
    }

    /* JADX INFO: renamed from: m */
    public final void m143294m() {
        this.f118123h.m180659w0(this.f118125j.m153693a());
    }

    /* JADX INFO: renamed from: n */
    public final void m143295n(tes0 tes0Var) {
        this.f118120e.m98859b(tes0Var);
    }

    /* JADX INFO: renamed from: o */
    public final void m143296o(s9u0 s9u0Var) {
        this.f118123h.m149283q0(s9u0Var, this.f118117b);
    }

    /* JADX INFO: renamed from: p */
    public final void m143297p(yhs0 yhs0Var) {
        this.f118122g = yhs0Var;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m143298q() {
        Object parent = this.f118121f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        bxy0.m106934r();
        return C2098b.m12383v(view, view.getContext());
    }

    @Override // p153l.mmv0
    public final boolean zza() {
        hpr hprVar = this.f118127l;
        return (hprVar == null || hprVar.isDone()) ? false : true;
    }
}
