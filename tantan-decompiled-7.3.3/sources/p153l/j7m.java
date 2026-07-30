package p153l;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface j7m extends IInterface {
    /* JADX INFO: renamed from: c8 */
    void m143784c8(String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: l.j7m$a */
    public static abstract class AbstractBinderC17892a extends Binder implements j7m {

        /* JADX INFO: renamed from: l.j7m$a$a */
        public static class a implements j7m {

            /* JADX INFO: renamed from: a */
            public IBinder f118697a;

            public a(IBinder iBinder) {
                this.f118697a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f118697a;
            }
        }

        public AbstractBinderC17892a() {
            attachInterface(this, "android.support.customtabs.trusted.ITrustedWebActivityCallback");
        }

        /* JADX INFO: renamed from: O */
        public static j7m m143785O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.trusted.ITrustedWebActivityCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof j7m)) ? new a(iBinder) : (j7m) iInterfaceQueryLocalInterface;
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
            m143784c8(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
