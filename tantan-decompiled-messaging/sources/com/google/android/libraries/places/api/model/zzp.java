package com.google.android.libraries.places.api.model;

import androidx.annotation.IntRange;

/* JADX INFO: loaded from: classes7.dex */
abstract class zzp extends LocalTime {
    private final int zza;
    private final int zzb;

    public zzp(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.zza == localTime.getHours() && this.zzb == localTime.getMinutes()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.LocalTime
    @IntRange(from = 0, to = 23)
    public final int getHours() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.LocalTime
    @IntRange(from = 0, to = 59)
    public final int getMinutes() {
        return this.zzb;
    }

    public final int hashCode() {
        return this.zzb ^ ((this.zza ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "LocalTime{hours=" + this.zza + ", minutes=" + this.zzb + "}";
    }
}
