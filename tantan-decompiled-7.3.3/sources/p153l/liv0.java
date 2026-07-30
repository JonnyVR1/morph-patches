package p153l;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.zzcei;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class liv0 implements pcv0 {

    /* JADX INFO: renamed from: a */
    public final Context f132257a;

    /* JADX INFO: renamed from: b */
    public final ltu0 f132258b;

    /* JADX INFO: renamed from: c */
    public final psu0 f132259c;

    /* JADX INFO: renamed from: d */
    public final o7w0 f132260d;

    /* JADX INFO: renamed from: e */
    public final Executor f132261e;

    /* JADX INFO: renamed from: f */
    public final zzcei f132262f;

    /* JADX INFO: renamed from: g */
    public final dqs0 f132263g;

    /* JADX INFO: renamed from: h */
    public final boolean f132264h = ((Boolean) jas0.m144075c().m176505a(sgs0.f168068M8)).booleanValue();

    /* JADX INFO: renamed from: i */
    public final qbv0 f132265i;

    public liv0(Context context, zzcei zzceiVar, o7w0 o7w0Var, Executor executor, psu0 psu0Var, ltu0 ltu0Var, dqs0 dqs0Var, qbv0 qbv0Var) {
        this.f132257a = context;
        this.f132260d = o7w0Var;
        this.f132259c = psu0Var;
        this.f132261e = executor;
        this.f132262f = zzceiVar;
        this.f132258b = ltu0Var;
        this.f132263g = dqs0Var;
        this.f132265i = qbv0Var;
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
        hpr hprVarM173987n = pvw0.m173987n(pvw0.m173981h(null), new xuw0() { // from class: l.eiv0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return this.f94215a.m154415c(q6w0Var, b7w0Var, otu0Var, obj);
            }
        }, this.f132261e);
        hprVarM173987n.addListener(new Runnable() { // from class: l.fiv0
            @Override // java.lang.Runnable
            public final void run() {
                otu0Var.m169183b();
            }
        }, this.f132261e);
        return hprVarM173987n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hpr m154415c(final q6w0 q6w0Var, b7w0 b7w0Var, otu0 otu0Var, Object obj) throws Exception {
        final wit0 wit0VarM155812a = this.f132258b.m155812a(this.f132260d.f145319e, q6w0Var, b7w0Var.f75343b.f68854b);
        wit0VarM155812a.mo13732b0(q6w0Var.f155870X);
        otu0Var.m169182a(this.f132257a, (View) wit0VarM155812a);
        tct0 tct0Var = new tct0();
        final lsu0 lsu0VarMo131473b = this.f132259c.mo131473b(new a0u0(b7w0Var, q6w0Var, null), new msu0(new kiv0(this.f132257a, this.f132258b, this.f132260d, this.f132262f, q6w0Var, tct0Var, wit0VarM155812a, this.f132263g, this.f132264h, this.f132265i), wit0VarM155812a));
        tct0Var.m190494b(lsu0VarMo131473b);
        sqs0.m187562b(wit0VarM155812a, lsu0VarMo131473b.mo111983i());
        lsu0VarMo131473b.mo99224b().m149283q0(new j7u0() { // from class: l.giv0
            @Override // p153l.j7u0
            /* JADX INFO: renamed from: a */
            public final void mo106809a() {
                wit0 wit0Var = wit0VarM155812a;
                if (wit0Var.zzN() != null) {
                    wit0Var.zzN().zzr();
                }
            }
        }, oct0.f146738f);
        lsu0VarMo131473b.mo111986l().m151408i(wit0VarM155812a, true, this.f132264h ? this.f132263g : null);
        lsu0VarMo131473b.mo111986l();
        u6w0 u6w0Var = q6w0Var.f155911t;
        return pvw0.m173986m(ktu0.m151401j(wit0VarM155812a, u6w0Var.f177810b, u6w0Var.f177809a), new eow0() { // from class: l.hiv0
            @Override // p153l.eow0
            public final Object apply(Object obj2) {
                wit0 wit0Var = wit0VarM155812a;
                if (q6w0Var.f155860N) {
                    wit0Var.mo13762s();
                }
                lsu0 lsu0Var = lsu0VarMo131473b;
                wit0Var.mo13758p0();
                wit0Var.onPause();
                return lsu0Var.mo111985k();
            }
        }, this.f132261e);
    }
}
