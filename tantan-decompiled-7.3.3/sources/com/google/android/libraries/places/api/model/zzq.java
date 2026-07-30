package com.google.android.libraries.places.api.model;

import androidx.annotation.Nullable;
import java.util.List;
import p153l.mnd0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
final class zzq extends OpeningHours.Builder {
    private OpeningHours.HoursType zza;
    private List zzb;
    private List zzc;
    private List zzd;

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    @Nullable
    public final OpeningHours.HoursType getHoursType() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final List<Period> getPeriods() {
        List<Period> list = this.zzb;
        if (list != null) {
            return list;
        }
        wtq0.m207906a("Property \"periods\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final List<SpecialDay> getSpecialDays() {
        List<SpecialDay> list = this.zzc;
        if (list != null) {
            return list;
        }
        wtq0.m207906a("Property \"specialDays\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final List<String> getWeekdayText() {
        List<String> list = this.zzd;
        if (list != null) {
            return list;
        }
        wtq0.m207906a("Property \"weekdayText\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final OpeningHours.Builder setHoursType(@Nullable OpeningHours.HoursType hoursType) {
        this.zza = hoursType;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final OpeningHours.Builder setPeriods(List<Period> list) {
        if (list != null) {
            this.zzb = list;
            return this;
        }
        mnd0.m159157a("Null periods");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final OpeningHours.Builder setSpecialDays(List<SpecialDay> list) {
        if (list != null) {
            this.zzc = list;
            return this;
        }
        mnd0.m159157a("Null specialDays");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final OpeningHours.Builder setWeekdayText(List<String> list) {
        if (list != null) {
            this.zzd = list;
            return this;
        }
        mnd0.m159157a("Null weekdayText");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final OpeningHours zza() {
        List list;
        List list2;
        List list3 = this.zzb;
        if (list3 != null && (list = this.zzc) != null && (list2 = this.zzd) != null) {
            return new zzbe(this.zza, list3, list, list2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zzb == null) {
            sb.append(" periods");
        }
        if (this.zzc == null) {
            sb.append(" specialDays");
        }
        if (this.zzd == null) {
            sb.append(" weekdayText");
        }
        wtq0.m207906a("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
