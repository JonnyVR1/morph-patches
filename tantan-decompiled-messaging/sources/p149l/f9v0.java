package p149l;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.zzcei;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class f9v0 implements j3v0 {

    /* JADX INFO: renamed from: a */
    public final Context f96528a;

    /* JADX INFO: renamed from: b */
    public final fku0 f96529b;

    /* JADX INFO: renamed from: c */
    public final jju0 f96530c;

    /* JADX INFO: renamed from: d */
    public final iyv0 f96531d;

    /* JADX INFO: renamed from: e */
    public final Executor f96532e;

    /* JADX INFO: renamed from: f */
    public final zzcei f96533f;

    /* JADX INFO: renamed from: g */
    public final xgs0 f96534g;

    /* JADX INFO: renamed from: h */
    public final boolean f96535h = ((Boolean) d1s0.m109677c().m144697a(m7s0.f131997M8)).booleanValue();

    /* JADX INFO: renamed from: i */
    public final k2v0 f96536i;

    public f9v0(Context context, zzcei zzceiVar, iyv0 iyv0Var, Executor executor, jju0 jju0Var, fku0 fku0Var, xgs0 xgs0Var, k2v0 k2v0Var) {
        this.f96528a = context;
        this.f96531d = iyv0Var;
        this.f96530c = jju0Var;
        this.f96532e = executor;
        this.f96533f = zzceiVar;
        this.f96529b = fku0Var;
        this.f96534g = xgs0Var;
        this.f96536i = k2v0Var;
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
        gnr gnrVarM142241n = jmw0.m142241n(jmw0.m142235h(null), new rlw0() { // from class: l.y8v0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return this.f196884a.m120129c(kxv0Var, vxv0Var, iku0Var, obj);
            }
        }, this.f96532e);
        gnrVarM142241n.addListener(new Runnable() { // from class: l.z8v0
            @Override // java.lang.Runnable
            public final void run() {
                iku0Var.m136899b();
            }
        }, this.f96532e);
        return gnrVarM142241n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gnr m120129c(final kxv0 kxv0Var, vxv0 vxv0Var, iku0 iku0Var, Object obj) throws Exception {
        final q9t0 q9t0VarM121894a = this.f96529b.m121894a(this.f96531d.f115495e, kxv0Var, vxv0Var.f183478b.f178773b);
        q9t0VarM121894a.mo13678b0(kxv0Var.f125180X);
        iku0Var.m136898a(this.f96528a, (View) q9t0VarM121894a);
        n3t0 n3t0Var = new n3t0();
        final fju0 fju0VarMo96733b = this.f96530c.mo96733b(new uqt0(vxv0Var, kxv0Var, null), new gju0(new e9v0(this.f96528a, this.f96529b, this.f96531d, this.f96533f, kxv0Var, n3t0Var, q9t0VarM121894a, this.f96534g, this.f96535h, this.f96536i), q9t0VarM121894a));
        n3t0Var.m157774b(fju0VarMo96733b);
        mhs0.m154637b(q9t0VarM121894a, fju0VarMo96733b.mo121631i());
        fju0VarMo96733b.mo96324b().m114710q0(new dyt0() { // from class: l.a9v0
            @Override // p149l.dyt0
            /* JADX INFO: renamed from: a */
            public final void mo95459a() {
                q9t0 q9t0Var = q9t0VarM121894a;
                if (q9t0Var.zzN() != null) {
                    q9t0Var.zzN().zzr();
                }
            }
        }, i3t0.f111377f);
        fju0VarMo96733b.mo121634l().m117003i(q9t0VarM121894a, true, this.f96535h ? this.f96534g : null);
        fju0VarMo96733b.mo121634l();
        oxv0 oxv0Var = kxv0Var.f125221t;
        return jmw0.m142240m(eku0.m116996j(q9t0VarM121894a, oxv0Var.f146254b, oxv0Var.f146253a), new yew0() { // from class: l.b9v0
            @Override // p149l.yew0
            public final Object apply(Object obj2) {
                q9t0 q9t0Var = q9t0VarM121894a;
                if (kxv0Var.f125170N) {
                    q9t0Var.mo13708s();
                }
                fju0 fju0Var = fju0VarMo96733b;
                q9t0Var.mo13704p0();
                q9t0Var.onPause();
                return fju0Var.mo121633k();
            }
        }, this.f96532e);
    }
}
