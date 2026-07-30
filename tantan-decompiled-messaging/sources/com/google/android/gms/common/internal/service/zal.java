package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p149l.nxq0;
import p149l.xxq0;

/* JADX INFO: loaded from: classes6.dex */
public final class zal extends nxq0 implements IInterface {
    public zal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void zae(zak zakVar) throws RemoteException {
        Parcel parcelZaa = zaa();
        xxq0.m211536d(parcelZaa, zakVar);
        zad(1, parcelZaa);
    }
}
