package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class ers0 extends p6s0 implements grs0 {
    public ers0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // p153l.grs0
    public final void zzb(String str) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeString(str);
        m171041Y2(1, parcelM171038O);
    }
}
