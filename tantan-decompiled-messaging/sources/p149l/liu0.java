package p149l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class liu0 extends vss0 implements weu0 {
    public liu0() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // p149l.vss0
    /* JADX INFO: renamed from: O */
    public final boolean mo110648O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Bundle bundle = (Bundle) trs0.m190428a(parcel, Bundle.CREATOR);
            long j = parcel.readLong();
            trs0.m190433f(parcel);
            mo131149G3(string, string2, bundle, j);
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
