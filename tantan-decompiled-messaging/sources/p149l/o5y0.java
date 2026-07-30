package p149l;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzo;

/* JADX INFO: loaded from: classes6.dex */
public final class o5y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzo f141959a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bundle f141960b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3y0 f141961c;

    public o5y0(b3y0 b3y0Var, zzo zzoVar, Bundle bundle) {
        this.f141959a = zzoVar;
        this.f141960b = bundle;
        this.f141961c = b3y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cjw0 cjw0Var = this.f141961c.f73268d;
        if (cjw0Var == null) {
            this.f141961c.zzj().m211412A().m123936a("Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f141959a);
            cjw0Var.mo107261K6(this.f141960b, this.f141959a);
        } catch (RemoteException e) {
            this.f141961c.zzj().m211412A().m123937b("Failed to send default event parameters to service", e);
        }
    }
}
