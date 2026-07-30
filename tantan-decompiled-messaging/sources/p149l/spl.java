package p149l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public interface spl extends IInterface {
    /* JADX INFO: renamed from: I */
    String m185372I(String str) throws RemoteException;

    /* JADX INFO: renamed from: O6 */
    String m185373O6() throws RemoteException;

    /* JADX INFO: renamed from: T1 */
    boolean m185374T1() throws RemoteException;

    /* JADX INFO: renamed from: j0 */
    String m185375j0(String str) throws RemoteException;

    /* JADX INFO: renamed from: j3 */
    String m185376j3(String str) throws RemoteException;

    /* JADX INFO: renamed from: k1 */
    String mo185377k1(String str) throws RemoteException;

    /* JADX INFO: renamed from: s */
    String m185378s(String str) throws RemoteException;

    /* JADX INFO: renamed from: l.spl$a */
    public static abstract class AbstractBinderC20008a extends Binder implements spl {

        /* JADX INFO: renamed from: a */
        private static final String f165862a = rjw.m179664a(new byte[]{83, 9, 92, 25, 2, 9, 95, 10, 65, 86, 5, 72, 84, 3, 71, 94, 2, 3, 89, 2, 66, 66, 17, 22, 95, 20, 69, 25, 40, 34, 85, Tnaf.POW_2_WIDTH, 88, 84, 4, 47, 84, 43, 80, 89, 0, 1, 85, 20});

        /* JADX INFO: renamed from: l.spl$a$a */
        public static class a implements spl {

            /* JADX INFO: renamed from: b */
            public static spl f165863b;

            /* JADX INFO: renamed from: a */
            private IBinder f165864a;

            public a(IBinder iBinder) {
                this.f165864a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f165864a;
            }

            @Override // p149l.spl
            /* JADX INFO: renamed from: k1 */
            public String mo185377k1(String str) throws RemoteException {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(rjw.m179664a(new byte[]{83, 9, 92, 25, 2, 9, 95, 10, 65, 86, 5, 72, 84, 3, 71, 94, 2, 3, 89, 2, 66, 66, 17, 22, 95, 20, 69, 25, 40, 34, 85, Tnaf.POW_2_WIDTH, 88, 84, 4, 47, 84, 43, 80, 89, 0, 1, 85, 20}));
                    parcelObtain.writeString(str);
                    if (this.f165864a.transact(2, parcelObtain, parcelObtain2, 0) || AbstractBinderC20008a.m185380P2() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = AbstractBinderC20008a.m185380P2().mo185377k1(str);
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC20008a() {
            attachInterface(this, rjw.m179664a(new byte[]{83, 9, 92, 25, 2, 9, 95, 10, 65, 86, 5, 72, 84, 3, 71, 94, 2, 3, 89, 2, 66, 66, 17, 22, 95, 20, 69, 25, 40, 34, 85, Tnaf.POW_2_WIDTH, 88, 84, 4, 47, 84, 43, 80, 89, 0, 1, 85, 20}));
        }

        /* JADX INFO: renamed from: O */
        public static spl m185379O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f165862a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof spl)) ? new a(iBinder) : (spl) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: P2 */
        public static spl m185380P2() {
            return a.f165863b;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = f165862a;
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(str);
                    String strM185375j0 = m185375j0(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strM185375j0);
                    return true;
                case 2:
                    parcel.enforceInterface(str);
                    String strMo185377k1 = mo185377k1(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strMo185377k1);
                    return true;
                case 3:
                    parcel.enforceInterface(str);
                    String strM185372I = m185372I(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strM185372I);
                    return true;
                case 4:
                    parcel.enforceInterface(str);
                    String strM185378s = m185378s(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strM185378s);
                    return true;
                case 5:
                    parcel.enforceInterface(str);
                    String strM185376j3 = m185376j3(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strM185376j3);
                    return true;
                case 6:
                    parcel.enforceInterface(str);
                    boolean zM185374T1 = m185374T1();
                    parcel2.writeNoException();
                    parcel2.writeInt(zM185374T1 ? 1 : 0);
                    return true;
                case 7:
                    parcel.enforceInterface(str);
                    String strM185373O6 = m185373O6();
                    parcel2.writeNoException();
                    parcel2.writeString(strM185373O6);
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
