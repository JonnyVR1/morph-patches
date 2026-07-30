package p153l;

import android.os.RemoteException;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public final class uxs0 implements t7y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jxs0 f181492a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b80 f181493b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bys0 f181494c;

    public uxs0(bys0 bys0Var, jxs0 jxs0Var, b80 b80Var) {
        this.f181492a = jxs0Var;
        this.f181493b = b80Var;
        this.f181494c = bys0Var;
    }

    @Override // p153l.t7y
    /* JADX INFO: renamed from: a */
    public final void mo95420a(@NonNull b70 b70Var) {
        try {
            dct0.m115293b(this.f181493b.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + b70Var.m102802a() + ". ErrorMessage = " + b70Var.m102804c() + ". ErrorDomain = " + b70Var.m102803b());
            this.f181492a.mo118717N4(b70Var.m102805d());
            this.f181492a.mo118714G0(b70Var.m102802a(), b70Var.m102804c());
            this.f181492a.zzg(b70Var.m102802a());
        } catch (RemoteException e) {
            dct0.m115296e("", e);
        }
    }
}
