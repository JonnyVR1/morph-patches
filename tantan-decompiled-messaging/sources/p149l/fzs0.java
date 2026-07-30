package p149l;

import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class fzs0 extends lys0 {

    /* JADX INFO: renamed from: a */
    public final v0d0 f99996a;

    /* JADX INFO: renamed from: b */
    public final gzs0 f99997b;

    public fzs0(v0d0 v0d0Var, gzs0 gzs0Var) {
        this.f99996a = v0d0Var;
        this.f99997b = gzs0Var;
    }

    @Override // p149l.mys0
    /* JADX INFO: renamed from: f */
    public final void mo104644f(zze zzeVar) {
        v0d0 v0d0Var = this.f99996a;
        if (v0d0Var != null) {
            v0d0Var.mo9290a(zzeVar.m12251H());
        }
    }

    @Override // p149l.mys0
    public final void zzg() {
        gzs0 gzs0Var;
        v0d0 v0d0Var = this.f99996a;
        if (v0d0Var == null || (gzs0Var = this.f99997b) == null) {
            return;
        }
        v0d0Var.mo9291b(gzs0Var);
    }

    @Override // p149l.mys0
    public final void zze(int i) {
    }
}
