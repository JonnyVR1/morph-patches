package p149l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface edm extends IInterface {
    /* JADX INFO: renamed from: D */
    String m115821D() throws RemoteException;

    boolean isSupported() throws RemoteException;

    /* JADX INFO: renamed from: j */
    String mo115822j() throws RemoteException;

    /* JADX INFO: renamed from: j0 */
    String m115823j0(String str) throws RemoteException;

    /* JADX INFO: renamed from: s */
    String m115824s(String str) throws RemoteException;

    /* JADX INFO: renamed from: l.edm$a */
    public static abstract class AbstractBinderC16581a extends Binder implements edm {

        /* JADX INFO: renamed from: a */
        private static final String f90624a = rjw.m179664a(new byte[]{83, 9, 92, 25, 0, 8, 84, 20, 94, 94, 5, 72, 83, 20, 84, 86, 21, 9, 66, 72, 120, 83, 18, 53, 69, 22, 65, 91, 8, 3, 66});

        /* JADX INFO: renamed from: l.edm$a$a */
        public static class a implements edm {

            /* JADX INFO: renamed from: b */
            public static edm f90625b;

            /* JADX INFO: renamed from: a */
            private IBinder f90626a;

            public a(IBinder iBinder) {
                this.f90626a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f90626a;
            }

            @Override // p149l.edm
            /* JADX INFO: renamed from: j */
            public String mo115822j() throws RemoteException {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(rjw.m179664a(new byte[]{83, 9, 92, 25, 0, 8, 84, 20, 94, 94, 5, 72, 83, 20, 84, 86, 21, 9, 66, 72, 120, 83, 18, 53, 69, 22, 65, 91, 8, 3, 66}));
                    if (this.f90626a.transact(3, parcelObtain, parcelObtain2, 0) || AbstractBinderC16581a.m115826P2() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = AbstractBinderC16581a.m115826P2().mo115822j();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC16581a() {
            attachInterface(this, rjw.m179664a(new byte[]{83, 9, 92, 25, 0, 8, 84, 20, 94, 94, 5, 72, 83, 20, 84, 86, 21, 9, 66, 72, 120, 83, 18, 53, 69, 22, 65, 91, 8, 3, 66}));
        }

        /* JADX INFO: renamed from: O */
        public static edm m115825O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f90624a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof edm)) ? new a(iBinder) : (edm) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: P2 */
        public static edm m115826P2() {
            return a.f90625b;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = f90624a;
            if (i == 1) {
                parcel.enforceInterface(str);
                boolean zIsSupported = isSupported();
                parcel2.writeNoException();
                parcel2.writeInt(zIsSupported ? 1 : 0);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(str);
                String strM115823j0 = m115823j0(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strM115823j0);
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(str);
                String strMo115822j = mo115822j();
                parcel2.writeNoException();
                parcel2.writeString(strMo115822j);
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface(str);
                String strM115821D = m115821D();
                parcel2.writeNoException();
                parcel2.writeString(strM115821D);
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
            String strM115824s = m115824s(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(strM115824s);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
