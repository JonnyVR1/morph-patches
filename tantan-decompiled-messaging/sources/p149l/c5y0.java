package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzo;

/* JADX INFO: loaded from: classes6.dex */
public final class c5y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzo f79429a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b3y0 f79430b;

    public c5y0(b3y0 b3y0Var, zzo zzoVar) {
        this.f79429a = zzoVar;
        this.f79430b = b3y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cjw0 cjw0Var = this.f79430b.f73268d;
        if (cjw0Var == null) {
            this.f79430b.zzj().m211412A().m123936a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f79429a);
            cjw0Var.mo107279t6(this.f79429a);
            this.f79430b.mo15095k().m189727D();
            this.f79430b.m100142K(cjw0Var, null, this.f79429a);
            this.f79430b.m100127g0();
        } catch (RemoteException e) {
            this.f79430b.zzj().m211412A().m123937b("Failed to send app launch to the service", e);
        }
    }
}
