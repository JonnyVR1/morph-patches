package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "LocationSettingsStatesCreator")
@SafeParcelable.Reserved({1000})
public final class LocationSettingsStates extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new zzab();

    @SafeParcelable.Field(getter = "isGpsUsable", m12517id = 1)
    private final boolean zza;

    @SafeParcelable.Field(getter = "isNetworkLocationUsable", m12517id = 2)
    private final boolean zzb;

    @SafeParcelable.Field(getter = "isBleUsable", m12517id = 3)
    private final boolean zzc;

    @SafeParcelable.Field(getter = "isGpsPresent", m12517id = 4)
    private final boolean zzd;

    @SafeParcelable.Field(getter = "isNetworkLocationPresent", m12517id = 5)
    private final boolean zze;

    @SafeParcelable.Field(getter = "isBlePresent", m12517id = 6)
    private final boolean zzf;

    @SafeParcelable.Constructor
    public LocationSettingsStates(@SafeParcelable.Param(m12518id = 1) boolean z, @SafeParcelable.Param(m12518id = 2) boolean z2, @SafeParcelable.Param(m12518id = 3) boolean z3, @SafeParcelable.Param(m12518id = 4) boolean z4, @SafeParcelable.Param(m12518id = 5) boolean z5, @SafeParcelable.Param(m12518id = 6) boolean z6) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = z3;
        this.zzd = z4;
        this.zze = z5;
        this.zzf = z6;
    }

    @Nullable
    public static LocationSettingsStates fromIntent(@NonNull Intent intent) {
        return (LocationSettingsStates) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", CREATOR);
    }

    public boolean isBlePresent() {
        return this.zzf;
    }

    public boolean isBleUsable() {
        return this.zzc;
    }

    public boolean isGpsPresent() {
        return this.zzd;
    }

    public boolean isGpsUsable() {
        return this.zza;
    }

    public boolean isLocationPresent() {
        return this.zzd || this.zze;
    }

    public boolean isLocationUsable() {
        return this.zza || this.zzb;
    }

    public boolean isNetworkLocationPresent() {
        return this.zze;
    }

    public boolean isNetworkLocationUsable() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, isGpsUsable());
        SafeParcelWriter.writeBoolean(parcel, 2, isNetworkLocationUsable());
        SafeParcelWriter.writeBoolean(parcel, 3, isBleUsable());
        SafeParcelWriter.writeBoolean(parcel, 4, isGpsPresent());
        SafeParcelWriter.writeBoolean(parcel, 5, isNetworkLocationPresent());
        SafeParcelWriter.writeBoolean(parcel, 6, isBlePresent());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
