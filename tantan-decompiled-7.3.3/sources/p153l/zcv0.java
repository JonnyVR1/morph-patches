package p153l;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.zzcei;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class zcv0 implements pcv0 {

    /* JADX INFO: renamed from: a */
    public final zvt0 f203826a;

    /* JADX INFO: renamed from: b */
    public final Context f203827b;

    /* JADX INFO: renamed from: c */
    public final ltu0 f203828c;

    /* JADX INFO: renamed from: d */
    public final o7w0 f203829d;

    /* JADX INFO: renamed from: e */
    public final Executor f203830e;

    /* JADX INFO: renamed from: f */
    public final zzcei f203831f;

    /* JADX INFO: renamed from: g */
    public final dqs0 f203832g;

    /* JADX INFO: renamed from: h */
    public final boolean f203833h = ((Boolean) jas0.m144075c().m176505a(sgs0.f168068M8)).booleanValue();

    /* JADX INFO: renamed from: i */
    public final qbv0 f203834i;

    public zcv0(zvt0 zvt0Var, Context context, Executor executor, ltu0 ltu0Var, o7w0 o7w0Var, zzcei zzceiVar, dqs0 dqs0Var, qbv0 qbv0Var) {
        this.f203827b = context;
        this.f203826a = zvt0Var;
        this.f203830e = executor;
        this.f203828c = ltu0Var;
        this.f203829d = o7w0Var;
        this.f203831f = zzceiVar;
        this.f203832g = dqs0Var;
        this.f203834i = qbv0Var;
    }

    @Override // p153l.pcv0
    /* JADX INFO: renamed from: a */
    public final boolean mo98488a(b7w0 b7w0Var, q6w0 q6w0Var) {
        u6w0 u6w0Var = q6w0Var.f155911t;
        return (u6w0Var == null || u6w0Var.f177809a == null) ? false : true;
    }

    @Override // p153l.pcv0
    /* JADX INFO: renamed from: b */
    public final hpr mo98489b(final b7w0 b7w0Var, final q6w0 q6w0Var) {
        final otu0 otu0Var = new otu0();
        hpr hprVarM173987n = pvw0.m173987n(pvw0.m173981h(null), new xuw0() { // from class: l.vcv0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return this.f183490a.m219266c(q6w0Var, b7w0Var, otu0Var, obj);
            }
        }, this.f203830e);
        hprVarM173987n.addListener(new Runnable() { // from class: l.wcv0
            @Override // java.lang.Runnable
            public final void run() {
                otu0Var.m169183b();
            }
        }, this.f203830e);
        return hprVarM173987n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hpr m219266c(final q6w0 q6w0Var, b7w0 b7w0Var, otu0 otu0Var, Object obj) throws Exception {
        final wit0 wit0VarM155812a = this.f203828c.m155812a(this.f203829d.f145319e, q6w0Var, b7w0Var.f75343b.f68854b);
        wit0VarM155812a.mo13732b0(q6w0Var.f155870X);
        otu0Var.m169182a(this.f203827b, (View) wit0VarM155812a);
        tct0 tct0Var = new tct0();
        final wvt0 wvt0VarMo196949a = this.f203826a.mo196949a(new a0u0(b7w0Var, q6w0Var, null), new lhu0(new hdv0(this.f203831f, tct0Var, q6w0Var, wit0VarM155812a, this.f203829d, this.f203833h, this.f203832g, this.f203834i), wit0VarM155812a), new xvt0(q6w0Var.f155876b0));
        wvt0VarMo196949a.mo177268j().m151408i(wit0VarM155812a, false, this.f203833h ? this.f203832g : null);
        tct0Var.m190494b(wvt0VarMo196949a);
        wvt0VarMo196949a.mo99224b().m149283q0(new j7u0() { // from class: l.xcv0
            @Override // p153l.j7u0
            /* JADX INFO: renamed from: a */
            public final void mo106809a() {
                wit0 wit0Var = wit0VarM155812a;
                if (wit0Var.zzN() != null) {
                    wit0Var.zzN().zzr();
                }
            }
        }, oct0.f146738f);
        wvt0VarMo196949a.mo177268j();
        u6w0 u6w0Var = q6w0Var.f155911t;
        return pvw0.m173986m(ktu0.m151401j(wit0VarM155812a, u6w0Var.f177810b, u6w0Var.f177809a), new eow0() { // from class: l.ycv0
            @Override // p153l.eow0
            public final Object apply(Object obj2) {
                wit0 wit0Var = wit0VarM155812a;
                if (q6w0Var.f155860N) {
                    wit0Var.mo13762s();
                }
                wvt0 wvt0Var = wvt0VarMo196949a;
                wit0Var.mo13758p0();
                wit0Var.onPause();
                return wvt0Var.mo177266h();
            }
        }, this.f203830e);
    }
}
