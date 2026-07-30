package com.google.android.libraries.places.api.net;

import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import p149l.hf4;

/* JADX INFO: loaded from: classes7.dex */
final class zzc extends FetchPhotoRequest {

    @Nullable
    private final Integer zza;

    @Nullable
    private final Integer zzb;
    private final PhotoMetadata zzc;

    @Nullable
    private final hf4 zzd;

    public /* synthetic */ zzc(Integer num, Integer num2, PhotoMetadata photoMetadata, hf4 hf4Var, zzb zzbVar) {
        this.zza = num;
        this.zzb = num2;
        this.zzc = photoMetadata;
        this.zzd = hf4Var;
    }

    public final boolean equals(Object obj) {
        hf4 hf4Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FetchPhotoRequest) {
            FetchPhotoRequest fetchPhotoRequest = (FetchPhotoRequest) obj;
            Integer num = this.zza;
            if (num != null ? num.equals(fetchPhotoRequest.getMaxWidth()) : fetchPhotoRequest.getMaxWidth() == null) {
                Integer num2 = this.zzb;
                if (num2 != null ? num2.equals(fetchPhotoRequest.getMaxHeight()) : fetchPhotoRequest.getMaxHeight() == null) {
                    if (this.zzc.equals(fetchPhotoRequest.getPhotoMetadata()) && ((hf4Var = this.zzd) != null ? hf4Var.equals(fetchPhotoRequest.getCancellationToken()) : fetchPhotoRequest.getCancellationToken() == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest, com.google.android.libraries.places.internal.zzjt
    @Nullable
    public final hf4 getCancellationToken() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest
    @IntRange(from = 1, to = 1600)
    @Nullable
    public final Integer getMaxHeight() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest
    @IntRange(from = 1, to = 1600)
    @Nullable
    public final Integer getMaxWidth() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest
    public final PhotoMetadata getPhotoMetadata() {
        return this.zzc;
    }

    public final int hashCode() {
        Integer num = this.zza;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.zzb;
        int iHashCode2 = ((((iHashCode ^ 1000003) * 1000003) ^ (num2 == null ? 0 : num2.hashCode())) * 1000003) ^ this.zzc.hashCode();
        hf4 hf4Var = this.zzd;
        return (iHashCode2 * 1000003) ^ (hf4Var != null ? hf4Var.hashCode() : 0);
    }

    public final String toString() {
        hf4 hf4Var = this.zzd;
        return "FetchPhotoRequest{maxWidth=" + this.zza + ", maxHeight=" + this.zzb + ", photoMetadata=" + this.zzc.toString() + ", cancellationToken=" + String.valueOf(hf4Var) + "}";
    }
}
