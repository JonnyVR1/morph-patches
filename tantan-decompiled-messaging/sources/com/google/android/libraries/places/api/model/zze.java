package com.google.android.libraries.places.api.model;

import androidx.annotation.Nullable;
import p149l.jfd0;

/* JADX INFO: loaded from: classes7.dex */
abstract class zze extends AuthorAttribution {
    private final String zza;

    @Nullable
    private final String zzb;

    @Nullable
    private final String zzc;

    public zze(String str, @Nullable String str2, @Nullable String str3) {
        if (str == null) {
            jfd0.m141176a("Null name");
            throw null;
        }
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AuthorAttribution) {
            AuthorAttribution authorAttribution = (AuthorAttribution) obj;
            if (this.zza.equals(authorAttribution.getName()) && ((str = this.zzb) != null ? str.equals(authorAttribution.getUri()) : authorAttribution.getUri() == null) && ((str2 = this.zzc) != null ? str2.equals(authorAttribution.getPhotoUri()) : authorAttribution.getPhotoUri() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution
    public final String getName() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution
    @Nullable
    public final String getPhotoUri() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution
    @Nullable
    public final String getUri() {
        return this.zzb;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zzc;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "AuthorAttribution{name=" + this.zza + ", uri=" + this.zzb + ", photoUri=" + this.zzc + "}";
    }
}
