package p153l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface rol extends IInterface {
    /* JADX INFO: renamed from: D7 */
    boolean mo182412D7(boolean z) throws RemoteException;

    String getId() throws RemoteException;

    /* JADX INFO: renamed from: l.rol$a */
    public static abstract class AbstractBinderC19890a extends Binder implements rol {

        /* JADX INFO: renamed from: a */
        private static final String f164214a = qmw.m177151a(new byte[]{83, 9, 92, 25, 6, 9, 95, 1, 93, 82, 79, 7, 94, 2, 67, 88, 8, 2, 30, 1, 92, 68, 79, 7, 84, 21, 31, 94, 5, 3, 94, 18, 88, 81, 8, 3, 66, 72, 88, 89, 21, 3, 66, 8, 80, 91, 79, 47, 113, 2, 71, 82, 19, 18, 89, 21, 88, 89, 6, 47, 84, 53, 84, 69, 23, 15, 83, 3});

        /* JADX INFO: renamed from: l.rol$a$a */
        public static class a implements rol {

            /* JADX INFO: renamed from: b */
            public static rol f164215b;

            /* JADX INFO: renamed from: a */
            private IBinder f164216a;

            public a(IBinder iBinder) {
                this.f164216a = iBinder;
            }

            @Override // p153l.rol
            /* JADX INFO: renamed from: D7 */
            public boolean mo182412D7(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(qmw.m177151a(new byte[]{83, 9, 92, 25, 6, 9, 95, 1, 93, 82, 79, 7, 94, 2, 67, 88, 8, 2, 30, 1, 92, 68, 79, 7, 84, 21, 31, 94, 5, 3, 94, 18, 88, 81, 8, 3, 66, 72, 88, 89, 21, 3, 66, 8, 80, 91, 79, 47, 113, 2, 71, 82, 19, 18, 89, 21, 88, 89, 6, 47, 84, 53, 84, 69, 23, 15, 83, 3}));
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (!this.f164216a.transact(2, parcelObtain, parcelObtain2, 0) && AbstractBinderC19890a.m182414P2() != null) {
                        return AbstractBinderC19890a.m182414P2().mo182412D7(z);
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
                return this.f164216a;
            }

            @Override // p153l.rol
            public String getId() throws RemoteException {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(qmw.m177151a(new byte[]{83, 9, 92, 25, 6, 9, 95, 1, 93, 82, 79, 7, 94, 2, 67, 88, 8, 2, 30, 1, 92, 68, 79, 7, 84, 21, 31, 94, 5, 3, 94, 18, 88, 81, 8, 3, 66, 72, 88, 89, 21, 3, 66, 8, 80, 91, 79, 47, 113, 2, 71, 82, 19, 18, 89, 21, 88, 89, 6, 47, 84, 53, 84, 69, 23, 15, 83, 3}));
                    if (this.f164216a.transact(1, parcelObtain, parcelObtain2, 0) || AbstractBinderC19890a.m182414P2() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = AbstractBinderC19890a.m182414P2().getId();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC19890a() {
            attachInterface(this, qmw.m177151a(new byte[]{83, 9, 92, 25, 6, 9, 95, 1, 93, 82, 79, 7, 94, 2, 67, 88, 8, 2, 30, 1, 92, 68, 79, 7, 84, 21, 31, 94, 5, 3, 94, 18, 88, 81, 8, 3, 66, 72, 88, 89, 21, 3, 66, 8, 80, 91, 79, 47, 113, 2, 71, 82, 19, 18, 89, 21, 88, 89, 6, 47, 84, 53, 84, 69, 23, 15, 83, 3}));
        }

        /* JADX INFO: renamed from: O */
        public static rol m182413O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f164214a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof rol)) ? new a(iBinder) : (rol) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: P2 */
        public static rol m182414P2() {
            return a.f164215b;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = f164214a;
            if (i == 1) {
                parcel.enforceInterface(str);
                String id = getId();
                parcel2.writeNoException();
                parcel2.writeString(id);
                return true;
            }
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(str);
                return true;
            }
            parcel.enforceInterface(str);
            boolean zMo182412D7 = mo182412D7(parcel.readInt() != 0);
            parcel2.writeNoException();
            parcel2.writeInt(zMo182412D7 ? 1 : 0);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
