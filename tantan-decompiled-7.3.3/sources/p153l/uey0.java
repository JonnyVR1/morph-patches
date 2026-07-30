package p153l;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzo;

/* JADX INFO: loaded from: classes6.dex */
public final class uey0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzo f178723a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bundle f178724b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hcy0 f178725c;

    public uey0(hcy0 hcy0Var, zzo zzoVar, Bundle bundle) {
        this.f178723a = zzoVar;
        this.f178724b = bundle;
        this.f178725c = hcy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        isw0 isw0Var = this.f178725c.f108759d;
        if (isw0Var == null) {
            this.f178725c.zzj().m114558A().m153300a("Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f178723a);
            isw0Var.mo112706K6(this.f178724b, this.f178723a);
        } catch (RemoteException e) {
            this.f178725c.zzj().m114558A().m153301b("Failed to send default event parameters to service", e);
        }
    }
}
