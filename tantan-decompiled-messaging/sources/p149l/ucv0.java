package p149l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class ucv0 implements b1r0, a7u0 {

    /* JADX INFO: renamed from: a */
    public n5s0 f175867a;

    /* JADX INFO: renamed from: b */
    public final synchronized void m193105b(n5s0 n5s0Var) {
        this.f175867a = n5s0Var;
    }

    @Override // p149l.b1r0
    public final synchronized void onAdClicked() {
        n5s0 n5s0Var = this.f175867a;
        if (n5s0Var != null) {
            try {
                n5s0Var.zzb();
            } catch (RemoteException e) {
                x2t0.m206870h("Remote Exception at onAdClicked.", e);
            }
        }
    }

    @Override // p149l.a7u0
    public final synchronized void zzbo() {
    }

    @Override // p149l.a7u0
    public final synchronized void zzs() {
        n5s0 n5s0Var = this.f175867a;
        if (n5s0Var != null) {
            try {
                n5s0Var.zzb();
            } catch (RemoteException e) {
                x2t0.m206870h("Remote Exception at onPhysicalClick.", e);
            }
        }
    }
}
