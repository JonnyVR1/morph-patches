package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import p149l.rxq0;
import p149l.xxq0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zag extends rxq0 implements zah {
    public zag() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }

    @Override // p149l.rxq0
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ModuleInstallStatusUpdate moduleInstallStatusUpdate = (ModuleInstallStatusUpdate) xxq0.m211533a(parcel, ModuleInstallStatusUpdate.CREATOR);
        xxq0.m211534b(parcel);
        zab(moduleInstallStatusUpdate);
        return true;
    }
}
