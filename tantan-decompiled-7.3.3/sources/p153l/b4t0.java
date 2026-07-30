package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbb;

/* JADX INFO: loaded from: classes6.dex */
public final class b4t0 extends p6s0 implements n4t0 {
    public b4t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // p153l.n4t0
    /* JADX INFO: renamed from: W */
    public final void mo102537W(zzbb zzbbVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzbbVar);
        m171041Y2(2, parcelM171038O);
    }

    @Override // p153l.n4t0
    /* JADX INFO: renamed from: a0 */
    public final void mo102538a0(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, parcelFileDescriptor);
        m171041Y2(1, parcelM171038O);
    }
}
