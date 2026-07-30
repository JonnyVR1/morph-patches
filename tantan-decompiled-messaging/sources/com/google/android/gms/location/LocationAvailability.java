package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "LocationAvailabilityCreator")
@SafeParcelable.Reserved({1000})
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {

    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNSUCCESSFUL", m12463id = 4)
    int zzc;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", getter = "getCellStatus", m12463id = 1)
    private final int zzd;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", getter = "getWifiStatus", m12463id = 2)
    private final int zze;

    @SafeParcelable.Field(defaultValueUnchecked = "0", getter = "getElapsedRealtimeNs", m12463id = 3)
    private final long zzf;

    @SafeParcelable.Field(getter = "getBatchedStatus", m12463id = 5)
    private final zzac[] zzg;

    @NonNull
    public static final LocationAvailability zza = new LocationAvailability(0, 1, 1, 0, null, true);

    @NonNull
    public static final LocationAvailability zzb = new LocationAvailability(1000, 1, 1, 0, null, false);

    @NonNull
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new zzw();

    @SafeParcelable.Constructor
    public LocationAvailability(@SafeParcelable.Param(m12464id = 4) int i, @SafeParcelable.Param(m12464id = 1) int i2, @SafeParcelable.Param(m12464id = 2) int i3, @SafeParcelable.Param(m12464id = 3) long j, @SafeParcelable.Param(m12464id = 5) zzac[] zzacVarArr, @SafeParcelable.Param(m12464id = 6) boolean z) {
        this.zzc = i < 1000 ? 0 : 1000;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = j;
        this.zzg = zzacVarArr;
    }

    @Nullable
    public static LocationAvailability extractLocationAvailability(@NonNull Intent intent) {
        if (!hasLocationAvailability(intent)) {
            return null;
        }
        try {
            return (LocationAvailability) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    public static boolean hasLocationAvailability(@Nullable Intent intent) {
        return intent != null && intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.zzd == locationAvailability.zzd && this.zze == locationAvailability.zze && this.zzf == locationAvailability.zzf && this.zzc == locationAvailability.zzc && Arrays.equals(this.zzg, locationAvailability.zzg)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzc));
    }

    public boolean isLocationAvailable() {
        return this.zzc < 1000;
    }

    @NonNull
    public String toString() {
        return "LocationAvailability[" + isLocationAvailable() + Constants.AES_SUFFIX;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzd);
        SafeParcelWriter.writeInt(parcel, 2, this.zze);
        SafeParcelWriter.writeLong(parcel, 3, this.zzf);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.zzg, i, false);
        SafeParcelWriter.writeBoolean(parcel, 6, isLocationAvailable());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
