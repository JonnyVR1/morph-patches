package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzo;

/* JADX INFO: loaded from: classes6.dex */
public final class ify0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzo f114720a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hcy0 f114721b;

    public ify0(hcy0 hcy0Var, zzo zzoVar) {
        this.f114720a = zzoVar;
        this.f114721b = hcy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        isw0 isw0Var = this.f114721b.f108759d;
        if (isw0Var == null) {
            this.f114721b.zzj().m114558A().m153300a("Failed to send consent settings to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f114720a);
            isw0Var.mo112708L6(this.f114720a);
            this.f114721b.m134527g0();
        } catch (RemoteException e) {
            this.f114721b.zzj().m114558A().m153301b("Failed to send consent settings to the service", e);
        }
    }
}
