package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import p149l.rxq0;
import p149l.xxq0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zad extends rxq0 implements zae {
    public zad() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // p149l.rxq0
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            Status status = (Status) xxq0.m211533a(parcel, Status.CREATOR);
            ModuleAvailabilityResponse moduleAvailabilityResponse = (ModuleAvailabilityResponse) xxq0.m211533a(parcel, ModuleAvailabilityResponse.CREATOR);
            xxq0.m211534b(parcel);
            zae(status, moduleAvailabilityResponse);
        } else if (i == 2) {
            Status status2 = (Status) xxq0.m211533a(parcel, Status.CREATOR);
            ModuleInstallResponse moduleInstallResponse = (ModuleInstallResponse) xxq0.m211533a(parcel, ModuleInstallResponse.CREATOR);
            xxq0.m211534b(parcel);
            zad(status2, moduleInstallResponse);
        } else if (i == 3) {
            Status status3 = (Status) xxq0.m211533a(parcel, Status.CREATOR);
            ModuleInstallIntentResponse moduleInstallIntentResponse = (ModuleInstallIntentResponse) xxq0.m211533a(parcel, ModuleInstallIntentResponse.CREATOR);
            xxq0.m211534b(parcel);
            zac(status3, moduleInstallIntentResponse);
        } else {
            if (i != 4) {
                return false;
            }
            Status status4 = (Status) xxq0.m211533a(parcel, Status.CREATOR);
            xxq0.m211534b(parcel);
            zab(status4);
        }
        return true;
    }
}
