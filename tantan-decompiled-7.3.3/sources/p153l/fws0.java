package p153l;

import com.google.android.gms.internal.ads.zzbrm;

/* JADX INFO: loaded from: classes6.dex */
public final class fws0 {

    /* JADX INFO: renamed from: a */
    public final bvs0 f101202a;

    /* JADX INFO: renamed from: b */
    public hpr f101203b;

    public fws0(bvs0 bvs0Var) {
        this.f101202a = bvs0Var;
    }

    /* JADX INFO: renamed from: a */
    public final iws0 m127844a(String str, hvs0 hvs0Var, gvs0 gvs0Var) {
        m127847d();
        return new iws0(this.f101203b, "google.afma.activeView.handleUpdate", hvs0Var, gvs0Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m127845b(final String str, final bqs0 bqs0Var) {
        m127847d();
        this.f101203b = pvw0.m173987n(this.f101203b, new xuw0() { // from class: l.ews0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                cvs0 cvs0Var = (cvs0) obj;
                cvs0Var.mo112872q0(str, bqs0Var);
                return pvw0.m173981h(cvs0Var);
            }
        }, oct0.f146738f);
    }

    /* JADX INFO: renamed from: c */
    public final void m127846c(final String str, final bqs0 bqs0Var) {
        this.f101203b = pvw0.m173986m(this.f101203b, new eow0() { // from class: l.bws0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                cvs0 cvs0Var = (cvs0) obj;
                cvs0Var.mo112871k0(str, bqs0Var);
                return cvs0Var;
            }
        }, oct0.f146738f);
    }

    /* JADX INFO: renamed from: d */
    public final void m127847d() {
        if (this.f101203b == null) {
            final tct0 tct0Var = new tct0();
            this.f101203b = tct0Var;
            this.f101202a.m106605b(null).m149269e(new xct0() { // from class: l.cws0
                @Override // p153l.xct0
                public final void zza(Object obj) {
                    tct0Var.m190494b((cvs0) obj);
                }
            }, new vct0() { // from class: l.dws0
                @Override // p153l.vct0
                public final void zza() {
                    tct0Var.m190495c(new zzbrm("Cannot get Javascript Engine"));
                }
            });
        }
    }
}
