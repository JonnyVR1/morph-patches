package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bnr0 extends zzr0 implements xlr0 {
    public bnr0() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    @Override // p149l.zzr0
    /* JADX INFO: renamed from: O */
    public final boolean mo102858O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        esl rhw0Var;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            rhw0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            rhw0Var = iInterfaceQueryLocalInterface instanceof esl ? (esl) iInterfaceQueryLocalInterface : new rhw0(strongBinder);
        }
        mo15031K0(rhw0Var);
        parcel2.writeNoException();
        return true;
    }
}
