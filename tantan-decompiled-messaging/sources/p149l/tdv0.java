package p149l;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.C2075b;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class tdv0 implements gdv0 {

    /* JADX INFO: renamed from: a */
    public final gyv0 f169768a;

    /* JADX INFO: renamed from: b */
    public final xbt0 f169769b;

    /* JADX INFO: renamed from: c */
    public final Context f169770c;

    /* JADX INFO: renamed from: d */
    public final ddv0 f169771d;

    /* JADX INFO: renamed from: e */
    public final b5w0 f169772e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public tqt0 f169773f;

    public tdv0(xbt0 xbt0Var, Context context, ddv0 ddv0Var, gyv0 gyv0Var) {
        this.f169769b = xbt0Var;
        this.f169770c = context;
        this.f169771d = ddv0Var;
        this.f169768a = gyv0Var;
        this.f169772e = xbt0Var.mo135792D();
        gyv0Var.m128760L(ddv0Var.m111083d());
    }

    @Override // p149l.gdv0
    /* JADX INFO: renamed from: a */
    public final boolean mo113608a(zzl zzlVar, String str, edv0 edv0Var, fdv0 fdv0Var) throws RemoteException {
        vny0.m199080r();
        if (C2075b.m12314g(this.f169770c) && zzlVar.zzs == null) {
            x2t0.m206866d("Failed to load the ad because app ID is missing.");
            this.f169769b.mo135794c().execute(new Runnable() { // from class: l.idv0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f112694a.m188460e();
                }
            });
            return false;
        }
        if (str == null) {
            x2t0.m206866d("Ad unit ID should not be null for NativeAdLoader.");
            this.f169769b.mo135794c().execute(new Runnable() { // from class: l.jdv0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f117442a.m188461f();
                }
            });
            return false;
        }
        kzv0.m147956a(this.f169770c, zzlVar.zzf);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132009N8)).booleanValue() && zzlVar.zzf) {
            this.f169769b.mo135805p().m113352n(true);
        }
        int i = ((hdv0) edv0Var).f107317a;
        gyv0 gyv0Var = this.f169768a;
        gyv0Var.m128770e(zzlVar);
        gyv0Var.m128765Q(i);
        Context context = this.f169770c;
        iyv0 iyv0VarM128772g = gyv0Var.m128772g();
        l4w0 l4w0VarM144515b = k4w0.m144515b(context, v4w0.m197070f(iyv0VarM128772g), 8, zzlVar);
        sys0 sys0Var = iyv0VarM128772g.f115504n;
        if (sys0Var != null) {
            this.f169771d.m111083d().m173931P(sys0Var);
        }
        jau0 jau0VarMo135802m = this.f169769b.mo135802m();
        kwt0 kwt0Var = new kwt0();
        kwt0Var.m147644e(this.f169770c);
        kwt0Var.m147648i(iyv0VarM128772g);
        jau0VarMo135802m.mo140717l(kwt0Var.m147649j());
        f4u0 f4u0Var = new f4u0();
        f4u0Var.m119451n(this.f169771d.m111083d(), this.f169769b.mo135794c());
        jau0VarMo135802m.mo140716h(f4u0Var.m119454q());
        jau0VarMo135802m.mo140715c(this.f169771d.m111082c());
        w4w0 w4w0VarMo145186e = null;
        jau0VarMo135802m.mo140714b(new lnt0(null));
        kau0 kau0VarZzg = jau0VarMo135802m.zzg();
        if (((Boolean) l9s0.f127142c.m115379e()).booleanValue()) {
            w4w0VarMo145186e = kau0VarZzg.mo145186e();
            w4w0VarMo145186e.m201590h(8);
            w4w0VarMo145186e.m201584b(zzlVar.zzp);
        }
        w4w0 w4w0Var = w4w0VarMo145186e;
        this.f169769b.mo135790B().m157173c(1);
        rmw0 rmw0Var = i3t0.f111372a;
        wgx0.m203089b(rmw0Var);
        ScheduledExecutorService scheduledExecutorServiceMo135795d = this.f169769b.mo135795d();
        trt0 trt0VarMo145182a = kau0VarZzg.mo145182a();
        tqt0 tqt0Var = new tqt0(rmw0Var, scheduledExecutorServiceMo135795d, trt0VarMo145182a.m190444i(trt0VarMo145182a.m190445j()));
        this.f169773f = tqt0Var;
        tqt0Var.m190160e(new sdv0(this, fdv0Var, w4w0Var, l4w0VarM144515b, kau0VarZzg));
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m188460e() {
        this.f169771d.m111080a().mo97693u(pzv0.m172256d(4, null, null));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m188461f() {
        this.f169771d.m111080a().mo97693u(pzv0.m172256d(6, null, null));
    }

    @Override // p149l.gdv0
    public final boolean zza() {
        tqt0 tqt0Var = this.f169773f;
        return tqt0Var != null && tqt0Var.m190161f();
    }
}
