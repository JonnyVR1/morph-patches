package p153l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface j710 extends IInterface {
    /* JADX INFO: renamed from: D */
    String m143737D() throws RemoteException;

    /* JADX INFO: renamed from: H1 */
    void m143738H1() throws RemoteException;

    /* JADX INFO: renamed from: I4 */
    boolean m143739I4() throws RemoteException;

    boolean isSupported() throws RemoteException;

    /* JADX INFO: renamed from: j */
    String mo143740j() throws RemoteException;

    /* JADX INFO: renamed from: l0 */
    String m143741l0() throws RemoteException;

    /* JADX INFO: renamed from: l.j710$a */
    public static abstract class AbstractBinderC17891a extends Binder implements j710 {

        /* JADX INFO: renamed from: a */
        private static final String f118622a = qmw.m177151a(new byte[]{83, 9, 92, 25, 3, 19, 94, 72, 93, 94, 3, 72, 125, 21, 80, 126, 5, 47, 94, 18, 84, 69, 7, 7, 83, 3});

        /* JADX INFO: renamed from: l.j710$a$a */
        public static class a implements j710 {

            /* JADX INFO: renamed from: b */
            public static j710 f118623b;

            /* JADX INFO: renamed from: a */
            private IBinder f118624a;

            public a(IBinder iBinder) {
                this.f118624a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f118624a;
            }

            @Override // p153l.j710
            public boolean isSupported() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(qmw.m177151a(new byte[]{83, 9, 92, 25, 3, 19, 94, 72, 93, 94, 3, 72, 125, 21, 80, 126, 5, 47, 94, 18, 84, 69, 7, 7, 83, 3}));
                    if (!this.f118624a.transact(1, parcelObtain, parcelObtain2, 0) && AbstractBinderC17891a.m143743P2() != null) {
                        return AbstractBinderC17891a.m143743P2().isSupported();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p153l.j710
            /* JADX INFO: renamed from: j */
            public String mo143740j() throws RemoteException {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(qmw.m177151a(new byte[]{83, 9, 92, 25, 3, 19, 94, 72, 93, 94, 3, 72, 125, 21, 80, 126, 5, 47, 94, 18, 84, 69, 7, 7, 83, 3}));
                    if (this.f118624a.transact(3, parcelObtain, parcelObtain2, 0) || AbstractBinderC17891a.m143743P2() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = AbstractBinderC17891a.m143743P2().mo143740j();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC17891a() {
            attachInterface(this, qmw.m177151a(new byte[]{83, 9, 92, 25, 3, 19, 94, 72, 93, 94, 3, 72, 125, 21, 80, 126, 5, 47, 94, 18, 84, 69, 7, 7, 83, 3}));
        }

        /* JADX INFO: renamed from: O */
        public static j710 m143742O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f118622a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof j710)) ? new a(iBinder) : (j710) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: P2 */
        public static j710 m143743P2() {
            return a.f118623b;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = f118622a;
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(str);
                    boolean zIsSupported = isSupported();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsSupported ? 1 : 0);
                    return true;
                case 2:
                    parcel.enforceInterface(str);
                    boolean zM143739I4 = m143739I4();
                    parcel2.writeNoException();
                    parcel2.writeInt(zM143739I4 ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface(str);
                    String strMo143740j = mo143740j();
                    parcel2.writeNoException();
                    parcel2.writeString(strMo143740j);
                    return true;
                case 4:
                    parcel.enforceInterface(str);
                    String strM143737D = m143737D();
                    parcel2.writeNoException();
                    parcel2.writeString(strM143737D);
                    return true;
                case 5:
                    parcel.enforceInterface(str);
                    String strM143741l0 = m143741l0();
                    parcel2.writeNoException();
                    parcel2.writeString(strM143741l0);
                    return true;
                case 6:
                    parcel.enforceInterface(str);
                    m143738H1();
                    parcel2.writeNoException();
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
