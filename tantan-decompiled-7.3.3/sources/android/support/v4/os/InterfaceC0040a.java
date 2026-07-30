package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;

/* JADX INFO: renamed from: android.support.v4.os.a */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public interface InterfaceC0040a extends IInterface {

    /* JADX INFO: renamed from: a0 */
    public static final String f61a0 = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* JADX INFO: renamed from: android.support.v4.os.a$a */
    public static abstract class a extends Binder implements InterfaceC0040a {

        /* JADX INFO: renamed from: android.support.v4.os.a$a$a, reason: collision with other inner class name */
        public static class C22767a implements InterfaceC0040a {

            /* JADX INFO: renamed from: a */
            public IBinder f62a;

            public C22767a(IBinder iBinder) {
                this.f62a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f62a;
            }

            @Override // android.support.v4.os.InterfaceC0040a
            /* JADX INFO: renamed from: w2 */
            public void mo189w2(int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC0040a.f61a0);
                    parcelObtain.writeInt(i);
                    b.m194d(parcelObtain, bundle, 0);
                    this.f62a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, InterfaceC0040a.f61a0);
        }

        /* JADX INFO: renamed from: O */
        public static InterfaceC0040a m190O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC0040a.f61a0);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0040a)) ? new C22767a(iBinder) : (InterfaceC0040a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = InterfaceC0040a.f61a0;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            mo189w2(parcel.readInt(), (Bundle) b.m193c(parcel, Bundle.CREATOR));
            return true;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.os.a$b */
    public static class b {
        /* JADX INFO: renamed from: c */
        public static <T> T m193c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        public static <T extends Parcelable> void m194d(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    /* JADX INFO: renamed from: w2 */
    void mo189w2(int i, Bundle bundle) throws RemoteException;
}
