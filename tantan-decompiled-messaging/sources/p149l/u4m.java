package p149l;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface u4m extends IInterface {
    /* JADX INFO: renamed from: A7 */
    void mo824A7(Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: D6 */
    Bundle mo825D6() throws RemoteException;

    /* JADX INFO: renamed from: L1 */
    Bundle mo826L1(Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: g5 */
    Bundle mo828g5(String str, Bundle bundle, IBinder iBinder) throws RemoteException;

    /* JADX INFO: renamed from: s7 */
    int mo829s7() throws RemoteException;

    /* JADX INFO: renamed from: u7 */
    Bundle mo830u7(Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: v5 */
    Bundle mo831v5() throws RemoteException;

    /* JADX INFO: renamed from: l.u4m$a */
    public static abstract class AbstractBinderC20354a extends Binder implements u4m {
        public AbstractBinderC20354a() {
            attachInterface(this, "android.support.customtabs.trusted.ITrustedWebActivityService");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 9) {
                parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                Bundle bundleMo828g5 = mo828g5(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readStrongBinder());
                parcel2.writeNoException();
                if (bundleMo828g5 != null) {
                    parcel2.writeInt(1);
                    bundleMo828g5.writeToParcel(parcel2, 1);
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
                    Bundle bundleMo826L1 = mo826L1(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (bundleMo826L1 != null) {
                        parcel2.writeInt(1);
                        bundleMo826L1.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                    mo824A7(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                    int iMo829s7 = mo829s7();
                    parcel2.writeNoException();
                    parcel2.writeInt(iMo829s7);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                    Bundle bundleMo825D6 = mo825D6();
                    parcel2.writeNoException();
                    if (bundleMo825D6 != null) {
                        parcel2.writeInt(1);
                        bundleMo825D6.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                    Bundle bundleMo830u7 = mo830u7(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (bundleMo830u7 != null) {
                        parcel2.writeInt(1);
                        bundleMo830u7.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                    Bundle bundleMo831v5 = mo831v5();
                    parcel2.writeNoException();
                    if (bundleMo831v5 != null) {
                        parcel2.writeInt(1);
                        bundleMo831v5.writeToParcel(parcel2, 1);
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
