package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbb;

/* JADX INFO: loaded from: classes6.dex */
public final class y3t0 extends p6s0 implements a4t0 {
    public y3t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override // p153l.a4t0
    /* JADX INFO: renamed from: W */
    public final void mo95989W(zzbb zzbbVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzbbVar);
        m171041Y2(2, parcelM171038O);
    }

    @Override // p153l.a4t0
    /* JADX INFO: renamed from: a0 */
    public final void mo95990a0(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, parcelFileDescriptor);
        m171041Y2(1, parcelM171038O);
    }
}
