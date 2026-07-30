package com.google.android.gms.common.moduleinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;
import p153l.d7r0;
import p153l.t6r0;

/* JADX INFO: loaded from: classes6.dex */
public final class zaf extends t6r0 implements IInterface {
    public zaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void zae(zae zaeVar, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel parcelZaa = zaa();
        d7r0.m114758d(parcelZaa, zaeVar);
        d7r0.m114757c(parcelZaa, apiFeatureRequest);
        zac(1, parcelZaa);
    }

    public final void zaf(zae zaeVar, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel parcelZaa = zaa();
        d7r0.m114758d(parcelZaa, zaeVar);
        d7r0.m114757c(parcelZaa, apiFeatureRequest);
        zac(3, parcelZaa);
    }

    public final void zag(zae zaeVar, ApiFeatureRequest apiFeatureRequest, zah zahVar) throws RemoteException {
        Parcel parcelZaa = zaa();
        d7r0.m114758d(parcelZaa, zaeVar);
        d7r0.m114757c(parcelZaa, apiFeatureRequest);
        d7r0.m114758d(parcelZaa, zahVar);
        zac(2, parcelZaa);
    }

    public final void zah(IStatusCallback iStatusCallback, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel parcelZaa = zaa();
        d7r0.m114758d(parcelZaa, iStatusCallback);
        d7r0.m114757c(parcelZaa, apiFeatureRequest);
        zac(4, parcelZaa);
    }

    public final void zai(IStatusCallback iStatusCallback, zah zahVar) throws RemoteException {
        Parcel parcelZaa = zaa();
        d7r0.m114758d(parcelZaa, iStatusCallback);
        d7r0.m114758d(parcelZaa, zahVar);
        zac(6, parcelZaa);
    }
}
