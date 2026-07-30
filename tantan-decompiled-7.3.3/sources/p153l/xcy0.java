package p153l;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzo;

/* JADX INFO: loaded from: classes6.dex */
public final class xcy0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f193500a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f193501b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzo f193502c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f193503d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ wmu0 f193504e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ hcy0 f193505f;

    public xcy0(hcy0 hcy0Var, String str, String str2, zzo zzoVar, boolean z, wmu0 wmu0Var) {
        this.f193500a = str;
        this.f193501b = str2;
        this.f193502c = zzoVar;
        this.f193503d = z;
        this.f193504e = wmu0Var;
        this.f193505f = hcy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = new Bundle();
        try {
            try {
                isw0 isw0Var = this.f193505f.f108759d;
                if (isw0Var == null) {
                    this.f193505f.zzj().m114558A().m153302c("Failed to get user properties; not connected to service", this.f193500a, this.f193501b);
                    this.f193505f.mo15143e().m136337M(this.f193504e, bundle);
                } else {
                    Preconditions.checkNotNull(this.f193502c);
                    Bundle bundleM136289A = hny0.m136289A(isw0Var.mo112709M7(this.f193500a, this.f193501b, this.f193503d, this.f193502c));
                    this.f193505f.m134527g0();
                    this.f193505f.mo15143e().m136337M(this.f193504e, bundleM136289A);
                }
            } catch (RemoteException e) {
                this.f193505f.zzj().m114558A().m153302c("Failed to get user properties; remote exception", this.f193500a, e);
                this.f193505f.mo15143e().m136337M(this.f193504e, bundle);
            }
        } catch (Throwable th) {
            this.f193505f.mo15143e().m136337M(this.f193504e, bundle);
            throw th;
        }
    }
}
