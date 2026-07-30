package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "ConnectionTelemetryConfigurationCreator")
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new zzm();

    @SafeParcelable.Field(getter = "getRootTelemetryConfiguration", m12463id = 1)
    private final RootTelemetryConfiguration zza;

    @SafeParcelable.Field(getter = "getMethodInvocationTelemetryEnabled", m12463id = 2)
    private final boolean zzb;

    @SafeParcelable.Field(getter = "getMethodTimingTelemetryEnabled", m12463id = 3)
    private final boolean zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getMethodInvocationMethodKeyAllowlist", m12463id = 4)
    private final int[] zzd;

    @SafeParcelable.Field(getter = "getMaxMethodInvocationsLogged", m12463id = 5)
    private final int zze;

    @Nullable
    @SafeParcelable.Field(getter = "getMethodInvocationMethodKeyDisallowlist", m12463id = 6)
    private final int[] zzf;

    @SafeParcelable.Constructor
    public ConnectionTelemetryConfiguration(@NonNull @SafeParcelable.Param(m12464id = 1) RootTelemetryConfiguration rootTelemetryConfiguration, @SafeParcelable.Param(m12464id = 2) boolean z, @SafeParcelable.Param(m12464id = 3) boolean z2, @Nullable @SafeParcelable.Param(m12464id = 4) int[] iArr, @SafeParcelable.Param(m12464id = 5) int i, @Nullable @SafeParcelable.Param(m12464id = 6) int[] iArr2) {
        this.zza = rootTelemetryConfiguration;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = iArr;
        this.zze = i;
        this.zzf = iArr2;
    }

    @KeepForSdk
    public int getMaxMethodInvocationsLogged() {
        return this.zze;
    }

    @Nullable
    @KeepForSdk
    public int[] getMethodInvocationMethodKeyAllowlist() {
        return this.zzd;
    }

    @Nullable
    @KeepForSdk
    public int[] getMethodInvocationMethodKeyDisallowlist() {
        return this.zzf;
    }

    @KeepForSdk
    public boolean getMethodInvocationTelemetryEnabled() {
        return this.zzb;
    }

    @KeepForSdk
    public boolean getMethodTimingTelemetryEnabled() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.writeBoolean(parcel, 2, getMethodInvocationTelemetryEnabled());
        SafeParcelWriter.writeBoolean(parcel, 3, getMethodTimingTelemetryEnabled());
        SafeParcelWriter.writeIntArray(parcel, 4, getMethodInvocationMethodKeyAllowlist(), false);
        SafeParcelWriter.writeInt(parcel, 5, getMaxMethodInvocationsLogged());
        SafeParcelWriter.writeIntArray(parcel, 6, getMethodInvocationMethodKeyDisallowlist(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public final RootTelemetryConfiguration zza() {
        return this.zza;
    }
}
