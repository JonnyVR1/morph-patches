package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p153l.c9s0;
import p153l.p1m;
import p153l.u5t0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzz extends c9s0 implements zzaa {
    public zzz() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static zzaa zzg(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof zzaa ? (zzaa) iInterfaceQueryLocalInterface : new zzy(iBinder);
    }

    @Override // p153l.c9s0
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            p1m p1mVarZzd = zzd();
            parcel2.writeNoException();
            u5t0.m194625e(parcel2, p1mVarZzd);
        } else {
            if (i != 2) {
                return false;
            }
            int iZzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(iZzc);
        }
        return true;
    }
}
