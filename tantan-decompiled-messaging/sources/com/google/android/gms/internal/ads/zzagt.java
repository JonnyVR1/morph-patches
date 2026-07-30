package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import p149l.ggw0;
import p149l.par0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzagt extends zzagr {
    public static final Parcelable.Creator<zzagt> CREATOR = new par0();
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzagt(Parcel parcel) {
        super(InternalFrame.f7932ID);
        String string = parcel.readString();
        int i = ggw0.f102568a;
        this.zza = string;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagt.class == obj.getClass()) {
            zzagt zzagtVar = (zzagt) obj;
            if (ggw0.m126064f(this.zzb, zzagtVar.zzb) && ggw0.m126064f(this.zza, zzagtVar.zza) && ggw0.m126064f(this.zzc, zzagtVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.zzb;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i = iHashCode + 527;
        String str3 = this.zzc;
        return (((i * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzagr
    public final String toString() {
        return this.zzf + ": domain=" + this.zza + ", description=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzc);
    }

    public zzagt(String str, String str2, String str3) {
        super(InternalFrame.f7932ID);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }
}
