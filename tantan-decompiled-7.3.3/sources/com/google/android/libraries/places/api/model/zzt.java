package com.google.android.libraries.places.api.model;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
abstract class zzt extends Period {

    @Nullable
    private final TimeOfWeek zza;

    @Nullable
    private final TimeOfWeek zzb;

    public zzt(@Nullable TimeOfWeek timeOfWeek, @Nullable TimeOfWeek timeOfWeek2) {
        this.zza = timeOfWeek;
        this.zzb = timeOfWeek2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Period) {
            Period period = (Period) obj;
            TimeOfWeek timeOfWeek = this.zza;
            if (timeOfWeek != null ? timeOfWeek.equals(period.getOpen()) : period.getOpen() == null) {
                TimeOfWeek timeOfWeek2 = this.zzb;
                if (timeOfWeek2 != null ? timeOfWeek2.equals(period.getClose()) : period.getClose() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.Period
    @Nullable
    public final TimeOfWeek getClose() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.Period
    @Nullable
    public final TimeOfWeek getOpen() {
        return this.zza;
    }

    public final int hashCode() {
        TimeOfWeek timeOfWeek = this.zza;
        int iHashCode = timeOfWeek == null ? 0 : timeOfWeek.hashCode();
        TimeOfWeek timeOfWeek2 = this.zzb;
        return ((iHashCode ^ 1000003) * 1000003) ^ (timeOfWeek2 != null ? timeOfWeek2.hashCode() : 0);
    }

    public final String toString() {
        TimeOfWeek timeOfWeek = this.zzb;
        return "Period{open=" + String.valueOf(this.zza) + ", close=" + String.valueOf(timeOfWeek) + "}";
    }
}
