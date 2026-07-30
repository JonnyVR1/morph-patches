package p153l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class zxs0 implements t7y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jxs0 f206516a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bys0 f206517b;

    public zxs0(bys0 bys0Var, jxs0 jxs0Var) {
        this.f206516a = jxs0Var;
        this.f206517b = bys0Var;
    }

    @Override // p153l.t7y
    /* JADX INFO: renamed from: a */
    public final void mo95420a(b70 b70Var) {
        try {
            dct0.m115293b(this.f206517b.f79051a.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + b70Var.m102802a() + ". ErrorMessage = " + b70Var.m102804c() + ". ErrorDomain = " + b70Var.m102803b());
            this.f206516a.mo118717N4(b70Var.m102805d());
            this.f206516a.mo118714G0(b70Var.m102802a(), b70Var.m102804c());
            this.f206516a.zzg(b70Var.m102802a());
        } catch (RemoteException e) {
            dct0.m115296e("", e);
        }
    }
}
