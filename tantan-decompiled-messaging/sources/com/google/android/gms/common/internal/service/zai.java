package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.TelemetryData;
import p149l.nxq0;
import p149l.xxq0;

/* JADX INFO: loaded from: classes6.dex */
public final class zai extends nxq0 implements IInterface {
    public zai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void zae(TelemetryData telemetryData) throws RemoteException {
        Parcel parcelZaa = zaa();
        xxq0.m211535c(parcelZaa, telemetryData);
        zad(1, parcelZaa);
    }
}
