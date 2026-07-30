package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzo;

/* JADX INFO: loaded from: classes6.dex */
public final class z4y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzo f201723a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b3y0 f201724b;

    public z4y0(b3y0 b3y0Var, zzo zzoVar) {
        this.f201723a = zzoVar;
        this.f201724b = b3y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cjw0 cjw0Var = this.f201724b.f73268d;
        if (cjw0Var == null) {
            this.f201724b.zzj().m211412A().m123936a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f201723a);
            cjw0Var.mo107260J6(this.f201723a);
        } catch (RemoteException e) {
            this.f201724b.zzj().m211412A().m123937b("Failed to reset data on the service: remote exception", e);
        }
        this.f201724b.m100127g0();
    }
}
