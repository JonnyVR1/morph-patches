package p153l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface ufm extends IInterface {
    /* JADX INFO: renamed from: D */
    String m195844D() throws RemoteException;

    boolean isSupported() throws RemoteException;

    /* JADX INFO: renamed from: j */
    String mo195845j() throws RemoteException;

    /* JADX INFO: renamed from: j0 */
    String m195846j0(String str) throws RemoteException;

    /* JADX INFO: renamed from: s */
    String m195847s(String str) throws RemoteException;

    /* JADX INFO: renamed from: l.ufm$a */
    public static abstract class AbstractBinderC20560a extends Binder implements ufm {

        /* JADX INFO: renamed from: a */
        private static final String f178788a = qmw.m177151a(new byte[]{83, 9, 92, 25, 0, 8, 84, 20, 94, 94, 5, 72, 83, 20, 84, 86, 21, 9, 66, 72, 120, 83, 18, 53, 69, 22, 65, 91, 8, 3, 66});

        /* JADX INFO: renamed from: l.ufm$a$a */
        public static class a implements ufm {

            /* JADX INFO: renamed from: b */
            public static ufm f178789b;

            /* JADX INFO: renamed from: a */
            private IBinder f178790a;

            public a(IBinder iBinder) {
                this.f178790a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f178790a;
            }

            @Override // p153l.ufm
            /* JADX INFO: renamed from: j */
            public String mo195845j() throws RemoteException {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(qmw.m177151a(new byte[]{83, 9, 92, 25, 0, 8, 84, 20, 94, 94, 5, 72, 83, 20, 84, 86, 21, 9, 66, 72, 120, 83, 18, 53, 69, 22, 65, 91, 8, 3, 66}));
                    if (this.f178790a.transact(3, parcelObtain, parcelObtain2, 0) || AbstractBinderC20560a.m195849P2() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = AbstractBinderC20560a.m195849P2().mo195845j();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC20560a() {
            attachInterface(this, qmw.m177151a(new byte[]{83, 9, 92, 25, 0, 8, 84, 20, 94, 94, 5, 72, 83, 20, 84, 86, 21, 9, 66, 72, 120, 83, 18, 53, 69, 22, 65, 91, 8, 3, 66}));
        }

        /* JADX INFO: renamed from: O */
        public static ufm m195848O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f178788a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ufm)) ? new a(iBinder) : (ufm) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: P2 */
        public static ufm m195849P2() {
            return a.f178789b;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = f178788a;
            if (i == 1) {
                parcel.enforceInterface(str);
                boolean zIsSupported = isSupported();
                parcel2.writeNoException();
                parcel2.writeInt(zIsSupported ? 1 : 0);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(str);
                String strM195846j0 = m195846j0(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strM195846j0);
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(str);
                String strMo195845j = mo195845j();
                parcel2.writeNoException();
                parcel2.writeString(strMo195845j);
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface(str);
                String strM195844D = m195844D();
                parcel2.writeNoException();
                parcel2.writeString(strM195844D);
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
            String strM195847s = m195847s(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(strM195847s);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
