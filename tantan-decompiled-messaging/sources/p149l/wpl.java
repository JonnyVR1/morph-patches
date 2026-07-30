package p149l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes7.dex */
public interface wpl extends IInterface {
    /* JADX INFO: renamed from: D */
    String m204921D() throws RemoteException;

    /* JADX INFO: renamed from: V */
    String m204922V() throws RemoteException;

    boolean isSupport() throws RemoteException;

    /* JADX INFO: renamed from: j */
    String mo204923j() throws RemoteException;

    /* JADX INFO: renamed from: l0 */
    String m204924l0() throws RemoteException;

    /* JADX INFO: renamed from: l.wpl$a */
    public static abstract class AbstractBinderC20936a extends Binder implements wpl {

        /* JADX INFO: renamed from: a */
        private static final String f187538a = rjw.m179664a(new byte[]{83, 9, 92, 25, 0, 21, 69, 21, 31, 90, 18, 7, 30, 53, 68, 71, 17, 10, 85, 11, 84, 89, 21, 7, 66, 31, 117, 126, 37, 72, 121, 34, 88, 83, HttpTokens.SPACE, 15, 84, 10, 120, 89, 21, 3, 66, 0, 80, 84, 4});

        /* JADX INFO: renamed from: l.wpl$a$a */
        public static class a implements wpl {

            /* JADX INFO: renamed from: b */
            public static wpl f187539b;

            /* JADX INFO: renamed from: a */
            private IBinder f187540a;

            public a(IBinder iBinder) {
                this.f187540a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f187540a;
            }

            @Override // p149l.wpl
            public boolean isSupport() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(rjw.m179664a(new byte[]{83, 9, 92, 25, 0, 21, 69, 21, 31, 90, 18, 7, 30, 53, 68, 71, 17, 10, 85, 11, 84, 89, 21, 7, 66, 31, 117, 126, 37, 72, 121, 34, 88, 83, HttpTokens.SPACE, 15, 84, 10, 120, 89, 21, 3, 66, 0, 80, 84, 4}));
                    if (!this.f187540a.transact(1, parcelObtain, parcelObtain2, 0) && AbstractBinderC20936a.m204926P2() != null) {
                        return AbstractBinderC20936a.m204926P2().isSupport();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p149l.wpl
            /* JADX INFO: renamed from: j */
            public String mo204923j() throws RemoteException {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(rjw.m179664a(new byte[]{83, 9, 92, 25, 0, 21, 69, 21, 31, 90, 18, 7, 30, 53, 68, 71, 17, 10, 85, 11, 84, 89, 21, 7, 66, 31, 117, 126, 37, 72, 121, 34, 88, 83, HttpTokens.SPACE, 15, 84, 10, 120, 89, 21, 3, 66, 0, 80, 84, 4}));
                    if (this.f187540a.transact(3, parcelObtain, parcelObtain2, 0) || AbstractBinderC20936a.m204926P2() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = AbstractBinderC20936a.m204926P2().mo204923j();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC20936a() {
            attachInterface(this, rjw.m179664a(new byte[]{83, 9, 92, 25, 0, 21, 69, 21, 31, 90, 18, 7, 30, 53, 68, 71, 17, 10, 85, 11, 84, 89, 21, 7, 66, 31, 117, 126, 37, 72, 121, 34, 88, 83, HttpTokens.SPACE, 15, 84, 10, 120, 89, 21, 3, 66, 0, 80, 84, 4}));
        }

        /* JADX INFO: renamed from: O */
        public static wpl m204925O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f187538a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof wpl)) ? new a(iBinder) : (wpl) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: P2 */
        public static wpl m204926P2() {
            return a.f187539b;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = f187538a;
            if (i == 1) {
                parcel.enforceInterface(str);
                boolean zIsSupport = isSupport();
                parcel2.writeNoException();
                parcel2.writeInt(zIsSupport ? 1 : 0);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(str);
                String strM204922V = m204922V();
                parcel2.writeNoException();
                parcel2.writeString(strM204922V);
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(str);
                String strMo204923j = mo204923j();
                parcel2.writeNoException();
                parcel2.writeString(strMo204923j);
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface(str);
                String strM204921D = m204921D();
                parcel2.writeNoException();
                parcel2.writeString(strM204921D);
                return true;
            }
            if (i != 5) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(str);
                return true;
            }
            parcel.enforceInterface(str);
            String strM204924l0 = m204924l0();
            parcel2.writeNoException();
            parcel2.writeString(strM204924l0);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
