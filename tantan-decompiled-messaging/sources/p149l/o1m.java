package p149l;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface o1m extends IInterface {

    /* JADX INFO: renamed from: l.o1m$b */
    public static class C18817b {
        /* JADX INFO: renamed from: c */
        public static <T> T m162261c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        public static <T extends Parcelable> void m162262d(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    /* JADX INFO: renamed from: H4 */
    int mo162257H4(Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: l.o1m$a */
    public static abstract class AbstractBinderC18816a extends Binder implements o1m {

        /* JADX INFO: renamed from: l.o1m$a$a */
        public static class a implements o1m {

            /* JADX INFO: renamed from: a */
            public IBinder f141462a;

            public a(IBinder iBinder) {
                this.f141462a = iBinder;
            }

            @Override // p149l.o1m
            /* JADX INFO: renamed from: H4 */
            public int mo162257H4(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    C18817b.m162262d(parcelObtain, bundle, 0);
                    this.f141462a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f141462a;
            }
        }

        public AbstractBinderC18816a() {
            attachInterface(this, "com.facebook.ppml.receiver.IReceiverService");
        }

        /* JADX INFO: renamed from: O */
        public static o1m m162258O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof o1m)) ? new a(iBinder) : (o1m) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.facebook.ppml.receiver.IReceiverService");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.facebook.ppml.receiver.IReceiverService");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int iMo162257H4 = mo162257H4((Bundle) C18817b.m162261c(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            parcel2.writeInt(iMo162257H4);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
