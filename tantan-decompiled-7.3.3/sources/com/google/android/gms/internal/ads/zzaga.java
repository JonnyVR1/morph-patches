package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p153l.axs0;
import p153l.lev0;
import p153l.mpw0;
import p153l.zir0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzaga implements zzbx {
    public static final Parcelable.Creator<zzaga> CREATOR = new zir0();
    public final int zza;

    @Nullable
    public final String zzb;

    @Nullable
    public final String zzc;

    @Nullable
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    public zzaga(Parcel parcel) {
        this.zza = parcel.readInt();
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.readString();
        int i = mpw0.f137957a;
        this.zze = parcel.readInt() != 0;
        this.zzf = parcel.readInt();
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    /* JADX INFO: renamed from: a0 */
    public final void mo13592a0(axs0 axs0Var) {
        String str = this.zzc;
        if (str != null) {
            axs0Var.m100818H(str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            axs0Var.m100811A(str2);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaga.class == obj.getClass()) {
            zzaga zzagaVar = (zzaga) obj;
            if (this.zza == zzagaVar.zza && mpw0.m159408f(this.zzb, zzagaVar.zzb) && mpw0.m159408f(this.zzc, zzagaVar.zzc) && mpw0.m159408f(this.zzd, zzagaVar.zzd) && this.zze == zzagaVar.zze && this.zzf == zzagaVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i = this.zza;
        String str2 = this.zzc;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i2 = ((i + 527) * 31) + iHashCode;
        String str3 = this.zzd;
        return (((((((i2 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.zze ? 1 : 0)) * 31) + this.zzf;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.zzc + "\", genre=\"" + this.zzb + "\", bitrate=" + this.zza + ", metadataInterval=" + this.zzf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeString(this.zzd);
        int i2 = mpw0.f137957a;
        parcel.writeInt(this.zze ? 1 : 0);
        parcel.writeInt(this.zzf);
    }

    public zzaga(int i, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, int i2) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        lev0.m153956d(z2);
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z;
        this.zzf = i2;
    }
}
