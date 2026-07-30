package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p153l.d7r0;
import p153l.p1m;
import p153l.t6r0;

/* JADX INFO: loaded from: classes6.dex */
public final class zam extends t6r0 implements IInterface {
    public zam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final p1m zae(p1m p1mVar, zax zaxVar) throws RemoteException {
        Parcel parcelZaa = zaa();
        d7r0.m114758d(parcelZaa, p1mVar);
        d7r0.m114757c(parcelZaa, zaxVar);
        Parcel parcelZab = zab(2, parcelZaa);
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelZab.readStrongBinder());
        parcelZab.recycle();
        return p1mVarM170217O;
    }
}
