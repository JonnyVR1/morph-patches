package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzo;

/* JADX INFO: loaded from: classes6.dex */
public final class rey0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzo f162751a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hcy0 f162752b;

    public rey0(hcy0 hcy0Var, zzo zzoVar) {
        this.f162751a = zzoVar;
        this.f162752b = hcy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        isw0 isw0Var = this.f162752b.f108759d;
        if (isw0Var == null) {
            this.f162752b.zzj().m114563F().m153300a("Failed to send app backgrounded");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f162751a);
            isw0Var.mo112715e7(this.f162751a);
            this.f162752b.m134527g0();
        } catch (RemoteException e) {
            this.f162752b.zzj().m114558A().m153301b("Failed to send app backgrounded to the service", e);
        }
    }
}
