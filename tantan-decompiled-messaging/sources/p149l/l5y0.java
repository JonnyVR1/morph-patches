package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzo;

/* JADX INFO: loaded from: classes6.dex */
public final class l5y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzo f126215a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b3y0 f126216b;

    public l5y0(b3y0 b3y0Var, zzo zzoVar) {
        this.f126215a = zzoVar;
        this.f126216b = b3y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cjw0 cjw0Var = this.f126216b.f73268d;
        if (cjw0Var == null) {
            this.f126216b.zzj().m211417F().m123936a("Failed to send app backgrounded");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f126215a);
            cjw0Var.mo107271e7(this.f126215a);
            this.f126216b.m100127g0();
        } catch (RemoteException e) {
            this.f126216b.zzj().m211412A().m123937b("Failed to send app backgrounded to the service", e);
        }
    }
}
