package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class s1t0 extends p6s0 implements u1t0 {
    public s1t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    @Override // p153l.u1t0
    public final IBinder zze(p1m p1mVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        Parcel parcelM171039P2 = m171039P2(1, parcelM171038O);
        IBinder strongBinder = parcelM171039P2.readStrongBinder();
        parcelM171039P2.recycle();
        return strongBinder;
    }
}
