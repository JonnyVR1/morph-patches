package p153l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class trv0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zsv0 f175948a;

    public trv0(zsv0 zsv0Var) {
        this.f175948a = zsv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zsv0 zsv0Var = this.f175948a;
        if (zsv0Var.f205898a != null) {
            try {
                zsv0Var.f205898a.zze(1);
            } catch (RemoteException e) {
                dct0.m115299h("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
