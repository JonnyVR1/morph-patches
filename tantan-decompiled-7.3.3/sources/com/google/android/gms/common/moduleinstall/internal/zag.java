package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import p153l.d7r0;
import p153l.x6r0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zag extends x6r0 implements zah {
    public zag() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }

    @Override // p153l.x6r0
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ModuleInstallStatusUpdate moduleInstallStatusUpdate = (ModuleInstallStatusUpdate) d7r0.m114755a(parcel, ModuleInstallStatusUpdate.CREATOR);
        d7r0.m114756b(parcel);
        zab(moduleInstallStatusUpdate);
        return true;
    }
}
