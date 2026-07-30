package p149l;

import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class j9x0 extends ibs0 {

    /* JADX INFO: renamed from: a */
    public final i70 f116984a;

    /* JADX INFO: renamed from: b */
    public final Object f116985b;

    public j9x0(i70 i70Var, Object obj) {
        this.f116984a = i70Var;
        this.f116985b = obj;
    }

    @Override // p149l.ocs0
    /* JADX INFO: renamed from: t0 */
    public final void mo95571t0(zze zzeVar) {
        i70 i70Var = this.f116984a;
        if (i70Var != null) {
            i70Var.mo9290a(zzeVar.m12251H());
        }
    }

    @Override // p149l.ocs0
    public final void zzc() {
        Object obj;
        i70 i70Var = this.f116984a;
        if (i70Var == null || (obj = this.f116985b) == null) {
            return;
        }
        i70Var.mo9291b(obj);
    }
}
