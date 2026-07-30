package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hwr0 extends f9s0 implements dvr0 {
    public hwr0() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    @Override // p153l.f9s0
    /* JADX INFO: renamed from: O */
    public final boolean mo124686O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        sul xqw0Var;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            xqw0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            xqw0Var = iInterfaceQueryLocalInterface instanceof sul ? (sul) iInterfaceQueryLocalInterface : new xqw0(strongBinder);
        }
        mo15085K0(xqw0Var);
        parcel2.writeNoException();
        return true;
    }
}
