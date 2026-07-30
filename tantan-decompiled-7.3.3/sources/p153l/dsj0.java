package p153l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class dsj0 {

    /* JADX INFO: renamed from: a */
    public final l7m f90492a;

    public dsj0(l7m l7mVar) {
        this.f90492a = l7mVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m117769a(boolean z) {
        try {
            this.f90492a.mo119164E5(z);
        } catch (RemoteException e) {
            v6k.m200076a(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m117770b(boolean z) {
        try {
            this.f90492a.mo119165m7(z);
        } catch (RemoteException e) {
            v6k.m200076a(e);
        }
    }
}
