package com.google.android.vending.licensing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface ILicensingService extends IInterface {

    /* JADX INFO: renamed from: com.google.android.vending.licensing.ILicensingService$a */
    public static abstract class AbstractBinderC2635a extends Binder implements ILicensingService {

        /* JADX INFO: renamed from: com.google.android.vending.licensing.ILicensingService$a$a */
        public static class a implements ILicensingService {

            /* JADX INFO: renamed from: a */
            public IBinder f10587a;

            public a(IBinder iBinder) {
                this.f10587a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10587a;
            }

            @Override // com.google.android.vending.licensing.ILicensingService
            /* JADX INFO: renamed from: p3 */
            public void mo15384p3(long j, String str, InterfaceC2636a interfaceC2636a) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
                    parcelObtain.writeLong(j);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(interfaceC2636a != null ? interfaceC2636a.asBinder() : null);
                    this.f10587a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC2635a() {
            attachInterface(this, "com.android.vending.licensing.ILicensingService");
        }

        /* JADX INFO: renamed from: O */
        public static ILicensingService m15385O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.licensing.ILicensingService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ILicensingService)) ? new a(iBinder) : (ILicensingService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.android.vending.licensing.ILicensingService");
                mo15384p3(parcel.readLong(), parcel.readString(), InterfaceC2636a.a.m15387O(parcel.readStrongBinder()));
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.android.vending.licensing.ILicensingService");
            return true;
        }
    }

    /* JADX INFO: renamed from: p3 */
    void mo15384p3(long j, String str, InterfaceC2636a interfaceC2636a) throws RemoteException;
}
