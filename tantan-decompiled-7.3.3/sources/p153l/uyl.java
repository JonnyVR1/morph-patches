package p153l;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes7.dex */
public abstract class uyl extends Binder implements vyl {
    public uyl() {
        attachInterface(this, "com.mcs.aidl.IMcsSdkService");
    }

    /* JADX INFO: renamed from: O */
    public static vyl m198666O(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.mcs.aidl.IMcsSdkService");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof vyl)) ? new tyl(iBinder) : (vyl) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.mcs.aidl.IMcsSdkService");
            return true;
        }
        parcel.enforceInterface("com.mcs.aidl.IMcsSdkService");
        mo193597i3(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
