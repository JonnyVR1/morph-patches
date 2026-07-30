package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import android.os.RemoteException;
import p149l.rxq0;
import p149l.xxq0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zaj extends rxq0 implements zak {
    public zaj() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    @Override // p149l.rxq0
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        int i3 = parcel.readInt();
        xxq0.m211534b(parcel);
        zab(i3);
        return true;
    }
}
