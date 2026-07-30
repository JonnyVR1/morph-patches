package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import android.os.RemoteException;
import p153l.d7r0;
import p153l.x6r0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zaj extends x6r0 implements zak {
    public zaj() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    @Override // p153l.x6r0
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        int i3 = parcel.readInt();
        d7r0.m114756b(parcel);
        zab(i3);
        return true;
    }
}
