package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p153l.d7r0;
import p153l.t6r0;

/* JADX INFO: loaded from: classes6.dex */
public final class zal extends t6r0 implements IInterface {
    public zal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void zae(zak zakVar) throws RemoteException {
        Parcel parcelZaa = zaa();
        d7r0.m114758d(parcelZaa, zakVar);
        zad(1, parcelZaa);
    }
}
