package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbb;

/* JADX INFO: loaded from: classes6.dex */
public final class vus0 extends jxr0 implements hvs0 {
    public vus0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // p149l.hvs0
    /* JADX INFO: renamed from: W */
    public final void mo113818W(zzbb zzbbVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzbbVar);
        m143825Y2(2, parcelM143822O);
    }

    @Override // p149l.hvs0
    /* JADX INFO: renamed from: a0 */
    public final void mo113819a0(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, parcelFileDescriptor);
        m143825Y2(1, parcelM143822O);
    }
}
