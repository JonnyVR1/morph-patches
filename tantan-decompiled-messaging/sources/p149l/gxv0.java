package p149l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class gxv0 implements zc50 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cus0 f104930a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hxv0 f104931b;

    public gxv0(hxv0 hxv0Var, cus0 cus0Var) {
        this.f104930a = cus0Var;
        this.f104931b = hxv0Var;
    }

    @Override // p149l.zc50
    /* JADX INFO: renamed from: x */
    public final void mo128651x() {
        if (this.f104931b.f109933d != null) {
            try {
                this.f104930a.zze();
            } catch (RemoteException e) {
                x2t0.m206871i("#007 Could not call remote method.", e);
            }
        }
    }
}
