package p149l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class niv0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tjv0 f139162a;

    public niv0(tjv0 tjv0Var) {
        this.f139162a = tjv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tjv0 tjv0Var = this.f139162a;
        if (tjv0Var.f170800a != null) {
            try {
                tjv0Var.f170800a.zze(1);
            } catch (RemoteException e) {
                x2t0.m206870h("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
