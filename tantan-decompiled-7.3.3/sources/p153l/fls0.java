package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class fls0 extends p6s0 implements hls0 {
    public fls0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    @Override // p153l.hls0
    /* JADX INFO: renamed from: i1 */
    public final IBinder mo126168i1(p1m p1mVar, p1m p1mVar2, p1m p1mVar3, int i) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180044f(parcelM171038O, p1mVar2);
        r6s0.m180044f(parcelM171038O, p1mVar3);
        parcelM171038O.writeInt(240304000);
        Parcel parcelM171039P2 = m171039P2(1, parcelM171038O);
        IBinder strongBinder = parcelM171039P2.readStrongBinder();
        parcelM171039P2.recycle();
        return strongBinder;
    }
}
