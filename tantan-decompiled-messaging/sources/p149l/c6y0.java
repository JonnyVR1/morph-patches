package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzo;

/* JADX INFO: loaded from: classes6.dex */
public final class c6y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzo f79581a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b3y0 f79582b;

    public c6y0(b3y0 b3y0Var, zzo zzoVar) {
        this.f79581a = zzoVar;
        this.f79582b = b3y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cjw0 cjw0Var = this.f79582b.f73268d;
        if (cjw0Var == null) {
            this.f79582b.zzj().m211412A().m123936a("Failed to send consent settings to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f79581a);
            cjw0Var.mo107263L6(this.f79581a);
            this.f79582b.m100127g0();
        } catch (RemoteException e) {
            this.f79582b.zzj().m211412A().m123937b("Failed to send consent settings to the service", e);
        }
    }
}
