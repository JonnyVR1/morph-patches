package p149l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class wqs0 implements wyx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yps0 f187726a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dos0 f187727b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xqs0 f187728c;

    public wqs0(xqs0 xqs0Var, yps0 yps0Var, dos0 dos0Var) {
        this.f187726a = yps0Var;
        this.f187727b = dos0Var;
        this.f187728c = xqs0Var;
    }

    @Override // p149l.wyx
    /* JADX INFO: renamed from: a */
    public final void mo127630a(f70 f70Var) {
        try {
            this.f187726a.mo158507f(f70Var.m119706d());
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
        }
    }
}
