package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p153l.l9r0;
import p153l.u5t0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzw extends l9r0 implements IAccountAccessor {
    public zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final Account zzb() throws RemoteException {
        Parcel parcelZzB = zzB(2, zza());
        Account account = (Account) u5t0.m194621a(parcelZzB, Account.CREATOR);
        parcelZzB.recycle();
        return account;
    }
}
