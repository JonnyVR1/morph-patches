package p149l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public interface dp50 extends IInterface {
    /* JADX INFO: renamed from: j5 */
    boolean mo112864j5() throws RemoteException;

    /* JADX INFO: renamed from: k4 */
    String mo112865k4() throws RemoteException;

    /* JADX INFO: renamed from: l.dp50$a */
    public static abstract class AbstractBinderC16421a extends Binder implements dp50 {

        /* JADX INFO: renamed from: a */
        private static final String f87238a = rjw.m179664a(new byte[]{83, 9, 92, 25, 20, 9, 84, 15, 66, 25, 14, 22, 85, 8, 85, 82, 23, 15, 83, 3, 31, 86, 8, 2, 92, 72, 126, 71, 4, 8, 116, 3, 71, 94, 2, 3, 121, 2, 84, 89, 21, 15, 86, 15, 84, 69, 50, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4});

        /* JADX INFO: renamed from: l.dp50$a$a */
        public static class a implements dp50 {

            /* JADX INFO: renamed from: b */
            public static dp50 f87239b;

            /* JADX INFO: renamed from: a */
            private IBinder f87240a;

            public a(IBinder iBinder) {
                this.f87240a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f87240a;
            }

            @Override // p149l.dp50
            /* JADX INFO: renamed from: j5 */
            public boolean mo112864j5() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(rjw.m179664a(new byte[]{83, 9, 92, 25, 20, 9, 84, 15, 66, 25, 14, 22, 85, 8, 85, 82, 23, 15, 83, 3, 31, 86, 8, 2, 92, 72, 126, 71, 4, 8, 116, 3, 71, 94, 2, 3, 121, 2, 84, 89, 21, 15, 86, 15, 84, 69, 50, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4}));
                    if (!this.f87240a.transact(2, parcelObtain, parcelObtain2, 0) && AbstractBinderC16421a.m112867P2() != null) {
                        return AbstractBinderC16421a.m112867P2().mo112864j5();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p149l.dp50
            /* JADX INFO: renamed from: k4 */
            public String mo112865k4() throws RemoteException {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(rjw.m179664a(new byte[]{83, 9, 92, 25, 20, 9, 84, 15, 66, 25, 14, 22, 85, 8, 85, 82, 23, 15, 83, 3, 31, 86, 8, 2, 92, 72, 126, 71, 4, 8, 116, 3, 71, 94, 2, 3, 121, 2, 84, 89, 21, 15, 86, 15, 84, 69, 50, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4}));
                    if (this.f87240a.transact(1, parcelObtain, parcelObtain2, 0) || AbstractBinderC16421a.m112867P2() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = AbstractBinderC16421a.m112867P2().mo112865k4();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC16421a() {
            attachInterface(this, rjw.m179664a(new byte[]{83, 9, 92, 25, 20, 9, 84, 15, 66, 25, 14, 22, 85, 8, 85, 82, 23, 15, 83, 3, 31, 86, 8, 2, 92, 72, 126, 71, 4, 8, 116, 3, 71, 94, 2, 3, 121, 2, 84, 89, 21, 15, 86, 15, 84, 69, 50, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4}));
        }

        /* JADX INFO: renamed from: O */
        public static dp50 m112866O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f87238a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof dp50)) ? new a(iBinder) : (dp50) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: P2 */
        public static dp50 m112867P2() {
            return a.f87239b;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = f87238a;
            if (i == 1) {
                parcel.enforceInterface(str);
                String strMo112865k4 = mo112865k4();
                parcel2.writeNoException();
                parcel2.writeString(strMo112865k4);
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
            boolean zMo112864j5 = mo112864j5();
            parcel2.writeNoException();
            parcel2.writeInt(zMo112864j5 ? 1 : 0);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
