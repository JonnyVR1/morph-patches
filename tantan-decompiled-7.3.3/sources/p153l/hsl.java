package p153l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public interface hsl extends IInterface {
    /* JADX INFO: renamed from: I */
    String m136979I(String str) throws RemoteException;

    /* JADX INFO: renamed from: V */
    String m136980V() throws RemoteException;

    /* JADX INFO: renamed from: b2 */
    String m136981b2(String str) throws RemoteException;

    boolean isSupport() throws RemoteException;

    /* JADX INFO: renamed from: j */
    String mo136982j() throws RemoteException;

    /* JADX INFO: renamed from: s */
    String m136983s(String str) throws RemoteException;

    /* JADX INFO: renamed from: l.hsl$a */
    public static abstract class AbstractBinderC17571a extends Binder implements hsl {

        /* JADX INFO: renamed from: a */
        private static final String f111453a = qmw.m177151a(new byte[]{83, 9, 92, 25, 27, 19, 89, 72, 85, 82, 23, 15, 83, 3, 88, 83, 18, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4, 72, 121, 34, 84, 65, 8, 5, 85, 15, 85, 126, 15, 18, 85, 20, 87, 86, 2, 3});

        /* JADX INFO: renamed from: l.hsl$a$a */
        public static class a implements hsl {

            /* JADX INFO: renamed from: b */
            public static hsl f111454b;

            /* JADX INFO: renamed from: a */
            private IBinder f111455a;

            public a(IBinder iBinder) {
                this.f111455a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f111455a;
            }

            @Override // p153l.hsl
            public boolean isSupport() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(qmw.m177151a(new byte[]{83, 9, 92, 25, 27, 19, 89, 72, 85, 82, 23, 15, 83, 3, 88, 83, 18, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4, 72, 121, 34, 84, 65, 8, 5, 85, 15, 85, 126, 15, 18, 85, 20, 87, 86, 2, 3}));
                    if (!this.f111455a.transact(3, parcelObtain, parcelObtain2, 0) && AbstractBinderC17571a.m136985P2() != null) {
                        return AbstractBinderC17571a.m136985P2().isSupport();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p153l.hsl
            /* JADX INFO: renamed from: j */
            public String mo136982j() throws RemoteException {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(qmw.m177151a(new byte[]{83, 9, 92, 25, 27, 19, 89, 72, 85, 82, 23, 15, 83, 3, 88, 83, 18, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4, 72, 121, 34, 84, 65, 8, 5, 85, 15, 85, 126, 15, 18, 85, 20, 87, 86, 2, 3}));
                    if (this.f111455a.transact(1, parcelObtain, parcelObtain2, 0) || AbstractBinderC17571a.m136985P2() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = AbstractBinderC17571a.m136985P2().mo136982j();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC17571a() {
            attachInterface(this, qmw.m177151a(new byte[]{83, 9, 92, 25, 27, 19, 89, 72, 85, 82, 23, 15, 83, 3, 88, 83, 18, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4, 72, 121, 34, 84, 65, 8, 5, 85, 15, 85, 126, 15, 18, 85, 20, 87, 86, 2, 3}));
        }

        /* JADX INFO: renamed from: O */
        public static hsl m136984O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f111453a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof hsl)) ? new a(iBinder) : (hsl) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: P2 */
        public static hsl m136985P2() {
            return a.f111454b;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = f111453a;
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(str);
                    String strMo136982j = mo136982j();
                    parcel2.writeNoException();
                    parcel2.writeString(strMo136982j);
                    return true;
                case 2:
                    parcel.enforceInterface(str);
                    String strM136980V = m136980V();
                    parcel2.writeNoException();
                    parcel2.writeString(strM136980V);
                    return true;
                case 3:
                    parcel.enforceInterface(str);
                    boolean zIsSupport = isSupport();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsSupport ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface(str);
                    String strM136979I = m136979I(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strM136979I);
                    return true;
                case 5:
                    parcel.enforceInterface(str);
                    String strM136983s = m136983s(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strM136983s);
                    return true;
                case 6:
                    parcel.enforceInterface(str);
                    String strM136981b2 = m136981b2(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strM136981b2);
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
