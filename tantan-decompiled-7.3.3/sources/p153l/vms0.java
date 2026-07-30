package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;

/* JADX INFO: loaded from: classes6.dex */
public final class vms0 extends p6s0 implements lps0 {
    public vms0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // p153l.lps0
    /* JADX INFO: renamed from: l3 */
    public final void mo136584l3(zzl zzlVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzlVar);
        m171041Y2(1, parcelM171038O);
    }
}
