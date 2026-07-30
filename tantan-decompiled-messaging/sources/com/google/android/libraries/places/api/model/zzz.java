package com.google.android.libraries.places.api.model;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
final class zzz extends PlusCode.Builder {
    private String zza;
    private String zzb;

    @Override // com.google.android.libraries.places.api.model.PlusCode.Builder
    public final PlusCode build() {
        return new zzbo(this.zza, this.zzb);
    }

    @Override // com.google.android.libraries.places.api.model.PlusCode.Builder
    @Nullable
    public final String getCompoundCode() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.PlusCode.Builder
    @Nullable
    public final String getGlobalCode() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.PlusCode.Builder
    public final PlusCode.Builder setCompoundCode(@Nullable String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PlusCode.Builder
    public final PlusCode.Builder setGlobalCode(@Nullable String str) {
        this.zzb = str;
        return this;
    }
}
