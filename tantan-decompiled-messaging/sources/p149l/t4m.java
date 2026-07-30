package p149l;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface t4m extends IInterface {
    /* JADX INFO: renamed from: c8 */
    void m187218c8(String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: l.t4m$a */
    public static abstract class AbstractBinderC20106a extends Binder implements t4m {

        /* JADX INFO: renamed from: l.t4m$a$a */
        public static class a implements t4m {

            /* JADX INFO: renamed from: a */
            public IBinder f167736a;

            public a(IBinder iBinder) {
                this.f167736a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f167736a;
            }
        }

        public AbstractBinderC20106a() {
            attachInterface(this, "android.support.customtabs.trusted.ITrustedWebActivityCallback");
        }

        /* JADX INFO: renamed from: O */
        public static t4m m187219O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.trusted.ITrustedWebActivityCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof t4m)) ? new a(iBinder) : (t4m) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("android.support.customtabs.trusted.ITrustedWebActivityCallback");
                return true;
            }
            parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityCallback");
            m187218c8(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
