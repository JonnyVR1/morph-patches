package p153l;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface vrl extends IInterface {
    /* JADX INFO: renamed from: I5 */
    void mo198725I5(String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: U0 */
    Bundle mo198726U0(String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: V3 */
    void mo198727V3(int i, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: X7 */
    void mo198728X7(String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: e8 */
    void mo198729e8(Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: h8 */
    void mo198730h8(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: l.vrl$a */
    public static abstract class AbstractBinderC20917a extends Binder implements vrl {

        /* JADX INFO: renamed from: l.vrl$a$a */
        public static class a implements vrl {

            /* JADX INFO: renamed from: b */
            public static vrl f185494b;

            /* JADX INFO: renamed from: a */
            public IBinder f185495a;

            public a(IBinder iBinder) {
                this.f185495a = iBinder;
            }

            @Override // p153l.vrl
            /* JADX INFO: renamed from: I5 */
            public void mo198725I5(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f185495a.transact(3, parcelObtain, parcelObtain2, 0) || AbstractBinderC20917a.m202513P2() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC20917a.m202513P2().mo198725I5(str, bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p153l.vrl
            /* JADX INFO: renamed from: U0 */
            public Bundle mo198726U0(String str, Bundle bundle) throws RemoteException {
                Bundle bundleMo198726U0;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f185495a.transact(7, parcelObtain, parcelObtain2, 0) || AbstractBinderC20917a.m202513P2() == null) {
                        parcelObtain2.readException();
                        bundleMo198726U0 = parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                    } else {
                        bundleMo198726U0 = AbstractBinderC20917a.m202513P2().mo198726U0(str, bundle);
                    }
                    return bundleMo198726U0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p153l.vrl
            /* JADX INFO: renamed from: V3 */
            public void mo198727V3(int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    parcelObtain.writeInt(i);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f185495a.transact(2, parcelObtain, parcelObtain2, 0) || AbstractBinderC20917a.m202513P2() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC20917a.m202513P2().mo198727V3(i, bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p153l.vrl
            /* JADX INFO: renamed from: X7 */
            public void mo198728X7(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f185495a.transact(5, parcelObtain, parcelObtain2, 0) || AbstractBinderC20917a.m202513P2() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC20917a.m202513P2().mo198728X7(str, bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f185495a;
            }

            @Override // p153l.vrl
            /* JADX INFO: renamed from: e8 */
            public void mo198729e8(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f185495a.transact(4, parcelObtain, parcelObtain2, 0) || AbstractBinderC20917a.m202513P2() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC20917a.m202513P2().mo198729e8(bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p153l.vrl
            /* JADX INFO: renamed from: h8 */
            public void mo198730h8(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    parcelObtain.writeInt(i);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f185495a.transact(6, parcelObtain, parcelObtain2, 0) || AbstractBinderC20917a.m202513P2() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC20917a.m202513P2().mo198730h8(i, uri, z, bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC20917a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        /* JADX INFO: renamed from: O */
        public static vrl m202512O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof vrl)) ? new a(iBinder) : (vrl) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: P2 */
        public static vrl m202513P2() {
            return a.f185494b;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
                return true;
            }
            switch (i) {
                case 2:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    mo198727V3(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    mo198725I5(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    mo198729e8(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    mo198728X7(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    mo198730h8(parcel.readInt(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    Bundle bundleMo198726U0 = mo198726U0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (bundleMo198726U0 != null) {
                        parcel2.writeInt(1);
                        bundleMo198726U0.writeToParcel(parcel2, 1);
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
