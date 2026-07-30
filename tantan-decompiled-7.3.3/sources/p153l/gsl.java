package p153l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public interface gsl extends IInterface {
    /* JADX INFO: renamed from: I */
    String m132064I(String str) throws RemoteException;

    /* JADX INFO: renamed from: j */
    String mo132065j() throws RemoteException;

    /* JADX INFO: renamed from: s */
    String m132066s(String str) throws RemoteException;

    /* JADX INFO: renamed from: l.gsl$a */
    public static abstract class AbstractBinderC17297a extends Binder implements gsl {

        /* JADX INFO: renamed from: a */
        private static final String f106300a = qmw.m177151a(new byte[]{83, 9, 92, 25, 18, 7, 93, 21, 68, 89, 6, 72, 81, 8, 85, 69, 14, 15, 84, 72, 85, 82, 23, 15, 83, 3, 88, 83, 18, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4, 72, 121, 34, 84, 65, 8, 5, 85, 47, 85, 100, 4, 20, 70, 15, 82, 82});

        /* JADX INFO: renamed from: l.gsl$a$a */
        public static class a implements gsl {

            /* JADX INFO: renamed from: b */
            public static gsl f106301b;

            /* JADX INFO: renamed from: a */
            private IBinder f106302a;

            public a(IBinder iBinder) {
                this.f106302a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f106302a;
            }

            @Override // p153l.gsl
            /* JADX INFO: renamed from: j */
            public String mo132065j() throws RemoteException {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(qmw.m177151a(new byte[]{83, 9, 92, 25, 18, 7, 93, 21, 68, 89, 6, 72, 81, 8, 85, 69, 14, 15, 84, 72, 85, 82, 23, 15, 83, 3, 88, 83, 18, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4, 72, 121, 34, 84, 65, 8, 5, 85, 47, 85, 100, 4, 20, 70, 15, 82, 82}));
                    if (this.f106302a.transact(1, parcelObtain, parcelObtain2, 0) || AbstractBinderC17297a.m132068P2() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = AbstractBinderC17297a.m132068P2().mo132065j();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC17297a() {
            attachInterface(this, qmw.m177151a(new byte[]{83, 9, 92, 25, 18, 7, 93, 21, 68, 89, 6, 72, 81, 8, 85, 69, 14, 15, 84, 72, 85, 82, 23, 15, 83, 3, 88, 83, 18, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4, 72, 121, 34, 84, 65, 8, 5, 85, 47, 85, 100, 4, 20, 70, 15, 82, 82}));
        }

        /* JADX INFO: renamed from: O */
        public static gsl m132067O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f106300a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof gsl)) ? new a(iBinder) : (gsl) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: P2 */
        public static gsl m132068P2() {
            return a.f106301b;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = f106300a;
            if (i == 1) {
                parcel.enforceInterface(str);
                String strMo132065j = mo132065j();
                parcel2.writeNoException();
                parcel2.writeString(strMo132065j);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(str);
                String strM132064I = m132064I(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strM132064I);
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
            String strM132066s = m132066s(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(strM132066s);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
