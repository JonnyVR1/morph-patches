package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "ModuleInstallResponseCreator")
public class ModuleInstallResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new zad();

    @SafeParcelable.Field(getter = "getSessionId", m12517id = 1)
    private final int zaa;

    @SafeParcelable.Field(defaultValue = "false", getter = "getShouldUnregisterListener", m12517id = 2)
    private final boolean zab;

    @SafeParcelable.Constructor
    public ModuleInstallResponse(@SafeParcelable.Param(m12518id = 1) int i, @SafeParcelable.Param(m12518id = 2) boolean z) {
        this.zaa = i;
        this.zab = z;
    }

    public boolean areModulesAlreadyInstalled() {
        return this.zaa == 0;
    }

    public int getSessionId() {
        return this.zaa;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getSessionId());
        SafeParcelWriter.writeBoolean(parcel, 2, this.zab);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zaa() {
        return this.zab;
    }

    @KeepForSdk
    public ModuleInstallResponse(int i) {
        this(i, false);
    }
}
