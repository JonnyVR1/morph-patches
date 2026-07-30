package com.google.android.libraries.places.api.model;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
final class zzs extends Period.Builder {
    private TimeOfWeek zza;
    private TimeOfWeek zzb;

    @Override // com.google.android.libraries.places.api.model.Period.Builder
    public final Period build() {
        return new zzbg(this.zza, this.zzb);
    }

    @Override // com.google.android.libraries.places.api.model.Period.Builder
    @Nullable
    public final TimeOfWeek getClose() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.Period.Builder
    @Nullable
    public final TimeOfWeek getOpen() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.Period.Builder
    public final Period.Builder setClose(@Nullable TimeOfWeek timeOfWeek) {
        this.zzb = timeOfWeek;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Period.Builder
    public final Period.Builder setOpen(@Nullable TimeOfWeek timeOfWeek) {
        this.zza = timeOfWeek;
        return this;
    }
}
