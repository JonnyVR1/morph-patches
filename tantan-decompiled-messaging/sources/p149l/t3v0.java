package p149l;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.zzcei;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class t3v0 implements j3v0 {

    /* JADX INFO: renamed from: a */
    public final tmt0 f167658a;

    /* JADX INFO: renamed from: b */
    public final Context f167659b;

    /* JADX INFO: renamed from: c */
    public final fku0 f167660c;

    /* JADX INFO: renamed from: d */
    public final iyv0 f167661d;

    /* JADX INFO: renamed from: e */
    public final Executor f167662e;

    /* JADX INFO: renamed from: f */
    public final zzcei f167663f;

    /* JADX INFO: renamed from: g */
    public final xgs0 f167664g;

    /* JADX INFO: renamed from: h */
    public final boolean f167665h = ((Boolean) d1s0.m109677c().m144697a(m7s0.f131997M8)).booleanValue();

    /* JADX INFO: renamed from: i */
    public final k2v0 f167666i;

    public t3v0(tmt0 tmt0Var, Context context, Executor executor, fku0 fku0Var, iyv0 iyv0Var, zzcei zzceiVar, xgs0 xgs0Var, k2v0 k2v0Var) {
        this.f167659b = context;
        this.f167658a = tmt0Var;
        this.f167662e = executor;
        this.f167660c = fku0Var;
        this.f167661d = iyv0Var;
        this.f167663f = zzceiVar;
        this.f167664g = xgs0Var;
        this.f167666i = k2v0Var;
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
        gnr gnrVarM142241n = jmw0.m142241n(jmw0.m142235h(null), new rlw0() { // from class: l.p3v0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return this.f147018a.m187127c(kxv0Var, vxv0Var, iku0Var, obj);
            }
        }, this.f167662e);
        gnrVarM142241n.addListener(new Runnable() { // from class: l.q3v0
            @Override // java.lang.Runnable
            public final void run() {
                iku0Var.m136899b();
            }
        }, this.f167662e);
        return gnrVarM142241n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gnr m187127c(final kxv0 kxv0Var, vxv0 vxv0Var, iku0 iku0Var, Object obj) throws Exception {
        final q9t0 q9t0VarM121894a = this.f167660c.m121894a(this.f167661d.f115495e, kxv0Var, vxv0Var.f183478b.f178773b);
        q9t0VarM121894a.mo13678b0(kxv0Var.f125180X);
        iku0Var.m136898a(this.f167659b, (View) q9t0VarM121894a);
        n3t0 n3t0Var = new n3t0();
        final qmt0 qmt0VarMo164021a = this.f167658a.mo164021a(new uqt0(vxv0Var, kxv0Var, null), new f8u0(new b4v0(this.f167663f, n3t0Var, kxv0Var, q9t0VarM121894a, this.f167661d, this.f167665h, this.f167664g, this.f167666i), q9t0VarM121894a), new rmt0(kxv0Var.f125186b0));
        qmt0VarMo164021a.mo145805j().m117003i(q9t0VarM121894a, false, this.f167665h ? this.f167664g : null);
        n3t0Var.m157774b(qmt0VarMo164021a);
        qmt0VarMo164021a.mo96324b().m114710q0(new dyt0() { // from class: l.r3v0
            @Override // p149l.dyt0
            /* JADX INFO: renamed from: a */
            public final void mo95459a() {
                q9t0 q9t0Var = q9t0VarM121894a;
                if (q9t0Var.zzN() != null) {
                    q9t0Var.zzN().zzr();
                }
            }
        }, i3t0.f111377f);
        qmt0VarMo164021a.mo145805j();
        oxv0 oxv0Var = kxv0Var.f125221t;
        return jmw0.m142240m(eku0.m116996j(q9t0VarM121894a, oxv0Var.f146254b, oxv0Var.f146253a), new yew0() { // from class: l.s3v0
            @Override // p149l.yew0
            public final Object apply(Object obj2) {
                q9t0 q9t0Var = q9t0VarM121894a;
                if (kxv0Var.f125170N) {
                    q9t0Var.mo13708s();
                }
                qmt0 qmt0Var = qmt0VarMo164021a;
                q9t0Var.mo13704p0();
                q9t0Var.onPause();
                return qmt0Var.mo145803h();
            }
        }, this.f167662e);
    }
}
