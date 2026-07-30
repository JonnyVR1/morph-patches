package p149l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public interface tpl extends IInterface {
    /* JADX INFO: renamed from: I */
    String m189992I(String str) throws RemoteException;

    /* JADX INFO: renamed from: j */
    String mo189993j() throws RemoteException;

    /* JADX INFO: renamed from: s */
    String m189994s(String str) throws RemoteException;

    /* JADX INFO: renamed from: l.tpl$a */
    public static abstract class AbstractBinderC20236a extends Binder implements tpl {

        /* JADX INFO: renamed from: a */
        private static final String f171491a = rjw.m179664a(new byte[]{83, 9, 92, 25, 18, 7, 93, 21, 68, 89, 6, 72, 81, 8, 85, 69, 14, 15, 84, 72, 85, 82, 23, 15, 83, 3, 88, 83, 18, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4, 72, 121, 34, 84, 65, 8, 5, 85, 47, 85, 100, 4, 20, 70, 15, 82, 82});

        /* JADX INFO: renamed from: l.tpl$a$a */
        public static class a implements tpl {

            /* JADX INFO: renamed from: b */
            public static tpl f171492b;

            /* JADX INFO: renamed from: a */
            private IBinder f171493a;

            public a(IBinder iBinder) {
                this.f171493a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f171493a;
            }

            @Override // p149l.tpl
            /* JADX INFO: renamed from: j */
            public String mo189993j() throws RemoteException {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(rjw.m179664a(new byte[]{83, 9, 92, 25, 18, 7, 93, 21, 68, 89, 6, 72, 81, 8, 85, 69, 14, 15, 84, 72, 85, 82, 23, 15, 83, 3, 88, 83, 18, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4, 72, 121, 34, 84, 65, 8, 5, 85, 47, 85, 100, 4, 20, 70, 15, 82, 82}));
                    if (this.f171493a.transact(1, parcelObtain, parcelObtain2, 0) || AbstractBinderC20236a.m189996P2() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = AbstractBinderC20236a.m189996P2().mo189993j();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC20236a() {
            attachInterface(this, rjw.m179664a(new byte[]{83, 9, 92, 25, 18, 7, 93, 21, 68, 89, 6, 72, 81, 8, 85, 69, 14, 15, 84, 72, 85, 82, 23, 15, 83, 3, 88, 83, 18, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4, 72, 121, 34, 84, 65, 8, 5, 85, 47, 85, 100, 4, 20, 70, 15, 82, 82}));
        }

        /* JADX INFO: renamed from: O */
        public static tpl m189995O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f171491a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof tpl)) ? new a(iBinder) : (tpl) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: P2 */
        public static tpl m189996P2() {
            return a.f171492b;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = f171491a;
            if (i == 1) {
                parcel.enforceInterface(str);
                String strMo189993j = mo189993j();
                parcel2.writeNoException();
                parcel2.writeString(strMo189993j);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(str);
                String strM189992I = m189992I(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strM189992I);
                return true;
            }
            if (i != 3) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(str);
                return true;
            }
            parcel.enforceInterface(str);
            String strM189994s = m189994s(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(strM189994s);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
