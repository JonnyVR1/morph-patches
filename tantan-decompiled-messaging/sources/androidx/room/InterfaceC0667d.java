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
public interface InterfaceC0667d extends IInterface {

    /* JADX INFO: renamed from: c0 */
    public static final String f3006c0 = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    /* JADX INFO: renamed from: androidx.room.d$a */
    public static abstract class a extends Binder implements InterfaceC0667d {

        /* JADX INFO: renamed from: androidx.room.d$a$a, reason: collision with other inner class name */
        public static class C22656a implements InterfaceC0667d {

            /* JADX INFO: renamed from: a */
            public IBinder f3007a;

            public C22656a(IBinder iBinder) {
                this.f3007a = iBinder;
            }

            @Override // androidx.room.InterfaceC0667d
            /* JADX INFO: renamed from: S6 */
            public int mo3907S6(InterfaceC0666c interfaceC0666c, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC0667d.f3006c0);
                    parcelObtain.writeStrongInterface(interfaceC0666c);
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

            @Override // androidx.room.InterfaceC0667d
            /* JADX INFO: renamed from: h6 */
            public void mo3908h6(int i, String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC0667d.f3006c0);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStringArray(strArr);
                    this.f3007a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.InterfaceC0667d
            /* JADX INFO: renamed from: k8 */
            public void mo3909k8(InterfaceC0666c interfaceC0666c, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC0667d.f3006c0);
                    parcelObtain.writeStrongInterface(interfaceC0666c);
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
            attachInterface(this, InterfaceC0667d.f3006c0);
        }

        /* JADX INFO: renamed from: O */
        public static InterfaceC0667d m3941O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC0667d.f3006c0);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0667d)) ? new C22656a(iBinder) : (InterfaceC0667d) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = InterfaceC0667d.f3006c0;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 1) {
                int iMo3907S6 = mo3907S6(InterfaceC0666c.a.m3940O(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iMo3907S6);
            } else if (i == 2) {
                mo3909k8(InterfaceC0666c.a.m3940O(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                mo3908h6(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: S6 */
    int mo3907S6(InterfaceC0666c interfaceC0666c, String str) throws RemoteException;

    /* JADX INFO: renamed from: h6 */
    void mo3908h6(int i, String[] strArr) throws RemoteException;

    /* JADX INFO: renamed from: k8 */
    void mo3909k8(InterfaceC0666c interfaceC0666c, int i) throws RemoteException;
}
