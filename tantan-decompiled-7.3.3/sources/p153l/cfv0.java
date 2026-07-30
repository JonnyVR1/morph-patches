package p153l;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.zzcei;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class cfv0 implements pcv0 {

    /* JADX INFO: renamed from: a */
    public final Context f81588a;

    /* JADX INFO: renamed from: b */
    public final ltu0 f81589b;

    /* JADX INFO: renamed from: c */
    public final piu0 f81590c;

    /* JADX INFO: renamed from: d */
    public final o7w0 f81591d;

    /* JADX INFO: renamed from: e */
    public final Executor f81592e;

    /* JADX INFO: renamed from: f */
    public final zzcei f81593f;

    /* JADX INFO: renamed from: g */
    public final dqs0 f81594g;

    /* JADX INFO: renamed from: h */
    public final boolean f81595h = ((Boolean) jas0.m144075c().m176505a(sgs0.f168068M8)).booleanValue();

    /* JADX INFO: renamed from: i */
    public final qbv0 f81596i;

    public cfv0(Context context, zzcei zzceiVar, o7w0 o7w0Var, Executor executor, piu0 piu0Var, ltu0 ltu0Var, dqs0 dqs0Var, qbv0 qbv0Var) {
        this.f81588a = context;
        this.f81591d = o7w0Var;
        this.f81590c = piu0Var;
        this.f81592e = executor;
        this.f81593f = zzceiVar;
        this.f81589b = ltu0Var;
        this.f81594g = dqs0Var;
        this.f81596i = qbv0Var;
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
        hpr hprVarM173987n = pvw0.m173987n(pvw0.m173981h(null), new xuw0() { // from class: l.zev0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return this.f204084a.m109656c(q6w0Var, b7w0Var, otu0Var, obj);
            }
        }, this.f81592e);
        hprVarM173987n.addListener(new Runnable() { // from class: l.afv0
            @Override // java.lang.Runnable
            public final void run() {
                otu0Var.m169183b();
            }
        }, this.f81592e);
        return hprVarM173987n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hpr m109656c(final q6w0 q6w0Var, b7w0 b7w0Var, otu0 otu0Var, Object obj) throws Exception {
        final wit0 wit0VarM155812a = this.f81589b.m155812a(this.f81591d.f145319e, q6w0Var, b7w0Var.f75343b.f68854b);
        wit0VarM155812a.mo13732b0(q6w0Var.f155870X);
        otu0Var.m169182a(this.f81588a, (View) wit0VarM155812a);
        tct0 tct0Var = new tct0();
        final ihu0 ihu0VarMo150795c = this.f81590c.mo150795c(new a0u0(b7w0Var, q6w0Var, null), new lhu0(new bfv0(this.f81588a, this.f81593f, tct0Var, q6w0Var, wit0VarM155812a, this.f81591d, this.f81595h, this.f81594g, this.f81596i), wit0VarM155812a));
        tct0Var.m190494b(ihu0VarMo150795c);
        ihu0VarMo150795c.mo99224b().m149283q0(new j7u0() { // from class: l.xev0
            @Override // p153l.j7u0
            /* JADX INFO: renamed from: a */
            public final void mo106809a() {
                wit0 wit0Var = wit0VarM155812a;
                if (wit0Var.zzN() != null) {
                    wit0Var.zzN().zzr();
                }
            }
        }, oct0.f146738f);
        ihu0VarMo150795c.mo131321k().m151408i(wit0VarM155812a, true, this.f81595h ? this.f81594g : null);
        ihu0VarMo150795c.mo131321k();
        u6w0 u6w0Var = q6w0Var.f155911t;
        return pvw0.m173986m(ktu0.m151401j(wit0VarM155812a, u6w0Var.f177810b, u6w0Var.f177809a), new eow0() { // from class: l.yev0
            @Override // p153l.eow0
            public final Object apply(Object obj2) {
                wit0 wit0Var = wit0VarM155812a;
                if (q6w0Var.f155860N) {
                    wit0Var.mo13762s();
                }
                ihu0 ihu0Var = ihu0VarMo150795c;
                wit0Var.mo13758p0();
                wit0Var.onPause();
                return ihu0Var.mo131319i();
            }
        }, this.f81592e);
    }
}
