package p153l;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface wrl extends IInterface {
    /* JADX INFO: renamed from: B1 */
    boolean mo810B1(vrl vrlVar, Uri uri, int i, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: C0 */
    boolean mo811C0(vrl vrlVar) throws RemoteException;

    /* JADX INFO: renamed from: Q3 */
    boolean mo813Q3(vrl vrlVar, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: T2 */
    int mo814T2(vrl vrlVar, String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: U5 */
    boolean mo815U5(vrl vrlVar, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: V2 */
    boolean mo816V2(vrl vrlVar, Uri uri, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: Z4 */
    Bundle mo817Z4(String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: a4 */
    boolean mo818a4(vrl vrlVar, int i, Uri uri, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: r3 */
    boolean mo820r3(long j) throws RemoteException;

    /* JADX INFO: renamed from: u2 */
    boolean mo821u2(vrl vrlVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    /* JADX INFO: renamed from: z7 */
    boolean mo822z7(vrl vrlVar, Uri uri) throws RemoteException;

    /* JADX INFO: renamed from: l.wrl$a */
    public static abstract class AbstractBinderC21172a extends Binder implements wrl {

        /* JADX INFO: renamed from: l.wrl$a$a */
        public static class a implements wrl {

            /* JADX INFO: renamed from: b */
            public static wrl f190527b;

            /* JADX INFO: renamed from: a */
            public IBinder f190528a;

            public a(IBinder iBinder) {
                this.f190528a = iBinder;
            }

            @Override // p153l.wrl
            /* JADX INFO: renamed from: C0 */
            public boolean mo811C0(vrl vrlVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(vrlVar != null ? vrlVar.asBinder() : null);
                    if (!this.f190528a.transact(3, parcelObtain, parcelObtain2, 0) && AbstractBinderC21172a.m207603P2() != null) {
                        return AbstractBinderC21172a.m207603P2().mo811C0(vrlVar);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p153l.wrl
            /* JADX INFO: renamed from: Q3 */
            public boolean mo813Q3(vrl vrlVar, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(vrlVar != null ? vrlVar.asBinder() : null);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f190528a.transact(10, parcelObtain, parcelObtain2, 0) && AbstractBinderC21172a.m207603P2() != null) {
                        return AbstractBinderC21172a.m207603P2().mo813Q3(vrlVar, bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p153l.wrl
            /* JADX INFO: renamed from: T2 */
            public int mo814T2(vrl vrlVar, String str, Bundle bundle) throws RemoteException {
                int iMo814T2;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(vrlVar != null ? vrlVar.asBinder() : null);
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f190528a.transact(8, parcelObtain, parcelObtain2, 0) || AbstractBinderC21172a.m207603P2() == null) {
                        parcelObtain2.readException();
                        iMo814T2 = parcelObtain2.readInt();
                    } else {
                        iMo814T2 = AbstractBinderC21172a.m207603P2().mo814T2(vrlVar, str, bundle);
                    }
                    return iMo814T2;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p153l.wrl
            /* JADX INFO: renamed from: V2 */
            public boolean mo816V2(vrl vrlVar, Uri uri, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(vrlVar != null ? vrlVar.asBinder() : null);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f190528a.transact(11, parcelObtain, parcelObtain2, 0) && AbstractBinderC21172a.m207603P2() != null) {
                        return AbstractBinderC21172a.m207603P2().mo816V2(vrlVar, uri, bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f190528a;
            }

            @Override // p153l.wrl
            /* JADX INFO: renamed from: r3 */
            public boolean mo820r3(long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeLong(j);
                    if (!this.f190528a.transact(2, parcelObtain, parcelObtain2, 0) && AbstractBinderC21172a.m207603P2() != null) {
                        return AbstractBinderC21172a.m207603P2().mo820r3(j);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p153l.wrl
            /* JADX INFO: renamed from: u2 */
            public boolean mo821u2(vrl vrlVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(vrlVar != null ? vrlVar.asBinder() : null);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeTypedList(list);
                    if (!this.f190528a.transact(4, parcelObtain, parcelObtain2, 0) && AbstractBinderC21172a.m207603P2() != null) {
                        return AbstractBinderC21172a.m207603P2().mo821u2(vrlVar, uri, bundle, list);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p153l.wrl
            /* JADX INFO: renamed from: z7 */
            public boolean mo822z7(vrl vrlVar, Uri uri) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(vrlVar != null ? vrlVar.asBinder() : null);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f190528a.transact(7, parcelObtain, parcelObtain2, 0) && AbstractBinderC21172a.m207603P2() != null) {
                        return AbstractBinderC21172a.m207603P2().mo822z7(vrlVar, uri);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC21172a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsService");
        }

        /* JADX INFO: renamed from: O */
        public static wrl m207602O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof wrl)) ? new a(iBinder) : (wrl) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: P2 */
        public static wrl m207603P2() {
            return a.f190527b;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString("android.support.customtabs.ICustomTabsService");
                return true;
            }
            switch (i) {
                case 2:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zMo820r3 = mo820r3(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo820r3 ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zMo811C0 = mo811C0(vrl.AbstractBinderC20917a.m202512O(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo811C0 ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zMo821u2 = mo821u2(vrl.AbstractBinderC20917a.m202512O(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.createTypedArrayList(Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo821u2 ? 1 : 0);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    Bundle bundleMo817Z4 = mo817Z4(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (bundleMo817Z4 != null) {
                        parcel2.writeInt(1);
                        bundleMo817Z4.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zMo815U5 = mo815U5(vrl.AbstractBinderC20917a.m202512O(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo815U5 ? 1 : 0);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zMo822z7 = mo822z7(vrl.AbstractBinderC20917a.m202512O(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo822z7 ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    int iMo814T2 = mo814T2(vrl.AbstractBinderC20917a.m202512O(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(iMo814T2);
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zMo818a4 = mo818a4(vrl.AbstractBinderC20917a.m202512O(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo818a4 ? 1 : 0);
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zMo813Q3 = mo813Q3(vrl.AbstractBinderC20917a.m202512O(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo813Q3 ? 1 : 0);
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zMo816V2 = mo816V2(vrl.AbstractBinderC20917a.m202512O(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo816V2 ? 1 : 0);
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zMo810B1 = mo810B1(vrl.AbstractBinderC20917a.m202512O(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo810B1 ? 1 : 0);
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
