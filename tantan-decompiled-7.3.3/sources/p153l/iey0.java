package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzo;

/* JADX INFO: loaded from: classes6.dex */
public final class iey0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzo f114636a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hcy0 f114637b;

    public iey0(hcy0 hcy0Var, zzo zzoVar) {
        this.f114636a = zzoVar;
        this.f114637b = hcy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        isw0 isw0Var = this.f114637b.f108759d;
        if (isw0Var == null) {
            this.f114637b.zzj().m114558A().m153300a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f114636a);
            isw0Var.mo112722t6(this.f114636a);
            this.f114637b.mo15149k().m221820D();
            this.f114637b.m134542K(isw0Var, null, this.f114636a);
            this.f114637b.m134527g0();
        } catch (RemoteException e) {
            this.f114637b.zzj().m114558A().m153301b("Failed to send app launch to the service", e);
        }
    }
}
