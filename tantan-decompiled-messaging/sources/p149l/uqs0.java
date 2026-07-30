package p149l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class uqs0 implements wyx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mps0 f177772a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dos0 f177773b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xqs0 f177774c;

    public uqs0(xqs0 xqs0Var, mps0 mps0Var, dos0 dos0Var) {
        this.f177772a = mps0Var;
        this.f177773b = dos0Var;
        this.f177774c = xqs0Var;
    }

    @Override // p149l.wyx
    /* JADX INFO: renamed from: a */
    public final void mo127630a(f70 f70Var) {
        try {
            this.f177772a.mo124428f(f70Var.m119706d());
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
        }
    }
}
