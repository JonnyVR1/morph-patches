package p153l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public interface fsl extends IInterface {
    /* JADX INFO: renamed from: I */
    String m127201I(String str) throws RemoteException;

    /* JADX INFO: renamed from: O6 */
    String m127202O6() throws RemoteException;

    /* JADX INFO: renamed from: T1 */
    boolean m127203T1() throws RemoteException;

    /* JADX INFO: renamed from: j0 */
    String m127204j0(String str) throws RemoteException;

    /* JADX INFO: renamed from: j3 */
    String m127205j3(String str) throws RemoteException;

    /* JADX INFO: renamed from: k1 */
    String mo127206k1(String str) throws RemoteException;

    /* JADX INFO: renamed from: s */
    String m127207s(String str) throws RemoteException;

    /* JADX INFO: renamed from: l.fsl$a */
    public static abstract class AbstractBinderC17066a extends Binder implements fsl {

        /* JADX INFO: renamed from: a */
        private static final String f100638a = qmw.m177151a(new byte[]{83, 9, 92, 25, 2, 9, 95, 10, 65, 86, 5, 72, 84, 3, 71, 94, 2, 3, 89, 2, 66, 66, 17, 22, 95, 20, 69, 25, 40, 34, 85, Tnaf.POW_2_WIDTH, 88, 84, 4, 47, 84, 43, 80, 89, 0, 1, 85, 20});

        /* JADX INFO: renamed from: l.fsl$a$a */
        public static class a implements fsl {

            /* JADX INFO: renamed from: b */
            public static fsl f100639b;

            /* JADX INFO: renamed from: a */
            private IBinder f100640a;

            public a(IBinder iBinder) {
                this.f100640a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f100640a;
            }

            @Override // p153l.fsl
            /* JADX INFO: renamed from: k1 */
            public String mo127206k1(String str) throws RemoteException {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(qmw.m177151a(new byte[]{83, 9, 92, 25, 2, 9, 95, 10, 65, 86, 5, 72, 84, 3, 71, 94, 2, 3, 89, 2, 66, 66, 17, 22, 95, 20, 69, 25, 40, 34, 85, Tnaf.POW_2_WIDTH, 88, 84, 4, 47, 84, 43, 80, 89, 0, 1, 85, 20}));
                    parcelObtain.writeString(str);
                    if (this.f100640a.transact(2, parcelObtain, parcelObtain2, 0) || AbstractBinderC17066a.m127209P2() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = AbstractBinderC17066a.m127209P2().mo127206k1(str);
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC17066a() {
            attachInterface(this, qmw.m177151a(new byte[]{83, 9, 92, 25, 2, 9, 95, 10, 65, 86, 5, 72, 84, 3, 71, 94, 2, 3, 89, 2, 66, 66, 17, 22, 95, 20, 69, 25, 40, 34, 85, Tnaf.POW_2_WIDTH, 88, 84, 4, 47, 84, 43, 80, 89, 0, 1, 85, 20}));
        }

        /* JADX INFO: renamed from: O */
        public static fsl m127208O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f100638a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof fsl)) ? new a(iBinder) : (fsl) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: P2 */
        public static fsl m127209P2() {
            return a.f100639b;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = f100638a;
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(str);
                    String strM127204j0 = m127204j0(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strM127204j0);
                    return true;
                case 2:
                    parcel.enforceInterface(str);
                    String strMo127206k1 = mo127206k1(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strMo127206k1);
                    return true;
                case 3:
                    parcel.enforceInterface(str);
                    String strM127201I = m127201I(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strM127201I);
                    return true;
                case 4:
                    parcel.enforceInterface(str);
                    String strM127207s = m127207s(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strM127207s);
                    return true;
                case 5:
                    parcel.enforceInterface(str);
                    String strM127205j3 = m127205j3(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strM127205j3);
                    return true;
                case 6:
                    parcel.enforceInterface(str);
                    boolean zM127203T1 = m127203T1();
                    parcel2.writeNoException();
                    parcel2.writeInt(zM127203T1 ? 1 : 0);
                    return true;
                case 7:
                    parcel.enforceInterface(str);
                    String strM127202O6 = m127202O6();
                    parcel2.writeNoException();
                    parcel2.writeString(strM127202O6);
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
