package p153l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wnr0 extends f9s0 implements tmr0 {
    public wnr0() {
        super("com.google.android.gms.maps.internal.IOnMapClickListener");
    }

    @Override // p153l.f9s0
    /* JADX INFO: renamed from: O */
    public final boolean mo124686O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo189332N((LatLng) y5t0.m214319b(parcel, LatLng.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
