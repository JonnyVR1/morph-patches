package p149l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class ros0 implements wyx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dos0 f160414a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vos0 f160415b;

    public ros0(vos0 vos0Var, dos0 dos0Var) {
        this.f160414a = dos0Var;
        this.f160415b = vos0Var;
    }

    @Override // p149l.wyx
    /* JADX INFO: renamed from: a */
    public final void mo127630a(f70 f70Var) {
        try {
            x2t0.m206864b(this.f160415b.f182416a.getClass().getCanonicalName() + "failed to loaded mediation ad: ErrorCode = " + f70Var.m119703a() + ". ErrorMessage = " + f70Var.m119705c() + ". ErrorDomain = " + f70Var.m119704b());
            this.f160414a.mo105942N4(f70Var.m119706d());
            this.f160414a.mo105938G0(f70Var.m119703a(), f70Var.m119705c());
            this.f160414a.zzg(f70Var.m119703a());
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
        }
    }
}
