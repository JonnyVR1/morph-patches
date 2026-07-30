package p149l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class gqs0 implements wyx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pps0 f103978a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dos0 f103979b;

    public gqs0(xqs0 xqs0Var, pps0 pps0Var, dos0 dos0Var) {
        this.f103978a = pps0Var;
        this.f103979b = dos0Var;
    }

    @Override // p149l.wyx
    /* JADX INFO: renamed from: a */
    public final void mo127630a(f70 f70Var) {
        try {
            this.f103978a.mo160539f(f70Var.m119706d());
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
        }
    }
}
