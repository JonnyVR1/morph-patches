package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class its0 extends f9s0 implements zrs0 {
    public its0() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
    }

    @Override // p153l.f9s0
    /* JADX INFO: renamed from: O */
    public final boolean mo124686O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        h6m mys0Var;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            mys0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            mys0Var = iInterfaceQueryLocalInterface instanceof h6m ? (h6m) iInterfaceQueryLocalInterface : new mys0(strongBinder);
        }
        mo15086y0(mys0Var);
        parcel2.writeNoException();
        return true;
    }
}
