package p149l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public class flq0 extends Binder implements IInterface {
    public flq0() {
        attachInterface(this, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    /* JADX INFO: renamed from: O */
    public boolean mo98598O(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        throw null;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo98598O(i, parcel, parcel2);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
