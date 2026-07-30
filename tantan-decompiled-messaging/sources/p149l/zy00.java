package p149l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface zy00 extends IInterface {
    /* JADX INFO: renamed from: D */
    String m220875D() throws RemoteException;

    /* JADX INFO: renamed from: H1 */
    void m220876H1() throws RemoteException;

    /* JADX INFO: renamed from: I4 */
    boolean m220877I4() throws RemoteException;

    boolean isSupported() throws RemoteException;

    /* JADX INFO: renamed from: j */
    String mo220878j() throws RemoteException;

    /* JADX INFO: renamed from: l0 */
    String m220879l0() throws RemoteException;

    /* JADX INFO: renamed from: l.zy00$a */
    public static abstract class AbstractBinderC21819a extends Binder implements zy00 {

        /* JADX INFO: renamed from: a */
        private static final String f205595a = rjw.m179664a(new byte[]{83, 9, 92, 25, 3, 19, 94, 72, 93, 94, 3, 72, 125, 21, 80, 126, 5, 47, 94, 18, 84, 69, 7, 7, 83, 3});

        /* JADX INFO: renamed from: l.zy00$a$a */
        public static class a implements zy00 {

            /* JADX INFO: renamed from: b */
            public static zy00 f205596b;

            /* JADX INFO: renamed from: a */
            private IBinder f205597a;

            public a(IBinder iBinder) {
                this.f205597a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f205597a;
            }

            @Override // p149l.zy00
            public boolean isSupported() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(rjw.m179664a(new byte[]{83, 9, 92, 25, 3, 19, 94, 72, 93, 94, 3, 72, 125, 21, 80, 126, 5, 47, 94, 18, 84, 69, 7, 7, 83, 3}));
                    if (!this.f205597a.transact(1, parcelObtain, parcelObtain2, 0) && AbstractBinderC21819a.m220881P2() != null) {
                        return AbstractBinderC21819a.m220881P2().isSupported();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p149l.zy00
            /* JADX INFO: renamed from: j */
            public String mo220878j() throws RemoteException {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(rjw.m179664a(new byte[]{83, 9, 92, 25, 3, 19, 94, 72, 93, 94, 3, 72, 125, 21, 80, 126, 5, 47, 94, 18, 84, 69, 7, 7, 83, 3}));
                    if (this.f205597a.transact(3, parcelObtain, parcelObtain2, 0) || AbstractBinderC21819a.m220881P2() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = AbstractBinderC21819a.m220881P2().mo220878j();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC21819a() {
            attachInterface(this, rjw.m179664a(new byte[]{83, 9, 92, 25, 3, 19, 94, 72, 93, 94, 3, 72, 125, 21, 80, 126, 5, 47, 94, 18, 84, 69, 7, 7, 83, 3}));
        }

        /* JADX INFO: renamed from: O */
        public static zy00 m220880O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f205595a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof zy00)) ? new a(iBinder) : (zy00) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: P2 */
        public static zy00 m220881P2() {
            return a.f205596b;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = f205595a;
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
                    boolean zM220877I4 = m220877I4();
                    parcel2.writeNoException();
                    parcel2.writeInt(zM220877I4 ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface(str);
                    String strMo220878j = mo220878j();
                    parcel2.writeNoException();
                    parcel2.writeString(strMo220878j);
                    return true;
                case 4:
                    parcel.enforceInterface(str);
                    String strM220875D = m220875D();
                    parcel2.writeNoException();
                    parcel2.writeString(strM220875D);
                    return true;
                case 5:
                    parcel.enforceInterface(str);
                    String strM220879l0 = m220879l0();
                    parcel2.writeNoException();
                    parcel2.writeString(strM220879l0);
                    return true;
                case 6:
                    parcel.enforceInterface(str);
                    m220876H1();
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
