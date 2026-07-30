package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import p153l.c9s0;
import p153l.u5t0;

/* JADX INFO: loaded from: classes6.dex */
public interface IAccountAccessor extends IInterface {

    public static abstract class Stub extends c9s0 implements IAccountAccessor {
        public Stub() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        @NonNull
        public static IAccountAccessor asInterface(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) iInterfaceQueryLocalInterface : new zzw(iBinder);
        }

        @Override // p153l.c9s0
        public final boolean zza(int i, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i2) throws RemoteException {
            if (i != 2) {
                return false;
            }
            Account accountZzb = zzb();
            parcel2.writeNoException();
            u5t0.m194624d(parcel2, accountZzb);
            return true;
        }
    }

    @NonNull
    Account zzb() throws RemoteException;
}
