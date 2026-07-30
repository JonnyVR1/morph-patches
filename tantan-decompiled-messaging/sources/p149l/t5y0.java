package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzo;

/* JADX INFO: loaded from: classes6.dex */
public final class t5y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzo f167890a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b3y0 f167891b;

    public t5y0(b3y0 b3y0Var, zzo zzoVar) {
        this.f167890a = zzoVar;
        this.f167891b = b3y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cjw0 cjw0Var = this.f167891b.f73268d;
        if (cjw0Var == null) {
            this.f167891b.zzj().m211412A().m123936a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f167890a);
            cjw0Var.mo107274j8(this.f167890a);
            this.f167891b.m100127g0();
        } catch (RemoteException e) {
            this.f167891b.zzj().m211412A().m123937b("Failed to send measurementEnabled to the service", e);
        }
    }
}
