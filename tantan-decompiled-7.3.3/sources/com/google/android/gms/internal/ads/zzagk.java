package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import p153l.mpw0;
import p153l.pjr0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzagk extends zzagr {
    public static final Parcelable.Creator<zzagk> CREATOR = new pjr0();
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzagk(Parcel parcel) {
        super(CommentFrame.f7966ID);
        String string = parcel.readString();
        int i = mpw0.f137957a;
        this.zza = string;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagk.class == obj.getClass()) {
            zzagk zzagkVar = (zzagk) obj;
            if (mpw0.m159408f(this.zzb, zzagkVar.zzb) && mpw0.m159408f(this.zza, zzagkVar.zza) && mpw0.m159408f(this.zzc, zzagkVar.zzc)) {
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
        return this.zzf + ": language=" + this.zza + ", description=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzc);
    }

    public zzagk(String str, String str2, String str3) {
        super(CommentFrame.f7966ID);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }
}
