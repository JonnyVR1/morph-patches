package com.google.android.libraries.places.api.model;

import p149l.jfd0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes7.dex */
final class zzaf extends SpecialDay.Builder {
    private LocalDate zza;
    private boolean zzb;
    private byte zzc;

    @Override // com.google.android.libraries.places.api.model.SpecialDay.Builder
    public final SpecialDay build() {
        LocalDate localDate;
        if (this.zzc == 1 && (localDate = this.zza) != null) {
            return new zzbu(localDate, this.zzb);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" date");
        }
        if (this.zzc == 0) {
            sb.append(" exceptional");
        }
        qkq0.m175383a("Missing required properties:".concat(sb.toString()));
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.SpecialDay.Builder
    public final LocalDate getDate() {
        LocalDate localDate = this.zza;
        if (localDate != null) {
            return localDate;
        }
        qkq0.m175383a("Property \"date\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.SpecialDay.Builder
    public final boolean isExceptional() {
        if (this.zzc != 0) {
            return this.zzb;
        }
        qkq0.m175383a("Property \"exceptional\" has not been set");
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.SpecialDay.Builder
    public final SpecialDay.Builder setDate(LocalDate localDate) {
        if (localDate != null) {
            this.zza = localDate;
            return this;
        }
        jfd0.m141176a("Null date");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.SpecialDay.Builder
    public final SpecialDay.Builder setExceptional(boolean z) {
        this.zzb = z;
        this.zzc = (byte) 1;
        return this;
    }
}
