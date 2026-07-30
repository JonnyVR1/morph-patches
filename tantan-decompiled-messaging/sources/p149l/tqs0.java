package p149l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class tqs0 implements wyx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vps0 f171621a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dos0 f171622b;

    public tqs0(xqs0 xqs0Var, vps0 vps0Var, dos0 dos0Var) {
        this.f171621a = vps0Var;
        this.f171622b = dos0Var;
    }

    @Override // p149l.wyx
    /* JADX INFO: renamed from: a */
    public final void mo127630a(f70 f70Var) {
        try {
            this.f171621a.mo190007f(f70Var.m119706d());
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
        }
    }
}
