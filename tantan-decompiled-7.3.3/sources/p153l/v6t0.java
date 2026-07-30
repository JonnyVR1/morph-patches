package p153l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class v6t0 extends jys0 implements h4t0 {
    public v6t0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // p153l.h4t0
    public final Bundle zza(Bundle bundle) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218155d(parcelM147618O, bundle);
        Parcel parcelM147619P2 = m147619P2(1, parcelM147618O);
        Bundle bundle2 = (Bundle) z0t0.m218152a(parcelM147619P2, Bundle.CREATOR);
        parcelM147619P2.recycle();
        return bundle2;
    }
}
