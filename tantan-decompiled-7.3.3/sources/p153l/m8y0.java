package p153l;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class m8y0 extends e9s0 implements ndy0 {
    public m8y0() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    @Override // p153l.e9s0
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            int i3 = parcel.readInt();
            String[] strArrCreateStringArray = parcel.createStringArray();
            x5t0.m209431b(parcel);
            mo109846m8(i3, strArrCreateStringArray);
        } else if (i == 2) {
            int i4 = parcel.readInt();
            String[] strArrCreateStringArray2 = parcel.createStringArray();
            x5t0.m209431b(parcel);
            mo109845V4(i4, strArrCreateStringArray2);
        } else {
            if (i != 3) {
                return false;
            }
            int i5 = parcel.readInt();
            PendingIntent pendingIntent = (PendingIntent) x5t0.m209430a(parcel, PendingIntent.CREATOR);
            x5t0.m209431b(parcel);
            mo109844M1(i5, pendingIntent);
        }
        return true;
    }
}
