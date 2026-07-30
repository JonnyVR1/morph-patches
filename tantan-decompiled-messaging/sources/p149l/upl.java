package p149l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public interface upl extends IInterface {
    /* JADX INFO: renamed from: I */
    String m194884I(String str) throws RemoteException;

    /* JADX INFO: renamed from: V */
    String m194885V() throws RemoteException;

    /* JADX INFO: renamed from: b2 */
    String m194886b2(String str) throws RemoteException;

    boolean isSupport() throws RemoteException;

    /* JADX INFO: renamed from: j */
    String mo194887j() throws RemoteException;

    /* JADX INFO: renamed from: s */
    String m194888s(String str) throws RemoteException;

    /* JADX INFO: renamed from: l.upl$a */
    public static abstract class AbstractBinderC20481a extends Binder implements upl {

        /* JADX INFO: renamed from: a */
        private static final String f177638a = rjw.m179664a(new byte[]{83, 9, 92, 25, 27, 19, 89, 72, 85, 82, 23, 15, 83, 3, 88, 83, 18, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4, 72, 121, 34, 84, 65, 8, 5, 85, 15, 85, 126, 15, 18, 85, 20, 87, 86, 2, 3});

        /* JADX INFO: renamed from: l.upl$a$a */
        public static class a implements upl {

            /* JADX INFO: renamed from: b */
            public static upl f177639b;

            /* JADX INFO: renamed from: a */
            private IBinder f177640a;

            public a(IBinder iBinder) {
                this.f177640a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f177640a;
            }

            @Override // p149l.upl
            public boolean isSupport() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(rjw.m179664a(new byte[]{83, 9, 92, 25, 27, 19, 89, 72, 85, 82, 23, 15, 83, 3, 88, 83, 18, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4, 72, 121, 34, 84, 65, 8, 5, 85, 15, 85, 126, 15, 18, 85, 20, 87, 86, 2, 3}));
                    if (!this.f177640a.transact(3, parcelObtain, parcelObtain2, 0) && AbstractBinderC20481a.m194890P2() != null) {
                        return AbstractBinderC20481a.m194890P2().isSupport();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p149l.upl
            /* JADX INFO: renamed from: j */
            public String mo194887j() throws RemoteException {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(rjw.m179664a(new byte[]{83, 9, 92, 25, 27, 19, 89, 72, 85, 82, 23, 15, 83, 3, 88, 83, 18, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4, 72, 121, 34, 84, 65, 8, 5, 85, 15, 85, 126, 15, 18, 85, 20, 87, 86, 2, 3}));
                    if (this.f177640a.transact(1, parcelObtain, parcelObtain2, 0) || AbstractBinderC20481a.m194890P2() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = AbstractBinderC20481a.m194890P2().mo194887j();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC20481a() {
            attachInterface(this, rjw.m179664a(new byte[]{83, 9, 92, 25, 27, 19, 89, 72, 85, 82, 23, 15, 83, 3, 88, 83, 18, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4, 72, 121, 34, 84, 65, 8, 5, 85, 15, 85, 126, 15, 18, 85, 20, 87, 86, 2, 3}));
        }

        /* JADX INFO: renamed from: O */
        public static upl m194889O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f177638a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof upl)) ? new a(iBinder) : (upl) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: P2 */
        public static upl m194890P2() {
            return a.f177639b;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = f177638a;
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(str);
                    String strMo194887j = mo194887j();
                    parcel2.writeNoException();
                    parcel2.writeString(strMo194887j);
                    return true;
                case 2:
                    parcel.enforceInterface(str);
                    String strM194885V = m194885V();
                    parcel2.writeNoException();
                    parcel2.writeString(strM194885V);
                    return true;
                case 3:
                    parcel.enforceInterface(str);
                    boolean zIsSupport = isSupport();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsSupport ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface(str);
                    String strM194884I = m194884I(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strM194884I);
                    return true;
                case 5:
                    parcel.enforceInterface(str);
                    String strM194888s = m194888s(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strM194888s);
                    return true;
                case 6:
                    parcel.enforceInterface(str);
                    String strM194886b2 = m194886b2(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strM194886b2);
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
