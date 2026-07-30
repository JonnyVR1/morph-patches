package p149l;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbb;

/* JADX INFO: loaded from: classes6.dex */
public final class xyu0 implements fmw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ uus0 f195137a;

    public xyu0(yyu0 yyu0Var, uus0 uus0Var) {
        this.f195137a = uus0Var;
    }

    @Override // p149l.fmw0
    public final void zza(Throwable th) {
        try {
            this.f195137a.mo186026W(zzbb.m12344H(th));
        } catch (RemoteException e) {
            xsu0.m210835l("Ad service can't call client", e);
        }
    }

    @Override // p149l.fmw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.f195137a.mo186027a0((ParcelFileDescriptor) obj);
        } catch (RemoteException e) {
            xsu0.m210835l("Ad service can't call client", e);
        }
    }
}
