package p149l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes6.dex */
public abstract class qer0 extends zzr0 implements ndr0 {
    public qer0() {
        super("com.google.android.gms.maps.internal.IOnMapClickListener");
    }

    @Override // p149l.zzr0
    /* JADX INFO: renamed from: O */
    public final boolean mo102858O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo159041N((LatLng) sws0.m186357b(parcel, LatLng.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
