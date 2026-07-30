package p153l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class m6w0 implements gl50 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ i3t0 f135036a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n6w0 f135037b;

    public m6w0(n6w0 n6w0Var, i3t0 i3t0Var) {
        this.f135036a = i3t0Var;
        this.f135037b = n6w0Var;
    }

    @Override // p153l.gl50
    /* JADX INFO: renamed from: x */
    public final void mo124324x() {
        if (this.f135037b.f140495d != null) {
            try {
                this.f135036a.zze();
            } catch (RemoteException e) {
                dct0.m115300i("#007 Could not call remote method.", e);
            }
        }
    }
}
