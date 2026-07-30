package p153l;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class xtv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final String f196246a;

    /* JADX INFO: renamed from: b */
    public final xvw0 f196247b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f196248c;

    /* JADX INFO: renamed from: d */
    public final Context f196249d;

    /* JADX INFO: renamed from: e */
    public final o7w0 f196250e;

    /* JADX INFO: renamed from: f */
    public final dlt0 f196251f;

    public xtv0(xvw0 xvw0Var, ScheduledExecutorService scheduledExecutorService, String str, Context context, o7w0 o7w0Var, dlt0 dlt0Var) {
        this.f196247b = xvw0Var;
        this.f196248c = scheduledExecutorService;
        this.f196246a = str;
        this.f196249d = context;
        this.f196250e = o7w0Var;
        this.f196251f = dlt0Var;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ hpr m213109a(xtv0 xtv0Var) {
        hrw0 hrw0VarMo116886t = xtv0Var.f196251f.mo116886t();
        q5u0 q5u0Var = new q5u0();
        q5u0Var.m175527e(xtv0Var.f196249d);
        m7w0 m7w0Var = new m7w0();
        m7w0Var.m157315J("adUnitId");
        m7w0Var.m157327e(xtv0Var.f196250e.f145318d);
        m7w0Var.m157314I(new zzq());
        m7w0Var.m157320O(true);
        q5u0Var.m175531i(m7w0Var.m157329g());
        hrw0VarMo116886t.mo136933b(q5u0Var.m175532j());
        ndr0 ndr0Var = new ndr0();
        ndr0Var.m162785a(xtv0Var.f196246a);
        hrw0VarMo116886t.mo136932a(ndr0Var.m162786b());
        new ldu0();
        return pvw0.m173978e(pvw0.m173986m((gvw0) pvw0.m173988o(gvw0.m132580C(hrw0VarMo116886t.zzc().mo150964c()), ((Long) jas0.m144075c().m176505a(sgs0.f168313g7)).longValue(), TimeUnit.MILLISECONDS, xtv0Var.f196248c), new eow0() { // from class: l.utv0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                rqr0 rqr0Var = (rqr0) obj;
                return rqr0Var != null ? new ytv0(rqr0Var.f164514a) : new ytv0(null);
            }
        }, xtv0Var.f196247b), Exception.class, new eow0() { // from class: l.vtv0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                dct0.m115296e("", (Exception) obj);
                return new ytv0(null);
            }
        }, xtv0Var.f196247b);
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 33;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return (!((Boolean) jas0.m144075c().m176505a(sgs0.f168300f7)).booleanValue() || this.f196250e.f145331q) ? pvw0.m173981h(new ytv0(null)) : pvw0.m173984k(new wuw0() { // from class: l.wtv0
            @Override // p153l.wuw0
            public final hpr zza() {
                return xtv0.m213109a(this.f190818a);
            }
        }, this.f196247b);
    }
}
