package com.google.android.libraries.places.api.model;

import androidx.annotation.Nullable;
import p153l.mnd0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
final class zzu extends PhotoMetadata.Builder {
    private String zza;
    private int zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private AuthorAttributions zzf;
    private byte zzg;

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final String getAttributions() {
        String str = this.zza;
        if (str != null) {
            return str;
        }
        wtq0.m207906a("Property \"attributions\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    @Nullable
    public final AuthorAttributions getAuthorAttributions() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final int getHeight() {
        if ((this.zzg & 1) != 0) {
            return this.zzb;
        }
        wtq0.m207906a("Property \"height\" has not been set");
        return 0;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final int getWidth() {
        if ((this.zzg & 2) != 0) {
            return this.zzc;
        }
        wtq0.m207906a("Property \"width\" has not been set");
        return 0;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata.Builder setAttributions(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        mnd0.m159157a("Null attributions");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata.Builder setAuthorAttributions(@Nullable AuthorAttributions authorAttributions) {
        this.zzf = authorAttributions;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata.Builder setHeight(int i) {
        this.zzb = i;
        this.zzg = (byte) (this.zzg | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata.Builder setWidth(int i) {
        this.zzc = i;
        this.zzg = (byte) (this.zzg | 2);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata.Builder zza(@Nullable String str) {
        this.zze = str;
        return this;
    }

    public final PhotoMetadata.Builder zzb(String str) {
        if (str != null) {
            this.zzd = str;
            return this;
        }
        mnd0.m159157a("Null photoReference");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata zzc() {
        String str;
        String str2;
        if (this.zzg == 3 && (str = this.zza) != null && (str2 = this.zzd) != null) {
            return new zzbi(str, this.zzb, this.zzc, str2, this.zze, this.zzf);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" attributions");
        }
        if ((this.zzg & 1) == 0) {
            sb.append(" height");
        }
        if ((this.zzg & 2) == 0) {
            sb.append(" width");
        }
        if (this.zzd == null) {
            sb.append(" photoReference");
        }
        wtq0.m207906a("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
