package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;

/* JADX INFO: renamed from: androidx.room.d */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public interface InterfaceC0669d extends IInterface {

    /* JADX INFO: renamed from: c0 */
    public static final String f3006c0 = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    /* JADX INFO: renamed from: androidx.room.d$a */
    public static abstract class a extends Binder implements InterfaceC0669d {

        /* JADX INFO: renamed from: androidx.room.d$a$a, reason: collision with other inner class name */
        public static class C22771a implements InterfaceC0669d {

            /* JADX INFO: renamed from: a */
            public IBinder f3007a;

            public C22771a(IBinder iBinder) {
                this.f3007a = iBinder;
            }

            @Override // androidx.room.InterfaceC0669d
            /* JADX INFO: renamed from: S6 */
            public int mo3909S6(InterfaceC0668c interfaceC0668c, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC0669d.f3006c0);
                    parcelObtain.writeStrongInterface(interfaceC0668c);
                    parcelObtain.writeString(str);
                    this.f3007a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3007a;
            }

            @Override // androidx.room.InterfaceC0669d
            /* JADX INFO: renamed from: h6 */
            public void mo3910h6(int i, String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC0669d.f3006c0);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStringArray(strArr);
                    this.f3007a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.InterfaceC0669d
            /* JADX INFO: renamed from: k8 */
            public void mo3911k8(InterfaceC0668c interfaceC0668c, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC0669d.f3006c0);
                    parcelObtain.writeStrongInterface(interfaceC0668c);
                    parcelObtain.writeInt(i);
                    this.f3007a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, InterfaceC0669d.f3006c0);
        }

        /* JADX INFO: renamed from: O */
        public static InterfaceC0669d m3943O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC0669d.f3006c0);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0669d)) ? new C22771a(iBinder) : (InterfaceC0669d) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = InterfaceC0669d.f3006c0;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 1) {
                int iMo3909S6 = mo3909S6(InterfaceC0668c.a.m3942O(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iMo3909S6);
            } else if (i == 2) {
                mo3911k8(InterfaceC0668c.a.m3942O(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                mo3910h6(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: S6 */
    int mo3909S6(InterfaceC0668c interfaceC0668c, String str) throws RemoteException;

    /* JADX INFO: renamed from: h6 */
    void mo3910h6(int i, String[] strArr) throws RemoteException;

    /* JADX INFO: renamed from: k8 */
    void mo3911k8(InterfaceC0668c interfaceC0668c, int i) throws RemoteException;
}
