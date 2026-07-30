package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;

/* JADX INFO: renamed from: androidx.room.c */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public interface InterfaceC0668c extends IInterface {

    /* JADX INFO: renamed from: b0 */
    public static final String f3004b0 = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', '.');

    /* JADX INFO: renamed from: androidx.room.c$a */
    public static abstract class a extends Binder implements InterfaceC0668c {

        /* JADX INFO: renamed from: androidx.room.c$a$a, reason: collision with other inner class name */
        public static class C22770a implements InterfaceC0668c {

            /* JADX INFO: renamed from: a */
            public IBinder f3005a;

            public C22770a(IBinder iBinder) {
                this.f3005a = iBinder;
            }

            @Override // androidx.room.InterfaceC0668c
            /* JADX INFO: renamed from: J0 */
            public void mo3941J0(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC0668c.f3004b0);
                    parcelObtain.writeStringArray(strArr);
                    this.f3005a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3005a;
            }
        }

        public a() {
            attachInterface(this, InterfaceC0668c.f3004b0);
        }

        /* JADX INFO: renamed from: O */
        public static InterfaceC0668c m3942O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC0668c.f3004b0);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0668c)) ? new C22770a(iBinder) : (InterfaceC0668c) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = InterfaceC0668c.f3004b0;
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
            mo3941J0(parcel.createStringArray());
            return true;
        }
    }

    /* JADX INFO: renamed from: J0 */
    void mo3941J0(String[] strArr) throws RemoteException;
}
