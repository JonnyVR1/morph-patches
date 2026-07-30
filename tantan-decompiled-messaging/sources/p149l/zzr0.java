package p149l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public class zzr0 extends Binder implements IInterface {
    public zzr0(String str) {
        attachInterface(this, str);
    }

    /* JADX INFO: renamed from: O */
    public boolean mo102858O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        throw null;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean zOnTransact;
        if (i > 16777215) {
            zOnTransact = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            zOnTransact = false;
        }
        if (zOnTransact) {
            return true;
        }
        return mo102858O(i, parcel, parcel2, i2);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
