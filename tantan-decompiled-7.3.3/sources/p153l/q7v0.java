package p153l;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbb;

/* JADX INFO: loaded from: classes6.dex */
public final class q7v0 implements lvw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ n4t0 f156006a;

    public q7v0(u7v0 u7v0Var, n4t0 n4t0Var) {
        this.f156006a = n4t0Var;
    }

    @Override // p153l.lvw0
    public final void zza(Throwable th) {
        try {
            this.f156006a.mo102537W(zzbb.m12398H(th));
        } catch (RemoteException e) {
            d2v0.m113738l("Service can't call client", e);
        }
    }

    @Override // p153l.lvw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.f156006a.mo102538a0((ParcelFileDescriptor) obj);
        } catch (RemoteException e) {
            d2v0.m113738l("Service can't call client", e);
        }
    }
}
