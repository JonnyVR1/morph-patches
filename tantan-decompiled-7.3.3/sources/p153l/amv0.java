package p153l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class amv0 implements har0, ggu0 {

    /* JADX INFO: renamed from: a */
    public tes0 f72274a;

    /* JADX INFO: renamed from: b */
    public final synchronized void m98859b(tes0 tes0Var) {
        this.f72274a = tes0Var;
    }

    @Override // p153l.har0
    public final synchronized void onAdClicked() {
        tes0 tes0Var = this.f72274a;
        if (tes0Var != null) {
            try {
                tes0Var.zzb();
            } catch (RemoteException e) {
                dct0.m115299h("Remote Exception at onAdClicked.", e);
            }
        }
    }

    @Override // p153l.ggu0
    public final synchronized void zzbo() {
    }

    @Override // p153l.ggu0
    public final synchronized void zzs() {
        tes0 tes0Var = this.f72274a;
        if (tes0Var != null) {
            try {
                tes0Var.zzb();
            } catch (RemoteException e) {
                dct0.m115299h("Remote Exception at onPhysicalClick.", e);
            }
        }
    }
}
