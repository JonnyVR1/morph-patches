package p153l;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface k7m extends IInterface {
    /* JADX INFO: renamed from: A7 */
    void mo825A7(Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: D6 */
    Bundle mo826D6() throws RemoteException;

    /* JADX INFO: renamed from: L1 */
    Bundle mo827L1(Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: g5 */
    Bundle mo829g5(String str, Bundle bundle, IBinder iBinder) throws RemoteException;

    /* JADX INFO: renamed from: s7 */
    int mo830s7() throws RemoteException;

    /* JADX INFO: renamed from: u7 */
    Bundle mo831u7(Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: v5 */
    Bundle mo832v5() throws RemoteException;

    /* JADX INFO: renamed from: l.k7m$a */
    public static abstract class AbstractBinderC18114a extends Binder implements k7m {
        public AbstractBinderC18114a() {
            attachInterface(this, "android.support.customtabs.trusted.ITrustedWebActivityService");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 9) {
                parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                Bundle bundleMo829g5 = mo829g5(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readStrongBinder());
                parcel2.writeNoException();
                if (bundleMo829g5 != null) {
                    parcel2.writeInt(1);
                    bundleMo829g5.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            if (i == 1598968902) {
                parcel2.writeString("android.support.customtabs.trusted.ITrustedWebActivityService");
                return true;
            }
            switch (i) {
                case 2:
                    parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                    Bundle bundleMo827L1 = mo827L1(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (bundleMo827L1 != null) {
                        parcel2.writeInt(1);
                        bundleMo827L1.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                    mo825A7(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                    int iMo830s7 = mo830s7();
                    parcel2.writeNoException();
                    parcel2.writeInt(iMo830s7);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                    Bundle bundleMo826D6 = mo826D6();
                    parcel2.writeNoException();
                    if (bundleMo826D6 != null) {
                        parcel2.writeInt(1);
                        bundleMo826D6.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                    Bundle bundleMo831u7 = mo831u7(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (bundleMo831u7 != null) {
                        parcel2.writeInt(1);
                        bundleMo831u7.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                    Bundle bundleMo832v5 = mo832v5();
                    parcel2.writeNoException();
                    if (bundleMo832v5 != null) {
                        parcel2.writeInt(1);
                        bundleMo832v5.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
