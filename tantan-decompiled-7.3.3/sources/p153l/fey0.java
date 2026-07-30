package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzo;

/* JADX INFO: loaded from: classes6.dex */
public final class fey0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzo f98725a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hcy0 f98726b;

    public fey0(hcy0 hcy0Var, zzo zzoVar) {
        this.f98725a = zzoVar;
        this.f98726b = hcy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        isw0 isw0Var = this.f98726b.f108759d;
        if (isw0Var == null) {
            this.f98726b.zzj().m114558A().m153300a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f98725a);
            isw0Var.mo112705J6(this.f98725a);
        } catch (RemoteException e) {
            this.f98726b.zzj().m114558A().m153301b("Failed to reset data on the service: remote exception", e);
        }
        this.f98726b.m134527g0();
    }
}
