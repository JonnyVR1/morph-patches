package p153l;

import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class pix0 extends oks0 {

    /* JADX INFO: renamed from: a */
    public final e70 f152626a;

    /* JADX INFO: renamed from: b */
    public final Object f152627b;

    public pix0(e70 e70Var, Object obj) {
        this.f152626a = e70Var;
        this.f152627b = obj;
    }

    @Override // p153l.uls0
    /* JADX INFO: renamed from: t0 */
    public final void mo130546t0(zze zzeVar) {
        e70 e70Var = this.f152626a;
        if (e70Var != null) {
            e70Var.mo9344a(zzeVar.m12305H());
        }
    }

    @Override // p153l.uls0
    public final void zzc() {
        Object obj;
        e70 e70Var = this.f152626a;
        if (e70Var == null || (obj = this.f152627b) == null) {
            return;
        }
        e70Var.mo9345b(obj);
    }
}
