package p153l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface t1m extends IInterface {
    /* JADX INFO: renamed from: n1 */
    String mo188927n1(String str, String str2, String str3) throws RemoteException;

    /* JADX INFO: renamed from: l.t1m$a */
    public static abstract class AbstractBinderC20214a extends Binder implements t1m {

        /* JADX INFO: renamed from: a */
        private static final String f171684a = qmw.m177151a(new byte[]{83, 9, 92, 25, 9, 3, 73, 18, 80, 71, 79, 9, 64, 3, 95, 94, 5, 72, 121, 41, 65, 82, 15, 47, 116});

        /* JADX INFO: renamed from: l.t1m$a$a */
        public static class a implements t1m {

            /* JADX INFO: renamed from: b */
            public static t1m f171685b;

            /* JADX INFO: renamed from: a */
            private IBinder f171686a;

            public a(IBinder iBinder) {
                this.f171686a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f171686a;
            }

            @Override // p153l.t1m
            /* JADX INFO: renamed from: n1 */
            public String mo188927n1(String str, String str2, String str3) throws RemoteException {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(qmw.m177151a(new byte[]{83, 9, 92, 25, 9, 3, 73, 18, 80, 71, 79, 9, 64, 3, 95, 94, 5, 72, 121, 41, 65, 82, 15, 47, 116}));
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    if (this.f171686a.transact(1, parcelObtain, parcelObtain2, 0) || AbstractBinderC20214a.m188929P2() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = AbstractBinderC20214a.m188929P2().mo188927n1(str, str2, str3);
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC20214a() {
            attachInterface(this, qmw.m177151a(new byte[]{83, 9, 92, 25, 9, 3, 73, 18, 80, 71, 79, 9, 64, 3, 95, 94, 5, 72, 121, 41, 65, 82, 15, 47, 116}));
        }

        /* JADX INFO: renamed from: O */
        public static t1m m188928O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f171684a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof t1m)) ? new a(iBinder) : (t1m) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: P2 */
        public static t1m m188929P2() {
            return a.f171685b;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = f171684a;
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(str);
                return true;
            }
            parcel.enforceInterface(str);
            String strMo188927n1 = mo188927n1(parcel.readString(), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(strMo188927n1);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
