package com.google.android.libraries.places.api.model;

import androidx.annotation.Nullable;
import p153l.mnd0;

/* JADX INFO: loaded from: classes7.dex */
abstract class zzai extends TimeOfWeek {

    @Nullable
    private final LocalDate zza;
    private final DayOfWeek zzb;
    private final LocalTime zzc;
    private final boolean zzd;

    public zzai(@Nullable LocalDate localDate, DayOfWeek dayOfWeek, LocalTime localTime, boolean z) {
        this.zza = localDate;
        if (dayOfWeek == null) {
            mnd0.m159157a("Null day");
            throw null;
        }
        this.zzb = dayOfWeek;
        if (localTime == null) {
            mnd0.m159157a("Null time");
            throw null;
        }
        this.zzc = localTime;
        this.zzd = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TimeOfWeek) {
            TimeOfWeek timeOfWeek = (TimeOfWeek) obj;
            LocalDate localDate = this.zza;
            if (localDate != null ? localDate.equals(timeOfWeek.getDate()) : timeOfWeek.getDate() == null) {
                if (this.zzb.equals(timeOfWeek.getDay()) && this.zzc.equals(timeOfWeek.getTime()) && this.zzd == timeOfWeek.isTruncated()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek
    @Nullable
    public final LocalDate getDate() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek
    public final DayOfWeek getDay() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek
    public final LocalTime getTime() {
        return this.zzc;
    }

    public final int hashCode() {
        LocalDate localDate = this.zza;
        return (true != this.zzd ? 1237 : 1231) ^ (((((((localDate == null ? 0 : localDate.hashCode()) ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003);
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek
    public final boolean isTruncated() {
        return this.zzd;
    }

    public final String toString() {
        LocalTime localTime = this.zzc;
        DayOfWeek dayOfWeek = this.zzb;
        return "TimeOfWeek{date=" + String.valueOf(this.zza) + ", day=" + dayOfWeek.toString() + ", time=" + localTime.toString() + ", truncated=" + this.zzd + "}";
    }
}
