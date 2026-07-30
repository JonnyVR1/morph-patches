package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import java.util.Arrays;
import p153l.mpw0;
import p153l.njr0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzagg extends zzagr {
    public static final Parcelable.Creator<zzagg> CREATOR = new njr0();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzagr[] zzg;

    public zzagg(Parcel parcel) {
        super(ChapterFrame.f7964ID);
        String string = parcel.readString();
        int i = mpw0.f137957a;
        this.zza = string;
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
        int i2 = parcel.readInt();
        this.zzg = new zzagr[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.zzg[i3] = (zzagr) parcel.readParcelable(zzagr.class.getClassLoader());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagr, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagg.class == obj.getClass()) {
            zzagg zzaggVar = (zzagg) obj;
            if (this.zzb == zzaggVar.zzb && this.zzc == zzaggVar.zzc && this.zzd == zzaggVar.zzd && this.zze == zzaggVar.zze && mpw0.m159408f(this.zza, zzaggVar.zza) && Arrays.equals(this.zzg, zzaggVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return ((((((((this.zzb + 527) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
        parcel.writeInt(this.zzg.length);
        for (zzagr zzagrVar : this.zzg) {
            parcel.writeParcelable(zzagrVar, 0);
        }
    }

    public zzagg(String str, int i, int i2, long j, long j2, zzagr[] zzagrVarArr) {
        super(ChapterFrame.f7964ID);
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = j2;
        this.zzg = zzagrVarArr;
    }
}
