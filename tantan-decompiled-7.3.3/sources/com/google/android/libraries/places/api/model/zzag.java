package com.google.android.libraries.places.api.model;

import p153l.mnd0;

/* JADX INFO: loaded from: classes7.dex */
abstract class zzag extends SpecialDay {
    private final LocalDate zza;
    private final boolean zzb;

    public zzag(LocalDate localDate, boolean z) {
        if (localDate == null) {
            mnd0.m159157a("Null date");
            throw null;
        }
        this.zza = localDate;
        this.zzb = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SpecialDay) {
            SpecialDay specialDay = (SpecialDay) obj;
            if (this.zza.equals(specialDay.getDate()) && this.zzb == specialDay.isExceptional()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.SpecialDay
    public final LocalDate getDate() {
        return this.zza;
    }

    public final int hashCode() {
        return (true != this.zzb ? 1237 : 1231) ^ ((this.zza.hashCode() ^ 1000003) * 1000003);
    }

    @Override // com.google.android.libraries.places.api.model.SpecialDay
    public final boolean isExceptional() {
        return this.zzb;
    }

    public final String toString() {
        return "SpecialDay{date=" + this.zza.toString() + ", exceptional=" + this.zzb + "}";
    }
}
