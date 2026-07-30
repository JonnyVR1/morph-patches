package p149l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public class kxr0 extends Binder implements IInterface {
    public kxr0(String str) {
        attachInterface(this, str);
    }

    /* JADX INFO: renamed from: n8 */
    public boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        throw null;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo98344n8(i, parcel, parcel2, i2);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
