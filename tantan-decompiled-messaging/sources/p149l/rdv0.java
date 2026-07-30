package p149l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class rdv0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bgv0 f159014a;

    public rdv0(bgv0 bgv0Var) {
        this.f159014a = bgv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hhv0 hhv0Var = this.f159014a.f75527a;
        if (hhv0Var.f107828a != null) {
            try {
                hhv0Var.f107828a.zze(1);
            } catch (RemoteException e) {
                x2t0.m206870h("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
