package p149l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class tos0 implements wyx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dos0 f171406a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vos0 f171407b;

    public tos0(vos0 vos0Var, dos0 dos0Var) {
        this.f171406a = dos0Var;
        this.f171407b = vos0Var;
    }

    @Override // p149l.wyx
    /* JADX INFO: renamed from: a */
    public final void mo127630a(f70 f70Var) {
        try {
            x2t0.m206864b(this.f171407b.f182416a.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + f70Var.m119703a() + ". ErrorMessage = " + f70Var.m119705c() + ". ErrorDomain = " + f70Var.m119704b());
            this.f171406a.mo105942N4(f70Var.m119706d());
            this.f171406a.mo105938G0(f70Var.m119703a(), f70Var.m119705c());
            this.f171406a.zzg(f70Var.m119703a());
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
        }
    }
}
