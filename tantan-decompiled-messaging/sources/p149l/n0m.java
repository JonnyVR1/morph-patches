package p149l;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface n0m extends IInterface {
    /* JADX INFO: renamed from: H5 */
    void mo822H5(ipl iplVar, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: x6 */
    void mo823x6(ipl iplVar, String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: l.n0m$a */
    public static abstract class AbstractBinderC18600a extends Binder implements n0m {
        public AbstractBinderC18600a() {
            attachInterface(this, "android.support.customtabs.IPostMessageService");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 2) {
                parcel.enforceInterface("android.support.customtabs.IPostMessageService");
                mo822H5(ipl.AbstractBinderC17605a.m137561O(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i != 3) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("android.support.customtabs.IPostMessageService");
                return true;
            }
            parcel.enforceInterface("android.support.customtabs.IPostMessageService");
            mo823x6(ipl.AbstractBinderC17605a.m137561O(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
