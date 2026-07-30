package p153l;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface h4m extends IInterface {

    /* JADX INFO: renamed from: l.h4m$b */
    public static class C17396b {
        /* JADX INFO: renamed from: c */
        public static <T> T m133589c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        public static <T extends Parcelable> void m133590d(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    /* JADX INFO: renamed from: H4 */
    int mo133585H4(Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: l.h4m$a */
    public static abstract class AbstractBinderC17395a extends Binder implements h4m {

        /* JADX INFO: renamed from: l.h4m$a$a */
        public static class a implements h4m {

            /* JADX INFO: renamed from: a */
            public IBinder f107817a;

            public a(IBinder iBinder) {
                this.f107817a = iBinder;
            }

            @Override // p153l.h4m
            /* JADX INFO: renamed from: H4 */
            public int mo133585H4(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    C17396b.m133590d(parcelObtain, bundle, 0);
                    this.f107817a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f107817a;
            }
        }

        public AbstractBinderC17395a() {
            attachInterface(this, "com.facebook.ppml.receiver.IReceiverService");
        }

        /* JADX INFO: renamed from: O */
        public static h4m m133586O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof h4m)) ? new a(iBinder) : (h4m) iInterfaceQueryLocalInterface;
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
            int iMo133585H4 = mo133585H4((Bundle) C17396b.m133589c(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            parcel2.writeInt(iMo133585H4);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
