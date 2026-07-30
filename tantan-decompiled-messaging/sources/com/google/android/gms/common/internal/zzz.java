package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p149l.ows0;
import p149l.uyl;
import p149l.wzr0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzz extends wzr0 implements zzaa {
    public zzz() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static zzaa zzg(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof zzaa ? (zzaa) iInterfaceQueryLocalInterface : new zzy(iBinder);
    }

    @Override // p149l.wzr0
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            uyl uylVarZzd = zzd();
            parcel2.writeNoException();
            ows0.m166433e(parcel2, uylVarZzd);
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
