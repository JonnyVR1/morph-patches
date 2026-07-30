package p153l;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.C2098b;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class zmv0 implements mmv0 {

    /* JADX INFO: renamed from: a */
    public final m7w0 f205116a;

    /* JADX INFO: renamed from: b */
    public final dlt0 f205117b;

    /* JADX INFO: renamed from: c */
    public final Context f205118c;

    /* JADX INFO: renamed from: d */
    public final jmv0 f205119d;

    /* JADX INFO: renamed from: e */
    public final hew0 f205120e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public zzt0 f205121f;

    public zmv0(dlt0 dlt0Var, Context context, jmv0 jmv0Var, m7w0 m7w0Var) {
        this.f205117b = dlt0Var;
        this.f205118c = context;
        this.f205119d = jmv0Var;
        this.f205116a = m7w0Var;
        this.f205120e = dlt0Var.mo116869D();
        m7w0Var.m157317L(jmv0Var.m146174d());
    }

    @Override // p153l.mmv0
    /* JADX INFO: renamed from: a */
    public final boolean mo95567a(zzl zzlVar, String str, kmv0 kmv0Var, lmv0 lmv0Var) throws RemoteException {
        bxy0.m106934r();
        if (C2098b.m12368g(this.f205118c) && zzlVar.zzs == null) {
            dct0.m115295d("Failed to load the ad because app ID is missing.");
            this.f205117b.mo116871c().execute(new Runnable() { // from class: l.omv0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f148002a.m220482e();
                }
            });
            return false;
        }
        if (str == null) {
            dct0.m115295d("Ad unit ID should not be null for NativeAdLoader.");
            this.f205117b.mo116871c().execute(new Runnable() { // from class: l.pmv0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f153235a.m220483f();
                }
            });
            return false;
        }
        q8w0.m175827a(this.f205118c, zzlVar.zzf);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168080N8)).booleanValue() && zzlVar.zzf) {
            this.f205117b.mo116882p().m143049n(true);
        }
        int i = ((nmv0) kmv0Var).f142747a;
        m7w0 m7w0Var = this.f205116a;
        m7w0Var.m157327e(zzlVar);
        m7w0Var.m157322Q(i);
        Context context = this.f205118c;
        o7w0 o7w0VarM157329g = m7w0Var.m157329g();
        rdw0 rdw0VarM176210b = qdw0.m176210b(context, bew0.m103790f(o7w0VarM157329g), 8, zzlVar);
        y7t0 y7t0Var = o7w0VarM157329g.f145328n;
        if (y7t0Var != null) {
            this.f205119d.m146174d().m207078P(y7t0Var);
        }
        pju0 pju0VarMo116879m = this.f205117b.mo116879m();
        q5u0 q5u0Var = new q5u0();
        q5u0Var.m175527e(this.f205118c);
        q5u0Var.m175531i(o7w0VarM157329g);
        pju0VarMo116879m.mo172530l(q5u0Var.m175532j());
        ldu0 ldu0Var = new ldu0();
        ldu0Var.m153816n(this.f205119d.m146174d(), this.f205117b.mo116871c());
        pju0VarMo116879m.mo172529h(ldu0Var.m153819q());
        pju0VarMo116879m.mo172528c(this.f205119d.m146173c());
        cew0 cew0VarMo176888e = null;
        pju0VarMo116879m.mo172527b(new rwt0(null));
        qju0 qju0VarZzg = pju0VarMo116879m.zzg();
        if (((Boolean) ris0.f163391c.m149974e()).booleanValue()) {
            cew0VarMo176888e = qju0VarZzg.mo176888e();
            cew0VarMo176888e.m109468h(8);
            cew0VarMo176888e.m109462b(zzlVar.zzp);
        }
        cew0 cew0Var = cew0VarMo176888e;
        this.f205117b.mo116867B().m185114c(1);
        xvw0 xvw0Var = oct0.f146733a;
        cqx0.m111999b(xvw0Var);
        ScheduledExecutorService scheduledExecutorServiceMo116872d = this.f205117b.mo116872d();
        z0u0 z0u0VarMo176884a = qju0VarZzg.mo176884a();
        zzt0 zzt0Var = new zzt0(xvw0Var, scheduledExecutorServiceMo116872d, z0u0VarMo176884a.m218173i(z0u0VarMo176884a.m218174j()));
        this.f205121f = zzt0Var;
        zzt0Var.m222287e(new ymv0(this, lmv0Var, cew0Var, rdw0VarM176210b, qju0VarZzg));
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m220482e() {
        this.f205119d.m146171a().mo103145u(v8w0.m200327d(4, null, null));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m220483f() {
        this.f205119d.m146171a().mo103145u(v8w0.m200327d(6, null, null));
    }

    @Override // p153l.mmv0
    public final boolean zza() {
        zzt0 zzt0Var = this.f205121f;
        return zzt0Var != null && zzt0Var.m222288f();
    }
}
