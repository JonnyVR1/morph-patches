package p149l;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.zzcei;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class w5v0 implements j3v0 {

    /* JADX INFO: renamed from: a */
    public final Context f184767a;

    /* JADX INFO: renamed from: b */
    public final fku0 f184768b;

    /* JADX INFO: renamed from: c */
    public final j9u0 f184769c;

    /* JADX INFO: renamed from: d */
    public final iyv0 f184770d;

    /* JADX INFO: renamed from: e */
    public final Executor f184771e;

    /* JADX INFO: renamed from: f */
    public final zzcei f184772f;

    /* JADX INFO: renamed from: g */
    public final xgs0 f184773g;

    /* JADX INFO: renamed from: h */
    public final boolean f184774h = ((Boolean) d1s0.m109677c().m144697a(m7s0.f131997M8)).booleanValue();

    /* JADX INFO: renamed from: i */
    public final k2v0 f184775i;

    public w5v0(Context context, zzcei zzceiVar, iyv0 iyv0Var, Executor executor, j9u0 j9u0Var, fku0 fku0Var, xgs0 xgs0Var, k2v0 k2v0Var) {
        this.f184767a = context;
        this.f184770d = iyv0Var;
        this.f184769c = j9u0Var;
        this.f184771e = executor;
        this.f184772f = zzceiVar;
        this.f184768b = fku0Var;
        this.f184773g = xgs0Var;
        this.f184775i = k2v0Var;
    }

    @Override // p149l.j3v0
    /* JADX INFO: renamed from: a */
    public final boolean mo120127a(vxv0 vxv0Var, kxv0 kxv0Var) {
        oxv0 oxv0Var = kxv0Var.f125221t;
        return (oxv0Var == null || oxv0Var.f146253a == null) ? false : true;
    }

    @Override // p149l.j3v0
    /* JADX INFO: renamed from: b */
    public final gnr mo120128b(final vxv0 vxv0Var, final kxv0 kxv0Var) {
        final iku0 iku0Var = new iku0();
        gnr gnrVarM142241n = jmw0.m142241n(jmw0.m142235h(null), new rlw0() { // from class: l.t5v0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return this.f167879a.m201693c(kxv0Var, vxv0Var, iku0Var, obj);
            }
        }, this.f184771e);
        gnrVarM142241n.addListener(new Runnable() { // from class: l.u5v0
            @Override // java.lang.Runnable
            public final void run() {
                iku0Var.m136899b();
            }
        }, this.f184771e);
        return gnrVarM142241n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gnr m201693c(final kxv0 kxv0Var, vxv0 vxv0Var, iku0 iku0Var, Object obj) throws Exception {
        final q9t0 q9t0VarM121894a = this.f184768b.m121894a(this.f184770d.f115495e, kxv0Var, vxv0Var.f183478b.f178773b);
        q9t0VarM121894a.mo13678b0(kxv0Var.f125180X);
        iku0Var.m136898a(this.f184767a, (View) q9t0VarM121894a);
        n3t0 n3t0Var = new n3t0();
        final c8u0 c8u0VarMo116365c = this.f184769c.mo116365c(new uqt0(vxv0Var, kxv0Var, null), new f8u0(new v5v0(this.f184767a, this.f184772f, n3t0Var, kxv0Var, q9t0VarM121894a, this.f184770d, this.f184774h, this.f184773g, this.f184775i), q9t0VarM121894a));
        n3t0Var.m157774b(c8u0VarMo116365c);
        c8u0VarMo116365c.mo96324b().m114710q0(new dyt0() { // from class: l.r5v0
            @Override // p149l.dyt0
            /* JADX INFO: renamed from: a */
            public final void mo95459a() {
                q9t0 q9t0Var = q9t0VarM121894a;
                if (q9t0Var.zzN() != null) {
                    q9t0Var.zzN().zzr();
                }
            }
        }, i3t0.f111377f);
        c8u0VarMo116365c.mo96332k().m117003i(q9t0VarM121894a, true, this.f184774h ? this.f184773g : null);
        c8u0VarMo116365c.mo96332k();
        oxv0 oxv0Var = kxv0Var.f125221t;
        return jmw0.m142240m(eku0.m116996j(q9t0VarM121894a, oxv0Var.f146254b, oxv0Var.f146253a), new yew0() { // from class: l.s5v0
            @Override // p149l.yew0
            public final Object apply(Object obj2) {
                q9t0 q9t0Var = q9t0VarM121894a;
                if (kxv0Var.f125170N) {
                    q9t0Var.mo13708s();
                }
                c8u0 c8u0Var = c8u0VarMo116365c;
                q9t0Var.mo13704p0();
                q9t0Var.onPause();
                return c8u0Var.mo96330i();
            }
        }, this.f184771e);
    }
}
