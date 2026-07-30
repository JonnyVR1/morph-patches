package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes6.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "ActivityRecognitionRequestCreator")
@SafeParcelable.Reserved({1000})
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new zzc();

    @SafeParcelable.Field(getter = "getIntervalMillis", m12517id = 1)
    private final long zza;

    @SafeParcelable.Field(getter = "getTriggerUpdate", m12517id = 2)
    private final boolean zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getWorkSource", m12517id = 3)
    private final WorkSource zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getTag", m12517id = 4)
    private final String zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getNondefaultActivities", m12517id = 5)
    private final int[] zze;

    @SafeParcelable.Field(getter = "getRequestSensorData", m12517id = 6)
    private final boolean zzf;

    @Nullable
    @SafeParcelable.Field(getter = "getAccountName", m12517id = 7)
    private final String zzg;

    @SafeParcelable.Field(defaultValueUnchecked = "ActivityRecognitionRequest.DEFAULT_MAX_REPORT_LATENCY_MILLIS", getter = "getMaxReportLatencyMillis", m12517id = 8)
    private final long zzh;

    @Nullable
    @SafeParcelable.Field(getter = "getContextAttributionTag", m12517id = 9)
    private String zzi;

    @SafeParcelable.Constructor
    public zzb(@SafeParcelable.Param(m12518id = 1) long j, @SafeParcelable.Param(m12518id = 2) boolean z, @Nullable @SafeParcelable.Param(m12518id = 3) WorkSource workSource, @Nullable @SafeParcelable.Param(m12518id = 4) String str, @Nullable @SafeParcelable.Param(m12518id = 5) int[] iArr, @SafeParcelable.Param(m12518id = 6) boolean z2, @Nullable @SafeParcelable.Param(m12518id = 7) String str2, @SafeParcelable.Param(m12518id = 8) long j2, @Nullable @SafeParcelable.Param(m12518id = 9) String str3) {
        this.zza = j;
        this.zzb = z;
        this.zzc = workSource;
        this.zzd = str;
        this.zze = iArr;
        this.zzf = z2;
        this.zzg = str2;
        this.zzh = j2;
        this.zzi = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeIntArray(parcel, 5, this.zze, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeLong(parcel, 8, this.zzh);
        SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final zzb zza(@Nullable String str) {
        this.zzi = str;
        return this;
    }
}
