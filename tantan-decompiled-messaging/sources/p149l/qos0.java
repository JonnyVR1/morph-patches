package p149l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class qos0 implements wyx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dos0 f155630a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vos0 f155631b;

    public qos0(vos0 vos0Var, dos0 dos0Var) {
        this.f155630a = dos0Var;
        this.f155631b = vos0Var;
    }

    @Override // p149l.wyx
    /* JADX INFO: renamed from: a */
    public final void mo127630a(f70 f70Var) {
        try {
            x2t0.m206864b(this.f155631b.f182416a.getClass().getCanonicalName() + "failed to loaded mediation ad: ErrorCode = " + f70Var.m119703a() + ". ErrorMessage = " + f70Var.m119705c() + ". ErrorDomain = " + f70Var.m119704b());
            this.f155630a.mo105942N4(f70Var.m119706d());
            this.f155630a.mo105938G0(f70Var.m119703a(), f70Var.m119705c());
            this.f155630a.zzg(f70Var.m119703a());
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
        }
    }
}
