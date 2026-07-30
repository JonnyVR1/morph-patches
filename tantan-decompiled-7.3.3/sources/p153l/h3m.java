package p153l;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface h3m extends IInterface {
    /* JADX INFO: renamed from: H5 */
    void mo823H5(vrl vrlVar, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: x6 */
    void mo824x6(vrl vrlVar, String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: l.h3m$a */
    public static abstract class AbstractBinderC17380a extends Binder implements h3m {
        public AbstractBinderC17380a() {
            attachInterface(this, "android.support.customtabs.IPostMessageService");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 2) {
                parcel.enforceInterface("android.support.customtabs.IPostMessageService");
                mo823H5(vrl.AbstractBinderC20917a.m202512O(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
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
            mo824x6(vrl.AbstractBinderC20917a.m202512O(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
