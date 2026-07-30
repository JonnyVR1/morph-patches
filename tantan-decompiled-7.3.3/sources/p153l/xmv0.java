package p153l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class xmv0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hpv0 f195334a;

    public xmv0(hpv0 hpv0Var) {
        this.f195334a = hpv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nqv0 nqv0Var = this.f195334a.f111052a;
        if (nqv0Var.f143261a != null) {
            try {
                nqv0Var.f143261a.zze(1);
            } catch (RemoteException e) {
                dct0.m115299h("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
