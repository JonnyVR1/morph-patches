package p149l;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbb;

/* JADX INFO: loaded from: classes6.dex */
public final class kyu0 implements fmw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hvs0 f125337a;

    public kyu0(oyu0 oyu0Var, hvs0 hvs0Var) {
        this.f125337a = hvs0Var;
    }

    @Override // p149l.fmw0
    public final void zza(Throwable th) {
        try {
            this.f125337a.mo113818W(zzbb.m12344H(th));
        } catch (RemoteException e) {
            xsu0.m210835l("Service can't call client", e);
        }
    }

    @Override // p149l.fmw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.f125337a.mo113819a0((ParcelFileDescriptor) obj);
        } catch (RemoteException e) {
            xsu0.m210835l("Service can't call client", e);
        }
    }
}
