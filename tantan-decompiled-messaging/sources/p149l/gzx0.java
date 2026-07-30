package p149l;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gzx0 extends yzr0 implements h4y0 {
    public gzx0() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    @Override // p149l.yzr0
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            int i3 = parcel.readInt();
            String[] strArrCreateStringArray = parcel.createStringArray();
            rws0.m181447b(parcel);
            mo129343m8(i3, strArrCreateStringArray);
        } else if (i == 2) {
            int i4 = parcel.readInt();
            String[] strArrCreateStringArray2 = parcel.createStringArray();
            rws0.m181447b(parcel);
            mo129342V4(i4, strArrCreateStringArray2);
        } else {
            if (i != 3) {
                return false;
            }
            int i5 = parcel.readInt();
            PendingIntent pendingIntent = (PendingIntent) rws0.m181446a(parcel, PendingIntent.CREATOR);
            rws0.m181447b(parcel);
            mo129341M1(i5, pendingIntent);
        }
        return true;
    }
}
