package com.google.android.libraries.places.api.model;

import androidx.annotation.Nullable;
import java.util.List;
import p149l.jfd0;

/* JADX INFO: loaded from: classes7.dex */
abstract class zzr extends OpeningHours {

    @Nullable
    private final OpeningHours.HoursType zza;
    private final List zzb;
    private final List zzc;
    private final List zzd;

    public zzr(@Nullable OpeningHours.HoursType hoursType, List list, List list2, List list3) {
        this.zza = hoursType;
        if (list == null) {
            jfd0.m141176a("Null periods");
            throw null;
        }
        this.zzb = list;
        if (list2 == null) {
            jfd0.m141176a("Null specialDays");
            throw null;
        }
        this.zzc = list2;
        if (list3 != null) {
            this.zzd = list3;
        } else {
            jfd0.m141176a("Null weekdayText");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OpeningHours) {
            OpeningHours openingHours = (OpeningHours) obj;
            OpeningHours.HoursType hoursType = this.zza;
            if (hoursType != null ? hoursType.equals(openingHours.getHoursType()) : openingHours.getHoursType() == null) {
                if (this.zzb.equals(openingHours.getPeriods()) && this.zzc.equals(openingHours.getSpecialDays()) && this.zzd.equals(openingHours.getWeekdayText())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    @Nullable
    public final OpeningHours.HoursType getHoursType() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public final List<Period> getPeriods() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public final List<SpecialDay> getSpecialDays() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public final List<String> getWeekdayText() {
        return this.zzd;
    }

    public final int hashCode() {
        OpeningHours.HoursType hoursType = this.zza;
        return this.zzd.hashCode() ^ (((((((hoursType == null ? 0 : hoursType.hashCode()) ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003);
    }

    public final String toString() {
        List list = this.zzd;
        List list2 = this.zzc;
        List list3 = this.zzb;
        return "OpeningHours{hoursType=" + String.valueOf(this.zza) + ", periods=" + list3.toString() + ", specialDays=" + list2.toString() + ", weekdayText=" + list.toString() + "}";
    }
}
