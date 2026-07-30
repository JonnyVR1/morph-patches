package p149l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class zwv0 implements zc50 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yzt0 f205290a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bxv0 f205291b;

    public zwv0(bxv0 bxv0Var, yzt0 yzt0Var) {
        this.f205290a = yzt0Var;
        this.f205291b = bxv0Var;
    }

    @Override // p149l.zc50
    /* JADX INFO: renamed from: x */
    public final void mo128651x() {
        if (this.f205291b.f77833i != null) {
            try {
                this.f205290a.zze();
            } catch (RemoteException e) {
                x2t0.m206871i("#007 Could not call remote method.", e);
            }
        }
    }
}
