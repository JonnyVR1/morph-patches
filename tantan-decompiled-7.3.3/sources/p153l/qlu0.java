package p153l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class qlu0 extends b2t0 implements wmu0 {
    public qlu0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // p153l.b2t0
    /* JADX INFO: renamed from: O */
    public final boolean mo102250O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) z0t0.m218152a(parcel, Bundle.CREATOR);
        z0t0.m218157f(parcel);
        zza(bundle);
        parcel2.writeNoException();
        return true;
    }
}
