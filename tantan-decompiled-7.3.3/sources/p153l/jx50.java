package p153l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public interface jx50 extends IInterface {
    /* JADX INFO: renamed from: j5 */
    boolean mo147329j5() throws RemoteException;

    /* JADX INFO: renamed from: k4 */
    String mo147330k4() throws RemoteException;

    /* JADX INFO: renamed from: l.jx50$a */
    public static abstract class AbstractBinderC18050a extends Binder implements jx50 {

        /* JADX INFO: renamed from: a */
        private static final String f123003a = qmw.m177151a(new byte[]{83, 9, 92, 25, 20, 9, 84, 15, 66, 25, 14, 22, 85, 8, 85, 82, 23, 15, 83, 3, 31, 86, 8, 2, 92, 72, 126, 71, 4, 8, 116, 3, 71, 94, 2, 3, 121, 2, 84, 89, 21, 15, 86, 15, 84, 69, 50, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4});

        /* JADX INFO: renamed from: l.jx50$a$a */
        public static class a implements jx50 {

            /* JADX INFO: renamed from: b */
            public static jx50 f123004b;

            /* JADX INFO: renamed from: a */
            private IBinder f123005a;

            public a(IBinder iBinder) {
                this.f123005a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f123005a;
            }

            @Override // p153l.jx50
            /* JADX INFO: renamed from: j5 */
            public boolean mo147329j5() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(qmw.m177151a(new byte[]{83, 9, 92, 25, 20, 9, 84, 15, 66, 25, 14, 22, 85, 8, 85, 82, 23, 15, 83, 3, 31, 86, 8, 2, 92, 72, 126, 71, 4, 8, 116, 3, 71, 94, 2, 3, 121, 2, 84, 89, 21, 15, 86, 15, 84, 69, 50, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4}));
                    if (!this.f123005a.transact(2, parcelObtain, parcelObtain2, 0) && AbstractBinderC18050a.m147332P2() != null) {
                        return AbstractBinderC18050a.m147332P2().mo147329j5();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p153l.jx50
            /* JADX INFO: renamed from: k4 */
            public String mo147330k4() throws RemoteException {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(qmw.m177151a(new byte[]{83, 9, 92, 25, 20, 9, 84, 15, 66, 25, 14, 22, 85, 8, 85, 82, 23, 15, 83, 3, 31, 86, 8, 2, 92, 72, 126, 71, 4, 8, 116, 3, 71, 94, 2, 3, 121, 2, 84, 89, 21, 15, 86, 15, 84, 69, 50, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4}));
                    if (this.f123005a.transact(1, parcelObtain, parcelObtain2, 0) || AbstractBinderC18050a.m147332P2() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = AbstractBinderC18050a.m147332P2().mo147330k4();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC18050a() {
            attachInterface(this, qmw.m177151a(new byte[]{83, 9, 92, 25, 20, 9, 84, 15, 66, 25, 14, 22, 85, 8, 85, 82, 23, 15, 83, 3, 31, 86, 8, 2, 92, 72, 126, 71, 4, 8, 116, 3, 71, 94, 2, 3, 121, 2, 84, 89, 21, 15, 86, 15, 84, 69, 50, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4}));
        }

        /* JADX INFO: renamed from: O */
        public static jx50 m147331O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f123003a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof jx50)) ? new a(iBinder) : (jx50) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: P2 */
        public static jx50 m147332P2() {
            return a.f123004b;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = f123003a;
            if (i == 1) {
                parcel.enforceInterface(str);
                String strMo147330k4 = mo147330k4();
                parcel2.writeNoException();
                parcel2.writeString(strMo147330k4);
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
            boolean zMo147329j5 = mo147329j5();
            parcel2.writeNoException();
            parcel2.writeInt(zMo147329j5 ? 1 : 0);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
