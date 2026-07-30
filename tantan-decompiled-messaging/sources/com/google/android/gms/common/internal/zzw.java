package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p149l.f0r0;
import p149l.ows0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzw extends f0r0 implements IAccountAccessor {
    public zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final Account zzb() throws RemoteException {
        Parcel parcelZzB = zzB(2, zza());
        Account account = (Account) ows0.m166429a(parcelZzB, Account.CREATOR);
        parcelZzB.recycle();
        return account;
    }
}
