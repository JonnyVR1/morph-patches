package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "ActivityTransitionEventCreator")
@SafeParcelable.Reserved({1000})
public class ActivityTransitionEvent extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new zzf();

    @SafeParcelable.Field(getter = "getActivityType", m12517id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getTransitionType", m12517id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getElapsedRealTimeNanos", m12517id = 3)
    private final long zzc;

    @SafeParcelable.Constructor
    public ActivityTransitionEvent(@SafeParcelable.Param(m12518id = 1) int i, @SafeParcelable.Param(m12518id = 2) int i2, @SafeParcelable.Param(m12518id = 3) long j) {
        ActivityTransition.zza(i2);
        this.zza = i;
        this.zzb = i2;
        this.zzc = j;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return this.zza == activityTransitionEvent.zza && this.zzb == activityTransitionEvent.zzb && this.zzc == activityTransitionEvent.zzc;
    }

    public int getActivityType() {
        return this.zza;
    }

    public long getElapsedRealTimeNanos() {
        return this.zzc;
    }

    public int getTransitionType() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Long.valueOf(this.zzc));
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActivityType " + this.zza);
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append("TransitionType " + this.zzb);
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append("ElapsedRealTimeNanos " + this.zzc);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getActivityType());
        SafeParcelWriter.writeInt(parcel, 2, getTransitionType());
        SafeParcelWriter.writeLong(parcel, 3, getElapsedRealTimeNanos());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
