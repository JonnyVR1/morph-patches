package p149l;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface jpl extends IInterface {
    /* JADX INFO: renamed from: B1 */
    boolean mo809B1(ipl iplVar, Uri uri, int i, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: C0 */
    boolean mo810C0(ipl iplVar) throws RemoteException;

    /* JADX INFO: renamed from: Q3 */
    boolean mo812Q3(ipl iplVar, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: T2 */
    int mo813T2(ipl iplVar, String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: U5 */
    boolean mo814U5(ipl iplVar, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: V2 */
    boolean mo815V2(ipl iplVar, Uri uri, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: Z4 */
    Bundle mo816Z4(String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: a4 */
    boolean mo817a4(ipl iplVar, int i, Uri uri, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: r3 */
    boolean mo819r3(long j) throws RemoteException;

    /* JADX INFO: renamed from: u2 */
    boolean mo820u2(ipl iplVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    /* JADX INFO: renamed from: z7 */
    boolean mo821z7(ipl iplVar, Uri uri) throws RemoteException;

    /* JADX INFO: renamed from: l.jpl$a */
    public static abstract class AbstractBinderC17841a extends Binder implements jpl {

        /* JADX INFO: renamed from: l.jpl$a$a */
        public static class a implements jpl {

            /* JADX INFO: renamed from: b */
            public static jpl f119206b;

            /* JADX INFO: renamed from: a */
            public IBinder f119207a;

            public a(IBinder iBinder) {
                this.f119207a = iBinder;
            }

            @Override // p149l.jpl
            /* JADX INFO: renamed from: C0 */
            public boolean mo810C0(ipl iplVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(iplVar != null ? iplVar.asBinder() : null);
                    if (!this.f119207a.transact(3, parcelObtain, parcelObtain2, 0) && AbstractBinderC17841a.m142748P2() != null) {
                        return AbstractBinderC17841a.m142748P2().mo810C0(iplVar);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p149l.jpl
            /* JADX INFO: renamed from: Q3 */
            public boolean mo812Q3(ipl iplVar, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(iplVar != null ? iplVar.asBinder() : null);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f119207a.transact(10, parcelObtain, parcelObtain2, 0) && AbstractBinderC17841a.m142748P2() != null) {
                        return AbstractBinderC17841a.m142748P2().mo812Q3(iplVar, bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p149l.jpl
            /* JADX INFO: renamed from: T2 */
            public int mo813T2(ipl iplVar, String str, Bundle bundle) throws RemoteException {
                int iMo813T2;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(iplVar != null ? iplVar.asBinder() : null);
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f119207a.transact(8, parcelObtain, parcelObtain2, 0) || AbstractBinderC17841a.m142748P2() == null) {
                        parcelObtain2.readException();
                        iMo813T2 = parcelObtain2.readInt();
                    } else {
                        iMo813T2 = AbstractBinderC17841a.m142748P2().mo813T2(iplVar, str, bundle);
                    }
                    return iMo813T2;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p149l.jpl
            /* JADX INFO: renamed from: V2 */
            public boolean mo815V2(ipl iplVar, Uri uri, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(iplVar != null ? iplVar.asBinder() : null);
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
                    if (!this.f119207a.transact(11, parcelObtain, parcelObtain2, 0) && AbstractBinderC17841a.m142748P2() != null) {
                        return AbstractBinderC17841a.m142748P2().mo815V2(iplVar, uri, bundle);
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
                return this.f119207a;
            }

            @Override // p149l.jpl
            /* JADX INFO: renamed from: r3 */
            public boolean mo819r3(long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeLong(j);
                    if (!this.f119207a.transact(2, parcelObtain, parcelObtain2, 0) && AbstractBinderC17841a.m142748P2() != null) {
                        return AbstractBinderC17841a.m142748P2().mo819r3(j);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p149l.jpl
            /* JADX INFO: renamed from: u2 */
            public boolean mo820u2(ipl iplVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(iplVar != null ? iplVar.asBinder() : null);
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
                    if (!this.f119207a.transact(4, parcelObtain, parcelObtain2, 0) && AbstractBinderC17841a.m142748P2() != null) {
                        return AbstractBinderC17841a.m142748P2().mo820u2(iplVar, uri, bundle, list);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p149l.jpl
            /* JADX INFO: renamed from: z7 */
            public boolean mo821z7(ipl iplVar, Uri uri) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(iplVar != null ? iplVar.asBinder() : null);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f119207a.transact(7, parcelObtain, parcelObtain2, 0) && AbstractBinderC17841a.m142748P2() != null) {
                        return AbstractBinderC17841a.m142748P2().mo821z7(iplVar, uri);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC17841a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsService");
        }

        /* JADX INFO: renamed from: O */
        public static jpl m142747O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof jpl)) ? new a(iBinder) : (jpl) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: P2 */
        public static jpl m142748P2() {
            return a.f119206b;
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
                    boolean zMo819r3 = mo819r3(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo819r3 ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zMo810C0 = mo810C0(ipl.AbstractBinderC17605a.m137561O(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo810C0 ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zMo820u2 = mo820u2(ipl.AbstractBinderC17605a.m137561O(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.createTypedArrayList(Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo820u2 ? 1 : 0);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    Bundle bundleMo816Z4 = mo816Z4(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (bundleMo816Z4 != null) {
                        parcel2.writeInt(1);
                        bundleMo816Z4.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zMo814U5 = mo814U5(ipl.AbstractBinderC17605a.m137561O(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo814U5 ? 1 : 0);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zMo821z7 = mo821z7(ipl.AbstractBinderC17605a.m137561O(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo821z7 ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    int iMo813T2 = mo813T2(ipl.AbstractBinderC17605a.m137561O(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(iMo813T2);
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zMo817a4 = mo817a4(ipl.AbstractBinderC17605a.m137561O(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo817a4 ? 1 : 0);
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zMo812Q3 = mo812Q3(ipl.AbstractBinderC17605a.m137561O(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo812Q3 ? 1 : 0);
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zMo815V2 = mo815V2(ipl.AbstractBinderC17605a.m137561O(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo815V2 ? 1 : 0);
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zMo809B1 = mo809B1(ipl.AbstractBinderC17605a.m137561O(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo809B1 ? 1 : 0);
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
