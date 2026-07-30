package p149l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public class aor0 extends Binder implements IInterface {
    public aor0(String str) {
        attachInterface(this, str);
    }

    /* JADX INFO: renamed from: O */
    public boolean mo97950O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        throw null;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo97950O(i, parcel, parcel2, i2);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
