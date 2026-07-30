package com.google.android.vending.licensing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.vending.licensing.a */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC2659a extends IInterface {

    /* JADX INFO: renamed from: com.google.android.vending.licensing.a$a */
    public static abstract class a extends Binder implements InterfaceC2659a {

        /* JADX INFO: renamed from: com.google.android.vending.licensing.a$a$a, reason: collision with other inner class name */
        public static class C22790a implements InterfaceC2659a {

            /* JADX INFO: renamed from: a */
            public IBinder f10625a;

            public C22790a(IBinder iBinder) {
                this.f10625a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10625a;
            }
        }

        public a() {
            attachInterface(this, "com.android.vending.licensing.ILicenseResultListener");
        }

        /* JADX INFO: renamed from: O */
        public static InterfaceC2659a m15441O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.licensing.ILicenseResultListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC2659a)) ? new C22790a(iBinder) : (InterfaceC2659a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
                mo15440g2(parcel.readInt(), parcel.readString(), parcel.readString());
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.android.vending.licensing.ILicenseResultListener");
            return true;
        }
    }

    /* JADX INFO: renamed from: g2 */
    void mo15440g2(int i, String str, String str2) throws RemoteException;
}
