package p153l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes7.dex */
public interface jsl extends IInterface {
    /* JADX INFO: renamed from: D */
    String m146844D() throws RemoteException;

    /* JADX INFO: renamed from: V */
    String m146845V() throws RemoteException;

    boolean isSupport() throws RemoteException;

    /* JADX INFO: renamed from: j */
    String mo146846j() throws RemoteException;

    /* JADX INFO: renamed from: l0 */
    String m146847l0() throws RemoteException;

    /* JADX INFO: renamed from: l.jsl$a */
    public static abstract class AbstractBinderC18024a extends Binder implements jsl {

        /* JADX INFO: renamed from: a */
        private static final String f122473a = qmw.m177151a(new byte[]{83, 9, 92, 25, 0, 21, 69, 21, 31, 90, 18, 7, 30, 53, 68, 71, 17, 10, 85, 11, 84, 89, 21, 7, 66, 31, 117, 126, 37, 72, 121, 34, 88, 83, HttpTokens.SPACE, 15, 84, 10, 120, 89, 21, 3, 66, 0, 80, 84, 4});

        /* JADX INFO: renamed from: l.jsl$a$a */
        public static class a implements jsl {

            /* JADX INFO: renamed from: b */
            public static jsl f122474b;

            /* JADX INFO: renamed from: a */
            private IBinder f122475a;

            public a(IBinder iBinder) {
                this.f122475a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f122475a;
            }

            @Override // p153l.jsl
            public boolean isSupport() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(qmw.m177151a(new byte[]{83, 9, 92, 25, 0, 21, 69, 21, 31, 90, 18, 7, 30, 53, 68, 71, 17, 10, 85, 11, 84, 89, 21, 7, 66, 31, 117, 126, 37, 72, 121, 34, 88, 83, HttpTokens.SPACE, 15, 84, 10, 120, 89, 21, 3, 66, 0, 80, 84, 4}));
                    if (!this.f122475a.transact(1, parcelObtain, parcelObtain2, 0) && AbstractBinderC18024a.m146849P2() != null) {
                        return AbstractBinderC18024a.m146849P2().isSupport();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p153l.jsl
            /* JADX INFO: renamed from: j */
            public String mo146846j() throws RemoteException {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(qmw.m177151a(new byte[]{83, 9, 92, 25, 0, 21, 69, 21, 31, 90, 18, 7, 30, 53, 68, 71, 17, 10, 85, 11, 84, 89, 21, 7, 66, 31, 117, 126, 37, 72, 121, 34, 88, 83, HttpTokens.SPACE, 15, 84, 10, 120, 89, 21, 3, 66, 0, 80, 84, 4}));
                    if (this.f122475a.transact(3, parcelObtain, parcelObtain2, 0) || AbstractBinderC18024a.m146849P2() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = AbstractBinderC18024a.m146849P2().mo146846j();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC18024a() {
            attachInterface(this, qmw.m177151a(new byte[]{83, 9, 92, 25, 0, 21, 69, 21, 31, 90, 18, 7, 30, 53, 68, 71, 17, 10, 85, 11, 84, 89, 21, 7, 66, 31, 117, 126, 37, 72, 121, 34, 88, 83, HttpTokens.SPACE, 15, 84, 10, 120, 89, 21, 3, 66, 0, 80, 84, 4}));
        }

        /* JADX INFO: renamed from: O */
        public static jsl m146848O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f122473a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof jsl)) ? new a(iBinder) : (jsl) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: P2 */
        public static jsl m146849P2() {
            return a.f122474b;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = f122473a;
            if (i == 1) {
                parcel.enforceInterface(str);
                boolean zIsSupport = isSupport();
                parcel2.writeNoException();
                parcel2.writeInt(zIsSupport ? 1 : 0);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(str);
                String strM146845V = m146845V();
                parcel2.writeNoException();
                parcel2.writeString(strM146845V);
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(str);
                String strMo146846j = mo146846j();
                parcel2.writeNoException();
                parcel2.writeString(strMo146846j);
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface(str);
                String strM146844D = m146844D();
                parcel2.writeNoException();
                parcel2.writeString(strM146844D);
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
            String strM146847l0 = m146847l0();
            parcel2.writeNoException();
            parcel2.writeString(strM146847l0);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
