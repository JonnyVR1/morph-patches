package p153l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class rru0 extends b2t0 implements cou0 {
    public rru0() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // p153l.b2t0
    /* JADX INFO: renamed from: O */
    public final boolean mo102250O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Bundle bundle = (Bundle) z0t0.m218152a(parcel, Bundle.CREATOR);
            long j = parcel.readLong();
            z0t0.m218157f(parcel);
            mo111709G3(string, string2, bundle, j);
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            int iZza = zza();
            parcel2.writeNoException();
            parcel2.writeInt(iZza);
        }
        return true;
    }
}
