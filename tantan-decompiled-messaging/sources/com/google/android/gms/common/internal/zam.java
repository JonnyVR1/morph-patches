package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p149l.nxq0;
import p149l.uyl;
import p149l.xxq0;

/* JADX INFO: loaded from: classes6.dex */
public final class zam extends nxq0 implements IInterface {
    public zam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final uyl zae(uyl uylVar, zax zaxVar) throws RemoteException {
        Parcel parcelZaa = zaa();
        xxq0.m211536d(parcelZaa, uylVar);
        xxq0.m211535c(parcelZaa, zaxVar);
        Parcel parcelZab = zab(2, parcelZaa);
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcelZab.readStrongBinder());
        parcelZab.recycle();
        return uylVarM196295O;
    }
}
