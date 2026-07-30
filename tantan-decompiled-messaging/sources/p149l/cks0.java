package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class cks0 extends zzr0 implements tis0 {
    public cks0() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
    }

    @Override // p149l.zzr0
    /* JADX INFO: renamed from: O */
    public final boolean mo102858O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        q3m gps0Var;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            gps0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            gps0Var = iInterfaceQueryLocalInterface instanceof q3m ? (q3m) iInterfaceQueryLocalInterface : new gps0(strongBinder);
        }
        mo15032y0(gps0Var);
        parcel2.writeNoException();
        return true;
    }
}
