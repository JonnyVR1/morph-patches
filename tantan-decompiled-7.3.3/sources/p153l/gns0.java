package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class gns0 extends p6s0 implements ins0 {
    public gns0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    @Override // p153l.ins0
    public final boolean zze(p1m p1mVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        Parcel parcelM171039P2 = m171039P2(2, parcelM171038O);
        boolean zM180045g = r6s0.m180045g(parcelM171039P2);
        parcelM171039P2.recycle();
        return zM180045g;
    }
}
