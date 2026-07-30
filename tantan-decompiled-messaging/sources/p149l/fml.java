package p149l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface fml extends IInterface {
    /* JADX INFO: renamed from: D7 */
    boolean mo122170D7(boolean z) throws RemoteException;

    String getId() throws RemoteException;

    /* JADX INFO: renamed from: l.fml$a */
    public static abstract class AbstractBinderC16881a extends Binder implements fml {

        /* JADX INFO: renamed from: a */
        private static final String f98309a = rjw.m179664a(new byte[]{83, 9, 92, 25, 6, 9, 95, 1, 93, 82, 79, 7, 94, 2, 67, 88, 8, 2, 30, 1, 92, 68, 79, 7, 84, 21, 31, 94, 5, 3, 94, 18, 88, 81, 8, 3, 66, 72, 88, 89, 21, 3, 66, 8, 80, 91, 79, 47, 113, 2, 71, 82, 19, 18, 89, 21, 88, 89, 6, 47, 84, 53, 84, 69, 23, 15, 83, 3});

        /* JADX INFO: renamed from: l.fml$a$a */
        public static class a implements fml {

            /* JADX INFO: renamed from: b */
            public static fml f98310b;

            /* JADX INFO: renamed from: a */
            private IBinder f98311a;

            public a(IBinder iBinder) {
                this.f98311a = iBinder;
            }

            @Override // p149l.fml
            /* JADX INFO: renamed from: D7 */
            public boolean mo122170D7(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(rjw.m179664a(new byte[]{83, 9, 92, 25, 6, 9, 95, 1, 93, 82, 79, 7, 94, 2, 67, 88, 8, 2, 30, 1, 92, 68, 79, 7, 84, 21, 31, 94, 5, 3, 94, 18, 88, 81, 8, 3, 66, 72, 88, 89, 21, 3, 66, 8, 80, 91, 79, 47, 113, 2, 71, 82, 19, 18, 89, 21, 88, 89, 6, 47, 84, 53, 84, 69, 23, 15, 83, 3}));
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (!this.f98311a.transact(2, parcelObtain, parcelObtain2, 0) && AbstractBinderC16881a.m122172P2() != null) {
                        return AbstractBinderC16881a.m122172P2().mo122170D7(z);
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
                return this.f98311a;
            }

            @Override // p149l.fml
            public String getId() throws RemoteException {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(rjw.m179664a(new byte[]{83, 9, 92, 25, 6, 9, 95, 1, 93, 82, 79, 7, 94, 2, 67, 88, 8, 2, 30, 1, 92, 68, 79, 7, 84, 21, 31, 94, 5, 3, 94, 18, 88, 81, 8, 3, 66, 72, 88, 89, 21, 3, 66, 8, 80, 91, 79, 47, 113, 2, 71, 82, 19, 18, 89, 21, 88, 89, 6, 47, 84, 53, 84, 69, 23, 15, 83, 3}));
                    if (this.f98311a.transact(1, parcelObtain, parcelObtain2, 0) || AbstractBinderC16881a.m122172P2() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = AbstractBinderC16881a.m122172P2().getId();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC16881a() {
            attachInterface(this, rjw.m179664a(new byte[]{83, 9, 92, 25, 6, 9, 95, 1, 93, 82, 79, 7, 94, 2, 67, 88, 8, 2, 30, 1, 92, 68, 79, 7, 84, 21, 31, 94, 5, 3, 94, 18, 88, 81, 8, 3, 66, 72, 88, 89, 21, 3, 66, 8, 80, 91, 79, 47, 113, 2, 71, 82, 19, 18, 89, 21, 88, 89, 6, 47, 84, 53, 84, 69, 23, 15, 83, 3}));
        }

        /* JADX INFO: renamed from: O */
        public static fml m122171O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f98309a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof fml)) ? new a(iBinder) : (fml) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: P2 */
        public static fml m122172P2() {
            return a.f98310b;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = f98309a;
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
            boolean zMo122170D7 = mo122170D7(parcel.readInt() != 0);
            parcel2.writeNoException();
            parcel2.writeInt(zMo122170D7 ? 1 : 0);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
