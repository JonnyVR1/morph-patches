package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzo;

/* JADX INFO: loaded from: classes6.dex */
public final class zey0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzo f204094a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hcy0 f204095b;

    public zey0(hcy0 hcy0Var, zzo zzoVar) {
        this.f204094a = zzoVar;
        this.f204095b = hcy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        isw0 isw0Var = this.f204095b.f108759d;
        if (isw0Var == null) {
            this.f204095b.zzj().m114558A().m153300a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f204094a);
            isw0Var.mo112718j8(this.f204094a);
            this.f204095b.m134527g0();
        } catch (RemoteException e) {
            this.f204095b.zzj().m114558A().m153301b("Failed to send measurementEnabled to the service", e);
        }
    }
}
