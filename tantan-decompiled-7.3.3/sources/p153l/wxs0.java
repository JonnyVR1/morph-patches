package p153l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class wxs0 implements t7y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jxs0 f191523a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bys0 f191524b;

    public wxs0(bys0 bys0Var, jxs0 jxs0Var) {
        this.f191523a = jxs0Var;
        this.f191524b = bys0Var;
    }

    @Override // p153l.t7y
    /* JADX INFO: renamed from: a */
    public final void mo95420a(b70 b70Var) {
        try {
            dct0.m115293b(this.f191524b.f79051a.getClass().getCanonicalName() + "failed to loaded mediation ad: ErrorCode = " + b70Var.m102802a() + ". ErrorMessage = " + b70Var.m102804c() + ". ErrorDomain = " + b70Var.m102803b());
            this.f191523a.mo118717N4(b70Var.m102805d());
            this.f191523a.mo118714G0(b70Var.m102802a(), b70Var.m102804c());
            this.f191523a.zzg(b70Var.m102802a());
        } catch (RemoteException e) {
            dct0.m115296e("", e);
        }
    }
}
