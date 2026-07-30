package p149l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class iqs0 implements wyx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sps0 f114546a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dos0 f114547b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xqs0 f114548c;

    public iqs0(xqs0 xqs0Var, sps0 sps0Var, dos0 dos0Var) {
        this.f114546a = sps0Var;
        this.f114547b = dos0Var;
        this.f114548c = xqs0Var;
    }

    @Override // p149l.wyx
    /* JADX INFO: renamed from: a */
    public final void mo127630a(f70 f70Var) {
        try {
            this.f114546a.mo110192f(f70Var.m119706d());
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
        }
    }
}
