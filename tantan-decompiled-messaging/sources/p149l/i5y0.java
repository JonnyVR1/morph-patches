package p149l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class i5y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ q1y0 f111660a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b3y0 f111661b;

    public i5y0(b3y0 b3y0Var, q1y0 q1y0Var) {
        this.f111660a = q1y0Var;
        this.f111661b = b3y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cjw0 cjw0Var = this.f111661b.f73268d;
        if (cjw0Var == null) {
            this.f111661b.zzj().m211412A().m123936a("Failed to send current screen to service");
            return;
        }
        try {
            q1y0 q1y0Var = this.f111660a;
            if (q1y0Var == null) {
                cjw0Var.mo107273j1(0L, null, null, this.f111661b.zza().getPackageName());
            } else {
                cjw0Var.mo107273j1(q1y0Var.f152180c, q1y0Var.f152178a, q1y0Var.f152179b, this.f111661b.zza().getPackageName());
            }
            this.f111661b.m100127g0();
        } catch (RemoteException e) {
            this.f111661b.zzj().m211412A().m123937b("Failed to send current screen to the service", e);
        }
    }
}
