package p149l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class pxs0 extends dps0 implements bvs0 {
    public pxs0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // p149l.bvs0
    public final Bundle zza(Bundle bundle) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190431d(parcelM112927O, bundle);
        Parcel parcelM112928P2 = m112928P2(1, parcelM112927O);
        Bundle bundle2 = (Bundle) trs0.m190428a(parcelM112928P2, Bundle.CREATOR);
        parcelM112928P2.recycle();
        return bundle2;
    }
}
