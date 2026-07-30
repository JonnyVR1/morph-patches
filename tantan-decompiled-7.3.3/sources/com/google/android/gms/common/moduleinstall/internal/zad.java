package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import p153l.d7r0;
import p153l.x6r0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zad extends x6r0 implements zae {
    public zad() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // p153l.x6r0
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            Status status = (Status) d7r0.m114755a(parcel, Status.CREATOR);
            ModuleAvailabilityResponse moduleAvailabilityResponse = (ModuleAvailabilityResponse) d7r0.m114755a(parcel, ModuleAvailabilityResponse.CREATOR);
            d7r0.m114756b(parcel);
            zae(status, moduleAvailabilityResponse);
        } else if (i == 2) {
            Status status2 = (Status) d7r0.m114755a(parcel, Status.CREATOR);
            ModuleInstallResponse moduleInstallResponse = (ModuleInstallResponse) d7r0.m114755a(parcel, ModuleInstallResponse.CREATOR);
            d7r0.m114756b(parcel);
            zad(status2, moduleInstallResponse);
        } else if (i == 3) {
            Status status3 = (Status) d7r0.m114755a(parcel, Status.CREATOR);
            ModuleInstallIntentResponse moduleInstallIntentResponse = (ModuleInstallIntentResponse) d7r0.m114755a(parcel, ModuleInstallIntentResponse.CREATOR);
            d7r0.m114756b(parcel);
            zac(status3, moduleInstallIntentResponse);
        } else {
            if (i != 4) {
                return false;
            }
            Status status4 = (Status) d7r0.m114755a(parcel, Status.CREATOR);
            d7r0.m114756b(parcel);
            zab(status4);
        }
        return true;
    }
}
