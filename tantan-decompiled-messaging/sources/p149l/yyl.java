package p149l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface yyl extends IInterface {
    /* JADX INFO: renamed from: n1 */
    String mo216541n1(String str, String str2, String str3) throws RemoteException;

    /* JADX INFO: renamed from: l.yyl$a */
    public static abstract class AbstractBinderC21582a extends Binder implements yyl {

        /* JADX INFO: renamed from: a */
        private static final String f200779a = rjw.m179664a(new byte[]{83, 9, 92, 25, 9, 3, 73, 18, 80, 71, 79, 9, 64, 3, 95, 94, 5, 72, 121, 41, 65, 82, 15, 47, 116});

        /* JADX INFO: renamed from: l.yyl$a$a */
        public static class a implements yyl {

            /* JADX INFO: renamed from: b */
            public static yyl f200780b;

            /* JADX INFO: renamed from: a */
            private IBinder f200781a;

            public a(IBinder iBinder) {
                this.f200781a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f200781a;
            }

            @Override // p149l.yyl
            /* JADX INFO: renamed from: n1 */
            public String mo216541n1(String str, String str2, String str3) throws RemoteException {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(rjw.m179664a(new byte[]{83, 9, 92, 25, 9, 3, 73, 18, 80, 71, 79, 9, 64, 3, 95, 94, 5, 72, 121, 41, 65, 82, 15, 47, 116}));
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    if (this.f200781a.transact(1, parcelObtain, parcelObtain2, 0) || AbstractBinderC21582a.m216543P2() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = AbstractBinderC21582a.m216543P2().mo216541n1(str, str2, str3);
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC21582a() {
            attachInterface(this, rjw.m179664a(new byte[]{83, 9, 92, 25, 9, 3, 73, 18, 80, 71, 79, 9, 64, 3, 95, 94, 5, 72, 121, 41, 65, 82, 15, 47, 116}));
        }

        /* JADX INFO: renamed from: O */
        public static yyl m216542O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f200779a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof yyl)) ? new a(iBinder) : (yyl) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: P2 */
        public static yyl m216543P2() {
            return a.f200780b;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = f200779a;
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(str);
                return true;
            }
            parcel.enforceInterface(str);
            String strMo216541n1 = mo216541n1(parcel.readString(), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(strMo216541n1);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
