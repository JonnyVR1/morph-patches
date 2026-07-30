package com.google.android.libraries.places.api.model;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
abstract class zzaa extends PlusCode {

    @Nullable
    private final String zza;

    @Nullable
    private final String zzb;

    public zzaa(@Nullable String str, @Nullable String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlusCode) {
            PlusCode plusCode = (PlusCode) obj;
            String str = this.zza;
            if (str != null ? str.equals(plusCode.getCompoundCode()) : plusCode.getCompoundCode() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(plusCode.getGlobalCode()) : plusCode.getGlobalCode() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.PlusCode
    @Nullable
    public final String getCompoundCode() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.PlusCode
    @Nullable
    public final String getGlobalCode() {
        return this.zzb;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "PlusCode{compoundCode=" + this.zza + ", globalCode=" + this.zzb + "}";
    }
}
