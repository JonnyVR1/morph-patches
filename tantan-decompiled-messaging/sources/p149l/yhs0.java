package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class yhs0 extends jxr0 implements ais0 {
    public yhs0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // p149l.ais0
    public final void zzb(String str) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeString(str);
        m143825Y2(1, parcelM143822O);
    }
}
