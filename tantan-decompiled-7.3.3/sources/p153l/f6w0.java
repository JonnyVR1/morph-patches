package p153l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class f6w0 implements gl50 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ e9u0 f97453a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h6w0 f97454b;

    public f6w0(h6w0 h6w0Var, e9u0 e9u0Var) {
        this.f97453a = e9u0Var;
        this.f97454b = h6w0Var;
    }

    @Override // p153l.gl50
    /* JADX INFO: renamed from: x */
    public final void mo124324x() {
        if (this.f97454b.f108062i != null) {
            try {
                this.f97453a.zze();
            } catch (RemoteException e) {
                dct0.m115300i("#007 Could not call remote method.", e);
            }
        }
    }
}
