package p153l;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbb;

/* JADX INFO: loaded from: classes6.dex */
public final class d8v0 implements lvw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ a4t0 f85691a;

    public d8v0(e8v0 e8v0Var, a4t0 a4t0Var) {
        this.f85691a = a4t0Var;
    }

    @Override // p153l.lvw0
    public final void zza(Throwable th) {
        try {
            this.f85691a.mo95989W(zzbb.m12398H(th));
        } catch (RemoteException e) {
            d2v0.m113738l("Ad service can't call client", e);
        }
    }

    @Override // p153l.lvw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.f85691a.mo95990a0((ParcelFileDescriptor) obj);
        } catch (RemoteException e) {
            d2v0.m113738l("Ad service can't call client", e);
        }
    }
}
