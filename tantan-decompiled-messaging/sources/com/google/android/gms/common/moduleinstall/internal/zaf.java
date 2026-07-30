package com.google.android.gms.common.moduleinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;
import p149l.nxq0;
import p149l.xxq0;

/* JADX INFO: loaded from: classes6.dex */
public final class zaf extends nxq0 implements IInterface {
    public zaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void zae(zae zaeVar, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel parcelZaa = zaa();
        xxq0.m211536d(parcelZaa, zaeVar);
        xxq0.m211535c(parcelZaa, apiFeatureRequest);
        zac(1, parcelZaa);
    }

    public final void zaf(zae zaeVar, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel parcelZaa = zaa();
        xxq0.m211536d(parcelZaa, zaeVar);
        xxq0.m211535c(parcelZaa, apiFeatureRequest);
        zac(3, parcelZaa);
    }

    public final void zag(zae zaeVar, ApiFeatureRequest apiFeatureRequest, zah zahVar) throws RemoteException {
        Parcel parcelZaa = zaa();
        xxq0.m211536d(parcelZaa, zaeVar);
        xxq0.m211535c(parcelZaa, apiFeatureRequest);
        xxq0.m211536d(parcelZaa, zahVar);
        zac(2, parcelZaa);
    }

    public final void zah(IStatusCallback iStatusCallback, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel parcelZaa = zaa();
        xxq0.m211536d(parcelZaa, iStatusCallback);
        xxq0.m211535c(parcelZaa, apiFeatureRequest);
        zac(4, parcelZaa);
    }

    public final void zai(IStatusCallback iStatusCallback, zah zahVar) throws RemoteException {
        Parcel parcelZaa = zaa();
        xxq0.m211536d(parcelZaa, iStatusCallback);
        xxq0.m211536d(parcelZaa, zahVar);
        zac(6, parcelZaa);
    }
}
