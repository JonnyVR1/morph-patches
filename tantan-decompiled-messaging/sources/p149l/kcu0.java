package p149l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kcu0 extends vss0 implements qdu0 {
    public kcu0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // p149l.vss0
    /* JADX INFO: renamed from: O */
    public final boolean mo110648O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) trs0.m190428a(parcel, Bundle.CREATOR);
        trs0.m190433f(parcel);
        zza(bundle);
        parcel2.writeNoException();
        return true;
    }
}
